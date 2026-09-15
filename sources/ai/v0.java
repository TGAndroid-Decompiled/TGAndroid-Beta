package ai;

import android.util.LongSparseArray;
import android.view.View;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj0;
import org.telegram.ui.qf;
public final class v0 implements View.OnClickListener {
    public final int f1592a;
    public final Object f1593b;

    public v0(Object obj, int i10) {
        this.f1592a = i10;
        this.f1593b = obj;
    }

    @Override
    public final void onClick(View view) {
        r3 r3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ii.a aVar;
        ii.m4 m4Var;
        switch (this.f1592a) {
            case 0:
                ((r3) this.f1593b).q(!r3Var.f1330f0, true);
                return;
            case 1:
                ((jc) this.f1593b).N();
                return;
            case 2:
                ((w7) this.f1593b).dismiss();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.x0(R, 14, false));
                    return;
                }
                return;
            case 3:
                mb mbVar = (mb) this.f1593b;
                mbVar.onClick(mbVar.f1260b);
                return;
            case 4:
                sb sbVar = (sb) this.f1593b;
                sbVar.f1529b.f1108u1.animate().alpha(0.0f).setDuration(150L).setListener(new cc(sbVar, 0)).start();
                return;
            case 5:
                ((androidx.mediarouter.app.h) this.f1593b).dismiss();
                return;
            case 6:
                ((androidx.fragment.app.a0) this.f1593b).run();
                return;
            case 7:
                ci.m mVar = (ci.m) this.f1593b;
                ci.g gVar = mVar.f4990f;
                gVar.d();
                gVar.k(true);
                ci.e eVar = mVar.f4987c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 8:
                ((ci.ec) this.f1593b).B();
                return;
            case 9:
                ci.u0.a((ci.u0) this.f1593b);
                return;
            case 10:
                ((s1) this.f1593b).run();
                return;
            case 11:
                ci.v6 v6Var = ((ci.u6) this.f1593b).f5626x;
                if (v6Var.f5656r && (callback = v6Var.f5654f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 12:
                ci.p9 p9Var = (ci.p9) ((ci.m9) this.f1593b).h;
                if (p9Var != null) {
                    p9Var.run();
                    return;
                }
                return;
            case 13:
                ((qf) this.f1593b).run();
                return;
            case 14:
                ((qf) this.f1593b).run();
                return;
            case 15:
                ChatActivityEnterView.h(((yd) ((ei.p0) this.f1593b).d).f30220a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 16:
                ((i5) this.f1593b).run();
                return;
            case 17:
                fi.p pVar = (fi.p) this.f1593b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((fi.o) pVar.f9151n.f780b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f18112id, ((fi.o) pVar.f9151n.f780b).getText().toString(), new fi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f9150f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f9148b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 18:
                ((fi.e0) this.f1593b).h.d.D(0);
                return;
            case 19:
                fi.k0.x(((fi.f0) this.f1593b).f9099r);
                return;
            case 20:
                gg.m mVar2 = (gg.m) this.f1593b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 21:
                ((gg.w) this.f1593b).run();
                return;
            case 22:
                ((gg.t0) this.f1593b).K();
                return;
            case 23:
                gg.g2 g2Var = (gg.g2) this.f1593b;
                LongSparseArray longSparseArray = g2Var.f9742n;
                org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                if (stickerSet != null && g2Var.h.indexOfKey(stickerSet.set.f18139id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f18139id) < 0) {
                    if (r3Var2.f20795r) {
                        longSparseArray.put(stickerSet.set.f18139id, stickerSet);
                        g2Var.e.f27769a.h(r3Var2.getStickerSet());
                        return;
                    }
                    g2Var.F(stickerSet, r3Var2);
                    return;
                }
                return;
            case 24:
                hg.e eVar2 = (hg.e) this.f1593b;
                org.telegram.ui.Components.n6 n6Var = eVar2.f10254f;
                int i12 = eVar2.f10251a;
                boolean z10 = eVar2.f10256r;
                eVar2.f10256r = !z10;
                dq dqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                dqVar.c(LocaleController.getString(i10), true, true);
                n6Var.a();
                if (eVar2.f10256r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                n6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f10256r) {
                    eVar2.f10258w |= 1;
                } else {
                    eVar2.f10258w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f10257s, eVar2.f10258w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f10257s);
                toggleconnectedbotpaused.paused = eVar2.f10256r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 25:
                TL_account.TL_businessChatLink tL_businessChatLink = ((hg.t) this.f1593b).f10407f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    vc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 26:
                ((hi.c) this.f1593b).dismiss();
                return;
            case 27:
                ii.r rVar = (ii.r) this.f1593b;
                rVar.I(0, true, 0, false, 0L);
                bj0 bj0Var = rVar.O;
                if (bj0Var != null) {
                    bj0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            case 28:
                ii.u0 u0Var = (ii.u0) this.f1593b;
                ii.d3 d3Var = u0Var.h;
                if (d3Var != null && (aVar = u0Var.f11649f) != null) {
                    ii.w3 w3Var = d3Var.f11330a;
                    w3Var.getClass();
                    if (ii.w3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f11201b;
                        ii.h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        w3Var.Y2.N(true);
                        ii.h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ii.o4 o4Var = (ii.o4) this.f1593b;
                ii.a aVar2 = o4Var.f11217a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((ii.s3) m4Var).f11614a.f11711h3.q(aVar2);
                    return;
                }
                return;
        }
    }
}
