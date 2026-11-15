package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class qp implements Runnable {
    public final int f26120a;
    public final vr f26121b;
    public final int f26122c;

    public qp(vr vrVar, int i7, int i10) {
        this.f26120a = i10;
        this.f26121b = vrVar;
        this.f26122c = i7;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7 = this.f26120a;
        SQLiteCursor sQLiteCursor = null;
        int i10 = this.f26122c;
        vr vrVar = this.f26121b;
        switch (i7) {
            case 0:
                np messagesController = vrVar.getMessagesController();
                m10 userConfig = messagesController.getUserConfig();
                int i11 = this.f26122c;
                if (userConfig.g(i11)[0] == 2147483647L) {
                    if (i11 == 1) {
                        messagesController.f25324l0 = false;
                        messagesController.D();
                        return;
                    }
                    messagesController.i4(i11);
                    return;
                }
                messagesController.U2(i11, 0, 10, false, new rk(messagesController, i11, 3));
                return;
            case 1:
                vrVar.getDownloadController().t(i10);
                return;
            case 2:
                vrVar.getClass();
                try {
                    vrVar.f27222b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    vrVar.o(e10, true);
                    return;
                }
            case 3:
                vr vrVar2 = this.f26121b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        if (i10 >= 0) {
                            queryFinalized = vrVar2.f27222b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i10)), new Object[0]);
                        } else {
                            queryFinalized = vrVar2.f27222b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        }
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!m5.D(longValue)) {
                                    ?? obj = new Object();
                                    obj.f26328a = queryFinalized.intValue(1);
                                    obj.f26330c = queryFinalized.intValue(2);
                                    obj.f26329b = queryFinalized.intValue(3);
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
                                vrVar2.o(e, true);
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
                            vrVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            vrVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            vrVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        g0.h3(new jn(vrVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
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
                        vrVar.f27222b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i10).stepThis().dispose();
                    }
                    return;
                } catch (Exception e13) {
                    vrVar.o(e13, true);
                    return;
                }
            case 5:
                vrVar.l(i10);
                return;
            default:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = vrVar.f27222b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i10 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                ?? obj2 = new Object();
                                obj2.f22465b = queryFinalized2.intValue(1);
                                obj2.f22466c = queryFinalized2.longValue(0);
                                obj2.f22468f = queryFinalized2.stringValue(3);
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(2);
                                if (byteBufferValue != null) {
                                    TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    TLRPC.Document document = TLdeserialize.document;
                                    if (document != null) {
                                        obj2.f22464a = document;
                                        if (!gj.K4(document)) {
                                            if (!gj.Q4(TLdeserialize.document)) {
                                                if (gj.i4(TLdeserialize.document)) {
                                                }
                                                z12 = false;
                                                obj2.d = z12;
                                            }
                                        }
                                        int i13 = TLdeserialize.ttl_seconds;
                                        if ((i13 > 0 && i13 <= 60) || i13 == Integer.MAX_VALUE) {
                                            z12 = true;
                                            obj2.d = z12;
                                        }
                                        z12 = false;
                                        obj2.d = z12;
                                    } else {
                                        TLRPC.Photo photo = TLdeserialize.photo;
                                        if (photo != null) {
                                            obj2.f22464a = photo;
                                            int i14 = TLdeserialize.ttl_seconds;
                                            if ((i14 > 0 && i14 <= 60) || i14 == Integer.MAX_VALUE) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            obj2.d = z10;
                                        }
                                    }
                                    if ((TLdeserialize.flags & Integer.MIN_VALUE) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    obj2.f22467e = z11;
                                }
                                arrayList7.add(obj2);
                            } catch (Exception e14) {
                                e = e14;
                                sQLiteCursor = queryFinalized2;
                                vrVar.o(e, true);
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
                        g0.h3(new rp(vrVar, i10, arrayList7, 3));
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
