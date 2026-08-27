package d3;

import ag.l0;
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

    public static final t2.c f4742f = new t2.c("proto");

    public final j f4743a;

    public final f3.a f4744b;

    public final f3.a f4745c;
    public final a d;

    public final oc.a f4746e;

    public h(f3.a aVar, f3.a aVar2, a aVar3, j jVar, oc.a aVar4) {
        this.f4743a = jVar;
        this.f4744b = aVar;
        this.f4745c = aVar2;
        this.d = aVar3;
        this.f4746e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, w2.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f48957a, String.valueOf(g3.a.a(iVar.f48959c))));
        byte[] bArr = iVar.f48958b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f4734a);
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
        j jVar = this.f4743a;
        Objects.requireNonNull(jVar);
        f3.a aVar = this.f4745c;
        long jE = aVar.E();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e9) {
                if (aVar.E() >= ((long) this.d.f4732c) + jE) {
                    throw new e3.a("Timed out while trying to open db.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(f fVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override
    public final void close() {
        this.f4743a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, w2.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, iVar);
        if (lB == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i10)), new l0(this, arrayList, iVar, 6));
        return arrayList;
    }

    public final void e(long j10, z2.c cVar, String str) {
        c(new c3.f(str, cVar, j10, 2));
    }

    public final Object f(e3.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        f3.a aVar = this.f4745c;
        long jE = aVar.E();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objI = bVar.i();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objI;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e9) {
                if (aVar.E() >= ((long) this.d.f4732c) + jE) {
                    throw new e3.a("Timed out while trying to acquire the lock.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
