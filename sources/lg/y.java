package lg;

import ai.f3;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b8.xe;
import ci.w9;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import mi.a6;
import mi.b6;
import mi.d3;
import mi.d6;
import mi.h3;
import mi.n5;
import mi.t3;
import mi.v5;
import mi.y5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y2;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.wm;
public final class y implements Runnable {
    public final int f18514a;
    public final Object f18515b;
    public final Object f18516c;
    public final Object d;

    public y(ViewGroup viewGroup, Object obj, String str, int i3) {
        this.f18514a = i3;
        this.f18515b = viewGroup;
        this.d = obj;
        this.f18516c = str;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i3 = 0;
        switch (this.f18514a) {
            case 0:
                z zVar = (z) this.f18515b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f18516c;
                ConnectionsManager.getInstance(zVar.f18524a).sendRequest(deletebusinesschatlink, new f3(22, zVar, (TL_account.TL_businessChatLink) this.d));
                return;
            case 1:
                j0 j0Var = (j0) this.f18515b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(j0Var.f28583a).b();
                j0Var.dismiss();
                ((TL_account.TL_connectedBot) this.f18516c).recipients = tL_businessBotRecipients;
                d2 T = LaunchActivity.T();
                if (T != null) {
                    fc.a0(T).Q(2131623989, 36, bd.a0(null, null, 2131752784, l10.p(j0Var.R1))).j();
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) this.f18515b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18516c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    t0Var.f18464a.b(false);
                    fc.d0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    t0Var.f18464a.b(false);
                    k5.p(null, 2131743889, fc.a0(t0Var), null);
                    return;
                } else {
                    t0Var.finishFragment();
                    return;
                }
            case 3:
                d1.Z((d1) this.f18515b, (TLRPC.TL_error) this.f18516c, (TLObject) this.d);
                return;
            case 4:
                y1 y1Var = (y1) this.f18515b;
                TLObject tLObject2 = (TLObject) this.f18516c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = y1Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    hs.f(y1Var.f18519a).k(214, new Object[0]);
                }
                y1Var.f18521c = true;
                y1Var.f18520b = false;
                return;
            case 5:
                String str = g2.n0.f11873a;
                l2.f fVar = ((k2.c0) ((m2.u) ((m2.t) this.f18515b).f19007c)).f16459a.f16572s;
                l2.a U = fVar.U();
                fVar.V(U, 1009, new l2.c(U, (d2.v) this.f18516c, (k2.e) this.d, 23));
                return;
            case 6:
                AudioTrack audioTrack = (AudioTrack) this.f18515b;
                Handler handler = (Handler) this.f18516c;
                g2.s sVar = (g2.s) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new n(sVar, 8));
                    }
                    synchronized (m2.h0.f18864t) {
                        try {
                            int i10 = m2.h0.v - 1;
                            m2.h0.v = i10;
                            if (i10 == 0) {
                                ScheduledExecutorService scheduledExecutorService = m2.h0.f18865u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                m2.h0.f18865u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new n(sVar, 8));
                    }
                    synchronized (m2.h0.f18864t) {
                        try {
                            int i11 = m2.h0.v - 1;
                            m2.h0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = m2.h0.f18865u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                m2.h0.f18865u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 7:
                t3 t3Var = (t3) this.f18515b;
                f60 f60Var = (f60) this.f18516c;
                n5 n5Var = (n5) this.d;
                if (t3Var.f19921r4 == f60Var) {
                    t3Var.f19921r4 = null;
                    if (t3Var.K3 && t3Var.f19919q4 == n5Var && !n5Var.I.isEmpty()) {
                        t3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                t3 t3Var2 = (t3) this.f18515b;
                mi.a aVar = (mi.a) this.f18516c;
                mi.a aVar2 = (mi.a) this.d;
                ArrayList arrayList2 = t3Var2.f19933x4;
                h3 h3Var = t3Var2.f19928v3;
                if (h3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList2.indexOf(aVar);
                    int indexOf2 = arrayList2.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i3 < arrayList2.size()) {
                            mi.a aVar3 = (mi.a) arrayList2.get(i3);
                            long j10 = aVar3.f19447t;
                            if (j10 != 0) {
                                h3Var.X(i3, d6.l((TL_iv.RichText) t3Var2.f19926u3.get(Long.valueOf(j10))));
                            } else {
                                h3Var.X(i3, b6.z(aVar3.f19431b));
                            }
                            i3++;
                        }
                        h3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((t3) this.f18515b).d5((String) this.f18516c, (mi.a) this.d);
                return;
            case 10:
                mi.a aVar4 = (mi.a) this.f18516c;
                a6 a6Var = (a6) this.d;
                y5 y5Var = ((v5) this.f18515b).f19986a.E;
                if (y5Var != null) {
                    ((d3) y5Var).d(aVar4, a6Var.f19463a, a6Var.f19464b, a6Var.f19465c, a6Var.d, a6Var.f19466e);
                    return;
                }
                return;
            case 11:
                ni.l lVar = (ni.l) this.f18515b;
                ArrayList arrayList3 = (ArrayList) this.f18516c;
                ArrayList arrayList4 = (ArrayList) this.d;
                lVar.getClass();
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((View) arrayList3.get(i12)).setVisibility(0);
                }
                if (lVar.A.removeAll(arrayList4)) {
                    while (i3 < arrayList4.size()) {
                        lVar.d((u4.d1) arrayList4.get(i3));
                        i3++;
                    }
                    lVar.G();
                }
                lVar.K.removeAll(arrayList3);
                return;
            case 12:
                ni.l lVar2 = (ni.l) this.f18515b;
                View view = (View) this.f18516c;
                u4.d1 d1Var = (u4.d1) this.d;
                lVar2.getClass();
                view.setVisibility(0);
                if (lVar2.A.remove(d1Var)) {
                    lVar2.d(d1Var);
                    lVar2.G();
                }
                lVar2.K.remove(view);
                return;
            case 13:
                o4.a0 a0Var = (o4.a0) this.f18515b;
                o4.v vVar = (o4.v) this.f18516c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                o4.e0 e0Var = a0Var.f20578b;
                if (e0Var.i(vVar)) {
                    e0Var.b(keyEvent, false, false);
                } else {
                    o4.o0 o0Var = e0Var.h;
                    p4.r rVar = vVar.f20879a;
                    rVar.getClass();
                    o0Var.getClass();
                    o0Var.i0(1, new o4.h0(o0Var, 9), rVar, true);
                }
                a0Var.f20577a = null;
                return;
            case 14:
                o4.e0 e0Var2 = (o4.e0) this.f18515b;
                o4.v0 v0Var = (o4.v0) this.f18516c;
                o4.w wVar = (o4.w) this.d;
                if (!e0Var2.j()) {
                    o4.l1 l1Var = e0Var2.f20636t;
                    v0Var.getClass();
                    xe.b(l1Var, wVar);
                    return;
                }
                return;
            case 15:
                SpannableString spannableString = (SpannableString) this.f18515b;
                oi.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((mi.h0) this.f18516c).f19644b);
                ((org.telegram.messenger.voip.l0) this.d).run();
                return;
            case 16:
                SpannableString spannableString2 = (SpannableString) this.f18515b;
                oi.k.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) ((mi.h0) this.f18516c).f19644b);
                ((w9) this.d).a(spannableString2);
                return;
            case 17:
                ((VideoAds) this.f18515b).lambda$show$3((ac) this.f18516c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 18:
                ((VideoAds) this.f18515b).lambda$show$5((ac) this.f18516c, (boolean[]) this.d);
                return;
            case 19:
                ((VideoPlayerHolderBase) this.f18515b).lambda$release$3((TLRPC.Document) this.f18516c, (Runnable) this.d);
                return;
            case 20:
                ((n10) this.f18515b).a((TLObject) this.f18516c, (TLRPC.TL_error) this.d);
                return;
            case 21:
                ((n10) this.f18515b).a((TLRPC.Updates) this.f18516c, (TLRPC.TL_error) this.d);
                return;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18515b;
                d2 d2Var = (d2) this.f18516c;
                d2 d2Var2 = (d2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (!actionBarLayout.h && !actionBarLayout.f27280b0) {
                    actionBarLayout.f27325w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f27325w.setScaleX(1.0f);
                    actionBarLayout.f27325w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.f27280b0 = false;
                }
                actionBarLayout.m(d2Var);
                d2Var.setRemovingFromStack(false);
                d2Var.onTransitionAnimationEnd(false, true);
                d2Var2.onTransitionAnimationEnd(true, true);
                d2Var2.onBecomeFullyVisible();
                return;
            case 23:
                ((d2) this.f18516c).presentFragment((wm) this.d);
                ((b3) this.f18515b).f27401c = false;
                return;
            case 24:
                b3 b3Var = (b3) this.f18515b;
                ArrayList arrayList5 = (ArrayList) this.f18516c;
                a3 a3Var = (a3) this.d;
                b3Var.getClass();
                while (i3 < arrayList5.size()) {
                    if (((y2) arrayList5.get(i3)).f28825a == a3Var) {
                        arrayList5.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                b3Var.invalidate();
                return;
            case 25:
                j6 j6Var = (j6) this.f18515b;
                TLObject tLObject3 = (TLObject) this.f18516c;
                j6 j6Var2 = (j6) this.d;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    j6Var.f27687h0 = w7.r(null, tL_wallPaper.document);
                    hs.f(j6Var.F).b(j6Var, 142);
                    hs.f(j6Var.F).b(j6Var, 143);
                    w7.G(j6Var2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                j6Var.s();
                return;
            case 26:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.f18515b;
                w5.G0(t0Var2.getContext(), t0Var2.I, (TL_wallet.walletTransaction) this.f18516c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var2.f30392h1);
                return;
            case 27:
                org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) this.f18515b;
                t0Var3.f30389g1.g0(t0Var3, (TLRPC.TL_premiumGiftOption) this.d, (String) this.f18516c);
                return;
            case 28:
                j6 j6Var3 = (j6) this.f18516c;
                j6Var3.f27684f = !j6Var3.d((File) this.d, j6Var3.f27679c);
                org.telegram.messenger.g0.h3(new ea(8, (ga) this.f18515b, j6Var3));
                return;
            default:
                org.telegram.ui.Components.e0 e0Var3 = (org.telegram.ui.Components.e0) this.f18515b;
                t4.L((Context) this.f18516c, e0Var3.f33237e2, new gi.w5(e0Var3, 29), (e6) this.d);
                return;
        }
    }

    public y(Object obj, Object obj2, Object obj3, int i3) {
        this.f18514a = i3;
        this.f18515b = obj;
        this.f18516c = obj2;
        this.d = obj3;
    }
}
