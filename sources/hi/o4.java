package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.fl;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af;
import org.telegram.ui.bc1;
import org.telegram.ui.eg0;
public final class o4 implements View.OnClickListener {
    public final int f15208a;
    public final Object f15209b;

    public o4(Object obj, int i7) {
        this.f15208a = i7;
        this.f15209b = obj;
    }

    @Override
    public final void onClick(View view) {
        x10 x10Var;
        int i7;
        int i10;
        oi.a aVar;
        oi.k4 k4Var;
        int i11 = this.f15208a;
        Object obj = this.f15209b;
        switch (i11) {
            case 0:
                ((ai.c1) obj).run();
                return;
            case 1:
                o5 o5Var = ((n5) obj).f15102y;
                if (o5Var.f15216r && (x10Var = o5Var.f15214f) != null) {
                    x10Var.a(5);
                    return;
                }
                return;
            case 2:
                a8 a8Var = (a8) ((x7) obj).h;
                if (a8Var != null) {
                    a8Var.run();
                    return;
                }
                return;
            case 3:
                jg.m mVar = (jg.m) obj;
                mp.u1(mVar.G).f25782s.clear();
                mp.g1().edit().remove("installReferer").commit();
                mVar.f();
                return;
            case 4:
                ((jg.v) obj).run();
                return;
            case 5:
                ((jg.r0) obj).J();
                return;
            case 6:
                jg.c2 c2Var = (jg.c2) obj;
                LongSparseArray longSparseArray = c2Var.f17447n;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.f28458id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f28458id) < 0) {
                    if (v3Var.f32190r) {
                        longSparseArray.put(stickerSet.set.f28458id, stickerSet);
                        c2Var.f17445e.f42321a.h(v3Var.getStickerSet());
                        return;
                    }
                    c2Var.F(stickerSet, v3Var);
                    return;
                }
                return;
            case 7:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.o6 o6Var = eVar.f18320f;
                int i12 = eVar.f18316a;
                boolean z10 = eVar.f18322r;
                eVar.f18322r = !z10;
                dq dqVar = eVar.h;
                if (!z10) {
                    i7 = 2131753698;
                } else {
                    i7 = 2131753695;
                }
                dqVar.c(gd.N0(i7, null), true, true);
                o6Var.a();
                if (eVar.f18322r) {
                    i10 = 2131753696;
                } else {
                    i10 = 2131753697;
                }
                o6Var.c(gd.N0(i10, null), true, true);
                if (eVar.f18322r) {
                    eVar.f18325x |= 1;
                } else {
                    eVar.f18325x &= -2;
                }
                mp.u1(i12).f25686g7.edit().putInt("dialog_botflags" + eVar.f18323s, eVar.f18325x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = mp.u1(i12).l1(eVar.f18323s);
                toggleconnectedbotpaused.paused = eVar.f18322r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f18514f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    lc.b0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 9:
                ((af) obj).run();
                return;
            case 10:
                ((af) obj).run();
                return;
            case 11:
                ChatActivityEnterView.g(((qd) ((ki.l0) obj).d).f38898a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 12:
                ((ai.r) obj).run();
                return;
            case 13:
                li.p pVar = (li.p) obj;
                TLRPC.Chat chat = pVar.J;
                if (chat != null && !chat.title.equals(((di.q) pVar.f20011r.f3577b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.J.f28431id, ((di.q) pVar.f20011r.f3577b).getText().toString(), new li.i(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.J;
                if (chat2 != null && pVar.f20010n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.J.default_banned_rights.manage_linked_peers = !pVar.f20010n;
                    pVar.getMessagesController().S4(pVar.f20007c, pVar.J.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 14:
                ((li.y) obj).f20039n.f19930o1.A(0);
                return;
            case 15:
                li.d0 d0Var = ((li.z) obj).f20041r;
                if (!org.telegram.messenger.v3.w(27, d0Var.f19932q1)) {
                    d0Var.dismiss();
                    return;
                }
                e eVar2 = d0Var.f19934s1;
                if (!eVar2.R) {
                    eVar2.setLoading(true);
                    mp u12 = mp.u1(d0Var.f30170a);
                    li.t tVar = new li.t(d0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new fl(u12, tVar, 0));
                    return;
                }
                return;
            case 16:
                ((ni.b) obj).dismiss();
                return;
            case 17:
                oi.o oVar = (oi.o) obj;
                oVar.M(true, 0, 0, 0L, false);
                eg0 eg0Var = oVar.P;
                if (eg0Var != null) {
                    eg0Var.h(true);
                    oVar.P = null;
                    return;
                }
                return;
            case 18:
                oi.q0 q0Var = (oi.q0) obj;
                oi.c3 c3Var = q0Var.h;
                if (c3Var != null && (aVar = q0Var.f22323f) != null) {
                    oi.t3 t3Var = c3Var.f22042a;
                    t3Var.getClass();
                    if (oi.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21932b;
                        oi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.f35796g3.O(true);
                        oi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                oi.m4 m4Var = (oi.m4) obj;
                oi.a aVar2 = m4Var.f22528a;
                if (aVar2 != null && (k4Var = m4Var.H) != null) {
                    ((oi.p3) k4Var).f22309a.f22425p3.H(aVar2);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.f30280b;
                org.telegram.ui.ActionBar.q0 q0Var2 = (org.telegram.ui.ActionBar.q0) view;
                if (q0Var2.t()) {
                    if (kVar.f29163v0.a()) {
                        q0Var2.V(null, null);
                        return;
                    }
                    return;
                } else if (q0Var2.v()) {
                    kVar.A(q0Var2.U(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 21:
                ((org.telegram.ui.ActionBar.w1) obj).dismiss();
                return;
            case 22:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                w2Var.getClass();
                w2Var.M(((Integer) view.getTag()).intValue());
                return;
            case 23:
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) obj;
                if (!c5Var.f28856y.f57697f) {
                    if (c5Var.f28855x.f57697f) {
                        org.telegram.ui.ActionBar.z4 z4Var = c5Var.f28846a;
                        int i13 = c5Var.f28847b;
                        org.telegram.ui.ActionBar.j jVar = z4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (c5Var.f28848c == org.telegram.ui.ActionBar.b5.f28810b) {
                        org.telegram.messenger.g0.E3(4.0f, c5Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                yVar2.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 25:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) obj;
                if (!w0Var.f41414a) {
                    if (w0Var.f41424y == 0 && w0Var.E) {
                        ((Activity) w0Var.getContext()).startActivityForResult(((MediaProjectionManager) w0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        w0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 26:
                bc1 bc1Var = (bc1) obj;
                if (!bc1Var.f40923a) {
                    if (bc1Var.f40932x == 0) {
                        ((Activity) bc1Var.getContext()).startActivityForResult(((MediaProjectionManager) bc1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        bc1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 27:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String N0 = gd.N0(2131742650, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742651, null);
                alertDialog$Builder.k(gd.N0(2131747637, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                return;
            case 28:
                ((sg.q) obj).dismiss();
                return;
            default:
                ((af) obj).run();
                return;
        }
    }
}
