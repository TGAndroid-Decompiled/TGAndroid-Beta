package ai;

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
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.py0;
import org.telegram.ui.g01;
public final class g2 implements RequestDelegate {
    public final int f1326a;
    public final Object f1327b;
    public final Object f1328c;
    public final Object d;

    public g2(ei.k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.f1326a = 6;
        this.f1327b = k9Var;
        this.d = b2Var;
        this.f1328c = getgroupcallstreamrtmpurl;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1326a) {
            case 0:
                k7.S0((k7) this.f1327b, (TLRPC.TL_messageActionStarGift) this.f1328c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 1:
                k7.G0((k7) this.f1327b, (pf.c) this.f1328c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f1327b), tL_error, (Object) ((tc) this.f1328c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f1327b), tL_error, (Object) ((Utilities.Callback2) this.f1328c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 6));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f1327b), tL_error, (Object) ((org.telegram.ui.Wallet.s1) this.f1328c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y0((ci.h4) this.f1327b, tLObject, (TL_stories.StoryItem) this.f1328c, (Utilities.Callback) this.d, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ei.k9) this.f1327b), (org.telegram.ui.ActionBar.b2) this.d, tLObject, (TLObject) ((TL_phone.getGroupCallStreamRtmpUrl) this.f1328c), (Object) tL_error, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new y0((ei.d) this.f1327b, tLObject, (org.telegram.ui.ActionBar.f3) this.f1328c, (gi.r1) this.d, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new y0(tLObject, (boolean[]) this.f1327b, (org.telegram.ui.web.r) this.f1328c, (TLRPC.UserFull) this.d, 16));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new y0((ig.y) this.f1327b, tLObject, (TL_account.TL_businessChatLink) this.f1328c, (Runnable) this.d, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.k0) this.f1327b, (TL_account.TL_connectedBot) this.f1328c, (TL_account.TL_businessBotRecipients) this.d, 27));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((ig.a2) this.f1327b, tLObject, (ArrayList) this.f1328c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(tLObject, (org.telegram.ui.ActionBar.f6) this.f1327b, (org.telegram.ui.ActionBar.g6) this.f1328c, (TLRPC.TL_theme) this.d, 4));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((ny) this.f1327b, (org.telegram.ui.ActionBar.b2[]) this.f1328c, tLObject, (org.telegram.ui.ActionBar.a3) this.d, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((mz) this.f1327b, (TLRPC.TL_messages_getStickers) this.f1328c, tLObject, (Runnable) this.d));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new lg((Object) ((k10) this.f1327b), (Object) ((org.telegram.ui.ActionBar.n2) this.f1328c), (ArrayList) this.d, 7));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new i90(tL_error, (ei.d) this.f1327b, (org.telegram.ui.ActionBar.f3) this.f1328c, (Runnable) this.d));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new g30((py0) this.f1327b, (String) this.f1328c, tL_error, tLObject, (TextView) this.d, 1));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new g30((az0) this.f1327b, tLObject, (TLRPC.UserFull) this.f1328c, (TL_account.TL_birthday) this.d, tL_error, 2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.f1327b, tL_error, (String) this.f1328c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.f1327b, tLObject, (String[]) this.f1328c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new g01(tL_error, (Utilities.Callback) this.f1327b, tLObject, (MessagesController) this.f1328c, (Utilities.Callback) this.d, 9));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new g01(tL_error, (org.telegram.messenger.w) this.f1327b, tLObject, (MessagesController) this.f1328c, (org.telegram.messenger.j2) this.d, 10));
                return;
            case 23:
                ug.u uVar = (ug.u) this.f1327b;
                MessagesController messagesController = (MessagesController) this.f1328c;
                ug.x xVar = (ug.x) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uf.c(2, uVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new tg.p(xVar, 4));
                    return;
                } else {
                    return;
                }
            case 24:
                AndroidUtilities.runOnUIThread(new g01(tLObject, (MessagesController) this.f1327b, (ci.z2) this.f1328c, (ug.f) this.d, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new g01((ug.m1) this.f1327b, tLObject, (TLRPC.UserFull) this.f1328c, (TL_account.TL_birthday) this.d, tL_error, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g01((yh.x4) this.f1327b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f1328c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                return;
        }
    }

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f1326a = i10;
        this.f1327b = obj;
        this.f1328c = obj2;
        this.d = obj3;
    }
}
