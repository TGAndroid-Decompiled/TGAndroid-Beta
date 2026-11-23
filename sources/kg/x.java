package kg;

import a8.b8;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.x3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.i3;
import ki.k2;
import ki.o2;
import ki.t2;
import oi.a6;
import oi.c6;
import oi.d3;
import oi.h3;
import oi.m5;
import oi.t3;
import oi.u5;
import oi.x5;
import oi.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.bn;
public final class x implements Runnable {
    public final int f18619a;
    public final Object f18620b;
    public final Object f18621c;
    public final Object d;

    public x(Object obj, Object obj2, Object obj3, int i7) {
        this.f18619a = i7;
        this.f18620b = obj;
        this.d = obj2;
        this.f18621c = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18619a) {
            case 0:
                z zVar = (z) this.f18620b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f18621c;
                ArrayList arrayList = zVar.f18641b;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        ks.f(zVar.f18640a).k(125, new Object[0]);
                    }
                    zVar.f();
                    return;
                }
                a8.g(new RuntimeException("Unexpected response from server!"), true);
                return;
            case 1:
                z zVar2 = (z) this.f18620b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.d;
                ConnectionsManager.getInstance(zVar2.f18640a).sendRequest(deletebusinesschatlink, new bi.o1(20, zVar2, (TL_account.TL_businessChatLink) this.f18621c));
                return;
            case 2:
                k0 k0Var = (k0) this.f18620b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.f18621c;
                f.a(k0Var.f30223a).b();
                k0Var.dismiss();
                ((TL_account.TL_connectedBot) this.d).recipients = tL_businessBotRecipients;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    kc.b0(T).Q(2131623990, 36, gd.a0(null, null, 2131752772, n10.q(k0Var.U1))).j();
                    return;
                }
                return;
            case 3:
                u0 u0Var = (u0) this.f18620b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18621c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    u0Var.f18585a.b(false);
                    kc.e0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    u0Var.f18585a.b(false);
                    f3.o(null, 2131743632, kc.b0(u0Var), null);
                    return;
                } else {
                    u0Var.finishFragment();
                    return;
                }
            case 4:
                e1.Z((e1) this.f18620b, (TLRPC.TL_error) this.f18621c, (TLObject) this.d);
                return;
            case 5:
                z1 z1Var = (z1) this.f18620b;
                TLObject tLObject2 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f18621c;
                ArrayList arrayList2 = z1Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ks.f(z1Var.f18645a).k(216, new Object[0]);
                }
                z1Var.f18647c = true;
                z1Var.f18646b = false;
                return;
            case 6:
                ArrayList arrayList3 = (ArrayList) this.f18620b;
                HashMap hashMap = (HashMap) this.d;
                w10 w10Var = (w10) this.f18621c;
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList3.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.f28641id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj = new Object();
                    obj.f18901a = user;
                    obj.f18902b = z10;
                    arrayList4.add(obj);
                }
                w10Var.a(arrayList4);
                return;
            case 7:
                x3 x3Var = (x3) this.f18621c;
                ((boolean[]) this.f18620b)[0] = false;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    x3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 8:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f18621c;
                t2 t2Var = ((o2) this.f18620b).d;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    k2 k2Var = t2Var.E;
                    k2Var.getClass();
                    k2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    return;
                }
                new kc(t2Var.f19039r0, t2Var.G).Z(tL_error2).k(true);
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.d;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                kc.b0((i3) this.f18620b).I(2131623994, gd.N0(2131754330, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), n10.q((TLRPC.User) this.f18621c)))).j();
                return;
            case 10:
                i3.D0((i3) this.f18620b, (TLObject) this.d, (org.telegram.ui.ActionBar.t1) this.f18621c);
                return;
            case 11:
                x2.g0 g0Var = (x2.g0) this.f18621c;
                m2.d dVar = ((l2.x0) this.f18620b).f19678c;
                h9.s1 f10 = ((h9.f0) this.d).f();
                b8 b8Var = dVar.d;
                e2.c1 c1Var = dVar.h;
                c1Var.getClass();
                b8Var.getClass();
                b8Var.f342b = h9.i0.q(f10);
                if (!f10.isEmpty()) {
                    b8Var.f344e = (x2.g0) f10.get(0);
                    g0Var.getClass();
                    b8Var.f345f = g0Var;
                }
                if (((x2.g0) b8Var.d) == null) {
                    b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f342b, (x2.g0) b8Var.f344e, (e2.i1) b8Var.f341a);
                }
                b8Var.s(c1Var.z0());
                return;
            case 12:
                Pair pair = (Pair) this.d;
                ((l2.d1) this.f18620b).f19374b.h.l(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.f18621c);
                return;
            case 13:
                Pair pair2 = (Pair) this.d;
                ((l2.d1) this.f18620b).f19374b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.f18621c);
                return;
            case 14:
                String str = h2.l0.f13778a;
                m2.d dVar2 = ((l2.a0) ((n2.s) ((jb.m) this.f18620b).f17465c)).f19342a.f19445s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, (e2.u) this.d, (l2.f) this.f18621c, 7));
                return;
            case 15:
                AudioTrack audioTrack = (AudioTrack) this.f18620b;
                Handler handler = (Handler) this.d;
                h2.r rVar = (h2.r) this.f18621c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, 22));
                    }
                    synchronized (n2.h0.f21195t) {
                        try {
                            int i11 = n2.h0.v - 1;
                            n2.h0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.h0.f21196u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.h0.f21196u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, 22));
                    }
                    synchronized (n2.h0.f21195t) {
                        try {
                            int i12 = n2.h0.v - 1;
                            n2.h0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.h0.f21196u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.h0.f21196u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 16:
                t3 t3Var = (t3) this.f18620b;
                x60 x60Var = (x60) this.d;
                m5 m5Var = (m5) this.f18621c;
                if (t3Var.f22500r4 == x60Var) {
                    t3Var.f22500r4 = null;
                    if (t3Var.K3 && t3Var.f22498q4 == m5Var && !m5Var.I.isEmpty()) {
                        t3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                t3 t3Var2 = (t3) this.f18620b;
                oi.a aVar = (oi.a) this.d;
                oi.a aVar2 = (oi.a) this.f18621c;
                ArrayList arrayList5 = t3Var2.f22512x4;
                h3 h3Var = t3Var2.f22507v3;
                if (h3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList5.indexOf(aVar);
                    int indexOf2 = arrayList5.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList5.size()) {
                            oi.a aVar3 = (oi.a) arrayList5.get(i7);
                            long j3 = aVar3.f22017t;
                            if (j3 != 0) {
                                h3Var.X(i7, c6.l((TL_iv.RichText) t3Var2.f22505u3.get(Long.valueOf(j3))));
                            } else {
                                h3Var.X(i7, a6.z(aVar3.f22001b));
                            }
                            i7++;
                        }
                        h3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ((t3) this.f18620b).d5((String) this.f18621c, (oi.a) this.d);
                return;
            case 19:
                oi.a aVar4 = (oi.a) this.d;
                z5 z5Var = (z5) this.f18621c;
                x5 x5Var = ((u5) this.f18620b).f22537a.E;
                if (x5Var != null) {
                    ((d3) x5Var).d(aVar4, z5Var.f22660a, z5Var.f22661b, z5Var.f22662c, z5Var.d, z5Var.f22663e);
                    return;
                }
                return;
            case 20:
                ((VideoAds) this.f18620b).lambda$show$3((fc) this.d, (TLRPC.TL_sponsoredMessage) this.f18621c);
                return;
            case 21:
                ((VideoAds) this.f18620b).lambda$show$5((fc) this.d, (boolean[]) this.f18621c);
                return;
            case 22:
                ((VideoPlayerHolderBase) this.f18620b).lambda$release$3((TLRPC.Document) this.d, (Runnable) this.f18621c);
                return;
            case 23:
                ((p10) this.f18620b).a((TLRPC.Updates) this.d, (TLRPC.TL_error) this.f18621c);
                return;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18620b;
                g2 g2Var = (g2) this.d;
                g2 g2Var2 = (g2) this.f18621c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (!actionBarLayout.h && !actionBarLayout.f28772b0) {
                    actionBarLayout.f28817w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f28817w.setScaleX(1.0f);
                    actionBarLayout.f28817w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.f28772b0 = false;
                }
                actionBarLayout.m(g2Var);
                g2Var.setRemovingFromStack(false);
                g2Var.onTransitionAnimationEnd(false, true);
                g2Var2.onTransitionAnimationEnd(true, true);
                g2Var2.onBecomeFullyVisible();
                return;
            case 25:
                ((g2) this.d).presentFragment((bn) this.f18621c);
                ((org.telegram.ui.ActionBar.f3) this.f18620b).f29006c = false;
                return;
            case 26:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f18620b;
                ArrayList arrayList6 = (ArrayList) this.d;
                e3 e3Var = (e3) this.f18621c;
                f3Var.getClass();
                while (i7 < arrayList6.size()) {
                    if (((c3) arrayList6.get(i7)).f28883a == e3Var) {
                        arrayList6.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                f3Var.invalidate();
                return;
            case 27:
                m6 m6Var = (m6) this.f18620b;
                TLObject tLObject3 = (TLObject) this.d;
                m6 m6Var2 = (m6) this.f18621c;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    m6Var.f29332h0 = w7.r(null, tL_wallPaper.document);
                    ks.f(m6Var.F).b(m6Var, 142);
                    ks.f(m6Var.F).b(m6Var, 143);
                    w7.G(m6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                m6Var.s();
                return;
            case 28:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f18620b;
                o6.K0(v0Var.getContext(), v0Var.I, (TL_wallet.walletTransaction) this.d, null, null, null, (org.telegram.ui.Cells.n0) this.f18621c, v0Var.f32166h1);
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f18620b;
                v0Var2.f32163g1.T(v0Var2, (TLRPC.TL_premiumGiftOption) this.d, (String) this.f18621c);
                return;
        }
    }

    public x(g2 g2Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f18619a = i7;
        this.f18620b = g2Var;
        this.f18621c = tL_error;
        this.d = tLObject;
    }
}
