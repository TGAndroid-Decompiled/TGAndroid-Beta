package mh;

import ag.v0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import j7.l1;
import lh.m5;
import nh.l8;
import nh.o8;
import nh.u0;
import nh.v5;
import nh.w5;
import nh.wa;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.p3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.df;
import org.telegram.ui.hh1;
import org.telegram.ui.ki0;
import org.telegram.ui.lx0;
import ph.l0;
import qh.c0;
import qh.d0;
import qh.i0;
import rf.m1;
import th.b2;
import th.e4;
import th.g4;
import th.l3;
import th.q0;
import th.x2;
public final class n implements View.OnClickListener {
    public final int f17030a;
    public final Object f17031b;

    public n(Object obj, int i10) {
        this.f17030a = i10;
        this.f17031b = obj;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11;
        th.a aVar;
        e4 e4Var;
        switch (this.f17030a) {
            case 0:
                ((m5) this.f17031b).run();
                return;
            case 1:
                nh.m mVar = (nh.m) this.f17031b;
                nh.g gVar = mVar.f18076f;
                gVar.d();
                gVar.k(true);
                nh.e eVar = mVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 2:
                ((wa) this.f17031b).B();
                return;
            case 3:
                u0.a((u0) this.f17031b);
                return;
            case 4:
                ((v0) this.f17031b).run();
                return;
            case 5:
                w5 w5Var = ((v5) this.f17031b).f18758x;
                if (w5Var.f18794r && (callback = w5Var.f18792f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 6:
                o8 o8Var = (o8) ((l8) this.f17031b).h;
                if (o8Var != null) {
                    o8Var.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f17031b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.J.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 8:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f17031b;
                if (!v0Var.f34067a) {
                    if (v0Var.f34076x == 0 && v0Var.f34077y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 9:
                hh1 hh1Var = (hh1) this.f17031b;
                if (!hh1Var.f33620a) {
                    if (hh1Var.f33628w == 0) {
                        ((Activity) hh1Var.getContext()).startActivityForResult(((MediaProjectionManager) hh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        hh1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 10:
                Context context = (Context) this.f17031b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    h1.j();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f17031b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                l1.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 12:
                ((df) this.f17031b).run();
                return;
            case 13:
                ((df) this.f17031b).run();
                return;
            case 14:
                ChatActivityEnterView.h(((td) ((l0) this.f17031b).d).f32925a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 15:
                ((lx0) this.f17031b).run();
                return;
            case 16:
                qh.n nVar = (qh.n) this.f17031b;
                TLRPC.Chat chat = nVar.D;
                if (chat != null && !chat.title.equals(((jh.m) nVar.f46741n.f35225b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.D.f22392id, ((jh.m) nVar.f46741n.f35225b).getText().toString(), new qh.i(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.D;
                if (chat2 != null && nVar.h != nVar.f46740f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.D.default_banned_rights.manage_linked_peers = !nVar.h;
                    nVar.getMessagesController().setDefaultBannedRole(nVar.f46737b, nVar.D.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                return;
            case 17:
                ((c0) this.f17031b).h.d.D(0);
                return;
            case 18:
                i0.x(((d0) this.f17031b).f46689r);
                return;
            case 19:
                rf.l lVar2 = (rf.l) this.f17031b;
                MessagesController.getInstance(lVar2.B).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                lVar2.l();
                return;
            case 20:
                ((rf.q) this.f17031b).run();
                return;
            case 21:
                ((rf.i0) this.f17031b).K();
                return;
            case 22:
                m1 m1Var = (m1) this.f17031b;
                LongSparseArray longSparseArray = m1Var.f47311n;
                p3 p3Var = (p3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.f22419id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f22419id) < 0) {
                    if (p3Var.f24966r) {
                        longSparseArray.put(stickerSet.set.f22419id, stickerSet);
                        m1Var.f47309e.f28756a.h(p3Var.getStickerSet());
                        return;
                    }
                    m1Var.F(stickerSet, p3Var);
                    return;
                }
                return;
            case 23:
                sf.f fVar = (sf.f) this.f17031b;
                o6 o6Var = fVar.f47792f;
                int i12 = fVar.f47788a;
                boolean z10 = fVar.f47794r;
                fVar.f47794r = !z10;
                xp xpVar = fVar.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                xpVar.c(LocaleController.getString(i10), true, true);
                o6Var.a();
                if (fVar.f47794r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                o6Var.c(LocaleController.getString(i11), true, true);
                if (fVar.f47794r) {
                    fVar.f47796w |= 1;
                } else {
                    fVar.f47796w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + fVar.f47795s, fVar.f47796w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(fVar.f47795s);
                toggleconnectedbotpaused.paused = fVar.f47794r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((sf.p) this.f17031b).f47920f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    tc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 25:
                ((sh.b) this.f17031b).dismiss();
                return;
            case 26:
                th.p pVar = (th.p) this.f17031b;
                pVar.H(0, true, 0, false, 0L);
                ki0 ki0Var = pVar.K;
                if (ki0Var != null) {
                    ki0Var.h(true);
                    pVar.K = null;
                    return;
                }
                return;
            case 27:
                q0 q0Var = (q0) this.f17031b;
                x2 x2Var = q0Var.h;
                if (x2Var != null && (aVar = q0Var.f48686f) != null) {
                    th.p3 p3Var2 = x2Var.f48881a;
                    p3Var2.getClass();
                    if (th.p3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f48328b;
                        b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        p3Var2.U2.N(true);
                        b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                g4 g4Var = (g4) this.f17031b;
                th.a aVar2 = g4Var.f48892a;
                if (aVar2 != null && (e4Var = g4Var.C) != null) {
                    ((l3) e4Var).f48559a.f48638d3.J(aVar2);
                    return;
                }
                return;
        }
    }
}
