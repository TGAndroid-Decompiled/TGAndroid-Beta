package gg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import lh.ja;
import lh.z9;
import nh.d4;
import nh.g7;
import nh.q3;
import nh.t6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b7;
import org.telegram.ui.c60;
import org.telegram.ui.ga1;
import org.telegram.ui.ii;
import org.telegram.ui.oy;
import org.telegram.ui.vb0;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import ph.da;
import ph.f8;
import ph.h8;
import ph.ia;
import ph.oa;
import ph.p9;
import ph.u9;
import ph.y9;
import ph.z7;
public final class y1 implements Runnable {
    public final int f6817a;
    public final long f6818b;
    public final Object f6819c;

    public y1(long j10, sc[] scVarArr) {
        this.f6817a = 9;
        this.f6818b = j10;
        this.f6819c = scVarArr;
    }

    @Override
    public final void run() {
        y9 y9Var;
        int i10 = this.f6817a;
        f6 f6Var = null;
        boolean z4 = false;
        r7 = 0;
        int i11 = 0;
        long j10 = this.f6818b;
        Object obj = this.f6819c;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj;
                HashSet hashSet = f2Var.f6627b0;
                hashSet.remove(Long.valueOf(j10));
                f2Var.V.b(true, hashSet, new x1(f2Var, 5), null);
                f2Var.b0(true, false);
                return;
            case 1:
                int i12 = h5.d0.f6937a;
                k3.f fVar = ((j3.c0) ((l3.q) ((f7.b) obj).f6013c)).f8441a.f8561q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1010, new k3.c(p10, j10));
                return;
            case 2:
                qc.a0((ja) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 3:
                qc.a0((ga1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 4:
                ((nh.q) obj).f15778s.e0(j10, false);
                return;
            case 5:
                d4 d4Var = ((nh.p2) obj).f15742a;
                if (j10 <= 0) {
                    z4 = true;
                }
                d4Var.k0(z4);
                return;
            case 6:
                AndroidUtilities.runOnUIThread((q3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 7:
                org.telegram.ui.ActionBar.p2 d02 = ga1.d0(MessagesController.getInstance(((t6) obj).f15917a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    da daVar = da.C2;
                    if (daVar != null && daVar.d) {
                        ?? obj2 = new Object();
                        obj2.f20478a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 8:
                MessagesStorage messagesStorage = ((g7) obj).f15366b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 9:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (sc[]) obj);
                return;
            case 10:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                return;
            case 11:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                return;
            case 12:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 13:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 14:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 15:
                y3 y3Var = (y3) obj;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(kh.a2.g(j10, "user_id")));
                    return;
                }
                return;
            case 16:
                ic Q = qc.a0((b7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f25680r = false;
                Q.j();
                return;
            case 17:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(xn.R9(j10));
                return;
            case 18:
                vf0 vf0Var = (vf0) obj;
                vf0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new qf0(vf0Var, 1), 100L);
                return;
            case 19:
                eh0 eh0Var = (eh0) obj;
                Activity activity = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        f6Var = U2.getResourceProvider();
                    }
                } else {
                    f6Var = new nh.b();
                }
                new z9(activity, f6Var, this.f6818b, 15, "", new bh0(eh0Var, 0), 0L).show();
                return;
            case 20:
                oy oyVar = (oy) obj;
                oyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                oyVar.f37131z2.w(oyVar, arrayList, null, false, oyVar.G2, oyVar.H2, oyVar.I2, null);
                return;
            case 21:
                ((c60) obj).m1(j10, false);
                return;
            case 22:
                vb0 vb0Var = (vb0) obj;
                vb0Var.getClass();
                vb0Var.presentFragment(xn.R9(j10));
                return;
            case 23:
                xn xnVar = ((ii) obj).e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 24:
                ((kh.a1) obj).run(Long.valueOf(j10));
                return;
            case 25:
                org.telegram.ui.web.c0 c0Var = (org.telegram.ui.web.c0) obj;
                c0Var.getClass();
                c0Var.presentFragment(xn.R9(j10));
                return;
            case 26:
                z7 z7Var = (z7) obj;
                Context context = z7Var.getContext();
                f8 f8Var = z7Var.T;
                z4.S(context, f8Var.attachedFragment, f8.Y(f8Var), new f3.e(z7Var, j10, 11));
                return;
            case 27:
                da daVar2 = (da) obj;
                y9 y9Var2 = daVar2.C;
                if (y9Var2 != null) {
                    y9Var2.f(true);
                    daVar2.C = null;
                }
                u9 u9Var = daVar2.f41546x;
                if (u9Var != null) {
                    y9Var = u9Var.a(j10);
                } else {
                    y9Var = null;
                }
                daVar2.C = y9Var;
                if (y9Var != null) {
                    daVar2.G = y9Var.f42631a;
                    daVar2.f41525r.c();
                    p9 p9Var = daVar2.f41486e0;
                    int i13 = daVar2.G;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    p9Var.setBackgroundColor(i11);
                    daVar2.E.set(daVar2.C.f42633c);
                    y9 y9Var3 = daVar2.C;
                    daVar2.D = y9Var3.f42632b;
                    y9Var3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                daVar2.f41546x = null;
                Activity activity2 = daVar2.f41475b;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).f31656w0.post(new h8(daVar2, 5));
                    return;
                } else {
                    daVar2.q(true);
                    return;
                }
            case 28:
                ia iaVar = ((oa) obj).f42071a;
                if (iaVar != null) {
                    iaVar.C(j10, false);
                    return;
                }
                return;
            default:
                sh.i0.r((sh.i0) obj, j10);
                return;
        }
    }

    public y1(Object obj, long j10, int i10) {
        this.f6817a = i10;
        this.f6819c = obj;
        this.f6818b = j10;
    }
}
