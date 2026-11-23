package bi;

import android.util.LongSparseArray;
import hi.i9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ch;
import org.telegram.ui.de0;
import org.telegram.ui.fk0;
import org.telegram.ui.gb;
import org.telegram.ui.gf0;
import org.telegram.ui.ip;
import org.telegram.ui.lb;
import org.telegram.ui.np;
import org.telegram.ui.oj0;
import org.telegram.ui.py0;
import org.telegram.ui.qo0;
import org.telegram.ui.uo;
import org.telegram.ui.wj0;
public final class m2 implements RequestDelegate {
    public final int f3830a;
    public final Object f3831b;
    public final Object f3832c;
    public final Object d;
    public final Object f3833e;

    public m2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3830a = i7;
        this.f3831b = obj;
        this.f3832c = obj2;
        this.d = obj3;
        this.f3833e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i7 = this.f3830a;
        Object obj = this.f3833e;
        Object obj2 = this.d;
        Object obj3 = this.f3832c;
        Object obj4 = this.f3831b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new n2((p3) obj4, (org.telegram.ui.ActionBar.t1) obj3, tLObject, (ai.d1) obj2, (w10) obj, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new n2((di.f6) obj4, tLObject, (f2[]) obj3, (Long) obj2, (aa.r) obj, tL_error, 2, false));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new n2((di.f6) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 1, false));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new n2((di.y8) obj4, tLObject, (fj) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (ch) obj, tL_error, 5, false));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new s1((Object) ((di.y8) obj4), (Object) ((org.telegram.ui.ActionBar.t1) obj3), tLObject, (Object) ((TL_stars.InputSavedStarGift) obj2), (Object) ((w10) obj), 8));
                return;
            case 5:
                di.n8 n8Var = (di.n8) obj4;
                n8Var.getClass();
                org.telegram.messenger.g0.g3(new n2(n8Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (di.p8) obj2, (w10) obj, tL_error, 7, false));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new s1((fi.z3) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (i9) obj));
                return;
            case 7:
                hi.x7 x7Var = (hi.x7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ai.b1 b1Var = (ai.b1) obj;
                if (tL_error != null && org.telegram.messenger.q8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.q8.n(x7Var.f15733a).u(new Object[]{tL_messages_getAttachedStickers, b1Var}, storyItem);
                    return;
                } else {
                    b1Var.run(tLObject, tL_error);
                    return;
                }
            case 8:
                org.telegram.messenger.g0.g3(new n2((jg.z0) obj4, (String) obj3, tL_error, tLObject, (mp) obj2, (tr) obj));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new s1((Object) ((jg.a2) obj4), (Object) ((TLRPC.TL_messages_getStickers) obj3), tLObject, (Object) ((ArrayList) obj2), (Object) ((LongSparseArray) obj), 16));
                return;
            case 10:
                gb gbVar = (gb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                lb lbVar = gbVar.f48201a.f48771n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (lbVar.A0 == null) {
                            lbVar.A0 = new HashMap();
                        }
                        lbVar.A0.put(Long.valueOf(user.f28641id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.g0.g3(new s1((Object) gbVar, (Object) tL_chatInviteExported, (Object) tL_messages_exportedChatInvite, (Object) zArr, (Object) t1Var, 23));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new oi.h((uo) obj4, (org.telegram.ui.ActionBar.t1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.g2) obj, 16));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new ip((np) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 0));
                return;
            case 13:
                qo0 qo0Var = (qo0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) obj;
                if (tL_error != null && org.telegram.messenger.q8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.q8.n(qo0Var.f30223a).u(new Object[]{tL_messages_getAttachedStickers2, v7Var}, obj3);
                    return;
                } else {
                    v7Var.run(tLObject, tL_error);
                    return;
                }
            case 14:
                org.telegram.messenger.g0.g3(new ip((de0) obj4, tL_error, (String) obj3, (String) obj2, (String) obj, 16));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new n2((fk0) obj4, tL_error, (String) obj3, (wj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new ip((oj0) obj4, tL_error, (gf0) obj3, (jb.m) obj2, (TL_account.verifyEmail) obj, 23));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new ip((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj3, (TLRPC.GlobalPrivacySettings) obj2, (TL_account.setGlobalPrivacySettings) obj, 27));
                return;
            case 18:
                py0 py0Var = (py0) obj4;
                py0Var.getClass();
                org.telegram.messenger.g0.g3(new n2(py0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) obj4, tLObject, (fi.f7) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                v0Var.getClass();
                org.telegram.messenger.g0.g3(new n2(v0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                return;
        }
    }

    public m2(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f3830a = 10;
        this.f3831b = gbVar;
        this.d = tL_chatInviteExported;
        this.f3833e = zArr;
        this.f3832c = t1Var;
    }
}
