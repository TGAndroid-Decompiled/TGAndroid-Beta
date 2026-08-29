package eg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import jh.d3;
import jh.ia;
import jh.y9;
import lh.d4;
import lh.f7;
import lh.p3;
import lh.s6;
import nh.bb;
import nh.e9;
import nh.g9;
import nh.gb;
import nh.kb;
import nh.qb;
import nh.ta;
import nh.xa;
import nh.y8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.di;
import org.telegram.ui.fy;
import org.telegram.ui.lb0;
import org.telegram.ui.r50;
import org.telegram.ui.t91;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
import org.telegram.ui.x6;
import org.telegram.ui.z3;
public final class z1 implements Runnable {
    public final int f6205a;
    public final long f6206b;
    public final Object f6207c;

    public z1(long j10, vc[] vcVarArr) {
        this.f6205a = 12;
        this.f6206b = j10;
        this.f6207c = vcVarArr;
    }

    @Override
    public final void run() {
        c6 c6Var;
        bb bbVar;
        int i10 = this.f6205a;
        c6 c6Var2 = null;
        boolean z10 = false;
        r7 = 0;
        int i11 = 0;
        long j10 = this.f6206b;
        Object obj = this.f6207c;
        switch (i10) {
            case 0:
                g2 g2Var = (g2) obj;
                HashSet hashSet = g2Var.f6003a0;
                hashSet.remove(Long.valueOf(j10));
                g2Var.U.b(true, hashSet, new y1(g2Var, 5), null);
                g2Var.b0(true, false);
                return;
            case 1:
                tc.a0((ia) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 2:
                tc.a0((t91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                return;
            case 3:
                l3.o oVar = ((l3.n) obj).f14151b;
                int i12 = f5.d0.f6579a;
                k3.f fVar = ((j3.h0) oVar).f10477a.f10594r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1010, new d3(k9, j10));
                return;
            case 4:
                ((lh.p) obj).f16066s.e0(j10, false);
                return;
            case 5:
                d4 d4Var = ((lh.o2) obj).f16013a;
                if (j10 <= 0) {
                    z10 = true;
                }
                d4Var.k0(z10);
                return;
            case 6:
                AndroidUtilities.runOnUIThread((p3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 7:
                org.telegram.ui.ActionBar.o2 d02 = t91.d0(MessagesController.getInstance(((s6) obj).f16218a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    gb gbVar = gb.B2;
                    if (gbVar != null && gbVar.d) {
                        ?? obj2 = new Object();
                        obj2.f23673a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 8:
                MessagesStorage messagesStorage = ((f7) obj).f15600b;
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
                y8 y8Var = (y8) obj;
                Context context = y8Var.getContext();
                e9 e9Var = y8Var.S;
                org.telegram.ui.ActionBar.o2 o2Var = e9Var.attachedFragment;
                c6Var = ((f3) e9Var).resourcesProvider;
                c5.S(context, o2Var, c6Var, new f3.e(y8Var, j10, 2));
                return;
            case 10:
                gb gbVar2 = (gb) obj;
                bb bbVar2 = gbVar2.B;
                if (bbVar2 != null) {
                    bbVar2.f(true);
                    gbVar2.B = null;
                }
                xa xaVar = gbVar2.f17811x;
                if (xaVar != null) {
                    bbVar = xaVar.a(j10);
                } else {
                    bbVar = null;
                }
                gbVar2.B = bbVar;
                if (bbVar != null) {
                    gbVar2.F = bbVar.f17444a;
                    gbVar2.f17790r.c();
                    ta taVar = gbVar2.f17747d0;
                    int i13 = gbVar2.F;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    taVar.setBackgroundColor(i11);
                    gbVar2.D.set(gbVar2.B.f17446c);
                    bb bbVar3 = gbVar2.B;
                    gbVar2.C = bbVar3.f17445b;
                    bbVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                gbVar2.f17811x = null;
                Activity activity = gbVar2.f17739b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f35603v0.post(new g9(gbVar2, 5));
                    return;
                } else {
                    gbVar2.q(true);
                    return;
                }
            case 11:
                kb kbVar = ((qb) obj).f18413a;
                if (kbVar != null) {
                    kbVar.I(j10, false);
                    return;
                }
                return;
            case 12:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (vc[]) obj);
                return;
            case 13:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                return;
            case 14:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                return;
            case 15:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 16:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 17:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 18:
                z3 z3Var = (z3) obj;
                if (z3Var != null) {
                    z3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new tn(j7.l1.g(j10, "user_id")));
                    return;
                }
                return;
            case 19:
                mc Q = tc.a0((x6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.f30660r = false;
                Q.j();
                return;
            case 20:
                wf wfVar = (wf) obj;
                wfVar.getClass();
                wfVar.presentFragment(tn.R9(j10));
                return;
            case 21:
                mf0 mf0Var = (mf0) obj;
                mf0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new hf0(mf0Var, 1), 100L);
                return;
            case 22:
                ug0 ug0Var = (ug0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        c6Var2 = U2.getResourceProvider();
                    }
                } else {
                    c6Var2 = new lh.b();
                }
                new y9(activity2, c6Var2, this.f6206b, 15, "", new rg0(ug0Var, 0), 0L).show();
                return;
            case 23:
                fy fyVar = (fy) obj;
                fyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                fyVar.f38379y2.v(fyVar, arrayList, null, false, fyVar.F2, fyVar.G2, fyVar.H2, null);
                return;
            case 24:
                ((r50) obj).m1(j10, false);
                return;
            case 25:
                lb0 lb0Var = (lb0) obj;
                lb0Var.getClass();
                lb0Var.presentFragment(tn.R9(j10));
                return;
            case 26:
                tn tnVar = ((di) obj).f37545e;
                tnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == tnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                tnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 27:
                ((tm) obj).run(Long.valueOf(j10));
                return;
            case 28:
                org.telegram.ui.web.d0 d0Var = (org.telegram.ui.web.d0) obj;
                d0Var.getClass();
                d0Var.presentFragment(tn.R9(j10));
                return;
            default:
                qh.i0.r((qh.i0) obj, j10);
                return;
        }
    }

    public z1(Object obj, long j10, int i10) {
        this.f6205a = i10;
        this.f6207c = obj;
        this.f6206b = j10;
    }
}
