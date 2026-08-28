package bg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import gh.ea;
import gh.oa;
import ih.i4;
import ih.i7;
import ih.u3;
import ih.v6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kh.ac;
import kh.gc;
import kh.ib;
import kh.n9;
import kh.nb;
import kh.rb;
import kh.t9;
import kh.v9;
import kh.wb;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.df;
import org.telegram.ui.dy;
import org.telegram.ui.jb0;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.y3;
import org.telegram.ui.y6;
public final class i2 implements Runnable {
    public final int f1837a;
    public final long f1838b;
    public final Object f1839c;

    public i2(long j10, qc[] qcVarArr) {
        this.f1837a = 14;
        this.f1838b = j10;
        this.f1839c = qcVarArr;
    }

    @Override
    public final void run() {
        rb rbVar;
        int i9 = this.f1837a;
        b6 b6Var = null;
        boolean z10 = false;
        r7 = 0;
        int i10 = 0;
        long j10 = this.f1838b;
        Object obj = this.f1839c;
        switch (i9) {
            case 0:
                q2 q2Var = (q2) obj;
                HashSet hashSet = q2Var.f1923a0;
                hashSet.remove(Long.valueOf(j10));
                q2Var.U.b(true, hashSet, new h2(q2Var, 5), null);
                q2Var.a0(true, false);
                return;
            case 1:
                oc.a0((oa) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 2:
                oc.a0((s91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 3:
                ((ih.r) obj).f12042s.e0(j10, false);
                return;
            case 4:
                i4 i4Var = ((ih.q2) obj).f11997a;
                if (j10 <= 0) {
                    z10 = true;
                }
                i4Var.k0(z10);
                return;
            case 5:
                AndroidUtilities.runOnUIThread((u3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 6:
                org.telegram.ui.ActionBar.o2 c02 = s91.c0(MessagesController.getInstance(((v6) obj).f12236a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    wb wbVar = wb.B2;
                    if (wbVar != null && wbVar.d) {
                        ?? obj2 = new Object();
                        obj2.f23653a = true;
                        R.showAsSheet(c02, obj2);
                        return;
                    }
                    R.presentFragment(c02);
                    return;
                }
                return;
            case 7:
                MessagesStorage messagesStorage = ((i7) obj).f11620b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 8:
                j3.n nVar = ((j3.m) obj).f13292b;
                int i11 = d5.f0.f4349a;
                i3.f fVar = ((h3.h0) nVar).f9440a.f9557r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1010, new i3.d(k10, j10));
                return;
            case 9:
                n9 n9Var = (n9) obj;
                Context context = n9Var.getContext();
                t9 t9Var = n9Var.S;
                y4.S(context, t9Var.attachedFragment, t9.X(t9Var), new d3.e(n9Var, j10, 2));
                return;
            case 10:
                wb wbVar2 = (wb) obj;
                rb rbVar2 = wbVar2.B;
                if (rbVar2 != null) {
                    rbVar2.f(true);
                    wbVar2.B = null;
                }
                nb nbVar = wbVar2.f16321x;
                if (nbVar != null) {
                    rbVar = nbVar.a(j10);
                } else {
                    rbVar = null;
                }
                wbVar2.B = rbVar;
                if (rbVar != null) {
                    wbVar2.F = rbVar.f15972a;
                    wbVar2.f16300r.c();
                    ib ibVar = wbVar2.f16257d0;
                    int i12 = wbVar2.F;
                    if (i12 != 1 && i12 != 0) {
                        i10 = -14737633;
                    }
                    ibVar.setBackgroundColor(i10);
                    wbVar2.D.set(wbVar2.B.f15974c);
                    rb rbVar3 = wbVar2.B;
                    wbVar2.C = rbVar3.f15973b;
                    rbVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                wbVar2.f16321x = null;
                Activity activity = wbVar2.f16249b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f35536v0.post(new v9(wbVar2, 5));
                    return;
                } else {
                    wbVar2.q(true);
                    return;
                }
            case 11:
                ac acVar = ((gc) obj).f15326a;
                if (acVar != null) {
                    acVar.Q(j10, false);
                    return;
                }
                return;
            case 12:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.f18651e, new nh.s((nh.j0) obj, 1));
                return;
            case 13:
                nh.q0 q0Var = (nh.q0) obj;
                q0Var.f18704i = null;
                q0Var.f18703g.l(j10);
                q0Var.f18707l++;
                q0Var.a();
                nh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.c();
                    return;
                }
                return;
            case 14:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (qc[]) obj);
                return;
            case 15:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                return;
            case 16:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                return;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 18:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 19:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 20:
                y3 y3Var = (y3) obj;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new qn(e2.c.g(j10, "user_id")));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.gc Q = oc.a0((y6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f28745r = false;
                Q.j();
                return;
            case 22:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(qn.R9(j10));
                return;
            case 23:
                ze0 ze0Var = (ze0) obj;
                ze0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new te0(ze0Var, 1), 100L);
                return;
            case 24:
                kg0 kg0Var = (kg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        b6Var = U2.getResourceProvider();
                    }
                } else {
                    b6Var = new ih.b();
                }
                new ea(activity2, b6Var, this.f1838b, 15, "", new gg0(kg0Var, 0), 0L).show();
                return;
            case 25:
                dy dyVar = (dy) obj;
                dyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                dyVar.f37752y2.v(dyVar, arrayList, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
                return;
            case 26:
                ((o50) obj).m1(j10, false);
                return;
            case 27:
                jb0 jb0Var = (jb0) obj;
                jb0Var.getClass();
                jb0Var.presentFragment(qn.R9(j10));
                return;
            case 28:
                qn qnVar = ((ai) obj).f36502e;
                qnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                ((df) obj).run(Long.valueOf(j10));
                return;
        }
    }

    public i2(Object obj, long j10, int i9) {
        this.f1837a = i9;
        this.f1839c = obj;
        this.f1838b = j10;
    }
}
