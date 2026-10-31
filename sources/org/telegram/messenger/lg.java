package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class lg implements Runnable {
    public final int f16733a;
    public final f1 f16734b;
    public final long f16735c;
    public final long d;
    public final int e;
    public final int f16736f;

    public lg(f1 f1Var, long j10, long j11, int i10, int i11, int i12) {
        this.f16733a = i12;
        this.f16734b = f1Var;
        this.f16735c = j10;
        this.d = j11;
        this.e = i10;
        this.f16736f = i11;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        int i13;
        SQLitePreparedStatement executeFast;
        int i14;
        switch (this.f16733a) {
            case 0:
                ui uiVar = (ui) this.f16734b;
                int i15 = this.f16736f;
                long j12 = this.f16735c;
                int i16 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                long j13 = this.d;
                int i17 = this.e;
                if (i16 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f15940b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j13 + " AND topic_id = " + j12 + " AND type = " + i17 + " LIMIT 1", new Object[0]);
                    } catch (Exception e) {
                        e = e;
                        z10 = true;
                        f8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().f15940b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j13 + " AND type = " + i17 + " LIMIT 1", new Object[0]);
                    } catch (Exception e7) {
                        e = e7;
                        z10 = true;
                        f8.g(e, z10);
                        return;
                    }
                }
                if (queryFinalized.next()) {
                    i10 = queryFinalized.intValue(0);
                    i11 = queryFinalized.intValue(1);
                } else {
                    i10 = -1;
                    i11 = 0;
                }
                queryFinalized.dispose();
                if (i10 == -1 && o5.C(j13)) {
                    SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().f15940b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j13 + " AND type = " + i17 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i10 = queryFinalized2.intValue(0);
                    }
                    queryFinalized2.dispose();
                    if (i10 != -1) {
                        i13 = i10;
                        i12 = i17;
                        j11 = j12;
                        uiVar.H1(j13, j11, i12, i13);
                        j10 = j13;
                    } else {
                        j10 = j13;
                        j11 = j12;
                        i12 = i17;
                        i13 = i10;
                    }
                    i10 = i13;
                } else {
                    j10 = j13;
                    j11 = j12;
                    i12 = i17;
                }
                i0.g3(new mi(uiVar, j10, true, i10, i12, i11, j11, i15));
                return;
            case 1:
                ui uiVar2 = (ui) this.f16734b;
                long j14 = this.d;
                int i18 = this.e;
                int i19 = this.f16736f;
                long j15 = this.f16735c;
                int i20 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                try {
                    if (i20 != 0) {
                        executeFast = uiVar2.getMessagesStorage().f15940b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = uiVar2.getMessagesStorage().f15940b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    }
                    executeFast.requery();
                    executeFast.bindLong(1, j14);
                    if (i20 != 0) {
                        executeFast.bindLong(2, j15);
                        i14 = 3;
                    } else {
                        i14 = 2;
                    }
                    executeFast.bindInteger(i14, i18);
                    executeFast.bindInteger(i14 + 1, i19);
                    executeFast.bindInteger(i14 + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                ((hs) this.f16734b).e2(-this.f16735c, this.d, this.e, this.f16736f);
                return;
        }
    }
}
