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
import org.telegram.messenger.id;
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
import org.telegram.ui.zb1;
import tg.i2;
import ug.f1;
public final class g implements View.OnClickListener {
    public final int f15536a;
    public final Object f15537b;

    public g(Object obj, int i7) {
        this.f15536a = i7;
        this.f15537b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        li.a aVar;
        k4 k4Var;
        int i11 = this.f15536a;
        Object obj = this.f15537b;
        switch (i11) {
            case 0:
                p pVar = (p) obj;
                TLRPC.Chat chat = pVar.I;
                if (chat != null && !chat.title.equals(((bi.v) pVar.f15589r.f3761b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.I.f26956id, ((bi.v) pVar.f15589r.f3761b).getText().toString(), new i(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.I;
                if (chat2 != null && pVar.f15588n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.I.default_banned_rights.manage_linked_peers = !pVar.f15588n;
                    pVar.getMessagesController().H4(pVar.f15585c, pVar.I.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 1:
                ((y) obj).f15617n.f15505k1.E(0);
                return;
            case 2:
                d0 d0Var = ((z) obj).f15619r;
                if (!t3.w(27, d0Var.f15506m1)) {
                    d0Var.dismiss();
                    return;
                }
                fi.d dVar = d0Var.f15507o1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    qp s12 = qp.s1(d0Var.f28616a);
                    t tVar = new t(d0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new ml(s12, tVar, 0));
                    return;
                }
                return;
            case 3:
                jg.n nVar = (jg.n) obj;
                qp.s1(nVar.F).f24889s.clear();
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
                LongSparseArray longSparseArray = d2Var.f16702n;
                u3 u3Var = (u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && d2Var.h.indexOfKey(stickerSet.set.f26983id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f26983id) < 0) {
                    if (u3Var.f30572r) {
                        longSparseArray.put(stickerSet.set.f26983id, stickerSet);
                        d2Var.f16700e.f33808a.h(u3Var.getStickerSet());
                        return;
                    }
                    d2Var.F(stickerSet, u3Var);
                    return;
                }
                return;
            case 7:
                kg.e eVar = (kg.e) obj;
                j6 j6Var = eVar.f17348f;
                int i12 = eVar.f17344a;
                boolean z9 = eVar.f17350r;
                eVar.f17350r = !z9;
                mp mpVar = eVar.h;
                if (!z9) {
                    i7 = 2131753701;
                } else {
                    i7 = 2131753698;
                }
                mpVar.c(id.M0(i7, null), true, true);
                j6Var.a();
                if (eVar.f17350r) {
                    i10 = 2131753699;
                } else {
                    i10 = 2131753700;
                }
                j6Var.c(id.M0(i10, null), true, true);
                if (eVar.f17350r) {
                    eVar.f17353x |= 1;
                } else {
                    eVar.f17353x &= -2;
                }
                qp.s1(i12).f24764d7.edit().putInt("dialog_botflags" + eVar.f17351s, eVar.f17353x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = qp.s1(i12).j1(eVar.f17351s);
                toggleconnectedbotpaused.paused = eVar.f17350r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f17542f;
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
                if (b3Var != null && (aVar = r0Var.f18806f) != null) {
                    li.t3 t3Var = b3Var.f18477a;
                    t3Var.getClass();
                    if (li.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f18392b;
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.f37190f3.O(true);
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
                li.a aVar2 = m4Var.f18989a;
                if (aVar2 != null && (k4Var = m4Var.G) != null) {
                    ((p3) k4Var).f18775a.f18890o3.n(aVar2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.f28759b;
                org.telegram.ui.ActionBar.r0 r0Var2 = (org.telegram.ui.ActionBar.r0) view;
                if (r0Var2.s()) {
                    if (kVar.f27695u0.a()) {
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
                if (!b5Var.f27358y.f55487f) {
                    if (b5Var.f27357x.f55487f) {
                        y4 y4Var = b5Var.f27348a;
                        int i13 = b5Var.f27349b;
                        org.telegram.ui.ActionBar.j jVar = y4Var.V;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (b5Var.f27350c == a5.f27332b) {
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
                if (!t0Var.f39530a) {
                    if (t0Var.f39540y == 0 && t0Var.D) {
                        ((Activity) t0Var.getContext()).startActivityForResult(((MediaProjectionManager) t0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        t0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 19:
                zb1 zb1Var = (zb1) obj;
                if (!zb1Var.f39666a) {
                    if (zb1Var.f39675x == 0) {
                        ((Activity) zb1Var.getContext()).startActivityForResult(((MediaProjectionManager) zb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        zb1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 20:
                org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar2.getContext());
                String M0 = id.M0(2131742917, null);
                u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131742918, null);
                alertDialog$Builder.k(id.M0(2131747832, null), new org.telegram.ui.web.a(jVar2));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
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
                PremiumPreviewFragment.p0(((f1) obj).f56572l2, null, "profile", null);
                return;
            case 27:
                final wg.g0 g0Var = (wg.g0) obj;
                yg.a aVar3 = g0Var.I2;
                if (!aVar3.f59420a.Q) {
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
                                    h.c((TLRPC.TL_error) obj2, (FrameLayout) g0Var3.f28619b, g0Var3.I0, new e0(g0Var3, 0));
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
                                    h.c((TLRPC.TL_error) obj2, (FrameLayout) g0Var3.f28619b, g0Var3.I0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24470s0);
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
                ((wg.b0) ((xg.f) obj)).f57700r.dismiss();
                return;
        }
    }
}
