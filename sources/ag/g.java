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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
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
import org.telegram.ui.kh0;
import org.telegram.ui.lg;
import org.telegram.ui.ud1;
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
                tpVar.c(cd.L0(i10, null), true, true);
                f6Var.a();
                if (jVar.f575r) {
                    i11 = 2131753699;
                } else {
                    i11 = 2131753700;
                }
                f6Var.c(cd.L0(i11, null), true, true);
                if (jVar.f575r) {
                    jVar.f578x |= 1;
                } else {
                    jVar.f578x &= -2;
                }
                vp.r1(i13).e7.edit().putInt("dialog_botflags" + jVar.f576s, jVar.f578x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = vp.r1(i13).i1(jVar.f576s);
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
                kh0 kh0Var = tVar.O;
                if (kh0Var != null) {
                    kh0Var.g(true);
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
                        d4Var.f30819f3.O(true);
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
                ((lg) obj).run();
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
                PremiumPreviewFragment.t0();
                PremiumPreviewFragment.o0(((kg.v1) obj).f11303l2, null, "profile", null);
                return;
            case 13:
                final mg.c1 c1Var = (mg.c1) obj;
                og.a aVar3 = c1Var.I2;
                if (!aVar3.f14165a.Q) {
                    aVar3.b(true);
                    String str = c1Var.J2;
                    q20 q20Var = new q20() {
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
                                    p.c((TLRPC.TL_error) obj2, (FrameLayout) c1Var3.f21586b, c1Var3.I0, new a1(c1Var3, 0));
                                    return;
                            }
                        }
                    };
                    q20 q20Var2 = new q20() {
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
                                    p.c((TLRPC.TL_error) obj2, (FrameLayout) c1Var3.f21586b, c1Var3.I0, new a1(c1Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.f15147s0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new mg.b0(q20Var2, q20Var, 0), 2);
                    return;
                }
                return;
            case 14:
                ((mg.f1) obj).dismiss();
                return;
            case 15:
                ((mg.x0) ((ng.f) obj)).f13286r.dismiss();
                return;
            case 16:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.l lVar = yVar.f21534b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) view;
                if (t0Var.s()) {
                    if (lVar.f20513u0.a()) {
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
                z2Var.N(((Integer) view.getTag()).intValue());
                return;
            case 19:
                l5 l5Var = (l5) obj;
                if (!l5Var.f20547y.f7021f) {
                    if (l5Var.f20546x.f7021f) {
                        i5 i5Var = l5Var.f20538a;
                        int i14 = l5Var.f20539b;
                        org.telegram.ui.ActionBar.k kVar = i5Var.V;
                        if (kVar != null) {
                            kVar.b(i14);
                            return;
                        }
                        return;
                    } else if (l5Var.f20540c == k5.f20466b) {
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
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) obj;
                if (!e0Var.f31395a) {
                    if (e0Var.f31404y == 0 && e0Var.D) {
                        ((Activity) e0Var.getContext()).startActivityForResult(((MediaProjectionManager) e0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        e0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 22:
                ud1 ud1Var = (ud1) obj;
                if (!ud1Var.f31512a) {
                    if (ud1Var.f31520x == 0) {
                        ((Activity) ud1Var.getContext()).startActivityForResult(((MediaProjectionManager) ud1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        ud1Var.a(false, true);
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
                    org.telegram.ui.Components.voip.s0.b();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar2.getContext());
                String L0 = cd.L0(2131742940, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131742941, null);
                alertDialog$Builder.k(cd.L0(2131747847, null), new org.telegram.ui.web.a(jVar2));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            case 25:
                ((ph.c) obj).dismiss();
                return;
            case 26:
                ((ph.d0) obj).dismiss();
                return;
            case 27:
                if (((ph.l1) obj).W1.f47650f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f20389a = true;
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
                ((qh.n) obj).f45699c.f45720b.f45616a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
        }
    }
}
