package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class ar implements Runnable {
    public final int f22552a;
    public final vr f22553b;
    public final long f22554c;
    public final pr d;

    public ar(vr vrVar, long j3, pr prVar, int i7) {
        this.f22552a = i7;
        this.f22553b = vrVar;
        this.f22554c = j3;
        this.d = prVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22552a;
        SQLiteCursor sQLiteCursor = null;
        final pr prVar = this.d;
        long j3 = this.f22554c;
        vr vrVar = this.f22553b;
        final int i10 = 0;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = vrVar.f27221b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            if (sQLiteCursor.next()) {
                                i10 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                            g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            prVar.a(i10);
                                            return;
                                        default:
                                            prVar.a(i10);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            vrVar.o(e10, true);
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
                        if (vrVar.K.f(j3) == null) {
                            sQLiteCursor = vrVar.f27221b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
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
                                        prVar.a(i11);
                                        return;
                                    default:
                                        prVar.a(i11);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        vrVar.o(e11, true);
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
