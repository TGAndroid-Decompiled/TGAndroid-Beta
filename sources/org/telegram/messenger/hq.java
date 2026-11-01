package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class hq implements Runnable {
    public final int f16102a;
    public final is f16103b;
    public final int f16104c;
    public final long d;

    public hq(is isVar, int i10, long j10, int i11) {
        this.f16102a = i11;
        this.f16103b = isVar;
        this.f16104c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16102a) {
            case 0:
                int i10 = this.f16104c;
                long j10 = this.d;
                is isVar = this.f16103b;
                isVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i10 + " WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e) {
                    isVar.o(e, true);
                    return;
                }
            case 1:
                this.f16103b.A0(this.f16104c, this.d);
                return;
            case 2:
                int i11 = this.f16104c;
                long j11 = this.d;
                is isVar2 = this.f16103b;
                isVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = isVar2.f16333b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
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
                    isVar2.o(e7, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            case 3:
                int i12 = this.f16104c;
                long j12 = this.d;
                is isVar3 = this.f16103b;
                isVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = isVar3.f16333b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i12);
                        sQLitePreparedStatement2.bindLong(2, j12);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e10) {
                        isVar3.o(e10, true);
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
                int i13 = this.f16104c;
                long j13 = this.d;
                is isVar4 = this.f16103b;
                isVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = isVar4.f16333b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i13 + " AND uid = " + j13).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    isVar4.o(e11, true);
                    return;
                }
            case 5:
                int i14 = this.f16104c;
                long j14 = this.d;
                is isVar5 = this.f16103b;
                isVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = isVar5.f16333b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i14);
                    executeFast.bindLong(2, -j14);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e12) {
                    isVar5.o(e12, true);
                    return;
                }
            case 6:
                is isVar6 = this.f16103b;
                int i15 = this.f16104c;
                long j15 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = isVar6.f16333b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j15 + " AND type = " + i15).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    isVar6.o(e13, true);
                    return;
                }
            default:
                int i16 = this.f16104c;
                long j16 = this.d;
                is isVar7 = this.f16103b;
                isVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = isVar7.f16333b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i16);
                        sQLitePreparedStatement3.bindLong(2, j16);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e14) {
                        isVar7.o(e14, true);
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
