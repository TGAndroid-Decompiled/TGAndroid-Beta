package d3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class h implements d, e3.c, c {
    public static final t2.c f4300f = new t2.c("proto");
    public final j f4301a;
    public final f3.a f4302b;
    public final f3.a f4303c;
    public final a d;
    public final nc.a f4304e;

    public h(f3.a aVar, f3.a aVar2, a aVar3, j jVar, nc.a aVar4) {
        this.f4301a = jVar;
        this.f4302b = aVar;
        this.f4303c = aVar2;
        this.d = aVar3;
        this.f4304e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, w2.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f48454a, String.valueOf(g3.a.a(iVar.f48456c))));
        byte[] bArr = iVar.f48455b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
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
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f4292a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object h(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f4301a;
        Objects.requireNonNull(jVar);
        f3.a aVar = this.f4303c;
        long d = aVar.d();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.d() < this.d.f4290c + d) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    public final Object c(f fVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Object apply = fVar.apply(a2);
            a2.setTransactionSuccessful();
            return apply;
        } finally {
            a2.endTransaction();
        }
    }

    @Override
    public final void close() {
        this.f4301a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, w2.i iVar, int i9) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i9)), new androidx.car.app.utils.a(this, arrayList, iVar, 5));
        return arrayList;
    }

    public final void e(long j10, z2.c cVar, String str) {
        c(new b9.a(str, cVar, j10, 2));
    }

    public final Object f(e3.b bVar) {
        SQLiteDatabase a2 = a();
        f3.a aVar = this.f4303c;
        long d = aVar.d();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object j10 = bVar.j();
                    a2.setTransactionSuccessful();
                    return j10;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.d() < this.d.f4290c + d) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e10);
                }
            }
        }
    }
}
