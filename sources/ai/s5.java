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
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.c90;
public final class s5 implements RequestDelegate {
    public final int f1493a;
    public final Object f1494b;
    public final Object f1495c;
    public final Object d;

    public s5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1493a = i10;
        this.f1494b = obj;
        this.f1495c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1493a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5((v5) this.f1494b, tLObject, (TL_stories.StoryItem) this.f1495c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((ci.y9) this.f1494b, (org.telegram.ui.ActionBar.a2) this.f1495c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new h5((ci.d) this.f1494b, tLObject, (org.telegram.ui.ActionBar.e3) this.f1495c, (ei.v1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h5(tLObject, (boolean[]) this.f1494b, (org.telegram.ui.web.q) this.f1495c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h5((hg.a0) this.f1494b, tLObject, (TL_account.TL_businessChatLink) this.f1495c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.m0) this.f1494b, (TL_account.TL_connectedBot) this.f1495c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((hg.c2) this.f1494b, tLObject, (ArrayList) this.f1495c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(tLObject, (org.telegram.ui.ActionBar.f6) this.f1494b, (org.telegram.ui.ActionBar.g6) this.f1495c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((hy) this.f1494b), (Object) ((org.telegram.ui.ActionBar.a2[]) this.f1495c), tLObject, (Object) ((org.telegram.ui.ActionBar.z2) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((ez) this.f1494b), (Object) ((TLRPC.TL_messages_getStickers) this.f1495c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((d10) this.f1494b, (org.telegram.ui.ActionBar.m2) this.f1495c, (ArrayList) this.d, 19));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(tL_error, (ci.d) this.f1494b, (org.telegram.ui.ActionBar.e3) this.f1495c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new m3((fy0) this.f1494b, (String) this.f1495c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new m3((ry0) this.f1494b, tLObject, (TLRPC.UserFull) this.f1495c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.f1494b, tL_error, (String) this.f1495c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.f1494b, tLObject, (String[]) this.f1495c, tL_error, (org.telegram.ui.ActionBar.a2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new c90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1494b, (Utilities.Callback) this.f1495c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new c90(tL_error, (Utilities.Callback) ((org.telegram.messenger.v) this.f1494b), tLObject, (MessagesController) this.f1495c, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 26));
                return;
            case 18:
                tg.v vVar = (tg.v) this.f1494b;
                MessagesController messagesController = (MessagesController) this.f1495c;
                tg.y yVar = (tg.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f1(24, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.q1(yVar, 5));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new c90(tLObject, (MessagesController) this.f1494b, (e4) this.f1495c, (tg.f) this.d, tL_error));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new c90((Object) ((tg.m1) this.f1494b), tLObject, (Object) ((TLRPC.UserFull) this.f1495c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new c90((KeyEvent.Callback) ((xh.z4) this.f1494b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f1495c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 29));
                return;
            case 22:
                yh.x3.q0((yh.x3) this.f1494b, (nf.e) this.f1495c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.x3.e1((yh.x3) this.f1494b, (TLRPC.TL_messageActionStarGift) this.f1495c, (org.telegram.ui.ActionBar.a2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1494b, tL_error, (Utilities.Callback2) ((o80) this.f1495c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1494b, tL_error, (Utilities.Callback2) this.f1495c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1494b, tL_error, (Utilities.Callback2) ((m0) this.f1495c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                return;
        }
    }

    public s5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1493a = 16;
        this.d = callback;
        this.f1494b = messagesController;
        this.f1495c = callback2;
    }
}
