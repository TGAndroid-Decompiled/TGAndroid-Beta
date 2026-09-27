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
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rf;
import org.telegram.ui.yi0;
public final class v0 implements View.OnClickListener {
    public final int f1594a;
    public final Object f1595b;

    public v0(Object obj, int i10) {
        this.f1594a = i10;
        this.f1595b = obj;
    }

    @Override
    public final void onClick(View view) {
        r3 r3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ii.a aVar;
        ii.n4 n4Var;
        switch (this.f1594a) {
            case 0:
                ((r3) this.f1595b).q(!r3Var.f1338f0, true);
                return;
            case 1:
                ((jc) this.f1595b).N();
                return;
            case 2:
                ((x7) this.f1595b).dismiss();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.x0(R, 14, false));
                    return;
                }
                return;
            case 3:
                mb mbVar = (mb) this.f1595b;
                mbVar.onClick(mbVar.f1274b);
                return;
            case 4:
                sb sbVar = (sb) this.f1595b;
                sbVar.f1535b.f1106u1.animate().alpha(0.0f).setDuration(150L).setListener(new cc(sbVar, 0)).start();
                return;
            case 5:
                ((androidx.mediarouter.app.h) this.f1595b).dismiss();
                return;
            case 6:
                ((androidx.fragment.app.a0) this.f1595b).run();
                return;
            case 7:
                ci.m mVar = (ci.m) this.f1595b;
                ci.g gVar = mVar.f5122f;
                gVar.d();
                gVar.k(true);
                ci.e eVar = mVar.f5119c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 8:
                ((ci.ac) this.f1595b).B();
                return;
            case 9:
                ci.u0.a((ci.u0) this.f1595b);
                return;
            case 10:
                ((s1) this.f1595b).run();
                return;
            case 11:
                ci.u6 u6Var = ((ci.t6) this.f1595b).f5562x;
                if (u6Var.f5639r && (callback = u6Var.f5637f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 12:
                ci.l9 l9Var = (ci.l9) ((ci.i9) this.f1595b).h;
                if (l9Var != null) {
                    l9Var.run();
                    return;
                }
                return;
            case 13:
                ((rf) this.f1595b).run();
                return;
            case 14:
                ((rf) this.f1595b).run();
                return;
            case 15:
                ChatActivityEnterView.h(((ae) ((ei.p0) this.f1595b).d).f22662a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 16:
                ((h5) this.f1595b).run();
                return;
            case 17:
                fi.p pVar = (fi.p) this.f1595b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((fi.o) pVar.f9143n.f869b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f18329id, ((fi.o) pVar.f9143n.f869b).getText().toString(), new fi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f9142f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f9140b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 18:
                ((fi.e0) this.f1595b).h.d.E(0);
                return;
            case 19:
                fi.k0.x(((fi.f0) this.f1595b).f9091r);
                return;
            case 20:
                gg.m mVar2 = (gg.m) this.f1595b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 21:
                ((gg.w) this.f1595b).run();
                return;
            case 22:
                ((gg.t0) this.f1595b).K();
                return;
            case 23:
                gg.g2 g2Var = (gg.g2) this.f1595b;
                LongSparseArray longSparseArray = g2Var.f9734n;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && g2Var.h.indexOfKey(stickerSet.set.f18356id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f18356id) < 0) {
                    if (s3Var.f21059r) {
                        longSparseArray.put(stickerSet.set.f18356id, stickerSet);
                        g2Var.e.f24732a.h(s3Var.getStickerSet());
                        return;
                    }
                    g2Var.F(stickerSet, s3Var);
                    return;
                }
                return;
            case 24:
                hg.e eVar2 = (hg.e) this.f1595b;
                org.telegram.ui.Components.p6 p6Var = eVar2.f10247f;
                int i12 = eVar2.f10244a;
                boolean z10 = eVar2.f10249r;
                eVar2.f10249r = !z10;
                fq fqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                fqVar.c(LocaleController.getString(i10), true, true);
                p6Var.a();
                if (eVar2.f10249r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                p6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f10249r) {
                    eVar2.f10251w |= 1;
                } else {
                    eVar2.f10251w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f10250s, eVar2.f10251w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f10250s);
                toggleconnectedbotpaused.paused = eVar2.f10249r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 25:
                TL_account.TL_businessChatLink tL_businessChatLink = ((hg.t) this.f1595b).f10400f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    xc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 26:
                ((hi.c) this.f1595b).dismiss();
                return;
            case 27:
                ii.r rVar = (ii.r) this.f1595b;
                rVar.I(0, true, 0, false, 0L);
                yi0 yi0Var = rVar.O;
                if (yi0Var != null) {
                    yi0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            case 28:
                ii.u0 u0Var = (ii.u0) this.f1595b;
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && (aVar = u0Var.f11650f) != null) {
                    ii.x3 x3Var = e3Var.f11345a;
                    x3Var.getClass();
                    if (ii.x3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f11194b;
                        ii.i2 i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        x3Var.Y2.N(true);
                        ii.i2 i2Var2 = x3Var.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ii.p4 p4Var = (ii.p4) this.f1595b;
                ii.a aVar2 = p4Var.f11210a;
                if (aVar2 != null && (n4Var = p4Var.G) != null) {
                    ((ii.t3) n4Var).f11629a.f11731h3.p(aVar2);
                    return;
                }
                return;
        }
    }
}
