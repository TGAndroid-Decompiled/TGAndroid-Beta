package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ci.vc;
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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bc0;
import org.telegram.ui.g60;
import org.telegram.ui.li;
import org.telegram.ui.ra1;
import org.telegram.ui.ty;
import org.telegram.ui.xn;
public final class j implements Runnable {
    public final int f1022a;
    public final long f1023b;
    public final Object f1024c;

    public j(Object obj, long j3, int i10) {
        this.f1022a = i10;
        this.f1024c = obj;
        this.f1023b = j3;
    }

    @Override
    public final void run() {
        ci.fc fcVar;
        int i10 = this.f1022a;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        boolean z10 = false;
        r7 = 0;
        int i11 = 0;
        long j3 = this.f1023b;
        Object obj = this.f1024c;
        switch (i10) {
            case 0:
                ((b0) obj).f570s.e0(j3, false);
                return;
            case 1:
                e6 e6Var2 = ((b4) obj).f585a;
                if (j3 <= 0) {
                    z10 = true;
                }
                e6Var2.k0(z10);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((m5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 b02 = ra1.b0(MessagesController.getInstance(((l9) obj).f1194a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ci.kc kcVar = ci.kc.F2;
                    if (kcVar != null && kcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f19631a = true;
                        R.showAsSheet(b02, obj2);
                        return;
                    }
                    R.presentFragment(b02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((y9) obj).f1764b;
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
                ci.x9 x9Var = (ci.x9) obj;
                Context context = x9Var.getContext();
                ci.ea eaVar = x9Var.W;
                org.telegram.ui.Components.e5.S(context, eaVar.attachedFragment, ci.ea.Y(eaVar), new z1(x9Var, j3, 1));
                return;
            case 6:
                ci.kc kcVar2 = (ci.kc) obj;
                ci.fc fcVar2 = kcVar2.F;
                if (fcVar2 != null) {
                    fcVar2.f(true);
                    kcVar2.F = null;
                }
                ci.bc bcVar = kcVar2.f5056x;
                if (bcVar != null) {
                    fcVar = bcVar.a(j3);
                } else {
                    fcVar = null;
                }
                kcVar2.F = fcVar;
                if (fcVar != null) {
                    kcVar2.J = fcVar.f4712a;
                    kcVar2.f5035r.c();
                    ci.wb wbVar = kcVar2.f5006h0;
                    int i12 = kcVar2.J;
                    if (i12 != 1 && i12 != 0) {
                        i11 = -14737633;
                    }
                    wbVar.setBackgroundColor(i11);
                    kcVar2.H.set(kcVar2.F.f4714c);
                    ci.fc fcVar3 = kcVar2.F;
                    kcVar2.G = fcVar3.f4713b;
                    fcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                kcVar2.f5056x = null;
                Activity activity = kcVar2.f4985b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f31150z0.post(new ci.ga(kcVar2, 5));
                    return;
                } else {
                    kcVar2.q(true);
                    return;
                }
            case 7:
                ci.oc ocVar = ((vc) obj).f5693a;
                if (ocVar != null) {
                    ocVar.n(j3, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.e, new fi.t((fi.k0) obj, 1));
                return;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.f9171i = null;
                t0Var.f9170g.l(j3);
                t0Var.f9174l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.f();
                    return;
                }
                return;
            case 10:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.e5.M(rVar.f27104b.f29962f0.getParentActivity(), j3, new a6.m(rVar, 26), rVar.f27103a);
                return;
            case 11:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.e5.M(e2Var.getParentActivity(), j3, new xa.c(e2Var, 27), e2Var.getResourceProvider());
                return;
            case 12:
                String str = e2.d0.f7872a;
                j2.f fVar = ((i2.c0) ((k2.j) ((n4.y) obj).f15258c)).f10619a.f10678s;
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
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) obj;
                if (w3Var != null) {
                    w3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(v7.k0.e(j3, "user_id")));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.qc Q = xc.a0((org.telegram.ui.b7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f27699r = false;
                Q.j();
                return;
            case 20:
                dg dgVar = (dg) obj;
                dgVar.getClass();
                dgVar.presentFragment(xn.R9(j3));
                return;
            case 21:
                bg0 bg0Var = (bg0) obj;
                bg0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new wf0(bg0Var, 1), 100L);
                return;
            case 22:
                lh0 lh0Var = (lh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        e6Var = U2.getResourceProvider();
                    }
                } else {
                    e6Var = new d();
                }
                new yh.k7(activity2, e6Var, this.f1023b, 15, "", new ih0(lh0Var, 0), 0L).show();
                return;
            case 23:
                ty tyVar = (ty) obj;
                tyVar.J4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                tyVar.C2.u(tyVar, arrayList, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
                return;
            case 24:
                ((g60) obj).m1(j3, false);
                return;
            case 25:
                bc0 bc0Var = (bc0) obj;
                bc0Var.getClass();
                bc0Var.presentFragment(xn.R9(j3));
                return;
            case 26:
                xn xnVar = ((li) obj).e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 27:
                ((org.telegram.ui.qc) obj).run(Long.valueOf(j3));
                return;
            case 28:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) obj;
                f0Var.getClass();
                f0Var.presentFragment(xn.R9(j3));
                return;
            default:
                tg.z0 z0Var = (tg.z0) obj;
                HashSet hashSet = z0Var.f43561e0;
                hashSet.remove(Long.valueOf(j3));
                z0Var.Y.b(true, hashSet, new tg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                return;
        }
    }
}
