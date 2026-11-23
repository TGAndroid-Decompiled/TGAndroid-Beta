package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class ar implements Runnable {
    public final int f22961a;
    public final ur f22962b;
    public final long f22963c;
    public final or d;

    public ar(ur urVar, long j3, or orVar, int i7) {
        this.f22961a = i7;
        this.f22962b = urVar;
        this.f22963c = j3;
        this.d = orVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22961a;
        SQLiteCursor sQLiteCursor = null;
        final or orVar = this.d;
        long j3 = this.f22963c;
        ur urVar = this.f22962b;
        final int i10 = 0;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = urVar.f27252b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            if (sQLiteCursor.next()) {
                                i10 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                            g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            orVar.a(i10);
                                            return;
                                        default:
                                            orVar.a(i10);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            urVar.o(e10, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                        }
                        sQLiteCursor.dispose();
                        return;
                    } finally {
                    }
                default:
                    try {
                        final int i11 = -1;
                        if (urVar.K.f(j3) == null) {
                            sQLiteCursor = urVar.f27252b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
                            if (sQLiteCursor.next()) {
                                i11 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                        }
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        orVar.a(i11);
                                        return;
                                    default:
                                        orVar.a(i11);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        urVar.o(e11, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
            }
        } finally {
        }
    }
}
