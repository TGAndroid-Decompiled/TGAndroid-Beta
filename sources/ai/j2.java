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
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.k01;
public final class j2 implements RequestDelegate {
    public final int f1534a;
    public final Object f1535b;
    public final Object f1536c;
    public final Object d;

    public j2(ei.k9 k9Var, org.telegram.ui.ActionBar.c2 c2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.f1534a = 6;
        this.f1535b = k9Var;
        this.d = c2Var;
        this.f1536c = getgroupcallstreamrtmpurl;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1534a) {
            case 0:
                l7.Q((l7) this.f1535b, (TLRPC.TL_messageActionStarGift) this.f1536c, (org.telegram.ui.ActionBar.c2) this.d, tLObject);
                return;
            case 1:
                l7.L0((l7) this.f1535b, (pf.c) this.f1536c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ha) this.f1535b), tL_error, (Object) ((uc) this.f1536c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ha) this.f1535b), tL_error, (Object) ((Utilities.Callback2) this.f1536c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 6));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ha) this.f1535b), tL_error, (Object) ((org.telegram.ui.Wallet.r1) this.f1536c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y0((ci.g4) this.f1535b, tLObject, (TL_stories.StoryItem) this.f1536c, (Utilities.Callback) this.d, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ei.k9) this.f1535b), (org.telegram.ui.ActionBar.c2) this.d, tLObject, (TLObject) ((TL_phone.getGroupCallStreamRtmpUrl) this.f1536c), (Object) tL_error, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new y0((ei.d) this.f1535b, tLObject, (org.telegram.ui.ActionBar.h3) this.f1536c, (gi.r1) this.d, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new y0(tLObject, (boolean[]) this.f1535b, (org.telegram.ui.web.r) this.f1536c, (TLRPC.UserFull) this.d, 16));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new y0((ig.y) this.f1535b, tLObject, (TL_account.TL_businessChatLink) this.f1536c, (Runnable) this.d, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.j0) this.f1535b, (TL_account.TL_connectedBot) this.f1536c, (TL_account.TL_businessBotRecipients) this.d, 27));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((ig.z1) this.f1535b, tLObject, (ArrayList) this.f1536c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(tLObject, (org.telegram.ui.ActionBar.i6) this.f1535b, (org.telegram.ui.ActionBar.j6) this.f1536c, (TLRPC.TL_theme) this.d, 4));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((ny) this.f1535b, (org.telegram.ui.ActionBar.c2[]) this.f1536c, tLObject, (org.telegram.ui.ActionBar.b3) this.d, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((mz) this.f1535b, (TLRPC.TL_messages_getStickers) this.f1536c, tLObject, (Runnable) this.d));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new lg((Object) ((k10) this.f1535b), (Object) ((org.telegram.ui.ActionBar.o2) this.f1536c), (ArrayList) this.d, 7));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new j90(tL_error, (ei.d) this.f1535b, (org.telegram.ui.r6) this.f1536c, (Runnable) this.d));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new g30((ty0) this.f1535b, (String) this.f1536c, tL_error, tLObject, (TextView) this.d, 1));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new g30((ez0) this.f1535b, tLObject, (TLRPC.UserFull) this.f1536c, (TL_account.TL_birthday) this.d, tL_error, 2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.b1) this.f1535b, tL_error, (String) this.f1536c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.b1) this.f1535b, tLObject, (String[]) this.f1536c, tL_error, (org.telegram.ui.ActionBar.c2) this.d));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new k01(tL_error, (Utilities.Callback) this.f1535b, tLObject, (MessagesController) this.f1536c, (Utilities.Callback) this.d, 9));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new k01(tL_error, (org.telegram.messenger.w) this.f1535b, tLObject, (MessagesController) this.f1536c, (org.telegram.messenger.k2) this.d, 10));
                return;
            case 23:
                ug.t tVar = (ug.t) this.f1535b;
                MessagesController messagesController = (MessagesController) this.f1536c;
                ug.w wVar = (ug.w) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u2.k0(4, tVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new tg.p(wVar, 4));
                    return;
                } else {
                    return;
                }
            case 24:
                AndroidUtilities.runOnUIThread(new k01(tLObject, (MessagesController) this.f1535b, (ci.y2) this.f1536c, (ug.e) this.d, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new k01((ug.l1) this.f1535b, tLObject, (TLRPC.UserFull) this.f1536c, (TL_account.TL_birthday) this.d, tL_error, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k01((yh.x4) this.f1535b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f1536c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                return;
        }
    }

    public j2(Object obj, Object obj2, Object obj3, int i10) {
        this.f1534a = i10;
        this.f1535b = obj;
        this.f1536c = obj2;
        this.d = obj3;
    }
}
