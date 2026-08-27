package cg;

import android.widget.TextView;
import gh.m6;
import hh.i5;
import java.util.ArrayList;
import jh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sx;
import org.telegram.ui.a01;
import org.telegram.ui.yf;

public final class y implements RequestDelegate {

    public final int f2859a;

    public final Object f2860b;

    public final Object f2861c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i10) {
        this.f2859a = i10;
        this.f2861c = obj;
        this.d = obj2;
        this.f2860b = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2859a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.f2861c, tLObject, (MessagesController) this.f2860b, (Utilities.Callback) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.f2861c, tLObject, (MessagesController) this.f2860b, (Utilities.Callback) this.d, 1));
                break;
            case 2:
                v0 v0Var = (v0) this.f2861c;
                MessagesController messagesController = (MessagesController) this.f2860b;
                z0 z0Var = (z0) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new a1.e(21, v0Var, tL_error));
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new af.e(z0Var, 21));
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (MessagesController) this.f2860b, (e1) this.f2861c, (m) this.d, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new k0((y2) this.f2861c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f2860b, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new k0((m6) this.f2861c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f2860b));
                break;
            case 6:
                i5.q0((i5) this.f2861c, (we.d) this.d, (TL_stars.TL_starGiftUnique) this.f2860b, tLObject, tL_error);
                break;
            case 7:
                i5.e1((i5) this.f2861c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.b2) this.f2860b, tLObject);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new k0(this.f2861c, tL_error, this.d, (Object) tLObject, (TLObject) this.f2860b, 7));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new k0(this.f2861c, tL_error, this.d, (Object) tLObject, (TLObject) this.f2860b, 11));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new k0(this.f2861c, tL_error, this.d, (Object) tLObject, (TLObject) this.f2860b, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((x3) this.d, tLObject, (TL_stories.StoryItem) this.f2860b, (Utilities.Callback) this.f2861c, 11));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new k0(this.f2861c, this.d, (Object) tLObject, this.f2860b, tL_error, 17));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((lh.d) this.f2861c, tLObject, (e3) this.d, (nh.q1) this.f2860b, 17));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.f2861c, (org.telegram.ui.web.s) this.d, (TLRPC.UserFull) this.f2860b, 20));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (e6) this.f2861c, (f6) this.d, (TLRPC.TL_theme) this.f2860b, 25));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new yf((sx) this.f2861c, (org.telegram.ui.ActionBar.b2[]) this.d, tLObject, (z2) this.f2860b, 15));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new yf((ry) this.f2861c, (TLRPC.TL_messages_getStickers) this.d, tLObject, (Runnable) this.f2860b, 16));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new i3((q00) this.f2861c, (org.telegram.ui.ActionBar.n2) this.d, (ArrayList) this.f2860b, 15));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new yf(tL_error, (lh.d) this.f2861c, (e3) this.d, (Runnable) this.f2860b, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new l20((ex0) this.f2861c, (String) this.d, tL_error, tLObject, (TextView) this.f2860b, 1));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new l20((qx0) this.f2861c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f2860b, tL_error, 2));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ex0((org.telegram.ui.web.z0) this.f2861c, tLObject, (String) this.d, (String) this.f2860b, 16));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.z0) this.f2861c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.f2860b, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.z0) this.f2861c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.b2) this.f2860b));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ex0((qf.v) this.f2861c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.f2860b, 21));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new qf.a(this.f2861c, this.d, this.f2860b, 4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a01((qf.q1) this.f2861c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.f2860b, tL_error, 6));
                break;
        }
    }

    public y(x3 x3Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.f2859a = 11;
        this.d = x3Var;
        this.f2860b = storyItem;
        this.f2861c = callback;
    }

    public y(MessagesController messagesController, e1 e1Var, m mVar) {
        this.f2859a = 3;
        this.f2860b = messagesController;
        this.f2861c = e1Var;
        this.d = mVar;
    }

    public y(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f2859a = i10;
        this.f2861c = callback;
        this.f2860b = messagesController;
        this.d = callback2;
    }
}
