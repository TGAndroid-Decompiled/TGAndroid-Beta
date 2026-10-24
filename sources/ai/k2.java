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
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.dq;
import org.telegram.ui.hg0;
import org.telegram.ui.hm0;
import org.telegram.ui.kp;
import org.telegram.ui.nj0;
import org.telegram.ui.pm0;
import org.telegram.ui.r21;
import org.telegram.ui.ti;
import org.telegram.ui.zm0;
import org.telegram.ui.zr0;
public final class k2 implements RequestDelegate {
    public final int f1608a;
    public final Object f1609b;
    public final Object f1610c;
    public final Object d;
    public final Object e;

    public k2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1608a = i10;
        this.f1609b = obj;
        this.f1610c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f1608a;
        Object obj = this.f1610c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f1609b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3((l7) obj4, tLObject, (ug.l1[]) obj, (Long) obj3, (a3.l0) obj2, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3((l7) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ha) obj4), (org.telegram.ui.ActionBar.c2) obj, tLObject, (TLObject) ((TL_stars.InputSavedStarGift) obj3), (Object) ((Utilities.Callback) obj2), 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g3((ha) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (ti) obj2, tL_error, 4));
                return;
            case 4:
                v9 v9Var = (v9) obj4;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new g3(v9Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (y9) obj3, (Utilities.Callback) obj2, tL_error, 6));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ci.p4) obj4), (Object) ((Runnable) obj), tL_error, (TLObject) ((TL_stories.StoryItem) obj3), (Object) ((ei.p9) obj2), 9));
                return;
            case 6:
                ei.a8 a8Var = (ei.a8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                h hVar = (h) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(a8Var.f8703a).requestReference(storyItem, tL_messages_getAttachedStickers, hVar);
                    return;
                } else {
                    hVar.run(tLObject, tL_error);
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new g3((hg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new t0((hg.c2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 14));
                return;
            case 9:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                org.telegram.ui.vb vbVar = pbVar.f40425a.f41085n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (vbVar.f42680z0 == null) {
                            vbVar.f42680z0 = new HashMap();
                        }
                        vbVar.f42680z0.put(Long.valueOf(user.f20491id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new t0(pbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, c2Var));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((kp) obj4, (org.telegram.ui.ActionBar.c2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.o2) obj2, 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((Object) ((dq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 28));
                return;
            case 12:
                sy0.r((zr0) obj4, this.f1610c, (TLRPC.TL_messages_getAttachedStickers) obj3, (org.telegram.ui.vc) obj2, tLObject, tL_error);
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new e30((hg0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new g3((zm0) obj4, tL_error, (String) obj, (pm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new e30((hm0) obj4, tL_error, (nj0) obj, (n2.e) obj3, (TL_account.verifyEmail) obj2, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new e30((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                return;
            case 17:
                r21 r21Var = (r21) obj4;
                r21Var.getClass();
                AndroidUtilities.runOnUIThread(new g3(r21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.b1) obj4, tLObject, (ci.y7) obj, (String) obj3, (String) obj2));
                return;
            case 19:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                b1Var.getClass();
                AndroidUtilities.runOnUIThread(new g3(b1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g3((yh.o1) obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (ci1) obj3, (Utilities.Callback) obj2, tL_error));
                return;
        }
    }
}
