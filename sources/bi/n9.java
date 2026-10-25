package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.fn;
import org.telegram.ui.km0;
import org.telegram.ui.lf0;
import org.telegram.ui.lm0;
import org.telegram.ui.m61;
import org.telegram.ui.oe0;
import org.telegram.ui.of0;
import org.telegram.ui.p00;
import org.telegram.ui.un;
import org.telegram.ui.wm0;
public final class n9 implements RequestDelegate {
    public final int f5142a;
    public final Object f5143b;
    public final Object f5144c;
    public final Object d;
    public final Object e;
    public final Object f5145f;

    public n9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5142a = i10;
        this.f5143b = obj;
        this.f5144c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f5145f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5142a;
        Object obj = this.f5145f;
        Object obj2 = this.d;
        Object obj3 = this.f5144c;
        Object obj4 = this.f5143b;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new r7((ca) obj4, tLObject, (MessageObject) obj3, (TLRPC.InputInvoice) obj2, (Utilities.Callback) obj5, (org.telegram.ui.Components.wc) obj, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((int[]) obj4, tLObject, (MessagesController) obj3, (TLRPC.User[]) obj2, (fi.mc) obj5, (fi.kc) obj, 8));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c3(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((z90) obj2), (Object) ((org.telegram.ui.ActionBar.k3) obj5), (Object) ((org.telegram.ui.ActionBar.u6) obj), 11));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c3((un) obj4, (qf.c) obj3, (org.telegram.ui.Cells.s1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r7((un) obj4, tL_error, (TLObject) obj3, tLObject, (t3) obj2, (String) obj5, (qf.c) obj));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new r7((fn) obj4, (org.telegram.ui.ActionBar.e2) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (MessageObject) obj3, tL_error, 6));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c3(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.u6) obj3, (fi.d) obj2, (org.telegram.ui.s6) obj5, (Runnable) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c3((cz0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 15));
                return;
            case 8:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new r7((LaunchActivity) obj4, (org.telegram.ui.ActionBar.e2) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                return;
            case 9:
                of0 of0Var = (of0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                e10 e10Var = (e10) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new oe0(of0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    of0Var.v.getMessagesController().lambda$processUpdates$379(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new lf0(of0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new p00(e10Var, 27));
                    return;
                } else {
                    return;
                }
            case 10:
                AndroidUtilities.runOnUIThread(new r7((NotificationCenter.NotificationCenterDelegate) ((fg0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((k6.c) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new r7((km0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (lm0) obj5, tL_error, (wm0) obj));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new c3((m61) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new r7(tL_error, (vg.v) obj4, tLObject, (MessagesController) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.r2) obj5, (vg.v) obj, 15));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r7(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.r2) obj2, (Utilities.Callback) obj));
                return;
        }
    }

    public n9(Utilities.Callback callback, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.r2 r2Var, Utilities.Callback callback2) {
        this.f5142a = 14;
        this.e = callback;
        this.f5143b = messagesController;
        this.f5144c = tL_inputInvoicePremiumGiftCode;
        this.d = r2Var;
        this.f5145f = callback2;
    }

    public n9(fn fnVar, org.telegram.ui.ActionBar.e2 e2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject) {
        this.f5142a = 5;
        this.f5143b = fnVar;
        this.d = e2Var;
        this.e = hashSet;
        this.f5145f = tL_inputGroupCallInviteMessage;
        this.f5144c = messageObject;
    }
}
