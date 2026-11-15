package di;

import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.pz;
import org.telegram.messenger.qy;
import org.telegram.messenger.si;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.p41;
public final class z9 implements Runnable {
    public final int f9846a;
    public final boolean f9847b;
    public final int f9848c;
    public final Object d;
    public final Object f9849e;
    public final Object f9850f;

    public z9(np npVar, TLRPC.Chat chat, boolean z10, int i7, q0.a aVar) {
        this.f9846a = 1;
        this.d = npVar;
        this.f9849e = chat;
        this.f9847b = z10;
        this.f9848c = i7;
        this.f9850f = aVar;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f9846a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f9849e;
                boolean[] zArr = (boolean[]) this.f9850f;
                boolean z10 = this.f9847b;
                int i7 = this.f9848c;
                if (z10) {
                    str = m10.i(i7).f24948d0;
                    if (str == null) {
                        si.b0(i7).C();
                        return;
                    }
                } else {
                    str = m10.i(i7).f24947c0;
                    if (str == null) {
                        si.b0(i7).z();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = si.b0(i7).p0(str);
                if (p02 == null) {
                    p02 = si.b0(i7).n0(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                if (tL_messages_stickerSet != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                    document = tL_messages_stickerSet.documents.get(i11);
                                    if (document == null || document.f28057id != longValue) {
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
                    imageReceiver.f22303v0 = true;
                    imageReceiver.f22276h1 = new cb.c(zArr, 18);
                    pz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f28792a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.gc.b(document), "160_160_nr", org.telegram.messenger.gc.c(w10, document), "160_160", f10, document.size, "tgs", tL_messages_stickerSet, 1);
                    return;
                }
                si b02 = si.b0(i7);
                if (tL_messages_stickerSet != null) {
                    z11 = false;
                }
                b02.c1(str, false, z11);
                return;
            case 1:
                np npVar = (np) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f9849e;
                final q0.a aVar = (q0.a) this.f9850f;
                LongSparseIntArray longSparseIntArray = npVar.C0;
                a0.h hVar = npVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.f28051id);
                a0.h hVar2 = npVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.f28051id);
                boolean z12 = this.f9847b;
                int i12 = this.f9848c;
                if (z12) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i12));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.f28051id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i12));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.f28051id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, chat.f28051id);
                }
                if (!arrayList.contains(Integer.valueOf(i12))) {
                    arrayList.add(Integer.valueOf(i12));
                }
                if (npVar.A0.indexOfKey(chat.f28051id) < 0) {
                    if (aVar != null) {
                        org.telegram.messenger.g0.h3(new Runnable() {
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
                    npVar.J0(chat.f28051id, 3, 0L, null);
                } else if (aVar != null) {
                    org.telegram.messenger.g0.h3(new Runnable() {
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
                        hVar2.k(arrayList2, chat.f28051id);
                    }
                    if (!arrayList2.contains(Integer.valueOf(i12))) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f28051id) < 0) {
                        longSparseIntArray.put(chat.f28051id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ez ezVar = (ez) this.d;
                TLObject tLObject = (TLObject) this.f9849e;
                qy qyVar = (qy) this.f9850f;
                ezVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = qyVar.f26162j;
                    tL_inputMediaUploadedPhoto.spoiler = this.f9847b;
                    int i13 = this.f9848c;
                    if (i13 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i13;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.f28063id = document2.f28057id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = qyVar.f26157c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    ezVar.N(tLObject2, qyVar.f26165m, qyVar.f26159f, qyVar, qyVar.K, null, qyVar.H);
                    return;
                }
                qyVar.c();
                return;
            case 3:
                bs bsVar = (bs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f9849e;
                TLObject tLObject3 = (TLObject) this.f9850f;
                ArrayList arrayList3 = bsVar.W;
                int i14 = bsVar.Q;
                if (this.f9848c == bsVar.f33364g0 && TextUtils.equals(tL_messages_searchGlobal.f28164q, bsVar.f33365h0)) {
                    bsVar.f33360c0 = false;
                    if (!this.f9847b) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        vr.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                        np.s1(i14).Y3(messages_messages.users, false);
                        np.s1(i14).S3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList4.get(i15);
                            i15++;
                            gj gjVar = new gj(i14, message, false, true);
                            gjVar.K5(bsVar.f33365h0, true);
                            arrayList3.add(gjVar);
                        }
                        bsVar.f33362e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        bsVar.f33363f0 = messages_messages.next_rate;
                    }
                    bsVar.O(true);
                    return;
                }
                return;
            case 4:
                ds dsVar = (ds) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f9849e;
                TLObject tLObject4 = (TLObject) this.f9850f;
                ArrayList arrayList5 = dsVar.S;
                int i16 = dsVar.Q;
                if (this.f9848c == dsVar.f34046d0 && TextUtils.equals(tL_messages_searchGlobal2.f28164q, dsVar.f34047e0)) {
                    dsVar.Z = false;
                    if (!this.f9847b) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        vr.a0(i16).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        np.s1(i16).Y3(messages_messages2.users, false);
                        np.s1(i16).S3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i17);
                            i17++;
                            gj gjVar2 = new gj(i16, message2, false, true);
                            gjVar2.K5(dsVar.f34047e0, true);
                            arrayList5.add(gjVar2);
                        }
                        dsVar.f34044b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        dsVar.f34045c0 = messages_messages2.next_rate;
                    }
                    dsVar.O(true);
                    return;
                }
                return;
            case 5:
                p4.m0 m0Var = (p4.m0) this.d;
                q4.r rVar = (q4.r) this.f9849e;
                p4.l0 l0Var = (p4.l0) this.f9850f;
                p4.d0 d0Var = m0Var.h;
                if (!d0Var.j()) {
                    boolean isActive = ((q4.l) m0Var.f54787n.f55252b).f55234a.isActive();
                    int i18 = this.f9848c;
                    if (!isActive) {
                        StringBuilder m10 = i5.c.m(i18, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.f55254a.f55256b);
                        h2.a.l("MediaSessionLegacyStub", m10.toString());
                        return;
                    }
                    p4.v m0 = m0Var.m0(rVar);
                    if (!m0Var.f54781g.z(m0, i18)) {
                        if (i18 == 1 && !d0Var.f54635t.u()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    w7.s sVar = d0Var.f54621e;
                    d0Var.s(m0);
                    sVar.getClass();
                    try {
                        l0Var.f(m0);
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                    }
                    if (this.f9847b) {
                        new SparseBooleanArray().append(i18, true);
                        d0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.i0 i0Var = (sg.i0) this.d;
                sg.j0 j0Var = (sg.j0) this.f9849e;
                Runnable runnable = (Runnable) this.f9850f;
                boolean z13 = this.f9847b;
                if (z13) {
                    rectF = i0Var.h;
                } else {
                    rectF = null;
                }
                i0Var.d(j0Var, this.f9848c, rectF);
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

    public z9(ez ezVar, TLObject tLObject, qy qyVar, boolean z10, int i7) {
        this.f9846a = 2;
        this.d = ezVar;
        this.f9849e = tLObject;
        this.f9850f = qyVar;
        this.f9847b = z10;
        this.f9848c = i7;
    }

    public z9(p41 p41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.f9846a = i10;
        this.d = p41Var;
        this.f9848c = i7;
        this.f9849e = tL_messages_searchGlobal;
        this.f9847b = z10;
        this.f9850f = tLObject;
    }

    public z9(p4.m0 m0Var, int i7, q4.r rVar, p4.l0 l0Var, boolean z10) {
        this.f9846a = 5;
        this.d = m0Var;
        this.f9848c = i7;
        this.f9849e = rVar;
        this.f9850f = l0Var;
        this.f9847b = z10;
    }

    public z9(sg.i0 i0Var, sg.j0 j0Var, int i7, boolean z10, Runnable runnable) {
        this.f9846a = 6;
        this.d = i0Var;
        this.f9849e = j0Var;
        this.f9848c = i7;
        this.f9847b = z10;
        this.f9850f = runnable;
    }

    public z9(boolean z10, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f9846a = 0;
        this.f9847b = z10;
        this.f9848c = i7;
        this.d = str;
        this.f9849e = imageReceiver;
        this.f9850f = zArr;
    }
}
