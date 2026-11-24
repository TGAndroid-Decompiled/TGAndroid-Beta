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
public final class lo9 implements Closeable {
    public static final s24 f = new s24("proto");
    public final pq9 a;
    public final ti2 b;
    public final ti2 c;
    public final q90 d;
    public final lt8 e;

    public lo9(ti2 ti2Var, ti2 ti2Var2, q90 q90Var, pq9 pq9Var, lt8 lt8Var) {
        this.a = pq9Var;
        this.b = ti2Var;
        this.c = ti2Var2;
        this.d = q90Var;
        this.e = lt8Var;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, ra0 ra0Var) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ra0Var.a, String.valueOf(dj8.a(ra0Var.c))));
        byte[] bArr = ra0Var.b;
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
            sb.append(((ea0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, jo9 jo9Var) {
        try {
            return jo9Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        pq9 pq9Var = this.a;
        Objects.requireNonNull(pq9Var);
        ti2 ti2Var = this.c;
        long e = ti2Var.e();
        while (true) {
            try {
                return pq9Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (ti2Var.e() < this.d.c + e) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e2);
                }
            }
        }
    }

    public final Object c(jo9 jo9Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = jo9Var.apply(a);
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

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, ra0 ra0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, ra0Var);
        if (b == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new io9(this, arrayList, ra0Var, (byte) 0));
        return arrayList;
    }

    public final void e(long j, xb6 xb6Var, String str) {
        c(new hs0(str, xb6Var, j, (byte) 7));
    }

    public final Object f(xcb xcbVar) {
        SQLiteDatabase a = a();
        ti2 ti2Var = this.c;
        long e = ti2Var.e();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object m = xcbVar.m();
                    a.setTransactionSuccessful();
                    return m;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (ti2Var.e() < this.d.c + e) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e2);
                }
            }
        }
    }
}
