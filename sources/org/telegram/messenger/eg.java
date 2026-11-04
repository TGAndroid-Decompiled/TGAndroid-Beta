package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class eg implements Runnable {
    public final int f22347a;
    public final c1 f22348b;
    public final long f22349c;
    public final long d;
    public final int f22350e;
    public final int f22351f;

    public eg(c1 c1Var, long j10, long j11, int i3, int i10, int i11) {
        this.f22347a = i11;
        this.f22348b = c1Var;
        this.f22349c = j10;
        this.d = j11;
        this.f22350e = i3;
        this.f22351f = i10;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i3;
        int i10;
        long j10;
        long j11;
        int i11;
        int i12;
        SQLitePreparedStatement executeFast;
        int i13;
        switch (this.f22347a) {
            case 0:
                li liVar = (li) this.f22348b;
                int i14 = this.f22351f;
                long j12 = this.f22349c;
                int i15 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                long j13 = this.d;
                int i16 = this.f22350e;
                if (i15 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().f24936b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j13 + " AND topic_id = " + j12 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = liVar.getMessagesStorage().f24936b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j13 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                }
                if (queryFinalized.next()) {
                    i3 = queryFinalized.intValue(0);
                    i10 = queryFinalized.intValue(1);
                } else {
                    i3 = -1;
                    i10 = 0;
                }
                queryFinalized.dispose();
                if (i3 == -1 && m5.C(j13)) {
                    SQLiteDatabase sQLiteDatabase3 = liVar.getMessagesStorage().f24936b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j13 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i3 = queryFinalized2.intValue(0);
                    }
                    queryFinalized2.dispose();
                    if (i3 != -1) {
                        i12 = i3;
                        i11 = i16;
                        j11 = j12;
                        liVar.H1(j13, j11, i11, i12);
                        j10 = j13;
                    } else {
                        j10 = j13;
                        j11 = j12;
                        i11 = i16;
                        i12 = i3;
                    }
                    i3 = i12;
                } else {
                    j10 = j13;
                    j11 = j12;
                    i11 = i16;
                }
                g0.h3(new ei(liVar, j10, true, i3, i11, i10, j11, i14));
                return;
            case 1:
                li liVar2 = (li) this.f22348b;
                long j14 = this.d;
                int i17 = this.f22350e;
                int i18 = this.f22351f;
                long j15 = this.f22349c;
                int i19 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                try {
                    if (i19 != 0) {
                        executeFast = liVar2.getMessagesStorage().f24936b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = liVar2.getMessagesStorage().f24936b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    }
                    executeFast.requery();
                    executeFast.bindLong(1, j14);
                    if (i19 != 0) {
                        executeFast.bindLong(2, j15);
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
                ((qr) this.f22348b).e2(-this.f22349c, this.d, this.f22350e, this.f22351f);
                return;
        }
    }
}
