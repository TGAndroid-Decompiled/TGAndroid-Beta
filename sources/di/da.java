package di;

import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.kz;
import org.telegram.messenger.ly;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.js;
public final class da implements Runnable {
    public final int f8660a;
    public final boolean f8661b;
    public final int f8662c;
    public final Object d;
    public final Object f8663e;
    public final Object f8664f;

    public da(mp mpVar, TLRPC.Chat chat, boolean z10, int i7, q0.a aVar) {
        this.f8660a = 1;
        this.d = mpVar;
        this.f8663e = chat;
        this.f8661b = z10;
        this.f8662c = i7;
        this.f8664f = aVar;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        RectF rectF;
        switch (this.f8660a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.f8663e;
                boolean[] zArr = (boolean[]) this.f8664f;
                boolean z10 = this.f8661b;
                int i7 = this.f8662c;
                if (z10) {
                    str = i10.i(i7).f24645d0;
                    if (str == null) {
                        ri.d0(i7).E();
                        return;
                    }
                } else {
                    str = i10.i(i7).f24644c0;
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
                                    if (document == null || document.f28498id != longValue) {
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
                    imageReceiver.f22764v0 = true;
                    imageReceiver.f22737h1 = new d6.i(zArr, 15);
                    kz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29394a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 160, true, null, true);
                    imageReceiver.X(0);
                    imageReceiver.s0(org.telegram.messenger.fc.b(document), "160_160_nr", org.telegram.messenger.fc.c(w10, document), "160_160", f10, document.size, "tgs", tL_messages_stickerSet, 1);
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
                TLRPC.Chat chat = (TLRPC.Chat) this.f8663e;
                final q0.a aVar = (q0.a) this.f8664f;
                LongSparseIntArray longSparseIntArray = mpVar.C0;
                a0.h hVar = mpVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.f28492id);
                a0.h hVar2 = mpVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.f28492id);
                boolean z12 = this.f8661b;
                int i12 = this.f8662c;
                if (z12) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i12));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.f28492id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i12));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.f28492id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, chat.f28492id);
                }
                if (!arrayList.contains(Integer.valueOf(i12))) {
                    arrayList.add(Integer.valueOf(i12));
                }
                if (mpVar.A0.indexOfKey(chat.f28492id) < 0) {
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
                    mpVar.L0(chat.f28492id, 3, 0L, null);
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
                        hVar2.k(arrayList2, chat.f28492id);
                    }
                    if (!arrayList2.contains(Integer.valueOf(i12))) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f28492id) < 0) {
                        longSparseIntArray.put(chat.f28492id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zy zyVar = (zy) this.d;
                TLObject tLObject = (TLObject) this.f8663e;
                ly lyVar = (ly) this.f8664f;
                zyVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = lyVar.f25581j;
                    tL_inputMediaUploadedPhoto.spoiler = this.f8661b;
                    int i13 = this.f8662c;
                    if (i13 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i13;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.f28504id = document2.f28498id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = lyVar.f25576c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    zyVar.N(tLObject2, lyVar.f25584m, lyVar.f25578f, lyVar, lyVar.K, null, lyVar.H);
                    return;
                }
                lyVar.c();
                return;
            case 3:
                hs hsVar = (hs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f8663e;
                TLObject tLObject3 = (TLObject) this.f8664f;
                ArrayList arrayList3 = hsVar.W;
                int i14 = hsVar.Q;
                if (this.f8662c == hsVar.f35808g0 && TextUtils.equals(tL_messages_searchGlobal.f28605q, hsVar.f35809h0)) {
                    hsVar.f35804c0 = false;
                    if (!this.f8661b) {
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
                            fjVar.K5(hsVar.f35809h0, true);
                            arrayList3.add(fjVar);
                        }
                        hsVar.f35806e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        hsVar.f35807f0 = messages_messages.next_rate;
                    }
                    hsVar.O(true);
                    return;
                }
                return;
            case 4:
                js jsVar = (js) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f8663e;
                TLObject tLObject4 = (TLObject) this.f8664f;
                ArrayList arrayList5 = jsVar.S;
                int i16 = jsVar.Q;
                if (this.f8662c == jsVar.f36506d0 && TextUtils.equals(tL_messages_searchGlobal2.f28605q, jsVar.f36507e0)) {
                    jsVar.Z = false;
                    if (!this.f8661b) {
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
                            fjVar2.K5(jsVar.f36507e0, true);
                            arrayList5.add(fjVar2);
                        }
                        jsVar.f36504b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        jsVar.f36505c0 = messages_messages2.next_rate;
                    }
                    jsVar.O(true);
                    return;
                }
                return;
            case 5:
                p4.n0 n0Var = (p4.n0) this.d;
                q4.r rVar = (q4.r) this.f8663e;
                p4.m0 m0Var = (p4.m0) this.f8664f;
                p4.d0 d0Var = n0Var.h;
                if (!d0Var.j()) {
                    boolean isActive = ((q4.l) n0Var.f55487n.f55949b).f55931a.isActive();
                    int i18 = this.f8662c;
                    if (!isActive) {
                        StringBuilder m10 = i5.c.m(i18, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.f55951a.f55953b);
                        h2.a.l("MediaSessionLegacyStub", m10.toString());
                        return;
                    }
                    p4.v m0 = n0Var.m0(rVar);
                    if (!n0Var.f55481g.D(m0, i18)) {
                        if (i18 == 1 && !d0Var.f55324t.v()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    w7.s sVar = d0Var.f55310e;
                    d0Var.s(m0);
                    sVar.getClass();
                    try {
                        m0Var.f(m0);
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                    }
                    if (this.f8661b) {
                        new SparseBooleanArray().append(i18, true);
                        d0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.h0 h0Var = (sg.h0) this.d;
                sg.i0 i0Var = (sg.i0) this.f8663e;
                Runnable runnable = (Runnable) this.f8664f;
                boolean z13 = this.f8661b;
                if (z13) {
                    rectF = h0Var.h;
                } else {
                    rectF = null;
                }
                h0Var.d(i0Var, this.f8662c, rectF);
                if (z13) {
                    h0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public da(zy zyVar, TLObject tLObject, ly lyVar, boolean z10, int i7) {
        this.f8660a = 2;
        this.d = zyVar;
        this.f8663e = tLObject;
        this.f8664f = lyVar;
        this.f8661b = z10;
        this.f8662c = i7;
    }

    public da(b51 b51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.f8660a = i10;
        this.d = b51Var;
        this.f8662c = i7;
        this.f8663e = tL_messages_searchGlobal;
        this.f8661b = z10;
        this.f8664f = tLObject;
    }

    public da(p4.n0 n0Var, int i7, q4.r rVar, p4.m0 m0Var, boolean z10) {
        this.f8660a = 5;
        this.d = n0Var;
        this.f8662c = i7;
        this.f8663e = rVar;
        this.f8664f = m0Var;
        this.f8661b = z10;
    }

    public da(sg.h0 h0Var, sg.i0 i0Var, int i7, boolean z10, Runnable runnable) {
        this.f8660a = 6;
        this.d = h0Var;
        this.f8663e = i0Var;
        this.f8662c = i7;
        this.f8661b = z10;
        this.f8664f = runnable;
    }

    public da(boolean z10, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f8660a = 0;
        this.f8661b = z10;
        this.f8662c = i7;
        this.d = str;
        this.f8663e = imageReceiver;
        this.f8664f = zArr;
    }
}
