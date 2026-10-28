package ig;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import bi.dd;
import li.c3;
import li.f2;
import li.m4;
import li.o4;
import li.r3;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fx;
import org.telegram.ui.ig;
import org.telegram.ui.kh1;
import org.telegram.ui.pi0;
import sg.u2;
public final class d0 implements View.OnClickListener {
    public final int f14023a;
    public final Object f14024b;

    public d0(Object obj, int i10) {
        this.f14023a = i10;
        this.f14024b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        li.a aVar;
        m4 m4Var;
        r2 R;
        switch (this.f14023a) {
            case 0:
                ((v) this.f14024b).run();
                return;
            case 1:
                ((s0) this.f14024b).K();
                return;
            case 2:
                d2 d2Var = (d2) this.f14024b;
                LongSparseArray longSparseArray = d2Var.f14032n;
                q3 q3Var = (q3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                if (stickerSet != null && d2Var.h.indexOfKey(stickerSet.set.f22055id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f22055id) < 0) {
                    if (q3Var.f24826r) {
                        longSparseArray.put(stickerSet.set.f22055id, stickerSet);
                        d2Var.e.f27725a.h(q3Var.getStickerSet());
                        return;
                    }
                    d2Var.F(stickerSet, q3Var);
                    return;
                }
                return;
            case 3:
                ii.o oVar = (ii.o) this.f14024b;
                TLRPC.Chat chat = oVar.I;
                if (chat != null && !chat.title.equals(((bi.t) oVar.f14394r.f4113b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.I.f22028id, ((bi.t) oVar.f14394r.f4113b).getText().toString(), new ii.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.I;
                if (chat2 != null && oVar.f14393n != oVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.I.default_banned_rights.manage_linked_peers = !oVar.f14393n;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.f14391c, oVar.I.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                return;
            case 4:
                ((ii.d0) this.f14024b).h.d.E(0);
                return;
            case 5:
                ii.j0.B(((ii.e0) this.f14024b).f14336r);
                return;
            case 6:
                jg.e eVar = (jg.e) this.f14024b;
                s6 s6Var = eVar.f15681f;
                int i12 = eVar.f15678a;
                boolean z10 = eVar.f15683r;
                eVar.f15683r = !z10;
                pq pqVar = eVar.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                pqVar.c(LocaleController.getString(i10), true, true);
                s6Var.a();
                if (eVar.f15683r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                s6Var.c(LocaleController.getString(i11), true, true);
                if (eVar.f15683r) {
                    eVar.f15685w |= 1;
                } else {
                    eVar.f15685w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar.f15684s, eVar.f15685w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar.f15684s);
                toggleconnectedbotpaused.paused = eVar.f15683r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 7:
                TL_account.TL_businessChatLink tL_businessChatLink = ((jg.u) this.f14024b).f15859f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    wc.b0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 8:
                ((ki.b) this.f14024b).dismiss();
                return;
            case 9:
                li.q qVar = (li.q) this.f14024b;
                qVar.K(0, true, 0, false, 0L);
                pi0 pi0Var = qVar.O;
                if (pi0Var != null) {
                    pi0Var.g(true);
                    qVar.O = null;
                    return;
                }
                return;
            case 10:
                li.s0 s0Var = (li.s0) this.f14024b;
                c3 c3Var = s0Var.h;
                if (c3Var != null && (aVar = s0Var.f17462f) != null) {
                    v3 v3Var = c3Var.f17171a;
                    v3Var.getClass();
                    if (v3.D3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f17053b;
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        v3Var.f32504g3.O(true);
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                o4 o4Var = (o4) this.f14024b;
                li.a aVar2 = o4Var.f17652a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((r3) m4Var).f17442a.f17556p3.o(aVar2);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f14024b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 13:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f14024b;
                if (!v0Var.f34245a) {
                    if (v0Var.f34253x == 0 && v0Var.f34254y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 14:
                kh1 kh1Var = (kh1) this.f14024b;
                if (!kh1Var.f33839a) {
                    if (kh1Var.f33846w == 0) {
                        ((Activity) kh1Var.getContext()).startActivityForResult(((MediaProjectionManager) kh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        kh1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 15:
                Context context = (Context) this.f14024b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.i1.j();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f14024b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 17:
                ((rg.y) this.f14024b).dismiss();
                return;
            case 18:
                ((fx) this.f14024b).run();
                return;
            case 19:
                ((u2) this.f14024b).onBackPressed();
                return;
            case 20:
                ((ig) this.f14024b).run();
                return;
            case 21:
                ((aa0) this.f14024b).performClick();
                return;
            case 22:
                PremiumPreviewFragment.q0();
                PremiumPreviewFragment.l0(((tg.m1) this.f14024b).f48986t0, null, "profile", null);
                return;
            case 23:
                final vg.g0 g0Var = (vg.g0) this.f14024b;
                xg.a aVar3 = g0Var.Q0;
                if (!aVar3.f51809a.Q) {
                    aVar3.b(true);
                    String str = g0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0.i0(g0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0.i0(g0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new vg.p(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 24:
                ((vg.j0) this.f14024b).dismiss();
                return;
            case 25:
                ((vg.b0) ((wg.e) this.f14024b)).f50182r.dismiss();
                return;
            case 26:
                Runnable runnable = ((zg.c) this.f14024b).e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                ((zh.c) this.f14024b).dismiss();
                return;
            case 28:
                ((zh.c0) this.f14024b).dismiss();
                return;
            default:
                if (((zh.p1) this.f14024b).f53252f0.f5374f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f22929a = true;
                    R.showAsSheet(new dd(), obj);
                    return;
                }
                return;
        }
    }
}
