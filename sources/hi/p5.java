package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.jl;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.up;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.yb1;
import org.telegram.ui.ye;
public final class p5 implements View.OnClickListener {
    public final int f14854a;
    public final Object f14855b;

    public p5(Object obj, int i7) {
        this.f14854a = i7;
        this.f14855b = obj;
    }

    @Override
    public final void onClick(View view) {
        z10 z10Var;
        int i7;
        int i10;
        oi.a aVar;
        oi.h4 h4Var;
        int i11 = this.f14854a;
        Object obj = this.f14855b;
        switch (i11) {
            case 0:
                r5 r5Var = ((q5) obj).f14912y;
                if (r5Var.f14992r && (z10Var = r5Var.f14990f) != null) {
                    z10Var.a(5);
                    return;
                }
                return;
            case 1:
                b8 b8Var = (b8) ((y7) obj).h;
                if (b8Var != null) {
                    b8Var.run();
                    return;
                }
                return;
            case 2:
                jg.m mVar = (jg.m) obj;
                np.s1(mVar.G).f25385s.clear();
                np.e1().edit().remove("installReferer").commit();
                mVar.f();
                return;
            case 3:
                ((jg.v) obj).run();
                return;
            case 4:
                ((jg.r0) obj).J();
                return;
            case 5:
                jg.c2 c2Var = (jg.c2) obj;
                LongSparseArray longSparseArray = c2Var.f17039n;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.f28078id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f28078id) < 0) {
                    if (u3Var.f31720r) {
                        longSparseArray.put(stickerSet.set.f28078id, stickerSet);
                        c2Var.f17037e.f36720a.h(u3Var.getStickerSet());
                        return;
                    }
                    c2Var.F(stickerSet, u3Var);
                    return;
                }
                return;
            case 6:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.h6 h6Var = eVar.f17907f;
                int i12 = eVar.f17903a;
                boolean z10 = eVar.f17909r;
                eVar.f17909r = !z10;
                up upVar = eVar.h;
                if (!z10) {
                    i7 = 2131753701;
                } else {
                    i7 = 2131753698;
                }
                upVar.c(hd.M0(i7, null), true, true);
                h6Var.a();
                if (eVar.f17909r) {
                    i10 = 2131753699;
                } else {
                    i10 = 2131753700;
                }
                h6Var.c(hd.M0(i10, null), true, true);
                if (eVar.f17909r) {
                    eVar.f17912x |= 1;
                } else {
                    eVar.f17912x &= -2;
                }
                np.s1(i12).f25270e7.edit().putInt("dialog_botflags" + eVar.f17910s, eVar.f17912x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = np.s1(i12).j1(eVar.f17910s);
                toggleconnectedbotpaused.paused = eVar.f17909r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 7:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f18102f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    cc.a0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 8:
                ((ye) obj).run();
                return;
            case 9:
                ((ye) obj).run();
                return;
            case 10:
                ChatActivityEnterView.g(((org.telegram.ui.Components.hd) ((ki.m0) obj).d).f35226a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 11:
                ((androidx.car.app.utils.a) obj).run();
                return;
            case 12:
                li.n nVar = (li.n) obj;
                TLRPC.Chat chat = nVar.J;
                if (chat != null && !chat.title.equals(((di.q) nVar.f19615r.f3545b).getText().toString())) {
                    nVar.getMessagesController().C(nVar.J.f28051id, ((di.q) nVar.f19615r.f3545b).getText().toString(), new li.g(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.J;
                if (chat2 != null && nVar.f19614n != nVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.J.default_banned_rights.manage_linked_peers = !nVar.f19614n;
                    nVar.getMessagesController().I4(nVar.f19611c, nVar.J.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                return;
            case 13:
                ((li.y) obj).f19647n.f19541o1.C(0);
                return;
            case 14:
                li.d0 d0Var = ((li.z) obj).f19649r;
                if (!org.telegram.messenger.t3.w(27, d0Var.f19543q1)) {
                    d0Var.dismiss();
                    return;
                }
                d dVar = d0Var.f19545s1;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    np s12 = np.s1(d0Var.f29679a);
                    li.s sVar = new li.s(d0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new jl(s12, sVar, 0));
                    return;
                }
                return;
            case 15:
                ((ni.b) obj).dismiss();
                return;
            case 16:
                oi.o oVar = (oi.o) obj;
                oVar.M(true, 0, 0, 0L, false);
                bg0 bg0Var = oVar.P;
                if (bg0Var != null) {
                    bg0Var.h(true);
                    oVar.P = null;
                    return;
                }
                return;
            case 17:
                oi.p0 p0Var = (oi.p0) obj;
                oi.z2 z2Var = p0Var.h;
                if (z2Var != null && (aVar = p0Var.f21869f) != null) {
                    oi.q3 q3Var = z2Var.f22192a;
                    q3Var.getClass();
                    if (oi.q3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21544b;
                        oi.d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        q3Var.f39895g3.O(true);
                        oi.d2 d2Var2 = q3Var.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                oi.j4 j4Var = (oi.j4) obj;
                oi.a aVar2 = j4Var.f22106a;
                if (aVar2 != null && (h4Var = j4Var.H) != null) {
                    ((oi.m3) h4Var).f21814a.f21931p3.A(aVar2);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.f29876b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) view;
                if (q0Var.t()) {
                    if (kVar.f29320v0.a()) {
                        q0Var.V(null, null);
                        return;
                    }
                    return;
                } else if (q0Var.v()) {
                    kVar.A(q0Var.U(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 20:
                ((org.telegram.ui.ActionBar.w1) obj).dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                u2Var.getClass();
                u2Var.M(((Integer) view.getTag()).intValue());
                return;
            case 22:
                org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) obj;
                if (!z4Var.f29950y.f57082f) {
                    if (z4Var.f29949x.f57082f) {
                        org.telegram.ui.ActionBar.w4 w4Var = z4Var.f29940a;
                        int i13 = z4Var.f29941b;
                        org.telegram.ui.ActionBar.j jVar = w4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (z4Var.f29942c == org.telegram.ui.ActionBar.y4.f29893b) {
                        org.telegram.messenger.g0.F3(4.0f, z4Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                zVar.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 24:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) obj;
                if (!x0Var.f41032a) {
                    if (x0Var.f41042y == 0 && x0Var.E) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 25:
                yb1 yb1Var = (yb1) obj;
                if (!yb1Var.f40538a) {
                    if (yb1Var.f40547x == 0) {
                        ((Activity) yb1Var.getContext()).startActivityForResult(((MediaProjectionManager) yb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        yb1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 26:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String M0 = hd.M0(2131742914, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131742915, null);
                alertDialog$Builder.k(hd.M0(2131747831, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            case 27:
                ((sg.q) obj).dismiss();
                return;
            case 28:
                ((ye) obj).run();
                return;
            default:
                ((u11) obj).run();
                return;
        }
    }
}
