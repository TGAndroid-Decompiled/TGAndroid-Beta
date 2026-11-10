package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class mg implements Runnable {
    public final int f24016a;
    public final c1 f24017b;
    public final long f24018c;
    public final long d;
    public final int f24019e;
    public final int f24020f;

    public mg(c1 c1Var, long j3, long j10, int i7, int i10, int i11) {
        this.f24016a = i11;
        this.f24017b = c1Var;
        this.f24018c = j3;
        this.d = j10;
        this.f24019e = i7;
        this.f24020f = i10;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z9;
        int i7;
        int i10;
        long j3;
        long j10;
        int i11;
        int i12;
        SQLitePreparedStatement executeFast;
        int i13;
        switch (this.f24016a) {
            case 0:
                ui uiVar = (ui) this.f24017b;
                int i14 = this.f24020f;
                long j11 = this.f24018c;
                int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                long j12 = this.d;
                int i16 = this.f24019e;
                if (i15 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26725b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j12 + " AND topic_id = " + j11 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        z9 = true;
                        a8.g(e, z9);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().f26725b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j12 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e11) {
                        e = e11;
                        z9 = true;
                        a8.g(e, z9);
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
                    SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().f26725b;
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
                        uiVar.H1(j12, j10, i11, i12);
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
                g0.h3(new ni(uiVar, j3, true, i7, i11, i10, j10, i14));
                return;
            case 1:
                ui uiVar2 = (ui) this.f24017b;
                long j13 = this.d;
                int i17 = this.f24019e;
                int i18 = this.f24020f;
                long j14 = this.f24018c;
                int i19 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                try {
                    if (i19 != 0) {
                        executeFast = uiVar2.getMessagesStorage().f26725b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast = uiVar2.getMessagesStorage().f26725b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
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
                ((yr) this.f24017b).e2(-this.f24018c, this.d, this.f24019e, this.f24020f);
                return;
        }
    }
}
