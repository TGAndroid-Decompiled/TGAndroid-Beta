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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an0;
import org.telegram.ui.gs0;
import org.telegram.ui.hi1;
import org.telegram.ui.ig0;
import org.telegram.ui.iq;
import org.telegram.ui.kn0;
import org.telegram.ui.nj0;
import org.telegram.ui.pp;
import org.telegram.ui.sm0;
import org.telegram.ui.x21;
import org.telegram.ui.xi;
public final class i2 implements RequestDelegate {
    public final int f4819a;
    public final Object f4820b;
    public final Object f4821c;
    public final Object d;
    public final Object e;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4819a = i10;
        this.f4820b = obj;
        this.f4821c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f4819a;
        Object obj = this.f4821c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f4820b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new c3((h7) obj4, tLObject, (vg.n1[]) obj, (Long) obj3, (a3.l0) obj2, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((h7) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u0((Object) ((ca) obj4), (org.telegram.ui.ActionBar.e2) obj, tLObject, (TLObject) ((TL_stars.InputSavedStarGift) obj3), (Object) ((Utilities.Callback) obj2), 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c3((ca) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (xi) obj2, tL_error, 4));
                return;
            case 4:
                q9 q9Var = (q9) obj4;
                q9Var.getClass();
                AndroidUtilities.runOnUIThread(new c3(q9Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (t9) obj3, (Utilities.Callback) obj2, tL_error, 6));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new u0((Object) ((di.q4) obj4), (Object) ((Runnable) obj), tL_error, (TLObject) ((TL_stories.StoryItem) obj3), (Object) ((fi.l9) obj2), 9));
                return;
            case 6:
                fi.w7 w7Var = (fi.w7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                i0 i0Var = (i0) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(w7Var.f11887a).requestReference(storyItem, tL_messages_getAttachedStickers, i0Var);
                    return;
                } else {
                    i0Var.run(tLObject, tL_error);
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new c3((ig.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new u0((ig.b2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 14));
                return;
            case 9:
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.wb wbVar = qbVar.f42661a.f43288n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (wbVar.f44620z0 == null) {
                            wbVar.f44620z0 = new HashMap();
                        }
                        wbVar.f44620z0.put(Long.valueOf(user.f22177id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new u0(qbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, e2Var));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new m4.v0((pp) obj4, (org.telegram.ui.ActionBar.e2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.r2) obj2, 18));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new u0((Object) ((iq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 28));
                return;
            case 12:
                dz0.q((gs0) obj4, this.f4821c, (TLRPC.TL_messages_getAttachedStickers) obj3, (org.telegram.ui.z7) obj2, tLObject, tL_error);
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new i30((ig0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new c3((kn0) obj4, tL_error, (String) obj, (an0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new i30((sm0) obj4, tL_error, (nj0) obj, (m4.w1) obj3, (TL_account.verifyEmail) obj2, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new i30((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                return;
            case 17:
                x21 x21Var = (x21) obj4;
                x21Var.getClass();
                AndroidUtilities.runOnUIThread(new c3(x21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) obj4, tLObject, (di.x7) obj, (String) obj3, (String) obj2));
                return;
            case 19:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                a1Var.getClass();
                AndroidUtilities.runOnUIThread(new c3(a1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c3((zh.p1) obj4, (org.telegram.ui.ActionBar.e2) obj, tLObject, (hi1) obj3, (Utilities.Callback) obj2, tL_error));
                return;
        }
    }
}
