package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class ue7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final byte c;

    public ue7(kf7 kf7Var, int i, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        byte b = this.a;
        byte b2 = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    if (b2 == 0) {
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + ((int) b2)).stepThis().dispose();
                    }
                    return;
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    return;
                }
            default:
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                        Locale locale2 = Locale.US;
                        try {
                            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + ((int) b2) + " ORDER BY date DESC LIMIT 3", new Object[0]);
                            while (queryFinalized.next()) {
                                try {
                                    ?? obj = new Object();
                                    obj.b = queryFinalized.intValue(1);
                                    obj.c = queryFinalized.longValue(0);
                                    obj.f = queryFinalized.stringValue(3);
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(2);
                                    if (byteBufferValue != null) {
                                        TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        byteBufferValue.reuse();
                                        TLRPC.Document document = TLdeserialize.document;
                                        if (document != null) {
                                            obj.a = document;
                                            if ((r47.J4(document) || r47.P4(TLdeserialize.document) || r47.h4(TLdeserialize.document)) && (((i = TLdeserialize.ttl_seconds) > 0 && i <= 60) || i == Integer.MAX_VALUE)) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            obj.d = z3;
                                        } else {
                                            TLRPC.Photo photo = TLdeserialize.photo;
                                            if (photo != null) {
                                                obj.a = photo;
                                                int i2 = TLdeserialize.ttl_seconds;
                                                if ((i2 > 0 && i2 <= 60) || i2 == Integer.MAX_VALUE) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                obj.d = z;
                                            }
                                        }
                                        if ((TLdeserialize.flags & Integer.MIN_VALUE) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        obj.e = z2;
                                    }
                                    arrayList.add(obj);
                                } catch (Exception e2) {
                                    e = e2;
                                    sQLiteCursor = queryFinalized;
                                    kf7Var.p(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteCursor = queryFinalized;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                            hl.c3(new sb4(kf7Var, b2, arrayList, (byte) 12));
                            return;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                break;
        }
    }
}
