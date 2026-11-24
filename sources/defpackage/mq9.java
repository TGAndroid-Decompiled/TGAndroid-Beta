package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class mq9 implements Closeable {
    public static final d44 f = new d44("proto");
    public final qs9 a;
    public final hk2 b;
    public final hk2 c;
    public final qa0 d;
    public final mv8 e;

    public mq9(hk2 hk2Var, hk2 hk2Var2, qa0 qa0Var, qs9 qs9Var, mv8 mv8Var) {
        this.a = qs9Var;
        this.b = hk2Var;
        this.c = hk2Var2;
        this.d = qa0Var;
        this.e = mv8Var;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, rb0 rb0Var) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rb0Var.a, String.valueOf(gl8.a(rb0Var.c))));
        byte[] bArr = rb0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((eb0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, kq9 kq9Var) {
        try {
            return kq9Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        qs9 qs9Var = this.a;
        Objects.requireNonNull(qs9Var);
        hk2 hk2Var = this.c;
        long a = hk2Var.a();
        while (true) {
            try {
                return qs9Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (hk2Var.a() < this.d.c + a) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object c(kq9 kq9Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = kq9Var.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    @Override
    public final void close() {
        this.a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, rb0 rb0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, rb0Var);
        if (b == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new jq9(this, arrayList, rb0Var, (byte) 0));
        return arrayList;
    }

    public final void e(long j, wd6 wd6Var, String str) {
        c(new pt0(str, wd6Var, j, (byte) 7));
    }

    public final Object f(yeb yebVar) {
        SQLiteDatabase a = a();
        hk2 hk2Var = this.c;
        long a2 = hk2Var.a();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object e = yebVar.e();
                    a.setTransactionSuccessful();
                    return e;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (hk2Var.a() < this.d.c + a2) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e2);
                }
            }
        }
    }
}
