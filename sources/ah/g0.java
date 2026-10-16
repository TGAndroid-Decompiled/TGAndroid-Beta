package ah;

import android.util.LongSparseArray;
import android.view.View;
import bi.bb;
import bi.h3;
import bi.j7;
import bi.la;
import bi.lb;
import bi.sb;
import bi.wa;
import di.ac;
import di.i9;
import di.l9;
import di.r6;
import di.s6;
import hg.e2;
import ji.e3;
import ji.h2;
import ji.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gj0;
import org.telegram.ui.wf;
public final class g0 implements View.OnClickListener {
    public final int f738a;
    public final Object f739b;

    public g0(Object obj, int i10) {
        this.f738a = i10;
        this.f739b = obj;
    }

    @Override
    public final void onClick(View view) {
        h3 h3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ji.a aVar;
        switch (this.f738a) {
            case 0:
                t0 t0Var = (t0) this.f739b;
                if (t0Var.f875k) {
                    t0Var.d();
                    return;
                }
                return;
            case 1:
                ((androidx.mediarouter.app.g) this.f739b).dismiss();
                return;
            case 2:
                ((h3) this.f739b).q(!h3Var.f3063f0, true);
                return;
            case 3:
                ((sb) this.f739b).N();
                return;
            case 4:
                ((j7) this.f739b).dismiss();
                m2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new sg.y0(R, 14, false));
                    return;
                }
                return;
            case 5:
                wa waVar = (wa) this.f739b;
                waVar.onClick(waVar.f3931b);
                return;
            case 6:
                bb bbVar = (bb) this.f739b;
                bbVar.f2884b.f3710u1.animate().alpha(0.0f).setDuration(150L).setListener(new lb(bbVar, 0)).start();
                return;
            case 7:
                ((la) this.f739b).run();
                return;
            case 8:
                di.m mVar = (di.m) this.f739b;
                di.g gVar = mVar.f7385f;
                gVar.d();
                gVar.k(true);
                di.e eVar = mVar.f7382c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 9:
                ((ac) this.f739b).B();
                return;
            case 10:
                di.t0.a((di.t0) this.f739b);
                return;
            case 11:
                ((o) this.f739b).run();
                return;
            case 12:
                s6 s6Var = ((r6) this.f739b).f7721x;
                if (s6Var.f7773r && (callback = s6Var.f7771f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 13:
                l9 l9Var = (l9) ((i9) this.f739b).h;
                if (l9Var != null) {
                    l9Var.run();
                    return;
                }
                return;
            case 14:
                ((wf) this.f739b).run();
                return;
            case 15:
                ((wf) this.f739b).run();
                return;
            case 16:
                ChatActivityEnterView.g(((be) ((fi.o0) this.f739b).d).f23441a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 17:
                ((androidx.car.app.utils.b) this.f739b).run();
                return;
            case 18:
                gi.p pVar = (gi.p) this.f739b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((gi.o) pVar.f10235n.f899b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f18916id, ((gi.o) pVar.f10235n.f899b).getText().toString(), new gi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f10234f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f10232b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 19:
                ((gi.e0) this.f739b).h.d.D(0);
                return;
            case 20:
                gi.k0.z(((gi.f0) this.f739b).f10183r);
                return;
            case 21:
                hg.m mVar2 = (hg.m) this.f739b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 22:
                ((hg.v) this.f739b).run();
                return;
            case 23:
                ((hg.s0) this.f739b).K();
                return;
            case 24:
                e2 e2Var = (e2) this.f739b;
                LongSparseArray longSparseArray = e2Var.f10547n;
                s3 s3Var = (s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.f18943id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f18943id) < 0) {
                    if (s3Var.f21637r) {
                        longSparseArray.put(stickerSet.set.f18943id, stickerSet);
                        e2Var.e.f30480a.h(s3Var.getStickerSet());
                        return;
                    }
                    e2Var.F(stickerSet, s3Var);
                    return;
                }
                return;
            case 25:
                ig.e eVar2 = (ig.e) this.f739b;
                org.telegram.ui.Components.s6 s6Var2 = eVar2.f11476f;
                int i12 = eVar2.f11473a;
                boolean z10 = eVar2.f11478r;
                eVar2.f11478r = !z10;
                qq qqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                qqVar.c(LocaleController.getString(i10), true, true);
                s6Var2.a();
                if (eVar2.f11478r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                s6Var2.c(LocaleController.getString(i11), true, true);
                if (eVar2.f11478r) {
                    eVar2.f11480w |= 1;
                } else {
                    eVar2.f11480w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f11479s, eVar2.f11480w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f11479s);
                toggleconnectedbotpaused.paused = eVar2.f11478r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 26:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.f739b).f11631f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    zc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 27:
                ((ii.c) this.f739b).dismiss();
                return;
            case 28:
                ji.r rVar = (ji.r) this.f739b;
                rVar.K(0, true, 0, false, 0L);
                gj0 gj0Var = rVar.O;
                if (gj0Var != null) {
                    gj0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            default:
                ji.t0 t0Var2 = (ji.t0) this.f739b;
                e3 e3Var = t0Var2.h;
                if (e3Var != null && (aVar = t0Var2.f13524f) != null) {
                    x3 x3Var = e3Var.f13244a;
                    x3Var.getClass();
                    if (x3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13107b;
                        h2 h2Var = x3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        x3Var.W2.N(true);
                        h2 h2Var2 = x3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
