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
import org.telegram.ui.hj0;
import org.telegram.ui.wf;
public final class g0 implements View.OnClickListener {
    public final int f734a;
    public final Object f735b;

    public g0(Object obj, int i10) {
        this.f734a = i10;
        this.f735b = obj;
    }

    @Override
    public final void onClick(View view) {
        h3 h3Var;
        Utilities.Callback callback;
        int i10;
        int i11;
        ji.a aVar;
        switch (this.f734a) {
            case 0:
                t0 t0Var = (t0) this.f735b;
                if (t0Var.f871k) {
                    t0Var.d();
                    return;
                }
                return;
            case 1:
                ((androidx.mediarouter.app.g) this.f735b).dismiss();
                return;
            case 2:
                ((h3) this.f735b).q(!h3Var.f3059f0, true);
                return;
            case 3:
                ((sb) this.f735b).N();
                return;
            case 4:
                ((j7) this.f735b).dismiss();
                m2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new sg.y0(R, 14, false));
                    return;
                }
                return;
            case 5:
                wa waVar = (wa) this.f735b;
                waVar.onClick(waVar.f3927b);
                return;
            case 6:
                bb bbVar = (bb) this.f735b;
                bbVar.f2880b.f3706u1.animate().alpha(0.0f).setDuration(150L).setListener(new lb(bbVar, 0)).start();
                return;
            case 7:
                ((la) this.f735b).run();
                return;
            case 8:
                di.m mVar = (di.m) this.f735b;
                di.g gVar = mVar.f7382f;
                gVar.d();
                gVar.k(true);
                di.e eVar = mVar.f7379c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 9:
                ((ac) this.f735b).B();
                return;
            case 10:
                di.t0.a((di.t0) this.f735b);
                return;
            case 11:
                ((o) this.f735b).run();
                return;
            case 12:
                s6 s6Var = ((r6) this.f735b).f7718x;
                if (s6Var.f7770r && (callback = s6Var.f7768f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 13:
                l9 l9Var = (l9) ((i9) this.f735b).h;
                if (l9Var != null) {
                    l9Var.run();
                    return;
                }
                return;
            case 14:
                ((wf) this.f735b).run();
                return;
            case 15:
                ((wf) this.f735b).run();
                return;
            case 16:
                ChatActivityEnterView.g(((be) ((fi.o0) this.f735b).d).f23747a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 17:
                ((androidx.car.app.utils.b) this.f735b).run();
                return;
            case 18:
                gi.p pVar = (gi.p) this.f735b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((gi.o) pVar.f10231n.f895b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.f19216id, ((gi.o) pVar.f10231n.f895b).getText().toString(), new gi.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f10230f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.f10228b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                return;
            case 19:
                ((gi.e0) this.f735b).h.d.D(0);
                return;
            case 20:
                gi.k0.z(((gi.f0) this.f735b).f10179r);
                return;
            case 21:
                hg.m mVar2 = (hg.m) this.f735b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            case 22:
                ((hg.v) this.f735b).run();
                return;
            case 23:
                ((hg.s0) this.f735b).K();
                return;
            case 24:
                e2 e2Var = (e2) this.f735b;
                LongSparseArray longSparseArray = e2Var.f10543n;
                s3 s3Var = (s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.f19243id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19243id) < 0) {
                    if (s3Var.f21940r) {
                        longSparseArray.put(stickerSet.set.f19243id, stickerSet);
                        e2Var.e.f29897a.h(s3Var.getStickerSet());
                        return;
                    }
                    e2Var.F(stickerSet, s3Var);
                    return;
                }
                return;
            case 25:
                ig.e eVar2 = (ig.e) this.f735b;
                org.telegram.ui.Components.s6 s6Var2 = eVar2.f11472f;
                int i12 = eVar2.f11469a;
                boolean z10 = eVar2.f11474r;
                eVar2.f11474r = !z10;
                qq qqVar = eVar2.h;
                if (!z10) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                qqVar.c(LocaleController.getString(i10), true, true);
                s6Var2.a();
                if (eVar2.f11474r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                s6Var2.c(LocaleController.getString(i11), true, true);
                if (eVar2.f11474r) {
                    eVar2.f11476w |= 1;
                } else {
                    eVar2.f11476w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f11475s, eVar2.f11476w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f11475s);
                toggleconnectedbotpaused.paused = eVar2.f11474r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 26:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.f735b).f11627f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    zc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 27:
                ((ii.c) this.f735b).dismiss();
                return;
            case 28:
                ji.r rVar = (ji.r) this.f735b;
                rVar.K(0, true, 0, false, 0L);
                hj0 hj0Var = rVar.O;
                if (hj0Var != null) {
                    hj0Var.h(true);
                    rVar.O = null;
                    return;
                }
                return;
            default:
                ji.t0 t0Var2 = (ji.t0) this.f735b;
                e3 e3Var = t0Var2.h;
                if (e3Var != null && (aVar = t0Var2.f13521f) != null) {
                    x3 x3Var = e3Var.f13241a;
                    x3Var.getClass();
                    if (x3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13103b;
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
