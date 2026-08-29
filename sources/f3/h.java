package f3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class h implements d, g3.c, c {
    public static final v2.c f6537f = new v2.c("proto");
    public final j f6538a;
    public final h3.a f6539b;
    public final h3.a f6540c;
    public final a d;
    public final pc.a f6541e;

    public h(h3.a aVar, h3.a aVar2, a aVar3, j jVar, pc.a aVar4) {
        this.f6538a = jVar;
        this.f6539b = aVar;
        this.f6540c = aVar2;
        this.d = aVar3;
        this.f6541e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, y2.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f50187a, String.valueOf(i3.a.a(iVar.f50189c))));
        byte[] bArr = iVar.f50188b;
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
            sb2.append(((b) it.next()).f6529a);
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
        j jVar = this.f6538a;
        Objects.requireNonNull(jVar);
        h3.a aVar = this.f6540c;
        long e10 = aVar.e();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e11) {
                if (aVar.e() < this.d.f6527c + e10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e11);
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
        this.f6538a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, y2.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i10)), new androidx.car.app.utils.a(this, arrayList, iVar, 6));
        return arrayList;
    }

    public final void e(long j10, b3.c cVar, String str) {
        c(new d9.a(str, cVar, j10, 2));
    }

    public final Object f(g3.b bVar) {
        SQLiteDatabase a2 = a();
        h3.a aVar = this.f6540c;
        long e10 = aVar.e();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object f9 = bVar.f();
                    a2.setTransactionSuccessful();
                    return f9;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e11) {
                if (aVar.e() < this.d.f6527c + e10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e11);
                }
            }
        }
    }
}
