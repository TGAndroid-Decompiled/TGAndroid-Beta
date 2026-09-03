package oh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import kf.k0;
import nh.n5;
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
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.voip.u0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.dy0;
import org.telegram.ui.gu0;
import org.telegram.ui.nf;
import org.telegram.ui.ui0;
import ph.e5;
import ph.f5;
import ph.n0;
import ph.q7;
import ph.t9;
import rh.l0;
import sh.c0;
import sh.d0;
import sh.i0;
import tf.h0;
import tf.m1;
import vh.a3;
import vh.d2;
import vh.h4;
import vh.j4;
import vh.o3;
import vh.r0;
import vh.s3;
public final class n implements View.OnClickListener {
    public final int f16571a;
    public final Object f16572b;

    public n(Object obj, int i10) {
        this.f16571a = i10;
        this.f16572b = obj;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11;
        vh.a aVar;
        h4 h4Var;
        switch (this.f16571a) {
            case 0:
                ((n5) this.f16572b).run();
                return;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f16572b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.K.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 2:
                u0 u0Var = (u0) this.f16572b;
                if (!u0Var.f29937a) {
                    if (u0Var.f29945x == 0 && u0Var.f29946y) {
                        ((Activity) u0Var.getContext()).startActivityForResult(((MediaProjectionManager) u0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        u0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 3:
                bi1 bi1Var = (bi1) this.f16572b;
                if (!bi1Var.f29525a) {
                    if (bi1Var.f29532w == 0) {
                        ((Activity) bi1Var.getContext()).startActivityForResult(((MediaProjectionManager) bi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        bi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 4:
                Context context = (Context) this.f16572b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    g1.j();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f16572b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                k0.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 6:
                ph.k kVar2 = (ph.k) this.f16572b;
                ph.f fVar = kVar2.f41842f;
                fVar.d();
                fVar.k(true);
                ph.e eVar = kVar2.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 7:
                ((t9) this.f16572b).B();
                return;
            case 8:
                n0.a((n0) this.f16572b);
                return;
            case 9:
                ((gu0) this.f16572b).run();
                return;
            case 10:
                f5 f5Var = ((e5) this.f16572b).f41613x;
                if (f5Var.f41693r && (callback = f5Var.f41691f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 11:
                q7 q7Var = (q7) ((sd0) this.f16572b).h;
                if (q7Var != null) {
                    q7Var.run();
                    return;
                }
                return;
            case 12:
                ((nf) this.f16572b).run();
                return;
            case 13:
                ((nf) this.f16572b).run();
                return;
            case 14:
                ChatActivityEnterView.h(((qd) ((l0) this.f16572b).d).f28144a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 15:
                ((dy0) this.f16572b).run();
                return;
            case 16:
                sh.n nVar = (sh.n) this.f16572b;
                TLRPC.Chat chat = nVar.E;
                if (chat != null && !chat.title.equals(((lh.n) nVar.f44439n.f42254b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.E.f19159id, ((lh.n) nVar.f44439n.f42254b).getText().toString(), new sh.i(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.E;
                if (chat2 != null && nVar.h != nVar.f44438f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.E.default_banned_rights.manage_linked_peers = !nVar.h;
                    nVar.getMessagesController().setDefaultBannedRole(nVar.f44436b, nVar.E.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                return;
            case 17:
                ((c0) this.f16572b).h.d.D(0);
                return;
            case 18:
                i0.x(((d0) this.f16572b).f44394r);
                return;
            case 19:
                tf.k kVar3 = (tf.k) this.f16572b;
                MessagesController.getInstance(kVar3.C).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar3.l();
                return;
            case 20:
                ((tf.p) this.f16572b).run();
                return;
            case 21:
                ((h0) this.f16572b).K();
                return;
            case 22:
                m1 m1Var = (m1) this.f16572b;
                LongSparseArray longSparseArray = m1Var.f44859n;
                q3 q3Var = (q3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.f19186id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19186id) < 0) {
                    if (q3Var.f21690r) {
                        longSparseArray.put(stickerSet.set.f19186id, stickerSet);
                        m1Var.e.f28663a.h(q3Var.getStickerSet());
                        return;
                    }
                    m1Var.F(stickerSet, q3Var);
                    return;
                }
                return;
            case 23:
                uf.e eVar2 = (uf.e) this.f16572b;
                k6 k6Var = eVar2.f45348f;
                int i12 = eVar2.f45345a;
                boolean z4 = eVar2.f45350r;
                eVar2.f45350r = !z4;
                aq aqVar = eVar2.h;
                if (!z4) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                aqVar.c(LocaleController.getString(i10), true, true);
                k6Var.a();
                if (eVar2.f45350r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                k6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f45350r) {
                    eVar2.f45352w |= 1;
                } else {
                    eVar2.f45352w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f45351s, eVar2.f45352w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f45351s);
                toggleconnectedbotpaused.paused = eVar2.f45350r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((uf.o) this.f16572b).f45467f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    qc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 25:
                ((uh.b) this.f16572b).dismiss();
                return;
            case 26:
                vh.q qVar = (vh.q) this.f16572b;
                qVar.H(0, true, 0, false, 0L);
                ui0 ui0Var = qVar.L;
                if (ui0Var != null) {
                    ui0Var.h(true);
                    qVar.L = null;
                    return;
                }
                return;
            case 27:
                r0 r0Var = (r0) this.f16572b;
                a3 a3Var = r0Var.h;
                if (a3Var != null && (aVar = r0Var.f46178f) != null) {
                    s3 s3Var = a3Var.f45875a;
                    s3Var.getClass();
                    if (s3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f45853b;
                        d2 d2Var = s3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        s3Var.V2.N(true);
                        d2 d2Var2 = s3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                j4 j4Var = (j4) this.f16572b;
                vh.a aVar2 = j4Var.f46414a;
                if (aVar2 != null && (h4Var = j4Var.D) != null) {
                    ((o3) h4Var).f46123a.f46209e3.z(aVar2);
                    return;
                }
                return;
        }
    }
}
