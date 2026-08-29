package eg;

import android.widget.TextView;
import ih.e6;
import ih.i5;
import java.util.ArrayList;
import jh.h5;
import jh.s7;
import lh.w3;
import nh.y8;
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
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zx;
import org.telegram.ui.Components.zx0;
import org.telegram.ui.a01;
import org.telegram.ui.gg;
import org.telegram.ui.lx0;
public final class z implements RequestDelegate {
    public final int f6199a;
    public final Object f6200b;
    public final Object f6201c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i10) {
        this.f6199a = i10;
        this.f6201c = obj;
        this.d = obj2;
        this.f6200b = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6199a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.f6201c, tLObject, (MessagesController) this.f6200b, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) ((org.telegram.messenger.w) this.f6201c), tLObject, (MessagesController) this.f6200b, (Utilities.Callback) ((org.telegram.messenger.g2) this.d), 1));
                return;
            case 2:
                u0 u0Var = (u0) this.f6201c;
                MessagesController messagesController = (MessagesController) this.f6200b;
                y0 y0Var = (y0) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ef.c(4, u0Var, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new cg.m2(y0Var, 8));
                    return;
                } else {
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (MessagesController) this.f6200b, (d1) this.f6201c, (m) this.d, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new k0((w2) this.f6201c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f6200b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new k0((e6) this.f6201c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f6200b));
                return;
            case 6:
                h5.q0((h5) this.f6201c, (ye.c) this.d, (TL_stars.TL_starGiftUnique) this.f6200b, tLObject, tL_error);
                return;
            case 7:
                h5.e1((h5) this.f6201c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.c2) this.f6200b, tLObject);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new k0((Object) ((s7) this.f6201c), tL_error, (Object) ((i5) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f6200b), 7));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new k0((Object) ((s7) this.f6201c), tL_error, (Object) ((Utilities.Callback2) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f6200b), 11));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new k0((Object) ((s7) this.f6201c), tL_error, (Object) ((bh.v) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f6200b), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((w3) this.d, tLObject, (TL_stories.StoryItem) this.f6200b, (Utilities.Callback) this.f6201c, 13));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new k0((Object) ((y8) this.f6201c), (Object) ((org.telegram.ui.ActionBar.c2) this.d), (Object) tLObject, (Object) ((TL_phone.getGroupCallStreamRtmpUrl) this.f6200b), tL_error, 17));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (org.telegram.ui.ActionBar.e6) this.f6201c, (f6) this.d, (TLRPC.TL_theme) this.f6200b, 23));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg((zx) this.f6201c, (org.telegram.ui.ActionBar.c2[]) this.d, tLObject, (a3) this.f6200b, 13));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg((yy) this.f6201c, (TLRPC.TL_messages_getStickers) this.d, tLObject, (Runnable) this.f6200b, 14));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((y00) this.f6201c, (org.telegram.ui.ActionBar.o2) this.d, (ArrayList) this.f6200b, 10));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new gg(tL_error, (nh.d) this.f6201c, (f3) this.d, (Runnable) this.f6200b, 21));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new u20((nx0) this.f6201c, (String) this.d, tL_error, tLObject, (TextView) this.f6200b, 1));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new u20((zx0) this.f6201c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f6200b, tL_error, 2));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new lx0((org.telegram.ui.web.z0) this.f6201c, tLObject, (String) this.d, (String) this.f6200b, 14));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.z0) this.f6201c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.f6200b, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.z0) this.f6201c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.c2) this.f6200b));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new lx0((nh.d) this.f6201c, tLObject, (f3) this.d, (ph.j1) this.f6200b, 15));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new lx0(tLObject, (boolean[]) this.f6201c, (org.telegram.ui.web.s) this.d, (TLRPC.UserFull) this.f6200b));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new lx0((sf.u) this.f6201c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.f6200b, 23));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((sf.f0) this.f6201c), (Object) ((TL_account.TL_connectedBot) this.d), (Object) ((TL_account.TL_businessBotRecipients) this.f6200b), 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a01((sf.s1) this.f6201c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.f6200b, tL_error, 6));
                return;
        }
    }

    public z(w3 w3Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.f6199a = 11;
        this.d = w3Var;
        this.f6200b = storyItem;
        this.f6201c = callback;
    }

    public z(MessagesController messagesController, d1 d1Var, m mVar) {
        this.f6199a = 3;
        this.f6200b = messagesController;
        this.f6201c = d1Var;
        this.d = mVar;
    }

    public z(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f6199a = i10;
        this.f6201c = callback;
        this.f6200b = messagesController;
        this.d = callback2;
    }
}
