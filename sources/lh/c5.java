package lh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.md;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eh1;
import org.telegram.ui.gf;
import org.telegram.ui.lg;
import org.telegram.ui.ni0;
import org.telegram.ui.ol0;

public final class c5 implements View.OnClickListener {

    public final int f15745a;

    public final Object f15746b;

    public c5(Object obj, int i10) {
        this.f15745a = i10;
        this.f15746b = obj;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        rh.a aVar;
        rh.e4 e4Var;
        switch (this.f15745a) {
            case 0:
                ((d5.i) this.f15746b).run();
                break;
            case 1:
                i6 i6Var = ((h6) this.f15746b).f16074x;
                if (i6Var.f16115r && (callback = i6Var.f16113f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 2:
                z8 z8Var = (z8) ((w8) this.f15746b).h;
                if (z8Var != null) {
                    z8Var.run();
                }
                break;
            case 3:
                ((gf) this.f15746b).run();
                break;
            case 4:
                ((gf) this.f15746b).run();
                break;
            case 5:
                ChatActivityEnterView.h(((md) ((nh.n0) this.f15746b).d).f30646a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 6:
                ((androidx.car.app.utils.b) this.f15746b).run();
                break;
            case 7:
                oh.o oVar = (oh.o) this.f15746b;
                TLRPC.Chat chat = oVar.D;
                if (chat != null && !chat.title.equals(((hh.o) oVar.f19536n.f594b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.D.f22380id, ((hh.o) oVar.f19536n.f594b).getText().toString(), new oh.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.D;
                if (chat2 != null && oVar.h != oVar.f19535f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.D.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.f19532b, oVar.D.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                break;
            case 8:
                ((oh.d0) this.f15746b).h.d.D(0);
                break;
            case 9:
                oh.j0.y(((oh.e0) this.f15746b).f19476r);
                break;
            case 10:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f15746b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.J.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 11:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f15746b;
                if (!u0Var.f33913a) {
                    if (u0Var.f33922x == 0 && u0Var.f33923y) {
                        ((Activity) u0Var.getContext()).startActivityForResult(((MediaProjectionManager) u0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                    } else {
                        u0Var.b(false, true);
                    }
                    break;
                }
                break;
            case 12:
                eh1 eh1Var = (eh1) this.f15746b;
                if (!eh1Var.f33475a) {
                    if (eh1Var.f33483w != 0) {
                        eh1Var.a(false, true);
                    } else {
                        ((Activity) eh1Var.getContext()).startActivityForResult(((MediaProjectionManager) eh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                    }
                    break;
                }
                break;
            case 13:
                Context context = (Context) this.f15746b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.g1.j();
                }
                break;
            case 14:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f15746b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 15:
                pf.k kVar = (pf.k) this.f15746b;
                MessagesController.getInstance(kVar.B).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar.l();
                break;
            case 16:
                ((pf.p) this.f15746b).run();
                break;
            case 17:
                ((pf.h0) this.f15746b).K();
                break;
            case 18:
                pf.l1 l1Var = (pf.l1) this.f15746b;
                LongSparseArray longSparseArray = l1Var.f45870n;
                org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                if (stickerSet != null && l1Var.h.indexOfKey(stickerSet.set.f22407id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f22407id) < 0) {
                    if (!p3Var.f24975r) {
                        l1Var.F(stickerSet, p3Var);
                    } else {
                        longSparseArray.put(stickerSet.set.f22407id, stickerSet);
                        l1Var.f45868e.f34462a.h(p3Var.getStickerSet());
                    }
                    break;
                }
                break;
            case 19:
                qf.g gVar = (qf.g) this.f15746b;
                org.telegram.ui.Components.j6 j6Var = gVar.f46296f;
                int i10 = gVar.f46292a;
                boolean z10 = gVar.f46298r;
                gVar.f46298r = !z10;
                gVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                j6Var.a();
                j6Var.c(LocaleController.getString(gVar.f46298r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (gVar.f46298r) {
                    gVar.f46300w |= 1;
                } else {
                    gVar.f46300w &= -2;
                }
                MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_botflags" + gVar.f46299s, gVar.f46300w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i10).getInputPeer(gVar.f46299s);
                toggleconnectedbotpaused.paused = gVar.f46298r;
                ConnectionsManager.getInstance(i10).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 20:
                TL_account.TL_businessChatLink tL_businessChatLink = ((qf.q) this.f15746b).f46428f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    org.telegram.ui.Components.mc.a0(LaunchActivity.R()).k(false).j();
                }
                break;
            case 21:
                ((qh.b) this.f15746b).dismiss();
                break;
            case 22:
                rh.p pVar = (rh.p) this.f15746b;
                pVar.I(0, true, 0, false, 0L);
                ni0 ni0Var = pVar.K;
                if (ni0Var != null) {
                    ni0Var.h(true);
                    pVar.K = null;
                }
                break;
            case 23:
                rh.q0 q0Var = (rh.q0) this.f15746b;
                rh.x2 x2Var = q0Var.h;
                if (x2Var != null && (aVar = q0Var.f47388f) != null) {
                    rh.p3 p3Var2 = x2Var.f47583a;
                    p3Var2.getClass();
                    if (rh.p3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f47028b;
                        rh.b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        p3Var2.U2.N(true);
                        rh.b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        break;
                    }
                }
                break;
            case 24:
                rh.g4 g4Var = (rh.g4) this.f15746b;
                rh.a aVar2 = g4Var.f47594a;
                if (aVar2 != null && (e4Var = g4Var.C) != null) {
                    ((rh.l3) e4Var).f47259a.f47340d3.l2(aVar2);
                    break;
                }
                break;
            case 25:
                ((yf.x) this.f15746b).dismiss();
                break;
            case 26:
                ((ol0) this.f15746b).run();
                break;
            case 27:
                ((zf.t2) this.f15746b).onBackPressed();
                break;
            default:
                ((lg) this.f15746b).run();
                break;
        }
    }
}
