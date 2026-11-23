package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.gl;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
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
public final class p4 implements View.OnClickListener {
    public final int f15173a;
    public final Object f15174b;

    public p4(Object obj, int i7) {
        this.f15173a = i7;
        this.f15174b = obj;
    }

    @Override
    public final void onClick(View view) {
        y10 y10Var;
        int i7;
        int i10;
        oi.a aVar;
        oi.j4 j4Var;
        int i11 = this.f15173a;
        Object obj = this.f15174b;
        switch (i11) {
            case 0:
                ((ai.d1) obj).run();
                return;
            case 1:
                p5 p5Var = ((o5) obj).f15127y;
                if (p5Var.f15181r && (y10Var = p5Var.f15179f) != null) {
                    y10Var.a(5);
                    return;
                }
                return;
            case 2:
                b8 b8Var = (b8) ((y7) obj).h;
                if (b8Var != null) {
                    b8Var.run();
                    return;
                }
                return;
            case 3:
                jg.m mVar = (jg.m) obj;
                np.u1(mVar.G).f25917s.clear();
                np.g1().edit().remove("installReferer").commit();
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
                LongSparseArray longSparseArray = c2Var.f17416n;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.f28425id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f28425id) < 0) {
                    if (v3Var.f32159r) {
                        longSparseArray.put(stickerSet.set.f28425id, stickerSet);
                        c2Var.f17414e.f42291a.h(v3Var.getStickerSet());
                        return;
                    }
                    c2Var.F(stickerSet, v3Var);
                    return;
                }
                return;
            case 7:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.o6 o6Var = eVar.f18289f;
                int i12 = eVar.f18285a;
                boolean z10 = eVar.f18291r;
                eVar.f18291r = !z10;
                dq dqVar = eVar.h;
                if (!z10) {
                    i7 = 2131753698;
                } else {
                    i7 = 2131753695;
                }
                dqVar.c(hd.N0(i7, null), true, true);
                o6Var.a();
                if (eVar.f18291r) {
                    i10 = 2131753696;
                } else {
                    i10 = 2131753697;
                }
                o6Var.c(hd.N0(i10, null), true, true);
                if (eVar.f18291r) {
                    eVar.f18294x |= 1;
                } else {
                    eVar.f18294x &= -2;
                }
                np.u1(i12).f25821g7.edit().putInt("dialog_botflags" + eVar.f18292s, eVar.f18294x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = np.u1(i12).l1(eVar.f18292s);
                toggleconnectedbotpaused.paused = eVar.f18291r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f18457f;
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
                ChatActivityEnterView.g(((qd) ((ki.l0) obj).d).f38845a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 12:
                ((ai.m) obj).run();
                return;
            case 13:
                li.p pVar = (li.p) obj;
                TLRPC.Chat chat = pVar.J;
                if (chat != null && !chat.title.equals(((di.q) pVar.f19980r.f3604b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.J.f28398id, ((di.q) pVar.f19980r.f3604b).getText().toString(), new li.i(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.J;
                if (chat2 != null && pVar.f19979n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.J.default_banned_rights.manage_linked_peers = !pVar.f19979n;
                    pVar.getMessagesController().S4(pVar.f19976c, pVar.J.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 14:
                ((li.y) obj).f20008n.f19899o1.A(0);
                return;
            case 15:
                li.d0 d0Var = ((li.z) obj).f20010r;
                if (!org.telegram.messenger.v3.w(27, d0Var.f19901q1)) {
                    d0Var.dismiss();
                    return;
                }
                d dVar = d0Var.f19903s1;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    np u12 = np.u1(d0Var.f30139a);
                    li.t tVar = new li.t(d0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new gl(u12, tVar, 0));
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
                oi.p0 p0Var = (oi.p0) obj;
                oi.b3 b3Var = p0Var.h;
                if (b3Var != null && (aVar = p0Var.f22263f) != null) {
                    oi.s3 s3Var = b3Var.f21978a;
                    s3Var.getClass();
                    if (oi.s3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21901b;
                        oi.e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        s3Var.f35742g3.O(true);
                        oi.e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                oi.l4 l4Var = (oi.l4) obj;
                oi.a aVar2 = l4Var.f22468a;
                if (aVar2 != null && (j4Var = l4Var.H) != null) {
                    ((oi.o3) j4Var).f22250a.f22365p3.H(aVar2);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.f30249b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) view;
                if (q0Var.t()) {
                    if (kVar.f29132v0.a()) {
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
                if (!c5Var.f28825y.f57666f) {
                    if (c5Var.f28824x.f57666f) {
                        org.telegram.ui.ActionBar.z4 z4Var = c5Var.f28815a;
                        int i13 = c5Var.f28816b;
                        org.telegram.ui.ActionBar.j jVar = z4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (c5Var.f28817c == org.telegram.ui.ActionBar.b5.f28779b) {
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
                if (!w0Var.f41377a) {
                    if (w0Var.f41387y == 0 && w0Var.E) {
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
                if (!bc1Var.f40886a) {
                    if (bc1Var.f40895x == 0) {
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
                String N0 = hd.N0(2131742650, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131742651, null);
                alertDialog$Builder.k(hd.N0(2131747637, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
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
