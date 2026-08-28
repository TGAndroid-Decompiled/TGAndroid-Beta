package bg;

import android.widget.TextView;
import fh.u6;
import fh.w5;
import gh.k5;
import gh.v7;
import ih.b4;
import java.util.ArrayList;
import kh.n9;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.rx;
import org.telegram.ui.hr;
import org.telegram.ui.ir0;
import org.telegram.ui.k6;
import org.telegram.ui.rx0;
public final class b0 implements RequestDelegate {
    public final int f1701a;
    public final Object f1702b;
    public final Object f1703c;
    public final Object d;

    public b0(b4 b4Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.f1701a = 11;
        this.d = b4Var;
        this.f1702b = storyItem;
        this.f1703c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1701a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(tL_error, (Utilities.Callback) this.f1703c, tLObject, (MessagesController) this.f1702b, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o0(tL_error, (Utilities.Callback) ((org.telegram.messenger.w) this.f1703c), tLObject, (MessagesController) this.f1702b, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 1));
                return;
            case 2:
                z0 z0Var = (z0) this.f1703c;
                MessagesController messagesController = (MessagesController) this.f1702b;
                d1 d1Var = (d1) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new a1.e(11, z0Var, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new af.e(d1Var, 9));
                    return;
                } else {
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new o0(tLObject, (MessagesController) this.f1702b, (j1) this.f1703c, (p) this.d, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new o0((g3) this.f1703c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f1702b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new o0((u6) this.f1703c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f1702b));
                return;
            case 6:
                k5.p0((k5) this.f1703c, (ve.d) this.d, (TL_stars.TL_starGiftUnique) this.f1702b, tLObject, tL_error);
                return;
            case 7:
                k5.e1((k5) this.f1703c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.c2) this.f1702b, tLObject);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new o0((Object) ((v7) this.f1703c), tL_error, (Object) ((w5) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f1702b), 7));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new o0((Object) ((v7) this.f1703c), tL_error, (Object) ((Utilities.Callback2) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f1702b), 11));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new o0((Object) ((v7) this.f1703c), tL_error, (Object) ((y0) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f1702b), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((b4) this.d, tLObject, (TL_stories.StoryItem) this.f1702b, (Utilities.Callback) this.f1703c, 10));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new o0((Object) ((n9) this.f1703c), (Object) ((org.telegram.ui.ActionBar.c2) this.d), (Object) tLObject, (Object) ((TL_phone.getGroupCallStreamRtmpUrl) this.f1702b), tL_error, 17));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((kh.d) this.f1703c, tLObject, (org.telegram.ui.ActionBar.f3) this.d, (mh.r1) this.f1702b, 17));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (boolean[]) this.f1703c, (org.telegram.ui.web.r) this.d, (TLRPC.UserFull) this.f1702b, 20));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (d6) this.f1703c, (e6) this.d, (TLRPC.TL_theme) this.f1702b, 29));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new k6((rx) this.f1703c, (org.telegram.ui.ActionBar.c2[]) this.d, tLObject, (org.telegram.ui.ActionBar.a3) this.f1702b, 19));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new k6((py) this.f1703c, (TLRPC.TL_messages_getStickers) this.d, tLObject, (Runnable) this.f1702b, 20));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((n00) this.f1703c, (org.telegram.ui.ActionBar.o2) this.d, (ArrayList) this.f1702b, 21));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new k6(tL_error, (kh.d) this.f1703c, (org.telegram.ui.ActionBar.f3) this.d, (Runnable) this.f1702b, 27));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new hr((cx0) this.f1703c, (String) this.d, tL_error, tLObject, (TextView) this.f1702b, 2));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new hr((ox0) this.f1703c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f1702b, tL_error, 3));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.web.y0) this.f1703c, tLObject, (String) this.d, (String) this.f1702b, 20));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y((org.telegram.ui.web.y0) this.f1703c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.f1702b, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y((org.telegram.ui.web.y0) this.f1703c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.c2) this.f1702b));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new ir0((pf.u) this.f1703c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.f1702b, 21));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new pf.a((Object) ((pf.g0) this.f1703c), (Object) ((TL_account.TL_connectedBot) this.d), (Object) ((TL_account.TL_businessBotRecipients) this.f1702b), 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rx0((pf.r1) this.f1703c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.f1702b, tL_error, 6));
                return;
        }
    }

    public b0(Object obj, Object obj2, Object obj3, int i9) {
        this.f1701a = i9;
        this.f1703c = obj;
        this.d = obj2;
        this.f1702b = obj3;
    }

    public b0(MessagesController messagesController, j1 j1Var, p pVar) {
        this.f1701a = 3;
        this.f1702b = messagesController;
        this.f1703c = j1Var;
        this.d = pVar;
    }

    public b0(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i9) {
        this.f1701a = i9;
        this.f1703c = callback;
        this.f1702b = messagesController;
        this.d = callback2;
    }
}
