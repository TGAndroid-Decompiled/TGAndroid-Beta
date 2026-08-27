package hh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a30;
import org.telegram.ui.ig0;
import org.telegram.ui.rf0;
import org.telegram.ui.xm0;

public final class t6 implements Runnable {

    public final int f10078a;

    public final int f10079b;

    public final Object f10080c;
    public final Object d;

    public final Object f10081e;

    public final Object f10082f;
    public final Object h;

    public final Object f10083n;

    public final Object f10084r;

    public final Object f10085s;

    public t6(u7 u7Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f10078a = 0;
        this.f10080c = u7Var;
        this.d = zArr;
        this.f10082f = messageObject;
        this.h = inputInvoice;
        this.f10083n = tL_payments_paymentFormStars;
        this.f10081e = zArr2;
        this.f10079b = i10;
        this.f10084r = callback;
        this.f10085s = callback2;
    }

    @Override
    public final void run() {
        int i10 = this.f10078a;
        int i11 = this.f10079b;
        Object obj = this.f10085s;
        Object obj2 = this.f10084r;
        Object obj3 = this.f10083n;
        Object obj4 = this.h;
        Object obj5 = this.f10082f;
        Object obj6 = this.f10081e;
        Object obj7 = this.d;
        Object obj8 = this.f10080c;
        switch (i10) {
            case 0:
                u7 u7Var = (u7) obj8;
                ((boolean[]) obj7)[0] = true;
                u7Var.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new u6(u7Var, (boolean[]) obj6, this.f10079b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                break;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.f10079b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj7;
                final String[] strArr = (String[]) obj6;
                final String[] strArr2 = (String[]) obj5;
                final lh.d dVar = (lh.d) obj4;
                final org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) obj3;
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
                    x8Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    x8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(x8Var, i12);
                    break;
                } else if (str.length() > 32) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    x8Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    x8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
                    int i13 = -iArr2[0];
                    iArr2[0] = i13;
                    AndroidUtilities.shakeViewSpring(x8Var, i13);
                    break;
                } else if (!TextUtils.equals(strArr2[0], str)) {
                    strArr2[0] = str;
                    strArr[0] = null;
                    x8Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    x8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = str;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(checkusername, new org.telegram.messenger.a(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj9, Object obj10) {
                            lh.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            strArr2[0] = null;
                            boolean z10 = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            org.telegram.ui.Cells.x8 x8Var2 = x8Var;
                            org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                            if (z10) {
                                String str2 = str;
                                strArr3[0] = str2;
                                dVar2.setEnabled(true);
                                x8Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, s3.c.e("@", str2)));
                                x8Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23391w6, c6Var2));
                                return;
                            }
                            strArr3[0] = null;
                            dVar2.setEnabled(false);
                            x8Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                            x8Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var2));
                            int[] iArr3 = iArr2;
                            int i14 = -iArr3[0];
                            iArr3[0] = i14;
                            AndroidUtilities.shakeViewSpring(x8Var2, i14);
                        }
                    });
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                a30 a30Var = (a30) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new xm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject));
                }
                break;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                a30 a30Var2 = (a30) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.f35496x1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.K).putChats(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity2.v0(this.f10079b, a30Var2, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                    }
                }
                try {
                    a30Var2.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                launchActivity2.B0(org.telegram.ui.Components.y4.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            default:
                rf0 rf0Var = (rf0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                n2.i iVar = (n2.i) obj5;
                n2.l lVar = (n2.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                ig0 ig0Var = rf0Var.v;
                lh.d dVar2 = rf0Var.f41919b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar2.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, iVar.f18150a), false, true);
                    dVar2.f(i11 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11), false);
                    dVar2.setLoading(false);
                    dVar2.setOnClickListener(new jh.b0(rf0Var, lVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 13));
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    rf0Var.f41921e = "RESPONSE_FALSE";
                    new mc(ig0Var.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                } else if (tL_error != null) {
                    rf0Var.f41921e = tL_error.text;
                    new mc(ig0Var.V, null).d0(tL_error, false);
                }
                break;
        }
    }

    public t6(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Serializable serializable, Object obj6, int i11) {
        this.f10078a = i11;
        this.f10080c = obj;
        this.d = tLObject;
        this.f10081e = obj2;
        this.f10082f = obj3;
        this.f10079b = i10;
        this.h = obj4;
        this.f10083n = obj5;
        this.f10084r = serializable;
        this.f10085s = obj6;
    }

    public t6(org.telegram.ui.Cells.g3 g3Var, int[] iArr, int i10, String[] strArr, String[] strArr2, lh.d dVar, org.telegram.ui.Cells.x8 x8Var, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr2) {
        this.f10078a = 2;
        this.f10080c = g3Var;
        this.d = iArr;
        this.f10079b = i10;
        this.f10081e = strArr;
        this.f10082f = strArr2;
        this.h = dVar;
        this.f10083n = x8Var;
        this.f10084r = c6Var;
        this.f10085s = iArr2;
    }

    public t6(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f10078a = i11;
        this.f10080c = launchActivity;
        this.d = obj;
        this.f10081e = obj2;
        this.f10079b = i10;
        this.f10082f = obj3;
        this.h = obj4;
        this.f10083n = obj5;
        this.f10084r = obj6;
        this.f10085s = obj7;
    }
}
