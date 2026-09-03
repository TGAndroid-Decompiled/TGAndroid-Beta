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
import org.telegram.ui.ii;
import org.telegram.ui.na1;
import org.telegram.ui.py;
import org.telegram.ui.wb0;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import qh.ba;
import qh.c8;
import qh.f8;
import qh.fa;
import qh.la;
import qh.m9;
import qh.r9;
import qh.w7;
import qh.w9;
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
        w9 w9Var;
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
                qc.a0((na1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 4:
                ((oh.p) obj).f17600s.e0(j10, false);
                return;
            case 5:
                f4 f4Var = ((oh.q2) obj).f17653a;
                if (j10 <= 0) {
                    z4 = true;
                }
                f4Var.k0(z4);
                return;
            case 6:
                AndroidUtilities.runOnUIThread((r3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 7:
                org.telegram.ui.ActionBar.p2 d02 = na1.d0(MessagesController.getInstance(((t6) obj).f17772a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ba baVar = ba.C2;
                    if (baVar != null && baVar.d) {
                        ?? obj2 = new Object();
                        obj2.f22158a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 8:
                MessagesStorage messagesStorage = ((g7) obj).f17166b;
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
                Q.f27786r = false;
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
                pyVar.f40278z2.v(pyVar, arrayList, null, false, pyVar.G2, pyVar.H2, pyVar.I2, null);
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
                xn xnVar = ((ii) obj).f37666e;
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
                w7 w7Var = (w7) obj;
                Context context = w7Var.getContext();
                c8 c8Var = w7Var.T;
                z4.S(context, c8Var.attachedFragment, c8.Y(c8Var), new f3.e(w7Var, j10, 11));
                return;
            case 26:
                ba baVar2 = (ba) obj;
                w9 w9Var2 = baVar2.C;
                if (w9Var2 != null) {
                    w9Var2.f(true);
                    baVar2.C = null;
                }
                r9 r9Var = baVar2.f45115x;
                if (r9Var != null) {
                    w9Var = r9Var.a(j10);
                } else {
                    w9Var = null;
                }
                baVar2.C = w9Var;
                if (w9Var != null) {
                    baVar2.G = w9Var.f46276a;
                    baVar2.f45094r.c();
                    m9 m9Var = baVar2.f45055e0;
                    int i13 = baVar2.G;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    m9Var.setBackgroundColor(i11);
                    baVar2.E.set(baVar2.C.f46278c);
                    w9 w9Var3 = baVar2.C;
                    baVar2.D = w9Var3.f46277b;
                    w9Var3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                baVar2.f45115x = null;
                Activity activity2 = baVar2.f45043b;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).f34178w0.post(new f8(baVar2, 5));
                    return;
                } else {
                    baVar2.q(true);
                    return;
                }
            case 27:
                fa faVar = ((la) obj).f45661a;
                if (faVar != null) {
                    faVar.B(j10, false);
                    return;
                }
                return;
            case 28:
                th.i0.r((th.i0) obj, j10);
                return;
            default:
                th.n0 n0Var = (th.n0) obj;
                n0Var.f48205i = null;
                n0Var.f48204g.l(j10);
                n0Var.f48208l++;
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
