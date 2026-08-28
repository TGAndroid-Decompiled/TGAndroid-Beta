package kh;

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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.pd;
import org.telegram.ui.Components.tp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fh1;
import org.telegram.ui.gf;
import org.telegram.ui.jg;
import org.telegram.ui.jh0;
import org.telegram.ui.li0;
public final class x8 implements View.OnClickListener {
    public final int f16381a;
    public final Object f16382b;

    public x8(Object obj, int i9) {
        this.f16381a = i9;
        this.f16382b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        qh.a aVar;
        qh.d4 d4Var;
        switch (this.f16381a) {
            case 0:
                c9 c9Var = (c9) ((z8) this.f16382b).h;
                if (c9Var != null) {
                    c9Var.run();
                    return;
                }
                return;
            case 1:
                ((gf) this.f16382b).run();
                return;
            case 2:
                ((gf) this.f16382b).run();
                return;
            case 3:
                ChatActivityEnterView.h(((pd) ((mh.o0) this.f16382b).d).f31615a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 4:
                ((androidx.car.app.utils.c) this.f16382b).run();
                return;
            case 5:
                nh.o oVar = (nh.o) this.f16382b;
                TLRPC.Chat chat = oVar.D;
                if (chat != null && !chat.title.equals(((gh.o) oVar.f18687n.f6412b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.D.f22380id, ((gh.o) oVar.f18687n.f6412b).getText().toString(), new nh.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.D;
                if (chat2 != null && oVar.h != oVar.f18686f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.D.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.f18683b, oVar.D.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                return;
            case 6:
                ((nh.d0) this.f16382b).h.d.D(0);
                return;
            case 7:
                nh.j0.x(((nh.e0) this.f16382b).f18627r);
                return;
            case 8:
                of.m mVar = (of.m) this.f16382b;
                MessagesController.getInstance(mVar.B).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar.l();
                return;
            case 9:
                ((of.t) this.f16382b).run();
                return;
            case 10:
                ((of.p0) this.f16382b).K();
                return;
            case 11:
                of.y1 y1Var = (of.y1) this.f16382b;
                LongSparseArray longSparseArray = y1Var.f19553n;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && y1Var.h.indexOfKey(stickerSet.set.f22407id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f22407id) < 0) {
                    if (s3Var.f25263r) {
                        longSparseArray.put(stickerSet.set.f22407id, stickerSet);
                        y1Var.f19551e.f33256a.h(s3Var.getStickerSet());
                        return;
                    }
                    y1Var.F(stickerSet, s3Var);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f16382b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.J.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 13:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f16382b;
                if (!u0Var.f33863a) {
                    if (u0Var.f33872x == 0 && u0Var.f33873y) {
                        ((Activity) u0Var.getContext()).startActivityForResult(((MediaProjectionManager) u0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        u0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 14:
                fh1 fh1Var = (fh1) this.f16382b;
                if (!fh1Var.f33425a) {
                    if (fh1Var.f33433w == 0) {
                        ((Activity) fh1Var.getContext()).startActivityForResult(((MediaProjectionManager) fh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        fh1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 15:
                Context context = (Context) this.f16382b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.g1.j();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f16382b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 17:
                pf.f fVar = (pf.f) this.f16382b;
                org.telegram.ui.Components.j6 j6Var = fVar.f45618f;
                int i11 = fVar.f45614a;
                boolean z10 = fVar.f45620r;
                fVar.f45620r = !z10;
                tp tpVar = fVar.h;
                if (!z10) {
                    i9 = R.string.BizBotStart;
                } else {
                    i9 = R.string.BizBotStop;
                }
                tpVar.c(LocaleController.getString(i9), true, true);
                j6Var.a();
                if (fVar.f45620r) {
                    i10 = R.string.BizBotStatusStopped;
                } else {
                    i10 = R.string.BizBotStatusManages;
                }
                j6Var.c(LocaleController.getString(i10), true, true);
                if (fVar.f45620r) {
                    fVar.f45622w |= 1;
                } else {
                    fVar.f45622w &= -2;
                }
                MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_botflags" + fVar.f45621s, fVar.f45622w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i11).getInputPeer(fVar.f45621s);
                toggleconnectedbotpaused.paused = fVar.f45620r;
                ConnectionsManager.getInstance(i11).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 18:
                TL_account.TL_businessChatLink tL_businessChatLink = ((pf.p) this.f16382b).f45745f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    org.telegram.ui.Components.oc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 19:
                ((ph.b) this.f16382b).dismiss();
                return;
            case 20:
                qh.p pVar = (qh.p) this.f16382b;
                pVar.H(0, true, 0, false, 0L);
                li0 li0Var = pVar.K;
                if (li0Var != null) {
                    li0Var.h(true);
                    pVar.K = null;
                    return;
                }
                return;
            case 21:
                qh.q0 q0Var = (qh.q0) this.f16382b;
                qh.w2 w2Var = q0Var.h;
                if (w2Var != null && (aVar = q0Var.f46625f) != null) {
                    qh.o3 o3Var = w2Var.f46773a;
                    o3Var.getClass();
                    if (qh.o3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f46269b;
                        qh.b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        o3Var.U2.N(true);
                        qh.b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                qh.f4 f4Var = (qh.f4) this.f16382b;
                qh.a aVar2 = f4Var.f46834a;
                if (aVar2 != null && (d4Var = f4Var.C) != null) {
                    ((qh.k3) d4Var).f46489a.f46565d3.n0(aVar2);
                    return;
                }
                return;
            case 23:
                ((xf.x) this.f16382b).dismiss();
                return;
            case 24:
                ((jh0) this.f16382b).run();
                return;
            case 25:
                ((yf.t2) this.f16382b).onBackPressed();
                return;
            case 26:
                ((jg) this.f16382b).run();
                return;
            case 27:
                ((l80) this.f16382b).performClick();
                return;
            default:
                PremiumPreviewFragment.o0();
                PremiumPreviewFragment.j0(((zf.k1) this.f16382b).f50581p0, null, "profile", null);
                return;
        }
    }
}
