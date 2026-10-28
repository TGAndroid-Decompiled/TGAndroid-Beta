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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.q01;
public final class h2 implements RequestDelegate {
    public final int f4714a;
    public final Object f4715b;
    public final Object f4716c;
    public final Object d;

    public h2(fi.g9 g9Var, org.telegram.ui.ActionBar.e2 e2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.f4714a = 6;
        this.f4715b = g9Var;
        this.d = e2Var;
        this.f4716c = getgroupcallstreamrtmpurl;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4714a) {
            case 0:
                h7.Q((h7) this.f4715b, (TLRPC.TL_messageActionStarGift) this.f4716c, (org.telegram.ui.ActionBar.e2) this.d, tLObject);
                return;
            case 1:
                h7.L0((h7) this.f4715b, (qf.c) this.f4716c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u0((Object) ((ca) this.f4715b), tL_error, (Object) ((lc) this.f4716c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new u0((Object) ((ca) this.f4715b), tL_error, (Object) ((Utilities.Callback2) this.f4716c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 6));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new u0((Object) ((ca) this.f4715b), tL_error, (Object) ((org.telegram.ui.Wallet.r1) this.f4716c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.e0((di.h4) this.f4715b, tLObject, (TL_stories.StoryItem) this.f4716c, (Utilities.Callback) this.d, 10));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new u0((Object) ((fi.g9) this.f4715b), (org.telegram.ui.ActionBar.e2) this.d, tLObject, (TLObject) ((TL_phone.getGroupCallStreamRtmpUrl) this.f4716c), (Object) tL_error, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.e0((fi.d) this.f4715b, tLObject, (org.telegram.ui.ActionBar.k3) this.f4716c, (hi.y1) this.d, 16));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.e0(tLObject, (boolean[]) this.f4715b, (org.telegram.ui.web.r) this.f4716c, (TLRPC.UserFull) this.d, 19));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.e0((jg.z) this.f4715b, tLObject, (TL_account.TL_businessChatLink) this.f4716c, (Runnable) this.d, 24));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.k0) this.f4715b, (TL_account.TL_connectedBot) this.f4716c, (TL_account.TL_businessBotRecipients) this.d, 28));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new u0((jg.c2) this.f4715b, tLObject, (ArrayList) this.f4716c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new m4.v0(tLObject, (org.telegram.ui.ActionBar.w6) this.f4715b, (org.telegram.ui.ActionBar.x6) this.f4716c, (TLRPC.TL_theme) this.d, 7));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new m4.v0((my) this.f4715b, (org.telegram.ui.ActionBar.e2[]) this.f4716c, tLObject, (org.telegram.ui.ActionBar.e3) this.d, 27));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new m4.v0((lz) this.f4715b, (TLRPC.TL_messages_getStickers) this.f4716c, tLObject, (Runnable) this.d, 28));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new kg((n10) this.f4715b, (org.telegram.ui.ActionBar.r2) this.f4716c, (ArrayList) this.d, 8));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new e10(tL_error, (fi.d) this.f4715b, (org.telegram.ui.s6) this.f4716c, (Runnable) this.d, 5));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new i30((dz0) this.f4715b, (String) this.f4716c, tL_error, tLObject, (TextView) this.d, 1));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new i30((oz0) this.f4715b, tLObject, (TLRPC.UserFull) this.f4716c, (TL_account.TL_birthday) this.d, tL_error, 2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.f4715b, tL_error, (String) this.f4716c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.f4715b, tLObject, (String[]) this.f4716c, tL_error, (org.telegram.ui.ActionBar.e2) this.d));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new q01(tL_error, (Utilities.Callback) this.f4715b, tLObject, (MessagesController) this.f4716c, (Utilities.Callback) this.d, 9));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new q01(tL_error, (org.telegram.messenger.z) this.f4715b, tLObject, (MessagesController) this.f4716c, (org.telegram.messenger.l2) this.d, 10));
                return;
            case 23:
                vg.v vVar = (vg.v) this.f4715b;
                MessagesController messagesController = (MessagesController) this.f4716c;
                vg.y yVar = (vg.y) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new s9.g(21, vVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ti.g(yVar, 7));
                    return;
                } else {
                    return;
                }
            case 24:
                AndroidUtilities.runOnUIThread(new q01(tLObject, (MessagesController) this.f4715b, (di.y2) this.f4716c, (vg.g) this.d, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new q01((vg.n1) this.f4715b, tLObject, (TLRPC.UserFull) this.f4716c, (TL_account.TL_birthday) this.d, tL_error, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q01((zh.y4) this.f4715b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f4716c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                return;
        }
    }

    public h2(Object obj, Object obj2, Object obj3, int i10) {
        this.f4714a = i10;
        this.f4715b = obj;
        this.f4716c = obj2;
        this.d = obj3;
    }
}
