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
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.h90;
public final class t5 implements RequestDelegate {
    public final int f1552a;
    public final Object f1553b;
    public final Object f1554c;
    public final Object d;

    public t5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1552a = i10;
        this.f1553b = obj;
        this.f1554c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1552a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5((w5) this.f1553b, tLObject, (TL_stories.StoryItem) this.f1554c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((ci.ba) this.f1553b, (org.telegram.ui.ActionBar.b2) this.f1554c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i5((ci.d) this.f1553b, tLObject, (org.telegram.ui.ActionBar.f3) this.f1554c, (ei.v1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i5(tLObject, (boolean[]) this.f1553b, (org.telegram.ui.web.r) this.f1554c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new i5((hg.y) this.f1553b, tLObject, (TL_account.TL_businessChatLink) this.f1554c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.l0) this.f1553b, (TL_account.TL_connectedBot) this.f1554c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((hg.b2) this.f1553b, tLObject, (ArrayList) this.f1554c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tLObject, (org.telegram.ui.ActionBar.g6) this.f1553b, (org.telegram.ui.ActionBar.i6) this.f1554c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((gy) this.f1553b), (Object) ((org.telegram.ui.ActionBar.b2[]) this.f1554c), tLObject, (Object) ((org.telegram.ui.ActionBar.a3) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((dz) this.f1553b), (Object) ((TLRPC.TL_messages_getStickers) this.f1554c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((c10) this.f1553b, (org.telegram.ui.ActionBar.n2) this.f1554c, (ArrayList) this.d, 19));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tL_error, (ci.d) this.f1553b, (org.telegram.ui.ActionBar.f3) this.f1554c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new m3((hy0) this.f1553b, (String) this.f1554c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new m3((ty0) this.f1553b, tLObject, (TLRPC.UserFull) this.f1554c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.d1) this.f1553b, tL_error, (String) this.f1554c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.d1) this.f1553b, tLObject, (String[]) this.f1554c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new h90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1553b, (Utilities.Callback) this.f1554c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new h90(tL_error, (Utilities.Callback) ((org.telegram.messenger.w) this.f1553b), tLObject, (MessagesController) this.f1554c, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 26));
                return;
            case 18:
                tg.v vVar = (tg.v) this.f1553b;
                MessagesController messagesController = (MessagesController) this.f1554c;
                tg.y yVar = (tg.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.p1(22, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.w1(yVar, 4));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new h90(tLObject, (MessagesController) this.f1553b, (e4) this.f1554c, (tg.f) this.d, tL_error));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new h90((Object) ((tg.m1) this.f1553b), tLObject, (Object) ((TLRPC.UserFull) this.f1554c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new h90((KeyEvent.Callback) ((xh.z4) this.f1553b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f1554c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 29));
                return;
            case 22:
                yh.y3.r0((yh.y3) this.f1553b, (nf.e) this.f1554c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.y3.e1((yh.y3) this.f1553b, (TLRPC.TL_messageActionStarGift) this.f1554c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1553b, tL_error, (Utilities.Callback2) ((m80) this.f1554c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1553b, tL_error, (Utilities.Callback2) this.f1554c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1553b, tL_error, (Utilities.Callback2) ((m0) this.f1554c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                return;
        }
    }

    public t5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1552a = 16;
        this.d = callback;
        this.f1553b = messagesController;
        this.f1554c = callback2;
    }
}
