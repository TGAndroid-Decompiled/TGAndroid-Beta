package ih;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import jh.i7;
import jh.k7;
import jh.s7;
import nh.c9;
import nh.o7;
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
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a01;
import org.telegram.ui.dm0;
import org.telegram.ui.dq;
import org.telegram.ui.fg0;
import org.telegram.ui.gg;
import org.telegram.ui.ib;
import org.telegram.ui.kp;
import org.telegram.ui.lm0;
import org.telegram.ui.nr0;
import org.telegram.ui.ob;
import org.telegram.ui.ui;
import org.telegram.ui.vk0;
import org.telegram.ui.vm0;
import org.telegram.ui.y21;
import org.telegram.ui.zg;
public final class c1 implements RequestDelegate {
    public final int f9067a;
    public final Object f9068b;
    public final Object f9069c;
    public final Object d;
    public final Object f9070e;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9067a = i10;
        this.f9068b = obj;
        this.f9069c = obj2;
        this.d = obj3;
        this.f9070e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f9067a;
        Object obj = this.f9069c;
        Object obj2 = this.f9070e;
        Object obj3 = this.d;
        Object obj4 = this.f9068b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new f1((h2) obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (bg.j3) obj3, (Utilities.Callback) obj2, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f1((jh.h5) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1, false));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new f1((jh.h5) obj4, tLObject, (eg.w2[]) obj, (Long) obj3, (androidx.car.app.utils.b) obj2, tL_error, 2, false));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new eg.k0((s7) obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new f1((s7) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (ui) obj2, tL_error, 5, false));
                return;
            case 5:
                i7 i7Var = (i7) obj4;
                i7Var.getClass();
                AndroidUtilities.runOnUIThread(new f1(i7Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (k7) obj3, (Utilities.Callback) obj2, tL_error, 7, false));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new eg.k0((Object) ((lh.d4) obj4), (Object) ((Runnable) obj), tL_error, (TLObject) ((TL_stories.StoryItem) obj3), (Object) ((c9) obj2), 14));
                return;
            case 7:
                o7 o7Var = (o7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                ef.a aVar = (ef.a) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(o7Var.f18254a).requestReference(storyItem, tL_messages_getAttachedStickers, aVar);
                    return;
                } else {
                    aVar.run(tLObject, tL_error);
                    return;
                }
            case 8:
                ib ibVar = (ib) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                ob obVar = ibVar.f39195a.f39829n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (obVar.f41077z0 == null) {
                            obVar.f41077z0 = new HashMap();
                        }
                        obVar.f41077z0.put(Long.valueOf(user.f22539id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new eg.k0(ibVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, c2Var, 22));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gg((kp) obj4, (org.telegram.ui.ActionBar.c2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.o2) obj2, 4));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new eg.k0((Object) ((dq) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj), (Object) ((TwoStepVerificationActivity) obj3), (TLObject) ((TLRPC.TL_channels_editCreator) obj2), 28));
                return;
            case 11:
                nx0.p((nr0) obj4, this.f9069c, (TLRPC.TL_messages_getAttachedStickers) obj3, (zg) obj2, tLObject, tL_error);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new u20((fg0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new f1((vm0) obj4, tL_error, (String) obj, (lm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new u20((dm0) obj4, tL_error, (vk0) obj, (oc.i) obj3, (TL_account.verifyEmail) obj2, 20));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new u20((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                return;
            case 16:
                y21 y21Var = (y21) obj4;
                y21Var.getClass();
                AndroidUtilities.runOnUIThread(new f1(y21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.web.z0) obj4, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new f1((rf.n0) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a01((rf.l1) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2));
                return;
        }
    }

    public c1(ib ibVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f9067a = 8;
        this.f9068b = ibVar;
        this.d = tL_chatInviteExported;
        this.f9070e = zArr;
        this.f9069c = c2Var;
    }
}
