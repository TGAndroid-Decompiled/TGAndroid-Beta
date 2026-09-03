package lh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.pg0;
import org.telegram.ui.w10;
import org.telegram.ui.yf0;
public final class s6 implements Runnable {
    public final int f13056a;
    public final int f13057b;
    public final Object f13058c;
    public final Object d;
    public final Object e;
    public final Object f13059f;
    public final Object h;
    public final Object f13060n;
    public final Object f13061r;
    public final Object f13062s;

    public s6(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Serializable serializable, Object obj6, int i11) {
        this.f13056a = i11;
        this.f13058c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f13059f = obj3;
        this.f13057b = i10;
        this.h = obj4;
        this.f13060n = obj5;
        this.f13061r = serializable;
        this.f13062s = obj6;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f13056a;
        int i11 = this.f13057b;
        Object obj = this.f13062s;
        Object obj2 = this.f13061r;
        Object obj3 = this.f13060n;
        Object obj4 = this.h;
        Object obj5 = this.f13059f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.f13058c;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) obj8;
                ((boolean[]) obj7)[0] = true;
                t7Var.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new t6(t7Var, (boolean[]) obj6, this.f13057b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.f13057b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj7;
                final String[] strArr = (String[]) obj6;
                final String[] strArr2 = (String[]) obj5;
                final ph.d dVar = (ph.d) obj4;
                final org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) obj3;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                final int[] iArr2 = (int[]) obj;
                final String str = ((Object) ((org.telegram.ui.Cells.h3) obj8).getText()) + "bot";
                if (str.length() < 4) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    z8Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    z8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(z8Var, i12);
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
                    z8Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    z8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var));
                    int i13 = -iArr2[0];
                    iArr2[0] = i13;
                    AndroidUtilities.shakeViewSpring(z8Var, i13);
                    return;
                } else if (!TextUtils.equals(strArr2[0], str)) {
                    strArr2[0] = str;
                    strArr[0] = null;
                    z8Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    z8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = str;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(checkusername, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj9, Object obj10) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj10;
                            ph.d dVar2 = ph.d.this;
                            dVar2.setLoading(false);
                            strArr2[0] = null;
                            boolean z4 = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            if (z4) {
                                String str2 = str;
                                strArr3[0] = str2;
                                dVar2.setEnabled(true);
                                z8Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, vh.w2.e("@", str2)));
                                z8Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20219w6, f6Var2));
                                return;
                            }
                            strArr3[0] = null;
                            dVar2.setEnabled(false);
                            z8Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                            z8Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var2));
                            int[] iArr3 = iArr2;
                            int i14 = -iArr3[0];
                            iArr3[0] = i14;
                            AndroidUtilities.shakeViewSpring(z8Var2, i14);
                        }
                    });
                    return;
                } else {
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                w10 w10Var = (w10) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                try {
                    w10Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new fn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                w10 w10Var2 = (w10) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.f31586y1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.L).putChats(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity2.v0(this.f13057b, w10Var2, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    w10Var2.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                launchActivity2.B0(org.telegram.ui.Components.z4.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                yf0 yf0Var = (yf0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                p2.j jVar = (p2.j) obj5;
                p2.n nVar = (p2.n) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                pg0 pg0Var = yf0Var.v;
                ph.d dVar2 = yf0Var.f40260b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar2.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, jVar.f41018a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar2.f(formatPluralStringComma, false);
                    dVar2.setLoading(false);
                    dVar2.setOnClickListener(new nh.c0(yf0Var, nVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 13));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    yf0Var.e = "RESPONSE_FALSE";
                    new qc(pg0Var.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    yf0Var.e = tL_error.text;
                    new qc(pg0Var.W, null).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public s6(t7 t7Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f13056a = 0;
        this.f13058c = t7Var;
        this.d = zArr;
        this.f13059f = messageObject;
        this.h = inputInvoice;
        this.f13060n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.f13057b = i10;
        this.f13061r = callback;
        this.f13062s = callback2;
    }

    public s6(org.telegram.ui.Cells.h3 h3Var, int[] iArr, int i10, String[] strArr, String[] strArr2, ph.d dVar, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr2) {
        this.f13056a = 2;
        this.f13058c = h3Var;
        this.d = iArr;
        this.f13057b = i10;
        this.e = strArr;
        this.f13059f = strArr2;
        this.h = dVar;
        this.f13060n = z8Var;
        this.f13061r = f6Var;
        this.f13062s = iArr2;
    }

    public s6(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f13056a = i11;
        this.f13058c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.f13057b = i10;
        this.f13059f = obj3;
        this.h = obj4;
        this.f13060n = obj5;
        this.f13061r = obj6;
        this.f13062s = obj7;
    }
}
