package ai;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b80;
import org.telegram.ui.fg0;
import org.telegram.ui.of0;
import org.telegram.ui.xm0;
public final class c9 implements Runnable {
    public final int f1097a;
    public final int f1098b;
    public final Object f1099c;
    public final Object d;
    public final Object e;
    public final Object f1100f;
    public final Object h;
    public final Object f1101n;
    public final Object f1102r;
    public final Object f1103s;

    public c9(fa faVar, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f1097a = 0;
        this.f1099c = faVar;
        this.d = zArr;
        this.f1100f = messageObject;
        this.h = inputInvoice;
        this.f1101n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.f1098b = i10;
        this.f1102r = callback;
        this.f1103s = callback2;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f1097a;
        int i11 = this.f1098b;
        Object obj = this.f1103s;
        Object obj2 = this.f1102r;
        Object obj3 = this.f1101n;
        Object obj4 = this.h;
        Object obj5 = this.f1100f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.f1099c;
        switch (i10) {
            case 0:
                fa faVar = (fa) obj8;
                ((boolean[]) obj7)[0] = true;
                faVar.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new d9(faVar, (boolean[]) obj6, this.f1098b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.f1098b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                b80 b80Var = (b80) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.f1098b, b80Var, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    b80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                launchActivity.F0(org.telegram.ui.Components.f5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                b80 b80Var2 = (b80) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.C1;
                try {
                    b80Var2.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject2 != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity2.t0(new xm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            default:
                of0 of0Var = (of0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.l lVar = (c5.l) obj5;
                c5.o oVar = (c5.o) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                fg0 fg0Var = of0Var.v;
                ei.d dVar = of0Var.f39764b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, lVar.f4763a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar.f(formatPluralStringComma, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new ci.e0(of0Var, oVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    of0Var.e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.xc(fg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    of0Var.e = tL_error.text;
                    new org.telegram.ui.Components.xc(fg0Var.Z, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public c9(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Serializable serializable, Object obj6, int i11) {
        this.f1097a = i11;
        this.f1099c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f1100f = obj3;
        this.f1098b = i10;
        this.h = obj4;
        this.f1101n = obj5;
        this.f1102r = serializable;
        this.f1103s = obj6;
    }

    public c9(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f1097a = i11;
        this.f1099c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.f1098b = i10;
        this.f1100f = obj3;
        this.h = obj4;
        this.f1101n = obj5;
        this.f1102r = obj6;
        this.f1103s = obj7;
    }
}
