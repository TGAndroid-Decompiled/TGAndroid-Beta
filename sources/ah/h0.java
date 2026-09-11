package ah;

import android.util.LongSparseArray;
import android.view.View;
import bi.e3;
import bi.f7;
import bi.ib;
import bi.oa;
import bi.pb;
import bi.ta;
import bi.ya;
import di.fc;
import di.l9;
import di.o9;
import di.t6;
import di.u6;
import hg.f2;
import ji.c3;
import ji.g2;
import ji.v3;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.qf;
public final class h0 implements View.OnClickListener {
    public final int f550a;
    public final Object f551b;

    public h0(Object obj, int i10) {
        this.f550a = i10;
        this.f551b = obj;
    }

    @Override
    public final void onClick(View view) {
        e3 e3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ji.a aVar;
        switch (this.f550a) {
            case 0:
                u0 u0Var = (u0) this.f551b;
                if (u0Var.f693k) {
                    u0Var.d();
                    return;
                }
                return;
            case 1:
                ((androidx.mediarouter.app.h) this.f551b).dismiss();
                return;
            case 2:
                ((e3) this.f551b).q(!e3Var.f3010f0, true);
                return;
            case 3:
                ((pb) this.f551b).N();
                return;
            case 4:
                ((f7) this.f551b).dismiss();
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new sg.a1(R, 14, false));
                    return;
                }
                return;
            case 5:
                ta taVar = (ta) this.f551b;
                taVar.onClick(taVar.f3754b);
                return;
            case 6:
                ya yaVar = (ya) this.f551b;
                yaVar.f4025b.f3578u1.animate().alpha(0.0f).setDuration(150L).setListener(new ib(yaVar, 0)).start();
                return;
            case 7:
                ((oa) this.f551b).run();
                return;
            case 8:
                di.m mVar = (di.m) this.f551b;
                di.g gVar = mVar.f7593f;
                gVar.d();
                gVar.k(true);
                di.e eVar = mVar.f7589c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 9:
                ((fc) this.f551b).B();
                return;
            case 10:
                di.u0.a((di.u0) this.f551b);
                return;
            case 11:
                ((p) this.f551b).run();
                return;
            case 12:
                u6 u6Var = ((t6) this.f551b).f8200x;
                if (u6Var.f8253r && (callback = u6Var.f8251f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 13:
                o9 o9Var = (o9) ((l9) this.f551b).h;
                if (o9Var != null) {
                    o9Var.run();
                    return;
                }
                return;
            case 14:
                ((qf) this.f551b).run();
                return;
            case 15:
                ((qf) this.f551b).run();
                return;
            case 16:
                ChatActivityEnterView.h(((ae) ((fi.p0) this.f551b).d).f24343a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 17:
                ((androidx.car.app.utils.b) this.f551b).run();
                return;
            case 18:
                gi.p pVar = (gi.p) this.f551b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((gi.o) pVar.f10745n.f718b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f19869id, ((gi.o) pVar.f10745n.f718b).getText().toString(), new gi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f10744f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f10741b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 19:
                ((gi.e0) this.f551b).h.d.D(0);
                return;
            case 20:
                gi.k0.x(((gi.f0) this.f551b).f10686r);
                return;
            case 21:
                hg.m mVar2 = (hg.m) this.f551b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 22:
                ((hg.w) this.f551b).run();
                return;
            case 23:
                ((hg.t0) this.f551b).K();
                return;
            case 24:
                f2 f2Var = (f2) this.f551b;
                LongSparseArray longSparseArray = f2Var.f11047n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && f2Var.h.indexOfKey(stickerSet.set.f19896id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19896id) < 0) {
                    if (r3Var.f22671r) {
                        longSparseArray.put(stickerSet.set.f19896id, stickerSet);
                        f2Var.f11045e.f29930a.h(r3Var.getStickerSet());
                        return;
                    }
                    f2Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 25:
                ig.e eVar2 = (ig.e) this.f551b;
                q6 q6Var = eVar2.f12034f;
                int i12 = eVar2.f12030a;
                boolean z10 = eVar2.f12036r;
                eVar2.f12036r = !z10;
                cq cqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                cqVar.c(LocaleController.getString(i10), true, true);
                q6Var.a();
                if (eVar2.f12036r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                q6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f12036r) {
                    eVar2.f12038w |= 1;
                } else {
                    eVar2.f12038w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f12037s, eVar2.f12038w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f12037s);
                toggleconnectedbotpaused.paused = eVar2.f12036r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 26:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.f551b).f12207f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    yc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 27:
                ((ii.c) this.f551b).dismiss();
                return;
            case 28:
                ji.r rVar = (ji.r) this.f551b;
                rVar.I(0, true, 0, false, 0L);
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            default:
                ji.t0 t0Var = (ji.t0) this.f551b;
                c3 c3Var = t0Var.h;
                if (c3Var != null && (aVar = t0Var.f14181f) != null) {
                    v3 v3Var = c3Var.f13842a;
                    v3Var.getClass();
                    if (v3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13732b;
                        g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        v3Var.Y2.N(true);
                        g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
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
