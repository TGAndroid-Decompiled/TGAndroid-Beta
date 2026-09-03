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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a4;
import org.telegram.ui.d7;
import org.telegram.ui.e60;
import org.telegram.ui.ki;
import org.telegram.ui.oa1;
import org.telegram.ui.qy;
import org.telegram.ui.xb0;
import org.telegram.ui.zn;
import ph.da;
import ph.e8;
import ph.g8;
import ph.ia;
import ph.oa;
import ph.p9;
import ph.u9;
import ph.y7;
import ph.y9;
public final class y1 implements Runnable {
    public final int f6804a;
    public final long f6805b;
    public final Object f6806c;

    public y1(Object obj, long j10, int i10) {
        this.f6804a = i10;
        this.f6806c = obj;
        this.f6805b = j10;
    }

    @Override
    public final void run() {
        y9 y9Var;
        int i10 = this.f6804a;
        f6 f6Var = null;
        boolean z4 = false;
        r7 = 0;
        int i11 = 0;
        long j10 = this.f6805b;
        Object obj = this.f6806c;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj;
                HashSet hashSet = f2Var.f6614b0;
                hashSet.remove(Long.valueOf(j10));
                f2Var.V.b(true, hashSet, new x1(f2Var, 5), null);
                f2Var.b0(true, false);
                return;
            case 1:
                int i12 = h5.d0.f6924a;
                k3.f fVar = ((j3.c0) ((l3.q) ((f7.b) obj).f6002c)).f8423a.f8543q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1010, new k3.c(p10, j10));
                return;
            case 2:
                qc.a0((ja) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 3:
                qc.a0((oa1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 4:
                ((nh.q) obj).f15758s.e0(j10, false);
                return;
            case 5:
                d4 d4Var = ((nh.p2) obj).f15722a;
                if (j10 <= 0) {
                    z4 = true;
                }
                d4Var.k0(z4);
                return;
            case 6:
                AndroidUtilities.runOnUIThread((q3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 7:
                org.telegram.ui.ActionBar.p2 d02 = oa1.d0(MessagesController.getInstance(((t6) obj).f15897a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    da daVar = da.C2;
                    if (daVar != null && daVar.d) {
                        ?? obj2 = new Object();
                        obj2.f20453a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 8:
                MessagesStorage messagesStorage = ((g7) obj).f15346b;
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
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                return;
            case 10:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                return;
            case 11:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 12:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 13:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 14:
                a4 a4Var = (a4) obj;
                if (a4Var != null) {
                    a4Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new zn(kf.k0.g(j10, "user_id")));
                    return;
                }
                return;
            case 15:
                ic Q = qc.a0((d7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f25679r = false;
                Q.j();
                return;
            case 16:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(zn.R9(j10));
                return;
            case 17:
                wf0 wf0Var = (wf0) obj;
                wf0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new rf0(wf0Var, 1), 100L);
                return;
            case 18:
                fh0 fh0Var = (fh0) obj;
                Activity activity = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        f6Var = U2.getResourceProvider();
                    }
                } else {
                    f6Var = new nh.b();
                }
                new z9(activity, f6Var, this.f6805b, 15, "", new ch0(fh0Var, 0), 0L).show();
                return;
            case 19:
                qy qyVar = (qy) obj;
                qyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                qyVar.f37649z2.w(qyVar, arrayList, null, false, qyVar.G2, qyVar.H2, qyVar.I2, null);
                return;
            case 20:
                ((e60) obj).m1(j10, false);
                return;
            case 21:
                xb0 xb0Var = (xb0) obj;
                xb0Var.getClass();
                xb0Var.presentFragment(zn.R9(j10));
                return;
            case 22:
                zn znVar = ((ki) obj).e;
                znVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == znVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 23:
                ((kh.a1) obj).run(Long.valueOf(j10));
                return;
            case 24:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) obj;
                e0Var.getClass();
                e0Var.presentFragment(zn.R9(j10));
                return;
            case 25:
                y7 y7Var = (y7) obj;
                Context context = y7Var.getContext();
                e8 e8Var = y7Var.T;
                z4.S(context, e8Var.attachedFragment, e8.Y(e8Var), new f3.e(y7Var, j10, 11));
                return;
            case 26:
                da daVar2 = (da) obj;
                y9 y9Var2 = daVar2.C;
                if (y9Var2 != null) {
                    y9Var2.f(true);
                    daVar2.C = null;
                }
                u9 u9Var = daVar2.f41584x;
                if (u9Var != null) {
                    y9Var = u9Var.a(j10);
                } else {
                    y9Var = null;
                }
                daVar2.C = y9Var;
                if (y9Var != null) {
                    daVar2.G = y9Var.f42671a;
                    daVar2.f41563r.c();
                    p9 p9Var = daVar2.f41524e0;
                    int i13 = daVar2.G;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    p9Var.setBackgroundColor(i11);
                    daVar2.E.set(daVar2.C.f42673c);
                    y9 y9Var3 = daVar2.C;
                    daVar2.D = y9Var3.f42672b;
                    y9Var3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                daVar2.f41584x = null;
                Activity activity2 = daVar2.f41513b;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).f31630w0.post(new g8(daVar2, 5));
                    return;
                } else {
                    daVar2.q(true);
                    return;
                }
            case 27:
                ia iaVar = ((oa) obj).f42119a;
                if (iaVar != null) {
                    iaVar.C(j10, false);
                    return;
                }
                return;
            case 28:
                sh.i0.r((sh.i0) obj, j10);
                return;
            default:
                sh.n0 n0Var = (sh.n0) obj;
                n0Var.f44450i = null;
                n0Var.f44449g.l(j10);
                n0Var.f44453l++;
                n0Var.a();
                sh.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.f();
                    return;
                }
                return;
        }
    }
}
