package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import bi.g3;
import bi.oa;
import bi.qd;
import bi.sa;
import bi.u7;
import bi.v7;
import bi.y0;
import di.s0;
import ei.k0;
import fg.h2;
import fg.t0;
import hi.k2;
import hi.p4;
import hi.r4;
import hi.v3;
import hi.w0;
import hi.z3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.sf;
import org.telegram.ui.si1;
public final class u implements View.OnClickListener {
    public final int f467a;
    public final Object f468b;

    public u(Object obj, int i10) {
        this.f467a = i10;
        this.f468b = obj;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11;
        hi.a aVar;
        p4 p4Var;
        switch (this.f467a) {
            case 0:
                ((a3.d) this.f468b).run();
                return;
            case 1:
                ((androidx.mediarouter.app.h) this.f468b).dismiss();
                return;
            case 2:
                bi.o oVar = (bi.o) this.f468b;
                bi.i iVar = oVar.f3268f;
                iVar.d();
                iVar.k(true);
                bi.e eVar = oVar.f3265c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 3:
                ((qd) this.f468b).B();
                return;
            case 4:
                y0.a((y0) this.f468b);
                return;
            case 5:
                ((g3) this.f468b).run();
                return;
            case 6:
                v7 v7Var = ((u7) this.f468b).f3730x;
                if (v7Var.f3796r && (callback = v7Var.f3794f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 7:
                sa saVar = (sa) ((oa) this.f468b).h;
                if (saVar != null) {
                    saVar.run();
                    return;
                }
                return;
            case 8:
                ((sf) this.f468b).run();
                return;
            case 9:
                ((sf) this.f468b).run();
                return;
            case 10:
                ChatActivityEnterView.h(((yd) ((s0) this.f468b).d).f29305a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 11:
                ((androidx.car.app.utils.b) this.f468b).run();
                return;
            case 12:
                ei.p pVar = (ei.p) this.f468b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((ei.o) pVar.f7600n.f3058b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f17195id, ((ei.o) pVar.f7600n.f3058b).getText().toString(), new ei.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f7599f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f7597b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 13:
                ((ei.e0) this.f468b).h.d.D(0);
                return;
            case 14:
                k0.x(((ei.f0) this.f468b).f7548r);
                return;
            case 15:
                fg.m mVar = (fg.m) this.f468b;
                MessagesController.getInstance(mVar.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar.l();
                return;
            case 16:
                ((fg.v) this.f468b).run();
                return;
            case 17:
                ((t0) this.f468b).K();
                return;
            case 18:
                h2 h2Var = (h2) this.f468b;
                LongSparseArray longSparseArray = h2Var.f8068n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && h2Var.h.indexOfKey(stickerSet.set.f17222id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f17222id) < 0) {
                    if (r3Var.f19889r) {
                        longSparseArray.put(stickerSet.set.f17222id, stickerSet);
                        h2Var.e.f22864a.h(r3Var.getStickerSet());
                        return;
                    }
                    h2Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 19:
                gg.e eVar2 = (gg.e) this.f468b;
                o6 o6Var = eVar2.f8852f;
                int i12 = eVar2.f8849a;
                boolean z10 = eVar2.f8854r;
                eVar2.f8854r = !z10;
                jq jqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                jqVar.c(LocaleController.getString(i10), true, true);
                o6Var.a();
                if (eVar2.f8854r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                o6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f8854r) {
                    eVar2.f8856w |= 1;
                } else {
                    eVar2.f8856w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f8855s, eVar2.f8856w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f8855s);
                toggleconnectedbotpaused.paused = eVar2.f8854r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 20:
                TL_account.TL_businessChatLink tL_businessChatLink = ((gg.v) this.f468b).f9053f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    wc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 21:
                ((gi.c) this.f468b).dismiss();
                return;
            case 22:
                hi.s sVar = (hi.s) this.f468b;
                sVar.I(0, true, 0, false, 0L);
                cj0 cj0Var = sVar.O;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    sVar.O = null;
                    return;
                }
                return;
            case 23:
                w0 w0Var = (w0) this.f468b;
                hi.g3 g3Var = w0Var.h;
                if (g3Var != null && (aVar = w0Var.f9921f) != null) {
                    z3 z3Var = g3Var.f9614a;
                    z3Var.getClass();
                    if (z3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f9421b;
                        k2 k2Var = z3Var.J3;
                        if (k2Var != null) {
                            k2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        z3Var.Y2.N(true);
                        k2 k2Var2 = z3Var.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                r4 r4Var = (r4) this.f468b;
                hi.a aVar2 = r4Var.f9464a;
                if (aVar2 != null && (p4Var = r4Var.G) != null) {
                    ((v3) p4Var).f9909a.f10001h3.k(aVar2);
                    return;
                }
                return;
            case 25:
                ((og.a0) this.f468b).dismiss();
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f468b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 27:
                org.telegram.ui.Components.voip.w0 w0Var2 = (org.telegram.ui.Components.voip.w0) this.f468b;
                if (!w0Var2.f28505a) {
                    if (w0Var2.f28513x == 0 && w0Var2.f28514y) {
                        ((Activity) w0Var2.getContext()).startActivityForResult(((MediaProjectionManager) w0Var2.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        w0Var2.b(false, true);
                        return;
                    }
                }
                return;
            case 28:
                si1 si1Var = (si1) this.f468b;
                if (!si1Var.f28066a) {
                    if (si1Var.f28073w == 0) {
                        ((Activity) si1Var.getContext()).startActivityForResult(((MediaProjectionManager) si1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        si1Var.a(false, true);
                        return;
                    }
                }
                return;
            default:
                Context context = (Context) this.f468b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    i1.j();
                    return;
                }
                return;
        }
    }
}
