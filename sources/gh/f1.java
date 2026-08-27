package gh;

import android.util.LongSparseArray;
import hh.k7;
import hh.m7;
import hh.u7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import lh.z7;
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
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.l20;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.a01;
import org.telegram.ui.gg;
import org.telegram.ui.gm0;
import org.telegram.ui.ig0;
import org.telegram.ui.kb;
import org.telegram.ui.om0;
import org.telegram.ui.pr0;
import org.telegram.ui.qb;
import org.telegram.ui.ti;
import org.telegram.ui.x21;
import org.telegram.ui.xm0;
import org.telegram.ui.yf;
import org.telegram.ui.zk0;

public final class f1 implements RequestDelegate {

    public final int f7238a;

    public final Object f7239b;

    public final Object f7240c;
    public final Object d;

    public final Object f7241e;

    public f1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7238a = i10;
        this.f7239b = obj;
        this.f7240c = obj2;
        this.d = obj3;
        this.f7241e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f7238a;
        Object obj = this.f7240c;
        Object obj2 = this.f7241e;
        Object obj3 = this.d;
        Object obj4 = this.f7239b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1((k2) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (e1) obj3, (Utilities.Callback) obj2, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new i1((hh.i5) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1, false));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new i1((hh.i5) obj4, tLObject, (cg.y2[]) obj, (Long) obj3, (androidx.car.app.utils.a) obj2, tL_error, 2, false));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.k0((u7) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new i1((u7) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (ti) obj2, tL_error, 5, false));
                break;
            case 5:
                k7 k7Var = (k7) obj4;
                k7Var.getClass();
                AndroidUtilities.runOnUIThread(new i1(k7Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (m7) obj3, (Utilities.Callback) obj2, tL_error, 7, false));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new cg.k0(obj4, obj, tL_error, (TLObject) obj3, obj2, 14));
                break;
            case 7:
                z7 z7Var = (z7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                cf.a aVar = (cf.a) obj2;
                if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || storyItem == null) {
                    aVar.run(tLObject, tL_error);
                } else {
                    FileRefController.getInstance(z7Var.f17193a).requestReference(storyItem, tL_messages_getAttachedStickers, aVar);
                }
                break;
            case 8:
                kb kbVar = (kb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                qb qbVar = kbVar.f39685a.f40428n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (qbVar.f41625z0 == null) {
                            qbVar.f41625z0 = new HashMap();
                        }
                        qbVar.f41625z0.put(Long.valueOf(user.f22527id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new cg.k0(kbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var, 22));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.ActionBar.n2) obj4, (Serializable) obj, obj3, (org.telegram.ui.ActionBar.n2) obj2, 6));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new cg.k0(obj4, tL_error, obj, obj3, (TLObject) obj2, 28));
                break;
            case 11:
                ex0.q((pr0) obj4, this.f7240c, (TLRPC.TL_messages_getAttachedStickers) obj3, (gg) obj2, tLObject, tL_error);
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new l20((ig0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new i1((xm0) obj4, tL_error, (String) obj, (om0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new l20((gm0) obj4, tL_error, (zk0) obj, (org.telegram.ui.i6) obj3, (TL_account.verifyEmail) obj2, 20));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new l20((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                break;
            case 16:
                x21 x21Var = (x21) obj4;
                x21Var.getClass();
                AndroidUtilities.runOnUIThread(new i1(x21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new i1((org.telegram.ui.web.z0) obj4, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new i1((pf.m0) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a01((pf.k1) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2));
                break;
        }
    }

    public f1(kb kbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f7238a = 8;
        this.f7239b = kbVar;
        this.d = tL_chatInviteExported;
        this.f7241e = zArr;
        this.f7240c = b2Var;
    }
}
