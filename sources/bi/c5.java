package bi;

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
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.h90;
public final class c5 implements RequestDelegate {
    public final int f2843a;
    public final Object f2844b;
    public final Object f2845c;
    public final Object d;

    public c5(Object obj, Object obj2, Object obj3, int i10) {
        this.f2843a = i10;
        this.f2844b = obj;
        this.f2845c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2843a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f5) this.f2844b, tLObject, (TL_stories.StoryItem) this.f2845c, (Utilities.Callback) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new z2((di.ba) this.f2844b, (org.telegram.ui.ActionBar.b2) this.f2845c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((di.d) this.f2844b, tLObject, (org.telegram.ui.ActionBar.f3) this.f2845c, (fi.v1) this.d, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.f2844b, (org.telegram.ui.web.s) this.f2845c, (TLRPC.UserFull) this.d, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((ig.y) this.f2844b, tLObject, (TL_account.TL_businessChatLink) this.f2845c, (Runnable) this.d, 16));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new hg.t((ig.k0) this.f2844b, (TL_account.TL_connectedBot) this.f2845c, (TL_account.TL_businessBotRecipients) this.d, 11));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new z2((ig.b2) this.f2844b, tLObject, (ArrayList) this.f2845c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tLObject, (org.telegram.ui.ActionBar.h6) this.f2844b, (org.telegram.ui.ActionBar.i6) this.f2845c, (TLRPC.TL_theme) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((gy) this.f2844b), (Object) ((org.telegram.ui.ActionBar.b2[]) this.f2845c), tLObject, (Object) ((org.telegram.ui.ActionBar.a3) this.d), 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((dz) this.f2844b), (Object) ((TLRPC.TL_messages_getStickers) this.f2845c), tLObject, (Object) ((Runnable) this.d), 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((c10) this.f2844b, (org.telegram.ui.ActionBar.n2) this.f2845c, (ArrayList) this.d, 16));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tL_error, (di.d) this.f2844b, (org.telegram.ui.ActionBar.f3) this.f2845c, (Runnable) this.d, 28));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new z2((ux0) this.f2844b, (String) this.f2845c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new z2((gy0) this.f2844b, tLObject, (TLRPC.UserFull) this.f2845c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.d1) this.f2844b, tL_error, (String) this.f2845c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.d1) this.f2844b, tLObject, (String[]) this.f2845c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new h90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f2844b, (Utilities.Callback) this.f2845c, 25));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new h90(tL_error, (Utilities.Callback) ((org.telegram.messenger.v) this.f2844b), tLObject, (MessagesController) this.f2845c, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 26));
                return;
            case 18:
                ug.w wVar = (ug.w) this.f2844b;
                MessagesController messagesController = (MessagesController) this.f2845c;
                ug.z zVar = (ug.z) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ug.r(0, wVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new sg.p0(zVar, 7));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new h90(tLObject, (MessagesController) this.f2844b, (r3) this.f2845c, (ug.g) this.d, tL_error));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ug.n1) this.f2844b), tLObject, (Object) ((TLRPC.UserFull) this.f2845c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 28));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new h90((KeyEvent.Callback) ((yh.x4) this.f2844b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f2845c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 29));
                return;
            case 22:
                zh.w3.r0((zh.w3) this.f2844b, (of.e) this.f2845c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                zh.w3.e1((zh.w3) this.f2844b, (TLRPC.TL_messageActionStarGift) this.f2845c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) this.f2844b, tL_error, (Utilities.Callback2) ((d80) this.f2845c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) this.f2844b, tL_error, (Utilities.Callback2) this.f2845c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) this.f2844b, tL_error, (Utilities.Callback2) ((f0) this.f2845c), tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                return;
        }
    }

    public c5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f2843a = 16;
        this.d = callback;
        this.f2844b = messagesController;
        this.f2845c = callback2;
    }
}
