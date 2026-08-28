package bg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import gh.v7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import kh.qc;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.am0;
import org.telegram.ui.bg;
import org.telegram.ui.cn;
import org.telegram.ui.eg0;
import org.telegram.ui.l61;
import org.telegram.ui.lf0;
import org.telegram.ui.lm0;
import org.telegram.ui.o00;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.ye0;
import org.telegram.ui.zl0;
public final class h0 implements RequestDelegate {
    public final int f1803a;
    public final Object f1804b;
    public final Object f1805c;
    public final Object d;
    public final Object f1806e;
    public final Object f1807f;

    public h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f1803a = i9;
        this.f1806e = obj;
        this.f1804b = obj2;
        this.f1805c = obj3;
        this.d = obj4;
        this.f1807f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f1803a;
        Object obj = this.f1807f;
        Object obj2 = this.d;
        Object obj3 = this.f1805c;
        Object obj4 = this.f1804b;
        Object obj5 = this.f1806e;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (z0) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (z0) obj, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (Utilities.Callback) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k0((v7) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (oc) obj, tL_error));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new fh.k1((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (qc) obj2, (kh.oc) obj, 9, false));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new fh.k1(tLObject, (Object) ((String[]) obj5), (Object) ((FrameLayout) obj4), (Object) ((l80) obj3), (Object) ((org.telegram.ui.ActionBar.f3) obj2), (Object) ((b6) obj), 12));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new fh.k1((qn) obj5, (ve.d) obj4, (org.telegram.ui.Cells.t1) obj3, (String) obj2, tLObject, (CharacterStyle) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new k0((NotificationCenter.NotificationCenterDelegate) ((qn) obj5), tL_error, (TLObject) obj4, (Object) tLObject, (Object) ((bg) obj3), (Object) ((String) obj2), (Object) ((ve.d) obj), 7));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new k0((cn) obj5, (org.telegram.ui.ActionBar.c2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fh.k1(tL_error, (Context) obj5, (b6) obj4, (kh.d) obj3, (org.telegram.ui.ActionBar.f3) obj2, (Runnable) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fh.k1((cx0) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, 16, false));
                return;
            case 10:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new k0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.c2) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                return;
            case 11:
                of0 of0Var = (of0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                no0 no0Var = (no0) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i10);
                        i10++;
                        AndroidUtilities.runOnUIThread(new ye0((Object) of0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    of0Var.v.getMessagesController().processUpdates(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new lf0(of0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new o00(no0Var, 25));
                    return;
                } else {
                    return;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new k0((NotificationCenter.NotificationCenterDelegate) ((eg0) obj5), tL_error, tLObject, (Object) ((Bundle) obj4), (Object) ((String) obj3), (Object) ((j4.c) obj2), (Object) ((TLObject) obj), 11));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new k0((zl0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (am0) obj2, tL_error, (lm0) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fh.k1((l61) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                return;
        }
    }
}
