package kg;

import a8.b8;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.x3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.h3;
import ki.k2;
import ki.n2;
import ki.s2;
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
    public final int f18532a;
    public final Object f18533b;
    public final Object f18534c;
    public final Object d;

    public y(ViewGroup viewGroup, Object obj, String str, int i7) {
        this.f18532a = i7;
        this.f18533b = viewGroup;
        this.d = obj;
        this.f18534c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18532a) {
            case 0:
                z zVar = (z) this.f18533b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f18534c;
                ConnectionsManager.getInstance(zVar.f18541a).sendRequest(deletebusinesschatlink, new bi.o1(20, zVar, (TL_account.TL_businessChatLink) this.d));
                return;
            case 1:
                k0 k0Var = (k0) this.f18533b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(k0Var.f30139a).b();
                k0Var.dismiss();
                ((TL_account.TL_connectedBot) this.f18534c).recipients = tL_businessBotRecipients;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    lc.b0(T).Q(2131623990, 36, hd.a0(null, null, 2131752772, p10.q(k0Var.U1))).j();
                    return;
                }
                return;
            case 2:
                v0 v0Var = (v0) this.f18533b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18534c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    v0Var.f18496a.b(false);
                    lc.e0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    v0Var.f18496a.b(false);
                    f3.o(null, 2131743636, lc.b0(v0Var), null);
                    return;
                } else {
                    v0Var.finishFragment();
                    return;
                }
            case 3:
                f1.Z((f1) this.f18533b, (TLRPC.TL_error) this.f18534c, (TLObject) this.d);
                return;
            case 4:
                a2 a2Var = (a2) this.f18533b;
                TLObject tLObject2 = (TLObject) this.f18534c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = a2Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ls.f(a2Var.f18239a).k(216, new Object[0]);
                }
                a2Var.f18241c = true;
                a2Var.f18240b = false;
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) this.f18533b;
                HashMap hashMap = (HashMap) this.f18534c;
                y10 y10Var = (y10) this.d;
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.f28547id));
                    if (bool != null && bool.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ?? obj = new Object();
                    obj.f18800a = user;
                    obj.f18801b = z10;
                    arrayList3.add(obj);
                }
                y10Var.a(arrayList3);
                return;
            case 6:
                x3 x3Var = (x3) this.d;
                ((boolean[]) this.f18533b)[0] = false;
                if (((TLObject) this.f18534c) instanceof TLRPC.TL_boolTrue) {
                    x3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                s2 s2Var = ((n2) this.f18533b).d;
                if (((TLObject) this.f18534c) instanceof TLRPC.TL_boolTrue) {
                    k2 k2Var = s2Var.E;
                    k2Var.getClass();
                    k2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    return;
                }
                new lc(s2Var.f18920r0, s2Var.G).Z(tL_error2).k(true);
                return;
            case 8:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f18534c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                lc.b0((h3) this.f18533b).I(2131623994, hd.N0(2131754330, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), p10.q((TLRPC.User) this.d)))).j();
                return;
            case 9:
                h3.D0((h3) this.f18533b, (TLObject) this.f18534c, (org.telegram.ui.ActionBar.t1) this.d);
                return;
            case 10:
                x2.g0 g0Var = (x2.g0) this.d;
                m2.d dVar = ((l2.w0) this.f18533b).f19574c;
                h9.t1 f10 = ((h9.f0) this.f18534c).f();
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
                Pair pair = (Pair) this.f18534c;
                ((l2.c1) this.f18533b).f19270b.h.c(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.d);
                return;
            case 12:
                Pair pair2 = (Pair) this.f18534c;
                ((l2.c1) this.f18533b).f19270b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 13:
                String str = h2.l0.f13778a;
                m2.d dVar2 = ((l2.z) ((n2.s) ((k8.a) this.f18533b).f18178c)).f19594a.f19341s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, (e2.u) this.f18534c, (l2.e) this.d, 7));
                return;
            case 14:
                AudioTrack audioTrack = (AudioTrack) this.f18533b;
                Handler handler = (Handler) this.f18534c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new s0(rVar, 21));
                    }
                    synchronized (n2.g0.f21095t) {
                        try {
                            int i11 = n2.g0.v - 1;
                            n2.g0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.g0.f21096u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.g0.f21096u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new s0(rVar, 21));
                    }
                    synchronized (n2.g0.f21095t) {
                        try {
                            int i12 = n2.g0.v - 1;
                            n2.g0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.g0.f21096u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.g0.f21096u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 15:
                s3 s3Var = (s3) this.f18533b;
                a70 a70Var = (a70) this.f18534c;
                l5 l5Var = (l5) this.d;
                if (s3Var.f22370r4 == a70Var) {
                    s3Var.f22370r4 = null;
                    if (s3Var.K3 && s3Var.f22368q4 == l5Var && !l5Var.I.isEmpty()) {
                        s3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                s3 s3Var2 = (s3) this.f18533b;
                oi.a aVar = (oi.a) this.f18534c;
                oi.a aVar2 = (oi.a) this.d;
                ArrayList arrayList4 = s3Var2.f22382x4;
                g3 g3Var = s3Var2.f22377v3;
                if (g3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList4.indexOf(aVar);
                    int indexOf2 = arrayList4.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList4.size()) {
                            oi.a aVar3 = (oi.a) arrayList4.get(i7);
                            long j3 = aVar3.f21917t;
                            if (j3 != 0) {
                                g3Var.X(i7, b6.l((TL_iv.RichText) s3Var2.f22375u3.get(Long.valueOf(j3))));
                            } else {
                                g3Var.X(i7, z5.z(aVar3.f21901b));
                            }
                            i7++;
                        }
                        g3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((s3) this.f18533b).d5((String) this.f18534c, (oi.a) this.d);
                return;
            case 18:
                oi.a aVar4 = (oi.a) this.f18534c;
                y5 y5Var = (y5) this.d;
                w5 w5Var = ((t5) this.f18533b).f22407a.E;
                if (w5Var != null) {
                    ((c3) w5Var).d(aVar4, y5Var.f22530a, y5Var.f22531b, y5Var.f22532c, y5Var.d, y5Var.f22533e);
                    return;
                }
                return;
            case 19:
                ((VideoAds) this.f18533b).lambda$show$3((gc) this.f18534c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 20:
                ((VideoAds) this.f18533b).lambda$show$5((gc) this.f18534c, (boolean[]) this.d);
                return;
            case 21:
                ((VideoPlayerHolderBase) this.f18533b).lambda$release$3((TLRPC.Document) this.f18534c, (Runnable) this.d);
                return;
            case 22:
                ((r10) this.f18533b).a((TLRPC.Updates) this.f18534c, (TLRPC.TL_error) this.d);
                return;
            case 23:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18533b;
                g2 g2Var = (g2) this.f18534c;
                g2 g2Var2 = (g2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (!actionBarLayout.h && !actionBarLayout.f28680b0) {
                    actionBarLayout.f28725w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f28725w.setScaleX(1.0f);
                    actionBarLayout.f28725w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.f28680b0 = false;
                }
                actionBarLayout.m(g2Var);
                g2Var.setRemovingFromStack(false);
                g2Var.onTransitionAnimationEnd(false, true);
                g2Var2.onTransitionAnimationEnd(true, true);
                g2Var2.onBecomeFullyVisible();
                return;
            case 24:
                ((g2) this.f18534c).presentFragment((bn) this.d);
                ((org.telegram.ui.ActionBar.f3) this.f18533b).f28914c = false;
                return;
            case 25:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f18533b;
                ArrayList arrayList5 = (ArrayList) this.f18534c;
                e3 e3Var = (e3) this.d;
                f3Var.getClass();
                while (i7 < arrayList5.size()) {
                    if (((org.telegram.ui.ActionBar.c3) arrayList5.get(i7)).f28788a == e3Var) {
                        arrayList5.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                f3Var.invalidate();
                return;
            case 26:
                l6 l6Var = (l6) this.f18533b;
                TLObject tLObject3 = (TLObject) this.f18534c;
                l6 l6Var2 = (l6) this.d;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    l6Var.f29210h0 = w7.r(null, tL_wallPaper.document);
                    ls.f(l6Var.F).b(l6Var, 142);
                    ls.f(l6Var.F).b(l6Var, 143);
                    w7.G(l6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                l6Var.s();
                return;
            case 27:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f18533b;
                n6.K0(v0Var2.getContext(), v0Var2.I, (TL_wallet.walletTransaction) this.f18534c, null, null, null, (org.telegram.ui.Cells.n0) this.d, v0Var2.f32083h1);
                return;
            case 28:
                org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) this.f18533b;
                v0Var3.f32080g1.b0(v0Var3, (TLRPC.TL_premiumGiftOption) this.d, (String) this.f18534c);
                return;
            default:
                l6 l6Var3 = (l6) this.f18534c;
                l6Var3.f29207f = !l6Var3.d((File) this.d, l6Var3.f29202c);
                org.telegram.messenger.g0.g3(new ga(8, (ia) this.f18533b, l6Var3));
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, int i7) {
        this.f18532a = i7;
        this.f18533b = obj;
        this.f18534c = obj2;
        this.d = obj3;
    }
}
