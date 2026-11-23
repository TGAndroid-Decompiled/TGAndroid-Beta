package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class wp implements Runnable {
    public final int f27745a;
    public final ur f27746b;
    public final int f27747c;
    public final long d;

    public wp(ur urVar, int i7, long j3, int i10) {
        this.f27745a = i10;
        this.f27746b = urVar;
        this.f27747c = i7;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27745a) {
            case 0:
                int i7 = this.f27747c;
                long j3 = this.d;
                ur urVar = this.f27746b;
                urVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = urVar.f27216b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i7 + " WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (SQLiteException e10) {
                    urVar.o(e10, true);
                    return;
                }
            case 1:
                this.f27746b.A0(this.f27747c, this.d);
                return;
            case 2:
                int i10 = this.f27747c;
                long j10 = this.d;
                ur urVar2 = this.f27746b;
                urVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = urVar2.f27216b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
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
                    urVar2.o(e11, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            case 3:
                int i11 = this.f27747c;
                long j11 = this.d;
                ur urVar3 = this.f27746b;
                urVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = urVar3.f27216b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i11);
                        sQLitePreparedStatement2.bindLong(2, j11);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e12) {
                        urVar3.o(e12, true);
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
                int i12 = this.f27747c;
                long j12 = this.d;
                ur urVar4 = this.f27746b;
                urVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = urVar4.f27216b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i12 + " AND uid = " + j12).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    urVar4.o(e13, true);
                    return;
                }
            case 5:
                int i13 = this.f27747c;
                long j13 = this.d;
                ur urVar5 = this.f27746b;
                urVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = urVar5.f27216b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i13);
                    executeFast.bindLong(2, -j13);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e14) {
                    urVar5.o(e14, true);
                    return;
                }
            case 6:
                ur urVar6 = this.f27746b;
                int i14 = this.f27747c;
                long j14 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = urVar6.f27216b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j14 + " AND type = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    urVar6.o(e15, true);
                    return;
                }
            default:
                int i15 = this.f27747c;
                long j15 = this.d;
                ur urVar7 = this.f27746b;
                urVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = urVar7.f27216b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i15);
                        sQLitePreparedStatement3.bindLong(2, j15);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e16) {
                        urVar7.o(e16, true);
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
