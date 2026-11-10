package bi;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.n10;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dh;
import org.telegram.ui.ek0;
import org.telegram.ui.fe0;
import org.telegram.ui.hf0;
import org.telegram.ui.mp;
import org.telegram.ui.nj0;
import org.telegram.ui.so0;
import org.telegram.ui.sy0;
import org.telegram.ui.uo;
import org.telegram.ui.vj0;
public final class g2 implements RequestDelegate {
    public final int f3921a;
    public final Object f3922b;
    public final Object f3923c;
    public final Object d;
    public final Object f3924e;

    public g2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3921a = i7;
        this.f3922b = obj;
        this.f3923c = obj2;
        this.d = obj3;
        this.f3924e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i7 = this.f3921a;
        Object obj = this.f3924e;
        Object obj2 = this.d;
        Object obj3 = this.f3923c;
        Object obj4 = this.f3922b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new a3((k7) obj4, tLObject, (wg.f1[]) obj3, (Long) obj2, (aa.s) obj, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a3((k7) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new a3((ea) obj4, tLObject, (ij) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (dh) obj, tL_error, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new u0((Object) ((ea) obj4), (org.telegram.ui.ActionBar.u1) obj3, tLObject, (TLObject) ((TL_stars.InputSavedStarGift) obj2), (Object) ((c20) obj), 6));
                return;
            case 4:
                t9 t9Var = (t9) obj4;
                t9Var.getClass();
                org.telegram.messenger.g0.h3(new a3(t9Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (v9) obj2, (c20) obj, tL_error, 6));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new u0((Object) ((di.j4) obj4), (Object) ((Runnable) obj3), tL_error, (TLObject) ((TL_stories.StoryItem) obj2), (Object) ((fi.q8) obj), 9));
                return;
            case 6:
                fi.e7 e7Var = (fi.e7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                j0 j0Var = (j0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.r8.n(e7Var.f11880a).u(new Object[]{tL_messages_getAttachedStickers, j0Var}, storyItem);
                    return;
                } else {
                    j0Var.run(tLObject, tL_error);
                    return;
                }
            case 7:
                org.telegram.messenger.g0.h3(new a3((jg.z0) obj4, (String) obj3, tL_error, tLObject, (qp) obj2, (yr) obj));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new u0((jg.b2) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj, 14));
                return;
            case 9:
                org.telegram.ui.hb hbVar = (org.telegram.ui.hb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.ui.mb mbVar = hbVar.f46287a.f46893n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (mbVar.f47907z0 == null) {
                            mbVar.f47907z0 = new HashMap();
                        }
                        mbVar.f47907z0.put(Long.valueOf(user.f27109id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.g0.h3(new u0(hbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, u1Var));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((uo) obj4, (org.telegram.ui.ActionBar.u1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.f2) obj, 10));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new u0((Object) ((mp) obj4), tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj3), (Object) ((TwoStepVerificationActivity) obj2), (TLObject) ((TLRPC.TL_channels_editCreator) obj), 28));
                return;
            case 12:
                so0 so0Var = (so0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.ld ldVar = (org.telegram.ui.ld) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(so0Var.f28669a).u(new Object[]{tL_messages_getAttachedStickers2, ldVar}, obj3);
                    return;
                } else {
                    ldVar.run(tLObject, tL_error);
                    return;
                }
            case 13:
                org.telegram.messenger.g0.h3(new n10((fe0) obj4, tL_error, (String) obj3, (String) obj2, (String) obj, 13));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new a3((ek0) obj4, tL_error, (String) obj3, (vj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new n10((nj0) obj4, tL_error, (hf0) obj3, (m4.d0) obj2, (TL_account.verifyEmail) obj, 20));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new n10((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj3, (TLRPC.GlobalPrivacySettings) obj2, (TL_account.setGlobalPrivacySettings) obj, 24));
                return;
            case 17:
                sy0 sy0Var = (sy0) obj4;
                sy0Var.getClass();
                org.telegram.messenger.g0.h3(new a3(sy0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.x0) obj4, tLObject, (di.p7) obj3, (String) obj2, (String) obj));
                return;
            case 19:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                x0Var.getClass();
                org.telegram.messenger.g0.h3(new a3(x0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                return;
            default:
                org.telegram.messenger.g0.h3(new a3((zh.g1) obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (ub) obj2, (c20) obj, tL_error));
                return;
        }
    }
}
