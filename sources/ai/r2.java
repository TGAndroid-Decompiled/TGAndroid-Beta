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
import org.telegram.ui.Components.py0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bq;
import org.telegram.ui.cg0;
import org.telegram.ui.ck0;
import org.telegram.ui.em0;
import org.telegram.ui.ip;
import org.telegram.ui.mm0;
import org.telegram.ui.o21;
import org.telegram.ui.ti;
import org.telegram.ui.vm0;
import org.telegram.ui.wh1;
import org.telegram.ui.xr0;
public final class r2 implements RequestDelegate {
    public final int f2094a;
    public final Object f2095b;
    public final Object f2096c;
    public final Object d;
    public final Object e;

    public r2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2094a = i10;
        this.f2095b = obj;
        this.f2096c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f2094a;
        Object obj = this.f2096c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2095b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new n3((k7) obj4, tLObject, (ug.m1[]) obj, (Long) obj3, (a3.l0) obj2, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n3((k7) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t0((Object) ((ga) obj4), (org.telegram.ui.ActionBar.b2) obj, tLObject, (TLObject) ((TL_stars.InputSavedStarGift) obj3), (Object) ((Utilities.Callback) obj2), 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new n3((ga) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (ti) obj2, tL_error, 4));
                return;
            case 4:
                v9 v9Var = (v9) obj4;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new n3(v9Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (y9) obj3, (Utilities.Callback) obj2, tL_error, 6));
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
                    FileRefController.getInstance(a8Var.f8696a).requestReference(storyItem, tL_messages_getAttachedStickers, hVar);
                    return;
                } else {
                    hVar.run(tLObject, tL_error);
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new n3((hg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new t0((hg.c2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 14));
                return;
            case 9:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.vb vbVar = pbVar.f40177a.f41113n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (vbVar.f42189z0 == null) {
                            vbVar.f42189z0 = new HashMap();
                        }
                        vbVar.f42189z0.put(Long.valueOf(user.f20422id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new t0(pbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((ip) obj4, (org.telegram.ui.ActionBar.b2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.n2) obj2, 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((Object) ((bq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 28));
                return;
            case 12:
                py0.q((xr0) obj4, this.f2096c, (TLRPC.TL_messages_getAttachedStickers) obj3, (org.telegram.ui.vc) obj2, tLObject, tL_error);
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new g30((cg0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new n3((vm0) obj4, tL_error, (String) obj, (mm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new g30((em0) obj4, tL_error, (ck0) obj, (mi.q) obj3, (TL_account.verifyEmail) obj2, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new g30((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                return;
            case 17:
                o21 o21Var = (o21) obj4;
                o21Var.getClass();
                AndroidUtilities.runOnUIThread(new n3(o21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) obj4, tLObject, (ci.z7) obj, (String) obj3, (String) obj2));
                return;
            case 19:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                a1Var.getClass();
                AndroidUtilities.runOnUIThread(new n3(a1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n3((yh.o1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (wh1) obj3, (Utilities.Callback) obj2, tL_error));
                return;
        }
    }
}
