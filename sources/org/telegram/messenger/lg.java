package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class lg implements Runnable {
    public final int f25492a;
    public final ri f25493b;
    public final long f25494c;
    public final long d;
    public final int f25495e;
    public final int f25496f;

    public lg(ri riVar, long j3, long j10, int i7, int i10, int i11) {
        this.f25492a = i11;
        this.f25493b = riVar;
        this.f25494c = j3;
        this.d = j10;
        this.f25495e = i7;
        this.f25496f = i10;
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
        switch (this.f25492a) {
            case 0:
                int i14 = this.f25496f;
                long j10 = this.f25494c;
                int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ri riVar = this.f25493b;
                long j11 = this.d;
                int i16 = this.f25495e;
                if (i15 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27151b;
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
                        SQLiteDatabase sQLiteDatabase2 = riVar.getMessagesStorage().f27151b;
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
                    SQLiteDatabase sQLiteDatabase3 = riVar.getMessagesStorage().f27151b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j11 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i7 = queryFinalized2.intValue(0);
                    }
                    int i17 = i7;
                    queryFinalized2.dispose();
                    if (i17 != -1) {
                        riVar.M1(j11, j10, i16, i17);
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
                g0.g3(new lf(riVar, j11, true, i12, i11, i10, j3, i14));
                return;
            default:
                long j12 = this.d;
                int i18 = this.f25495e;
                int i19 = this.f25496f;
                long j13 = this.f25494c;
                int i20 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                ri riVar2 = this.f25493b;
                try {
                    if (i20 != 0) {
                        executeFast = riVar2.getMessagesStorage().f27151b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = riVar2.getMessagesStorage().f27151b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
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
