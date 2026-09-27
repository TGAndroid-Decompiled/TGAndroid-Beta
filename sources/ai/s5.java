package ai;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.e90;
public final class s5 implements RequestDelegate {
    public final int f1495a;
    public final Object f1496b;
    public final Object f1497c;
    public final Object d;

    public s5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1495a = i10;
        this.f1496b = obj;
        this.f1497c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1495a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5((v5) this.f1496b, tLObject, (TL_stories.StoryItem) this.f1497c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((ci.x9) this.f1496b, (org.telegram.ui.ActionBar.c2) this.f1497c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new h5((ci.d) this.f1496b, tLObject, (org.telegram.ui.ActionBar.g3) this.f1497c, (ei.v1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h5(tLObject, (boolean[]) this.f1496b, (org.telegram.ui.web.q) this.f1497c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h5((hg.y) this.f1496b, tLObject, (TL_account.TL_businessChatLink) this.f1497c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.l0) this.f1496b, (TL_account.TL_connectedBot) this.f1497c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((hg.b2) this.f1496b, tLObject, (ArrayList) this.f1497c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tLObject, (org.telegram.ui.ActionBar.g6) this.f1496b, (org.telegram.ui.ActionBar.h6) this.f1497c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((hy) this.f1496b), (Object) ((org.telegram.ui.ActionBar.c2[]) this.f1497c), tLObject, (Object) ((org.telegram.ui.ActionBar.b3) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((fz) this.f1496b), (Object) ((TLRPC.TL_messages_getStickers) this.f1497c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((e10) this.f1496b, (org.telegram.ui.ActionBar.o2) this.f1497c, (ArrayList) this.d, 19));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tL_error, (ci.d) this.f1496b, (org.telegram.ui.ActionBar.g3) this.f1497c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new m3((hy0) this.f1496b, (String) this.f1497c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new m3((ty0) this.f1496b, tLObject, (TLRPC.UserFull) this.f1497c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.c1) this.f1496b, tL_error, (String) this.f1497c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.c1) this.f1496b, tLObject, (String[]) this.f1497c, tL_error, (org.telegram.ui.ActionBar.c2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new e90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1496b, (Utilities.Callback) this.f1497c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new e90(tL_error, (Utilities.Callback) ((org.telegram.messenger.v) this.f1496b), tLObject, (MessagesController) this.f1497c, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 26));
                return;
            case 18:
                tg.v vVar = (tg.v) this.f1496b;
                MessagesController messagesController = (MessagesController) this.f1497c;
                tg.y yVar = (tg.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g2(21, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.q1(yVar, 5));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new e90(tLObject, (MessagesController) this.f1496b, (e4) this.f1497c, (tg.f) this.d, tL_error));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new e90((Object) ((tg.m1) this.f1496b), tLObject, (Object) ((TLRPC.UserFull) this.f1497c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new e90((KeyEvent.Callback) ((xh.a5) this.f1496b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f1497c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 29));
                return;
            case 22:
                yh.x3.q0((yh.x3) this.f1496b, (nf.e) this.f1497c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.x3.e1((yh.x3) this.f1496b, (TLRPC.TL_messageActionStarGift) this.f1497c, (org.telegram.ui.ActionBar.c2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new yh.u((yh.s5) this.f1496b, tL_error, (Utilities.Callback2) ((q80) this.f1497c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new yh.u((yh.s5) this.f1496b, tL_error, (Utilities.Callback2) this.f1497c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh.u((yh.s5) this.f1496b, tL_error, (Utilities.Callback2) ((m0) this.f1497c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                return;
        }
    }

    public s5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1495a = 16;
        this.d = callback;
        this.f1496b = messagesController;
        this.f1497c = callback2;
    }
}
