package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ec0;
import org.telegram.ui.eo;
import org.telegram.ui.fb1;
import org.telegram.ui.j60;
import org.telegram.ui.oi;
import org.telegram.ui.pf;
import org.telegram.ui.wy;
public final class va implements Runnable {
    public final int f3799a;
    public final long f3800b;
    public final Object f3801c;

    public va(Object obj, long j3, int i10) {
        this.f3799a = i10;
        this.f3801c = obj;
        this.f3800b = j3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 f6Var;
        xd xdVar;
        int i10 = this.f3799a;
        org.telegram.ui.ActionBar.f6 f6Var2 = null;
        int i11 = 0;
        boolean z10 = false;
        i11 = 0;
        long j3 = this.f3800b;
        Object obj = this.f3801c;
        switch (i10) {
            case 0:
                kb kbVar = (kb) obj;
                Context context = kbVar.getContext();
                rb rbVar = kbVar.W;
                org.telegram.ui.ActionBar.p2 p2Var = rbVar.attachedFragment;
                f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                org.telegram.ui.Components.d5.S(context, p2Var, f6Var, new za(kbVar, j3, 0));
                return;
            case 1:
                ce ceVar = (ce) obj;
                xd xdVar2 = ceVar.F;
                if (xdVar2 != null) {
                    xdVar2.f(true);
                    ceVar.F = null;
                }
                sd sdVar = ceVar.f2504x;
                if (sdVar != null) {
                    xdVar = sdVar.a(j3);
                } else {
                    xdVar = null;
                }
                ceVar.F = xdVar;
                if (xdVar != null) {
                    ceVar.J = xdVar.f3942a;
                    ceVar.f2483r.c();
                    kd kdVar = ceVar.f2454h0;
                    int i12 = ceVar.J;
                    if (i12 != 1 && i12 != 0) {
                        i11 = -14737633;
                    }
                    kdVar.setBackgroundColor(i11);
                    ceVar.H.set(ceVar.F.f3944c);
                    xd xdVar3 = ceVar.F;
                    ceVar.G = xdVar3.f3943b;
                    xdVar3.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                ceVar.f2504x = null;
                Activity activity = ceVar.f2433b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f29975z0.post(new tb(ceVar, 5));
                    return;
                } else {
                    ceVar.q(true);
                    return;
                }
            case 2:
                ge geVar = ((me) obj).f3148a;
                if (geVar != null) {
                    geVar.n(j3, false);
                    return;
                }
                return;
            case 3:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.e, new ei.t((ei.k0) obj, 1));
                return;
            case 4:
                ei.t0 t0Var = (ei.t0) obj;
                t0Var.f7628i = null;
                t0Var.f7627g.l(j3);
                t0Var.f7631l++;
                t0Var.a();
                ei.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.F();
                    return;
                }
                return;
            case 5:
                hi.s sVar = (hi.s) obj;
                org.telegram.ui.Components.d5.M(sVar.f26422b.f29366f0.getParentActivity(), j3, new pb.c(sVar, 23), sVar.f26421a);
                return;
            case 6:
                hi.g2 g2Var = (hi.g2) obj;
                org.telegram.ui.Components.d5.M(g2Var.getParentActivity(), j3, new pb.c(g2Var, 24), g2Var.getResourceProvider());
                return;
            case 7:
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((k2.j) ((of.b) obj).f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1010, new j2.d(p5, j3));
                return;
            case 8:
                ((LocationController) obj).lambda$removeSharingLocation$21(j3);
                return;
            case 9:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j3);
                return;
            case 10:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                return;
            case 11:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                return;
            case 12:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                return;
            case 13:
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) obj;
                if (w3Var != null) {
                    w3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new eo(w.f.e(j3, "user_id")));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.pc Q = org.telegram.ui.Components.wc.a0((org.telegram.ui.y6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.f26089r = false;
                Q.j();
                return;
            case 15:
                eg egVar = (eg) obj;
                egVar.getClass();
                egVar.presentFragment(eo.R9(j3));
                return;
            case 16:
                zf0 zf0Var = (zf0) obj;
                zf0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new vf0(zf0Var, 1), 100L);
                return;
            case 17:
                ih0 ih0Var = (ih0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (!PhotoViewer.t1().Q1() && (U2 == null || !U2.hasShownSheet())) {
                    if (U2 != null) {
                        f6Var2 = U2.getResourceProvider();
                    }
                } else {
                    f6Var2 = new zh.b();
                }
                new xh.o7(activity2, f6Var2, this.f3800b, 15, "", new fh0(ih0Var, 0), 0L).show();
                return;
            case 18:
                wy wyVar = (wy) obj;
                wyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                wyVar.C2.v(wyVar, arrayList, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
                return;
            case 19:
                ((j60) obj).m1(j3, false);
                return;
            case 20:
                ec0 ec0Var = (ec0) obj;
                ec0Var.getClass();
                ec0Var.presentFragment(eo.R9(j3));
                return;
            case 21:
                eo eoVar = ((oi) obj).e;
                eoVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == eoVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 22:
                ((pf) obj).run(Long.valueOf(j3));
                return;
            case 23:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) obj;
                f0Var.getClass();
                f0Var.presentFragment(eo.R9(j3));
                return;
            case 24:
                sg.c1 c1Var = (sg.c1) obj;
                HashSet hashSet = c1Var.f41883e0;
                hashSet.remove(Long.valueOf(j3));
                c1Var.Y.b(true, hashSet, new sg.v0(c1Var, 5), null);
                c1Var.b0(true, false);
                return;
            case 25:
                org.telegram.ui.Components.wc.a0((xh.z7) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j3), R.raw.stars_topup).k(true);
                return;
            case 26:
                org.telegram.ui.Components.wc.a0((fb1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j3), R.raw.stars_topup).k(true);
                return;
            case 27:
                ((zh.l) obj).f48619s.e0(j3, false);
                return;
            case 28:
                zh.a3 a3Var = ((zh.u1) obj).f48908a;
                if (j3 <= 0) {
                    z10 = true;
                }
                a3Var.k0(z10);
                return;
            default:
                AndroidUtilities.runOnUIThread((zh.p2) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
        }
    }
}
