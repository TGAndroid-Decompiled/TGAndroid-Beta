package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class lr implements Runnable {
    public final int f16786a;
    public final hs f16787b;
    public final long f16788c;
    public final bs d;

    public lr(hs hsVar, long j10, bs bsVar, int i10) {
        this.f16786a = i10;
        this.f16787b = hsVar;
        this.f16788c = j10;
        this.d = bsVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16786a;
        SQLiteCursor sQLiteCursor = null;
        final bs bsVar = this.d;
        long j10 = this.f16788c;
        hs hsVar = this.f16787b;
        final int i11 = 0;
        try {
            switch (i10) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                            if (sQLiteCursor.next()) {
                                i11 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                            i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            bsVar.a(i11);
                                            return;
                                        default:
                                            bsVar.a(i11);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e) {
                            hsVar.o(e, true);
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
                        final int i12 = -1;
                        if (hsVar.J.f(j10) == null) {
                            sQLiteCursor = hsVar.f15940b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                            if (sQLiteCursor.next()) {
                                i12 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                        }
                        i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        bsVar.a(i12);
                                        return;
                                    default:
                                        bsVar.a(i12);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e7) {
                        hsVar.o(e7, true);
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
