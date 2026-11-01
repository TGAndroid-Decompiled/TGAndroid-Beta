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
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.is;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.v5;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.sd;
import org.telegram.ui.su;
import org.telegram.ui.uu;
public final class o0 implements Runnable {
    public final int f8378a;
    public final int f8379b;
    public final boolean f8380c;
    public final Object d;
    public final Object e;
    public final Object f8381f;

    public o0(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.f8378a = i11;
        this.d = obj;
        this.e = obj2;
        this.f8379b = i10;
        this.f8380c = z10;
        this.f8381f = obj3;
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
        int i10 = this.f8378a;
        boolean z10 = true;
        Object obj = this.f8381f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i11 = this.f8379b;
        boolean z11 = this.f8380c;
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
                    if (!((n4.l) p0Var.f12884n.f13527a).f13511a.isActive()) {
                        StringBuilder l4 = i0.a.l(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(rVar.f13529a.f13531b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        return;
                    }
                    m4.w m0 = p0Var.m0(rVar);
                    if (!p0Var.f12878g.M(m0, i11)) {
                        if (i11 == 1 && !f0Var.f12755t.t()) {
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
                wp wpVar = (wp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = wpVar.B0;
                a0.h hVar2 = wpVar.A0;
                ArrayList arrayList3 = (ArrayList) hVar2.f(chat.f19794id);
                a0.h hVar3 = wpVar.C0;
                ArrayList arrayList4 = (ArrayList) hVar3.f(chat.f19794id);
                if (z11) {
                    if (arrayList3 != null) {
                        arrayList3.remove(Integer.valueOf(i11));
                    }
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        hVar2.e(chat.f19794id);
                    }
                    if (chat.megagroup) {
                        if (arrayList4 != null) {
                            arrayList4.remove(Integer.valueOf(i11));
                        }
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            hVar3.e(chat.f19794id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    hVar2.k(arrayList3, chat.f19794id);
                }
                if (!arrayList3.contains(Integer.valueOf(i11))) {
                    arrayList3.add(Integer.valueOf(i11));
                }
                if (wpVar.f19302z0.indexOfKey(chat.f19794id) < 0) {
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
                    wpVar.I0(chat.f19794id, 3, 0L, null);
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
                        hVar.k(arrayList2, chat.f19794id);
                    } else {
                        arrayList2 = arrayList;
                    }
                    if (!arrayList2.contains(Integer.valueOf(i11))) {
                        arrayList2.add(Integer.valueOf(i11));
                    }
                    if (longSparseIntArray.indexOfKey(chat.f19794id) < 0) {
                        longSparseIntArray.put(chat.f19794id, 0);
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
                if (i11 == gsVar.f26538f0 && TextUtils.equals(tL_messages_searchGlobal.f19907q, gsVar.f26539g0)) {
                    gsVar.f26534b0 = false;
                    if (!z11) {
                        arrayList5.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        is.a0(i12).m1(messages_messages.users, messages_messages.chats, true, true);
                        wp.r1(i12).V3(messages_messages.users, false);
                        wp.r1(i12).P3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages.messages;
                        int size = arrayList6.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList6.get(i13);
                            i13++;
                            kj kjVar = new kj(i12, message, false, true);
                            kjVar.J5(gsVar.f26539g0, true);
                            arrayList5.add(kjVar);
                        }
                        gsVar.f26536d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages.count);
                        gsVar.f26537e0 = messages_messages.next_rate;
                    }
                    gsVar.O(true);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.is isVar = (org.telegram.ui.Components.is) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList7 = isVar.R;
                int i14 = isVar.P;
                if (i11 == isVar.f27163c0 && TextUtils.equals(tL_messages_searchGlobal2.f19907q, isVar.f27164d0)) {
                    isVar.Y = false;
                    if (!z11) {
                        arrayList7.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        is.a0(i14).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        wp.r1(i14).V3(messages_messages2.users, false);
                        wp.r1(i14).P3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList8 = messages_messages2.messages;
                        int size2 = arrayList8.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TLRPC.Message message2 = arrayList8.get(i15);
                            i15++;
                            kj kjVar2 = new kj(i14, message2, false, true);
                            kjVar2.J5(isVar.f27164d0, true);
                            arrayList7.add(kjVar2);
                        }
                        isVar.f27161a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList7.size(), messages_messages2.count);
                        isVar.f27162b0 = messages_messages2.next_rate;
                    }
                    isVar.O(true);
                    return;
                }
                return;
            case 5:
                sd sdVar = (sd) obj3;
                Context context = (Context) obj2;
                k2 k2Var = (k2) obj;
                uu uuVar = (uu) sdVar.d;
                uuVar.a();
                p8 p8Var = uuVar.e;
                uuVar.c();
                int x02 = t6.x0(null, t6.q6, false);
                ci0 ci0Var = uuVar.d;
                ci0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = t6.x0(null, t6.f20873a7, false);
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
                    ValueAnimator valueAnimator = uuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        uuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = uuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = uuVar.f42344n;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uuVar.h = ofFloat;
                    if (z11) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    ofFloat.addUpdateListener(new su(sdVar, f7, i11, x03, activity));
                    uuVar.h.addListener(new org.telegram.ui.t0(activity, x03, 1));
                    uuVar.h.setDuration(350L);
                    uuVar.h.start();
                }
                if (t6.k1()) {
                    p8Var.p(dd.L0(2131745484, null), ci0Var, true);
                    p8Var.f22466x += 2;
                } else {
                    p8Var.p(dd.L0(2131745485, null), ci0Var, true);
                    p8Var.f22466x += 2;
                }
                t6.M1(k2Var);
                return;
            default:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z11) {
                    str = e20.i(i11).f15513c0;
                    if (str == null) {
                        vi.b0(i11).C();
                        return;
                    }
                } else {
                    str = e20.i(i11).f15511b0;
                    if (str == null) {
                        vi.b0(i11).z();
                        return;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = vi.b0(i11).p0(str);
                if (p02 == null) {
                    p02 = vi.b0(i11).n0(str);
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
                                    if (document == null || document.f19800id != longValue) {
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
                    imageReceiver.f14411u0 = true;
                    imageReceiver.f14383g1 = new l2.f(zArr, 26);
                    d00 f10 = v5.f(document, t6.f20873a7, 0.3f, null);
                    TLRPC.PhotoSize w9 = b8.w(document.thumbs, 160, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(jc.b(document), "160_160_nr", jc.c(w9, document), "160_160", f10, document.size, "tgs", p02, 1);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                vi b02 = vi.b0(i11);
                if (tL_messages_stickerSet != null) {
                    z10 = false;
                }
                b02.c1(str, false, z10);
                return;
        }
    }

    public o0(m4.p0 p0Var, int i10, n4.r rVar, m4.o0 o0Var, boolean z10) {
        this.f8378a = 1;
        this.d = p0Var;
        this.f8379b = i10;
        this.e = rVar;
        this.f8381f = o0Var;
        this.f8380c = z10;
    }

    public o0(wp wpVar, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.f8378a = 2;
        this.d = wpVar;
        this.e = chat;
        this.f8380c = z10;
        this.f8379b = i10;
        this.f8381f = aVar;
    }

    public o0(q51 q51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.f8378a = i11;
        this.d = q51Var;
        this.f8379b = i10;
        this.e = tL_messages_searchGlobal;
        this.f8380c = z10;
        this.f8381f = tLObject;
    }

    public o0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.f8378a = 6;
        this.f8380c = z10;
        this.f8379b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f8381f = zArr;
    }
}
