package kg;

import a8.b8;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.r3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.i3;
import ki.l2;
import ki.o2;
import ki.t2;
import oi.b6;
import oi.c3;
import oi.g3;
import oi.l5;
import oi.s3;
import oi.t5;
import oi.w5;
import oi.y5;
import oi.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;
public final class i0 implements Runnable {
    public final int f18341a;
    public final Object f18342b;
    public final Object f18343c;
    public final Object d;

    public i0(Object obj, Object obj2, Object obj3, int i7) {
        this.f18341a = i7;
        this.f18342b = obj;
        this.f18343c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18341a) {
            case 0:
                l0 l0Var = (l0) this.f18342b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(l0Var.f30189a).b();
                l0Var.dismiss();
                ((TL_account.TL_connectedBot) this.f18343c).recipients = tL_businessBotRecipients;
                h2 T = LaunchActivity.T();
                if (T != null) {
                    lc.b0(T).Q(2131623990, 36, gd.a0(null, null, 2131752773, o10.q(l0Var.U1))).j();
                    return;
                }
                return;
            case 1:
                v0 v0Var = (v0) this.f18342b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18343c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    v0Var.f18500a.b(false);
                    lc.e0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    v0Var.f18500a.b(false);
                    f3.o(null, 2131743642, lc.b0(v0Var), null);
                    return;
                } else {
                    v0Var.finishFragment();
                    return;
                }
            case 2:
                f1.Z((f1) this.f18342b, (TLRPC.TL_error) this.f18343c, (TLObject) this.d);
                return;
            case 3:
                z1 z1Var = (z1) this.f18342b;
                TLObject tLObject2 = (TLObject) this.f18343c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = z1Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ks.f(z1Var.f18553a).k(216, new Object[0]);
                }
                z1Var.f18555c = true;
                z1Var.f18554b = false;
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.f18342b;
                HashMap hashMap = (HashMap) this.f18343c;
                x10 x10Var = (x10) this.d;
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.f28554id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj = new Object();
                    obj.f18824a = user;
                    obj.f18825b = z10;
                    arrayList3.add(obj);
                }
                x10Var.a(arrayList3);
                return;
            case 5:
                r3 r3Var = (r3) this.d;
                ((boolean[]) this.f18342b)[0] = false;
                if (((TLObject) this.f18343c) instanceof TLRPC.TL_boolTrue) {
                    r3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                t2 t2Var = ((o2) this.f18342b).d;
                if (((TLObject) this.f18343c) instanceof TLRPC.TL_boolTrue) {
                    l2 l2Var = t2Var.E;
                    l2Var.getClass();
                    l2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    return;
                }
                new lc(t2Var.f18944r0, t2Var.G).Z(tL_error2).k(true);
                return;
            case 7:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f18343c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                lc.b0((i3) this.f18342b).I(2131623994, gd.M0(2131754331, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754332, ki.k.J0(connectedbotstarref.commission_permille), o10.q((TLRPC.User) this.d)))).j();
                return;
            case 8:
                i3.D0((i3) this.f18342b, (TLObject) this.f18343c, (org.telegram.ui.ActionBar.u1) this.d);
                return;
            case 9:
                x2.g0 g0Var = (x2.g0) this.d;
                m2.d dVar = ((l2.w0) this.f18342b).f19580c;
                h9.t1 f10 = ((h9.f0) this.f18343c).f();
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
            case 10:
                Pair pair = (Pair) this.f18343c;
                ((l2.c1) this.f18342b).f19276b.h.c(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.d);
                return;
            case 11:
                Pair pair2 = (Pair) this.f18343c;
                ((l2.c1) this.f18342b).f19276b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 12:
                String str = h2.l0.f13786a;
                m2.d dVar2 = ((l2.z) ((n2.s) ((k8.a) this.f18342b).f18184c)).f19600a.f19347s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, (e2.u) this.f18343c, (l2.e) this.d, 7));
                return;
            case 13:
                AudioTrack audioTrack = (AudioTrack) this.f18342b;
                Handler handler = (Handler) this.f18343c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new j0(rVar, 22));
                    }
                    synchronized (n2.g0.f21101t) {
                        try {
                            int i11 = n2.g0.v - 1;
                            n2.g0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.g0.f21102u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.g0.f21102u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new j0(rVar, 22));
                    }
                    synchronized (n2.g0.f21101t) {
                        try {
                            int i12 = n2.g0.v - 1;
                            n2.g0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.g0.f21102u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.g0.f21102u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 14:
                s3 s3Var = (s3) this.f18342b;
                y60 y60Var = (y60) this.f18343c;
                l5 l5Var = (l5) this.d;
                if (s3Var.f22342r4 == y60Var) {
                    s3Var.f22342r4 = null;
                    if (s3Var.K3 && s3Var.f22340q4 == l5Var && !l5Var.I.isEmpty()) {
                        s3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                s3 s3Var2 = (s3) this.f18342b;
                oi.a aVar = (oi.a) this.f18343c;
                oi.a aVar2 = (oi.a) this.d;
                ArrayList arrayList4 = s3Var2.f22354x4;
                g3 g3Var = s3Var2.f22349v3;
                if (g3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList4.indexOf(aVar);
                    int indexOf2 = arrayList4.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList4.size()) {
                            oi.a aVar3 = (oi.a) arrayList4.get(i7);
                            long j3 = aVar3.f21926t;
                            if (j3 != 0) {
                                g3Var.X(i7, b6.l((TL_iv.RichText) s3Var2.f22347u3.get(Long.valueOf(j3))));
                            } else {
                                g3Var.X(i7, z5.z(aVar3.f21910b));
                            }
                            i7++;
                        }
                        g3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((s3) this.f18342b).d5((String) this.d, (oi.a) this.f18343c);
                return;
            case 17:
                oi.a aVar4 = (oi.a) this.f18343c;
                y5 y5Var = (y5) this.d;
                w5 w5Var = ((t5) this.f18342b).f22381a.E;
                if (w5Var != null) {
                    ((c3) w5Var).d(aVar4, y5Var.f22507a, y5Var.f22508b, y5Var.f22509c, y5Var.d, y5Var.f22510e);
                    return;
                }
                return;
            case 18:
                ((VideoAds) this.f18342b).lambda$show$3((gc) this.f18343c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 19:
                ((VideoAds) this.f18342b).lambda$show$5((gc) this.f18343c, (boolean[]) this.d);
                return;
            case 20:
                ((VideoPlayerHolderBase) this.f18342b).lambda$release$3((TLRPC.Document) this.f18343c, (Runnable) this.d);
                return;
            case 21:
                ((q10) this.f18342b).a((TLRPC.Updates) this.f18343c, (TLRPC.TL_error) this.d);
                return;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18342b;
                h2 h2Var = (h2) this.f18343c;
                h2 h2Var2 = (h2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (!actionBarLayout.h && !actionBarLayout.f28683b0) {
                    actionBarLayout.f28728w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f28728w.setScaleX(1.0f);
                    actionBarLayout.f28728w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.f28683b0 = false;
                }
                actionBarLayout.m(h2Var);
                h2Var.setRemovingFromStack(false);
                h2Var.onTransitionAnimationEnd(false, true);
                h2Var2.onTransitionAnimationEnd(true, true);
                h2Var2.onBecomeFullyVisible();
                return;
            case 23:
                ((h2) this.f18343c).presentFragment((bn) this.d);
                ((org.telegram.ui.ActionBar.g3) this.f18342b).f28965c = false;
                return;
            case 24:
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.f18342b;
                ArrayList arrayList5 = (ArrayList) this.f18343c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                g3Var2.getClass();
                while (i7 < arrayList5.size()) {
                    if (((d3) arrayList5.get(i7)).f28836a == f3Var) {
                        arrayList5.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                g3Var2.invalidate();
                return;
            case 25:
                m6 m6Var = (m6) this.f18342b;
                TLObject tLObject3 = (TLObject) this.f18343c;
                m6 m6Var2 = (m6) this.d;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    m6Var.f29261h0 = w7.r(null, tL_wallPaper.document);
                    ks.f(m6Var.F).b(m6Var, 142);
                    ks.f(m6Var.F).b(m6Var, 143);
                    w7.G(m6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                m6Var.s();
                return;
            case 26:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.f18342b;
                n6.K0(u0Var.getContext(), u0Var.I, (TL_wallet.walletTransaction) this.f18343c, null, null, null, (org.telegram.ui.Cells.n0) this.d, u0Var.f32027h1);
                return;
            case 27:
                org.telegram.ui.Cells.u0 u0Var2 = (org.telegram.ui.Cells.u0) this.f18342b;
                u0Var2.f32024g1.b0(u0Var2, (TLRPC.TL_premiumGiftOption) this.f18343c, (String) this.d);
                return;
            case 28:
                m6 m6Var3 = (m6) this.f18343c;
                m6Var3.f29258f = !m6Var3.d((File) this.d, m6Var3.f29253c);
                org.telegram.messenger.g0.g3(new fa(9, (ha) this.f18342b, m6Var3));
                return;
            default:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.f18342b;
                b5.J((Context) this.f18343c, m0Var.f37287h2, new org.telegram.ui.Cells.b5(m0Var), (i6) this.d);
                return;
        }
    }
}
