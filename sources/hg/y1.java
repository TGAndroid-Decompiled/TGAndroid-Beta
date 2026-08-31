package hg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import mh.ja;
import mh.z9;
import oh.f4;
import oh.g7;
import oh.r3;
import oh.t6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b7;
import org.telegram.ui.d60;
import org.telegram.ui.ha1;
import org.telegram.ui.ii;
import org.telegram.ui.py;
import org.telegram.ui.wb0;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import qh.ca;
import qh.d8;
import qh.g8;
import qh.ga;
import qh.ma;
import qh.n9;
import qh.s9;
import qh.x7;
import qh.x9;
public final class y1 implements Runnable {
    public final int f7675a;
    public final long f7676b;
    public final Object f7677c;

    public y1(Object obj, long j10, int i10) {
        this.f7675a = i10;
        this.f7677c = obj;
        this.f7676b = j10;
    }

    @Override
    public final void run() {
        x9 x9Var;
        int i10 = this.f7675a;
        g6 g6Var = null;
        boolean z4 = false;
        r7 = 0;
        int i11 = 0;
        long j10 = this.f7676b;
        Object obj = this.f7677c;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj;
                HashSet hashSet = f2Var.f7471b0;
                hashSet.remove(Long.valueOf(j10));
                f2Var.V.b(true, hashSet, new x1(f2Var, 5), null);
                f2Var.b0(true, false);
                return;
            case 1:
                int i12 = h5.d0.f7237a;
                k3.f fVar = ((j3.c0) ((l3.q) ((f7.b) obj).f6121c)).f9000a.f9128q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1010, new k3.c(p10, j10));
                return;
            case 2:
                qc.a0((ja) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 3:
                qc.a0((ha1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 4:
                ((oh.p) obj).f17598s.e0(j10, false);
                return;
            case 5:
                f4 f4Var = ((oh.q2) obj).f17651a;
                if (j10 <= 0) {
                    z4 = true;
                }
                f4Var.k0(z4);
                return;
            case 6:
                AndroidUtilities.runOnUIThread((r3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 7:
                org.telegram.ui.ActionBar.p2 d02 = ha1.d0(MessagesController.getInstance(((t6) obj).f17770a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ca caVar = ca.C2;
                    if (caVar != null && caVar.d) {
                        ?? obj2 = new Object();
                        obj2.f22156a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 8:
                MessagesStorage messagesStorage = ((g7) obj).f17164b;
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
                y3 y3Var = (y3) obj;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(l.d.g(j10, "user_id")));
                    return;
                }
                return;
            case 15:
                ic Q = qc.a0((b7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f27753r = false;
                Q.j();
                return;
            case 16:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(xn.R9(j10));
                return;
            case 17:
                xf0 xf0Var = (xf0) obj;
                xf0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new sf0(xf0Var, 1), 100L);
                return;
            case 18:
                gh0 gh0Var = (gh0) obj;
                Activity activity = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        g6Var = U2.getResourceProvider();
                    }
                } else {
                    g6Var = new oh.b();
                }
                new z9(activity, g6Var, this.f7676b, 15, "", new dh0(gh0Var, 0), 0L).show();
                return;
            case 19:
                py pyVar = (py) obj;
                pyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                pyVar.f40308z2.v(pyVar, arrayList, null, false, pyVar.G2, pyVar.H2, pyVar.I2, null);
                return;
            case 20:
                ((d60) obj).m1(j10, false);
                return;
            case 21:
                wb0 wb0Var = (wb0) obj;
                wb0Var.getClass();
                wb0Var.presentFragment(xn.R9(j10));
                return;
            case 22:
                xn xnVar = ((ii) obj).f37863e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 23:
                ((lh.a1) obj).run(Long.valueOf(j10));
                return;
            case 24:
                org.telegram.ui.web.c0 c0Var = (org.telegram.ui.web.c0) obj;
                c0Var.getClass();
                c0Var.presentFragment(xn.R9(j10));
                return;
            case 25:
                x7 x7Var = (x7) obj;
                Context context = x7Var.getContext();
                d8 d8Var = x7Var.T;
                z4.S(context, d8Var.attachedFragment, d8.Y(d8Var), new f3.e(x7Var, j10, 11));
                return;
            case 26:
                ca caVar2 = (ca) obj;
                x9 x9Var2 = caVar2.C;
                if (x9Var2 != null) {
                    x9Var2.f(true);
                    caVar2.C = null;
                }
                s9 s9Var = caVar2.f45149x;
                if (s9Var != null) {
                    x9Var = s9Var.a(j10);
                } else {
                    x9Var = null;
                }
                caVar2.C = x9Var;
                if (x9Var != null) {
                    caVar2.G = x9Var.f46303a;
                    caVar2.f45128r.c();
                    n9 n9Var = caVar2.f45089e0;
                    int i13 = caVar2.G;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    n9Var.setBackgroundColor(i11);
                    caVar2.E.set(caVar2.C.f46305c);
                    x9 x9Var3 = caVar2.C;
                    caVar2.D = x9Var3.f46304b;
                    x9Var3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                caVar2.f45149x = null;
                Activity activity2 = caVar2.f45077b;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).f34178w0.post(new g8(caVar2, 5));
                    return;
                } else {
                    caVar2.q(true);
                    return;
                }
            case 27:
                ga gaVar = ((ma) obj).f45687a;
                if (gaVar != null) {
                    gaVar.B(j10, false);
                    return;
                }
                return;
            case 28:
                th.i0.r((th.i0) obj, j10);
                return;
            default:
                th.n0 n0Var = (th.n0) obj;
                n0Var.f48169i = null;
                n0Var.f48168g.l(j10);
                n0Var.f48172l++;
                n0Var.a();
                th.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.e();
                    return;
                }
                return;
        }
    }
}
