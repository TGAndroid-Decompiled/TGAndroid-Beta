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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e41;
import org.telegram.ui.fn0;
import org.telegram.ui.gj;
import org.telegram.ui.i90;
import org.telegram.ui.pn0;
import org.telegram.ui.qq;
import org.telegram.ui.so;
import org.telegram.ui.ts0;
import org.telegram.ui.uk0;
import org.telegram.ui.xg0;
import org.telegram.ui.xm0;
import org.telegram.ui.xp;
public final class q3 implements RequestDelegate {
    public final int f1608a;
    public final Object f1609b;
    public final Object f1610c;
    public final Object d;
    public final Object f1611e;

    public q3(ci.l8 l8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, o8 o8Var) {
        this.f1608a = 1;
        this.f1610c = l8Var;
        this.f1609b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.f1611e = o8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f1608a;
        Object obj = this.d;
        Object obj2 = this.f1611e;
        Object obj3 = this.f1609b;
        Object obj4 = this.f1610c;
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
                    FileRefController.getInstance(l8Var.f5392a).requestReference(storyItem, tL_messages_getAttachedStickers, o8Var);
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
                org.telegram.ui.sb sbVar = (org.telegram.ui.sb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                org.telegram.ui.yb ybVar = sbVar.f41889a.f42481n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (ybVar.f44445z0 == null) {
                            ybVar.f44445z0 = new HashMap();
                        }
                        ybVar.f44445z0.put(Long.valueOf(user.f19950id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new n3(sbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, a2Var, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((xp) obj4), (Object) ((org.telegram.ui.ActionBar.a2[]) obj), (Object) ((TLRPC.Chat) obj3), (Object) ((org.telegram.ui.ActionBar.m2) obj2), 11));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n3((qq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                return;
            case 7:
                dz0.r((ts0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (so) obj2, tLObject, tL_error);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new i90((Object) ((xg0) obj4), tL_error, (Object) ((String) obj), (Object) ((String) obj3), (Object) ((String) obj2), 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a9((pn0) obj4, tL_error, (String) obj, (fn0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new i90((Object) ((xm0) obj4), tL_error, (Object) ((uk0) obj), (Object) ((n7.z0) obj3), (Object) ((TL_account.verifyEmail) obj2), 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new i90((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj), (Object) ((TLRPC.GlobalPrivacySettings) obj3), (Object) ((TL_account.setGlobalPrivacySettings) obj2), 16));
                return;
            case 12:
                e41 e41Var = (e41) obj4;
                e41Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(e41Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
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
                AndroidUtilities.runOnUIThread(new a9((xh.q1) obj4, (org.telegram.ui.ActionBar.a2) obj, tLObject, (qg.f2) obj3, (Utilities.Callback) obj2, tL_error, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new a9((yh.s3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 21));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new a9((yh.s3) obj4, tLObject, (tg.m1[]) obj, (Long) obj3, (pi.i) obj2, tL_error, 22));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6((yh.n5) obj4, (org.telegram.ui.ActionBar.a2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2, 11));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new a9((yh.n5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (gj) obj2, tL_error, 25));
                return;
            default:
                yh.e5 e5Var = (yh.e5) obj4;
                e5Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(e5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (yh.f5) obj3, (Utilities.Callback) obj2, tL_error, 27));
                return;
        }
    }

    public q3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1608a = i10;
        this.f1610c = obj;
        this.d = obj2;
        this.f1609b = obj3;
        this.f1611e = obj4;
    }
}
