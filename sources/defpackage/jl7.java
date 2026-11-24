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
public final class jl7 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public jl7(Object obj, Object obj2, byte b) {
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
                gm.c3(new ud7((ml7) obj2, tLObject, (u35) obj, (byte) 6));
                return;
            case 1:
                ((dz7) obj2).a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 2:
                gm.c3(new ud7((tz7) obj2, tL_error, (TL_account.verifyPhone) obj, (byte) 15));
                return;
            case 3:
                p pVar = (p) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    gm.c3(new bl7(pVar, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, (byte) 28));
                    return;
                } else {
                    gm.c3(new z08(pVar, tL_error, tLObject2, (byte) 1));
                    return;
                }
            case 4:
                p pVar2 = (p) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        qac qacVar = pVar2.d1;
                        if (qacVar != null) {
                            qacVar.a((TLRPC.TL_payments_paymentResult) tLObject);
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
                        pVar2.getMessagesController().T3(updates, false);
                        gm.c3(new bl7(pVar2, messageArr, (byte) 29));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        gm.c3(new a18(pVar2, (TLRPC.TL_payments_paymentVerificationNeeded) tLObject, (byte) 0));
                        return;
                    } else {
                        return;
                    }
                }
                k22 k22Var = pVar2.f1;
                if (k22Var == null || !((Boolean) k22Var.a(tL_error)).booleanValue()) {
                    gm.c3(new ud7(pVar2, tL_error, tL_payments_sendPaymentForm, (byte) 17));
                    return;
                }
                return;
            case 5:
                gm.c3(new jy6((p) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, (byte) 15));
                return;
            case 6:
                v48 v48Var = (v48) obj2;
                a8b a8bVar = (a8b) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(v48Var.x.s2).T3((TLRPC.Updates) tLObject, false);
                }
                gm.c3(new s48(a8bVar, (byte) 0));
                return;
            case 7:
                gm.c3(new ud7((ih8) obj2, (hh8) obj, tLObject, (byte) 29));
                return;
            case 8:
                wh8 wh8Var = (wh8) obj2;
                wh8Var.getClass();
                gm.c3(new jy6(wh8Var, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, (byte) 22));
                return;
            case 9:
                gm.c3(new jy6((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, (byte) 24));
                return;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                gm.c3(new a18(privacySettingsActivity, (bjb) obj, (byte) 28));
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.e7;
                profileActivity.getClass();
                gm.c3(new jy6(profileActivity, tL_error, tLObject, (String) obj, (byte) 29));
                return;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                RectF rectF2 = ProfileActivity.e7;
                profileActivity2.getClass();
                gm.c3(new jy6(profileActivity2, tLObject, tL_error, (int[]) obj, (byte) 26));
                return;
            case 13:
                RectF rectF3 = ProfileActivity.e7;
                gm.c3(new jy6((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 27));
                return;
            case 14:
                gm.c3(new no8((dq8) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 2));
                return;
            case 15:
                gm.c3(new ak8((Object) ((lea) obj2), (Object) tL_error, (Object) ((d) obj), (byte) 5));
                return;
            case 16:
                gm.c3(new ak8((Object) ((qb9) obj2), tLObject, (Object) ((TL_stars.getResaleStarGifts) obj), (byte) 13));
                return;
            case 17:
                gm.c3(new ak8((Object) ((pp9) obj2), tLObject, (Object) ((String) obj), (byte) 22));
                return;
            case 18:
                gm.c3(new ak8((Object) ((pp9) obj2), tLObject, (Object) ((TLRPC.ChatFull) obj), (byte) 23));
                return;
            case 19:
                gm.c3(new no8((wr9) obj2, tLObject, (ArrayList) obj, tL_error, (byte) 11));
                return;
            case 20:
                a6a a6aVar = (a6a) obj2;
                xq1 xq1Var = (xq1) obj;
                if (tLObject != null) {
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    if (xq1Var != null) {
                        gm.c3(xq1Var);
                        return;
                    }
                    return;
                }
                a6aVar.getClass();
                return;
            case 21:
                gm.c3(new hw9((d9a) obj2, tL_error, (TLRPC.TL_authorization) obj, (byte) 4));
                return;
            case 22:
                gm.c3(new hw9((e9a) obj2, tL_error, (TLRPC.TL_authorization) obj, (byte) 5));
                return;
            case 23:
                gm.c3(new no8((g9a) obj2, tLObject, tL_error, (db1) obj, (byte) 20));
                return;
            case 24:
                gm.c3(new e6a((daa) obj2, (TLRPC.TL_attachMenuBot) obj, (byte) 2));
                return;
            case 25:
                daa daaVar = (daa) obj2;
                daaVar.getClass();
                gm.c3(new no8(daaVar, tL_error, tLObject, (String) obj, (byte) 21));
                return;
            case 26:
                gm.c3(new e6a((tca) obj2, tLObject, (Context) obj));
                return;
            case 27:
                wsa wsaVar = (wsa) obj2;
                he heVar = (he) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    oc7.r1(wsaVar.a).d4(tL_payments_uniqueStarGift.users, false);
                    oc7.r1(wsaVar.a).X3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        gm.c3(new e6a(wsaVar, tL_payments_uniqueStarGift, (byte) 24));
                        return;
                    }
                }
                gm.c3(new e6a(heVar, tL_error, (byte) 25));
                return;
            case 28:
                gm.c3(new no8((wsa) obj2, tLObject, (hw9) obj, tL_error, (byte) 26));
                return;
            default:
                wsa wsaVar2 = (wsa) obj2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    oc7.r1(wsaVar2.a).d4(updates2.users, false);
                    oc7.r1(wsaVar2.a).X3(updates2.chats, false);
                }
                gm.c3(new no8(wsaVar2, tL_error, tLObject, inputSavedStarGift, (byte) 28));
                return;
        }
    }
}
