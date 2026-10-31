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
    public final int f18368a;
    public final Object f18369b;
    public final Object f18370c;
    public final Object d;
    public final Object e;

    public ul(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18368a = i10;
        this.f18369b = obj;
        this.f18370c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ul.a():void");
    }

    private final void b() {
        hs hsVar = (hs) this.f18369b;
        TLRPC.Document document = (TLRPC.Document) this.f18370c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        hsVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = hsVar.f15940b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = hsVar.f15940b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                hsVar.o(e, true);
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
        gw gwVar = (gw) this.f18369b;
        ew ewVar = gwVar.f15776n;
        TLObject tLObject = (TLObject) this.f18370c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        ArrayList arrayList2 = gwVar.f15768c;
        ArrayList arrayList3 = gwVar.f15771i;
        int i10 = gwVar.f15766a;
        boolean z13 = gwVar.f15767b;
        int i11 = 0;
        boolean z14 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            gwVar.e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            vp.r1(i10).V3(tL_messages_savedDialogs.users, false);
            vp.r1(i10).P3(tL_messages_savedDialogs.chats, false);
            hs.a0(i10).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            hs.a0(i10).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i12 = 0;
            while (i12 < tL_messages_savedDialogs.dialogs.size()) {
                fw b10 = fw.b(i10, tL_messages_savedDialogs.dialogs.get(i12), tL_messages_savedDialogs.messages);
                int i13 = i11;
                while (true) {
                    if (i13 < arrayList2.size()) {
                        z12 = z14;
                        if (((fw) arrayList2.get(i13)).f15624a == b10.f15624a) {
                            b10.e = ((fw) arrayList2.get(i13)).e;
                            ((fw) arrayList2.get(i13)).f15625b = b10.f15625b;
                            break;
                        }
                        i13++;
                        z14 = z12;
                    } else {
                        z12 = z14;
                        break;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList3.size()) {
                        if (((fw) arrayList3.get(i14)).f15624a == b10.f15624a) {
                            break;
                        }
                        i14++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            gwVar.h++;
                        }
                    }
                }
                i12++;
                z14 = z12;
                i11 = 0;
            }
            gwVar.f15769f = z14;
            gwVar.f15770g = tL_messages_savedDialogs.dialogs.size();
            gwVar.m();
            i0.r(ewVar);
            i0.h3(ewVar, 450L);
            gwVar.f15767b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            gwVar.e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            vp.r1(i10).V3(tL_messages_savedDialogsSlice.users, false);
            vp.r1(i10).P3(tL_messages_savedDialogsSlice.chats, false);
            hs.a0(i10).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            hs.a0(i10).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i15 = 0; i15 < tL_messages_savedDialogsSlice.dialogs.size(); i15++) {
                fw b11 = fw.b(i10, tL_messages_savedDialogsSlice.dialogs.get(i15), tL_messages_savedDialogsSlice.messages);
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList2.size()) {
                        break;
                    } else if (((fw) arrayList2.get(i16)).f15624a == b11.f15624a) {
                        b11.e = ((fw) arrayList2.get(i16)).e;
                        ((fw) arrayList2.get(i16)).f15625b = b11.f15625b;
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList3.size()) {
                        if (((fw) arrayList3.get(i17)).f15624a == b11.f15624a) {
                            break;
                        }
                        i17++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            gwVar.h++;
                        }
                    }
                }
            }
            gwVar.f15770g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = gwVar.f15772j;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                if (((fw) arrayList4.get(i19)).f15625b) {
                    i18++;
                }
            }
            if (arrayList3.size() + i18 < gwVar.f15770g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            gwVar.f15769f = z11;
            gwVar.m();
            i0.r(ewVar);
            i0.h3(ewVar, 450L);
            gwVar.f15767b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            gwVar.e = true;
            arrayList3.addAll(arrayList);
            gwVar.f15770g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            gwVar.h = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((fw) arrayList.get(i20)).d()) {
                    gwVar.h++;
                }
            }
            boolean z15 = gwVar.f15769f;
            if (arrayList3.size() >= gwVar.f15770g) {
                z10 = true;
            } else {
                z10 = false;
            }
            gwVar.f15769f = z10;
            gwVar.f15767b = false;
            if (z10 && !z15) {
                gwVar.m();
            }
        } else if (tL_error != null) {
            gwVar.e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                gwVar.f15767b = true;
            }
        }
        if (gwVar.f15767b != z13) {
            vp.r1(i10).f7.edit().putBoolean("savedMessagesUnsupported", gwVar.f15767b).apply();
        }
        gwVar.d = false;
    }

    private final void d() {
        qz qzVar = (qz) this.f18369b;
        cz czVar = (cz) this.f18370c;
        File file = (File) this.d;
        jj jjVar = (jj) this.e;
        TLRPC.Document F0 = czVar.f15116m.F0();
        boolean z10 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = hc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (czVar.d != null) {
                        z10 = true;
                    }
                    arrayList.add(hc.Z(K, 90.0f, 90.0f, 55, z10));
                    K.recycle();
                }
            } catch (Exception e) {
                F0.thumbs.clear();
                f8.g(e, true);
            }
        }
        i0.g3(new cn(qzVar, czVar, file, F0, jjVar, 16));
    }

    private final void f() {
        boolean z10;
        qz qzVar = (qz) this.f18369b;
        TLObject tLObject = (TLObject) this.f18370c;
        cz czVar = (cz) this.d;
        String str = (String) this.e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ui mediaDataController = qzVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.I.k(tL_messages_stickerSet, stickerSet.f19820id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.N.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) czVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) qzVar.f17658a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                qzVar.getMessagesStorage().r1(((cz) arrayList.get(0)).f15116m.f16337k, null, null, false);
            }
            jj jjVar = czVar.f15116m;
            qzVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) czVar.d, jjVar.f16337k, czVar.f15117n, null, null, jjVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f18370c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        hz hzVar = ((ez) this.f18369b).f15488b;
        qz qzVar = hzVar.f15995q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i10 = zs.f19705v1;
        if (z10) {
            hzVar.f15989k = ((TLRPC.TL_messages_historyImport) tLObject).f19896id;
            ArrayList arrayList = hzVar.f15985f;
            HashSet hashSet = hzVar.f15984c;
            hashSet.remove(hzVar.f15982a);
            qzVar.getNotificationCenter().k(i10, Long.valueOf(hzVar.f15988j));
            if (hashSet.isEmpty()) {
                hz.a(hzVar);
            }
            hzVar.f15992n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                qzVar.getFileLoader().i0(false, 67108864, (String) arrayList.get(i11), true);
            }
            return;
        }
        qzVar.D.l(hzVar.f15988j);
        qzVar.getNotificationCenter().k(i10, Long.valueOf(hzVar.f15988j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18370c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.e;
        lz lzVar = ((kz) this.f18369b).f16653b;
        qz qzVar = lzVar.f16848o;
        qzVar.F.remove(lzVar.e);
        int i10 = zs.f19712w1;
        if (tL_error == null) {
            qzVar.getNotificationCenter().k(i10, lzVar.e);
        } else {
            qzVar.getNotificationCenter().k(i10, lzVar.e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = qzVar.getNotificationCenter().f19737a;
            int i11 = zs.f19719x1;
            if (sparseArray.indexOfKey(i11) >= 0) {
                qzVar.getNotificationCenter().k(i11, tLObject);
            } else {
                qzVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        t10 t10Var = (t10) this.f18369b;
        jj jjVar = (jj) this.f18370c;
        c3.s sVar = (c3.s) this.d;
        jjVar.f16337k.originalLanguage = "und";
        t10Var.getMessagesStorage().X1(sVar.f3687a, jjVar.f16337k);
        t10Var.K.remove(sVar);
        ((bi.i6) this.e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ul.run():void");
    }

    public ul(vp vpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f18368a = 17;
        this.f18369b = vpVar;
        this.e = arrayList;
        this.f18370c = updates_difference;
        this.d = hVar;
    }
}
