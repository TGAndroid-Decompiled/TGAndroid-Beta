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
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yf;
import org.telegram.ui.zi0;
public final class v0 implements View.OnClickListener {
    public final int f1734a;
    public final Object f1735b;

    public v0(Object obj, int i10) {
        this.f1734a = i10;
        this.f1735b = obj;
    }

    @Override
    public final void onClick(View view) {
        r3 r3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ii.a aVar;
        ii.o4 o4Var;
        switch (this.f1734a) {
            case 0:
                ((r3) this.f1735b).q(!r3Var.f1445f0, true);
                return;
            case 1:
                ((jc) this.f1735b).N();
                return;
            case 2:
                ((x7) this.f1735b).dismiss();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.y0(R, 14, false));
                    return;
                }
                return;
            case 3:
                mb mbVar = (mb) this.f1735b;
                mbVar.onClick(mbVar.f1377b);
                return;
            case 4:
                sb sbVar = (sb) this.f1735b;
                sbVar.f1668b.f1191u1.animate().alpha(0.0f).setDuration(150L).setListener(new cc(sbVar, 0)).start();
                return;
            case 5:
                ((androidx.mediarouter.app.h) this.f1735b).dismiss();
                return;
            case 6:
                ((androidx.fragment.app.a0) this.f1735b).run();
                return;
            case 7:
                ci.m mVar = (ci.m) this.f1735b;
                ci.g gVar = mVar.f5517f;
                gVar.d();
                gVar.k(true);
                ci.e eVar = mVar.f5513c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 8:
                ((ci.ac) this.f1735b).B();
                return;
            case 9:
                ci.u0.a((ci.u0) this.f1735b);
                return;
            case 10:
                ((s1) this.f1735b).run();
                return;
            case 11:
                ci.u6 u6Var = ((ci.t6) this.f1735b).f5985x;
                if (u6Var.f6070r && (callback = u6Var.f6068f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 12:
                ci.l9 l9Var = (ci.l9) ((ci.i9) this.f1735b).h;
                if (l9Var != null) {
                    l9Var.run();
                    return;
                }
                return;
            case 13:
                ((yf) this.f1735b).run();
                return;
            case 14:
                ((yf) this.f1735b).run();
                return;
            case 15:
                ChatActivityEnterView.h(((ce) ((ei.q0) this.f1735b).d).f25352a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 16:
                ((h5) this.f1735b).run();
                return;
            case 17:
                fi.p pVar = (fi.p) this.f1735b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((fi.o) pVar.f9950n.f935b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f20037id, ((fi.o) pVar.f9950n.f935b).getText().toString(), new fi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f9949f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f9946b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 18:
                ((fi.e0) this.f1735b).h.d.E(0);
                return;
            case 19:
                fi.k0.x(((fi.f0) this.f1735b).f9891r);
                return;
            case 20:
                gg.m mVar2 = (gg.m) this.f1735b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 21:
                ((gg.w) this.f1735b).run();
                return;
            case 22:
                ((gg.t0) this.f1735b).K();
                return;
            case 23:
                gg.g2 g2Var = (gg.g2) this.f1735b;
                LongSparseArray longSparseArray = g2Var.f10594n;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && g2Var.h.indexOfKey(stickerSet.set.f20064id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f20064id) < 0) {
                    if (s3Var.f22906r) {
                        longSparseArray.put(stickerSet.set.f20064id, stickerSet);
                        g2Var.f10592e.f29925a.h(s3Var.getStickerSet());
                        return;
                    }
                    g2Var.F(stickerSet, s3Var);
                    return;
                }
                return;
            case 24:
                hg.e eVar2 = (hg.e) this.f1735b;
                org.telegram.ui.Components.p6 p6Var = eVar2.f11157f;
                int i12 = eVar2.f11153a;
                boolean z10 = eVar2.f11159r;
                eVar2.f11159r = !z10;
                gq gqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                gqVar.c(LocaleController.getString(i10), true, true);
                p6Var.a();
                if (eVar2.f11159r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                p6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f11159r) {
                    eVar2.f11161w |= 1;
                } else {
                    eVar2.f11161w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f11160s, eVar2.f11161w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f11160s);
                toggleconnectedbotpaused.paused = eVar2.f11159r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 25:
                TL_account.TL_businessChatLink tL_businessChatLink = ((hg.t) this.f1735b).f11328f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    yc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 26:
                ((hi.c) this.f1735b).dismiss();
                return;
            case 27:
                ii.r rVar = (ii.r) this.f1735b;
                rVar.G(0, true, 0, false, 0L);
                zi0 zi0Var = rVar.O;
                if (zi0Var != null) {
                    zi0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            case 28:
                ii.u0 u0Var = (ii.u0) this.f1735b;
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && (aVar = u0Var.f12678f) != null) {
                    ii.x3 x3Var = e3Var.f12348a;
                    x3Var.getClass();
                    if (ii.x3.z3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f12186b;
                        ii.i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        x3Var.f25244f3.N(true);
                        ii.i2 i2Var2 = x3Var.Q3;
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
                ii.q4 q4Var = (ii.q4) this.f1735b;
                ii.a aVar2 = q4Var.f12203a;
                if (aVar2 != null && (o4Var = q4Var.G) != null) {
                    ((ii.t3) o4Var).f12657a.f12769o3.D(aVar2);
                    return;
                }
                return;
        }
    }
}
