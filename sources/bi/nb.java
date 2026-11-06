package bi;

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
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.rz;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.sy;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.rt;
import org.telegram.ui.tt;
public final class nb implements Runnable {
    public final int f4429a;
    public final boolean f4430b;
    public final int f4431c;
    public final Object d;
    public final Object f4432e;
    public final Object f4433f;

    public nb(Object obj, Object obj2, int i7, boolean z9, Object obj3, int i10) {
        this.f4429a = i10;
        this.d = obj;
        this.f4432e = obj2;
        this.f4431c = i7;
        this.f4430b = z9;
        this.f4433f = obj3;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        Activity activity;
        Window window;
        float f10;
        RectF rectF;
        int i7 = this.f4429a;
        boolean z9 = true;
        Object obj = this.f4433f;
        boolean z10 = this.f4430b;
        int i10 = this.f4431c;
        Object obj2 = this.f4432e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z10) {
                    str = p10.i(i10).f24474c0;
                    if (str == null) {
                        ui.b0(i10).C();
                        return;
                    }
                } else {
                    str = p10.i(i10).f24472b0;
                    if (str == null) {
                        ui.b0(i10).z();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = ui.b0(i10).p0(str);
                if (p02 == null) {
                    p02 = ui.b0(i10).n0(str);
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
                                    if (document == null || document.f26959id != longValue) {
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
                    imageReceiver.f21219u0 = true;
                    imageReceiver.f21192g1 = new aa.n(zArr, 7);
                    rz f11 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27793a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.hc.b(document), "160_160_nr", org.telegram.messenger.hc.c(w10, document), "160_160", f11, document.size, "tgs", p02, 1);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                ui b02 = ui.b0(i10);
                if (tL_messages_stickerSet != null) {
                    z9 = false;
                }
                b02.c1(str, false, z9);
                return;
            case 1:
                qp qpVar = (qp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = qpVar.B0;
                a0.h hVar = qpVar.A0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.f26953id);
                a0.h hVar2 = qpVar.C0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.f26953id);
                if (z10) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i10));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.f26953id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i10));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.f26953id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, chat.f26953id);
                }
                if (!arrayList.contains(Integer.valueOf(i10))) {
                    arrayList.add(Integer.valueOf(i10));
                }
                if (qpVar.f24947z0.indexOfKey(chat.f26953id) < 0) {
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
                    qpVar.J0(chat.f26953id, 3, 0L, null);
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
                        hVar2.k(arrayList2, chat.f26953id);
                    }
                    if (!arrayList2.contains(Integer.valueOf(i10))) {
                        arrayList2.add(Integer.valueOf(i10));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f26953id) < 0) {
                        longSparseIntArray.put(chat.f26953id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                gz gzVar = (gz) obj3;
                TLObject tLObject = (TLObject) obj2;
                sy syVar = (sy) obj;
                gzVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = syVar.f25542j;
                    tL_inputMediaUploadedPhoto.spoiler = z10;
                    if (i10 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i10;
                        tL_inputMediaUploadedPhoto.flags = 2 | tL_inputMediaUploadedPhoto.flags;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.f26965id = document2.f26959id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = syVar.f25537c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    gzVar.N(tLObject2, syVar.f25545m, syVar.f25539f, syVar, syVar.K, null, syVar.H);
                    return;
                }
                syVar.c();
                return;
            case 3:
                vr vrVar = (vr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = vrVar.V;
                int i13 = vrVar.P;
                if (i10 == vrVar.f39675f0 && TextUtils.equals(tL_messages_searchGlobal.f27066q, vrVar.f39676g0)) {
                    vrVar.f39671b0 = false;
                    if (!z10) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        yr.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                        qp.s1(i13).Y3(messages_messages.users, false);
                        qp.s1(i13).S3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Message message = arrayList4.get(i14);
                            i14++;
                            ij ijVar = new ij(i13, message, false, true);
                            ijVar.L5(vrVar.f39676g0, true);
                            arrayList3.add(ijVar);
                        }
                        vrVar.f39673d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        vrVar.f39674e0 = messages_messages.next_rate;
                    }
                    vrVar.O(true);
                    return;
                }
                return;
            case 4:
                xr xrVar = (xr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = xrVar.R;
                int i15 = xrVar.P;
                if (i10 == xrVar.f40359c0 && TextUtils.equals(tL_messages_searchGlobal2.f27066q, xrVar.f40360d0)) {
                    xrVar.Y = false;
                    if (!z10) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        yr.a0(i15).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        qp.s1(i15).Y3(messages_messages2.users, false);
                        qp.s1(i15).S3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i16);
                            i16++;
                            ij ijVar2 = new ij(i15, message2, false, true);
                            ijVar2.L5(xrVar.f40360d0, true);
                            arrayList5.add(ijVar2);
                        }
                        xrVar.f40357a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        xrVar.f40358b0 = messages_messages2.next_rate;
                    }
                    xrVar.O(true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.xd xdVar = (org.telegram.ui.Components.xd) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                tt ttVar = (tt) xdVar.d;
                ttVar.a();
                org.telegram.ui.Cells.m8 m8Var = ttVar.f50140e;
                ttVar.c();
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28089q6, false);
                zg0 zg0Var = ttVar.d;
                zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27793a7, false);
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
                    ValueAnimator valueAnimator = ttVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        ttVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = ttVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i10 = ttVar.f50142n;
                    }
                    int i17 = i10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ttVar.h = ofFloat;
                    if (z10) {
                        f10 = 50.0f;
                    } else {
                        f10 = 200.0f;
                    }
                    ofFloat.addUpdateListener(new rt(xdVar, f10, i17, x03, activity));
                    ttVar.h.addListener(new org.telegram.ui.r0(activity, x03, 1));
                    ttVar.h.setDuration(350L);
                    ttVar.h.start();
                }
                if (org.telegram.ui.ActionBar.k6.k1()) {
                    m8Var.p(org.telegram.messenger.hd.M0(2131745467, null), zg0Var, true);
                    m8Var.f29573x += 2;
                } else {
                    m8Var.p(org.telegram.messenger.hd.M0(2131745468, null), zg0Var, true);
                    m8Var.f29573x += 2;
                }
                org.telegram.ui.ActionBar.k6.M1(f2Var);
                return;
            case 6:
                p4.m0 m0Var = (p4.m0) obj3;
                q4.r rVar = (q4.r) obj2;
                p4.l0 l0Var = (p4.l0) obj;
                p4.d0 d0Var = m0Var.h;
                if (!d0Var.j()) {
                    if (!((q4.l) m0Var.f53276n.f53710b).f53692a.isActive()) {
                        StringBuilder n10 = jg.g.n(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        n10.append(rVar.f53712a.f53714b);
                        h2.a.l("MediaSessionLegacyStub", n10.toString());
                        return;
                    }
                    p4.v m0 = m0Var.m0(rVar);
                    if (!m0Var.f53270g.G(m0, i10)) {
                        if (i10 == 1 && !d0Var.f53124t.u()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    pb.b bVar = d0Var.f53110e;
                    d0Var.s(m0);
                    bVar.getClass();
                    try {
                        l0Var.f(m0);
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                    }
                    if (z10) {
                        new SparseBooleanArray().append(i10, true);
                        d0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.j0 j0Var = (sg.j0) obj3;
                sg.k0 k0Var = (sg.k0) obj2;
                Runnable runnable = (Runnable) obj;
                if (z10) {
                    rectF = j0Var.h;
                } else {
                    rectF = null;
                }
                j0Var.d(k0Var, i10, rectF);
                if (z10) {
                    j0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public nb(qp qpVar, TLRPC.Chat chat, boolean z9, int i7, q0.a aVar) {
        this.f4429a = 1;
        this.d = qpVar;
        this.f4432e = chat;
        this.f4430b = z9;
        this.f4431c = i7;
        this.f4433f = aVar;
    }

    public nb(gz gzVar, TLObject tLObject, sy syVar, boolean z9, int i7) {
        this.f4429a = 2;
        this.d = gzVar;
        this.f4432e = tLObject;
        this.f4433f = syVar;
        this.f4430b = z9;
        this.f4431c = i7;
    }

    public nb(l41 l41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, TLObject tLObject, int i10) {
        this.f4429a = i10;
        this.d = l41Var;
        this.f4431c = i7;
        this.f4432e = tL_messages_searchGlobal;
        this.f4430b = z9;
        this.f4433f = tLObject;
    }

    public nb(p4.m0 m0Var, int i7, q4.r rVar, p4.l0 l0Var, boolean z9) {
        this.f4429a = 6;
        this.d = m0Var;
        this.f4431c = i7;
        this.f4432e = rVar;
        this.f4433f = l0Var;
        this.f4430b = z9;
    }

    public nb(boolean z9, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f4429a = 0;
        this.f4430b = z9;
        this.f4431c = i7;
        this.d = str;
        this.f4432e = imageReceiver;
        this.f4433f = zArr;
    }
}
