package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class lg implements Runnable {
    public final int f24824a;
    public final c1 f24825b;
    public final long f24826c;
    public final long d;
    public final int f24827e;
    public final int f24828f;

    public lg(c1 c1Var, long j3, long j10, int i7, int i10, int i11) {
        this.f24824a = i11;
        this.f24825b = c1Var;
        this.f24826c = j3;
        this.d = j10;
        this.f24827e = i7;
        this.f24828f = i10;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i7;
        int i10;
        long j3;
        long j10;
        int i11;
        int i12;
        SQLitePreparedStatement executeFast;
        int i13;
        switch (this.f24824a) {
            case 0:
                si siVar = (si) this.f24825b;
                int i14 = this.f24828f;
                long j11 = this.f24826c;
                int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                long j12 = this.d;
                int i16 = this.f24827e;
                if (i15 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27222b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j12 + " AND topic_id = " + j11 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = siVar.getMessagesStorage().f27222b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j12 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
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
                if (i7 == -1 && m5.C(j12)) {
                    SQLiteDatabase sQLiteDatabase3 = siVar.getMessagesStorage().f27222b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j12 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i7 = queryFinalized2.intValue(0);
                    }
                    queryFinalized2.dispose();
                    if (i7 != -1) {
                        i12 = i7;
                        i11 = i16;
                        j10 = j11;
                        siVar.H1(j12, j10, i11, i12);
                        j3 = j12;
                    } else {
                        j3 = j12;
                        j10 = j11;
                        i11 = i16;
                        i12 = i7;
                    }
                    i7 = i12;
                } else {
                    j3 = j12;
                    j10 = j11;
                    i11 = i16;
                }
                g0.h3(new li(siVar, j3, true, i7, i11, i10, j10, i14));
                return;
            case 1:
                si siVar2 = (si) this.f24825b;
                long j13 = this.d;
                int i17 = this.f24827e;
                int i18 = this.f24828f;
                long j14 = this.f24826c;
                int i19 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                try {
                    if (i19 != 0) {
                        executeFast = siVar2.getMessagesStorage().f27222b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = siVar2.getMessagesStorage().f27222b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    }
                    executeFast.requery();
                    executeFast.bindLong(1, j13);
                    if (i19 != 0) {
                        executeFast.bindLong(2, j14);
                        i13 = 3;
                    } else {
                        i13 = 2;
                    }
                    executeFast.bindInteger(i13, i17);
                    executeFast.bindInteger(i13 + 1, i18);
                    executeFast.bindInteger(i13 + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                ((vr) this.f24825b).e2(-this.f24826c, this.d, this.f24827e, this.f24828f);
                return;
        }
    }
}
