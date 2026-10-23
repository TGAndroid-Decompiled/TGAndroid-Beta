package hg;

import ai.nd;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import ki.d3;
import ki.h2;
import ki.m4;
import ki.o4;
import ki.s3;
import ki.w3;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hh1;
import org.telegram.ui.kg;
import org.telegram.ui.qi0;
import rg.u2;
public final class r0 implements View.OnClickListener {
    public final int f12057a;
    public final Object f12058b;

    public r0(Object obj, int i10) {
        this.f12057a = i10;
        this.f12058b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        ki.a aVar;
        m4 m4Var;
        o2 R;
        switch (this.f12057a) {
            case 0:
                ((s0) this.f12058b).K();
                return;
            case 1:
                e2 e2Var = (e2) this.f12058b;
                LongSparseArray longSparseArray = e2Var.f11878n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.f20370id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f20370id) < 0) {
                    if (r3Var.f23094r) {
                        longSparseArray.put(stickerSet.set.f20370id, stickerSet);
                        e2Var.e.f32163a.h(r3Var.getStickerSet());
                        return;
                    }
                    e2Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 2:
                hi.o oVar = (hi.o) this.f12058b;
                TLRPC.Chat chat = oVar.I;
                if (chat != null && !chat.title.equals(((ai.t) oVar.f12227r.f900b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.I.f20343id, ((ai.t) oVar.f12227r.f900b).getText().toString(), new hi.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.I;
                if (chat2 != null && oVar.f12226n != oVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.I.default_banned_rights.manage_linked_peers = !oVar.f12226n;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.f12224c, oVar.I.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                return;
            case 3:
                ((hi.e0) this.f12058b).h.d.D(0);
                return;
            case 4:
                hi.k0.B(((hi.f0) this.f12058b).f12178r);
                return;
            case 5:
                ig.e eVar = (ig.e) this.f12058b;
                q6 q6Var = eVar.f12900f;
                int i12 = eVar.f12897a;
                boolean z10 = eVar.f12902r;
                eVar.f12902r = !z10;
                nq nqVar = eVar.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                nqVar.c(LocaleController.getString(i10), true, true);
                q6Var.a();
                if (eVar.f12902r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                q6Var.c(LocaleController.getString(i11), true, true);
                if (eVar.f12902r) {
                    eVar.f12904w |= 1;
                } else {
                    eVar.f12904w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar.f12903s, eVar.f12904w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar.f12903s);
                toggleconnectedbotpaused.paused = eVar.f12902r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 6:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.f12058b).f13074f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    xc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 7:
                ((ji.b) this.f12058b).dismiss();
                return;
            case 8:
                ki.q qVar = (ki.q) this.f12058b;
                qVar.K(0, true, 0, false, 0L);
                qi0 qi0Var = qVar.O;
                if (qi0Var != null) {
                    qi0Var.g(true);
                    qVar.O = null;
                    return;
                }
                return;
            case 9:
                ki.t0 t0Var = (ki.t0) this.f12058b;
                d3 d3Var = t0Var.h;
                if (d3Var != null && (aVar = t0Var.f15582f) != null) {
                    w3 w3Var = d3Var.f15289a;
                    w3Var.getClass();
                    if (w3.D3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15141b;
                        h2 h2Var = w3Var.K3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        w3Var.Z2.N(true);
                        h2 h2Var2 = w3Var.K3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                o4 o4Var = (o4) this.f12058b;
                ki.a aVar2 = o4Var.f15157a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((s3) m4Var).f15561a.f15656i3.i(aVar2);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f12058b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 12:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f12058b;
                if (!v0Var.f31965a) {
                    if (v0Var.f31973x == 0 && v0Var.f31974y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 13:
                hh1 hh1Var = (hh1) this.f12058b;
                if (!hh1Var.f31532a) {
                    if (hh1Var.f31539w == 0) {
                        ((Activity) hh1Var.getContext()).startActivityForResult(((MediaProjectionManager) hh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        hh1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 14:
                Context context = (Context) this.f12058b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.h1.j();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f12058b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 16:
                ((qg.y) this.f12058b).dismiss();
                return;
            case 17:
                ((c41) this.f12058b).run();
                return;
            case 18:
                ((u2) this.f12058b).onBackPressed();
                return;
            case 19:
                ((kg) this.f12058b).run();
                return;
            case 20:
                ((y90) this.f12058b).performClick();
                return;
            case 21:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((sg.m1) this.f12058b).f46773t0, null, "profile", null);
                return;
            case 22:
                final ug.e0 e0Var = (ug.e0) this.f12058b;
                wg.a aVar3 = e0Var.Q0;
                if (!aVar3.f49389a.Q) {
                    aVar3.b(true);
                    String str = e0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    e0 e0Var2 = e0Var;
                                    e0Var2.Q0.b(false);
                                    e0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new c0(e0Var2, 1), 200L);
                                    return;
                                default:
                                    e0.i0(e0Var, (TLRPC.TL_error) obj);
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
                                    e0 e0Var2 = e0Var;
                                    e0Var2.Q0.b(false);
                                    e0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new c0(e0Var2, 1), 200L);
                                    return;
                                default:
                                    e0.i0(e0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.n(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 23:
                ((ug.h0) this.f12058b).dismiss();
                return;
            case 24:
                ((ug.z) ((vg.e) this.f12058b)).f48266r.dismiss();
                return;
            case 25:
                Runnable runnable = ((yg.c) this.f12058b).e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                ((yh.c) this.f12058b).dismiss();
                return;
            case 27:
                ((yh.c0) this.f12058b).dismiss();
                return;
            case 28:
                if (((yh.o1) this.f12058b).f50894f0.f1055f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21636a = true;
                    R.showAsSheet(new nd(), obj);
                    return;
                }
                return;
            default:
                ((zh.n) this.f12058b).f52502c.f52550b.f52489a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
        }
    }
}
