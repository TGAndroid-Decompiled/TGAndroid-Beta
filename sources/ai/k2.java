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
public final class k2 implements RequestDelegate {
    public final int f1624a;
    public final Object f1625b;
    public final Object f1626c;
    public final Object d;

    public k2(ei.k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.f1624a = 6;
        this.f1625b = k9Var;
        this.d = b2Var;
        this.f1626c = getgroupcallstreamrtmpurl;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1624a) {
            case 0:
                k7.Z0((k7) this.f1625b, (TLRPC.TL_messageActionStarGift) this.f1626c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                return;
            case 1:
                k7.I0((k7) this.f1625b, (pf.c) this.f1626c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f1625b), tL_error, (Object) ((tc) this.f1626c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f1625b), tL_error, (Object) ((Utilities.Callback2) this.f1626c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 6));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) this.f1625b), tL_error, (Object) ((org.telegram.ui.Wallet.s1) this.f1626c), (Object) tLObject, (TLObject) ((TLRPC.TL_inputInvoiceStars) this.d), 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y0((ci.g4) this.f1625b, tLObject, (TL_stories.StoryItem) this.f1626c, (Utilities.Callback) this.d, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ei.k9) this.f1625b), (org.telegram.ui.ActionBar.b2) this.d, tLObject, (TLObject) ((TL_phone.getGroupCallStreamRtmpUrl) this.f1626c), (Object) tL_error, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new y0((ei.d) this.f1625b, tLObject, (org.telegram.ui.ActionBar.f3) this.f1626c, (gi.r1) this.d, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new y0(tLObject, (boolean[]) this.f1625b, (org.telegram.ui.web.s) this.f1626c, (TLRPC.UserFull) this.d, 16));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new y0((ig.y) this.f1625b, tLObject, (TL_account.TL_businessChatLink) this.f1626c, (Runnable) this.d, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.k0) this.f1625b, (TL_account.TL_connectedBot) this.f1626c, (TL_account.TL_businessBotRecipients) this.d, 27));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((ig.a2) this.f1625b, tLObject, (ArrayList) this.f1626c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(tLObject, (org.telegram.ui.ActionBar.f6) this.f1625b, (org.telegram.ui.ActionBar.g6) this.f1626c, (TLRPC.TL_theme) this.d, 4));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((ny) this.f1625b, (org.telegram.ui.ActionBar.b2[]) this.f1626c, tLObject, (org.telegram.ui.ActionBar.a3) this.d, 24));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((mz) this.f1625b, (TLRPC.TL_messages_getStickers) this.f1626c, tLObject, (Runnable) this.d));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new lg((Object) ((k10) this.f1625b), (Object) ((org.telegram.ui.ActionBar.n2) this.f1626c), (ArrayList) this.d, 7));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new i90(tL_error, (ei.d) this.f1625b, (org.telegram.ui.ActionBar.f3) this.f1626c, (Runnable) this.d));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new g30((oy0) this.f1625b, (String) this.f1626c, tL_error, tLObject, (TextView) this.d, 1));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new g30((zy0) this.f1625b, tLObject, (TLRPC.UserFull) this.f1626c, (TL_account.TL_birthday) this.d, tL_error, 2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.b1) this.f1625b, tL_error, (String) this.f1626c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.b1) this.f1625b, tLObject, (String[]) this.f1626c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new i01(tL_error, (Utilities.Callback) this.f1625b, tLObject, (MessagesController) this.f1626c, (Utilities.Callback) this.d, 11));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new i01(tL_error, (org.telegram.messenger.w) this.f1625b, tLObject, (MessagesController) this.f1626c, (org.telegram.messenger.j2) this.d, 12));
                return;
            case 23:
                ug.u uVar = (ug.u) this.f1625b;
                MessagesController messagesController = (MessagesController) this.f1626c;
                ug.x xVar = (ug.x) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u2.q0(3, uVar, tL_error));
                    return;
                } else if (tLObject != null) {
                    messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new tg.p(xVar, 4));
                    return;
                } else {
                    return;
                }
            case 24:
                AndroidUtilities.runOnUIThread(new i01(tLObject, (MessagesController) this.f1625b, (ci.y2) this.f1626c, (ug.f) this.d, tL_error, 13));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new i01((ug.m1) this.f1625b, tLObject, (TLRPC.UserFull) this.f1626c, (TL_account.TL_birthday) this.d, tL_error, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i01((yh.x4) this.f1625b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f1626c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 15));
                return;
        }
    }

    public k2(Object obj, Object obj2, Object obj3, int i10) {
        this.f1624a = i10;
        this.f1625b = obj;
        this.f1626c = obj2;
        this.d = obj3;
    }
}
