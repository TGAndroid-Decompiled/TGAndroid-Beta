package ig;

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
import org.telegram.messenger.b8;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sd;
import org.telegram.ui.tu;
import org.telegram.ui.vu;
public final class o0 implements Runnable {
    public final int f8377a;
    public final int f8378b;
    public final boolean f8379c;
    public final Object d;
    public final Object e;
    public final Object f8380f;

    public o0(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.f8377a = i11;
        this.d = obj;
        this.e = obj2;
        this.f8378b = i10;
        this.f8379c = z10;
        this.f8380f = obj3;
    }

    @Override
    public final void run() {
        RectF rectF;
        a0.h hVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Activity activity;
        Window window;
        float f7;
        String str;
        TLRPC.Document document;
        int i10 = this.f8377a;
        boolean z10 = true;
        Object obj = this.f8380f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i11 = this.f8378b;
        boolean z11 = this.f8379c;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) obj3;
                r0 r0Var = (r0) obj2;
                Runnable runnable = (Runnable) obj;
                if (z11) {
                    rectF = q0Var.h;
                } else {
                    rectF = null;
                }
                q0Var.d(r0Var, i11, rectF);
                if (z11) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                m4.p0 p0Var = (m4.p0) obj3;
                n4.r rVar = (n4.r) obj2;
                m4.o0 o0Var = (m4.o0) obj;
                m4.f0 f0Var = p0Var.h;
                if (!f0Var.j()) {
                    if (!((n4.l) p0Var.f12883n.f13526a).f13510a.isActive()) {
                        StringBuilder l4 = i0.a.l(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(rVar.f13528a.f13530b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    m4.w m0 = p0Var.m0(rVar);
                    if (!p0Var.f12877g.M(m0, i11)) {
                        if (i11 == 1 && !f0Var.f12754t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    oa.d dVar = f0Var.e;
                    f0Var.s(m0);
                    dVar.getClass();
                    try {
                        o0Var.b(m0);
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e);
                    }
                    if (z11) {
                        new SparseBooleanArray().append(i11, true);
                        f0Var.p(m0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vp vpVar = (vp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = vpVar.B0;
                a0.h hVar2 = vpVar.A0;
                ArrayList arrayList3 = (ArrayList) hVar2.f(chat.f19793id);
                a0.h hVar3 = vpVar.C0;
                ArrayList arrayList4 = (ArrayList) hVar3.f(chat.f19793id);
                if (z11) {
                    if (arrayList3 != null) {
                        arrayList3.remove(Integer.valueOf(i11));
                    }
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        hVar2.e(chat.f19793id);
                    }
                    if (chat.megagroup) {
                        if (arrayList4 != null) {
                            arrayList4.remove(Integer.valueOf(i11));
                        }
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            hVar3.e(chat.f19793id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    hVar2.k(arrayList3, chat.f19793id);
                }
                if (!arrayList3.contains(Integer.valueOf(i11))) {
                    arrayList3.add(Integer.valueOf(i11));
                }
                if (vpVar.f18959z0.indexOfKey(chat.f19793id) < 0) {
                    if (aVar != null) {
                        org.telegram.messenger.i0.g3(new Runnable() {
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
                    hVar = hVar3;
                    arrayList = arrayList4;
                    vpVar.I0(chat.f19793id, 3, 0L, null);
                } else {
                    hVar = hVar3;
                    arrayList = arrayList4;
                    if (aVar != null) {
                        org.telegram.messenger.i0.g3(new Runnable() {
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
                }
                if (chat.megagroup && !chat.monoforum) {
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                        hVar.k(arrayList2, chat.f19793id);
                    } else {
                        arrayList2 = arrayList;
                    }
                    if (!arrayList2.contains(Integer.valueOf(i11))) {
                        arrayList2.add(Integer.valueOf(i11));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f19793id) < 0) {
                        longSparseIntArray.put(chat.f19793id, 0);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gs gsVar = (gs) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = gsVar.V;
                int i12 = gsVar.P;
                if (i11 == gsVar.f26510f0 && TextUtils.equals(tL_messages_searchGlobal.f19906q, gsVar.f26511g0)) {
                    gsVar.f26506b0 = false;
                    if (!z11) {
                        arrayList5.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        hs.a0(i12).m1(messages_messages.users, messages_messages.chats, true, true);
                        vp.r1(i12).V3(messages_messages.users, false);
                        vp.r1(i12).P3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages.messages;
                        int size = arrayList6.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList6.get(i13);
                            i13++;
                            jj jjVar = new jj(i12, message, false, true);
                            jjVar.J5(gsVar.f26511g0, true);
                            arrayList5.add(jjVar);
                        }
                        gsVar.f26508d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages.count);
                        gsVar.f26509e0 = messages_messages.next_rate;
                    }
                    gsVar.O(true);
                    return;
                }
                return;
            case 4:
                is isVar = (is) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList7 = isVar.R;
                int i14 = isVar.P;
                if (i11 == isVar.f27074c0 && TextUtils.equals(tL_messages_searchGlobal2.f19906q, isVar.f27075d0)) {
                    isVar.Y = false;
                    if (!z11) {
                        arrayList7.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        hs.a0(i14).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        vp.r1(i14).V3(messages_messages2.users, false);
                        vp.r1(i14).P3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList8 = messages_messages2.messages;
                        int size2 = arrayList8.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TLRPC.Message message2 = arrayList8.get(i15);
                            i15++;
                            jj jjVar2 = new jj(i14, message2, false, true);
                            jjVar2.J5(isVar.f27075d0, true);
                            arrayList7.add(jjVar2);
                        }
                        isVar.f27072a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList7.size(), messages_messages2.count);
                        isVar.f27073b0 = messages_messages2.next_rate;
                    }
                    isVar.O(true);
                    return;
                }
                return;
            case 5:
                sd sdVar = (sd) obj3;
                Context context = (Context) obj2;
                k2 k2Var = (k2) obj;
                vu vuVar = (vu) sdVar.d;
                vuVar.a();
                p8 p8Var = vuVar.e;
                vuVar.c();
                int x02 = t6.x0(null, t6.q6, false);
                bi0 bi0Var = vuVar.d;
                bi0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = t6.x0(null, t6.f20872a7, false);
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
                    ValueAnimator valueAnimator = vuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        vuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = vuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = vuVar.f42815n;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vuVar.h = ofFloat;
                    if (z11) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    ofFloat.addUpdateListener(new tu(sdVar, f7, i11, x03, activity));
                    vuVar.h.addListener(new org.telegram.ui.t0(activity, x03, 1));
                    vuVar.h.setDuration(350L);
                    vuVar.h.start();
                }
                if (t6.k1()) {
                    p8Var.p(cd.L0(2131745484, null), bi0Var, true);
                    p8Var.f22465x += 2;
                } else {
                    p8Var.p(cd.L0(2131745485, null), bi0Var, true);
                    p8Var.f22465x += 2;
                }
                t6.M1(k2Var);
                return;
            default:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z11) {
                    str = d20.i(i11).f15154c0;
                    if (str == null) {
                        ui.b0(i11).C();
                        return;
                    }
                } else {
                    str = d20.i(i11).f15152b0;
                    if (str == null) {
                        ui.b0(i11).z();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = ui.b0(i11).p0(str);
                if (p02 == null) {
                    p02 = ui.b0(i11).n0(str);
                }
                if (p02 != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < p02.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = p02.packs.get(i16);
                            if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i17 = 0; i17 < p02.documents.size(); i17++) {
                                    document = p02.documents.get(i17);
                                    if (document == null || document.f19799id != longValue) {
                                    }
                                }
                            } else {
                                i16++;
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
                    imageReceiver.f14410u0 = true;
                    imageReceiver.f14382g1 = new l2.f(zArr, 26);
                    c00 f10 = v5.f(document, t6.f20872a7, 0.3f, null);
                    TLRPC.PhotoSize w9 = b8.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(ic.b(document), "160_160_nr", ic.c(w9, document), "160_160", f10, document.size, "tgs", p02, 1);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                ui b02 = ui.b0(i11);
                if (tL_messages_stickerSet != null) {
                    z10 = false;
                }
                b02.c1(str, false, z10);
                return;
        }
    }

    public o0(m4.p0 p0Var, int i10, n4.r rVar, m4.o0 o0Var, boolean z10) {
        this.f8377a = 1;
        this.d = p0Var;
        this.f8378b = i10;
        this.e = rVar;
        this.f8380f = o0Var;
        this.f8379c = z10;
    }

    public o0(vp vpVar, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f8377a = 2;
        this.d = vpVar;
        this.e = chat;
        this.f8379c = z10;
        this.f8378b = i10;
        this.f8380f = aVar;
    }

    public o0(p51 p51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f8377a = i11;
        this.d = p51Var;
        this.f8378b = i10;
        this.e = tL_messages_searchGlobal;
        this.f8379c = z10;
        this.f8380f = tLObject;
    }

    public o0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f8377a = 6;
        this.f8379c = z10;
        this.f8378b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f8380f = zArr;
    }
}
