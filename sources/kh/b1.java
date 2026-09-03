package kh;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import lh.j7;
import lh.l7;
import lh.t7;
import n7.qa;
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
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bj;
import org.telegram.ui.cs0;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.kh;
import org.telegram.ui.lq;
import org.telegram.ui.nm0;
import org.telegram.ui.no;
import org.telegram.ui.ob;
import org.telegram.ui.pg0;
import org.telegram.ui.q31;
import org.telegram.ui.sp;
import org.telegram.ui.ub;
import org.telegram.ui.vm0;
import org.telegram.ui.z61;
import ph.c8;
import ph.t6;
public final class b1 implements RequestDelegate {
    public final int f10601a;
    public final Object f10602b;
    public final Object f10603c;
    public final Object d;
    public final Object e;

    public b1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10601a = i10;
        this.f10602b = obj;
        this.f10603c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f10601a;
        Object obj = this.f10603c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f10602b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new e1((g2) obj4, (org.telegram.ui.ActionBar.d2) obj, tLObject, (dg.f3) obj3, (Utilities.Callback) obj2, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new e1((lh.g5) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1, false));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e1((lh.g5) obj4, tLObject, (gg.v2[]) obj, (Long) obj3, (androidx.car.app.utils.b) obj2, tL_error, 2, false));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gg.j0((t7) obj4, (org.telegram.ui.ActionBar.d2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new e1((t7) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (bj) obj2, tL_error, 5, false));
                return;
            case 5:
                j7 j7Var = (j7) obj4;
                j7Var.getClass();
                AndroidUtilities.runOnUIThread(new e1(j7Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (l7) obj3, (Utilities.Callback) obj2, tL_error, 7, false));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gg.j0((Object) ((nh.d4) obj4), (Object) ((Runnable) obj), tL_error, (TLObject) ((TL_stories.StoryItem) obj3), (Object) ((c8) obj2), 14));
                return;
            case 7:
                ob obVar = (ob) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                ub ubVar = obVar.f36746a.f37374n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (ubVar.A0 == null) {
                            ubVar.A0 = new HashMap();
                        }
                        ubVar.A0.put(Long.valueOf(user.f19306id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new gg.j0(obVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, d2Var, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new kh((Object) ((sp) obj4), (Object) ((org.telegram.ui.ActionBar.d2[]) obj), (Object) ((TLRPC.Chat) obj3), (Object) ((org.telegram.ui.ActionBar.p2) obj2), 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gg.j0((Object) ((lq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 26));
                return;
            case 10:
                xx0.p((cs0) obj4, this.f10603c, (TLRPC.TL_messages_getAttachedStickers) obj3, (no) obj2, tLObject, tL_error);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new jy0(11, (pg0) obj4, (String) obj, (String) obj3, (String) obj2, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new e1((fn0) obj4, tL_error, (String) obj, (vm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new jy0(18, (nm0) obj4, (gl0) obj, (qa) obj3, (TL_account.verifyEmail) obj2, tL_error));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new jy0(22, (PrivacyControlActivity) obj4, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, tL_error));
                return;
            case 15:
                q31 q31Var = (q31) obj4;
                q31Var.getClass();
                AndroidUtilities.runOnUIThread(new e1(q31Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) obj4, tLObject, (nh.j7) obj, (String) obj3, (String) obj2));
                return;
            case 17:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new e1(c1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            case 18:
                t6 t6Var = (t6) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                ff.a aVar = (ff.a) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(t6Var.f42399a).requestReference(storyItem, tL_messages_getAttachedStickers, aVar);
                    return;
                } else {
                    aVar.run(tLObject, tL_error);
                    return;
                }
            case 19:
                AndroidUtilities.runOnUIThread(new e1((tf.m0) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z61((tf.l1) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 3));
                return;
        }
    }

    public b1(ob obVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f10601a = 7;
        this.f10602b = obVar;
        this.d = tL_chatInviteExported;
        this.e = zArr;
        this.f10603c = d2Var;
    }
}
