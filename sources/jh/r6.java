package jh;

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
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.of0;
import org.telegram.ui.vm0;
import org.telegram.ui.x60;
public final class r6 implements Runnable {
    public final int f12708a;
    public final int f12709b;
    public final Object f12710c;
    public final Object d;
    public final Object f12711e;
    public final Object f12712f;
    public final Object h;
    public final Object f12713n;
    public final Object f12714r;
    public final Object f12715s;

    public r6(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Serializable serializable, Object obj6, int i11) {
        this.f12708a = i11;
        this.f12710c = obj;
        this.d = tLObject;
        this.f12711e = obj2;
        this.f12712f = obj3;
        this.f12709b = i10;
        this.h = obj4;
        this.f12713n = obj5;
        this.f12714r = serializable;
        this.f12715s = obj6;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f12708a;
        int i11 = this.f12709b;
        Object obj = this.f12715s;
        Object obj2 = this.f12714r;
        Object obj3 = this.f12713n;
        Object obj4 = this.h;
        Object obj5 = this.f12712f;
        Object obj6 = this.f12711e;
        Object obj7 = this.d;
        Object obj8 = this.f12710c;
        switch (i10) {
            case 0:
                s7 s7Var = (s7) obj8;
                ((boolean[]) obj7)[0] = true;
                s7Var.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new s6(s7Var, (boolean[]) obj6, this.f12709b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.f12709b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj7;
                final String[] strArr = (String[]) obj6;
                final String[] strArr2 = (String[]) obj5;
                final nh.d dVar = (nh.d) obj4;
                final org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) obj3;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                final int[] iArr2 = (int[]) obj;
                final String str = ((Object) ((org.telegram.ui.Cells.g3) obj8).getText()) + "bot";
                if (str.length() < 4) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    y8Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    y8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(y8Var, i12);
                    return;
                } else if (str.length() > 32) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    y8Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    y8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var));
                    int i13 = -iArr2[0];
                    iArr2[0] = i13;
                    AndroidUtilities.shakeViewSpring(y8Var, i13);
                    return;
                } else if (!TextUtils.equals(strArr2[0], str)) {
                    strArr2[0] = str;
                    strArr[0] = null;
                    y8Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    y8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = str;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(checkusername, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj9, Object obj10) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj10;
                            nh.d dVar2 = nh.d.this;
                            dVar2.setLoading(false);
                            strArr2[0] = null;
                            boolean z10 = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                            org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                            if (z10) {
                                String str2 = str;
                                strArr3[0] = str2;
                                dVar2.setEnabled(true);
                                y8Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, u3.c.e("@", str2)));
                                y8Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23401w6, c6Var2));
                                return;
                            }
                            strArr3[0] = null;
                            dVar2.setEnabled(false);
                            y8Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                            y8Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var2));
                            int[] iArr3 = iArr2;
                            int i14 = -iArr3[0];
                            iArr3[0] = i14;
                            AndroidUtilities.shakeViewSpring(y8Var2, i14);
                        }
                    });
                    return;
                } else {
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                x60 x60Var = (x60) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new vm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                x60 x60Var2 = (x60) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.f35560x1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.K).putChats(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity2.v0(this.f12709b, x60Var2, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    x60Var2.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                launchActivity2.B0(org.telegram.ui.Components.c5.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                of0 of0Var = (of0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                p2.i iVar = (p2.i) obj5;
                p2.l lVar = (p2.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                fg0 fg0Var = of0Var.v;
                nh.d dVar2 = of0Var.f41111b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar2.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, iVar.f45460a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar2.f(formatPluralStringComma, false);
                    dVar2.setLoading(false);
                    dVar2.setOnClickListener(new lh.b0(of0Var, lVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 13));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    of0Var.f41113e = "RESPONSE_FALSE";
                    new tc(fg0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    of0Var.f41113e = tL_error.text;
                    new tc(fg0Var.V, null).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public r6(s7 s7Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f12708a = 0;
        this.f12710c = s7Var;
        this.d = zArr;
        this.f12712f = messageObject;
        this.h = inputInvoice;
        this.f12713n = tL_payments_paymentFormStars;
        this.f12711e = zArr2;
        this.f12709b = i10;
        this.f12714r = callback;
        this.f12715s = callback2;
    }

    public r6(org.telegram.ui.Cells.g3 g3Var, int[] iArr, int i10, String[] strArr, String[] strArr2, nh.d dVar, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr2) {
        this.f12708a = 2;
        this.f12710c = g3Var;
        this.d = iArr;
        this.f12709b = i10;
        this.f12711e = strArr;
        this.f12712f = strArr2;
        this.h = dVar;
        this.f12713n = y8Var;
        this.f12714r = c6Var;
        this.f12715s = iArr2;
    }

    public r6(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f12708a = i11;
        this.f12710c = launchActivity;
        this.d = obj;
        this.f12711e = obj2;
        this.f12709b = i10;
        this.f12712f = obj3;
        this.h = obj4;
        this.f12713n = obj5;
        this.f12714r = obj6;
        this.f12715s = obj7;
    }
}
