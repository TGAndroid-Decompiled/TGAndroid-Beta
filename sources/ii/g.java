package ii;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import jg.d2;
import jg.r0;
import li.b3;
import li.f2;
import li.k4;
import li.m4;
import li.p3;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ml;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bg0;
import org.telegram.ui.d10;
import org.telegram.ui.xf;
import org.telegram.ui.yb1;
import tg.i2;
import ug.f1;
public final class g implements View.OnClickListener {
    public final int f15533a;
    public final Object f15534b;

    public g(Object obj, int i7) {
        this.f15533a = i7;
        this.f15534b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        li.a aVar;
        k4 k4Var;
        int i11 = this.f15533a;
        Object obj = this.f15534b;
        switch (i11) {
            case 0:
                p pVar = (p) obj;
                TLRPC.Chat chat = pVar.I;
                if (chat != null && !chat.title.equals(((bi.v) pVar.f15586r.f3761b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.I.f26952id, ((bi.v) pVar.f15586r.f3761b).getText().toString(), new i(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.I;
                if (chat2 != null && pVar.f15585n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.I.default_banned_rights.manage_linked_peers = !pVar.f15585n;
                    pVar.getMessagesController().H4(pVar.f15582c, pVar.I.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 1:
                ((y) obj).f15614n.f15502k1.E(0);
                return;
            case 2:
                d0 d0Var = ((z) obj).f15616r;
                if (!t3.w(27, d0Var.f15503m1)) {
                    d0Var.dismiss();
                    return;
                }
                fi.d dVar = d0Var.f15504o1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    qp s12 = qp.s1(d0Var.f28612a);
                    t tVar = new t(d0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new ml(s12, tVar, 0));
                    return;
                }
                return;
            case 3:
                jg.n nVar = (jg.n) obj;
                qp.s1(nVar.F).f24874s.clear();
                qp.e1().edit().remove("installReferer").commit();
                nVar.f();
                return;
            case 4:
                ((jg.w) obj).run();
                return;
            case 5:
                ((r0) obj).J();
                return;
            case 6:
                d2 d2Var = (d2) obj;
                LongSparseArray longSparseArray = d2Var.f16699n;
                u3 u3Var = (u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && d2Var.h.indexOfKey(stickerSet.set.f26979id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f26979id) < 0) {
                    if (u3Var.f30567r) {
                        longSparseArray.put(stickerSet.set.f26979id, stickerSet);
                        d2Var.f16697e.f33450a.h(u3Var.getStickerSet());
                        return;
                    }
                    d2Var.F(stickerSet, u3Var);
                    return;
                }
                return;
            case 7:
                kg.e eVar = (kg.e) obj;
                j6 j6Var = eVar.f17345f;
                int i12 = eVar.f17341a;
                boolean z9 = eVar.f17347r;
                eVar.f17347r = !z9;
                mp mpVar = eVar.h;
                if (!z9) {
                    i7 = 2131753701;
                } else {
                    i7 = 2131753698;
                }
                mpVar.c(hd.M0(i7, null), true, true);
                j6Var.a();
                if (eVar.f17347r) {
                    i10 = 2131753699;
                } else {
                    i10 = 2131753700;
                }
                j6Var.c(hd.M0(i10, null), true, true);
                if (eVar.f17347r) {
                    eVar.f17350x |= 1;
                } else {
                    eVar.f17350x &= -2;
                }
                qp.s1(i12).f24749d7.edit().putInt("dialog_botflags" + eVar.f17348s, eVar.f17350x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = qp.s1(i12).j1(eVar.f17348s);
                toggleconnectedbotpaused.paused = eVar.f17347r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f17539f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    hc.a0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 9:
                ((ki.b) obj).dismiss();
                return;
            case 10:
                li.p pVar2 = (li.p) obj;
                pVar2.L(true, 0, 0, 0L, false);
                bg0 bg0Var = pVar2.O;
                if (bg0Var != null) {
                    bg0Var.g(true);
                    pVar2.O = null;
                    return;
                }
                return;
            case 11:
                li.r0 r0Var = (li.r0) obj;
                b3 b3Var = r0Var.h;
                if (b3Var != null && (aVar = r0Var.f18803f) != null) {
                    li.t3 t3Var = b3Var.f18474a;
                    t3Var.getClass();
                    if (li.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f18389b;
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.f36781f3.O(true);
                        f2 f2Var2 = t3Var.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                m4 m4Var = (m4) obj;
                li.a aVar2 = m4Var.f18986a;
                if (aVar2 != null && (k4Var = m4Var.G) != null) {
                    ((p3) k4Var).f18772a.f18887o3.n(aVar2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.f28755b;
                org.telegram.ui.ActionBar.r0 r0Var2 = (org.telegram.ui.ActionBar.r0) view;
                if (r0Var2.s()) {
                    if (kVar.f27691u0.a()) {
                        r0Var2.U(null, null);
                        return;
                    }
                    return;
                } else if (r0Var2.u()) {
                    kVar.y(r0Var2.T(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 14:
                ((x1) obj).dismiss();
                return;
            case 15:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                v2Var.L(((Integer) view.getTag()).intValue());
                return;
            case 16:
                b5 b5Var = (b5) obj;
                if (!b5Var.f27354y.f55396f) {
                    if (b5Var.f27353x.f55396f) {
                        y4 y4Var = b5Var.f27344a;
                        int i13 = b5Var.f27345b;
                        org.telegram.ui.ActionBar.j jVar = y4Var.V;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (b5Var.f27346c == a5.f27328b) {
                        org.telegram.messenger.g0.G3(4.0f, b5Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                yVar2.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 18:
                t0 t0Var = (t0) obj;
                if (!t0Var.f39474a) {
                    if (t0Var.f39484y == 0 && t0Var.D) {
                        ((Activity) t0Var.getContext()).startActivityForResult(((MediaProjectionManager) t0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        t0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 19:
                yb1 yb1Var = (yb1) obj;
                if (!yb1Var.f39610a) {
                    if (yb1Var.f39619x == 0) {
                        ((Activity) yb1Var.getContext()).startActivityForResult(((MediaProjectionManager) yb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        yb1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 20:
                org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar2.getContext());
                String M0 = hd.M0(2131742915, null);
                u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131742916, null);
                alertDialog$Builder.k(hd.M0(2131747830, null), new org.telegram.ui.web.a(jVar2));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            case 21:
                ((sg.q) obj).dismiss();
                return;
            case 22:
                ((xf) obj).run();
                return;
            case 23:
                ((d10) obj).run();
                return;
            case 24:
                ((i2) obj).onBackPressed();
                return;
            case 25:
                ((w70) obj).performClick();
                return;
            case 26:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((f1) obj).f56481l2, null, "profile", null);
                return;
            case 27:
                final wg.g0 g0Var = (wg.g0) obj;
                yg.a aVar3 = g0Var.I2;
                if (!aVar3.f59323a.Q) {
                    aVar3.b(true);
                    String str = g0Var.J2;
                    c20 c20Var = new c20() {
                        @Override
                        public final void a(Object obj2) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj2;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.I2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.I2.b(false);
                                    h.c((TLRPC.TL_error) obj2, (FrameLayout) g0Var3.f28615b, g0Var3.I0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    c20 c20Var2 = new c20() {
                        @Override
                        public final void a(Object obj2) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj2;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.I2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.I2.b(false);
                                    h.c((TLRPC.TL_error) obj2, (FrameLayout) g0Var3.f28615b, g0Var3.I0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24459s0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(c20Var2, c20Var, 0), 2);
                    return;
                }
                return;
            case 28:
                ((wg.j0) obj).dismiss();
                return;
            default:
                ((wg.b0) ((xg.f) obj)).f57609r.dismiss();
                return;
        }
    }
}
