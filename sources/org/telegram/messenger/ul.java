package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ul implements Runnable {
    public final int f27186a;
    public final Object f27187b;
    public final Object f27188c;
    public final Object d;
    public final Object f27189e;

    public ul(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27186a = i7;
        this.f27187b = obj;
        this.f27188c = obj2;
        this.d = obj3;
        this.f27189e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ul.a():void");
    }

    private final void b() {
        ur urVar = (ur) this.f27187b;
        TLRPC.Document document = (TLRPC.Document) this.f27188c;
        String str = (String) this.d;
        String str2 = (String) this.f27189e;
        urVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = urVar.f27216b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = urVar.f27216b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                urVar.o(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void c() {
        boolean z10;
        boolean z11;
        boolean z12;
        qv qvVar = (qv) this.f27187b;
        ov ovVar = qvVar.f26477n;
        TLObject tLObject = (TLObject) this.f27188c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27189e;
        ArrayList arrayList2 = qvVar.f26468c;
        ArrayList arrayList3 = qvVar.f26472i;
        int i7 = qvVar.f26466a;
        boolean z13 = qvVar.f26467b;
        int i10 = 0;
        boolean z14 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            qvVar.f26469e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            np.u1(i7).f4(tL_messages_savedDialogs.users, false);
            np.u1(i7).Z3(tL_messages_savedDialogs.chats, false);
            ur.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            ur.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                pv b10 = pv.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        z12 = z14;
                        if (((pv) arrayList2.get(i12)).f26314a == b10.f26314a) {
                            b10.f26317e = ((pv) arrayList2.get(i12)).f26317e;
                            ((pv) arrayList2.get(i12)).f26315b = b10.f26315b;
                            break;
                        }
                        i12++;
                        z14 = z12;
                    } else {
                        z12 = z14;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList3.size()) {
                        if (((pv) arrayList3.get(i13)).f26314a == b10.f26314a) {
                            break;
                        }
                        i13++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            qvVar.h++;
                        }
                    }
                }
                i11++;
                z14 = z12;
                i10 = 0;
            }
            qvVar.f26470f = z14;
            qvVar.f26471g = tL_messages_savedDialogs.dialogs.size();
            qvVar.m();
            g0.r(ovVar);
            g0.h3(ovVar, 450L);
            qvVar.f26467b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            qvVar.f26469e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            np.u1(i7).f4(tL_messages_savedDialogsSlice.users, false);
            np.u1(i7).Z3(tL_messages_savedDialogsSlice.chats, false);
            ur.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            ur.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                pv b11 = pv.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    } else if (((pv) arrayList2.get(i15)).f26314a == b11.f26314a) {
                        b11.f26317e = ((pv) arrayList2.get(i15)).f26317e;
                        ((pv) arrayList2.get(i15)).f26315b = b11.f26315b;
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList3.size()) {
                        if (((pv) arrayList3.get(i16)).f26314a == b11.f26314a) {
                            break;
                        }
                        i16++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            qvVar.h++;
                        }
                    }
                }
            }
            qvVar.f26471g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = qvVar.f26473j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((pv) arrayList4.get(i18)).f26315b) {
                    i17++;
                }
            }
            if (arrayList3.size() + i17 < qvVar.f26471g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            qvVar.f26470f = z11;
            qvVar.m();
            g0.r(ovVar);
            g0.h3(ovVar, 450L);
            qvVar.f26467b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            qvVar.f26469e = true;
            arrayList3.addAll(arrayList);
            qvVar.f26471g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            qvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((pv) arrayList.get(i19)).d()) {
                    qvVar.h++;
                }
            }
            boolean z15 = qvVar.f26470f;
            if (arrayList3.size() >= qvVar.f26471g) {
                z10 = true;
            } else {
                z10 = false;
            }
            qvVar.f26470f = z10;
            qvVar.f26467b = false;
            if (z10 && !z15) {
                qvVar.m();
            }
        } else if (tL_error != null) {
            qvVar.f26469e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                qvVar.f26467b = true;
            }
        }
        if (qvVar.f26467b != z13) {
            np.u1(i7).h7.edit().putBoolean("savedMessagesUnsupported", qvVar.f26467b).apply();
        }
        qvVar.d = false;
    }

    private final void d() {
        az azVar = (az) this.f27187b;
        my myVar = (my) this.f27188c;
        File file = (File) this.d;
        gj gjVar = (gj) this.f27189e;
        TLRPC.Document F0 = myVar.f25635m.F0();
        boolean z10 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = fc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (myVar.d != null) {
                        z10 = true;
                    }
                    arrayList.add(fc.Z(K, 90.0f, 90.0f, 55, z10));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.g3(new gn(azVar, myVar, file, F0, gjVar, 16));
    }

    private final void f() {
        boolean z10;
        az azVar = (az) this.f27187b;
        TLObject tLObject = (TLObject) this.f27188c;
        my myVar = (my) this.d;
        String str = (String) this.f27189e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            si mediaDataController = azVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.J.k(tL_messages_stickerSet, stickerSet.f28425id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.O.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) myVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) azVar.f22968a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                azVar.getMessagesStorage().r1(((my) arrayList.get(0)).f25635m.f24177k, null, null, false);
            }
            gj gjVar = myVar.f25635m;
            azVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) myVar.d, gjVar.f24177k, myVar.f25636n, null, null, gjVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f27188c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27189e;
        ry ryVar = ((oy) this.f27187b).f26170b;
        az azVar = ryVar.f26672q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = ls.f25363v1;
        if (z10) {
            ryVar.f26666k = ((TLRPC.TL_messages_historyImport) tLObject).f28501id;
            ArrayList arrayList = ryVar.f26662f;
            HashSet hashSet = ryVar.f26660c;
            hashSet.remove(ryVar.f26658a);
            azVar.getNotificationCenter().k(i7, Long.valueOf(ryVar.f26665j));
            if (hashSet.isEmpty()) {
                ry.a(ryVar);
            }
            ryVar.f26669n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                azVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
            }
            return;
        }
        azVar.E.l(ryVar.f26665j);
        azVar.getNotificationCenter().k(i7, Long.valueOf(ryVar.f26665j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27188c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.f27189e;
        vy vyVar = ((uy) this.f27187b).f27259b;
        az azVar = vyVar.f27626o;
        azVar.G.remove(vyVar.f27617e);
        int i7 = ls.f25370w1;
        if (tL_error == null) {
            azVar.getNotificationCenter().k(i7, vyVar.f27617e);
        } else {
            azVar.getNotificationCenter().k(i7, vyVar.f27617e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = azVar.getNotificationCenter().f25396a;
            int i10 = ls.f25377x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                azVar.getNotificationCenter().k(i10, tLObject);
            } else {
                azVar.getMediaDataController().k2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        a10 a10Var = (a10) this.f27187b;
        gj gjVar = (gj) this.f27188c;
        f3.s sVar = (f3.s) this.d;
        gjVar.f24177k.originalLanguage = "und";
        a10Var.getMessagesStorage().X1(sVar.f11191a, gjVar.f24177k);
        a10Var.L.remove(sVar);
        ((di.p9) this.f27189e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ul.run():void");
    }

    public ul(np npVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f27186a = 17;
        this.f27187b = npVar;
        this.f27189e = arrayList;
        this.f27188c = updates_difference;
        this.d = hVar;
    }
}
