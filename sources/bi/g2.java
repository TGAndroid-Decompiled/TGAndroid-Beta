package bi;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bh;
import org.telegram.ui.de0;
import org.telegram.ui.gb;
import org.telegram.ui.hf0;
import org.telegram.ui.hk0;
import org.telegram.ui.lb;
import org.telegram.ui.np;
import org.telegram.ui.qj0;
import org.telegram.ui.qo0;
import org.telegram.ui.qy0;
import org.telegram.ui.vo;
import org.telegram.ui.wn;
import org.telegram.ui.yj0;
public final class g2 implements RequestDelegate {
    public final int f3634a;
    public final Object f3635b;
    public final Object f3636c;
    public final Object d;
    public final Object f3637e;

    public g2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3634a = i7;
        this.f3635b = obj;
        this.f3636c = obj2;
        this.d = obj3;
        this.f3637e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i7 = this.f3634a;
        Object obj = this.f3637e;
        Object obj2 = this.d;
        Object obj3 = this.f3636c;
        Object obj4 = this.f3635b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new h2((j3) obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (ai.g1) obj2, (x10) obj, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new h2((di.f6) obj4, tLObject, (a2[]) obj3, (Long) obj2, (aa.r) obj, tL_error, 2, false));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new h2((di.f6) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 1, false));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new h2((di.x8) obj4, tLObject, (fj) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (bh) obj, tL_error, 5, false));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.b((di.x8) obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (TL_stars.InputSavedStarGift) obj2, (x10) obj, 9));
                return;
            case 5:
                di.m8 m8Var = (di.m8) obj4;
                m8Var.getClass();
                org.telegram.messenger.g0.g3(new h2(m8Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (di.o8) obj2, (x10) obj, tL_error, 7, false));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.b((fi.z3) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (hi.o8) obj, 12));
                return;
            case 7:
                hi.d7 d7Var = (hi.d7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ai.e1 e1Var = (ai.e1) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.r8.n(d7Var.f14388a).u(new Object[]{tL_messages_getAttachedStickers, e1Var}, storyItem);
                    return;
                } else {
                    e1Var.run(tLObject, tL_error);
                    return;
                }
            case 8:
                org.telegram.messenger.g0.g3(new h2((jg.z0) obj4, (String) obj3, tL_error, tLObject, (mp) obj2, (tr) obj));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new ai.b((jg.a2) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj, 17));
                return;
            case 10:
                gb gbVar = (gb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                lb lbVar = gbVar.f48013a.f48686n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (lbVar.A0 == null) {
                            lbVar.A0 = new HashMap();
                        }
                        lbVar.A0.put(Long.valueOf(user.f28554id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.g0.g3(new ai.b(gbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, u1Var));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((vo) obj4, (org.telegram.ui.ActionBar.u1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.h2) obj, 15));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new wn((Object) ((np) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj3), (Object) ((TwoStepVerificationActivity) obj2), (Object) ((TLRPC.TL_channels_editCreator) obj), 1));
                return;
            case 13:
                qo0 qo0Var = (qo0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(qo0Var.f30189a).u(new Object[]{tL_messages_getAttachedStickers2, u7Var}, obj3);
                    return;
                } else {
                    u7Var.run(tLObject, tL_error);
                    return;
                }
            case 14:
                org.telegram.messenger.g0.g3(new wn((Object) ((de0) obj4), tL_error, (Object) ((String) obj3), (Object) ((String) obj2), (Object) ((String) obj), 17));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new h2((hk0) obj4, tL_error, (String) obj3, (yj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new wn((Object) ((qj0) obj4), tL_error, (Object) ((hf0) obj3), (Object) ((k8.a) obj2), (Object) ((TL_account.verifyEmail) obj), 24));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new wn((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj3), (Object) ((TLRPC.GlobalPrivacySettings) obj2), (Object) ((TL_account.setGlobalPrivacySettings) obj), 28));
                return;
            case 18:
                qy0 qy0Var = (qy0) obj4;
                qy0Var.getClass();
                org.telegram.messenger.g0.g3(new h2(qy0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) obj4, tLObject, (fi.f7) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                v0Var.getClass();
                org.telegram.messenger.g0.g3(new h2(v0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                return;
        }
    }

    public g2(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f3634a = 10;
        this.f3635b = gbVar;
        this.d = tL_chatInviteExported;
        this.f3637e = zArr;
        this.f3636c = u1Var;
    }
}
