package ki;

import a8.b8;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import oi.a6;
import oi.k5;
import oi.s5;
import oi.v5;
import oi.x5;
import oi.y5;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.y7;
import org.telegram.ui.an;
public final class n implements Runnable {
    public final int f18455a;
    public final Object f18456b;
    public final Object f18457c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i7) {
        this.f18455a = i7;
        this.f18456b = obj;
        this.f18457c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        xe xeVar;
        Editable text;
        String str;
        int i7 = 0;
        switch (this.f18455a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f18456b;
                HashMap hashMap = (HashMap) this.f18457c;
                z10 z10Var = (z10) this.d;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.f28200id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj = new Object();
                    obj.f18495a = user;
                    obj.f18496b = z10;
                    arrayList2.add(obj);
                }
                z10Var.a(arrayList2);
                return;
            case 1:
                p1 p1Var = (p1) this.d;
                ((boolean[]) this.f18456b)[0] = false;
                if (((TLObject) this.f18457c) instanceof TLRPC.TL_boolTrue) {
                    p1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                x2 x2Var = ((s2) this.f18456b).d;
                if (((TLObject) this.f18457c) instanceof TLRPC.TL_boolTrue) {
                    p2 p2Var = x2Var.E;
                    p2Var.getClass();
                    p2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    return;
                }
                new cc(x2Var.f18675r0, x2Var.G).Y(tL_error).k(true);
                return;
            case 3:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f18457c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                cc.a0((n3) this.f18456b).I(2131623994, hd.M0(2131754333, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131754334, k.J0(connectedbotstarref.commission_permille), q10.p((TLRPC.User) this.d)))).j();
                return;
            case 4:
                n3.D0((n3) this.f18456b, (TLObject) this.f18457c, (org.telegram.ui.ActionBar.t1) this.d);
                return;
            case 5:
                x2.f0 f0Var = (x2.f0) this.d;
                m2.e eVar = ((l2.w0) this.f18456b).f19213c;
                h9.s1 f10 = ((h9.f0) this.f18457c).f();
                b8 b8Var = eVar.d;
                e2.c1 c1Var = eVar.h;
                c1Var.getClass();
                b8Var.getClass();
                b8Var.f342b = h9.i0.q(f10);
                if (!f10.isEmpty()) {
                    b8Var.f344e = (x2.f0) f10.get(0);
                    f0Var.getClass();
                    b8Var.f345f = f0Var;
                }
                if (((x2.f0) b8Var.d) == null) {
                    b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (x2.f0) b8Var.f344e, (e2.i1) b8Var.f341a);
                }
                b8Var.s(c1Var.y0());
                return;
            case 6:
                Pair pair = (Pair) this.f18457c;
                ((l2.c1) this.f18456b).f18909b.h.p(((Integer) pair.first).intValue(), (x2.f0) pair.second, (nb.a) this.d);
                return;
            case 7:
                Pair pair2 = (Pair) this.f18457c;
                ((l2.c1) this.f18456b).f18909b.h.K(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, (Exception) this.d);
                return;
            case 8:
                String str2 = h2.l0.f13471a;
                m2.e eVar2 = ((l2.z) ((n2.s) ((k8.a) this.f18456b).f17789c)).f19233a.f18980s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1009, new m2.c(U, (e2.u) this.f18457c, (l2.e) this.d, 6));
                return;
            case 9:
                AudioTrack audioTrack = (AudioTrack) this.f18456b;
                Handler handler = (Handler) this.f18457c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new kg.j1(rVar, 18));
                    }
                    synchronized (n2.g0.f20737t) {
                        try {
                            int i11 = n2.g0.v - 1;
                            n2.g0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.g0.f20738u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.g0.f20738u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new kg.j1(rVar, 18));
                    }
                    synchronized (n2.g0.f20737t) {
                        try {
                            int i12 = n2.g0.v - 1;
                            n2.g0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.g0.f20738u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.g0.f20738u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 10:
                oi.q3 q3Var = (oi.q3) this.f18456b;
                m60 m60Var = (m60) this.f18457c;
                k5 k5Var = (k5) this.d;
                if (q3Var.f21936r4 == m60Var) {
                    q3Var.f21936r4 = null;
                    if (q3Var.K3 && q3Var.f21934q4 == k5Var && !k5Var.I.isEmpty()) {
                        q3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                oi.q3 q3Var2 = (oi.q3) this.f18456b;
                oi.a aVar = (oi.a) this.f18457c;
                oi.a aVar2 = (oi.a) this.d;
                ArrayList arrayList3 = q3Var2.f21948x4;
                oi.e3 e3Var = q3Var2.f21943v3;
                if (e3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList3.size()) {
                            oi.a aVar3 = (oi.a) arrayList3.get(i7);
                            long j3 = aVar3.f21560t;
                            if (j3 != 0) {
                                e3Var.X(i7, a6.l((TL_iv.RichText) q3Var2.f21941u3.get(Long.valueOf(j3))));
                            } else {
                                e3Var.X(i7, y5.z(aVar3.f21544b));
                            }
                            i7++;
                        }
                        e3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((oi.q3) this.f18456b).d5((String) this.d, (oi.a) this.f18457c);
                return;
            case 13:
                oi.a aVar4 = (oi.a) this.f18457c;
                x5 x5Var = (x5) this.d;
                v5 v5Var = ((s5) this.f18456b).f21998a.E;
                if (v5Var != null) {
                    ((oi.a3) v5Var).d(aVar4, x5Var.f22124a, x5Var.f22125b, x5Var.f22126c, x5Var.d, x5Var.f22127e);
                    return;
                }
                return;
            case 14:
                ((VideoAds) this.f18456b).lambda$show$3((xb) this.f18457c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 15:
                ((VideoAds) this.f18456b).lambda$show$5((xb) this.f18457c, (boolean[]) this.d);
                return;
            case 16:
                ((VideoPlayerHolderBase) this.f18456b).lambda$release$3((TLRPC.Document) this.f18457c, (Runnable) this.d);
                return;
            case 17:
                ((s10) this.f18456b).a((TLObject) this.f18457c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ((s10) this.f18456b).a((TLRPC.Updates) this.f18457c, (TLRPC.TL_error) this.d);
                return;
            case 19:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18456b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f18457c;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (!actionBarLayout.h && !actionBarLayout.f28329b0) {
                    actionBarLayout.f28374w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f28374w.setScaleX(1.0f);
                    actionBarLayout.f28374w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.f28329b0 = false;
                }
                actionBarLayout.m(e2Var);
                e2Var.setRemovingFromStack(false);
                e2Var.onTransitionAnimationEnd(false, true);
                e2Var2.onTransitionAnimationEnd(true, true);
                e2Var2.onBecomeFullyVisible();
                return;
            case 20:
                ((org.telegram.ui.ActionBar.e2) this.f18457c).presentFragment((an) this.d);
                ((org.telegram.ui.ActionBar.c3) this.f18456b).f28482c = false;
                return;
            case 21:
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.f18457c;
                ArrayList arrayList4 = (ArrayList) this.f18456b;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                c3Var.getClass();
                while (i7 < arrayList4.size()) {
                    if (((org.telegram.ui.ActionBar.z2) arrayList4.get(i7)).f29913a == b3Var) {
                        arrayList4.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                c3Var.invalidate();
                return;
            case 22:
                i6 i6Var = (i6) this.f18456b;
                TLObject tLObject = (TLObject) this.f18457c;
                i6 i6Var2 = (i6) this.d;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                    i6Var.f28710h0 = w7.r(null, tL_wallPaper.document);
                    ns.f(i6Var.F).b(i6Var, 142);
                    ns.f(i6Var.F).b(i6Var, 143);
                    w7.G(i6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                i6Var.s();
                return;
            case 23:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f18456b;
                org.telegram.ui.Wallet.y5.G0(t0Var.getContext(), t0Var.I, (TL_wallet.walletTransaction) this.f18457c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var.f31468h1);
                return;
            case 24:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.f18456b;
                t0Var2.f31465g1.g0(t0Var2, (TLRPC.TL_premiumGiftOption) this.f18457c, (String) this.d);
                return;
            case 25:
                i6 i6Var3 = (i6) this.f18457c;
                i6Var3.f28707f = !i6Var3.d((File) this.d, i6Var3.f28702c);
                org.telegram.messenger.g0.h3(new ea(8, (ga) this.f18456b, i6Var3));
                return;
            case 26:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.f18456b;
                t4.J((Context) this.f18457c, d0Var.f33753h2, new ia.d(d0Var, 28), (e6) this.d);
                return;
            case 27:
                y7 y7Var = (y7) this.f18456b;
                TLObject tLObject2 = (TLObject) this.d;
                ((org.telegram.ui.ActionBar.t1) this.f18457c).dismiss();
                if (tLObject2 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.f28079id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    tL_inputDocument.f28063id = document.f28057id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    hp hpVar = y7Var.f41913q2;
                    if (hpVar != null) {
                        hpVar.f24202c.add(0, hpVar.d(document));
                        hpVar.e();
                    }
                    y7Var.f41915r2.clear();
                    y7Var.f41915r2.addAll(y7Var.f41913q2.f24202c);
                    y7Var.f41920u1.f();
                    ConnectionsManager.getInstance(y7Var.f29679a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18456b;
                String str3 = (String) this.f18457c;
                Runnable runnable = (Runnable) this.d;
                if (!chatActivityEnterView.G2 && (xeVar = chatActivityEnterView.F0) != null && (text = xeVar.getText()) != null) {
                    int length = text.length();
                    if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
                        str = " ";
                    } else {
                        str = "";
                    }
                    String concat = str.concat(str3);
                    chatActivityEnterView.l1 = true;
                    text.insert(length, concat);
                    chatActivityEnterView.F0.setSelection(text.length());
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    chatActivityEnterView.W0();
                    org.telegram.messenger.g0.i3(new nd(chatActivityEnterView, 6), 420L);
                    return;
                }
                return;
            default:
                pe peVar = (pe) this.f18456b;
                peVar.getClass();
                ((jt0) this.f18457c).getViewTreeObserver().removeOnDrawListener(peVar);
                ((en0) this.d).f34376a.setHideAvatar(true);
                return;
        }
    }

    public n(org.telegram.ui.ActionBar.c3 c3Var, ArrayList arrayList, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f18455a = 21;
        this.f18457c = c3Var;
        this.f18456b = arrayList;
        this.d = b3Var;
    }
}
