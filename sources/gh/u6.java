package gh;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.of0;
import org.telegram.ui.wm0;
import org.telegram.ui.x20;
public final class u6 implements Runnable {
    public final int f8955a;
    public final int f8956b;
    public final Object f8957c;
    public final Object d;
    public final Object f8958e;
    public final Object f8959f;
    public final Object h;
    public final Object f8960n;
    public final Object f8961r;
    public final Object f8962s;

    public u6(v7 v7Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i9, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f8955a = 0;
        this.f8957c = v7Var;
        this.d = zArr;
        this.f8959f = messageObject;
        this.h = inputInvoice;
        this.f8960n = tL_payments_paymentFormStars;
        this.f8958e = zArr2;
        this.f8956b = i9;
        this.f8961r = callback;
        this.f8962s = callback2;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i9 = this.f8955a;
        int i10 = this.f8956b;
        Object obj = this.f8962s;
        Object obj2 = this.f8961r;
        Object obj3 = this.f8960n;
        Object obj4 = this.h;
        Object obj5 = this.f8959f;
        Object obj6 = this.f8958e;
        Object obj7 = this.d;
        Object obj8 = this.f8957c;
        switch (i9) {
            case 0:
                v7 v7Var = (v7) obj8;
                ((boolean[]) obj7)[0] = true;
                v7Var.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new v6(v7Var, (boolean[]) obj6, this.f8956b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.f8956b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj7;
                final String[] strArr = (String[]) obj6;
                final String[] strArr2 = (String[]) obj5;
                final kh.d dVar = (kh.d) obj4;
                final org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) obj3;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                final int[] iArr2 = (int[]) obj;
                final String str = ((Object) ((org.telegram.ui.Cells.j3) obj8).getText()) + "bot";
                if (str.length() < 4) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    b9Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    b9Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var));
                    int i11 = -iArr2[0];
                    iArr2[0] = i11;
                    AndroidUtilities.shakeViewSpring(b9Var, i11);
                    return;
                } else if (str.length() > 32) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    b9Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    b9Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(b9Var, i12);
                    return;
                } else if (!TextUtils.equals(strArr2[0], str)) {
                    strArr2[0] = str;
                    strArr[0] = null;
                    b9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    b9Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, b6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = str;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(checkusername, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj9, Object obj10) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj10;
                            kh.d dVar2 = kh.d.this;
                            dVar2.setLoading(false);
                            strArr2[0] = null;
                            boolean z10 = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            org.telegram.ui.Cells.b9 b9Var2 = b9Var;
                            org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                            if (z10) {
                                String str2 = str;
                                strArr3[0] = str2;
                                dVar2.setEnabled(true);
                                b9Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, ta.b.d("@", str2)));
                                b9Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23334w6, b6Var2));
                                return;
                            }
                            strArr3[0] = null;
                            dVar2.setEnabled(false);
                            b9Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                            b9Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var2));
                            int[] iArr3 = iArr2;
                            int i13 = -iArr3[0];
                            iArr3[0] = i13;
                            AndroidUtilities.shakeViewSpring(b9Var2, i13);
                        }
                    });
                    return;
                } else {
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                x20 x20Var = (x20) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i10).putUsers(authorizationform.users, false);
                    launchActivity.p0(new wm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                x20 x20Var2 = (x20) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.f35493x1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.K).putChats(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity2.v0(this.f8956b, x20Var2, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    x20Var2.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                launchActivity2.B0(org.telegram.ui.Components.y4.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                of0 of0Var = (of0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                n2.i iVar = (n2.i) obj5;
                n2.l lVar = (n2.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                fg0 fg0Var = of0Var.v;
                kh.d dVar2 = of0Var.f41140b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar2.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, iVar.f18322a), false, true);
                    if (i10 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i10);
                    }
                    dVar2.f(formatPluralStringComma, false);
                    dVar2.setLoading(false);
                    dVar2.setOnClickListener(new ih.d0(of0Var, lVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 13));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    of0Var.f41142e = "RESPONSE_FALSE";
                    new oc(fg0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    of0Var.f41142e = tL_error.text;
                    new oc(fg0Var.V, null).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public u6(Object obj, TLObject tLObject, Object obj2, Object obj3, int i9, Object obj4, Object obj5, Serializable serializable, Object obj6, int i10) {
        this.f8955a = i10;
        this.f8957c = obj;
        this.d = tLObject;
        this.f8958e = obj2;
        this.f8959f = obj3;
        this.f8956b = i9;
        this.h = obj4;
        this.f8960n = obj5;
        this.f8961r = serializable;
        this.f8962s = obj6;
    }

    public u6(org.telegram.ui.Cells.j3 j3Var, int[] iArr, int i9, String[] strArr, String[] strArr2, kh.d dVar, org.telegram.ui.Cells.b9 b9Var, org.telegram.ui.ActionBar.b6 b6Var, int[] iArr2) {
        this.f8955a = 2;
        this.f8957c = j3Var;
        this.d = iArr;
        this.f8956b = i9;
        this.f8958e = strArr;
        this.f8959f = strArr2;
        this.h = dVar;
        this.f8960n = b9Var;
        this.f8961r = b6Var;
        this.f8962s = iArr2;
    }

    public u6(LaunchActivity launchActivity, Object obj, Object obj2, int i9, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f8955a = i10;
        this.f8957c = launchActivity;
        this.d = obj;
        this.f8958e = obj2;
        this.f8956b = i9;
        this.f8959f = obj3;
        this.h = obj4;
        this.f8960n = obj5;
        this.f8961r = obj6;
        this.f8962s = obj7;
    }
}
