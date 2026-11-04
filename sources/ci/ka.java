package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.Window;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.jz;
import org.telegram.messenger.ky;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.pt;
import org.telegram.ui.rt;
public final class ka implements Runnable {
    public final int f5407a;
    public final int f5408b;
    public final boolean f5409c;
    public final Object d;
    public final Object f5410e;
    public final Object f5411f;

    public ka(Object obj, Object obj2, int i3, boolean z10, Object obj3, int i10) {
        this.f5407a = i10;
        this.d = obj;
        this.f5410e = obj2;
        this.f5408b = i3;
        this.f5409c = z10;
        this.f5411f = obj3;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        Activity activity;
        Window window;
        ch0 ch0Var;
        float f10;
        RectF rectF;
        int i3 = this.f5407a;
        boolean z10 = true;
        Object obj = this.f5411f;
        boolean z11 = this.f5409c;
        int i10 = this.f5408b;
        Object obj2 = this.f5410e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z11) {
                    str = h10.i(i10).f22837d0;
                    if (str == null) {
                        li.b0(i10).C();
                        return;
                    }
                } else {
                    str = h10.i(i10).f22836c0;
                    if (str == null) {
                        li.b0(i10).z();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = li.b0(i10).p0(str);
                if (p02 == null) {
                    p02 = li.b0(i10).n0(str);
                }
                if (p02 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < p02.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = p02.packs.get(i11);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i12 = 0; i12 < p02.documents.size(); i12++) {
                                    document = p02.documents.get(i12);
                                    if (document == null || document.f27007id != longValue) {
                                    }
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    document = null;
                    if (document == null && !p02.documents.isEmpty()) {
                        document = p02.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.f21274v0 = true;
                    imageReceiver.f21247h1 = new bb.c(zArr, 10);
                    jz f11 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27824a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.ac.b(document), "160_160_nr", org.telegram.messenger.ac.c(w10, document), "160_160", f11, document.size, "tgs", p02, 1);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                li b02 = li.b0(i10);
                if (tL_messages_stickerSet != null) {
                    z10 = false;
                }
                b02.c1(str, false, z10);
                return;
            case 1:
                o4.o0 o0Var = (o4.o0) obj3;
                p4.r rVar = (p4.r) obj2;
                o4.n0 n0Var = (o4.n0) obj;
                o4.e0 e0Var = o0Var.h;
                if (!e0Var.j()) {
                    if (!((p4.l) o0Var.f20779n.f53181a).f53164a.isActive()) {
                        StringBuilder m10 = k2.p1.m(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.f53183a.f53185b);
                        g2.a.l("MediaSessionLegacyStub", m10.toString());
                        return;
                    }
                    o4.v m0 = o0Var.m0(rVar);
                    if (!o0Var.f20773g.w(m0, i10)) {
                        if (i10 == 1 && !e0Var.f20636t.u()) {
                            g2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    kb.a aVar = e0Var.f20622e;
                    e0Var.s(m0);
                    aVar.getClass();
                    try {
                        n0Var.c(m0);
                    } catch (RemoteException e10) {
                        g2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                    }
                    if (z11) {
                        new SparseBooleanArray().append(i10, true);
                        e0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                hp hpVar = (hp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar2 = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = hpVar.C0;
                a0.h hVar = hpVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.f27001id);
                a0.h hVar2 = hpVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.f27001id);
                if (z11) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i10));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.f27001id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i10));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.f27001id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, chat.f27001id);
                }
                if (!arrayList.contains(Integer.valueOf(i10))) {
                    arrayList.add(Integer.valueOf(i10));
                }
                if (hpVar.A0.indexOfKey(chat.f27001id) < 0) {
                    if (aVar2 != null) {
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aVar2.accept(Boolean.TRUE);
                                        return;
                                    default:
                                        aVar2.accept(Boolean.FALSE);
                                        return;
                                }
                            }
                        });
                    }
                    hpVar.J0(chat.f27001id, 3, 0L, null);
                } else if (aVar2 != null) {
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    aVar2.accept(Boolean.TRUE);
                                    return;
                                default:
                                    aVar2.accept(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                }
                if (chat.megagroup && !chat.monoforum) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hVar2.k(arrayList2, chat.f27001id);
                    }
                    if (!arrayList2.contains(Integer.valueOf(i10))) {
                        arrayList2.add(Integer.valueOf(i10));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f27001id) < 0) {
                        longSparseIntArray.put(chat.f27001id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                yy yyVar = (yy) obj3;
                TLObject tLObject = (TLObject) obj2;
                ky kyVar = (ky) obj;
                yyVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = kyVar.f23898j;
                    tL_inputMediaUploadedPhoto.spoiler = z11;
                    if (i10 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i10;
                        tL_inputMediaUploadedPhoto.flags = 2 | tL_inputMediaUploadedPhoto.flags;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.f27013id = document2.f27007id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = kyVar.f23893c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    yyVar.N(tLObject2, kyVar.f23901m, kyVar.f23895f, kyVar, kyVar.K, null, kyVar.H);
                    return;
                }
                kyVar.c();
                return;
            case 4:
                vr vrVar = (vr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = vrVar.W;
                int i13 = vrVar.Q;
                if (i10 == vrVar.f39775g0 && TextUtils.equals(tL_messages_searchGlobal.f27114q, vrVar.f39776h0)) {
                    vrVar.f39771c0 = false;
                    if (!z11) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        qr.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                        hp.s1(i13).Y3(messages_messages.users, false);
                        hp.s1(i13).S3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Message message = arrayList4.get(i14);
                            i14++;
                            zi ziVar = new zi(i13, message, false, true);
                            ziVar.L5(vrVar.f39776h0, true);
                            arrayList3.add(ziVar);
                        }
                        vrVar.f39773e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        vrVar.f39774f0 = messages_messages.next_rate;
                    }
                    vrVar.O(true);
                    return;
                }
                return;
            case 5:
                xr xrVar = (xr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = xrVar.S;
                int i15 = xrVar.Q;
                if (i10 == xrVar.f40467d0 && TextUtils.equals(tL_messages_searchGlobal2.f27114q, xrVar.f40468e0)) {
                    xrVar.Z = false;
                    if (!z11) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        qr.a0(i15).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        hp.s1(i15).Y3(messages_messages2.users, false);
                        hp.s1(i15).S3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i16);
                            i16++;
                            zi ziVar2 = new zi(i15, message2, false, true);
                            ziVar2.L5(xrVar.f40468e0, true);
                            arrayList5.add(ziVar2);
                        }
                        xrVar.f40465b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        xrVar.f40466c0 = messages_messages2.next_rate;
                    }
                    xrVar.O(true);
                    return;
                }
                return;
            case 6:
                vd vdVar = (vd) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                rt rtVar = (rt) vdVar.d;
                rtVar.a();
                org.telegram.ui.Cells.l8 l8Var = rtVar.f49276e;
                rtVar.c();
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false);
                ch0 ch0Var2 = rtVar.d;
                ch0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                if (window != null) {
                    ValueAnimator valueAnimator = rtVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        rtVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = rtVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i10 = rtVar.f49278n;
                    }
                    int i17 = i10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rtVar.h = ofFloat;
                    if (z11) {
                        f10 = 50.0f;
                    } else {
                        f10 = 200.0f;
                    }
                    float f12 = f10;
                    ch0Var = ch0Var2;
                    ofFloat.addUpdateListener(new pt(vdVar, f12, i17, x03, activity));
                    rtVar.h.addListener(new org.telegram.ui.s0(activity, x03, 1));
                    rtVar.h.setDuration(350L);
                    rtVar.h.start();
                } else {
                    ch0Var = ch0Var2;
                }
                if (org.telegram.ui.ActionBar.k6.k1()) {
                    l8Var.p(bd.M0(2131745476, null), ch0Var, true);
                    l8Var.f29601x += 2;
                } else {
                    l8Var.p(bd.M0(2131745477, null), ch0Var, true);
                    l8Var.f29601x += 2;
                }
                org.telegram.ui.ActionBar.k6.M1(d2Var);
                return;
            default:
                tg.i0 i0Var = (tg.i0) obj3;
                tg.j0 j0Var = (tg.j0) obj2;
                Runnable runnable = (Runnable) obj;
                if (z11) {
                    rectF = i0Var.h;
                } else {
                    rectF = null;
                }
                i0Var.d(j0Var, i10, rectF);
                if (z11) {
                    i0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public ka(o4.o0 o0Var, int i3, p4.r rVar, o4.n0 n0Var, boolean z10) {
        this.f5407a = 1;
        this.d = o0Var;
        this.f5408b = i3;
        this.f5410e = rVar;
        this.f5411f = n0Var;
        this.f5409c = z10;
    }

    public ka(hp hpVar, TLRPC.Chat chat, boolean z10, int i3, q0.a aVar) {
        this.f5407a = 2;
        this.d = hpVar;
        this.f5410e = chat;
        this.f5409c = z10;
        this.f5408b = i3;
        this.f5411f = aVar;
    }

    public ka(yy yyVar, TLObject tLObject, ky kyVar, boolean z10, int i3) {
        this.f5407a = 3;
        this.d = yyVar;
        this.f5410e = tLObject;
        this.f5411f = kyVar;
        this.f5409c = z10;
        this.f5408b = i3;
    }

    public ka(f41 f41Var, int i3, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.f5407a = i10;
        this.d = f41Var;
        this.f5408b = i3;
        this.f5410e = tL_messages_searchGlobal;
        this.f5409c = z10;
        this.f5411f = tLObject;
    }

    public ka(boolean z10, int i3, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f5407a = 0;
        this.f5409c = z10;
        this.f5408b = i3;
        this.d = str;
        this.f5410e = imageReceiver;
        this.f5411f = zArr;
    }
}
