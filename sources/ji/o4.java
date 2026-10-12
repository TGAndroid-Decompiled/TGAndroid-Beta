package ji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.da0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c90;
import org.telegram.ui.s20;
import org.telegram.ui.wi1;
import org.telegram.ui.xg;
import zh.d7;
import zh.f7;
import zh.p7;
public final class o4 implements View.OnClickListener {
    public final int f13453a;
    public final Object f13454b;

    public o4(Object obj, int i10) {
        this.f13453a = i10;
        this.f13454b = obj;
    }

    @Override
    public final void onClick(View view) {
        p4 p4Var;
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.f13453a) {
            case 0:
                r4 r4Var = (r4) this.f13454b;
                a aVar = r4Var.f13119a;
                if (aVar != null && (p4Var = r4Var.G) != null) {
                    ((t3) p4Var).f13526a.f13627f3.N(aVar);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f13454b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 2:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f13454b;
                if (!v0Var.f30544a) {
                    if (v0Var.f30552x == 0 && v0Var.f30553y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 3:
                wi1 wi1Var = (wi1) this.f13454b;
                if (!wi1Var.f30105a) {
                    if (wi1Var.f30112w == 0) {
                        ((Activity) wi1Var.getContext()).startActivityForResult(((MediaProjectionManager) wi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        wi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 4:
                Context context = (Context) this.f13454b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.h1.j();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f13454b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 6:
                ((qg.x) this.f13454b).dismiss();
                return;
            case 7:
                ((c90) this.f13454b).run();
                return;
            case 8:
                ((rg.v2) this.f13454b).onBackPressed();
                return;
            case 9:
                ((xg) this.f13454b).run();
                return;
            case 10:
                ((da0) this.f13454b).performClick();
                return;
            case 11:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((sg.m1) this.f13454b).f45270t0, null, "profile", null);
                return;
            case 12:
                final ug.g0 g0Var = (ug.g0) this.f13454b;
                wg.a aVar2 = g0Var.Q0;
                if (!aVar2.f47555a.N) {
                    aVar2.b(true);
                    String str = g0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0.d0(g0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0.d0(g0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.p(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 13:
                ((ug.j0) this.f13454b).dismiss();
                return;
            case 14:
                ((ug.b0) ((vg.e) this.f13454b)).f46283r.dismiss();
                return;
            case 15:
                Runnable runnable = ((yg.c) this.f13454b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                ((yh.d) this.f13454b).dismiss();
                return;
            case 17:
                ((yh.d0) this.f13454b).dismiss();
                return;
            case 18:
                if (((yh.p1) this.f13454b).f49062f0.f50390f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f20469a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            case 19:
                ((zh.t) this.f13454b).dismiss();
                return;
            case 20:
                ((zh.d0) this.f13454b).dismiss();
                return;
            case 21:
                zh.h0 h0Var = (zh.h0) this.f13454b;
                ag.b bVar = h0Var.E.f627a;
                ag.b bVar2 = ag.b.f630b;
                if (bVar == bVar2) {
                    bVar2 = ag.b.f629a;
                }
                h0Var.o(ag.a.i(0L, bVar2), true, false, true);
                h0Var.f50596c.setText("");
                return;
            case 22:
                ((zh.r0) this.f13454b).dismiss();
                return;
            case 23:
                ((zh.o1) this.f13454b).run();
                return;
            case 24:
                ((zh.o1) this.f13454b).run();
                return;
            case 25:
                zh.x2 x2Var = (zh.x2) this.f13454b;
                x2Var.getClass();
                new f7(x2Var.f51292b, x2Var.f51295g).show();
                return;
            case 26:
                ((zh.q3) this.f13454b).dismiss();
                return;
            case 27:
                ((zh.q5) this.f13454b).run();
                return;
            default:
                if (((d7) ((s20) this.f13454b).d).f50390f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20469a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
        }
    }
}
