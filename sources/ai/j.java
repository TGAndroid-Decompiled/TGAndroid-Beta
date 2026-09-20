package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ci.zc;
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
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.gc0;
import org.telegram.ui.i60;
import org.telegram.ui.li;
import org.telegram.ui.of;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
public final class j implements Runnable {
    public final int f1034a;
    public final long f1035b;
    public final Object f1036c;

    public j(Object obj, long j3, int i10) {
        this.f1034a = i10;
        this.f1036c = obj;
        this.f1035b = j3;
    }

    @Override
    public final void run() {
        ci.jc jcVar;
        int i10 = this.f1034a;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        boolean z10 = false;
        r7 = 0;
        int i11 = 0;
        long j3 = this.f1035b;
        Object obj = this.f1036c;
        switch (i10) {
            case 0:
                ((b0) obj).f563s.e0(j3, false);
                return;
            case 1:
                f6 f6Var2 = ((b4) obj).f578a;
                if (j3 <= 0) {
                    z10 = true;
                }
                f6Var2.k0(z10);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((n5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(MessagesController.getInstance(((l9) obj).f1193a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ci.oc ocVar = ci.oc.F2;
                    if (ocVar != null && ocVar.d) {
                        ?? obj2 = new Object();
                        obj2.f19577a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((y9) obj).f1768b;
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
                ci.ba baVar = (ci.ba) obj;
                Context context = baVar.getContext();
                ci.ia iaVar = baVar.W;
                org.telegram.ui.Components.d5.S(context, iaVar.attachedFragment, ci.ia.Y(iaVar), new z1(baVar, j3, 1));
                return;
            case 6:
                ci.oc ocVar2 = (ci.oc) obj;
                ci.jc jcVar2 = ocVar2.F;
                if (jcVar2 != null) {
                    jcVar2.f(true);
                    ocVar2.F = null;
                }
                ci.fc fcVar = ocVar2.f5279x;
                if (fcVar != null) {
                    jcVar = fcVar.a(j3);
                } else {
                    jcVar = null;
                }
                ocVar2.F = jcVar;
                if (jcVar != null) {
                    ocVar2.J = jcVar.f4861a;
                    ocVar2.f5258r.c();
                    ci.ac acVar = ocVar2.f5229h0;
                    int i12 = ocVar2.J;
                    if (i12 != 1 && i12 != 0) {
                        i11 = -14737633;
                    }
                    acVar.setBackgroundColor(i11);
                    ocVar2.H.set(ocVar2.F.f4863c);
                    ci.jc jcVar3 = ocVar2.F;
                    ocVar2.G = jcVar3.f4862b;
                    jcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                ocVar2.f5279x = null;
                Activity activity = ocVar2.f5208b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f31146z0.post(new ci.ka(ocVar2, 5));
                    return;
                } else {
                    ocVar2.q(true);
                    return;
                }
            case 7:
                ci.sc scVar = ((zc) obj).f5884a;
                if (scVar != null) {
                    scVar.m(j3, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.e, new fi.t((fi.k0) obj, 1));
                return;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.f9184i = null;
                t0Var.f9183g.l(j3);
                t0Var.f9187l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.f();
                    return;
                }
                return;
            case 10:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.d5.M(rVar.f26655b.f29098f0.getParentActivity(), j3, new a6.m(rVar, 26), rVar.f26654a);
                return;
            case 11:
                ii.d2 d2Var = (ii.d2) obj;
                org.telegram.ui.Components.d5.M(d2Var.getParentActivity(), j3, new xa.c(d2Var, 27), d2Var.getResourceProvider());
                return;
            case 12:
                String str = e2.d0.f7888a;
                j2.f fVar = ((i2.b0) ((k2.j) ((n4.y) obj).f15218b)).f10625a.f10675s;
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
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                if (u3Var != null) {
                    u3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new zn(v7.j0.e(j3, "user_id")));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.pc Q = xc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f27260r = false;
                Q.j();
                return;
            case 20:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(zn.R9(j3));
                return;
            case 21:
                yf0 yf0Var = (yf0) obj;
                yf0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new uf0(yf0Var, 1), 100L);
                return;
            case 22:
                ih0 ih0Var = (ih0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        f6Var = U2.getResourceProvider();
                    }
                } else {
                    f6Var = new d();
                }
                new yh.l7(activity2, f6Var, this.f1035b, 15, "", new fh0(ih0Var, 0), 0L).show();
                return;
            case 23:
                uy uyVar = (uy) obj;
                uyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                return;
            case 24:
                ((i60) obj).m1(j3, false);
                return;
            case 25:
                gc0 gc0Var = (gc0) obj;
                gc0Var.getClass();
                gc0Var.presentFragment(zn.R9(j3));
                return;
            case 26:
                zn znVar = ((li) obj).e;
                znVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == znVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 27:
                ((of) obj).run(Long.valueOf(j3));
                return;
            case 28:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) obj;
                f0Var.getClass();
                f0Var.presentFragment(zn.R9(j3));
                return;
            default:
                tg.z0 z0Var = (tg.z0) obj;
                HashSet hashSet = z0Var.f43530e0;
                hashSet.remove(Long.valueOf(j3));
                z0Var.Y.b(true, hashSet, new tg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                return;
        }
    }
}
