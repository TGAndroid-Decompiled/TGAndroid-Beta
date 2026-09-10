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
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.ac0;
import org.telegram.ui.fy0;
public final class wa implements RequestDelegate {
    public final int f3836a;
    public final Object f3837b;
    public final Object f3838c;
    public final Object d;

    public wa(Object obj, Object obj2, Object obj3, int i10) {
        this.f3836a = i10;
        this.f3837b = obj;
        this.f3838c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3836a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ya((kb) this.f3837b, (org.telegram.ui.ActionBar.d2) this.f3838c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((d) this.f3837b, tLObject, (org.telegram.ui.ActionBar.h3) this.f3838c, (di.y1) this.d, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.f3837b, (org.telegram.ui.web.r) this.f3838c, (TLRPC.UserFull) this.d, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((gg.b0) this.f3837b, tLObject, (TL_account.TL_businessChatLink) this.f3838c, (Runnable) this.d, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.p0) this.f3837b, (TL_account.TL_connectedBot) this.f3838c, (TL_account.TL_businessBotRecipients) this.d, 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ya((Object) ((gg.k2) this.f3837b), tLObject, (Object) ((ArrayList) this.f3838c), (Object) ((TLRPC.TL_messages_sendQuickReplyMessages) this.d), tL_error, 5));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (org.telegram.ui.ActionBar.h6) this.f3837b, (org.telegram.ui.ActionBar.i6) this.f3838c, (TLRPC.TL_theme) this.d, 26));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((ny) this.f3837b, (org.telegram.ui.ActionBar.d2[]) this.f3838c, tLObject, (org.telegram.ui.ActionBar.c3) this.d, 16));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((kz) this.f3837b, (TLRPC.TL_messages_getStickers) this.f3838c, tLObject, (Runnable) this.d, 17));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gf((k10) this.f3837b, (org.telegram.ui.ActionBar.p2) this.f3838c, (ArrayList) this.d, 8));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da(tL_error, (d) this.f3837b, (org.telegram.ui.ActionBar.h3) this.f3838c, (Runnable) this.d));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ya((Object) ((hy0) this.f3837b), (String) this.f3838c, tL_error, tLObject, (Object) ((TextView) this.d), 19));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ya((Object) ((ty0) this.f3837b), tLObject, (Object) ((TLRPC.UserFull) this.f3838c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 20));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.f3837b, tL_error, (String) this.f3838c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.f3837b, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.d2) this.f3838c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ac0(tL_error, (Utilities.Callback) this.f3837b, tLObject, (MessagesController) this.f3838c, (Utilities.Callback) this.d, 21));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ac0(tL_error, (Utilities.Callback) ((org.telegram.messenger.v) this.f3837b), tLObject, (MessagesController) this.f3838c, (Utilities.Callback) ((org.telegram.messenger.k2) this.d), 22));
                return;
            case 17:
                sg.v vVar = (sg.v) this.f3837b;
                MessagesController messagesController = (MessagesController) this.f3838c;
                sg.y yVar = (sg.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(19, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new qg.q0(yVar, 11));
                    return;
                } else {
                    return;
                }
            case 18:
                AndroidUtilities.runOnUIThread(new ac0(tLObject, (MessagesController) this.f3837b, (gg.u1) this.f3838c, (sg.f) this.d, tL_error));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((sg.p1) this.f3837b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f3838c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 24));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) ((wh.y4) this.f3837b), tLObject, (Object) ((TLRPC.TL_inputStorePaymentGiftPremium) this.f3838c), tL_error, (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), 25));
                return;
            case 21:
                xh.x3.r0((xh.x3) this.f3837b, (nf.e) this.f3838c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 22:
                xh.x3.e1((xh.x3) this.f3837b, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.d2) this.f3838c, tLObject);
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((xh.v5) this.f3837b), tL_error, (Object) ((n80) this.f3838c), tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 28));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new xh.x4((xh.v5) this.f3837b, tL_error, (Utilities.Callback2) this.f3838c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((xh.v5) this.f3837b), tL_error, (Object) ((k6) this.f3838c), tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 27));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fy0((Object) ((zh.v2) this.f3837b), tLObject, (Object) ((TL_stories.StoryItem) this.f3838c), (Object) ((Utilities.Callback) this.d), 29));
                return;
        }
    }

    public wa(Object obj, Object obj2, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f3836a = i10;
        this.f3837b = obj;
        this.d = obj2;
        this.f3838c = d2Var;
    }
}
