package oh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import kh.a2;
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
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.voip.u0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lf;
import org.telegram.ui.si0;
import org.telegram.ui.th1;
import org.telegram.ui.wx0;
import org.telegram.ui.zt0;
import ph.e5;
import ph.f5;
import ph.n0;
import ph.r7;
import ph.t9;
import rh.m0;
import sh.c0;
import sh.d0;
import sh.i0;
import tf.h0;
import tf.m1;
import vh.c2;
import vh.g4;
import vh.i4;
import vh.n3;
import vh.q0;
import vh.z2;
public final class n implements View.OnClickListener {
    public final int f16591a;
    public final Object f16592b;

    public n(Object obj, int i10) {
        this.f16591a = i10;
        this.f16592b = obj;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11;
        vh.a aVar;
        g4 g4Var;
        switch (this.f16591a) {
            case 0:
                ((n5) this.f16592b).run();
                return;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f16592b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.K.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 2:
                u0 u0Var = (u0) this.f16592b;
                if (!u0Var.f29965a) {
                    if (u0Var.f29973x == 0 && u0Var.f29974y) {
                        ((Activity) u0Var.getContext()).startActivityForResult(((MediaProjectionManager) u0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        u0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 3:
                th1 th1Var = (th1) this.f16592b;
                if (!th1Var.f29553a) {
                    if (th1Var.f29560w == 0) {
                        ((Activity) th1Var.getContext()).startActivityForResult(((MediaProjectionManager) th1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        th1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 4:
                Context context = (Context) this.f16592b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f16592b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                a2.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 6:
                ph.k kVar2 = (ph.k) this.f16592b;
                ph.f fVar = kVar2.f41809f;
                fVar.d();
                fVar.k(true);
                ph.e eVar = kVar2.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 7:
                ((t9) this.f16592b).B();
                return;
            case 8:
                n0.a((n0) this.f16592b);
                return;
            case 9:
                ((zt0) this.f16592b).run();
                return;
            case 10:
                f5 f5Var = ((e5) this.f16592b).f41575x;
                if (f5Var.f41648r && (callback = f5Var.f41646f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 11:
                r7 r7Var = (r7) ((rd0) this.f16592b).h;
                if (r7Var != null) {
                    r7Var.run();
                    return;
                }
                return;
            case 12:
                ((lf) this.f16592b).run();
                return;
            case 13:
                ((lf) this.f16592b).run();
                return;
            case 14:
                ChatActivityEnterView.h(((qd) ((m0) this.f16592b).d).f28115a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 15:
                ((wx0) this.f16592b).run();
                return;
            case 16:
                sh.n nVar = (sh.n) this.f16592b;
                TLRPC.Chat chat = nVar.E;
                if (chat != null && !chat.title.equals(((lh.n) nVar.f44377n.f42223b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.E.f19184id, ((lh.n) nVar.f44377n.f42223b).getText().toString(), new sh.i(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.E;
                if (chat2 != null && nVar.h != nVar.f44376f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.E.default_banned_rights.manage_linked_peers = !nVar.h;
                    nVar.getMessagesController().setDefaultBannedRole(nVar.f44374b, nVar.E.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                return;
            case 17:
                ((c0) this.f16592b).h.d.D(0);
                return;
            case 18:
                i0.x(((d0) this.f16592b).f44329r);
                return;
            case 19:
                tf.k kVar3 = (tf.k) this.f16592b;
                MessagesController.getInstance(kVar3.C).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar3.l();
                return;
            case 20:
                ((tf.p) this.f16592b).run();
                return;
            case 21:
                ((h0) this.f16592b).K();
                return;
            case 22:
                m1 m1Var = (m1) this.f16592b;
                LongSparseArray longSparseArray = m1Var.f44797n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.f19211id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19211id) < 0) {
                    if (r3Var.f21757r) {
                        longSparseArray.put(stickerSet.set.f19211id, stickerSet);
                        m1Var.e.f28627a.h(r3Var.getStickerSet());
                        return;
                    }
                    m1Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 23:
                uf.e eVar2 = (uf.e) this.f16592b;
                k6 k6Var = eVar2.f45284f;
                int i12 = eVar2.f45281a;
                boolean z4 = eVar2.f45286r;
                eVar2.f45286r = !z4;
                bq bqVar = eVar2.h;
                if (!z4) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                bqVar.c(LocaleController.getString(i10), true, true);
                k6Var.a();
                if (eVar2.f45286r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                k6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f45286r) {
                    eVar2.f45288w |= 1;
                } else {
                    eVar2.f45288w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f45287s, eVar2.f45288w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f45287s);
                toggleconnectedbotpaused.paused = eVar2.f45286r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((uf.o) this.f16592b).f45403f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    qc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 25:
                ((uh.b) this.f16592b).dismiss();
                return;
            case 26:
                vh.p pVar = (vh.p) this.f16592b;
                pVar.H(0, true, 0, false, 0L);
                si0 si0Var = pVar.L;
                if (si0Var != null) {
                    si0Var.h(true);
                    pVar.L = null;
                    return;
                }
                return;
            case 27:
                q0 q0Var = (q0) this.f16592b;
                z2 z2Var = q0Var.h;
                if (z2Var != null && (aVar = q0Var.f46081f) != null) {
                    vh.r3 r3Var2 = z2Var.f46334a;
                    r3Var2.getClass();
                    if (vh.r3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f45775b;
                        c2 c2Var = r3Var2.G3;
                        if (c2Var != null) {
                            c2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        r3Var2.V2.N(true);
                        c2 c2Var2 = r3Var2.G3;
                        if (c2Var2 != null) {
                            c2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                i4 i4Var = (i4) this.f16592b;
                vh.a aVar2 = i4Var.f46283a;
                if (aVar2 != null && (g4Var = i4Var.D) != null) {
                    ((n3) g4Var).f46026a.f46112e3.A(aVar2);
                    return;
                }
                return;
        }
    }
}
