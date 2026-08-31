package hg;

import android.widget.TextView;
import java.util.ArrayList;
import lh.e6;
import lh.i5;
import mh.g5;
import mh.t7;
import oh.y3;
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
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.ih;
import org.telegram.ui.t61;
import qh.x7;
public final class y implements RequestDelegate {
    public final int f7669a;
    public final Object f7670b;
    public final Object f7671c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i10) {
        this.f7669a = i10;
        this.f7671c = obj;
        this.d = obj2;
        this.f7670b = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7669a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(tL_error, (Utilities.Callback) this.f7671c, tLObject, (MessagesController) this.f7670b, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new j0(tL_error, (Utilities.Callback) ((org.telegram.messenger.w) this.f7671c), tLObject, (MessagesController) this.f7670b, (Utilities.Callback) ((org.telegram.messenger.h2) this.d), 1));
                return;
            case 2:
                t0 t0Var = (t0) this.f7671c;
                MessagesController messagesController = (MessagesController) this.f7670b;
                x0 x0Var = (x0) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new gf.c(6, t0Var, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new eh.m(x0Var, 12));
                    return;
                } else {
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new j0(tLObject, (MessagesController) this.f7670b, (c1) this.f7671c, (m) this.d, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j0((v2) this.f7671c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f7670b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new j0((e6) this.f7671c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f7670b));
                return;
            case 6:
                g5.q0((g5) this.f7671c, (af.f) this.d, (TL_stars.TL_starGiftUnique) this.f7670b, tLObject, tL_error);
                return;
            case 7:
                g5.e1((g5) this.f7671c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.d2) this.f7670b, tLObject);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new j0((Object) ((t7) this.f7671c), tL_error, (Object) ((i5) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f7670b), 7));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new j0((Object) ((t7) this.f7671c), tL_error, (Object) ((Utilities.Callback2) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f7670b), 11));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new j0((Object) ((t7) this.f7671c), tL_error, (Object) ((eh.w) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f7670b), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((y3) this.d, tLObject, (TL_stories.StoryItem) this.f7670b, (Utilities.Callback) this.f7671c, 13));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (i6) this.f7671c, (j6) this.d, (TLRPC.TL_theme) this.f7670b, 21));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ih((Object) ((hy) this.f7671c), (Object) ((org.telegram.ui.ActionBar.d2[]) this.d), tLObject, (Object) ((c3) this.f7670b), 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ih((Object) ((fz) this.f7671c), (Object) ((TLRPC.TL_messages_getStickers) this.d), tLObject, (Object) ((Runnable) this.f7670b), 12));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new jp((d10) this.f7671c, (org.telegram.ui.ActionBar.p2) this.d, (ArrayList) this.f7670b, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ih(tL_error, (qh.d) this.f7671c, (h3) this.d, (Runnable) this.f7670b));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new j0((Object) ((yx0) this.f7671c), (Object) ((String) this.d), tL_error, tLObject, (Object) ((TextView) this.f7670b), 29));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ky0((Object) ((ly0) this.f7671c), (Object) tLObject, (Object) ((TLRPC.UserFull) this.d), (Object) ((TL_account.TL_birthday) this.f7670b), (Object) tL_error, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yx0((Object) ((org.telegram.ui.web.a1) this.f7671c), tLObject, (Object) ((String) this.d), (Object) ((String) this.f7670b), 12));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.a1) this.f7671c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.f7670b, tLObject));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.a1) this.f7671c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.d2) this.f7670b));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new t61((x7) this.f7671c, (org.telegram.ui.ActionBar.d2) this.d, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.f7670b, tL_error));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yx0((qh.d) this.f7671c, tLObject, (h3) this.d, (sh.j1) this.f7670b, false, 16));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yx0(tLObject, (boolean[]) this.f7671c, (org.telegram.ui.web.s) this.d, (TLRPC.UserFull) this.f7670b));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yx0((vf.t) this.f7671c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.f7670b, false, 24));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.f0) this.f7671c, (TL_account.TL_connectedBot) this.d, (TL_account.TL_businessBotRecipients) this.f7670b, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t61((vf.p1) this.f7671c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.f7670b, tL_error));
                return;
        }
    }

    public y(y3 y3Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.f7669a = 11;
        this.d = y3Var;
        this.f7670b = storyItem;
        this.f7671c = callback;
    }

    public y(MessagesController messagesController, c1 c1Var, m mVar) {
        this.f7669a = 3;
        this.f7670b = messagesController;
        this.f7671c = c1Var;
        this.d = mVar;
    }

    public y(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f7669a = i10;
        this.f7671c = callback;
        this.f7670b = messagesController;
        this.d = callback2;
    }
}
