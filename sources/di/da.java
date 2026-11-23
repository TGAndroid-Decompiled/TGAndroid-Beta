package di;

import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.my;
import org.telegram.messenger.mz;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.ms;
public final class da implements Runnable {
    public final int f8699a;
    public final boolean f8700b;
    public final int f8701c;
    public final Object d;
    public final Object f8702e;
    public final Object f8703f;

    public da(np npVar, TLRPC.Chat chat, boolean z10, int i7, q0.a aVar) {
        this.f8699a = 1;
        this.d = npVar;
        this.f8702e = chat;
        this.f8700b = z10;
        this.f8701c = i7;
        this.f8703f = aVar;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f8699a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f8702e;
                boolean[] zArr = (boolean[]) this.f8703f;
                boolean z10 = this.f8700b;
                int i7 = this.f8701c;
                if (z10) {
                    str = k10.i(i7).f24976d0;
                    if (str == null) {
                        si.d0(i7).E();
                        return;
                    }
                } else {
                    str = k10.i(i7).f24975c0;
                    if (str == null) {
                        si.d0(i7).B();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet r02 = si.d0(i7).r0(str);
                if (r02 == null) {
                    r02 = si.d0(i7).p0(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
                if (tL_messages_stickerSet != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                    document = tL_messages_stickerSet.documents.get(i11);
                                    if (document == null || document.f28440id != longValue) {
                                    }
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    document = null;
                    if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                        document = tL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    document = null;
                }
                boolean z11 = true;
                if (document != null) {
                    imageReceiver.f22697v0 = true;
                    imageReceiver.f22670h1 = new d6.i(zArr, 14);
                    mz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.f29324a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.gc.b(document), "160_160_nr", org.telegram.messenger.gc.c(w10, document), "160_160", f10, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                si d02 = si.d0(i7);
                if (tL_messages_stickerSet != null) {
                    z11 = false;
                }
                d02.f1(str, false, z11);
                return;
            case 1:
                np npVar = (np) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f8702e;
                final q0.a aVar = (q0.a) this.f8703f;
                LongSparseIntArray longSparseIntArray = npVar.C0;
                a0.h hVar = npVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.f28434id);
                a0.h hVar2 = npVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.f28434id);
                boolean z12 = this.f8700b;
                int i12 = this.f8701c;
                if (z12) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i12));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.f28434id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i12));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.f28434id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, chat.f28434id);
                }
                if (!arrayList.contains(Integer.valueOf(i12))) {
                    arrayList.add(Integer.valueOf(i12));
                }
                if (npVar.A0.indexOfKey(chat.f28434id) < 0) {
                    if (aVar != null) {
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aVar.accept(Boolean.TRUE);
                                        return;
                                    default:
                                        aVar.accept(Boolean.FALSE);
                                        return;
                                }
                            }
                        });
                    }
                    npVar.L0(chat.f28434id, 3, 0L, null);
                } else if (aVar != null) {
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    aVar.accept(Boolean.TRUE);
                                    return;
                                default:
                                    aVar.accept(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                }
                if (chat.megagroup && !chat.monoforum) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hVar2.k(arrayList2, chat.f28434id);
                    }
                    if (!arrayList2.contains(Integer.valueOf(i12))) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f28434id) < 0) {
                        longSparseIntArray.put(chat.f28434id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                az azVar = (az) this.d;
                TLObject tLObject = (TLObject) this.f8702e;
                my myVar = (my) this.f8703f;
                azVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = myVar.f25668j;
                    tL_inputMediaUploadedPhoto.spoiler = this.f8700b;
                    int i13 = this.f8701c;
                    if (i13 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i13;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.f28446id = document2.f28440id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = myVar.f25663c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    azVar.N(tLObject2, myVar.f25671m, myVar.f25665f, myVar, myVar.K, null, myVar.H);
                    return;
                }
                myVar.c();
                return;
            case 3:
                ks ksVar = (ks) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f8702e;
                TLObject tLObject3 = (TLObject) this.f8703f;
                ArrayList arrayList3 = ksVar.W;
                int i14 = ksVar.Q;
                if (this.f8701c == ksVar.f36971g0 && TextUtils.equals(tL_messages_searchGlobal.f28547q, ksVar.f36972h0)) {
                    ksVar.f36967c0 = false;
                    if (!this.f8700b) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        ur.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                        np.u1(i14).f4(messages_messages.users, false);
                        np.u1(i14).Z3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList4.get(i15);
                            i15++;
                            gj gjVar = new gj(i14, message, false, true);
                            gjVar.K5(ksVar.f36972h0, true);
                            arrayList3.add(gjVar);
                        }
                        ksVar.f36969e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        ksVar.f36970f0 = messages_messages.next_rate;
                    }
                    ksVar.O(true);
                    return;
                }
                return;
            case 4:
                ms msVar = (ms) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f8702e;
                TLObject tLObject4 = (TLObject) this.f8703f;
                ArrayList arrayList5 = msVar.S;
                int i16 = msVar.Q;
                if (this.f8701c == msVar.f37625d0 && TextUtils.equals(tL_messages_searchGlobal2.f28547q, msVar.f37626e0)) {
                    msVar.Z = false;
                    if (!this.f8700b) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        ur.a0(i16).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        np.u1(i16).f4(messages_messages2.users, false);
                        np.u1(i16).Z3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i17);
                            i17++;
                            gj gjVar2 = new gj(i16, message2, false, true);
                            gjVar2.K5(msVar.f37626e0, true);
                            arrayList5.add(gjVar2);
                        }
                        msVar.f37623b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        msVar.f37624c0 = messages_messages2.next_rate;
                    }
                    msVar.O(true);
                    return;
                }
                return;
            case 5:
                p4.n0 n0Var = (p4.n0) this.d;
                q4.r rVar = (q4.r) this.f8702e;
                p4.m0 m0Var = (p4.m0) this.f8703f;
                p4.e0 e0Var = n0Var.h;
                if (!e0Var.j()) {
                    boolean isActive = ((q4.l) n0Var.f55386n.f55871b).f55853a.isActive();
                    int i18 = this.f8701c;
                    if (!isActive) {
                        StringBuilder m10 = i5.c.m(i18, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.f55873a.f55875b);
                        h2.a.l("MediaSessionLegacyStub", m10.toString());
                        return;
                    }
                    p4.v m0 = n0Var.m0(rVar);
                    if (!n0Var.f55380g.C(m0, i18)) {
                        if (i18 == 1 && !e0Var.f55249t.u()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    w7.s sVar = e0Var.f55235e;
                    e0Var.s(m0);
                    sVar.getClass();
                    try {
                        m0Var.f(m0);
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                    }
                    if (this.f8700b) {
                        new SparseBooleanArray().append(i18, true);
                        e0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.i0 i0Var = (sg.i0) this.d;
                sg.j0 j0Var = (sg.j0) this.f8702e;
                Runnable runnable = (Runnable) this.f8703f;
                boolean z13 = this.f8700b;
                if (z13) {
                    rectF = i0Var.h;
                } else {
                    rectF = null;
                }
                i0Var.d(j0Var, this.f8701c, rectF);
                if (z13) {
                    i0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public da(az azVar, TLObject tLObject, my myVar, boolean z10, int i7) {
        this.f8699a = 2;
        this.d = azVar;
        this.f8702e = tLObject;
        this.f8703f = myVar;
        this.f8700b = z10;
        this.f8701c = i7;
    }

    public da(c51 c51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.f8699a = i10;
        this.d = c51Var;
        this.f8701c = i7;
        this.f8702e = tL_messages_searchGlobal;
        this.f8700b = z10;
        this.f8703f = tLObject;
    }

    public da(p4.n0 n0Var, int i7, q4.r rVar, p4.m0 m0Var, boolean z10) {
        this.f8699a = 5;
        this.d = n0Var;
        this.f8701c = i7;
        this.f8702e = rVar;
        this.f8703f = m0Var;
        this.f8700b = z10;
    }

    public da(sg.i0 i0Var, sg.j0 j0Var, int i7, boolean z10, Runnable runnable) {
        this.f8699a = 6;
        this.d = i0Var;
        this.f8702e = j0Var;
        this.f8701c = i7;
        this.f8700b = z10;
        this.f8703f = runnable;
    }

    public da(boolean z10, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f8699a = 0;
        this.f8700b = z10;
        this.f8701c = i7;
        this.d = str;
        this.f8702e = imageReceiver;
        this.f8703f = zArr;
    }
}
