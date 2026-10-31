package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class gq implements Runnable {
    public final int f15753a;
    public final hs f15754b;
    public final int f15755c;
    public final long d;

    public gq(hs hsVar, int i10, long j10, int i11) {
        this.f15753a = i11;
        this.f15754b = hsVar;
        this.f15755c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15753a) {
            case 0:
                int i10 = this.f15755c;
                long j10 = this.d;
                hs hsVar = this.f15754b;
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i10 + " WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e) {
                    hsVar.o(e, true);
                    return;
                }
            case 1:
                this.f15754b.A0(this.f15755c, this.d);
                return;
            case 2:
                int i11 = this.f15755c;
                long j11 = this.d;
                hs hsVar2 = this.f15754b;
                hsVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar2.f15940b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i11);
                        sQLitePreparedStatement.bindLong(2, j11);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e7) {
                    hsVar2.o(e7, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            case 3:
                int i12 = this.f15755c;
                long j12 = this.d;
                hs hsVar3 = this.f15754b;
                hsVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = hsVar3.f15940b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i12);
                        sQLitePreparedStatement2.bindLong(2, j12);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e10) {
                        hsVar3.o(e10, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 4:
                int i13 = this.f15755c;
                long j13 = this.d;
                hs hsVar4 = this.f15754b;
                hsVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = hsVar4.f15940b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i13 + " AND uid = " + j13).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    hsVar4.o(e11, true);
                    return;
                }
            case 5:
                int i14 = this.f15755c;
                long j14 = this.d;
                hs hsVar5 = this.f15754b;
                hsVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = hsVar5.f15940b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i14);
                    executeFast.bindLong(2, -j14);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e12) {
                    hsVar5.o(e12, true);
                    return;
                }
            case 6:
                hs hsVar6 = this.f15754b;
                int i15 = this.f15755c;
                long j15 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = hsVar6.f15940b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j15 + " AND type = " + i15).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    hsVar6.o(e13, true);
                    return;
                }
            default:
                int i16 = this.f15755c;
                long j16 = this.d;
                hs hsVar7 = this.f15754b;
                hsVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = hsVar7.f15940b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i16);
                        sQLitePreparedStatement3.bindLong(2, j16);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e14) {
                        hsVar7.o(e14, true);
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                    }
                    throw th4;
                }
        }
    }
}
