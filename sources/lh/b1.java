package lh;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import mh.j7;
import mh.l7;
import mh.t7;
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
import org.telegram.ui.cs0;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.ih;
import org.telegram.ui.kq;
import org.telegram.ui.lo;
import org.telegram.ui.mb;
import org.telegram.ui.nm0;
import org.telegram.ui.og0;
import org.telegram.ui.q31;
import org.telegram.ui.rp;
import org.telegram.ui.sb;
import org.telegram.ui.vm0;
import org.telegram.ui.y61;
import org.telegram.ui.zi;
import qh.a8;
import qh.r6;
public final class b1 implements RequestDelegate {
    public final int f12602a;
    public final Object f12603b;
    public final Object f12604c;
    public final Object d;
    public final Object f12605e;

    public b1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f12602a = i10;
        this.f12603b = obj;
        this.f12604c = obj2;
        this.d = obj3;
        this.f12605e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f12602a;
        Object obj = this.f12604c;
        Object obj2 = this.f12605e;
        Object obj3 = this.d;
        Object obj4 = this.f12603b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new e1((g2) obj4, (org.telegram.ui.ActionBar.d2) obj, tLObject, (eg.d3) obj3, (Utilities.Callback) obj2, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new e1((mh.g5) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1, false));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e1((mh.g5) obj4, tLObject, (hg.v2[]) obj, (Long) obj3, (androidx.car.app.utils.b) obj2, tL_error, 2, false));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hg.j0((t7) obj4, (org.telegram.ui.ActionBar.d2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new e1((t7) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (zi) obj2, tL_error, 5, false));
                return;
            case 5:
                j7 j7Var = (j7) obj4;
                j7Var.getClass();
                AndroidUtilities.runOnUIThread(new e1(j7Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (l7) obj3, (Utilities.Callback) obj2, tL_error, 7, false));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.j0((Object) ((oh.f4) obj4), (Object) ((Runnable) obj), tL_error, (TLObject) ((TL_stories.StoryItem) obj3), (Object) ((a8) obj2), 14));
                return;
            case 7:
                mb mbVar = (mb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                sb sbVar = mbVar.f38941a.f39638n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (sbVar.A0 == null) {
                            sbVar.A0 = new HashMap();
                        }
                        sbVar.A0.put(Long.valueOf(user.f20992id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new hg.j0(mbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, d2Var, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ih((Object) ((rp) obj4), (Object) ((org.telegram.ui.ActionBar.d2[]) obj), (Object) ((TLRPC.Chat) obj3), (Object) ((org.telegram.ui.ActionBar.p2) obj2), 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new hg.j0((Object) ((kq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 26));
                return;
            case 10:
                xx0.p((cs0) obj4, this.f12604c, (TLRPC.TL_messages_getAttachedStickers) obj3, (lo) obj2, tLObject, tL_error);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new jy0(11, (og0) obj4, (String) obj, (String) obj3, (String) obj2, tL_error));
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
                AndroidUtilities.runOnUIThread(new e1((org.telegram.ui.web.a1) obj4, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            case 17:
                r6 r6Var = (r6) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                gf.a aVar = (gf.a) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(r6Var.f45992a).requestReference(storyItem, tL_messages_getAttachedStickers, aVar);
                    return;
                } else {
                    aVar.run(tLObject, tL_error);
                    return;
                }
            case 18:
                AndroidUtilities.runOnUIThread(new e1((uf.m0) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new y61((uf.l1) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 3));
                return;
        }
    }

    public b1(mb mbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f12602a = 7;
        this.f12603b = mbVar;
        this.d = tL_chatInviteExported;
        this.f12605e = zArr;
        this.f12604c = d2Var;
    }
}
