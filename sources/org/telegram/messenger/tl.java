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
public final class tl implements Runnable {
    public final int f27121a;
    public final Object f27122b;
    public final Object f27123c;
    public final Object d;
    public final Object f27124e;

    public tl(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27121a = i7;
        this.f27122b = obj;
        this.f27123c = obj2;
        this.d = obj3;
        this.f27124e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tl.a():void");
    }

    private final void b() {
        tr trVar = (tr) this.f27122b;
        TLRPC.Document document = (TLRPC.Document) this.f27123c;
        String str = (String) this.d;
        String str2 = (String) this.f27124e;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = trVar.f27151b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = trVar.f27151b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                trVar.o(e10, true);
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
        pv pvVar = (pv) this.f27122b;
        nv nvVar = pvVar.f26398n;
        TLObject tLObject = (TLObject) this.f27123c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27124e;
        ArrayList arrayList2 = pvVar.f26389c;
        ArrayList arrayList3 = pvVar.f26393i;
        int i7 = pvVar.f26387a;
        boolean z13 = pvVar.f26388b;
        int i10 = 0;
        boolean z14 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            pvVar.f26390e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            mp.u1(i7).f4(tL_messages_savedDialogs.users, false);
            mp.u1(i7).Z3(tL_messages_savedDialogs.chats, false);
            tr.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            tr.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                ov b10 = ov.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        z12 = z14;
                        if (((ov) arrayList2.get(i12)).f26201a == b10.f26201a) {
                            b10.f26204e = ((ov) arrayList2.get(i12)).f26204e;
                            ((ov) arrayList2.get(i12)).f26202b = b10.f26202b;
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
                        if (((ov) arrayList3.get(i13)).f26201a == b10.f26201a) {
                            break;
                        }
                        i13++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            pvVar.h++;
                        }
                    }
                }
                i11++;
                z14 = z12;
                i10 = 0;
            }
            pvVar.f26391f = z14;
            pvVar.f26392g = tL_messages_savedDialogs.dialogs.size();
            pvVar.m();
            g0.r(nvVar);
            g0.h3(nvVar, 450L);
            pvVar.f26388b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            pvVar.f26390e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            mp.u1(i7).f4(tL_messages_savedDialogsSlice.users, false);
            mp.u1(i7).Z3(tL_messages_savedDialogsSlice.chats, false);
            tr.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            tr.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                ov b11 = ov.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    } else if (((ov) arrayList2.get(i15)).f26201a == b11.f26201a) {
                        b11.f26204e = ((ov) arrayList2.get(i15)).f26204e;
                        ((ov) arrayList2.get(i15)).f26202b = b11.f26202b;
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList3.size()) {
                        if (((ov) arrayList3.get(i16)).f26201a == b11.f26201a) {
                            break;
                        }
                        i16++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            pvVar.h++;
                        }
                    }
                }
            }
            pvVar.f26392g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = pvVar.f26394j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((ov) arrayList4.get(i18)).f26202b) {
                    i17++;
                }
            }
            if (arrayList3.size() + i17 < pvVar.f26392g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            pvVar.f26391f = z11;
            pvVar.m();
            g0.r(nvVar);
            g0.h3(nvVar, 450L);
            pvVar.f26388b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            pvVar.f26390e = true;
            arrayList3.addAll(arrayList);
            pvVar.f26392g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            pvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((ov) arrayList.get(i19)).d()) {
                    pvVar.h++;
                }
            }
            boolean z15 = pvVar.f26391f;
            if (arrayList3.size() >= pvVar.f26392g) {
                z10 = true;
            } else {
                z10 = false;
            }
            pvVar.f26391f = z10;
            pvVar.f26388b = false;
            if (z10 && !z15) {
                pvVar.m();
            }
        } else if (tL_error != null) {
            pvVar.f26390e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                pvVar.f26388b = true;
            }
        }
        if (pvVar.f26388b != z13) {
            mp.u1(i7).h7.edit().putBoolean("savedMessagesUnsupported", pvVar.f26388b).apply();
        }
        pvVar.d = false;
    }

    private final void d() {
        zy zyVar = (zy) this.f27122b;
        ly lyVar = (ly) this.f27123c;
        File file = (File) this.d;
        fj fjVar = (fj) this.f27124e;
        TLRPC.Document F0 = lyVar.f25584m.F0();
        boolean z10 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = ec.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (lyVar.d != null) {
                        z10 = true;
                    }
                    arrayList.add(ec.Z(K, 90.0f, 90.0f, 55, z10));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.g3(new fn(zyVar, lyVar, file, F0, fjVar, 16));
    }

    private final void f() {
        boolean z10;
        zy zyVar = (zy) this.f27122b;
        TLObject tLObject = (TLObject) this.f27123c;
        ly lyVar = (ly) this.d;
        String str = (String) this.f27124e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ri mediaDataController = zyVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.J.k(tL_messages_stickerSet, stickerSet.f28519id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.O.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) lyVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) zyVar.f28477a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                zyVar.getMessagesStorage().r1(((ly) arrayList.get(0)).f25584m.f24073k, null, null, false);
            }
            fj fjVar = lyVar.f25584m;
            zyVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) lyVar.d, fjVar.f24073k, lyVar.f25585n, null, null, fjVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f27123c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27124e;
        qy qyVar = ((ny) this.f27122b).f26103b;
        zy zyVar = qyVar.f26609q;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = ks.f25304v1;
        if (z10) {
            qyVar.f26603k = ((TLRPC.TL_messages_historyImport) tLObject).f28595id;
            ArrayList arrayList = qyVar.f26599f;
            HashSet hashSet = qyVar.f26597c;
            hashSet.remove(qyVar.f26595a);
            zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.f26602j));
            if (hashSet.isEmpty()) {
                qy.a(qyVar);
            }
            qyVar.f26606n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zyVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
            }
            return;
        }
        zyVar.E.l(qyVar.f26602j);
        zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.f26602j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27123c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.f27124e;
        uy uyVar = ((ty) this.f27122b).f27194b;
        zy zyVar = uyVar.f27402o;
        zyVar.G.remove(uyVar.f27393e);
        int i7 = ks.f25311w1;
        if (tL_error == null) {
            zyVar.getNotificationCenter().k(i7, uyVar.f27393e);
        } else {
            zyVar.getNotificationCenter().k(i7, uyVar.f27393e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = zyVar.getNotificationCenter().f25337a;
            int i10 = ks.f25318x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                zyVar.getNotificationCenter().k(i10, tLObject);
            } else {
                zyVar.getMediaDataController().k2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        y00 y00Var = (y00) this.f27122b;
        fj fjVar = (fj) this.f27123c;
        f3.s sVar = (f3.s) this.d;
        fjVar.f24073k.originalLanguage = "und";
        y00Var.getMessagesStorage().X1(sVar.f11195a, fjVar.f24073k);
        y00Var.L.remove(sVar);
        ((di.p9) this.f27124e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tl.run():void");
    }

    public tl(mp mpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f27121a = 17;
        this.f27122b = mpVar;
        this.f27124e = arrayList;
        this.f27123c = updates_difference;
        this.d = hVar;
    }
}
