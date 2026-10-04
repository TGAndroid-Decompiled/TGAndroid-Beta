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
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.f90;
public final class s5 implements RequestDelegate {
    public final int f1626a;
    public final Object f1627b;
    public final Object f1628c;
    public final Object d;

    public s5(Object obj, Object obj2, Object obj3, int i10) {
        this.f1626a = i10;
        this.f1627b = obj;
        this.f1628c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1626a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5((v5) this.f1627b, tLObject, (TL_stories.StoryItem) this.f1628c, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((ci.x9) this.f1627b, (org.telegram.ui.ActionBar.b2) this.f1628c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new h5((ci.d) this.f1627b, tLObject, (org.telegram.ui.ActionBar.f3) this.f1628c, (ei.w1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h5(tLObject, (boolean[]) this.f1627b, (org.telegram.ui.web.q) this.f1628c, (TLRPC.UserFull) this.d));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h5((hg.y) this.f1627b, tLObject, (TL_account.TL_businessChatLink) this.f1628c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.l0) this.f1627b, (TL_account.TL_connectedBot) this.f1628c, (TL_account.TL_businessBotRecipients) this.d, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((hg.b2) this.f1627b, tLObject, (ArrayList) this.f1628c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(tLObject, (org.telegram.ui.ActionBar.f6) this.f1627b, (org.telegram.ui.ActionBar.h6) this.f1628c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((jy) this.f1627b), (Object) ((org.telegram.ui.ActionBar.b2[]) this.f1628c), tLObject, (Object) ((org.telegram.ui.ActionBar.a3) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((gz) this.f1627b), (Object) ((TLRPC.TL_messages_getStickers) this.f1628c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((f10) this.f1627b, (org.telegram.ui.ActionBar.n2) this.f1628c, (ArrayList) this.d, 19));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(tL_error, (ci.d) this.f1627b, (org.telegram.ui.ActionBar.f3) this.f1628c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new m3((qy0) this.f1627b, (String) this.f1628c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new m3((cz0) this.f1627b, tLObject, (TLRPC.UserFull) this.f1628c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.f1627b, tL_error, (String) this.f1628c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.f1627b, tLObject, (String[]) this.f1628c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new f90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f1627b, (Utilities.Callback) this.f1628c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new f90(tL_error, (Utilities.Callback) ((org.telegram.messenger.v) this.f1627b), tLObject, (MessagesController) this.f1628c, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 26));
                return;
            case 18:
                tg.v vVar = (tg.v) this.f1627b;
                MessagesController messagesController = (MessagesController) this.f1628c;
                tg.y yVar = (tg.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(24, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rg.s1(yVar, 5));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new f90(tLObject, (MessagesController) this.f1627b, (e4) this.f1628c, (tg.f) this.d, tL_error));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new f90((Object) ((tg.m1) this.f1627b), tLObject, (Object) ((TLRPC.UserFull) this.f1628c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new f90((KeyEvent.Callback) ((xh.z4) this.f1627b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f1628c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 29));
                return;
            case 22:
                yh.x3.q0((yh.x3) this.f1627b, (nf.e) this.f1628c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                yh.x3.e1((yh.x3) this.f1627b, (TLRPC.TL_messageActionStarGift) this.f1628c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1627b, tL_error, (Utilities.Callback2) ((r80) this.f1628c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1627b, tL_error, (Utilities.Callback2) this.f1628c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) this.f1627b, tL_error, (Utilities.Callback2) ((m0) this.f1628c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                return;
        }
    }

    public s5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f1626a = 16;
        this.d = callback;
        this.f1627b = messagesController;
        this.f1628c = callback2;
    }
}
