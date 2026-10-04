package org.telegram.messenger;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.h90;
import org.telegram.ui.kn0;
import org.telegram.ui.ug0;
public final class jb implements Runnable {
    public final int f18248a;
    public final int f18249b;
    public final Object f18250c;
    public final Object d;
    public final Object f18251e;
    public final Object f18252f;
    public final Object h;
    public final Object f18253n;
    public final Object f18254r;
    public final Object f18255s;

    public jb(MessagesController messagesController, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs2, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f18248a = 0;
        this.f18250c = messagesController;
        this.d = messages_dialogs;
        this.f18252f = arrayList;
        this.f18251e = messages_dialogs2;
        this.f18249b = i10;
        this.h = arrayList2;
        this.f18253n = arrayList3;
        this.f18254r = arrayList4;
        this.f18255s = runnable;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f18248a;
        int i11 = this.f18249b;
        Object obj = this.f18255s;
        Object obj2 = this.f18254r;
        Object obj3 = this.f18253n;
        Object obj4 = this.h;
        Object obj5 = this.f18252f;
        Object obj6 = this.f18251e;
        Object obj7 = this.d;
        Object obj8 = this.f18250c;
        switch (i10) {
            case 0:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj5, (TLRPC.messages_Dialogs) obj6, this.f18249b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                h90 h90Var = (h90) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new kn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                h90 h90Var2 = (h90) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.O).putChats(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity2.v0(this.f18249b, h90Var2, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    h90Var2.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                launchActivity2.B0(org.telegram.ui.Components.e5.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            case 3:
                dg0 dg0Var = (dg0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.k kVar = (c5.k) obj5;
                c5.o oVar = (c5.o) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                ug0 ug0Var = dg0Var.v;
                ci.d dVar = dg0Var.f35762b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, kVar.f4214a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar.f(formatPluralStringComma, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new ai.s0(dg0Var, oVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    dg0Var.f35764e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.yc(ug0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    dg0Var.f35764e = tL_error.text;
                    new org.telegram.ui.Components.yc(ug0Var.Z, null).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                yh.t5 t5Var = (yh.t5) obj8;
                ((boolean[]) obj7)[0] = true;
                t5Var.a0((MessageObject) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new yh.a5(t5Var, (boolean[]) obj3, this.f18249b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
        }
    }

    public jb(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f18248a = i11;
        this.f18250c = launchActivity;
        this.d = obj;
        this.f18251e = obj2;
        this.f18249b = i10;
        this.f18252f = obj3;
        this.h = obj4;
        this.f18253n = obj5;
        this.f18254r = obj6;
        this.f18255s = obj7;
    }

    public jb(dg0 dg0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.k kVar, int i10, c5.o oVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f18248a = 3;
        this.f18250c = dg0Var;
        this.d = tLObject;
        this.f18251e = tL_error;
        this.f18252f = kVar;
        this.f18249b = i10;
        this.h = oVar;
        this.f18253n = tL_inputStorePaymentAuthCode;
        this.f18254r = str;
        this.f18255s = tL_payments_canPurchaseStore;
    }

    public jb(yh.t5 t5Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f18248a = 4;
        this.f18250c = t5Var;
        this.d = zArr;
        this.f18251e = messageObject;
        this.f18252f = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.f18253n = zArr2;
        this.f18249b = i10;
        this.f18254r = callback;
        this.f18255s = callback2;
    }
}
