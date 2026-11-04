package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class wq implements Runnable {
    public final int f26247a;
    public final qr f26248b;
    public final long f26249c;
    public final kr d;

    public wq(qr qrVar, long j10, kr krVar, int i3) {
        this.f26247a = i3;
        this.f26248b = qrVar;
        this.f26249c = j10;
        this.d = krVar;
    }

    @Override
    public final void run() {
        int i3 = this.f26247a;
        SQLiteCursor sQLiteCursor = null;
        final kr krVar = this.d;
        long j10 = this.f26249c;
        qr qrVar = this.f26248b;
        final int i10 = 0;
        try {
            switch (i3) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                            if (sQLiteCursor.next()) {
                                i10 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                            g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            krVar.a(i10);
                                            return;
                                        default:
                                            krVar.a(i10);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            qrVar.o(e10, true);
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
                        if (qrVar.K.f(j10) == null) {
                            sQLiteCursor = qrVar.f24936b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                            if (sQLiteCursor.next()) {
                                i11 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                        }
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        krVar.a(i11);
                                        return;
                                    default:
                                        krVar.a(i11);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        qrVar.o(e11, true);
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
