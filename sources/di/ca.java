package di;

import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ly;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.z41;
public final class ca implements Runnable {
    public final int f8619a;
    public final boolean f8620b;
    public final int f8621c;
    public final Object d;
    public final Object f8622e;
    public final Object f8623f;

    public ca(mp mpVar, TLRPC.Chat chat, boolean z10, int i7, q0.a aVar) {
        this.f8619a = 1;
        this.d = mpVar;
        this.f8622e = chat;
        this.f8620b = z10;
        this.f8621c = i7;
        this.f8623f = aVar;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f8619a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f8622e;
                boolean[] zArr = (boolean[]) this.f8623f;
                boolean z10 = this.f8620b;
                int i7 = this.f8621c;
                if (z10) {
                    str = j10.i(i7).f24778d0;
                    if (str == null) {
                        ri.d0(i7).E();
                        return;
                    }
                } else {
                    str = j10.i(i7).f24777c0;
                    if (str == null) {
                        ri.d0(i7).B();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet r02 = ri.d0(i7).r0(str);
                if (r02 == null) {
                    r02 = ri.d0(i7).p0(str);
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
                                    if (document == null || document.f28409id != longValue) {
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
                    imageReceiver.f22666v0 = true;
                    imageReceiver.f22639h1 = new d6.i(zArr, 14);
                    lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29337a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.fc.b(document), "160_160_nr", org.telegram.messenger.fc.c(w10, document), "160_160", f10, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                ri d02 = ri.d0(i7);
                if (tL_messages_stickerSet != null) {
                    z11 = false;
                }
                d02.f1(str, false, z11);
                return;
            case 1:
                mp mpVar = (mp) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f8622e;
                final q0.a aVar = (q0.a) this.f8623f;
                LongSparseIntArray longSparseIntArray = mpVar.C0;
                a0.h hVar = mpVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.f28403id);
                a0.h hVar2 = mpVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.f28403id);
                boolean z12 = this.f8620b;
                int i12 = this.f8621c;
                if (z12) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i12));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.f28403id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i12));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.f28403id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, chat.f28403id);
                }
                if (!arrayList.contains(Integer.valueOf(i12))) {
                    arrayList.add(Integer.valueOf(i12));
                }
                if (mpVar.A0.indexOfKey(chat.f28403id) < 0) {
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
                    mpVar.L0(chat.f28403id, 3, 0L, null);
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
                        hVar2.k(arrayList2, chat.f28403id);
                    }
                    if (!arrayList2.contains(Integer.valueOf(i12))) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f28403id) < 0) {
                        longSparseIntArray.put(chat.f28403id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zy zyVar = (zy) this.d;
                TLObject tLObject = (TLObject) this.f8622e;
                ly lyVar = (ly) this.f8623f;
                zyVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = lyVar.f25462j;
                    tL_inputMediaUploadedPhoto.spoiler = this.f8620b;
                    int i13 = this.f8621c;
                    if (i13 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i13;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.f28415id = document2.f28409id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = lyVar.f25457c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    zyVar.N(tLObject2, lyVar.f25465m, lyVar.f25459f, lyVar, lyVar.K, null, lyVar.H);
                    return;
                }
                lyVar.c();
                return;
            case 3:
                is isVar = (is) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f8622e;
                TLObject tLObject3 = (TLObject) this.f8623f;
                ArrayList arrayList3 = isVar.W;
                int i14 = isVar.Q;
                if (this.f8621c == isVar.f36187g0 && TextUtils.equals(tL_messages_searchGlobal.f28516q, isVar.f36188h0)) {
                    isVar.f36183c0 = false;
                    if (!this.f8620b) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        tr.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                        mp.u1(i14).f4(messages_messages.users, false);
                        mp.u1(i14).Z3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList4.get(i15);
                            i15++;
                            fj fjVar = new fj(i14, message, false, true);
                            fjVar.K5(isVar.f36188h0, true);
                            arrayList3.add(fjVar);
                        }
                        isVar.f36185e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        isVar.f36186f0 = messages_messages.next_rate;
                    }
                    isVar.O(true);
                    return;
                }
                return;
            case 4:
                ks ksVar = (ks) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f8622e;
                TLObject tLObject4 = (TLObject) this.f8623f;
                ArrayList arrayList5 = ksVar.S;
                int i16 = ksVar.Q;
                if (this.f8621c == ksVar.f36870d0 && TextUtils.equals(tL_messages_searchGlobal2.f28516q, ksVar.f36871e0)) {
                    ksVar.Z = false;
                    if (!this.f8620b) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        tr.a0(i16).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        mp.u1(i16).f4(messages_messages2.users, false);
                        mp.u1(i16).Z3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i17);
                            i17++;
                            fj fjVar2 = new fj(i16, message2, false, true);
                            fjVar2.K5(ksVar.f36871e0, true);
                            arrayList5.add(fjVar2);
                        }
                        ksVar.f36868b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        ksVar.f36869c0 = messages_messages2.next_rate;
                    }
                    ksVar.O(true);
                    return;
                }
                return;
            case 5:
                p4.m0 m0Var = (p4.m0) this.d;
                q4.r rVar = (q4.r) this.f8622e;
                p4.l0 l0Var = (p4.l0) this.f8623f;
                p4.d0 d0Var = m0Var.h;
                if (!d0Var.j()) {
                    boolean isActive = ((q4.l) m0Var.f55332n.f55826b).f55808a.isActive();
                    int i18 = this.f8621c;
                    if (!isActive) {
                        StringBuilder m10 = i5.c.m(i18, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.f55828a.f55830b);
                        h2.a.l("MediaSessionLegacyStub", m10.toString());
                        return;
                    }
                    p4.v m0 = m0Var.m0(rVar);
                    if (!m0Var.f55326g.C(m0, i18)) {
                        if (i18 == 1 && !d0Var.f55195t.u()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    w7.s sVar = d0Var.f55181e;
                    d0Var.s(m0);
                    sVar.getClass();
                    try {
                        l0Var.f(m0);
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                    }
                    if (this.f8620b) {
                        new SparseBooleanArray().append(i18, true);
                        d0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.i0 i0Var = (sg.i0) this.d;
                sg.j0 j0Var = (sg.j0) this.f8622e;
                Runnable runnable = (Runnable) this.f8623f;
                boolean z13 = this.f8620b;
                if (z13) {
                    rectF = i0Var.h;
                } else {
                    rectF = null;
                }
                i0Var.d(j0Var, this.f8621c, rectF);
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

    public ca(zy zyVar, TLObject tLObject, ly lyVar, boolean z10, int i7) {
        this.f8619a = 2;
        this.d = zyVar;
        this.f8622e = tLObject;
        this.f8623f = lyVar;
        this.f8620b = z10;
        this.f8621c = i7;
    }

    public ca(z41 z41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.f8619a = i10;
        this.d = z41Var;
        this.f8621c = i7;
        this.f8622e = tL_messages_searchGlobal;
        this.f8620b = z10;
        this.f8623f = tLObject;
    }

    public ca(p4.m0 m0Var, int i7, q4.r rVar, p4.l0 l0Var, boolean z10) {
        this.f8619a = 5;
        this.d = m0Var;
        this.f8621c = i7;
        this.f8622e = rVar;
        this.f8623f = l0Var;
        this.f8620b = z10;
    }

    public ca(sg.i0 i0Var, sg.j0 j0Var, int i7, boolean z10, Runnable runnable) {
        this.f8619a = 6;
        this.d = i0Var;
        this.f8622e = j0Var;
        this.f8621c = i7;
        this.f8620b = z10;
        this.f8623f = runnable;
    }

    public ca(boolean z10, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f8619a = 0;
        this.f8620b = z10;
        this.f8621c = i7;
        this.d = str;
        this.f8622e = imageReceiver;
        this.f8623f = zArr;
    }
}
