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
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af;
import org.telegram.ui.bc1;
import org.telegram.ui.fg0;
public final class o0 implements View.OnClickListener {
    public final int f15125a;
    public final Object f15126b;

    public o0(Object obj, int i7) {
        this.f15125a = i7;
        this.f15126b = obj;
    }

    @Override
    public final void onClick(View view) {
        x10 x10Var;
        int i7;
        int i10;
        oi.a aVar;
        oi.j4 j4Var;
        int i11 = this.f15125a;
        Object obj = this.f15126b;
        switch (i11) {
            case 0:
                v0.a((v0) obj);
                return;
            case 1:
                ((ai.a1) obj).run();
                return;
            case 2:
                p5 p5Var = ((o5) obj).f15169y;
                if (p5Var.f15234r && (x10Var = p5Var.f15232f) != null) {
                    x10Var.a(5);
                    return;
                }
                return;
            case 3:
                b8 b8Var = (b8) ((y7) obj).h;
                if (b8Var != null) {
                    b8Var.run();
                    return;
                }
                return;
            case 4:
                jg.m mVar = (jg.m) obj;
                mp.u1(mVar.G).f25754s.clear();
                mp.g1().edit().remove("installReferer").commit();
                mVar.f();
                return;
            case 5:
                ((jg.v) obj).run();
                return;
            case 6:
                ((jg.r0) obj).J();
                return;
            case 7:
                jg.c2 c2Var = (jg.c2) obj;
                LongSparseArray longSparseArray = c2Var.f17422n;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                if (stickerSet != null && c2Var.h.indexOfKey(stickerSet.set.f28430id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f28430id) < 0) {
                    if (v3Var.f32162r) {
                        longSparseArray.put(stickerSet.set.f28430id, stickerSet);
                        c2Var.f17420e.f40490a.h(v3Var.getStickerSet());
                        return;
                    }
                    c2Var.F(stickerSet, v3Var);
                    return;
                }
                return;
            case 8:
                kg.e eVar = (kg.e) obj;
                org.telegram.ui.Components.n6 n6Var = eVar.f18291f;
                int i12 = eVar.f18287a;
                boolean z10 = eVar.f18293r;
                eVar.f18293r = !z10;
                bq bqVar = eVar.h;
                if (!z10) {
                    i7 = 2131753699;
                } else {
                    i7 = 2131753696;
                }
                bqVar.c(gd.M0(i7, null), true, true);
                n6Var.a();
                if (eVar.f18293r) {
                    i10 = 2131753697;
                } else {
                    i10 = 2131753698;
                }
                n6Var.c(gd.M0(i10, null), true, true);
                if (eVar.f18293r) {
                    eVar.f18296x |= 1;
                } else {
                    eVar.f18296x &= -2;
                }
                mp.u1(i12).f25658g7.edit().putInt("dialog_botflags" + eVar.f18294s, eVar.f18296x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = mp.u1(i12).l1(eVar.f18294s);
                toggleconnectedbotpaused.paused = eVar.f18293r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 9:
                TL_account.TL_businessChatLink tL_businessChatLink = ((kg.t) obj).f18458f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.g0.g(tL_businessChatLink.link);
                    lc.b0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 10:
                ((af) obj).run();
                return;
            case 11:
                ((af) obj).run();
                return;
            case 12:
                ChatActivityEnterView.g(((qd) ((ki.m0) obj).d).f38761a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 13:
                ((ai.s) obj).run();
                return;
            case 14:
                li.p pVar = (li.p) obj;
                TLRPC.Chat chat = pVar.J;
                if (chat != null && !chat.title.equals(((di.q) pVar.f19983r.f3400b).getText().toString())) {
                    pVar.getMessagesController().C(pVar.J.f28403id, ((di.q) pVar.f19983r.f3400b).getText().toString(), new li.i(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.J;
                if (chat2 != null && pVar.f19982n != pVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.J.default_banned_rights.manage_linked_peers = !pVar.f19982n;
                    pVar.getMessagesController().S4(pVar.f19979c, pVar.J.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 15:
                ((li.y) obj).f20011n.f19902o1.A(0);
                return;
            case 16:
                li.d0 d0Var = ((li.z) obj).f20013r;
                if (!org.telegram.messenger.v3.w(27, d0Var.f19904q1)) {
                    d0Var.dismiss();
                    return;
                }
                d dVar = d0Var.f19906s1;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    mp u12 = mp.u1(d0Var.f30187a);
                    li.t tVar = new li.t(d0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new fl(u12, tVar, 0));
                    return;
                }
                return;
            case 17:
                ((ni.c) obj).dismiss();
                return;
            case 18:
                oi.o oVar = (oi.o) obj;
                oVar.M(true, 0, 0, 0L, false);
                fg0 fg0Var = oVar.P;
                if (fg0Var != null) {
                    fg0Var.h(true);
                    oVar.P = null;
                    return;
                }
                return;
            case 19:
                oi.p0 p0Var = (oi.p0) obj;
                oi.b3 b3Var = p0Var.h;
                if (b3Var != null && (aVar = p0Var.f22233f) != null) {
                    oi.s3 s3Var = b3Var.f21949a;
                    s3Var.getClass();
                    if (oi.s3.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21907b;
                        oi.e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        s3Var.f34607g3.O(true);
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
            case 20:
                oi.l4 l4Var = (oi.l4) obj;
                oi.a aVar2 = l4Var.f22439a;
                if (aVar2 != null && (j4Var = l4Var.H) != null) {
                    ((oi.o3) j4Var).f22220a.f22334p3.H(aVar2);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) obj;
                org.telegram.ui.ActionBar.k kVar = zVar.f30297b;
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) view;
                if (r0Var.t()) {
                    if (kVar.f29102v0.a()) {
                        r0Var.V(null, null);
                        return;
                    }
                    return;
                } else if (r0Var.v()) {
                    kVar.B(r0Var.U(true));
                    return;
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 22:
                ((org.telegram.ui.ActionBar.x1) obj).dismiss();
                return;
            case 23:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                x2Var.getClass();
                x2Var.M(((Integer) view.getTag()).intValue());
                return;
            case 24:
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) obj;
                if (!d5Var.f28871y.f57658f) {
                    if (d5Var.f28870x.f57658f) {
                        org.telegram.ui.ActionBar.a5 a5Var = d5Var.f28861a;
                        int i13 = d5Var.f28862b;
                        org.telegram.ui.ActionBar.j jVar = a5Var.W;
                        if (jVar != null) {
                            jVar.b(i13);
                            return;
                        }
                        return;
                    } else if (d5Var.f28863c == org.telegram.ui.ActionBar.c5.f28828b) {
                        org.telegram.messenger.g0.E3(4.0f, d5Var, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                yVar.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 26:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) obj;
                if (!w0Var.f41279a) {
                    if (w0Var.f41289y == 0 && w0Var.E) {
                        ((Activity) w0Var.getContext()).startActivityForResult(((MediaProjectionManager) w0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        w0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 27:
                bc1 bc1Var = (bc1) obj;
                if (!bc1Var.f40788a) {
                    if (bc1Var.f40797x == 0) {
                        ((Activity) bc1Var.getContext()).startActivityForResult(((MediaProjectionManager) bc1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        bc1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 28:
                org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar2.getContext());
                String M0 = gd.M0(2131742656, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131742657, null);
                alertDialog$Builder.k(gd.M0(2131747638, null), new org.telegram.ui.web.a(kVar2));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                alertDialog$Builder.p();
                return;
            default:
                ((sg.q) obj).dismiss();
                return;
        }
    }
}
