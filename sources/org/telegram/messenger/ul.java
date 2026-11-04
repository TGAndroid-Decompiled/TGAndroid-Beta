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
    public final int f25724a;
    public final Object f25725b;
    public final Object f25726c;
    public final Object d;
    public final Object f25727e;

    public ul(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f25724a = i3;
        this.f25725b = obj;
        this.f25726c = obj2;
        this.d = obj3;
        this.f25727e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ul.a():void");
    }

    private final void b() {
        qr qrVar = (qr) this.f25725b;
        TLRPC.Document document = (TLRPC.Document) this.f25726c;
        String str = (String) this.d;
        String str2 = (String) this.f25727e;
        qrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = qrVar.f24936b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = qrVar.f24936b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                qrVar.o(e10, true);
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
        nv nvVar = (nv) this.f25725b;
        lv lvVar = nvVar.f24445n;
        TLObject tLObject = (TLObject) this.f25726c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f25727e;
        ArrayList arrayList2 = nvVar.f24436c;
        ArrayList arrayList3 = nvVar.f24440i;
        int i3 = nvVar.f24434a;
        boolean z13 = nvVar.f24435b;
        int i10 = 0;
        boolean z14 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            nvVar.f24437e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            hp.s1(i3).Y3(tL_messages_savedDialogs.users, false);
            hp.s1(i3).S3(tL_messages_savedDialogs.chats, false);
            qr.a0(i3).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            qr.a0(i3).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                mv b10 = mv.b(i3, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        z12 = z14;
                        if (((mv) arrayList2.get(i12)).f24264a == b10.f24264a) {
                            b10.f24267e = ((mv) arrayList2.get(i12)).f24267e;
                            ((mv) arrayList2.get(i12)).f24265b = b10.f24265b;
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
                        if (((mv) arrayList3.get(i13)).f24264a == b10.f24264a) {
                            break;
                        }
                        i13++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            nvVar.h++;
                        }
                    }
                }
                i11++;
                z14 = z12;
                i10 = 0;
            }
            nvVar.f24438f = z14;
            nvVar.f24439g = tL_messages_savedDialogs.dialogs.size();
            nvVar.m();
            g0.r(lvVar);
            g0.i3(lvVar, 450L);
            nvVar.f24435b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            nvVar.f24437e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            hp.s1(i3).Y3(tL_messages_savedDialogsSlice.users, false);
            hp.s1(i3).S3(tL_messages_savedDialogsSlice.chats, false);
            qr.a0(i3).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            qr.a0(i3).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                mv b11 = mv.b(i3, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    } else if (((mv) arrayList2.get(i15)).f24264a == b11.f24264a) {
                        b11.f24267e = ((mv) arrayList2.get(i15)).f24267e;
                        ((mv) arrayList2.get(i15)).f24265b = b11.f24265b;
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList3.size()) {
                        if (((mv) arrayList3.get(i16)).f24264a == b11.f24264a) {
                            break;
                        }
                        i16++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            nvVar.h++;
                        }
                    }
                }
            }
            nvVar.f24439g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = nvVar.f24441j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((mv) arrayList4.get(i18)).f24265b) {
                    i17++;
                }
            }
            if (arrayList3.size() + i17 < nvVar.f24439g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            nvVar.f24438f = z11;
            nvVar.m();
            g0.r(lvVar);
            g0.i3(lvVar, 450L);
            nvVar.f24435b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            nvVar.f24437e = true;
            arrayList3.addAll(arrayList);
            nvVar.f24439g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            nvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((mv) arrayList.get(i19)).d()) {
                    nvVar.h++;
                }
            }
            boolean z15 = nvVar.f24438f;
            if (arrayList3.size() >= nvVar.f24439g) {
                z10 = true;
            } else {
                z10 = false;
            }
            nvVar.f24438f = z10;
            nvVar.f24435b = false;
            if (z10 && !z15) {
                nvVar.m();
            }
        } else if (tL_error != null) {
            nvVar.f24437e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                nvVar.f24435b = true;
            }
        }
        if (nvVar.f24435b != z13) {
            hp.s1(i3).f22999e7.edit().putBoolean("savedMessagesUnsupported", nvVar.f24435b).apply();
        }
        nvVar.d = false;
    }

    private final void e() {
        yy yyVar = (yy) this.f25725b;
        ky kyVar = (ky) this.f25726c;
        File file = (File) this.d;
        zi ziVar = (zi) this.f25727e;
        TLRPC.Document F0 = kyVar.f23901m.F0();
        boolean z10 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = zb.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (kyVar.d != null) {
                        z10 = true;
                    }
                    arrayList.add(zb.Z(K, 90.0f, 90.0f, 55, z10));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.h3(new cn(yyVar, kyVar, file, F0, ziVar, 16));
    }

    private final void f() {
        boolean z10;
        yy yyVar = (yy) this.f25725b;
        TLObject tLObject = (TLObject) this.f25726c;
        ky kyVar = (ky) this.d;
        String str = (String) this.f25727e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            li mediaDataController = yyVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.J.k(tL_messages_stickerSet, stickerSet.f27028id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.O.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) kyVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) yyVar.f26678a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                yyVar.getMessagesStorage().r1(((ky) arrayList.get(0)).f23901m.f26868k, null, null, false);
            }
            zi ziVar = kyVar.f23901m;
            yyVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) kyVar.d, ziVar.f26868k, kyVar.f23902n, null, null, ziVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f25726c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f25727e;
        py pyVar = ((my) this.f25725b).f24289b;
        yy yyVar = pyVar.f24833q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i3 = hs.f23320v1;
        if (z10) {
            pyVar.f24827k = ((TLRPC.TL_messages_historyImport) tLObject).f27104id;
            ArrayList arrayList = pyVar.f24823f;
            HashSet hashSet = pyVar.f24821c;
            hashSet.remove(pyVar.f24819a);
            yyVar.getNotificationCenter().k(i3, Long.valueOf(pyVar.f24826j));
            if (hashSet.isEmpty()) {
                py.a(pyVar);
            }
            pyVar.f24830n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                yyVar.getFileLoader().i0(false, 67108864, (String) arrayList.get(i10), true);
            }
            return;
        }
        yyVar.E.l(pyVar.f24826j);
        yyVar.getNotificationCenter().k(i3, Long.valueOf(pyVar.f24826j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f25726c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.f25727e;
        ty tyVar = ((sy) this.f25725b).f25450b;
        yy yyVar = tyVar.f25628o;
        yyVar.G.remove(tyVar.f25619e);
        int i3 = hs.f23327w1;
        if (tL_error == null) {
            yyVar.getNotificationCenter().k(i3, tyVar.f25619e);
        } else {
            yyVar.getNotificationCenter().k(i3, tyVar.f25619e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = yyVar.getNotificationCenter().f23353a;
            int i10 = hs.f23334x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                yyVar.getNotificationCenter().k(i10, tLObject);
            } else {
                yyVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        x00 x00Var = (x00) this.f25725b;
        zi ziVar = (zi) this.f25726c;
        e3.s sVar = (e3.s) this.d;
        ziVar.f26868k.originalLanguage = "und";
        x00Var.getMessagesStorage().X1(sVar.f9506a, ziVar.f26868k);
        x00Var.L.remove(sVar);
        ((ci.w9) this.f25727e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ul.run():void");
    }

    public ul(hp hpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f25724a = 17;
        this.f25725b = hpVar;
        this.f25727e = arrayList;
        this.f25726c = updates_difference;
        this.d = hVar;
    }
}
