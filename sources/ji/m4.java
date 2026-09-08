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
import org.telegram.ui.Components.d90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ai0;
import org.telegram.ui.ni1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import zh.j7;
import zh.l7;
import zh.v7;
public final class m4 implements View.OnClickListener {
    public final int f14089a;
    public final Object f14090b;

    public m4(Object obj, int i10) {
        this.f14089a = i10;
        this.f14090b = obj;
    }

    @Override
    public final void onClick(View view) {
        n4 n4Var;
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f14089a) {
            case 0:
                p4 p4Var = (p4) this.f14090b;
                a aVar = p4Var.f13775a;
                if (aVar != null && (n4Var = p4Var.G) != null) {
                    ((r3) n4Var).f14170a.f14275h3.p(aVar);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f14090b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 2:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f14090b;
                if (!v0Var.f31908a) {
                    if (v0Var.f31917x == 0 && v0Var.f31918y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 3:
                ni1 ni1Var = (ni1) this.f14090b;
                if (!ni1Var.f31441a) {
                    if (ni1Var.f31449w == 0) {
                        ((Activity) ni1Var.getContext()).startActivityForResult(((MediaProjectionManager) ni1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        ni1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 4:
                Context context = (Context) this.f14090b;
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
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f14090b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                i2.g.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 6:
                ((qg.x) this.f14090b).dismiss();
                return;
            case 7:
                ((ai0) this.f14090b).run();
                return;
            case 8:
                ((rg.v2) this.f14090b).onBackPressed();
                return;
            case 9:
                ((ug) this.f14090b).run();
                return;
            case 10:
                ((d90) this.f14090b).performClick();
                return;
            case 11:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((sg.o1) this.f14090b).f46240t0, null, "profile", null);
                return;
            case 12:
                final ug.h0 h0Var = (ug.h0) this.f14090b;
                wg.a aVar2 = h0Var.Q0;
                if (!aVar2.f48523a.N) {
                    aVar2.b(true);
                    String str = h0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new f0(h0Var2, 1), 200L);
                                    return;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
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
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new f0(h0Var2, 1), 200L);
                                    return;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
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
                ((ug.k0) this.f14090b).dismiss();
                return;
            case 14:
                ((ug.c0) ((vg.e) this.f14090b)).f47126r.dismiss();
                return;
            case 15:
                Runnable runnable = ((yg.c) this.f14090b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                ((yh.c) this.f14090b).dismiss();
                return;
            case 17:
                ((yh.c0) this.f14090b).dismiss();
                return;
            case 18:
                if (((yh.p1) this.f14090b).f50517f0.f52145f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21169a = true;
                    R.showAsSheet(new v7(), obj);
                    return;
                }
                return;
            case 19:
                ((zh.s) this.f14090b).dismiss();
                return;
            case 20:
                ((zh.e0) this.f14090b).dismiss();
                return;
            case 21:
                zh.i0 i0Var = (zh.i0) this.f14090b;
                zf.b bVar = i0Var.E.f51653a;
                zf.b bVar2 = zf.b.f51656b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f51655a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.f52038c.setText("");
                return;
            case 22:
                ((zh.s0) this.f14090b).dismiss();
                return;
            case 23:
                ((zh.q1) this.f14090b).run();
                return;
            case 24:
                ((zh.q1) this.f14090b).run();
                return;
            case 25:
                zh.c3 c3Var = (zh.c3) this.f14090b;
                c3Var.getClass();
                new l7(c3Var.f51767b, c3Var.f51771g).show();
                return;
            case 26:
                ((zh.v3) this.f14090b).dismiss();
                return;
            case 27:
                ((zh.v5) this.f14090b).run();
                return;
            default:
                if (((j7) ((o20) this.f14090b).d).f52145f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21169a = true;
                    R2.showAsSheet(new v7(), obj2);
                    return;
                }
                return;
        }
    }
}
