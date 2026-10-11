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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yy0;
public final class t5 implements RequestDelegate {
    public final int f1733a;
    public final Object f1734b;
    public final Object f1735c;
    public final Object d;

    public t5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1733a = i10;
        this.f1734b = obj;
        this.f1735c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1733a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5((w5) this.f1734b, tLObject, (TL_stories.StoryItem) this.f1735c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n3((ci.y9) this.f1734b, (org.telegram.ui.ActionBar.a2) this.f1735c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i5((ci.d) this.f1734b, tLObject, (org.telegram.ui.ActionBar.e3) this.f1735c, (ei.v1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i5(tLObject, (boolean[]) this.f1734b, (org.telegram.ui.web.q) this.f1735c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new i5((hg.z) this.f1734b, tLObject, (TL_account.TL_businessChatLink) this.f1735c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.l0) this.f1734b, (TL_account.TL_connectedBot) this.f1735c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n3((hg.c2) this.f1734b, tLObject, (ArrayList) this.f1735c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(tLObject, (org.telegram.ui.ActionBar.f6) this.f1734b, (org.telegram.ui.ActionBar.g6) this.f1735c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((wy) this.f1734b), (Object) ((org.telegram.ui.ActionBar.a2[]) this.f1735c), tLObject, (Object) ((org.telegram.ui.ActionBar.z2) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((uz) this.f1734b), (Object) ((TLRPC.TL_messages_getStickers) this.f1735c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((t10) this.f1734b, (org.telegram.ui.ActionBar.m2) this.f1735c, (ArrayList) this.d, 22));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(tL_error, (ci.d) this.f1734b, (org.telegram.ui.ActionBar.e3) this.f1735c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new n3((yy0) this.f1734b, (String) this.f1735c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new n3((jz0) this.f1734b, tLObject, (TLRPC.UserFull) this.f1735c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.f1734b, tL_error, (String) this.f1735c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.f1734b, tLObject, (String[]) this.f1735c, tL_error, (org.telegram.ui.ActionBar.a2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1734b, (Utilities.Callback) this.f1735c, 1));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(tL_error, (org.telegram.messenger.w) this.f1734b, tLObject, (MessagesController) this.f1735c, (org.telegram.messenger.g2) this.d, 2));
                return;
            case 18:
                tg.u uVar = (tg.u) this.f1734b;
                MessagesController messagesController = (MessagesController) this.f1735c;
                tg.x xVar = (tg.x) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f2(25, uVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.x1(xVar, 8));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(tLObject, (MessagesController) this.f1734b, (f4) this.f1735c, (tg.f) this.d, tL_error, 3));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((tg.m1) this.f1734b, tLObject, (TLRPC.UserFull) this.f1735c, (TL_account.TL_birthday) this.d, tL_error, 4));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((xh.z4) this.f1734b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f1735c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 5));
                return;
            case 22:
                yh.s3.r0((yh.s3) this.f1734b, (of.e) this.f1735c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.s3.f1((yh.s3) this.f1734b, (TLRPC.TL_messageActionStarGift) this.f1735c, (org.telegram.ui.ActionBar.a2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) this.f1734b, tL_error, (f90) this.f1735c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 8));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) this.f1734b, tL_error, (Utilities.Callback2) this.f1735c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) this.f1734b, tL_error, (qh.r) this.f1735c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 7));
                return;
        }
    }

    public t5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1733a = 16;
        this.d = callback;
        this.f1734b = messagesController;
        this.f1735c = callback2;
    }
}
