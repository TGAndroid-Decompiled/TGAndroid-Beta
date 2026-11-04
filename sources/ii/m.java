package ii;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.cl;
import org.telegram.messenger.hp;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.s70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rw;
import org.telegram.ui.sb1;
import org.telegram.ui.tf;
import org.telegram.ui.vf0;
import org.telegram.ui.xe;
public final class m implements View.OnClickListener {
    public final int f15060a;
    public final Object f15061b;

    public m(Object obj, int i3) {
        this.f15060a = i3;
        this.f15061b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        mi.a aVar;
        mi.l4 l4Var;
        int i11 = this.f15060a;
        Object obj = this.f15061b;
        switch (i11) {
            case 0:
                ((xe) obj).run();
                return;
            case 1:
                ChatActivityEnterView.e(((hd) ((m0) obj).d).f34369a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 2:
                ((ai.z3) obj).run();
                return;
            case 3:
                ji.n nVar = (ji.n) obj;
                TLRPC.Chat chat = nVar.J;
                if (chat != null && !chat.title.equals(((ci.s) nVar.f16348r.f852b).getText().toString())) {
                    nVar.getMessagesController().C(nVar.J.f27001id, ((ci.s) nVar.f16348r.f852b).getText().toString(), new ji.g(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.J;
                if (chat2 != null && nVar.f16347n != nVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.J.default_banned_rights.manage_linked_peers = !nVar.f16347n;
                    nVar.getMessagesController().H4(nVar.f16344c, nVar.J.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                return;
            case 4:
                ((ji.w) obj).f16376n.f16265l1.D(0);
                return;
            case 5:
                ji.b0 b0Var = ((ji.x) obj).f16378r;
                if (!org.telegram.messenger.t3.w(27, b0Var.f16266n1)) {
                    b0Var.dismiss();
                    return;
                }
                gi.d dVar = b0Var.f16268p1;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    hp s12 = hp.s1(b0Var.f28583a);
                    ji.r rVar = new ji.r(b0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new c3.b(1), new cl(s12, rVar, 0));
                    return;
                }
                return;
            case 6:
                kg.m mVar = (kg.m) obj;
                hp.s1(mVar.G).f23113s.clear();
                hp.e1().edit().remove("installReferer").commit();
                mVar.f();
                return;
            case 7:
                ((kg.u) obj).run();
                return;
            case 8:
                ((kg.o0) obj).J();
                return;
            case 9:
                kg.y1 y1Var = (kg.y1) obj;
                LongSparseArray longSparseArray = y1Var.f17237n;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                if (stickerSet != null && y1Var.h.indexOfKey(stickerSet.set.f27028id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f27028id) < 0) {
                    if (u3Var.f30644r) {
                        longSparseArray.put(stickerSet.set.f27028id, stickerSet);
                        y1Var.f17235e.f32077a.h(u3Var.getStickerSet());
                        return;
                    }
                    y1Var.F(stickerSet, u3Var);
                    return;
                }
                return;
            case 10:
                lg.e eVar = (lg.e) obj;
                h6 h6Var = eVar.f18275f;
                int i12 = eVar.f18271a;
                boolean z10 = eVar.f18277r;
                eVar.f18277r = !z10;
                mp mpVar = eVar.h;
                if (!z10) {
                    i3 = 2131753701;
                } else {
                    i3 = 2131753698;
                }
                mpVar.c(bd.M0(i3, null), true, true);
                h6Var.a();
                if (eVar.f18277r) {
                    i10 = 2131753699;
                } else {
                    i10 = 2131753700;
                }
                h6Var.c(bd.M0(i10, null), true, true);
                if (eVar.f18277r) {
                    eVar.f18280x |= 1;
                } else {
                    eVar.f18280x &= -2;
                }
                hp.s1(i12).f22989d7.edit().putInt("dialog_botflags" + eVar.f18278s, eVar.f18280x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = hp.s1(i12).j1(eVar.f18278s);
                toggleconnectedbotpaused.paused = eVar.f18277r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 11:
                TL_account.TL_businessChatLink tL_businessChatLink = ((lg.t) obj).f18463f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    fc.a0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 12:
                ((li.b) obj).dismiss();
                return;
            case 13:
                mi.p pVar = (mi.p) obj;
                pVar.L(true, 0, 0, 0L, false);
                vf0 vf0Var = pVar.P;
                if (vf0Var != null) {
                    vf0Var.g(true);
                    pVar.P = null;
                    return;
                }
                return;
            case 14:
                mi.s0 s0Var = (mi.s0) obj;
                mi.c3 c3Var = s0Var.h;
                if (c3Var != null && (aVar = s0Var.f19875f) != null) {
                    mi.t3 t3Var = c3Var.f19543a;
                    t3Var.getClass();
                    if (mi.t3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f19431b;
                        mi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        t3Var.f35594g3.O(true);
                        mi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                mi.n4 n4Var = (mi.n4) obj;
                mi.a aVar2 = n4Var.f20029a;
                if (aVar2 != null && (l4Var = n4Var.H) != null) {
                    ((mi.p3) l4Var).f19805a.f19916p3.b1(aVar2);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.x xVar = (org.telegram.ui.ActionBar.x) obj;
                org.telegram.ui.ActionBar.k kVar = xVar.f28786b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) view;
                if (q0Var.s()) {
                    if (kVar.f27744v0.a()) {
                        q0Var.U(null, null);
                        return;
                    }
                    return;
                } else if (q0Var.u()) {
                    kVar.y(q0Var.T(true));
                    return;
                } else {
                    xVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 17:
                ((org.telegram.ui.ActionBar.v1) obj).dismiss();
                return;
            case 18:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                t2Var.getClass();
                t2Var.L(((Integer) view.getTag()).intValue());
                return;
            case 19:
                b5 b5Var = (b5) obj;
                if (!b5Var.f27421y.f53841f) {
                    if (b5Var.f27420x.f53841f) {
                        y4 y4Var = b5Var.f27411a;
                        int i13 = b5Var.f27412b;
                        org.telegram.ui.ActionBar.j jVar = y4Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (b5Var.f27413c == a5.f27379b) {
                        org.telegram.messenger.g0.G3(4.0f, b5Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                rVar2.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 21:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) obj;
                if (!f0Var.f39325a) {
                    if (f0Var.f39335y == 0 && f0Var.E) {
                        ((Activity) f0Var.getContext()).startActivityForResult(((MediaProjectionManager) f0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        f0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 22:
                sb1 sb1Var = (sb1) obj;
                if (!sb1Var.f39445a) {
                    if (sb1Var.f39454x == 0) {
                        ((Activity) sb1Var.getContext()).startActivityForResult(((MediaProjectionManager) sb1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        sb1Var.a(false, true);
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
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                String M0 = bd.M0(2131742924, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131742925, null);
                alertDialog$Builder.k(bd.M0(2131747839, null), new org.telegram.ui.web.a(lVar));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                return;
            case 25:
                ((tg.q) obj).dismiss();
                return;
            case 26:
                ((tf) obj).run();
                return;
            case 27:
                ((rw) obj).run();
                return;
            case 28:
                ((ug.j2) obj).onBackPressed();
                return;
            default:
                ((s70) obj).performClick();
                return;
        }
    }
}
