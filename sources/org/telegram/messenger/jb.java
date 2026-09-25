package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.n80;
import org.telegram.ui.qg0;
import org.telegram.ui.zf0;
public final class jb implements Runnable {
    public final int f16722a;
    public final int f16723b;
    public final Object f16724c;
    public final Object d;
    public final Object e;
    public final Object f16725f;
    public final Object h;
    public final Object f16726n;
    public final Object f16727r;
    public final Object f16728s;

    public jb(MessagesController messagesController, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs2, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f16722a = 0;
        this.f16724c = messagesController;
        this.d = messages_dialogs;
        this.f16725f = arrayList;
        this.e = messages_dialogs2;
        this.f16723b = i10;
        this.h = arrayList2;
        this.f16726n = arrayList3;
        this.f16727r = arrayList4;
        this.f16728s = runnable;
    }

    @Override
    public final void run() {
        String formatPluralStringComma;
        int i10 = this.f16722a;
        int i11 = this.f16723b;
        Object obj = this.f16728s;
        Object obj2 = this.f16727r;
        Object obj3 = this.f16726n;
        Object obj4 = this.h;
        Object obj5 = this.f16725f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.f16724c;
        switch (i10) {
            case 0:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj5, (TLRPC.messages_Dialogs) obj6, this.f16723b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                return;
            case 1:
                int[] iArr = (int[]) obj7;
                final String[] strArr = (String[]) obj6;
                final String[] strArr2 = (String[]) obj5;
                final ci.d dVar = (ci.d) obj4;
                final org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) obj3;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                final int[] iArr2 = (int[]) obj;
                final String str = ((Object) ((org.telegram.ui.Cells.j3) obj8).getText()) + "bot";
                if (str.length() < 4) {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    e9Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19299q7, d6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(e9Var, i12);
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
                    e9Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19299q7, d6Var));
                    int i13 = -iArr2[0];
                    iArr2[0] = i13;
                    AndroidUtilities.shakeViewSpring(e9Var, i13);
                    return;
                } else if (!TextUtils.equals(strArr2[0], str)) {
                    strArr2[0] = str;
                    strArr[0] = null;
                    e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B6, d6Var));
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    checkusername.username = str;
                    dVar.setLoading(true);
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(checkusername, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj9, Object obj10) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj10;
                            ci.d dVar2 = ci.d.this;
                            dVar2.setLoading(false);
                            strArr2[0] = null;
                            boolean z10 = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                            String[] strArr3 = strArr;
                            org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                            org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                            if (z10) {
                                String str2 = str;
                                strArr3[0] = str2;
                                dVar2.setEnabled(true);
                                e9Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, v7.j.g("@", str2)));
                                e9Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19409w6, d6Var2));
                                return;
                            }
                            strArr3[0] = null;
                            dVar2.setEnabled(false);
                            e9Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                            e9Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19299q7, d6Var2));
                            int[] iArr3 = iArr2;
                            int i14 = -iArr3[0];
                            iArr3[0] = i14;
                            AndroidUtilities.shakeViewSpring(e9Var2, i14);
                        }
                    });
                    return;
                } else {
                    return;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                n80 n80Var = (n80) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new gn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject));
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                n80 n80Var2 = (n80) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.O).putChats(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity2.v0(this.f16723b, n80Var2, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    n80Var2.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                launchActivity2.B0(org.telegram.ui.Components.e5.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            case 4:
                zf0 zf0Var = (zf0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.k kVar = (c5.k) obj5;
                c5.o oVar = (c5.o) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                qg0 qg0Var = zf0Var.v;
                ci.d dVar2 = zf0Var.f40462b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar2.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, kVar.f3896a), false, true);
                    if (i11 == 7) {
                        formatPluralStringComma = LocaleController.getString(R.string.SMSFeePurchaseText);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11);
                    }
                    dVar2.f(formatPluralStringComma, false);
                    dVar2.setLoading(false);
                    dVar2.setOnClickListener(new ai.s0(zf0Var, oVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    zf0Var.e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.xc(qg0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    zf0Var.e = tL_error.text;
                    new org.telegram.ui.Components.xc(qg0Var.Z, null).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                yh.s5 s5Var = (yh.s5) obj8;
                ((boolean[]) obj7)[0] = true;
                s5Var.a0((MessageObject) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new yh.a5(s5Var, (boolean[]) obj3, this.f16723b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                return;
        }
    }

    public jb(org.telegram.ui.Cells.j3 j3Var, int[] iArr, int i10, String[] strArr, String[] strArr2, ci.d dVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr2) {
        this.f16722a = 1;
        this.f16724c = j3Var;
        this.d = iArr;
        this.f16723b = i10;
        this.e = strArr;
        this.f16725f = strArr2;
        this.h = dVar;
        this.f16726n = e9Var;
        this.f16727r = d6Var;
        this.f16728s = iArr2;
    }

    public jb(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f16722a = i11;
        this.f16724c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.f16723b = i10;
        this.f16725f = obj3;
        this.h = obj4;
        this.f16726n = obj5;
        this.f16727r = obj6;
        this.f16728s = obj7;
    }

    public jb(zf0 zf0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.k kVar, int i10, c5.o oVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f16722a = 4;
        this.f16724c = zf0Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f16725f = kVar;
        this.f16723b = i10;
        this.h = oVar;
        this.f16726n = tL_inputStorePaymentAuthCode;
        this.f16727r = str;
        this.f16728s = tL_payments_canPurchaseStore;
    }

    public jb(yh.s5 s5Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f16722a = 5;
        this.f16724c = s5Var;
        this.d = zArr;
        this.e = messageObject;
        this.f16725f = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.f16726n = zArr2;
        this.f16723b = i10;
        this.f16727r = callback;
        this.f16728s = callback2;
    }
}
