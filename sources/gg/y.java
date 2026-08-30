package gg;

import android.widget.TextView;
import java.util.ArrayList;
import kh.e6;
import kh.i5;
import lh.g5;
import lh.t7;
import nh.w3;
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
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.ih;
import org.telegram.ui.s61;
import org.telegram.ui.wx0;
import ph.z7;
public final class y implements RequestDelegate {
    public final int f6811a;
    public final Object f6812b;
    public final Object f6813c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i10) {
        this.f6811a = i10;
        this.f6813c = obj;
        this.d = obj2;
        this.f6812b = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6811a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(tL_error, (Utilities.Callback) this.f6813c, tLObject, (MessagesController) this.f6812b, (Utilities.Callback) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new j0(tL_error, (Utilities.Callback) ((org.telegram.messenger.x) this.f6813c), tLObject, (MessagesController) this.f6812b, (Utilities.Callback) ((org.telegram.messenger.h2) this.d), 1));
                return;
            case 2:
                t0 t0Var = (t0) this.f6813c;
                MessagesController messagesController = (MessagesController) this.f6812b;
                x0 x0Var = (x0) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new gf.c(4, t0Var, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ef.e(x0Var, 10));
                    return;
                } else {
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new j0(tLObject, (MessagesController) this.f6812b, (c1) this.f6813c, (m) this.d, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j0((v2) this.f6813c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.f6812b, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new j0((e6) this.f6813c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f6812b));
                return;
            case 6:
                g5.q0((g5) this.f6813c, (af.f) this.d, (TL_stars.TL_starGiftUnique) this.f6812b, tLObject, tL_error);
                return;
            case 7:
                g5.e1((g5) this.f6813c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.d2) this.f6812b, tLObject);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new j0((Object) ((t7) this.f6813c), tL_error, (Object) ((i5) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f6812b), 7));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new j0((Object) ((t7) this.f6813c), tL_error, (Object) ((Utilities.Callback2) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f6812b), 11));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new j0((Object) ((t7) this.f6813c), tL_error, (Object) ((dh.v) this.d), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.f6812b), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((w3) this.d, tLObject, (TL_stories.StoryItem) this.f6812b, (Utilities.Callback) this.f6813c, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (h6) this.f6813c, (i6) this.d, (TLRPC.TL_theme) this.f6812b, 21));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ih((Object) ((fy) this.f6813c), (Object) ((org.telegram.ui.ActionBar.d2[]) this.d), tLObject, (Object) ((b3) this.f6812b), 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ih((Object) ((dz) this.f6813c), (Object) ((TLRPC.TL_messages_getStickers) this.d), tLObject, (Object) ((Runnable) this.f6812b), 12));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new hp((c10) this.f6813c, (org.telegram.ui.ActionBar.p2) this.d, (ArrayList) this.f6812b, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ih(tL_error, (ph.d) this.f6813c, (g3) this.d, (Runnable) this.f6812b));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new j0((Object) ((xx0) this.f6813c), (Object) ((String) this.d), tL_error, tLObject, (Object) ((TextView) this.f6812b), 29));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new jy0((Object) ((ky0) this.f6813c), (Object) tLObject, (Object) ((TLRPC.UserFull) this.d), (Object) ((TL_account.TL_birthday) this.f6812b), (Object) tL_error, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new wx0((Object) ((org.telegram.ui.web.a1) this.f6813c), tLObject, (Object) ((String) this.d), (Object) ((String) this.f6812b), 12));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.a1) this.f6813c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.f6812b, tLObject));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.a1) this.f6813c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.d2) this.f6812b));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new s61((z7) this.f6813c, (org.telegram.ui.ActionBar.d2) this.d, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.f6812b, tL_error));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new wx0((ph.d) this.f6813c, tLObject, (g3) this.d, (rh.k1) this.f6812b, false, 15));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new wx0(tLObject, (boolean[]) this.f6813c, (org.telegram.ui.web.s) this.d, (TLRPC.UserFull) this.f6812b));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new wx0((uf.t) this.f6813c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.f6812b, false, 23));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new tf.h1((uf.e0) this.f6813c, (TL_account.TL_connectedBot) this.d, (TL_account.TL_businessBotRecipients) this.f6812b, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s61((uf.p1) this.f6813c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.f6812b, tL_error));
                return;
        }
    }

    public y(w3 w3Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.f6811a = 11;
        this.d = w3Var;
        this.f6812b = storyItem;
        this.f6813c = callback;
    }

    public y(MessagesController messagesController, c1 c1Var, m mVar) {
        this.f6811a = 3;
        this.f6812b = messagesController;
        this.f6813c = c1Var;
        this.d = mVar;
    }

    public y(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f6811a = i10;
        this.f6813c = callback;
        this.f6812b = messagesController;
        this.d = callback2;
    }
}
