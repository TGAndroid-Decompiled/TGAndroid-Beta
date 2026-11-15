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
public final class bm implements Runnable {
    public final int f22734a;
    public final Object f22735b;
    public final Object f22736c;
    public final Object d;
    public final Object f22737e;

    public bm(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f22734a = i7;
        this.f22735b = obj;
        this.f22736c = obj2;
        this.d = obj3;
        this.f22737e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bm.a():void");
    }

    private final void b() {
        vr vrVar = (vr) this.f22735b;
        TLRPC.Document document = (TLRPC.Document) this.f22736c;
        String str = (String) this.d;
        String str2 = (String) this.f22737e;
        vrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = vrVar.f27222b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = vrVar.f27222b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                vrVar.o(e10, true);
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
        tv tvVar = (tv) this.f22735b;
        rv rvVar = tvVar.f26744n;
        TLObject tLObject = (TLObject) this.f22736c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22737e;
        ArrayList arrayList2 = tvVar.f26735c;
        ArrayList arrayList3 = tvVar.f26739i;
        int i7 = tvVar.f26733a;
        boolean z13 = tvVar.f26734b;
        int i10 = 0;
        boolean z14 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            tvVar.f26736e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            np.s1(i7).Y3(tL_messages_savedDialogs.users, false);
            np.s1(i7).S3(tL_messages_savedDialogs.chats, false);
            vr.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            vr.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                sv b10 = sv.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        z12 = z14;
                        if (((sv) arrayList2.get(i12)).f26569a == b10.f26569a) {
                            b10.f26572e = ((sv) arrayList2.get(i12)).f26572e;
                            ((sv) arrayList2.get(i12)).f26570b = b10.f26570b;
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
                        if (((sv) arrayList3.get(i13)).f26569a == b10.f26569a) {
                            break;
                        }
                        i13++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            tvVar.h++;
                        }
                    }
                }
                i11++;
                z14 = z12;
                i10 = 0;
            }
            tvVar.f26737f = z14;
            tvVar.f26738g = tL_messages_savedDialogs.dialogs.size();
            tvVar.m();
            g0.r(rvVar);
            g0.i3(rvVar, 450L);
            tvVar.f26734b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            tvVar.f26736e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            np.s1(i7).Y3(tL_messages_savedDialogsSlice.users, false);
            np.s1(i7).S3(tL_messages_savedDialogsSlice.chats, false);
            vr.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            vr.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                sv b11 = sv.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    } else if (((sv) arrayList2.get(i15)).f26569a == b11.f26569a) {
                        b11.f26572e = ((sv) arrayList2.get(i15)).f26572e;
                        ((sv) arrayList2.get(i15)).f26570b = b11.f26570b;
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList3.size()) {
                        if (((sv) arrayList3.get(i16)).f26569a == b11.f26569a) {
                            break;
                        }
                        i16++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            tvVar.h++;
                        }
                    }
                }
            }
            tvVar.f26738g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = tvVar.f26740j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((sv) arrayList4.get(i18)).f26570b) {
                    i17++;
                }
            }
            if (arrayList3.size() + i17 < tvVar.f26738g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            tvVar.f26737f = z11;
            tvVar.m();
            g0.r(rvVar);
            g0.i3(rvVar, 450L);
            tvVar.f26734b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            tvVar.f26736e = true;
            arrayList3.addAll(arrayList);
            tvVar.f26738g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            tvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((sv) arrayList.get(i19)).d()) {
                    tvVar.h++;
                }
            }
            boolean z15 = tvVar.f26737f;
            if (arrayList3.size() >= tvVar.f26738g) {
                z10 = true;
            } else {
                z10 = false;
            }
            tvVar.f26737f = z10;
            tvVar.f26734b = false;
            if (z10 && !z15) {
                tvVar.m();
            }
        } else if (tL_error != null) {
            tvVar.f26736e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                tvVar.f26734b = true;
            }
        }
        if (tvVar.f26734b != z13) {
            np.s1(i7).f25280f7.edit().putBoolean("savedMessagesUnsupported", tvVar.f26734b).apply();
        }
        tvVar.d = false;
    }

    private final void d() {
        ez ezVar = (ez) this.f22735b;
        qy qyVar = (qy) this.f22736c;
        File file = (File) this.d;
        gj gjVar = (gj) this.f22737e;
        TLRPC.Document F0 = qyVar.f26157m.F0();
        boolean z10 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = fc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (qyVar.d != null) {
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
        g0.h3(new jn(ezVar, qyVar, file, F0, gjVar, 16));
    }

    private final void f() {
        boolean z10;
        ez ezVar = (ez) this.f22735b;
        TLObject tLObject = (TLObject) this.f22736c;
        qy qyVar = (qy) this.d;
        String str = (String) this.f22737e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            si mediaDataController = ezVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.J.k(tL_messages_stickerSet, stickerSet.f28078id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.O.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) qyVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) ezVar.f23386a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                ezVar.getMessagesStorage().r1(((qy) arrayList.get(0)).f26157m.f23817k, null, null, false);
            }
            gj gjVar = qyVar.f26157m;
            ezVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) qyVar.d, gjVar.f23817k, qyVar.f26158n, null, null, gjVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f22736c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22737e;
        vy vyVar = ((sy) this.f22735b).f26593b;
        ez ezVar = vyVar.f27280q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = ns.f25587v1;
        if (z10) {
            vyVar.f27274k = ((TLRPC.TL_messages_historyImport) tLObject).f28154id;
            ArrayList arrayList = vyVar.f27270f;
            HashSet hashSet = vyVar.f27268c;
            hashSet.remove(vyVar.f27266a);
            ezVar.getNotificationCenter().k(i7, Long.valueOf(vyVar.f27273j));
            if (hashSet.isEmpty()) {
                vy.a(vyVar);
            }
            vyVar.f27277n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ezVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
            }
            return;
        }
        ezVar.E.l(vyVar.f27273j);
        ezVar.getNotificationCenter().k(i7, Long.valueOf(vyVar.f27273j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22736c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.f22737e;
        zy zyVar = ((yy) this.f22735b).f27852b;
        ez ezVar = zyVar.f28043o;
        ezVar.G.remove(zyVar.f28034e);
        int i7 = ns.f25594w1;
        if (tL_error == null) {
            ezVar.getNotificationCenter().k(i7, zyVar.f28034e);
        } else {
            ezVar.getNotificationCenter().k(i7, zyVar.f28034e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = ezVar.getNotificationCenter().f25620a;
            int i10 = ns.f25601x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                ezVar.getNotificationCenter().k(i10, tLObject);
            } else {
                ezVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        c10 c10Var = (c10) this.f22735b;
        gj gjVar = (gj) this.f22736c;
        f3.s sVar = (f3.s) this.d;
        gjVar.f23817k.originalLanguage = "und";
        c10Var.getMessagesStorage().X1(sVar.f10877a, gjVar.f23817k);
        c10Var.L.remove(sVar);
        ((di.m9) this.f22737e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bm.run():void");
    }

    public bm(np npVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f22734a = 17;
        this.f22735b = npVar;
        this.f22737e = arrayList;
        this.f22736c = updates_difference;
        this.d = hVar;
    }
}
