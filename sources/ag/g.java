package ag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import bi.d4;
import bi.w4;
import bi.y4;
import bi.z3;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ih0;
import org.telegram.ui.nf;
import org.telegram.ui.sd1;
import rh.h8;
public final class g implements View.OnClickListener {
    public final int f526a;
    public final Object f527b;

    public g(Object obj, int i10) {
        this.f526a = i10;
        this.f527b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        bi.a aVar;
        w4 w4Var;
        org.telegram.ui.ActionBar.k2 Q;
        int i12 = this.f526a;
        Object obj = this.f527b;
        switch (i12) {
            case 0:
                j jVar = (j) obj;
                f6 f6Var = jVar.f573f;
                int i13 = jVar.f570a;
                boolean z10 = jVar.f575r;
                jVar.f575r = !z10;
                tp tpVar = jVar.h;
                if (!z10) {
                    i10 = 2131753701;
                } else {
                    i10 = 2131753698;
                }
                tpVar.c(dd.L0(i10, null), true, true);
                f6Var.a();
                if (jVar.f575r) {
                    i11 = 2131753699;
                } else {
                    i11 = 2131753700;
                }
                f6Var.c(dd.L0(i11, null), true, true);
                if (jVar.f575r) {
                    jVar.f578x |= 1;
                } else {
                    jVar.f578x &= -2;
                }
                wp.r1(i13).e7.edit().putInt("dialog_botflags" + jVar.f576s, jVar.f578x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = wp.r1(i13).i1(jVar.f576s);
                toggleconnectedbotpaused.paused = jVar.f575r;
                ConnectionsManager.getInstance(i13).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 1:
                TL_account.TL_businessChatLink tL_businessChatLink = ((g0) obj).f531f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.i0.g(tL_businessChatLink.link);
                    cc.a0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 2:
                ((ai.c) obj).dismiss();
                return;
            case 3:
                ((androidx.mediarouter.app.g) obj).dismiss();
                return;
            case 4:
                bi.t tVar = (bi.t) obj;
                tVar.J(true, 0, 0, 0L, false);
                ih0 ih0Var = tVar.O;
                if (ih0Var != null) {
                    ih0Var.g(true);
                    tVar.O = null;
                    return;
                }
                return;
            case 5:
                bi.y0 y0Var = (bi.y0) obj;
                bi.l3 l3Var = y0Var.h;
                if (l3Var != null && (aVar = y0Var.f3457f) != null) {
                    d4 d4Var = l3Var.f3182a;
                    d4Var.getClass();
                    if (d4.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f2818b;
                        bi.o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        d4Var.f31183f3.O(true);
                        bi.o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                y4 y4Var = (y4) obj;
                bi.a aVar2 = y4Var.f2881a;
                if (aVar2 != null && (w4Var = y4Var.G) != null) {
                    ((z3) w4Var).f3478a.f2938o3.d0(aVar2);
                    return;
                }
                return;
            case 7:
                ((ig.u) obj).dismiss();
                return;
            case 8:
                ((nf) obj).run();
                return;
            case 9:
                ((o0) obj).run();
                return;
            case 10:
                ((jg.d3) obj).onBackPressed();
                return;
            case 11:
                ((p80) obj).performClick();
                return;
            case 12:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((kg.v1) obj).f11304l2, null, "profile", null);
                return;
            case 13:
                final mg.c1 c1Var = (mg.c1) obj;
                og.a aVar3 = c1Var.I2;
                if (!aVar3.f14166a.Q) {
                    aVar3.b(true);
                    String str = c1Var.J2;
                    r20 r20Var = new r20() {
                        @Override
                        public final void a(Object obj2) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj2;
                                    c1 c1Var2 = c1Var;
                                    c1Var2.I2.b(false);
                                    c1Var2.dismiss();
                                    org.telegram.messenger.i0.h3(new a1(c1Var2, 1), 200L);
                                    return;
                                default:
                                    c1 c1Var3 = c1Var;
                                    c1Var3.I2.b(false);
                                    p.c((TLRPC.TL_error) obj2, (FrameLayout) c1Var3.f21587b, c1Var3.I0, new a1(c1Var3, 0));
                                    return;
                            }
                        }
                    };
                    r20 r20Var2 = new r20() {
                        @Override
                        public final void a(Object obj2) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj2;
                                    c1 c1Var2 = c1Var;
                                    c1Var2.I2.b(false);
                                    c1Var2.dismiss();
                                    org.telegram.messenger.i0.h3(new a1(c1Var2, 1), 200L);
                                    return;
                                default:
                                    c1 c1Var3 = c1Var;
                                    c1Var3.I2.b(false);
                                    p.c((TLRPC.TL_error) obj2, (FrameLayout) c1Var3.f21587b, c1Var3.I0, new a1(c1Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e20.f15506s0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new mg.b0(r20Var2, r20Var, 0), 2);
                    return;
                }
                return;
            case 14:
                ((mg.f1) obj).dismiss();
                return;
            case 15:
                ((mg.x0) ((ng.f) obj)).f13287r.dismiss();
                return;
            case 16:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.l lVar = yVar.f21535b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) view;
                if (t0Var.s()) {
                    if (lVar.f20514u0.a()) {
                        t0Var.U(null, null);
                        return;
                    }
                    return;
                } else if (t0Var.u()) {
                    lVar.y(t0Var.T(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 17:
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                return;
            case 18:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                z2Var.getClass();
                z2Var.M(((Integer) view.getTag()).intValue());
                return;
            case 19:
                l5 l5Var = (l5) obj;
                if (!l5Var.f20548y.f7022f) {
                    if (l5Var.f20547x.f7022f) {
                        i5 i5Var = l5Var.f20539a;
                        int i14 = l5Var.f20540b;
                        org.telegram.ui.ActionBar.k kVar = i5Var.V;
                        if (kVar != null) {
                            kVar.b(i14);
                            return;
                        }
                        return;
                    } else if (l5Var.f20541c == k5.f20467b) {
                        org.telegram.messenger.i0.F3(4.0f, l5Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                rVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 21:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) obj;
                if (!f0Var.f31473a) {
                    if (f0Var.f31482y == 0 && f0Var.D) {
                        ((Activity) f0Var.getContext()).startActivityForResult(((MediaProjectionManager) f0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        f0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 22:
                sd1 sd1Var = (sd1) obj;
                if (!sd1Var.f31591a) {
                    if (sd1Var.f31599x == 0) {
                        ((Activity) sd1Var.getContext()).startActivityForResult(((MediaProjectionManager) sd1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        sd1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 23:
                Context context = (Context) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.t0.b();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar2.getContext());
                String L0 = dd.L0(2131742940, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131742941, null);
                alertDialog$Builder.k(dd.L0(2131747847, null), new org.telegram.ui.web.a(jVar2));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            case 25:
                ((ph.c) obj).dismiss();
                return;
            case 26:
                ((ph.d0) obj).dismiss();
                return;
            case 27:
                if (((ph.l1) obj).W1.f47660f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20390a = true;
                    Q.showAsSheet(new h8(), obj2);
                    return;
                }
                return;
            case 28:
                Runnable runnable = ((qg.c) obj).e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ((qh.n) obj).f45710c.f45731b.f45627a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
        }
    }
}
