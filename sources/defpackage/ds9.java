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
public final class ds9 implements Closeable {
    public static final n34 f = new n34("proto");
    public final hu9 a;
    public final pj2 b;
    public final pj2 c;
    public final s90 d;
    public final uw8 e;

    public ds9(pj2 pj2Var, pj2 pj2Var2, s90 s90Var, hu9 hu9Var, uw8 uw8Var) {
        this.a = hu9Var;
        this.b = pj2Var;
        this.c = pj2Var2;
        this.d = s90Var;
        this.e = uw8Var;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, ta0 ta0Var) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ta0Var.a, String.valueOf(qm8.a(ta0Var.c))));
        byte[] bArr = ta0Var.b;
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
            sb.append(((ga0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, bs9 bs9Var) {
        try {
            return bs9Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        hu9 hu9Var = this.a;
        Objects.requireNonNull(hu9Var);
        pj2 pj2Var = this.c;
        long e = pj2Var.e();
        while (true) {
            try {
                return hu9Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (pj2Var.e() < this.d.c + e) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e2);
                }
            }
        }
    }

    public final Object c(bs9 bs9Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = bs9Var.apply(a);
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

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, ta0 ta0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, ta0Var);
        if (b == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new o48(this, arrayList, ta0Var, (byte) 9));
        return arrayList;
    }

    public final void e(long j, be6 be6Var, String str) {
        c(new ps0(str, be6Var, j, (byte) 8));
    }

    public final Object f(sgb sgbVar) {
        SQLiteDatabase a = a();
        pj2 pj2Var = this.c;
        long e = pj2Var.e();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object g = sgbVar.g();
                    a.setTransactionSuccessful();
                    return g;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (pj2Var.e() < this.d.c + e) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e2);
                }
            }
        }
    }
}
