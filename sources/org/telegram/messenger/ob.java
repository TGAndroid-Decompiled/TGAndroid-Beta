package org.telegram.messenger;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.d20;
import org.telegram.ui.jg0;
import org.telegram.ui.sn0;
public final class ob implements Runnable {
    public final int f17714a;
    public final int f17715b;
    public final Object f17716c;
    public final Object d;
    public final Object e;
    public final Object f17717f;
    public final Object h;
    public final Object f17718n;
    public final Object f17719r;
    public final Object f17720s;

    public ob(MessagesController messagesController, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs2, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f17714a = 0;
        this.f17716c = messagesController;
        this.d = messages_dialogs;
        this.f17717f = arrayList;
        this.e = messages_dialogs2;
        this.f17715b = i10;
        this.h = arrayList2;
        this.f17718n = arrayList3;
        this.f17719r = arrayList4;
        this.f17720s = runnable;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f17714a;
        int i11 = this.f17715b;
        Object obj = this.f17720s;
        Object obj2 = this.f17719r;
        Object obj3 = this.f17718n;
        Object obj4 = this.h;
        Object obj5 = this.f17717f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.f17716c;
        switch (i10) {
            case 0:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj5, (TLRPC.messages_Dialogs) obj6, this.f17715b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                d20 d20Var = (d20) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    d20Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new sn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                d20 d20Var2 = (d20) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.O).putChats(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity2.v0(this.f17715b, d20Var2, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    d20Var2.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                launchActivity2.B0(org.telegram.ui.Components.g5.G(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            case 3:
                jg0 jg0Var = (jg0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.l lVar = (c5.l) obj5;
                c5.p pVar = (c5.p) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                ah0 ah0Var = jg0Var.v;
                di.d dVar = jg0Var.f37049b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, lVar.f4394a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar.f(formatPluralStringComma, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new bi.l0(jg0Var, pVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    jg0Var.e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.zc(ah0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    jg0Var.e = tL_error.text;
                    new org.telegram.ui.Components.zc(ah0Var.Z, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                zh.n5 n5Var = (zh.n5) obj8;
                ((boolean[]) obj7)[0] = true;
                n5Var.a0((MessageObject) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new zh.v4(n5Var, (boolean[]) obj3, this.f17715b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
        }
    }

    public ob(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f17714a = i11;
        this.f17716c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.f17715b = i10;
        this.f17717f = obj3;
        this.h = obj4;
        this.f17718n = obj5;
        this.f17719r = obj6;
        this.f17720s = obj7;
    }

    public ob(jg0 jg0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.l lVar, int i10, c5.p pVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f17714a = 3;
        this.f17716c = jg0Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f17717f = lVar;
        this.f17715b = i10;
        this.h = pVar;
        this.f17718n = tL_inputStorePaymentAuthCode;
        this.f17719r = str;
        this.f17720s = tL_payments_canPurchaseStore;
    }

    public ob(zh.n5 n5Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f17714a = 4;
        this.f17716c = n5Var;
        this.d = zArr;
        this.e = messageObject;
        this.f17717f = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.f17718n = zArr2;
        this.f17715b = i10;
        this.f17719r = callback;
        this.f17720s = callback2;
    }
}
