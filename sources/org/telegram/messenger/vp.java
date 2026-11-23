package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class vp implements Runnable {
    public final int f27673a;
    public final tr f27674b;
    public final int f27675c;
    public final long d;

    public vp(tr trVar, int i7, long j3, int i10) {
        this.f27673a = i10;
        this.f27674b = trVar;
        this.f27675c = i7;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27673a) {
            case 0:
                int i7 = this.f27675c;
                long j3 = this.d;
                tr trVar = this.f27674b;
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = trVar.f27151b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i7 + " WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (SQLiteException e10) {
                    trVar.o(e10, true);
                    return;
                }
            case 1:
                this.f27674b.A0(this.f27675c, this.d);
                return;
            case 2:
                int i10 = this.f27675c;
                long j10 = this.d;
                tr trVar2 = this.f27674b;
                trVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar2.f27151b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i10);
                        sQLitePreparedStatement.bindLong(2, j10);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    trVar2.o(e11, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            case 3:
                int i11 = this.f27675c;
                long j11 = this.d;
                tr trVar3 = this.f27674b;
                trVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = trVar3.f27151b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i11);
                        sQLitePreparedStatement2.bindLong(2, j11);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e12) {
                        trVar3.o(e12, true);
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
                int i12 = this.f27675c;
                long j12 = this.d;
                tr trVar4 = this.f27674b;
                trVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = trVar4.f27151b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i12 + " AND uid = " + j12).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    trVar4.o(e13, true);
                    return;
                }
            case 5:
                int i13 = this.f27675c;
                long j13 = this.d;
                tr trVar5 = this.f27674b;
                trVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = trVar5.f27151b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i13);
                    executeFast.bindLong(2, -j13);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e14) {
                    trVar5.o(e14, true);
                    return;
                }
            case 6:
                tr trVar6 = this.f27674b;
                int i14 = this.f27675c;
                long j14 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = trVar6.f27151b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j14 + " AND type = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    trVar6.o(e15, true);
                    return;
                }
            default:
                int i15 = this.f27675c;
                long j15 = this.d;
                tr trVar7 = this.f27674b;
                trVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = trVar7.f27151b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i15);
                        sQLitePreparedStatement3.bindLong(2, j15);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e16) {
                        trVar7.o(e16, true);
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
