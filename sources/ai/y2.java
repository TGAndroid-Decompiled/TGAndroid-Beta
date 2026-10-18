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
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dq;
import org.telegram.ui.ek0;
import org.telegram.ui.fg0;
import org.telegram.ui.gm0;
import org.telegram.ui.kp;
import org.telegram.ui.om0;
import org.telegram.ui.q21;
import org.telegram.ui.vi;
import org.telegram.ui.xm0;
import org.telegram.ui.yh1;
import org.telegram.ui.zr0;
public final class y2 implements RequestDelegate {
    public final int f2469a;
    public final Object f2470b;
    public final Object f2471c;
    public final Object d;
    public final Object e;

    public y2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2469a = i10;
        this.f2470b = obj;
        this.f2471c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f2469a;
        Object obj = this.f2471c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2470b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new l3((k7) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l3((k7) obj4, tLObject, (ug.m1[]) obj, (Long) obj3, (a3.l0) obj2, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) obj4), (org.telegram.ui.ActionBar.b2) obj, tLObject, (TLObject) ((TL_stars.InputSavedStarGift) obj3), (Object) ((Utilities.Callback) obj2), 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new l3((ga) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (vi) obj2, tL_error, 4));
                return;
            case 4:
                v9 v9Var = (v9) obj4;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new l3(v9Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (y9) obj3, (Utilities.Callback) obj2, tL_error, 6));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ci.q4) obj4), (Object) ((Runnable) obj), tL_error, (TLObject) ((TL_stories.StoryItem) obj3), (Object) ((ei.p9) obj2), 9));
                return;
            case 6:
                ei.a8 a8Var = (ei.a8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                h hVar = (h) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(a8Var.f8697a).requestReference(storyItem, tL_messages_getAttachedStickers, hVar);
                    return;
                } else {
                    hVar.run(tLObject, tL_error);
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new l3((hg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new t0((hg.c2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 14));
                return;
            case 9:
                org.telegram.ui.rb rbVar = (org.telegram.ui.rb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.xb xbVar = rbVar.f40709a.f41668n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (xbVar.f43096z0 == null) {
                            xbVar.f43096z0 = new HashMap();
                        }
                        xbVar.f43096z0.put(Long.valueOf(user.f20426id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new t0(rbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((kp) obj4, (org.telegram.ui.ActionBar.b2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.n2) obj2, 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((Object) ((dq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 28));
                return;
            case 12:
                oy0.q((zr0) obj4, this.f2471c, (TLRPC.TL_messages_getAttachedStickers) obj3, (org.telegram.ui.xc) obj2, tLObject, tL_error);
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new g30((fg0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new l3((xm0) obj4, tL_error, (String) obj, (om0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new g30((gm0) obj4, tL_error, (ek0) obj, (mi.q) obj3, (TL_account.verifyEmail) obj2, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new g30((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                return;
            case 17:
                q21 q21Var = (q21) obj4;
                q21Var.getClass();
                AndroidUtilities.runOnUIThread(new l3(q21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) obj4, tLObject, (ci.z7) obj, (String) obj3, (String) obj2));
                return;
            case 19:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                a1Var.getClass();
                AndroidUtilities.runOnUIThread(new l3(a1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l3((yh.p1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (yh1) obj3, (Utilities.Callback) obj2, tL_error));
                return;
        }
    }
}
