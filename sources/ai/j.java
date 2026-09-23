package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ci.wc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f60;
import org.telegram.ui.ji;
import org.telegram.ui.ra1;
import org.telegram.ui.ry;
import org.telegram.ui.xn;
import org.telegram.ui.zb0;
public final class j implements Runnable {
    public final int f1019a;
    public final long f1020b;
    public final Object f1021c;

    public j(Object obj, long j3, int i10) {
        this.f1019a = i10;
        this.f1021c = obj;
        this.f1020b = j3;
    }

    @Override
    public final void run() {
        ci.gc gcVar;
        int i10 = this.f1019a;
        org.telegram.ui.ActionBar.d6 d6Var = null;
        boolean z10 = false;
        r7 = 0;
        int i11 = 0;
        long j3 = this.f1020b;
        Object obj = this.f1021c;
        switch (i10) {
            case 0:
                ((b0) obj).f567s.e0(j3, false);
                return;
            case 1:
                e6 e6Var = ((b4) obj).f582a;
                if (j3 <= 0) {
                    z10 = true;
                }
                e6Var.k0(z10);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((m5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = ra1.d0(MessagesController.getInstance(((l9) obj).f1192a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ci.lc lcVar = ci.lc.F2;
                    if (lcVar != null && lcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f19352a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((y9) obj).f1762b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                ci.y9 y9Var = (ci.y9) obj;
                Context context = y9Var.getContext();
                ci.fa faVar = y9Var.W;
                org.telegram.ui.Components.e5.S(context, faVar.attachedFragment, ci.fa.Y(faVar), new z1(y9Var, j3, 1));
                return;
            case 6:
                ci.lc lcVar2 = (ci.lc) obj;
                ci.gc gcVar2 = lcVar2.F;
                if (gcVar2 != null) {
                    gcVar2.f(true);
                    lcVar2.F = null;
                }
                ci.cc ccVar = lcVar2.f5100x;
                if (ccVar != null) {
                    gcVar = ccVar.a(j3);
                } else {
                    gcVar = null;
                }
                lcVar2.F = gcVar;
                if (gcVar != null) {
                    lcVar2.J = gcVar.f4735a;
                    lcVar2.f5079r.c();
                    ci.xb xbVar = lcVar2.f5050h0;
                    int i12 = lcVar2.J;
                    if (i12 != 1 && i12 != 0) {
                        i11 = -14737633;
                    }
                    xbVar.setBackgroundColor(i11);
                    lcVar2.H.set(lcVar2.F.f4737c);
                    ci.gc gcVar3 = lcVar2.F;
                    lcVar2.G = gcVar3.f4736b;
                    gcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                lcVar2.f5100x = null;
                Activity activity = lcVar2.f5029b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f30833z0.post(new ci.ha(lcVar2, 5));
                    return;
                } else {
                    lcVar2.q(true);
                    return;
                }
            case 7:
                ci.pc pcVar = ((wc) obj).f5743a;
                if (pcVar != null) {
                    pcVar.o(j3, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.e, new fi.t((fi.k0) obj, 1));
                return;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.f9167i = null;
                t0Var.f9166g.l(j3);
                t0Var.f9170l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.e();
                    return;
                }
                return;
            case 10:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.e5.M(rVar.f26744b.f29665f0.getParentActivity(), j3, new a6.m(rVar, 26), rVar.f26743a);
                return;
            case 11:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.e5.M(e2Var.getParentActivity(), j3, new xa.c(e2Var, 27), e2Var.getResourceProvider());
                return;
            case 12:
                String str = e2.d0.f7871a;
                j2.f fVar = ((i2.c0) ((k2.j) ((n4.y) obj).f14970c)).f10616a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.c(p5, j3));
                return;
            case 13:
                ((LocationController) obj).lambda$removeSharingLocation$21(j3);
                return;
            case 14:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j3);
                return;
            case 15:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                return;
            case 16:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                return;
            case 17:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                return;
            case 18:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(w.c.e(j3, "user_id")));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.qc Q = xc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f27314r = false;
                Q.j();
                return;
            case 20:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(xn.R9(j3));
                return;
            case 21:
                qf0 qf0Var = (qf0) obj;
                qf0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mf0(qf0Var, 1), 100L);
                return;
            case 22:
                zg0 zg0Var = (zg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        d6Var = U2.getResourceProvider();
                    }
                } else {
                    d6Var = new d();
                }
                new yh.l7(activity2, d6Var, this.f1020b, 15, "", new wg0(zg0Var, 0), 0L).show();
                return;
            case 23:
                ry ryVar = (ry) obj;
                ryVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                ryVar.C2.u(ryVar, arrayList, null, false, ryVar.J2, ryVar.K2, ryVar.L2, null);
                return;
            case 24:
                ((f60) obj).m1(j3, false);
                return;
            case 25:
                zb0 zb0Var = (zb0) obj;
                zb0Var.getClass();
                zb0Var.presentFragment(xn.R9(j3));
                return;
            case 26:
                xn xnVar = ((ji) obj).e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 27:
                ((org.telegram.ui.oc) obj).run(Long.valueOf(j3));
                return;
            case 28:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) obj;
                e0Var.getClass();
                e0Var.presentFragment(xn.R9(j3));
                return;
            default:
                tg.a1 a1Var = (tg.a1) obj;
                HashSet hashSet = a1Var.f43019e0;
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y.b(true, hashSet, new tg.u0(a1Var, 5), null);
                a1Var.b0(true, false);
                return;
        }
    }
}
