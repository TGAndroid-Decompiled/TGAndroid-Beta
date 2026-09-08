package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import di.bc;
import di.gc;
import di.kc;
import di.pc;
import di.tc;
import di.zc;
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
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.co;
import org.telegram.ui.ec0;
import org.telegram.ui.j60;
import org.telegram.ui.mi;
import org.telegram.ui.nf;
import org.telegram.ui.uy;
public final class g implements Runnable {
    public final int f3022a;
    public final long f3023b;
    public final Object f3024c;

    public g(Object obj, long j3, int i10) {
        this.f3022a = i10;
        this.f3024c = obj;
        this.f3023b = j3;
    }

    @Override
    public final void run() {
        kc kcVar;
        int i10 = this.f3022a;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        boolean z10 = false;
        r7 = 0;
        int i11 = 0;
        long j3 = this.f3023b;
        Object obj = this.f3024c;
        switch (i10) {
            case 0:
                ((v) obj).f3897s.e0(j3, false);
                return;
            case 1:
                o5 o5Var = ((o3) obj).f3425a;
                if (j3 <= 0) {
                    z10 = true;
                }
                o5Var.k0(z10);
                return;
            case 2:
                AndroidUtilities.runOnUIThread((x4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(MessagesController.getInstance(((u8) obj).f3832a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    pc pcVar = pc.F2;
                    if (pcVar != null && pcVar.d) {
                        ?? obj2 = new Object();
                        obj2.f21169a = true;
                        R.showAsSheet(d02, obj2);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            case 4:
                MessagesStorage messagesStorage = ((h9) obj).f3101b;
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
                di.ba baVar = (di.ba) obj;
                Context context = baVar.getContext();
                di.ia iaVar = baVar.W;
                org.telegram.ui.Components.e5.S(context, iaVar.attachedFragment, di.ia.Y(iaVar), new p1(baVar, j3, 1));
                return;
            case 6:
                pc pcVar2 = (pc) obj;
                kc kcVar2 = pcVar2.F;
                if (kcVar2 != null) {
                    kcVar2.f(true);
                    pcVar2.F = null;
                }
                gc gcVar = pcVar2.f7944x;
                if (gcVar != null) {
                    kcVar = gcVar.a(j3);
                } else {
                    kcVar = null;
                }
                pcVar2.F = kcVar;
                if (kcVar != null) {
                    pcVar2.J = kcVar.f7510a;
                    pcVar2.f7923r.c();
                    bc bcVar = pcVar2.f7894h0;
                    int i12 = pcVar2.J;
                    if (i12 != 1 && i12 != 0) {
                        i11 = -14737633;
                    }
                    bcVar.setBackgroundColor(i11);
                    pcVar2.H.set(pcVar2.F.f7512c);
                    kc kcVar3 = pcVar2.F;
                    pcVar2.G = kcVar3.f7511b;
                    kcVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                pcVar2.f7944x = null;
                Activity activity = pcVar2.f7872b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f33498z0.post(new di.ka(pcVar2, 5));
                    return;
                } else {
                    pcVar2.q(true);
                    return;
                }
            case 7:
                tc tcVar = ((zc) obj).f8563a;
                if (tcVar != null) {
                    tcVar.m(j3, false);
                    return;
                }
                return;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.f10739e, new gi.t((gi.k0) obj, 1));
                return;
            case 9:
                gi.t0 t0Var = (gi.t0) obj;
                t0Var.f10803i = null;
                t0Var.f10802g.l(j3);
                t0Var.f10806l++;
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.l();
                    return;
                }
                return;
            case 10:
                ji.r rVar = (ji.r) obj;
                org.telegram.ui.Components.e5.M(rVar.f28780b.f31306f0.getParentActivity(), j3, new xa.c(rVar, 22), rVar.f28779a);
                return;
            case 11:
                ji.c2 c2Var = (ji.c2) obj;
                org.telegram.ui.Components.e5.M(c2Var.getParentActivity(), j3, new a6.i(c2Var, 28), c2Var.getResourceProvider());
                return;
            case 12:
                String str = e2.d0.f8765a;
                j2.f fVar = ((i2.c0) ((k2.j) ((n4.y) obj).f16524c)).f11497a.f11559s;
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
                    U.presentFragment(new co(w.f.e(j3, "user_id")));
                    return;
                }
                return;
            case 19:
                qc Q = yc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f29714r = false;
                Q.j();
                return;
            case 20:
                dg dgVar = (dg) obj;
                dgVar.getClass();
                dgVar.presentFragment(co.R9(j3));
                return;
            case 21:
                qf0 qf0Var = (qf0) obj;
                qf0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mf0(qf0Var, 1), 100L);
                return;
            case 22:
                yg0 yg0Var = (yg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        f6Var = U2.getResourceProvider();
                    }
                } else {
                    f6Var = new b();
                }
                new zh.k7(activity2, f6Var, this.f3023b, 15, "", new vg0(yg0Var, 0), 0L).show();
                return;
            case 23:
                uy uyVar = (uy) obj;
                uyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                return;
            case 24:
                ((j60) obj).m1(j3, false);
                return;
            case 25:
                ec0 ec0Var = (ec0) obj;
                ec0Var.getClass();
                ec0Var.presentFragment(co.R9(j3));
                return;
            case 26:
                co coVar = ((mi) obj).f38742e;
                coVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == coVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                coVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 27:
                ((nf) obj).run(Long.valueOf(j3));
                return;
            case 28:
                org.telegram.ui.web.g0 g0Var = (org.telegram.ui.web.g0) obj;
                g0Var.getClass();
                g0Var.presentFragment(co.R9(j3));
                return;
            default:
                ug.a1 a1Var = (ug.a1) obj;
                HashSet hashSet = a1Var.f47075e0;
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y.b(true, hashSet, new ug.u0(a1Var, 5), null);
                a1Var.b0(true, false);
                return;
        }
    }
}
