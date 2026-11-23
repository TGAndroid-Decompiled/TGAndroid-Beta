package hi;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.fl;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.qd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af;
import org.telegram.ui.dg0;
import org.telegram.ui.zb1;
public final class z4 implements View.OnClickListener {
    public final int f15908a;
    public final Object f15909b;

    public z4(Object obj, int i7) {
        this.f15908a = i7;
        this.f15909b = obj;
    }

    @Override
    public final void onClick(View view) {
        w10 w10Var;
        int i7;
        int i10;
        oi.a aVar;
        oi.k4 k4Var;
        int i11 = this.f15908a;
        Object obj = this.f15909b;
        switch (i11) {
            case 0:
                ((ai.e1) obj).run();
                return;
            case 1:
                z5 z5Var = ((y5) obj).f15875y;
                if (z5Var.f15916r && (w10Var = z5Var.f15914f) != null) {
                    w10Var.a(5);
                    return;
                }
                return;
            case 2:
                v8 v8Var = (v8) ((s8) obj).h;
                if (v8Var != null) {
                    v8Var.run();
                    return;
                }
                return;
            case 3:
                jg.m mVar = (jg.m) obj;
                mp.u1(mVar.G).f25849s.clear();
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
                LongSparseArray longSparseArray = c2Var.f17518n;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.f28519id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f28519id) < 0) {
                    if (v3Var.f32242r) {
                        longSparseArray.put(stickerSet.set.f28519id, stickerSet);
                        c2Var.f17516e.f41820a.h(v3Var.getStickerSet());
                        return;
                    }
                    c2Var.F(stickerSet, v3Var);
                    return;
                }
                return;
            case 7:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.n6 n6Var = eVar.f18385f;
                int i12 = eVar.f18381a;
                boolean z10 = eVar.f18387r;
                eVar.f18387r = !z10;
                aq aqVar = eVar.h;
                if (!z10) {
                    i7 = 2131753698;
                } else {
                    i7 = 2131753695;
                }
                aqVar.c(gd.N0(i7, null), true, true);
                n6Var.a();
                if (eVar.f18387r) {
                    i10 = 2131753696;
                } else {
                    i10 = 2131753697;
                }
                n6Var.c(gd.N0(i10, null), true, true);
                if (eVar.f18387r) {
                    eVar.f18390x |= 1;
                } else {
                    eVar.f18390x &= -2;
                }
                mp.u1(i12).f25753g7.edit().putInt("dialog_botflags" + eVar.f18388s, eVar.f18390x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = mp.u1(i12).l1(eVar.f18388s);
                toggleconnectedbotpaused.paused = eVar.f18387r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 8:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f18576f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    org.telegram.ui.Components.kc.b0(LaunchActivity.Q()).k(false).j();
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
                ChatActivityEnterView.g(((qd) ((ki.l0) obj).d).f38809a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 12:
                ((ai.j) obj).run();
                return;
            case 13:
                li.o oVar = (li.o) obj;
                TLRPC.Chat chat = oVar.J;
                if (chat != null && !chat.title.equals(((di.q) oVar.f20077r.f3604b).getText().toString())) {
                    oVar.getMessagesController().C(oVar.J.f28492id, ((di.q) oVar.f20077r.f3604b).getText().toString(), new li.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.J;
                if (chat2 != null && oVar.f20076n != oVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.J.default_banned_rights.manage_linked_peers = !oVar.f20076n;
                    oVar.getMessagesController().S4(oVar.f20073c, oVar.J.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                return;
            case 14:
                ((li.x) obj).f20105n.f19996o1.C(0);
                return;
            case 15:
                li.c0 c0Var = ((li.y) obj).f20107r;
                if (!org.telegram.messenger.v3.w(27, c0Var.f19998q1)) {
                    c0Var.dismiss();
                    return;
                }
                e eVar2 = c0Var.f20000s1;
                if (!eVar2.R) {
                    eVar2.setLoading(true);
                    mp u12 = mp.u1(c0Var.f30223a);
                    li.s sVar = new li.s(c0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new fl(u12, sVar, 0));
                    return;
                }
                return;
            case 16:
                ((ni.b) obj).dismiss();
                return;
            case 17:
                oi.p pVar = (oi.p) obj;
                pVar.M(true, 0, 0, 0L, false);
                dg0 dg0Var = pVar.P;
                if (dg0Var != null) {
                    dg0Var.h(true);
                    pVar.P = null;
                    return;
                }
                return;
            case 18:
                oi.q0 q0Var = (oi.q0) obj;
                oi.c3 c3Var = q0Var.h;
                if (c3Var != null && (aVar = q0Var.f22391f) != null) {
                    oi.t3 t3Var = c3Var.f22111a;
                    t3Var.getClass();
                    if (oi.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f22001b;
                        oi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.f35323g3.O(true);
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
                oi.a aVar2 = m4Var.f22598a;
                if (aVar2 != null && (k4Var = m4Var.H) != null) {
                    ((oi.p3) k4Var).f22378a.f22495p3.B(aVar2);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.k kVar = yVar.f30340b;
                org.telegram.ui.ActionBar.q0 q0Var2 = (org.telegram.ui.ActionBar.q0) view;
                if (q0Var2.t()) {
                    if (kVar.f29182v0.a()) {
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
                if (!c5Var.f28920y.f57780f) {
                    if (c5Var.f28919x.f57780f) {
                        org.telegram.ui.ActionBar.z4 z4Var = c5Var.f28910a;
                        int i13 = c5Var.f28911b;
                        org.telegram.ui.ActionBar.j jVar = z4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (c5Var.f28912c == org.telegram.ui.ActionBar.b5.f28872b) {
                        org.telegram.messenger.g0.E3(4.0f, c5Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                zVar.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 25:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) obj;
                if (!x0Var.f41311a) {
                    if (x0Var.f41321y == 0 && x0Var.E) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 26:
                zb1 zb1Var = (zb1) obj;
                if (!zb1Var.f40817a) {
                    if (zb1Var.f40826x == 0) {
                        ((Activity) zb1Var.getContext()).startActivityForResult(((MediaProjectionManager) zb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        zb1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 27:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String N0 = gd.N0(2131742643, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742644, null);
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
