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
public final class em implements Runnable {
    public final int f22258a;
    public final Object f22259b;
    public final Object f22260c;
    public final Object d;
    public final Object f22261e;

    public em(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f22258a = i7;
        this.f22259b = obj;
        this.f22260c = obj2;
        this.d = obj3;
        this.f22261e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.em.a():void");
    }

    private final void b() {
        yr yrVar = (yr) this.f22259b;
        TLRPC.Document document = (TLRPC.Document) this.f22260c;
        String str = (String) this.d;
        String str2 = (String) this.f22261e;
        yrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = yrVar.f26721b.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = yrVar.f26721b.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                yrVar.o(e10, true);
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
        boolean z9;
        boolean z10;
        boolean z11;
        vv vvVar = (vv) this.f22259b;
        tv tvVar = vvVar.f26222n;
        TLObject tLObject = (TLObject) this.f22260c;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22261e;
        ArrayList arrayList2 = vvVar.f26213c;
        ArrayList arrayList3 = vvVar.f26217i;
        int i7 = vvVar.f26211a;
        boolean z12 = vvVar.f26212b;
        int i10 = 0;
        boolean z13 = true;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            vvVar.f26214e = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            qp.s1(i7).Y3(tL_messages_savedDialogs.users, false);
            qp.s1(i7).S3(tL_messages_savedDialogs.chats, false);
            yr.a0(i7).m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            yr.a0(i7).j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            int i11 = 0;
            while (i11 < tL_messages_savedDialogs.dialogs.size()) {
                uv b10 = uv.b(i7, tL_messages_savedDialogs.dialogs.get(i11), tL_messages_savedDialogs.messages);
                int i12 = i10;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        z11 = z13;
                        if (((uv) arrayList2.get(i12)).f25896a == b10.f25896a) {
                            b10.f25899e = ((uv) arrayList2.get(i12)).f25899e;
                            ((uv) arrayList2.get(i12)).f25897b = b10.f25897b;
                            break;
                        }
                        i12++;
                        z13 = z11;
                    } else {
                        z11 = z13;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList3.size()) {
                        if (((uv) arrayList3.get(i13)).f25896a == b10.f25896a) {
                            break;
                        }
                        i13++;
                    } else {
                        arrayList3.add(b10);
                        if (b10.d()) {
                            vvVar.h++;
                        }
                    }
                }
                i11++;
                z13 = z11;
                i10 = 0;
            }
            vvVar.f26215f = z13;
            vvVar.f26216g = tL_messages_savedDialogs.dialogs.size();
            vvVar.m();
            g0.r(tvVar);
            g0.i3(tvVar, 450L);
            vvVar.f26212b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            vvVar.f26214e = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            qp.s1(i7).Y3(tL_messages_savedDialogsSlice.users, false);
            qp.s1(i7).S3(tL_messages_savedDialogsSlice.chats, false);
            yr.a0(i7).m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            yr.a0(i7).j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i14 = 0; i14 < tL_messages_savedDialogsSlice.dialogs.size(); i14++) {
                uv b11 = uv.b(i7, tL_messages_savedDialogsSlice.dialogs.get(i14), tL_messages_savedDialogsSlice.messages);
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        break;
                    } else if (((uv) arrayList2.get(i15)).f25896a == b11.f25896a) {
                        b11.f25899e = ((uv) arrayList2.get(i15)).f25899e;
                        ((uv) arrayList2.get(i15)).f25897b = b11.f25897b;
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList3.size()) {
                        if (((uv) arrayList3.get(i16)).f25896a == b11.f25896a) {
                            break;
                        }
                        i16++;
                    } else {
                        arrayList3.add(b11);
                        if (b11.d()) {
                            vvVar.h++;
                        }
                    }
                }
            }
            vvVar.f26216g = tL_messages_savedDialogsSlice.count;
            ArrayList arrayList4 = vvVar.f26218j;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                if (((uv) arrayList4.get(i18)).f25897b) {
                    i17++;
                }
            }
            if (arrayList3.size() + i17 < vvVar.f26216g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            vvVar.f26215f = z10;
            vvVar.m();
            g0.r(tvVar);
            g0.i3(tvVar, 450L);
            vvVar.f26212b = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            vvVar.f26214e = true;
            arrayList3.addAll(arrayList);
            vvVar.f26216g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            vvVar.h = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((uv) arrayList.get(i19)).d()) {
                    vvVar.h++;
                }
            }
            boolean z14 = vvVar.f26215f;
            if (arrayList3.size() >= vvVar.f26216g) {
                z9 = true;
            } else {
                z9 = false;
            }
            vvVar.f26215f = z9;
            vvVar.f26212b = false;
            if (z9 && !z14) {
                vvVar.m();
            }
        } else if (tL_error != null) {
            vvVar.f26214e = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                vvVar.f26212b = true;
            }
        }
        if (vvVar.f26212b != z12) {
            qp.s1(i7).f24774e7.edit().putBoolean("savedMessagesUnsupported", vvVar.f26212b).apply();
        }
        vvVar.d = false;
    }

    private final void d() {
        gz gzVar = (gz) this.f22259b;
        sy syVar = (sy) this.f22260c;
        File file = (File) this.d;
        ij ijVar = (ij) this.f22261e;
        TLRPC.Document F0 = syVar.f25548m.F0();
        boolean z9 = false;
        if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap K = gc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (K != null) {
                    F0.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = F0.thumbs;
                    if (syVar.d != null) {
                        z9 = true;
                    }
                    arrayList.add(gc.Z(K, 90.0f, 90.0f, 55, z9));
                    K.recycle();
                }
            } catch (Exception e10) {
                F0.thumbs.clear();
                a8.g(e10, true);
            }
        }
        g0.h3(new mn(gzVar, syVar, file, F0, ijVar, 16));
    }

    private final void f() {
        boolean z9;
        gz gzVar = (gz) this.f22259b;
        TLObject tLObject = (TLObject) this.f22260c;
        sy syVar = (sy) this.d;
        String str = (String) this.f22261e;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ui mediaDataController = gzVar.getMediaDataController();
            mediaDataController.getClass();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.I.k(tL_messages_stickerSet, stickerSet.f26983id);
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null) {
                    mediaDataController.N.put(str2.toLowerCase(), tL_messages_stickerSet);
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) syVar.h).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = (ArrayList) gzVar.f22764a.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z9) {
                gzVar.getMessagesStorage().r1(((sy) arrayList.get(0)).f25548m.f23262k, null, null, false);
            }
            ij ijVar = syVar.f25548m;
            gzVar.getSecretChatHelper().j((TLRPC.DecryptedMessage) syVar.d, ijVar.f23262k, syVar.f25549n, null, null, ijVar);
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.f22260c;
        TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22261e;
        xy xyVar = ((uy) this.f22259b).f25920b;
        gz gzVar = xyVar.f26558q;
        boolean z9 = tLObject instanceof TLRPC.TL_messages_historyImport;
        int i7 = qs.f25091v1;
        if (z9) {
            xyVar.f26552k = ((TLRPC.TL_messages_historyImport) tLObject).f27059id;
            ArrayList arrayList = xyVar.f26548f;
            HashSet hashSet = xyVar.f26546c;
            hashSet.remove(xyVar.f26544a);
            gzVar.getNotificationCenter().k(i7, Long.valueOf(xyVar.f26551j));
            if (hashSet.isEmpty()) {
                xy.a(xyVar);
            }
            xyVar.f26555n = SystemClock.elapsedRealtime();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                gzVar.getFileLoader().h0(false, 67108864, (String) arrayList.get(i10), true);
            }
            return;
        }
        gzVar.D.l(xyVar.f26551j);
        gzVar.getNotificationCenter().k(i7, Long.valueOf(xyVar.f26551j), tL_messages_initHistoryImport, tL_error);
    }

    private final void h() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22260c;
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
        TLObject tLObject = (TLObject) this.f22261e;
        bz bzVar = ((az) this.f22259b).f21578b;
        gz gzVar = bzVar.f21763o;
        gzVar.F.remove(bzVar.f21754e);
        int i7 = qs.f25098w1;
        if (tL_error == null) {
            gzVar.getNotificationCenter().k(i7, bzVar.f21754e);
        } else {
            gzVar.getNotificationCenter().k(i7, bzVar.f21754e, tL_stickers_createStickerSet, tL_error);
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            SparseArray sparseArray = gzVar.getNotificationCenter().f25124a;
            int i10 = qs.f25105x1;
            if (sparseArray.indexOfKey(i10) >= 0) {
                gzVar.getNotificationCenter().k(i10, tLObject);
            } else {
                gzVar.getMediaDataController().f2(null, tLObject, 2, null, false, false);
            }
        }
    }

    private final void i() {
        f10 f10Var = (f10) this.f22259b;
        ij ijVar = (ij) this.f22260c;
        f3.s sVar = (f3.s) this.d;
        ijVar.f23262k.originalLanguage = "und";
        f10Var.getMessagesStorage().X1(sVar.f11070a, ijVar.f23262k);
        f10Var.K.remove(sVar);
        ((bi.ya) this.f22261e).a("und");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.em.run():void");
    }

    public em(qp qpVar, ArrayList arrayList, TLRPC.updates_Difference updates_difference, a0.h hVar) {
        this.f22258a = 17;
        this.f22259b = qpVar;
        this.f22261e = arrayList;
        this.f22260c = updates_difference;
        this.d = hVar;
    }
}
