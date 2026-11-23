package kg;

import a8.b8;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.v3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.h3;
import ki.k2;
import ki.n2;
import ki.s2;
import oi.a6;
import oi.c6;
import oi.d3;
import oi.m5;
import oi.t3;
import oi.u5;
import oi.x5;
import oi.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;
public final class y implements Runnable {
    public final int f18565a;
    public final Object f18566b;
    public final Object f18567c;
    public final Object d;

    public y(ViewGroup viewGroup, Object obj, String str, int i7) {
        this.f18565a = i7;
        this.f18566b = viewGroup;
        this.d = obj;
        this.f18567c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18565a) {
            case 0:
                z zVar = (z) this.f18566b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f18567c;
                ConnectionsManager.getInstance(zVar.f18578a).sendRequest(deletebusinesschatlink, new bi.o1(20, zVar, (TL_account.TL_businessChatLink) this.d));
                return;
            case 1:
                k0 k0Var = (k0) this.f18566b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(k0Var.f30173a).b();
                k0Var.dismiss();
                ((TL_account.TL_connectedBot) this.f18567c).recipients = tL_businessBotRecipients;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    lc.b0(T).Q(2131623990, 36, hd.a0(null, null, 2131752772, p10.q(k0Var.U1))).j();
                    return;
                }
                return;
            case 2:
                u0 u0Var = (u0) this.f18566b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18567c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    u0Var.f18524a.b(false);
                    lc.e0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    u0Var.f18524a.b(false);
                    f3.o(null, 2131743634, lc.b0(u0Var), null);
                    return;
                } else {
                    u0Var.finishFragment();
                    return;
                }
            case 3:
                e1.Z((e1) this.f18566b, (TLRPC.TL_error) this.f18567c, (TLObject) this.d);
                return;
            case 4:
                z1 z1Var = (z1) this.f18566b;
                TLObject tLObject2 = (TLObject) this.f18567c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = z1Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ls.f(z1Var.f18583a).k(216, new Object[0]);
                }
                z1Var.f18585c = true;
                z1Var.f18584b = false;
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) this.f18566b;
                HashMap hashMap = (HashMap) this.f18567c;
                y10 y10Var = (y10) this.d;
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.f28583id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj = new Object();
                    obj.f18834a = user;
                    obj.f18835b = z10;
                    arrayList3.add(obj);
                }
                y10Var.a(arrayList3);
                return;
            case 6:
                v3 v3Var = (v3) this.d;
                ((boolean[]) this.f18566b)[0] = false;
                if (((TLObject) this.f18567c) instanceof TLRPC.TL_boolTrue) {
                    v3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                s2 s2Var = ((n2) this.f18566b).d;
                if (((TLObject) this.f18567c) instanceof TLRPC.TL_boolTrue) {
                    k2 k2Var = s2Var.E;
                    k2Var.getClass();
                    k2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    return;
                }
                new lc(s2Var.f18954r0, s2Var.G).Z(tL_error2).k(true);
                return;
            case 8:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f18567c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                lc.b0((h3) this.f18566b).I(2131623994, hd.N0(2131754330, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), p10.q((TLRPC.User) this.d)))).j();
                return;
            case 9:
                h3.D0((h3) this.f18566b, (TLObject) this.f18567c, (org.telegram.ui.ActionBar.t1) this.d);
                return;
            case 10:
                x2.g0 g0Var = (x2.g0) this.d;
                m2.d dVar = ((l2.w0) this.f18566b).f19608c;
                h9.t1 f10 = ((h9.f0) this.f18567c).f();
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
                b8Var.s(c1Var.y0());
                return;
            case 11:
                Pair pair = (Pair) this.f18567c;
                ((l2.c1) this.f18566b).f19304b.h.c(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.d);
                return;
            case 12:
                Pair pair2 = (Pair) this.f18567c;
                ((l2.c1) this.f18566b).f19304b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 13:
                String str = h2.l0.f13815a;
                m2.d dVar2 = ((l2.z) ((n2.s) ((k8.a) this.f18566b).f18215c)).f19628a.f19375s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, (e2.u) this.f18567c, (l2.e) this.d, 7));
                return;
            case 14:
                AudioTrack audioTrack = (AudioTrack) this.f18566b;
                Handler handler = (Handler) this.f18567c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, 22));
                    }
                    synchronized (n2.g0.f21129t) {
                        try {
                            int i11 = n2.g0.v - 1;
                            n2.g0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.g0.f21130u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.g0.f21130u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, 22));
                    }
                    synchronized (n2.g0.f21129t) {
                        try {
                            int i12 = n2.g0.v - 1;
                            n2.g0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.g0.f21130u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.g0.f21130u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 15:
                t3 t3Var = (t3) this.f18566b;
                a70 a70Var = (a70) this.f18567c;
                m5 m5Var = (m5) this.d;
                if (t3Var.f22433r4 == a70Var) {
                    t3Var.f22433r4 = null;
                    if (t3Var.K3 && t3Var.f22431q4 == m5Var && !m5Var.I.isEmpty()) {
                        t3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                t3 t3Var2 = (t3) this.f18566b;
                oi.a aVar = (oi.a) this.f18567c;
                oi.a aVar2 = (oi.a) this.d;
                ArrayList arrayList4 = t3Var2.f22445x4;
                oi.h3 h3Var = t3Var2.f22440v3;
                if (h3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList4.indexOf(aVar);
                    int indexOf2 = arrayList4.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList4.size()) {
                            oi.a aVar3 = (oi.a) arrayList4.get(i7);
                            long j3 = aVar3.f21951t;
                            if (j3 != 0) {
                                h3Var.X(i7, c6.l((TL_iv.RichText) t3Var2.f22438u3.get(Long.valueOf(j3))));
                            } else {
                                h3Var.X(i7, a6.z(aVar3.f21935b));
                            }
                            i7++;
                        }
                        h3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((t3) this.f18566b).d5((String) this.f18567c, (oi.a) this.d);
                return;
            case 18:
                oi.a aVar4 = (oi.a) this.f18567c;
                z5 z5Var = (z5) this.d;
                x5 x5Var = ((u5) this.f18566b).f22470a.E;
                if (x5Var != null) {
                    ((d3) x5Var).d(aVar4, z5Var.f22593a, z5Var.f22594b, z5Var.f22595c, z5Var.d, z5Var.f22596e);
                    return;
                }
                return;
            case 19:
                ((VideoAds) this.f18566b).lambda$show$3((gc) this.f18567c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 20:
                ((VideoAds) this.f18566b).lambda$show$5((gc) this.f18567c, (boolean[]) this.d);
                return;
            case 21:
                ((VideoPlayerHolderBase) this.f18566b).lambda$release$3((TLRPC.Document) this.f18567c, (Runnable) this.d);
                return;
            case 22:
                ((r10) this.f18566b).a((TLRPC.Updates) this.f18567c, (TLRPC.TL_error) this.d);
                return;
            case 23:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18566b;
                g2 g2Var = (g2) this.f18567c;
                g2 g2Var2 = (g2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (!actionBarLayout.h && !actionBarLayout.f28714b0) {
                    actionBarLayout.f28759w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f28759w.setScaleX(1.0f);
                    actionBarLayout.f28759w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.f28714b0 = false;
                }
                actionBarLayout.m(g2Var);
                g2Var.setRemovingFromStack(false);
                g2Var.onTransitionAnimationEnd(false, true);
                g2Var2.onTransitionAnimationEnd(true, true);
                g2Var2.onBecomeFullyVisible();
                return;
            case 24:
                ((g2) this.f18567c).presentFragment((bn) this.d);
                ((org.telegram.ui.ActionBar.f3) this.f18566b).f28948c = false;
                return;
            case 25:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f18566b;
                ArrayList arrayList5 = (ArrayList) this.f18567c;
                e3 e3Var = (e3) this.d;
                f3Var.getClass();
                while (i7 < arrayList5.size()) {
                    if (((c3) arrayList5.get(i7)).f28822a == e3Var) {
                        arrayList5.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                f3Var.invalidate();
                return;
            case 26:
                l6 l6Var = (l6) this.f18566b;
                TLObject tLObject3 = (TLObject) this.f18567c;
                l6 l6Var2 = (l6) this.d;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    l6Var.f29244h0 = w7.r(null, tL_wallPaper.document);
                    ls.f(l6Var.F).b(l6Var, 142);
                    ls.f(l6Var.F).b(l6Var, 143);
                    w7.G(l6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                l6Var.s();
                return;
            case 27:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f18566b;
                n6.K0(v0Var.getContext(), v0Var.I, (TL_wallet.walletTransaction) this.f18567c, null, null, null, (org.telegram.ui.Cells.n0) this.d, v0Var.f32117h1);
                return;
            case 28:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f18566b;
                v0Var2.f32114g1.b0(v0Var2, (TLRPC.TL_premiumGiftOption) this.d, (String) this.f18567c);
                return;
            default:
                l6 l6Var3 = (l6) this.f18567c;
                l6Var3.f29241f = !l6Var3.d((File) this.d, l6Var3.f29236c);
                org.telegram.messenger.g0.g3(new ga(8, (ia) this.f18566b, l6Var3));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, int i7) {
        this.f18565a = i7;
        this.f18566b = obj;
        this.f18567c = obj2;
        this.d = obj3;
    }
}
