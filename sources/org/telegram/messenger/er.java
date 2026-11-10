package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class er implements Runnable {
    public final int f22276a;
    public final yr f22277b;
    public final long f22278c;
    public final sr d;

    public er(yr yrVar, long j3, sr srVar, int i7) {
        this.f22276a = i7;
        this.f22277b = yrVar;
        this.f22278c = j3;
        this.d = srVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22276a;
        SQLiteCursor sQLiteCursor = null;
        final sr srVar = this.d;
        long j3 = this.f22278c;
        yr yrVar = this.f22277b;
        final int i10 = 0;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = yrVar.f26725b;
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
                                            srVar.a(i10);
                                            return;
                                        default:
                                            srVar.a(i10);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            yrVar.o(e10, true);
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
                        if (yrVar.J.f(j3) == null) {
                            sQLiteCursor = yrVar.f26725b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
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
                                        srVar.a(i11);
                                        return;
                                    default:
                                        srVar.a(i11);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        yrVar.o(e11, true);
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
