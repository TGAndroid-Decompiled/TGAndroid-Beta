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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.g90;
public final class t5 implements RequestDelegate {
    public final int f1549a;
    public final Object f1550b;
    public final Object f1551c;
    public final Object d;

    public t5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1549a = i10;
        this.f1550b = obj;
        this.f1551c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1549a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5((w5) this.f1550b, tLObject, (TL_stories.StoryItem) this.f1551c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((ci.ba) this.f1550b, (org.telegram.ui.ActionBar.b2) this.f1551c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i5((ci.d) this.f1550b, tLObject, (org.telegram.ui.ActionBar.f3) this.f1551c, (ei.v1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i5(tLObject, (boolean[]) this.f1550b, (org.telegram.ui.web.r) this.f1551c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new i5((hg.a0) this.f1550b, tLObject, (TL_account.TL_businessChatLink) this.f1551c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.m0) this.f1550b, (TL_account.TL_connectedBot) this.f1551c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((hg.c2) this.f1550b, tLObject, (ArrayList) this.f1551c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tLObject, (org.telegram.ui.ActionBar.g6) this.f1550b, (org.telegram.ui.ActionBar.h6) this.f1551c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((fy) this.f1550b), (Object) ((org.telegram.ui.ActionBar.b2[]) this.f1551c), tLObject, (Object) ((org.telegram.ui.ActionBar.a3) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((dz) this.f1550b), (Object) ((TLRPC.TL_messages_getStickers) this.f1551c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((c10) this.f1550b, (org.telegram.ui.ActionBar.n2) this.f1551c, (ArrayList) this.d, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tL_error, (ci.d) this.f1550b, (org.telegram.ui.ActionBar.f3) this.f1551c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new m3((vx0) this.f1550b, (String) this.f1551c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new m3((hy0) this.f1550b, tLObject, (TLRPC.UserFull) this.f1551c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.d1) this.f1550b, tL_error, (String) this.f1551c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.d1) this.f1550b, tLObject, (String[]) this.f1551c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new g90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1550b, (Utilities.Callback) this.f1551c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new g90(tL_error, (Utilities.Callback) ((org.telegram.messenger.v) this.f1550b), tLObject, (MessagesController) this.f1551c, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 26));
                return;
            case 18:
                tg.w wVar = (tg.w) this.f1550b;
                MessagesController messagesController = (MessagesController) this.f1551c;
                tg.z zVar = (tg.z) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new p2.b(18, wVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.w1(zVar, 4));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new g90(tLObject, (MessagesController) this.f1550b, (e4) this.f1551c, (tg.h) this.d, tL_error));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new g90((Object) ((tg.n1) this.f1550b), tLObject, (Object) ((TLRPC.UserFull) this.f1551c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new g90((KeyEvent.Callback) ((xh.y4) this.f1550b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f1551c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 29));
                return;
            case 22:
                yh.z3.r0((yh.z3) this.f1550b, (nf.e) this.f1551c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.z3.e1((yh.z3) this.f1550b, (TLRPC.TL_messageActionStarGift) this.f1551c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new yh.u((yh.u5) this.f1550b, tL_error, (Utilities.Callback2) ((d80) this.f1551c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new yh.u((yh.u5) this.f1550b, tL_error, (Utilities.Callback2) this.f1551c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh.u((yh.u5) this.f1550b, tL_error, (Utilities.Callback2) ((m0) this.f1551c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                return;
        }
    }

    public t5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1549a = 16;
        this.d = callback;
        this.f1550b = messagesController;
        this.f1551c = callback2;
    }
}
