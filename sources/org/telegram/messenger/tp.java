package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class tp implements Runnable {
    public final int f25656a;
    public final yr f25657b;
    public final int f25658c;

    public tp(yr yrVar, int i7, int i10) {
        this.f25656a = i10;
        this.f25657b = yrVar;
        this.f25658c = i7;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7 = this.f25656a;
        SQLiteCursor sQLiteCursor = null;
        int i10 = this.f25658c;
        yr yrVar = this.f25657b;
        switch (i7) {
            case 0:
                qp messagesController = yrVar.getMessagesController();
                p10 userConfig = messagesController.getUserConfig();
                int i11 = this.f25658c;
                if (userConfig.g(i11)[0] == 2147483647L) {
                    if (i11 == 1) {
                        messagesController.f24823k0 = false;
                        messagesController.D();
                        return;
                    }
                    messagesController.i4(i11);
                    return;
                }
                messagesController.U2(i11, 0, 10, false, new tk(messagesController, i11, 3));
                return;
            case 1:
                yrVar.getDownloadController().t(i10);
                return;
            case 2:
                yrVar.getClass();
                try {
                    yrVar.f26725b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    yrVar.o(e10, true);
                    return;
                }
            case 3:
                yr yrVar2 = this.f25657b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        if (i10 >= 0) {
                            queryFinalized = yrVar2.f26725b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i10)), new Object[0]);
                        } else {
                            queryFinalized = yrVar2.f26725b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        }
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!m5.D(longValue)) {
                                    ?? obj = new Object();
                                    obj.f25893a = queryFinalized.intValue(1);
                                    obj.f25895c = queryFinalized.intValue(2);
                                    obj.f25894b = queryFinalized.intValue(3);
                                    hVar.k(obj, longValue);
                                    if (!m5.C(longValue)) {
                                        if (m5.z(longValue)) {
                                            long j3 = -longValue;
                                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                                arrayList2.add(Long.valueOf(j3));
                                            }
                                        } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                            arrayList.add(Long.valueOf(longValue));
                                        }
                                    } else {
                                        int i12 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i12))) {
                                            arrayList3.add(Integer.valueOf(i12));
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                sQLiteCursor = queryFinalized;
                                yrVar2.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                            yrVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            yrVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            yrVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        g0.h3(new mn(yrVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 4:
                try {
                    if (i10 == 0) {
                        yrVar.f26725b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = yrVar.f26725b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i10).stepThis().dispose();
                    }
                    return;
                } catch (Exception e13) {
                    yrVar.o(e13, true);
                    return;
                }
            case 5:
                yrVar.l(i10);
                return;
            default:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = yrVar.f26725b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i10 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                ?? obj2 = new Object();
                                obj2.f21393b = queryFinalized2.intValue(1);
                                obj2.f21394c = queryFinalized2.longValue(0);
                                obj2.f21396f = queryFinalized2.stringValue(3);
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(2);
                                if (byteBufferValue != null) {
                                    TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    TLRPC.Document document = TLdeserialize.document;
                                    if (document != null) {
                                        obj2.f21392a = document;
                                        if (!ij.K4(document)) {
                                            if (!ij.Q4(TLdeserialize.document)) {
                                                if (ij.i4(TLdeserialize.document)) {
                                                }
                                                z11 = false;
                                                obj2.d = z11;
                                            }
                                        }
                                        int i13 = TLdeserialize.ttl_seconds;
                                        if ((i13 > 0 && i13 <= 60) || i13 == Integer.MAX_VALUE) {
                                            z11 = true;
                                            obj2.d = z11;
                                        }
                                        z11 = false;
                                        obj2.d = z11;
                                    } else {
                                        TLRPC.Photo photo = TLdeserialize.photo;
                                        if (photo != null) {
                                            obj2.f21392a = photo;
                                            int i14 = TLdeserialize.ttl_seconds;
                                            if ((i14 > 0 && i14 <= 60) || i14 == Integer.MAX_VALUE) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            obj2.d = z9;
                                        }
                                    }
                                    if ((TLdeserialize.flags & Integer.MIN_VALUE) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    obj2.f21395e = z10;
                                }
                                arrayList7.add(obj2);
                            } catch (Exception e14) {
                                e = e14;
                                sQLiteCursor = queryFinalized2;
                                yrVar.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized2.dispose();
                        g0.h3(new up(yrVar, i10, arrayList7, 3));
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
        }
    }
}
