package hg;

import ai.md;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ah1;
import org.telegram.ui.kg;
import org.telegram.ui.mi0;
import rg.t2;
public final class r0 implements View.OnClickListener {
    public final int f12027a;
    public final Object f12028b;

    public r0(Object obj, int i10) {
        this.f12027a = i10;
        this.f12028b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        ki.a aVar;
        m4 m4Var;
        n2 R;
        switch (this.f12027a) {
            case 0:
                ((s0) this.f12028b).K();
                return;
            case 1:
                e2 e2Var = (e2) this.f12028b;
                LongSparseArray longSparseArray = e2Var.f11851n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.f20303id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f20303id) < 0) {
                    if (r3Var.f22942r) {
                        longSparseArray.put(stickerSet.set.f20303id, stickerSet);
                        e2Var.e.f29847a.h(r3Var.getStickerSet());
                        return;
                    }
                    e2Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 2:
                hi.o oVar = (hi.o) this.f12028b;
                TLRPC.Chat chat = oVar.H;
                if (chat != null && !chat.title.equals(((ai.t) oVar.f12195n.f899b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.H.f20276id, ((ai.t) oVar.f12195n.f899b).getText().toString(), new hi.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.H;
                if (chat2 != null && oVar.h != oVar.f12194f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.H.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.f12192b, oVar.H.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                return;
            case 3:
                ((hi.e0) this.f12028b).h.d.D(0);
                return;
            case 4:
                hi.k0.z(((hi.f0) this.f12028b).f12147r);
                return;
            case 5:
                ig.e eVar = (ig.e) this.f12028b;
                q6 q6Var = eVar.f12870f;
                int i12 = eVar.f12867a;
                boolean z10 = eVar.f12872r;
                eVar.f12872r = !z10;
                nq nqVar = eVar.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                nqVar.c(LocaleController.getString(i10), true, true);
                q6Var.a();
                if (eVar.f12872r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                q6Var.c(LocaleController.getString(i11), true, true);
                if (eVar.f12872r) {
                    eVar.f12874w |= 1;
                } else {
                    eVar.f12874w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar.f12873s, eVar.f12874w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar.f12873s);
                toggleconnectedbotpaused.paused = eVar.f12872r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 6:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.f12028b).f13015f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    xc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 7:
                ((ji.b) this.f12028b).dismiss();
                return;
            case 8:
                ki.q qVar = (ki.q) this.f12028b;
                qVar.K(0, true, 0, false, 0L);
                mi0 mi0Var = qVar.O;
                if (mi0Var != null) {
                    mi0Var.g(true);
                    qVar.O = null;
                    return;
                }
                return;
            case 9:
                ki.t0 t0Var = (ki.t0) this.f12028b;
                d3 d3Var = t0Var.h;
                if (d3Var != null && (aVar = t0Var.f15522f) != null) {
                    w3 w3Var = d3Var.f15231a;
                    w3Var.getClass();
                    if (w3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15095b;
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        w3Var.W2.N(true);
                        h2 h2Var2 = w3Var.H3;
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
                o4 o4Var = (o4) this.f12028b;
                ki.a aVar2 = o4Var.f15111a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((s3) m4Var).f15501a.f15592f3.i(aVar2);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f12028b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 12:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f12028b;
                if (!v0Var.f31780a) {
                    if (v0Var.f31788x == 0 && v0Var.f31789y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 13:
                ah1 ah1Var = (ah1) this.f12028b;
                if (!ah1Var.f31347a) {
                    if (ah1Var.f31354w == 0) {
                        ((Activity) ah1Var.getContext()).startActivityForResult(((MediaProjectionManager) ah1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        ah1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 14:
                Context context = (Context) this.f12028b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f12028b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 16:
                ((qg.y) this.f12028b).dismiss();
                return;
            case 17:
                ((y31) this.f12028b).run();
                return;
            case 18:
                ((t2) this.f12028b).onBackPressed();
                return;
            case 19:
                ((kg) this.f12028b).run();
                return;
            case 20:
                ((x90) this.f12028b).performClick();
                return;
            case 21:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((sg.m1) this.f12028b).f46345t0, null, "profile", null);
                return;
            case 22:
                final ug.f0 f0Var = (ug.f0) this.f12028b;
                wg.a aVar3 = f0Var.Q0;
                if (!aVar3.f48947a.N) {
                    aVar3.b(true);
                    String str = f0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    f0 f0Var2 = f0Var;
                                    f0Var2.Q0.b(false);
                                    f0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new d0(f0Var2, 1), 200L);
                                    return;
                                default:
                                    f0.d0(f0Var, (TLRPC.TL_error) obj);
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
                                    f0 f0Var2 = f0Var;
                                    f0Var2.Q0.b(false);
                                    f0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new d0(f0Var2, 1), 200L);
                                    return;
                                default:
                                    f0.d0(f0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.o(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 23:
                ((ug.i0) this.f12028b).dismiss();
                return;
            case 24:
                ((ug.a0) ((vg.e) this.f12028b)).f47647r.dismiss();
                return;
            case 25:
                Runnable runnable = ((yg.c) this.f12028b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                ((yh.c) this.f12028b).dismiss();
                return;
            case 27:
                ((yh.c0) this.f12028b).dismiss();
                return;
            case 28:
                if (((yh.o1) this.f12028b).f50433f0.f989f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21556a = true;
                    R.showAsSheet(new md(), obj);
                    return;
                }
                return;
            default:
                ((zh.n) this.f12028b).f52036c.f52084b.f52023a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
        }
    }
}
