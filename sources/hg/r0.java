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
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ah1;
import org.telegram.ui.kg;
import org.telegram.ui.li0;
import rg.t2;
public final class r0 implements View.OnClickListener {
    public final int f12029a;
    public final Object f12030b;

    public r0(Object obj, int i10) {
        this.f12029a = i10;
        this.f12030b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        ki.a aVar;
        m4 m4Var;
        n2 R;
        switch (this.f12029a) {
            case 0:
                ((s0) this.f12030b).K();
                return;
            case 1:
                e2 e2Var = (e2) this.f12030b;
                LongSparseArray longSparseArray = e2Var.f11853n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.f20302id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f20302id) < 0) {
                    if (r3Var.f22941r) {
                        longSparseArray.put(stickerSet.set.f20302id, stickerSet);
                        e2Var.e.f29524a.h(r3Var.getStickerSet());
                        return;
                    }
                    e2Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 2:
                hi.o oVar = (hi.o) this.f12030b;
                TLRPC.Chat chat = oVar.H;
                if (chat != null && !chat.title.equals(((ai.t) oVar.f12197n.f899b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.H.f20275id, ((ai.t) oVar.f12197n.f899b).getText().toString(), new hi.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.H;
                if (chat2 != null && oVar.h != oVar.f12196f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.H.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.f12194b, oVar.H.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                return;
            case 3:
                ((hi.e0) this.f12030b).h.d.D(0);
                return;
            case 4:
                hi.k0.z(((hi.f0) this.f12030b).f12149r);
                return;
            case 5:
                ig.e eVar = (ig.e) this.f12030b;
                q6 q6Var = eVar.f12872f;
                int i12 = eVar.f12869a;
                boolean z10 = eVar.f12874r;
                eVar.f12874r = !z10;
                nq nqVar = eVar.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                nqVar.c(LocaleController.getString(i10), true, true);
                q6Var.a();
                if (eVar.f12874r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                q6Var.c(LocaleController.getString(i11), true, true);
                if (eVar.f12874r) {
                    eVar.f12876w |= 1;
                } else {
                    eVar.f12876w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar.f12875s, eVar.f12876w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar.f12875s);
                toggleconnectedbotpaused.paused = eVar.f12874r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 6:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.f12030b).f13017f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    xc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 7:
                ((ji.b) this.f12030b).dismiss();
                return;
            case 8:
                ki.q qVar = (ki.q) this.f12030b;
                qVar.K(0, true, 0, false, 0L);
                li0 li0Var = qVar.O;
                if (li0Var != null) {
                    li0Var.h(true);
                    qVar.O = null;
                    return;
                }
                return;
            case 9:
                ki.t0 t0Var = (ki.t0) this.f12030b;
                d3 d3Var = t0Var.h;
                if (d3Var != null && (aVar = t0Var.f15524f) != null) {
                    w3 w3Var = d3Var.f15233a;
                    w3Var.getClass();
                    if (w3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15097b;
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
                o4 o4Var = (o4) this.f12030b;
                ki.a aVar2 = o4Var.f15113a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((s3) m4Var).f15503a.f15594f3.i(aVar2);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f12030b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 12:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f12030b;
                if (!v0Var.f31830a) {
                    if (v0Var.f31838x == 0 && v0Var.f31839y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 13:
                ah1 ah1Var = (ah1) this.f12030b;
                if (!ah1Var.f31397a) {
                    if (ah1Var.f31404w == 0) {
                        ((Activity) ah1Var.getContext()).startActivityForResult(((MediaProjectionManager) ah1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        ah1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 14:
                Context context = (Context) this.f12030b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f12030b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 16:
                ((qg.y) this.f12030b).dismiss();
                return;
            case 17:
                ((x31) this.f12030b).run();
                return;
            case 18:
                ((t2) this.f12030b).onBackPressed();
                return;
            case 19:
                ((kg) this.f12030b).run();
                return;
            case 20:
                ((x90) this.f12030b).performClick();
                return;
            case 21:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((sg.m1) this.f12030b).f46338t0, null, "profile", null);
                return;
            case 22:
                final ug.f0 f0Var = (ug.f0) this.f12030b;
                wg.a aVar3 = f0Var.Q0;
                if (!aVar3.f48940a.N) {
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
                ((ug.i0) this.f12030b).dismiss();
                return;
            case 24:
                ((ug.a0) ((vg.e) this.f12030b)).f47640r.dismiss();
                return;
            case 25:
                Runnable runnable = ((yg.c) this.f12030b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                ((yh.c) this.f12030b).dismiss();
                return;
            case 27:
                ((yh.c0) this.f12030b).dismiss();
                return;
            case 28:
                if (((yh.o1) this.f12030b).f50426f0.f980f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21555a = true;
                    R.showAsSheet(new md(), obj);
                    return;
                }
                return;
            default:
                ((zh.n) this.f12030b).f52053c.f52084b.f52013a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
        }
    }
}
