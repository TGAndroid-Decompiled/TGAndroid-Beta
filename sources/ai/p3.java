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
import org.telegram.ui.Components.qy0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an0;
import org.telegram.ui.bj;
import org.telegram.ui.f90;
import org.telegram.ui.kn0;
import org.telegram.ui.mq;
import org.telegram.ui.ms0;
import org.telegram.ui.nl0;
import org.telegram.ui.no;
import org.telegram.ui.sm0;
import org.telegram.ui.tp;
import org.telegram.ui.ug0;
import org.telegram.ui.v31;
public final class p3 implements RequestDelegate {
    public final int f1501a;
    public final Object f1502b;
    public final Object f1503c;
    public final Object d;
    public final Object f1504e;

    public p3(ci.k8 k8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, n8 n8Var) {
        this.f1501a = 1;
        this.f1503c = k8Var;
        this.f1502b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.f1504e = n8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f1501a;
        Object obj = this.d;
        Object obj2 = this.f1504e;
        Object obj3 = this.f1502b;
        Object obj4 = this.f1503c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new m3((e6) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (ci.ca) obj2));
                return;
            case 1:
                ci.k8 k8Var = (ci.k8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                n8 n8Var = (n8) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(k8Var.f5309a).requestReference(storyItem, tL_messages_getAttachedStickers, n8Var);
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
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.wb wbVar = qbVar.f39685a.f40441n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (wbVar.f42048z0 == null) {
                            wbVar.f42048z0 = new HashMap();
                        }
                        wbVar.f42048z0.put(Long.valueOf(user.f20184id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new m3(qbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((tp) obj4), (Object) ((org.telegram.ui.ActionBar.b2[]) obj), (Object) ((TLRPC.Chat) obj3), (Object) ((org.telegram.ui.ActionBar.n2) obj2), 11));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((mq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                return;
            case 7:
                qy0.p((ms0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (no) obj2, tLObject, tL_error);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new f90((Object) ((ug0) obj4), tL_error, (Object) ((String) obj), (Object) ((String) obj3), (Object) ((String) obj2), 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new z8((kn0) obj4, tL_error, (String) obj, (an0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new f90((Object) ((sm0) obj4), tL_error, (Object) ((nl0) obj), (Object) ((o0.a) obj3), (Object) ((TL_account.verifyEmail) obj2), 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f90((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj), (Object) ((TLRPC.GlobalPrivacySettings) obj3), (Object) ((TL_account.setGlobalPrivacySettings) obj2), 16));
                return;
            case 12:
                v31 v31Var = (v31) obj4;
                v31Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(v31Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) obj4, tLObject, (da) obj, (String) obj3, (String) obj2));
                return;
            case 14:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(c1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 13));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new z8((xh.q1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (xh.o0) obj3, (Utilities.Callback) obj2, tL_error, 15));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new z8((yh.x3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 16));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new z8((yh.x3) obj4, tLObject, (tg.m1[]) obj, (Long) obj3, (tg.q) obj2, tL_error, 17));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new z8((yh.t5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (bj) obj2, tL_error, 20));
                return;
            default:
                yh.j5 j5Var = (yh.j5) obj4;
                j5Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(j5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (yh.k5) obj3, (Utilities.Callback) obj2, tL_error, 22));
                return;
        }
    }

    public p3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1501a = i10;
        this.f1503c = obj;
        this.d = obj2;
        this.f1502b = obj3;
        this.f1504e = obj4;
    }
}
