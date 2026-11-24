package defpackage;

import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class hj7 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public hj7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gl.c3(new pc7((jj7) obj2, tLObject, (x15) obj, (byte) 3));
                return;
            case 1:
                ((ax7) obj2).a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 2:
                gl.c3(new pc7((rx7) obj2, tL_error, (TL_account.verifyPhone) obj, (byte) 12));
                return;
            case 3:
                p pVar = (p) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    gl.c3(new bj7(pVar, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, (byte) 27));
                    return;
                } else {
                    gl.c3(new xy7(pVar, tL_error, tLObject2, (byte) 1));
                    return;
                }
            case 4:
                p pVar2 = (p) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        p8c p8cVar = pVar2.d1;
                        if (p8cVar != null) {
                            p8cVar.a((TLRPC.TL_payments_paymentResult) tLObject);
                            return;
                        }
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                TLRPC.Update update = updates.updates.get(i);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i++;
                                }
                            }
                        }
                        pVar2.getMessagesController().R3(updates, false);
                        gl.c3(new bj7(pVar2, messageArr, (byte) 28));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        gl.c3(new bj7(pVar2, (TLRPC.TL_payments_paymentVerificationNeeded) tLObject, (byte) 29));
                        return;
                    } else {
                        return;
                    }
                }
                z02 z02Var = pVar2.f1;
                if (z02Var == null || !((Boolean) z02Var.a(tL_error)).booleanValue()) {
                    gl.c3(new pc7(pVar2, tL_error, tL_payments_sendPaymentForm, (byte) 14));
                    return;
                }
                return;
            case 5:
                gl.c3(new jw6((p) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, (byte) 15));
                return;
            case 6:
                s28 s28Var = (s28) obj2;
                y5b y5bVar = (y5b) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(s28Var.x.s2).R3((TLRPC.Updates) tLObject, false);
                }
                gl.c3(new p28(y5bVar, (byte) 0));
                return;
            case 7:
                gl.c3(new pc7((gf8) obj2, (ff8) obj, tLObject, (byte) 26));
                return;
            case 8:
                uf8 uf8Var = (uf8) obj2;
                uf8Var.getClass();
                gl.c3(new jw6(uf8Var, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, (byte) 22));
                return;
            case 9:
                gl.c3(new jw6((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, (byte) 24));
                return;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                gl.c3(new h18(privacySettingsActivity, (ahb) obj, (byte) 27));
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                gl.c3(new jw6(profileActivity, tL_error, tLObject, (String) obj, (byte) 28));
                return;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getClass();
                gl.c3(new jw6(profileActivity2, tLObject, tL_error, (int[]) obj, (byte) 27));
                return;
            case 13:
                RectF rectF3 = ProfileActivity.Z6;
                gl.c3(new bm8((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 0));
                return;
            case 14:
                gl.c3(new bm8((co8) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 2));
                return;
            case 15:
                gl.c3(new gm8((lca) obj2, tL_error, (d) obj, (byte) 2));
                return;
            case 16:
                gl.c3(new gm8((q99) obj2, tLObject, (TL_stars.getResaleStarGifts) obj, (byte) 10));
                return;
            case 17:
                gl.c3(new gm8((on9) obj2, tLObject, (String) obj, (byte) 19));
                return;
            case 18:
                gl.c3(new gm8((on9) obj2, tLObject, (TLRPC.ChatFull) obj, (byte) 20));
                return;
            case 19:
                gl.c3(new bm8((vp9) obj2, tLObject, (ArrayList) obj, tL_error, (byte) 11));
                return;
            case 20:
                z3a z3aVar = (z3a) obj2;
                kp1 kp1Var = (kp1) obj;
                if (tLObject != null) {
                    z3aVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    if (kp1Var != null) {
                        gl.c3(kp1Var);
                        return;
                    }
                    return;
                }
                z3aVar.getClass();
                return;
            case 21:
                gl.c3(new q3a((Object) ((c7a) obj2), (Object) tL_error, (Object) ((TLRPC.TL_authorization) obj), (byte) 1));
                return;
            case 22:
                gl.c3(new q3a((Object) ((d7a) obj2), (Object) tL_error, (Object) ((TLRPC.TL_authorization) obj), (byte) 2));
                return;
            case 23:
                gl.c3(new bm8((Object) ((f7a) obj2), (Object) tLObject, tL_error, (Object) ((u91) obj), (byte) 20));
                return;
            case 24:
                gl.c3(new t7a((d8a) obj2, (TLRPC.TL_attachMenuBot) obj, (byte) 0));
                return;
            case 25:
                d8a d8aVar = (d8a) obj2;
                d8aVar.getClass();
                gl.c3(new bm8((gk7) d8aVar, tL_error, tLObject, (Object) ((String) obj), (byte) 21));
                return;
            case 26:
                gl.c3(new t7a((taa) obj2, tLObject, (Context) obj));
                return;
            case 27:
                vqa vqaVar = (vqa) obj2;
                hd hdVar = (hd) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    na7.q1(vqaVar.a).b4(tL_payments_uniqueStarGift.users, false);
                    na7.q1(vqaVar.a).V3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        gl.c3(new t7a(vqaVar, tL_payments_uniqueStarGift, (byte) 22));
                        return;
                    }
                }
                gl.c3(new t7a(hdVar, tL_error, (byte) 23));
                return;
            case 28:
                gl.c3(new bm8((vqa) obj2, tLObject, (q3a) obj, tL_error, (byte) 26));
                return;
            default:
                vqa vqaVar2 = (vqa) obj2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    na7.q1(vqaVar2.a).b4(updates2.users, false);
                    na7.q1(vqaVar2.a).V3(updates2.chats, false);
                }
                gl.c3(new bm8((gk7) vqaVar2, tL_error, tLObject, (Object) inputSavedStarGift, (byte) 28));
                return;
        }
    }
}
