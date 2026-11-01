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
public final class vl implements Runnable {
    public final int f18750a;
    public final Object f18751b;
    public final Object f18752c;
    public final Object d;
    public final Object e;

    public vl(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18750a = i10;
        this.f18751b = obj;
        this.f18752c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vl.a():void");
    }

    private final void b() {
        is isVar = (is) this.f18751b;
        TLRPC.Document document = (TLRPC.Document) this.f18752c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        isVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = isVar.f16333b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = isVar.f16333b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                isVar.o(e, true);
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
        hw hwVar = (hw) this.f18751b;
        fw fwVar = hwVar.f16125n;
        TLObject tLObject = (TLObject) this.f18752c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        ArrayList arrayList2 = hwVar.f16117c;
        ArrayList arrayList3 = hwVar.f16120i;
        int i10 = hwVar.f16115a;
        boolean z13 = hwVar.f16116b;
        int i11 = 0;
        boolean z14 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            hwVar.e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            wp.r1(i10).V3(tL_messages_savedDialogs.users, false);
            wp.r1(i10).P3(tL_messages_savedDialogs.chats, false);
            is.a0(i10).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            is.a0(i10).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i12 = 0;
            while (i12 < tL_messages_savedDialogs.dialogs.size()) {
                gw b10 = gw.b(i10, tL_messages_savedDialogs.dialogs.get(i12), tL_messages_savedDialogs.messages);
                int i13 = i11;
                while (true) {
                    if (i13 < arrayList2.size()) {
                        z12 = z14;
                        if (((gw) arrayList2.get(i13)).f15965a == b10.f15965a) {
                            b10.e = ((gw) arrayList2.get(i13)).e;
                            ((gw) arrayList2.get(i13)).f15966b = b10.f15966b;
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
                        if (((gw) arrayList3.get(i14)).f15965a == b10.f15965a) {
                            break;
                        }
                        i14++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            hwVar.h++;
                        }
                    }
                }
                i12++;
                z14 = z12;
                i11 = 0;
            }
            hwVar.f16118f = z14;
            hwVar.f16119g = tL_messages_savedDialogs.dialogs.size();
            hwVar.m();
            i0.r(fwVar);
            i0.h3(fwVar, 450L);
            hwVar.f16116b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            hwVar.e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            wp.r1(i10).V3(tL_messages_savedDialogsSlice.users, false);
            wp.r1(i10).P3(tL_messages_savedDialogsSlice.chats, false);
            is.a0(i10).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            is.a0(i10).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i15 = 0; i15 < tL_messages_savedDialogsSlice.dialogs.size(); i15++) {
                gw b11 = gw.b(i10, tL_messages_savedDialogsSlice.dialogs.get(i15), tL_messages_savedDialogsSlice.messages);
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList2.size()) {
                        break;
                    } else if (((gw) arrayList2.get(i16)).f15965a == b11.f15965a) {
                        b11.e = ((gw) arrayList2.get(i16)).e;
                        ((gw) arrayList2.get(i16)).f15966b = b11.f15966b;
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList3.size()) {
                        if (((gw) arrayList3.get(i17)).f15965a == b11.f15965a) {
                            break;
                        }
                        i17++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            hwVar.h++;
                        }
                    }
                }
            }
            hwVar.f16119g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = hwVar.f16121j;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                if (((gw) arrayList4.get(i19)).f15966b) {
                    i18++;
                }
            }
            if (arrayList3.size() + i18 < hwVar.f16119g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            hwVar.f16118f = z11;
            hwVar.m();
            i0.r(fwVar);
            i0.h3(fwVar, 450L);
            hwVar.f16116b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            hwVar.e = true;
            arrayList3.addAll(arrayList);
            hwVar.f16119g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            hwVar.h = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((gw) arrayList.get(i20)).d()) {
                    hwVar.h++;
                }
            }
            boolean z15 = hwVar.f16118f;
            if (arrayList3.size() >= hwVar.f16119g) {
                z10 = true;
            } else {
                z10 = false;
            }
            hwVar.f16118f = z10;
            hwVar.f16116b = false;
            if (z10 && !z15) {
                hwVar.m();
            }
        } else if (tL_error != null) {
            hwVar.e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                hwVar.f16116b = true;
            }
        }
        if (hwVar.f16116b != z13) {
            wp.r1(i10).f7.edit().putBoolean("savedMessagesUnsupported", hwVar.f16116b).apply();
        }
        hwVar.d = false;
    }

    private final void d() {
        rz rzVar = (rz) this.f18751b;
        dz dzVar = (dz) this.f18752c;
        File file = (File) this.d;
        kj kjVar = (kj) this.e;
        TLRPC.Document F0 = dzVar.f15472m.F0();
        boolean z10 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = ic.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (dzVar.d != null) {
                        z10 = true;
                    }
                    arrayList.add(ic.Z(K, 90.0f, 90.0f, 55, z10));
                    K.recycle();
                }
            } catch (Exception e) {
                F0.thumbs.clear();
                f8.g(e, true);
            }
        }
        i0.g3(new dn(rzVar, dzVar, file, F0, kjVar, 16));
    }

    private final void f() {
        boolean z10;
        rz rzVar = (rz) this.f18751b;
        TLObject tLObject = (TLObject) this.f18752c;
        dz dzVar = (dz) this.d;
        String str = (String) this.e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            vi mediaDataController = rzVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.I.k(tL_messages_stickerSet, stickerSet.f19821id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.N.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) dzVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) rzVar.f18004a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                rzVar.getMessagesStorage().r1(((dz) arrayList.get(0)).f15472m.f16690k, null, null, false);
            }
            kj kjVar = dzVar.f15472m;
            rzVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) dzVar.d, kjVar.f16690k, dzVar.f15473n, null, null, kjVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f18752c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        iz izVar = ((fz) this.f18751b).f15829b;
        rz rzVar = izVar.f16387q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i10 = at.f14801v1;
        if (z10) {
            izVar.f16381k = ((TLRPC.TL_messages_historyImport) tLObject).f19897id;
            ArrayList arrayList = izVar.f16377f;
            HashSet hashSet = izVar.f16376c;
            hashSet.remove(izVar.f16374a);
            rzVar.getNotificationCenter().k(i10, Long.valueOf(izVar.f16380j));
            if (hashSet.isEmpty()) {
                iz.a(izVar);
            }
            izVar.f16384n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                rzVar.getFileLoader().i0(false, 67108864, (String) arrayList.get(i11), true);
            }
            return;
        }
        rzVar.D.l(izVar.f16380j);
        rzVar.getNotificationCenter().k(i10, Long.valueOf(izVar.f16380j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18752c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.e;
        mz mzVar = ((lz) this.f18751b).f17018b;
        rz rzVar = mzVar.f17232o;
        rzVar.F.remove(mzVar.e);
        int i10 = at.f14808w1;
        if (tL_error == null) {
            rzVar.getNotificationCenter().k(i10, mzVar.e);
        } else {
            rzVar.getNotificationCenter().k(i10, mzVar.e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = rzVar.getNotificationCenter().f14833a;
            int i11 = at.f14815x1;
            if (sparseArray.indexOfKey(i11) >= 0) {
                rzVar.getNotificationCenter().k(i11, tLObject);
            } else {
                rzVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        u10 u10Var = (u10) this.f18751b;
        kj kjVar = (kj) this.f18752c;
        c3.s sVar = (c3.s) this.d;
        kjVar.f16690k.originalLanguage = "und";
        u10Var.getMessagesStorage().X1(sVar.f3687a, kjVar.f16690k);
        u10Var.K.remove(sVar);
        ((bi.i6) this.e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vl.run():void");
    }

    public vl(wp wpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f18750a = 17;
        this.f18751b = wpVar;
        this.e = arrayList;
        this.f18752c = updates_difference;
        this.d = hVar;
    }
}
