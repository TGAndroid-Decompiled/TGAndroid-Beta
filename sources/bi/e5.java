package bi;

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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.uy0;
public final class e5 implements RequestDelegate {
    public final int f2987a;
    public final Object f2988b;
    public final Object f2989c;
    public final Object d;

    public e5(Object obj, Object obj2, Object obj3, int i10) {
        this.f2987a = i10;
        this.f2988b = obj;
        this.f2989c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2987a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((h5) this.f2988b, tLObject, (TL_stories.StoryItem) this.f2989c, (Utilities.Callback) this.d, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((di.x9) this.f2988b, (org.telegram.ui.ActionBar.a2) this.f2989c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((di.d) this.f2988b, tLObject, (org.telegram.ui.ActionBar.e3) this.f2989c, (fi.u1) this.d, 7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.f2988b, (org.telegram.ui.web.q) this.f2989c, (TLRPC.UserFull) this.d, 10));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((ig.y) this.f2988b, tLObject, (TL_account.TL_businessChatLink) this.f2989c, (Runnable) this.d, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new hg.t((ig.k0) this.f2988b, (TL_account.TL_connectedBot) this.f2989c, (TL_account.TL_businessBotRecipients) this.d, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c3((ig.b2) this.f2988b, tLObject, (ArrayList) this.f2989c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (org.telegram.ui.ActionBar.e6) this.f2988b, (org.telegram.ui.ActionBar.f6) this.f2989c, (TLRPC.TL_theme) this.d, 28));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((ry) this.f2988b, (org.telegram.ui.ActionBar.a2[]) this.f2989c, tLObject, (org.telegram.ui.ActionBar.z2) this.d, 18));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((pz) this.f2988b, (TLRPC.TL_messages_getStickers) this.f2989c, tLObject, (Runnable) this.d, 19));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((o10) this.f2988b, (org.telegram.ui.ActionBar.m2) this.f2989c, (ArrayList) this.d, 22));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6(tL_error, (di.d) this.f2988b, (org.telegram.ui.ActionBar.e3) this.f2989c, (Runnable) this.d, 26));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new c3((uy0) this.f2988b, (String) this.f2989c, tL_error, tLObject, (TextView) this.d, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new c3((fz0) this.f2988b, tLObject, (TLRPC.UserFull) this.f2989c, (TL_account.TL_birthday) this.d, tL_error, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.f2988b, tL_error, (String) this.f2989c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.f2988b, tLObject, (String[]) this.f2989c, tL_error, (org.telegram.ui.ActionBar.a2) this.d));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.f2988b, (Utilities.Callback) this.f2989c, 1));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(tL_error, (org.telegram.messenger.w) this.f2988b, tLObject, (MessagesController) this.f2989c, (org.telegram.messenger.j2) this.d, 2));
                return;
            case 18:
                ug.v vVar = (ug.v) this.f2988b;
                MessagesController messagesController = (MessagesController) this.f2989c;
                ug.y yVar = (ug.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new s9.b(11, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ri.h0(yVar, 14));
                    return;
                } else {
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(tLObject, (MessagesController) this.f2988b, (u3) this.f2989c, (ug.g) this.d, tL_error, 3));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((ug.m1) this.f2988b, tLObject, (TLRPC.UserFull) this.f2989c, (TL_account.TL_birthday) this.d, tL_error, 4));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((yh.x4) this.f2988b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f2989c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 5));
                return;
            case 22:
                zh.r3.r0((zh.r3) this.f2988b, (pf.c) this.f2989c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 23:
                zh.r3.f1((zh.r3) this.f2988b, (TLRPC.TL_messageActionStarGift) this.f2989c, (org.telegram.ui.ActionBar.a2) this.d, tLObject);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((zh.n5) this.f2988b, tL_error, (c90) this.f2989c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 8));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((zh.n5) this.f2988b, tL_error, (Utilities.Callback2) this.f2989c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((zh.n5) this.f2988b, tL_error, (rh.r) this.f2989c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 7));
                return;
        }
    }

    public e5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.f2987a = 16;
        this.d = callback;
        this.f2988b = messagesController;
        this.f2989c = callback2;
    }
}
