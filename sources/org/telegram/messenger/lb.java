package org.telegram.messenger;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.mn0;
import org.telegram.ui.n70;
import org.telegram.ui.vg0;
public final class lb implements Runnable {
    public final int f18431a;
    public final int f18432b;
    public final Object f18433c;
    public final Object d;
    public final Object f18434e;
    public final Object f18435f;
    public final Object h;
    public final Object f18436n;
    public final Object f18437r;
    public final Object f18438s;

    public lb(MessagesController messagesController, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs2, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f18431a = 0;
        this.f18433c = messagesController;
        this.d = messages_dialogs;
        this.f18435f = arrayList;
        this.f18434e = messages_dialogs2;
        this.f18432b = i10;
        this.h = arrayList2;
        this.f18436n = arrayList3;
        this.f18437r = arrayList4;
        this.f18438s = runnable;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f18431a;
        int i11 = this.f18432b;
        Object obj = this.f18438s;
        Object obj2 = this.f18437r;
        Object obj3 = this.f18436n;
        Object obj4 = this.h;
        Object obj5 = this.f18435f;
        Object obj6 = this.f18434e;
        Object obj7 = this.d;
        Object obj8 = this.f18433c;
        switch (i10) {
            case 0:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj5, (TLRPC.messages_Dialogs) obj6, this.f18432b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                n70 n70Var = (n70) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new mn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                n70 n70Var2 = (n70) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.O).putChats(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity2.v0(this.f18432b, n70Var2, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    n70Var2.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                launchActivity2.B0(org.telegram.ui.Components.g5.G(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            case 3:
                eg0 eg0Var = (eg0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.k kVar = (c5.k) obj5;
                c5.o oVar = (c5.o) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                vg0 vg0Var = eg0Var.v;
                ci.d dVar = eg0Var.f37303b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, kVar.f4264a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar.f(formatPluralStringComma, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new ai.s0(eg0Var, oVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    eg0Var.f37305e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.ad(vg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    eg0Var.f37305e = tL_error.text;
                    new org.telegram.ui.Components.ad(vg0Var.Z, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                yh.n5 n5Var = (yh.n5) obj8;
                ((boolean[]) obj7)[0] = true;
                n5Var.a0((MessageObject) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new yh.u4(n5Var, (boolean[]) obj3, this.f18432b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
        }
    }

    public lb(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f18431a = i11;
        this.f18433c = launchActivity;
        this.d = obj;
        this.f18434e = obj2;
        this.f18432b = i10;
        this.f18435f = obj3;
        this.h = obj4;
        this.f18436n = obj5;
        this.f18437r = obj6;
        this.f18438s = obj7;
    }

    public lb(eg0 eg0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.k kVar, int i10, c5.o oVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f18431a = 3;
        this.f18433c = eg0Var;
        this.d = tLObject;
        this.f18434e = tL_error;
        this.f18435f = kVar;
        this.f18432b = i10;
        this.h = oVar;
        this.f18436n = tL_inputStorePaymentAuthCode;
        this.f18437r = str;
        this.f18438s = tL_payments_canPurchaseStore;
    }

    public lb(yh.n5 n5Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f18431a = 4;
        this.f18433c = n5Var;
        this.d = zArr;
        this.f18434e = messageObject;
        this.f18435f = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.f18436n = zArr2;
        this.f18432b = i10;
        this.f18437r = callback;
        this.f18438s = callback2;
    }
}
