package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class mg implements Runnable {
    public final int f25543a;
    public final si f25544b;
    public final long f25545c;
    public final long d;
    public final int f25546e;
    public final int f25547f;

    public mg(si siVar, long j3, long j10, int i7, int i10, int i11) {
        this.f25543a = i11;
        this.f25544b = siVar;
        this.f25545c = j3;
        this.d = j10;
        this.f25546e = i7;
        this.f25547f = i10;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i7;
        int i10;
        long j3;
        int i11;
        int i12;
        SQLitePreparedStatement executeFast;
        int i13;
        switch (this.f25543a) {
            case 0:
                int i14 = this.f25547f;
                long j10 = this.f25545c;
                int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                si siVar = this.f25544b;
                long j11 = this.d;
                int i16 = this.f25546e;
                if (i15 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27216b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j11 + " AND topic_id = " + j10 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = siVar.getMessagesStorage().f27216b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j11 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                }
                if (queryFinalized.next()) {
                    i7 = queryFinalized.intValue(0);
                    i10 = queryFinalized.intValue(1);
                } else {
                    i7 = -1;
                    i10 = 0;
                }
                queryFinalized.dispose();
                if (i7 == -1 && n5.C(j11)) {
                    SQLiteDatabase sQLiteDatabase3 = siVar.getMessagesStorage().f27216b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j11 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i7 = queryFinalized2.intValue(0);
                    }
                    int i17 = i7;
                    queryFinalized2.dispose();
                    if (i17 != -1) {
                        siVar.M1(j11, j10, i16, i17);
                        j3 = j10;
                        i11 = i16;
                    } else {
                        j3 = j10;
                        i11 = i16;
                    }
                    i12 = i17;
                } else {
                    j3 = j10;
                    i11 = i16;
                    i12 = i7;
                }
                g0.g3(new mf(siVar, j11, true, i12, i11, i10, j3, i14));
                return;
            default:
                long j12 = this.d;
                int i18 = this.f25546e;
                int i19 = this.f25547f;
                long j13 = this.f25545c;
                int i20 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                si siVar2 = this.f25544b;
                try {
                    if (i20 != 0) {
                        executeFast = siVar2.getMessagesStorage().f27216b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = siVar2.getMessagesStorage().f27216b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    }
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    if (i20 != 0) {
                        executeFast.bindLong(2, j13);
                        i13 = 3;
                    } else {
                        i13 = 2;
                    }
                    executeFast.bindInteger(i13, i18);
                    executeFast.bindInteger(i13 + 1, i19);
                    executeFast.bindInteger(i13 + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
        }
    }
}
