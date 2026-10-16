package bi;

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
import org.telegram.ui.Components.uy0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.an0;
import org.telegram.ui.aq;
import org.telegram.ui.gj;
import org.telegram.ui.i41;
import org.telegram.ui.in0;
import org.telegram.ui.l90;
import org.telegram.ui.sn0;
import org.telegram.ui.to;
import org.telegram.ui.tq;
import org.telegram.ui.xk0;
import org.telegram.ui.xs0;
public final class f3 implements RequestDelegate {
    public final int f3017a;
    public final Object f3018b;
    public final Object f3019c;
    public final Object d;
    public final Object e;

    public f3(di.k8 k8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, z7 z7Var) {
        this.f3017a = 1;
        this.f3019c = k8Var;
        this.f3018b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.e = z7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f3017a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f3018b;
        Object obj4 = this.f3019c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new c3((q5) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (di.ca) obj2));
                return;
            case 1:
                di.k8 k8Var = (di.k8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                z7 z7Var = (z7) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(k8Var.f7175a).requestReference(storyItem, tL_messages_getAttachedStickers, z7Var);
                    return;
                } else {
                    z7Var.run(tLObject, tL_error);
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new k8((hg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2, 3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c3((hg.c2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 6));
                return;
            case 4:
                org.telegram.ui.ub ubVar = (org.telegram.ui.ub) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                org.telegram.ui.ac acVar = ubVar.f40360a.f40914n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (acVar.f33868z0 == null) {
                            acVar.f33868z0 = new HashMap();
                        }
                        acVar.f33868z0.put(Long.valueOf(user.f19063id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new c3(ubVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, a2Var, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((aq) obj4, (org.telegram.ui.ActionBar.a2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.m2) obj2, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c3((tq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                return;
            case 7:
                uy0.r((xs0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (to) obj2, tLObject, tL_error);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ah0) obj4), tL_error, (Object) ((String) obj), (Object) ((String) obj3), (Object) ((String) obj2), 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new k8((sn0) obj4, tL_error, (String) obj, (in0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new l90((Object) ((an0) obj4), tL_error, (Object) ((xk0) obj), (Object) ((m2.t) obj3), (Object) ((TL_account.verifyEmail) obj2), 12));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new l90((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj), (Object) ((TLRPC.GlobalPrivacySettings) obj3), (Object) ((TL_account.setGlobalPrivacySettings) obj2), 16));
                return;
            case 12:
                i41 i41Var = (i41) obj4;
                i41Var.getClass();
                AndroidUtilities.runOnUIThread(new k8(i41Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) obj4, tLObject, (n9) obj, (String) obj3, (String) obj2));
                return;
            case 14:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new k8(c1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 18));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new k8((yh.p1) obj4, (org.telegram.ui.ActionBar.a2) obj, tLObject, (rg.g2) obj3, (Utilities.Callback) obj2, tL_error, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new k8((zh.r3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 21));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new k8((zh.r3) obj4, tLObject, (ug.m1[]) obj, (Long) obj3, (pi.g) obj2, tL_error, 22));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((zh.n5) obj4, (org.telegram.ui.ActionBar.a2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2, 11));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new k8((zh.n5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (gj) obj2, tL_error, 25));
                return;
            default:
                zh.e5 e5Var = (zh.e5) obj4;
                e5Var.getClass();
                AndroidUtilities.runOnUIThread(new k8(e5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (zh.f5) obj3, (Utilities.Callback) obj2, tL_error, 27));
                return;
        }
    }

    public f3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3017a = i10;
        this.f3019c = obj;
        this.d = obj2;
        this.f3018b = obj3;
        this.e = obj4;
    }
}
