package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class mr implements Runnable {
    public final int f17170a;
    public final is f17171b;
    public final long f17172c;
    public final cs d;

    public mr(is isVar, long j10, cs csVar, int i10) {
        this.f17170a = i10;
        this.f17171b = isVar;
        this.f17172c = j10;
        this.d = csVar;
    }

    @Override
    public final void run() {
        int i10 = this.f17170a;
        SQLiteCursor sQLiteCursor = null;
        final cs csVar = this.d;
        long j10 = this.f17172c;
        is isVar = this.f17171b;
        final int i11 = 0;
        try {
            switch (i10) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = isVar.f16333b;
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
                                            csVar.a(i11);
                                            return;
                                        default:
                                            csVar.a(i11);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e) {
                            isVar.o(e, true);
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
                        if (isVar.J.f(j10) == null) {
                            sQLiteCursor = isVar.f16333b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
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
                                        csVar.a(i12);
                                        return;
                                    default:
                                        csVar.a(i12);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e7) {
                        isVar.o(e7, true);
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
