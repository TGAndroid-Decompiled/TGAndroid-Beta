package defpackage;

import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class ol7 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public ol7(Object obj, Object obj2, byte b) {
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
                hl.c3(new fd7((rl7) obj2, tLObject, (v35) obj, (byte) 9));
                return;
            case 1:
                lm7 lm7Var = (lm7) obj2;
                lm7Var.getClass();
                hl.c3(new fd7(lm7Var, tLObject, (TL_feed.TL_feed_setInterestCategories) obj, (byte) 10));
                return;
            case 2:
                ((i08) obj2).a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 3:
                hl.c3(new fd7((x08) obj2, tL_error, (TL_account.verifyPhone) obj, (byte) 20));
                return;
            case 4:
                p pVar = (p) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    hl.c3(new pl7(pVar, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, (byte) 25));
                    return;
                } else {
                    hl.c3(new c28(pVar, tL_error, tLObject2, (byte) 1));
                    return;
                }
            case 5:
                p pVar2 = (p) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        pcc pccVar = pVar2.d1;
                        if (pccVar != null) {
                            pccVar.a((TLRPC.TL_payments_paymentResult) tLObject);
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
                        pVar2.getMessagesController().Y3(updates, false);
                        hl.c3(new pl7(pVar2, messageArr, (byte) 26));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        hl.c3(new pl7(pVar2, (TLRPC.TL_payments_paymentVerificationNeeded) tLObject, (byte) 27));
                        return;
                    } else {
                        return;
                    }
                }
                p12 p12Var = pVar2.f1;
                if (p12Var == null || !((Boolean) p12Var.a(tL_error)).booleanValue()) {
                    hl.c3(new fd7(pVar2, tL_error, tL_payments_sendPaymentForm, (byte) 23));
                    return;
                }
                return;
            case 6:
                hl.c3(new oy6((p) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, (byte) 16));
                return;
            case 7:
                j68 j68Var = (j68) obj2;
                w9b w9bVar = (w9b) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(j68Var.x.m2).Y3((TLRPC.Updates) tLObject, false);
                }
                hl.c3(new b68(w9bVar, (byte) 0));
                return;
            case 8:
                hl.c3(new sa8((ui8) obj2, (ti8) obj, tLObject, (byte) 4));
                return;
            case 9:
                ij8 ij8Var = (ij8) obj2;
                ij8Var.getClass();
                hl.c3(new oy6(ij8Var, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, (byte) 23));
                return;
            case 10:
                hl.c3(new oy6((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, (byte) 25));
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                hl.c3(new h68(privacySettingsActivity, (wkb) obj, (byte) 25));
                return;
            case 12:
                RectF rectF = ProfileActivity.Z6;
                hl.c3(new oy6((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 28));
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getClass();
                hl.c3(new oy6(profileActivity, tLObject, tL_error, (int[]) obj, (byte) 29));
                return;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity2.getClass();
                hl.c3(new vp8(profileActivity2, tL_error, tLObject, (String) obj, (byte) 1));
                return;
            case 15:
                hl.c3(new vp8((or8) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 3));
                return;
            case 16:
                hl.c3(new sa8((cga) obj2, tL_error, (e) obj, (byte) 10));
                return;
            case 17:
                hl.c3(new sa8((ed9) obj2, tLObject, (String) obj, (byte) 19));
                return;
            case 18:
                hl.c3(new sa8((er9) obj2, tLObject, (String) obj, (byte) 28));
                return;
            case 19:
                hl.c3(new sa8((er9) obj2, tLObject, (TLRPC.ChatFull) obj, (byte) 29));
                return;
            case 20:
                hl.c3(new vp8((nt9) obj2, tLObject, (ArrayList) obj, tL_error, (byte) 12));
                return;
            case 21:
                r7a r7aVar = (r7a) obj2;
                yp1 yp1Var = (yp1) obj;
                if (tLObject != null) {
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    if (yp1Var != null) {
                        hl.c3(yp1Var);
                        return;
                    }
                    return;
                }
                r7aVar.getClass();
                return;
            case 22:
                hl.c3(new jr9((taa) obj2, tL_error, (TLRPC.TL_authorization) obj, (byte) 10));
                return;
            case 23:
                hl.c3(new jr9((uaa) obj2, tL_error, (TLRPC.TL_authorization) obj, (byte) 11));
                return;
            case 24:
                hl.c3(new vp8((waa) obj2, tLObject, tL_error, (da1) obj, (byte) 21));
                return;
            case 25:
                hl.c3(new en9((tba) obj2, (TLRPC.TL_attachMenuBot) obj, (byte) 29));
                return;
            case 26:
                tba tbaVar = (tba) obj2;
                tbaVar.getClass();
                hl.c3(new vp8(tbaVar, tL_error, tLObject, (String) obj, (byte) 22));
                return;
            case 27:
                hl.c3(new ida((kea) obj2, tLObject, (Context) obj));
                return;
            case 28:
                wua wuaVar = (wua) obj2;
                id idVar = (id) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    uc7.s1(wuaVar.a).j4(tL_payments_uniqueStarGift.users, false);
                    uc7.s1(wuaVar.a).c4(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        hl.c3(new ida(wuaVar, tL_payments_uniqueStarGift, (byte) 19));
                        return;
                    }
                }
                hl.c3(new ida(idVar, tL_error, (byte) 20));
                return;
            default:
                hl.c3(new vp8((wua) obj2, tLObject, (jr9) obj, tL_error, (byte) 27));
                return;
        }
    }
}
