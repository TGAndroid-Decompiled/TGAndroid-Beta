package ai;

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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yy;
public final class t5 implements RequestDelegate {
    public final int f1731a;
    public final Object f1732b;
    public final Object f1733c;
    public final Object d;

    public t5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1731a = i10;
        this.f1732b = obj;
        this.f1733c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1731a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5((w5) this.f1732b, tLObject, (TL_stories.StoryItem) this.f1733c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n3((ci.y9) this.f1732b, (org.telegram.ui.ActionBar.a2) this.f1733c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i5((ci.d) this.f1732b, tLObject, (org.telegram.ui.ActionBar.e3) this.f1733c, (ei.v1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i5(tLObject, (boolean[]) this.f1732b, (org.telegram.ui.web.q) this.f1733c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new i5((hg.z) this.f1732b, tLObject, (TL_account.TL_businessChatLink) this.f1733c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.l0) this.f1732b, (TL_account.TL_connectedBot) this.f1733c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n3((hg.c2) this.f1732b, tLObject, (ArrayList) this.f1733c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(tLObject, (org.telegram.ui.ActionBar.e6) this.f1732b, (org.telegram.ui.ActionBar.g6) this.f1733c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((yy) this.f1732b), (Object) ((org.telegram.ui.ActionBar.a2[]) this.f1733c), tLObject, (Object) ((org.telegram.ui.ActionBar.z2) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((wz) this.f1732b), (Object) ((TLRPC.TL_messages_getStickers) this.f1733c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((v10) this.f1732b, (org.telegram.ui.ActionBar.m2) this.f1733c, (ArrayList) this.d, 20));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(tL_error, (ci.d) this.f1732b, (org.telegram.ui.ActionBar.e3) this.f1733c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new n3((dz0) this.f1732b, (String) this.f1733c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new n3((oz0) this.f1732b, tLObject, (TLRPC.UserFull) this.f1733c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.f1732b, tL_error, (String) this.f1733c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.f1732b, tLObject, (String[]) this.f1733c, tL_error, (org.telegram.ui.ActionBar.a2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1732b, (Utilities.Callback) this.f1733c, 1));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(tL_error, (org.telegram.messenger.x) this.f1732b, tLObject, (MessagesController) this.f1733c, (org.telegram.messenger.k2) this.d, 2));
                return;
            case 18:
                tg.u uVar = (tg.u) this.f1732b;
                MessagesController messagesController = (MessagesController) this.f1733c;
                tg.x xVar = (tg.x) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new p2.b(25, uVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.x1(xVar, 8));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(tLObject, (MessagesController) this.f1732b, (f4) this.f1733c, (tg.f) this.d, tL_error, 3));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((tg.m1) this.f1732b, tLObject, (TLRPC.UserFull) this.f1733c, (TL_account.TL_birthday) this.d, tL_error, 4));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((xh.y4) this.f1732b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f1733c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 5));
                return;
            case 22:
                yh.s3.r0((yh.s3) this.f1732b, (of.e) this.f1733c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.s3.f1((yh.s3) this.f1732b, (TLRPC.TL_messageActionStarGift) this.f1733c, (org.telegram.ui.ActionBar.a2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) this.f1732b, tL_error, (j90) this.f1733c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 8));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) this.f1732b, tL_error, (Utilities.Callback2) this.f1733c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) this.f1732b, tL_error, (qh.r) this.f1733c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 7));
                return;
        }
    }

    public t5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1731a = 16;
        this.d = callback;
        this.f1732b = messagesController;
        this.f1733c = callback2;
    }
}
