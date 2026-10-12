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
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej0;
import org.telegram.ui.vf;
public final class v0 implements View.OnClickListener {
    public final int f1812a;
    public final Object f1813b;

    public v0(Object obj, int i10) {
        this.f1812a = i10;
        this.f1813b = obj;
    }

    @Override
    public final void onClick(View view) {
        s3 s3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ii.a aVar;
        ii.n4 n4Var;
        switch (this.f1812a) {
            case 0:
                ((s3) this.f1813b).q(!s3Var.f1513f0, true);
                return;
            case 1:
                ((kc) this.f1813b).N();
                return;
            case 2:
                ((y7) this.f1813b).dismiss();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.y0(R, 14, false));
                    return;
                }
                return;
            case 3:
                nb nbVar = (nb) this.f1813b;
                nbVar.onClick(nbVar.f1490b);
                return;
            case 4:
                tb tbVar = (tb) this.f1813b;
                tbVar.f1773b.f1298u1.animate().alpha(0.0f).setDuration(150L).setListener(new dc(tbVar, 0)).start();
                return;
            case 5:
                ((androidx.mediarouter.app.h) this.f1813b).dismiss();
                return;
            case 6:
                ((androidx.fragment.app.a0) this.f1813b).run();
                return;
            case 7:
                ci.m mVar = (ci.m) this.f1813b;
                ci.g gVar = mVar.f5553f;
                gVar.d();
                gVar.k(true);
                ci.e eVar = mVar.f5549c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 8:
                ((ci.bc) this.f1813b).B();
                return;
            case 9:
                ci.t0.a((ci.t0) this.f1813b);
                return;
            case 10:
                ((s1) this.f1813b).run();
                return;
            case 11:
                ci.u6 u6Var = ((ci.t6) this.f1813b).f6007x;
                if (u6Var.f6073r && (callback = u6Var.f6071f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 12:
                ci.m9 m9Var = (ci.m9) ((ci.j9) this.f1813b).h;
                if (m9Var != null) {
                    m9Var.run();
                    return;
                }
                return;
            case 13:
                ((vf) this.f1813b).run();
                return;
            case 14:
                ((vf) this.f1813b).run();
                return;
            case 15:
                ChatActivityEnterView.f(((vd) ((ei.p0) this.f1813b).d).f31492a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 16:
                ((i5) this.f1813b).run();
                return;
            case 17:
                fi.p pVar = (fi.p) this.f1813b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((fi.o) pVar.f10024n.f931b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f19802id, ((fi.o) pVar.f10024n.f931b).getText().toString(), new fi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f10023f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f10020b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 18:
                ((fi.e0) this.f1813b).h.d.D(0);
                return;
            case 19:
                fi.k0.z(((fi.f0) this.f1813b).f9965r);
                return;
            case 20:
                gg.m mVar2 = (gg.m) this.f1813b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 21:
                ((gg.v) this.f1813b).run();
                return;
            case 22:
                ((gg.s0) this.f1813b).K();
                return;
            case 23:
                gg.f2 f2Var = (gg.f2) this.f1813b;
                LongSparseArray longSparseArray = f2Var.f10599n;
                org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                if (stickerSet != null && f2Var.h.indexOfKey(stickerSet.set.f19829id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19829id) < 0) {
                    if (s3Var2.f22666r) {
                        longSparseArray.put(stickerSet.set.f19829id, stickerSet);
                        f2Var.f10597e.f25609a.h(s3Var2.getStickerSet());
                        return;
                    }
                    f2Var.F(stickerSet, s3Var2);
                    return;
                }
                return;
            case 24:
                hg.f fVar = (hg.f) this.f1813b;
                org.telegram.ui.Components.r6 r6Var = fVar.f11219f;
                int i12 = fVar.f11215a;
                boolean z10 = fVar.f11221r;
                fVar.f11221r = !z10;
                vq vqVar = fVar.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                vqVar.c(LocaleController.getString(i10), true, true);
                r6Var.a();
                if (fVar.f11221r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                r6Var.c(LocaleController.getString(i11), true, true);
                if (fVar.f11221r) {
                    fVar.f11223w |= 1;
                } else {
                    fVar.f11223w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + fVar.f11222s, fVar.f11223w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(fVar.f11222s);
                toggleconnectedbotpaused.paused = fVar.f11221r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 25:
                TL_account.TL_businessChatLink tL_businessChatLink = ((hg.u) this.f1813b).f11382f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    zc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 26:
                ((hi.c) this.f1813b).dismiss();
                return;
            case 27:
                ii.r rVar = (ii.r) this.f1813b;
                rVar.K(0, true, 0, false, 0L);
                ej0 ej0Var = rVar.O;
                if (ej0Var != null) {
                    ej0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            case 28:
                ii.u0 u0Var = (ii.u0) this.f1813b;
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && (aVar = u0Var.f12726f) != null) {
                    ii.x3 x3Var = e3Var.f12396a;
                    x3Var.getClass();
                    if (ii.x3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f12232b;
                        ii.i2 i2Var = x3Var.H3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        x3Var.W2.N(true);
                        ii.i2 i2Var2 = x3Var.H3;
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
                ii.p4 p4Var = (ii.p4) this.f1813b;
                ii.a aVar2 = p4Var.f12249a;
                if (aVar2 != null && (n4Var = p4Var.G) != null) {
                    ((ii.t3) n4Var).f12703a.f12807f3.q(aVar2);
                    return;
                }
                return;
        }
    }
}
