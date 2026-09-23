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
import org.telegram.ui.Components.ux0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aj;
import org.telegram.ui.d90;
import org.telegram.ui.in0;
import org.telegram.ui.jl0;
import org.telegram.ui.ks0;
import org.telegram.ui.lq;
import org.telegram.ui.mo;
import org.telegram.ui.qm0;
import org.telegram.ui.rg0;
import org.telegram.ui.sp;
import org.telegram.ui.u31;
import org.telegram.ui.ym0;
public final class p3 implements RequestDelegate {
    public final int f1385a;
    public final Object f1386b;
    public final Object f1387c;
    public final Object d;
    public final Object e;

    public p3(ci.l8 l8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, n8 n8Var) {
        this.f1385a = 1;
        this.f1387c = l8Var;
        this.f1386b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.e = n8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f1385a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f1386b;
        Object obj4 = this.f1387c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new m3((e6) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (ci.da) obj2));
                return;
            case 1:
                ci.l8 l8Var = (ci.l8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                n8 n8Var = (n8) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(l8Var.f4964a).requestReference(storyItem, tL_messages_getAttachedStickers, n8Var);
                    return;
                } else {
                    n8Var.run(tLObject, tL_error);
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new z8((gg.b1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2, 3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new m3((gg.e2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 6));
                return;
            case 4:
                org.telegram.ui.ob obVar = (org.telegram.ui.ob) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ub ubVar = obVar.f35756a.f36380n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (ubVar.f38043z0 == null) {
                            ubVar.f38043z0 = new HashMap();
                        }
                        ubVar.f38043z0.put(Long.valueOf(user.f18230id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new m3(obVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((sp) obj4), (Object) ((org.telegram.ui.ActionBar.b2[]) obj), (Object) ((TLRPC.Chat) obj3), (Object) ((org.telegram.ui.ActionBar.n2) obj2), 11));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((lq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                return;
            case 7:
                ux0.p((ks0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (mo) obj2, tLObject, tL_error);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new d90((Object) ((rg0) obj4), tL_error, (Object) ((String) obj), (Object) ((String) obj3), (Object) ((String) obj2), 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new z8((in0) obj4, tL_error, (String) obj, (ym0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new d90((Object) ((qm0) obj4), tL_error, (Object) ((jl0) obj), (Object) ((o0.a) obj3), (Object) ((TL_account.verifyEmail) obj2), 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new d90((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj), (Object) ((TLRPC.GlobalPrivacySettings) obj3), (Object) ((TL_account.setGlobalPrivacySettings) obj2), 16));
                return;
            case 12:
                u31 u31Var = (u31) obj4;
                u31Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(u31Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) obj4, tLObject, (da) obj, (String) obj3, (String) obj2));
                return;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                b1Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(b1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 13));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new z8((xh.r1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (xh.o0) obj3, (Utilities.Callback) obj2, tL_error, 15));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new z8((yh.y3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 16));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new z8((yh.y3) obj4, tLObject, (tg.n1[]) obj, (Long) obj3, (w9.v) obj2, tL_error, 17));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new z8((yh.t5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (aj) obj2, tL_error, 20));
                return;
            default:
                yh.k5 k5Var = (yh.k5) obj4;
                k5Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(k5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (yh.l5) obj3, (Utilities.Callback) obj2, tL_error, 22));
                return;
        }
    }

    public p3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1385a = i10;
        this.f1387c = obj;
        this.d = obj2;
        this.f1386b = obj3;
        this.e = obj4;
    }
}
