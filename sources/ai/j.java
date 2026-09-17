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
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.bo;
import org.telegram.ui.gc0;
import org.telegram.ui.k60;
import org.telegram.ui.ni;
import org.telegram.ui.pf;
import org.telegram.ui.wy;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        ci.jc jcVar;
        int i10 = this.f1034a;
        org.telegram.ui.ActionBar.f6 f6Var2 = null;
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
                f6 f6Var3 = ((b4) obj).f578a;
                if (j3 <= 0) {
                    z10 = true;
                }
                f6Var3.k0(z10);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((n5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 d02 = ab1.d0(MessagesController.getInstance(((l9) obj).f1193a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ci.oc ocVar = ci.oc.F2;
                    if (ocVar != null && ocVar.d) {
                        ?? obj2 = new Object();
                        obj2.f19397a = true;
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
                org.telegram.ui.ActionBar.o2 o2Var = iaVar.attachedFragment;
                f6Var = ((org.telegram.ui.ActionBar.g3) iaVar).resourcesProvider;
                org.telegram.ui.Components.c5.S(context, o2Var, f6Var, new z1(baVar, j3, 1));
                return;
            case 6:
                ci.oc ocVar2 = (ci.oc) obj;
                ci.jc jcVar2 = ocVar2.F;
                if (jcVar2 != null) {
                    jcVar2.f(true);
                    ocVar2.F = null;
                }
                ci.fc fcVar = ocVar2.f5278x;
                if (fcVar != null) {
                    jcVar = fcVar.a(j3);
                } else {
                    jcVar = null;
                }
                ocVar2.F = jcVar;
                if (jcVar != null) {
                    ocVar2.J = jcVar.f4860a;
                    ocVar2.f5257r.c();
                    ci.ac acVar = ocVar2.f5228h0;
                    int i12 = ocVar2.J;
                    if (i12 != 1 && i12 != 0) {
                        i11 = -14737633;
                    }
                    acVar.setBackgroundColor(i11);
                    ocVar2.H.set(ocVar2.F.f4862c);
                    ci.jc jcVar3 = ocVar2.F;
                    ocVar2.G = jcVar3.f4861b;
                    jcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                ocVar2.f5278x = null;
                Activity activity = ocVar2.f5207b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f30876z0.post(new ci.ka(ocVar2, 5));
                    return;
                } else {
                    ocVar2.q(true);
                    return;
                }
            case 7:
                ci.sc scVar = ((zc) obj).f5883a;
                if (scVar != null) {
                    scVar.o(j3, false);
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
                    s0Var.e();
                    return;
                }
                return;
            case 10:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.c5.M(rVar.f26460b.f28742f0.getParentActivity(), j3, new a6.m(rVar, 26), rVar.f26459a);
                return;
            case 11:
                ii.d2 d2Var = (ii.d2) obj;
                org.telegram.ui.Components.c5.M(d2Var.getParentActivity(), j3, new xa.c(d2Var, 27), d2Var.getResourceProvider());
                return;
            case 12:
                String str = e2.d0.f7888a;
                j2.f fVar = ((i2.b0) ((k2.j) ((n4.y) obj).f15005c)).f10624a.f10674s;
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
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new bo(w.f.e(j3, "user_id")));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.oc Q = vc.a0((org.telegram.ui.a7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f26710r = false;
                Q.j();
                return;
            case 20:
                bg bgVar = (bg) obj;
                bgVar.getClass();
                bgVar.presentFragment(bo.R9(j3));
                return;
            case 21:
                qf0 qf0Var = (qf0) obj;
                qf0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mf0(qf0Var, 1), 100L);
                return;
            case 22:
                zg0 zg0Var = (zg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        f6Var2 = U2.getResourceProvider();
                    }
                } else {
                    f6Var2 = new d();
                }
                new yh.n7(activity2, f6Var2, this.f1035b, 15, "", new wg0(zg0Var, 0), 0L).show();
                return;
            case 23:
                wy wyVar = (wy) obj;
                wyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                wyVar.C2.u(wyVar, arrayList, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
                return;
            case 24:
                ((k60) obj).m1(j3, false);
                return;
            case 25:
                gc0 gc0Var = (gc0) obj;
                gc0Var.getClass();
                gc0Var.presentFragment(bo.R9(j3));
                return;
            case 26:
                bo boVar = ((ni) obj).e;
                boVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == boVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                boVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 27:
                ((pf) obj).run(Long.valueOf(j3));
                return;
            case 28:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) obj;
                f0Var.getClass();
                f0Var.presentFragment(bo.R9(j3));
                return;
            default:
                tg.a1 a1Var = (tg.a1) obj;
                HashSet hashSet = a1Var.f43090e0;
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y.b(true, hashSet, new tg.u0(a1Var, 5), null);
                a1Var.b0(true, false);
                return;
        }
    }
}
