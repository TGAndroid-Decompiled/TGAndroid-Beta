package ai;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c41;
import org.telegram.ui.cj;
import org.telegram.ui.dn0;
import org.telegram.ui.g90;
import org.telegram.ui.nn0;
import org.telegram.ui.nq;
import org.telegram.ui.oo;
import org.telegram.ui.rs0;
import org.telegram.ui.tk0;
import org.telegram.ui.up;
import org.telegram.ui.vm0;
import org.telegram.ui.wg0;
public final class q3 implements RequestDelegate {
    public final int f1610a;
    public final Object f1611b;
    public final Object f1612c;
    public final Object d;
    public final Object f1613e;

    public q3(ci.l8 l8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, o8 o8Var) {
        this.f1610a = 1;
        this.f1612c = l8Var;
        this.f1611b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.f1613e = o8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f1610a;
        Object obj = this.d;
        Object obj2 = this.f1613e;
        Object obj3 = this.f1611b;
        Object obj4 = this.f1612c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new n3((f6) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (ci.da) obj2));
                return;
            case 1:
                ci.l8 l8Var = (ci.l8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                o8 o8Var = (o8) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(l8Var.f5394a).requestReference(storyItem, tL_messages_getAttachedStickers, o8Var);
                    return;
                } else {
                    o8Var.run(tLObject, tL_error);
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new a9((gg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2, 3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new n3((gg.d2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 6));
                return;
            case 4:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.vb vbVar = pbVar.f40802a.f41412n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (vbVar.f42847z0 == null) {
                            vbVar.f42847z0 = new HashMap();
                        }
                        vbVar.f42847z0.put(Long.valueOf(user.f20189id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new n3(pbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((up) obj4, (org.telegram.ui.ActionBar.b2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.n2) obj2, 12));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n3((nq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                return;
            case 7:
                yy0.r((rs0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (oo) obj2, tLObject, tL_error);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new g90((Object) ((wg0) obj4), tL_error, (Object) ((String) obj), (Object) ((String) obj3), (Object) ((String) obj2), 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a9((nn0) obj4, tL_error, (String) obj, (dn0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new g90((Object) ((vm0) obj4), tL_error, (Object) ((tk0) obj), (Object) ((org.telegram.ui.ActionBar.b5) obj3), (Object) ((TL_account.verifyEmail) obj2), 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new g90((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj), (Object) ((TLRPC.GlobalPrivacySettings) obj3), (Object) ((TL_account.setGlobalPrivacySettings) obj2), 16));
                return;
            case 12:
                c41 c41Var = (c41) obj4;
                c41Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(c41Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) obj4, tLObject, (ea) obj, (String) obj3, (String) obj2));
                return;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                b1Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(b1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 18));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new a9((xh.r1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (qg.f2) obj3, (Utilities.Callback) obj2, tL_error, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new a9((yh.s3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 21));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new a9((yh.s3) obj4, tLObject, (tg.m1[]) obj, (Long) obj3, (tg.q) obj2, tL_error, 22));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.r6((yh.m5) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2, 11));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new a9((yh.m5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (cj) obj2, tL_error, 25));
                return;
            default:
                yh.d5 d5Var = (yh.d5) obj4;
                d5Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(d5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (yh.e5) obj3, (Utilities.Callback) obj2, tL_error, 27));
                return;
        }
    }

    public q3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1610a = i10;
        this.f1612c = obj;
        this.d = obj2;
        this.f1611b = obj3;
        this.f1613e = obj4;
    }
}
