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
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.i01;
public final class q2 implements RequestDelegate {
    public final int f2050a;
    public final Object f2051b;
    public final Object f2052c;
    public final Object d;

    public q2(ei.k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.f2050a = 6;
        this.f2051b = k9Var;
        this.d = b2Var;
        this.f2052c = getgroupcallstreamrtmpurl;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2050a) {
            case 0:
                k7.b1((k7) this.f2051b, (TLRPC.TL_messageActionStarGift) this.f2052c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 1:
                k7.L0((k7) this.f2051b, (pf.c) this.f2052c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f2051b), tL_error, (Object) ((tc) this.f2052c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f2051b), tL_error, (Object) ((Utilities.Callback2) this.f2052c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 6));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f2051b), tL_error, (Object) ((org.telegram.ui.Wallet.s1) this.f2052c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y0((ci.h4) this.f2051b, tLObject, (TL_stories.StoryItem) this.f2052c, (Utilities.Callback) this.d, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ei.k9) this.f2051b), (org.telegram.ui.ActionBar.b2) this.d, tLObject, (TLObject) ((TL_phone.getGroupCallStreamRtmpUrl) this.f2052c), (Object) tL_error, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new y0((ei.d) this.f2051b, tLObject, (org.telegram.ui.ActionBar.f3) this.f2052c, (gi.r1) this.d, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new y0(tLObject, (boolean[]) this.f2051b, (org.telegram.ui.web.r) this.f2052c, (TLRPC.UserFull) this.d, 16));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new y0((ig.y) this.f2051b, tLObject, (TL_account.TL_businessChatLink) this.f2052c, (Runnable) this.d, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.k0) this.f2051b, (TL_account.TL_connectedBot) this.f2052c, (TL_account.TL_businessBotRecipients) this.d, 27));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((ig.a2) this.f2051b, tLObject, (ArrayList) this.f2052c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(tLObject, (org.telegram.ui.ActionBar.f6) this.f2051b, (org.telegram.ui.ActionBar.g6) this.f2052c, (TLRPC.TL_theme) this.d, 4));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((ny) this.f2051b, (org.telegram.ui.ActionBar.b2[]) this.f2052c, tLObject, (org.telegram.ui.ActionBar.a3) this.d, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((mz) this.f2051b, (TLRPC.TL_messages_getStickers) this.f2052c, tLObject, (Runnable) this.d));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new lg((Object) ((k10) this.f2051b), (Object) ((org.telegram.ui.ActionBar.n2) this.f2052c), (ArrayList) this.d, 7));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new i90(tL_error, (ei.d) this.f2051b, (org.telegram.ui.ActionBar.f3) this.f2052c, (Runnable) this.d));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new g30((oy0) this.f2051b, (String) this.f2052c, tL_error, tLObject, (TextView) this.d, 1));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new g30((zy0) this.f2051b, tLObject, (TLRPC.UserFull) this.f2052c, (TL_account.TL_birthday) this.d, tL_error, 2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.f2051b, tL_error, (String) this.f2052c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.f2051b, tLObject, (String[]) this.f2052c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new i01(tL_error, (Utilities.Callback) this.f2051b, tLObject, (MessagesController) this.f2052c, (Utilities.Callback) this.d, 9));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new i01(tL_error, (org.telegram.messenger.w) this.f2051b, tLObject, (MessagesController) this.f2052c, (org.telegram.messenger.j2) this.d, 10));
                return;
            case 23:
                ug.u uVar = (ug.u) this.f2051b;
                MessagesController messagesController = (MessagesController) this.f2052c;
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
                AndroidUtilities.runOnUIThread(new i01(tLObject, (MessagesController) this.f2051b, (ci.z2) this.f2052c, (ug.f) this.d, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new i01((ug.m1) this.f2051b, tLObject, (TLRPC.UserFull) this.f2052c, (TL_account.TL_birthday) this.d, tL_error, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i01((yh.y4) this.f2051b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f2052c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                return;
        }
    }

    public q2(Object obj, Object obj2, Object obj3, int i10) {
        this.f2050a = i10;
        this.f2051b = obj;
        this.f2052c = obj2;
        this.d = obj3;
    }
}
