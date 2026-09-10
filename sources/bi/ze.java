package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.q01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.cn0;
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.i10;
import org.telegram.ui.ng;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.qm0;
import org.telegram.ui.rm0;
import org.telegram.ui.v71;
import org.telegram.ui.wg0;
public final class ze implements RequestDelegate {
    public final int f4027a;
    public final Object f4028b;
    public final Object f4029c;
    public final Object d;
    public final Object e;
    public final Object f4030f;

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f4027a = i10;
        this.f4028b = obj;
        this.f4029c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f4030f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f4027a;
        Object obj = this.f4030f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f4029c;
        Object obj5 = this.f4028b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (ye) obj2, (we) obj, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new te(tLObject, (Object) ((String[]) obj5), (Object) ((FrameLayout) obj4), (Object) ((m90) obj3), (Object) ((org.telegram.ui.ActionBar.h3) obj2), (Object) ((org.telegram.ui.ActionBar.f6) obj), 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new te((org.telegram.ui.ActionBar.p2) ((eo) obj5), (Object) ((nf.e) obj4), (Object) ((org.telegram.ui.Cells.t1) obj3), (Object) ((String) obj2), tLObject, (Object) ((CharacterStyle) obj), 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((eo) obj5, tL_error, (TLObject) obj4, tLObject, (ng) obj3, (String) obj2, (nf.e) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((pn) obj5, (org.telegram.ui.ActionBar.d2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new te((Object) tL_error, (Object) ((Context) obj5), (Object) ((org.telegram.ui.ActionBar.f6) obj4), (Object) ((d) obj3), (Object) ((org.telegram.ui.ActionBar.h3) obj2), (Object) ((Runnable) obj), 6));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new te((hy0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5));
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((KeyEvent.Callback) ((LaunchActivity) obj5), (Object) ((org.telegram.ui.ActionBar.d2) obj4), (Object) tL_error, (String) obj3, (Object) ((Bundle) obj2), tLObject, (Object) ((TL_account.sendConfirmPhoneCode) obj), 3));
                return;
            case 8:
                fg0 fg0Var = (fg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                q01 q01Var = (q01) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new pf0((Object) fg0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    fg0Var.v.getMessagesController().processUpdates(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new i10(q01Var, 25));
                    return;
                } else {
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((wg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (m.e3) obj2, (TLObject) obj, 5));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((Object) ((qm0) obj5), (Object) tLObject, (String) obj4, (TLObject) ((TLRPC.TL_secureRequiredType) obj3), (Object) ((rm0) obj2), (Object) tL_error, (Object) ((cn0) obj), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new te((v71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 11));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf(tL_error, (sg.v) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (sg.v) obj, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (Utilities.Callback) obj, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((xh.v5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.wc) obj, tL_error, 11));
                return;
        }
    }

    public ze(hy0 hy0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f4027a = 6;
        this.f4029c = hy0Var;
        this.d = editTextBoldCursor;
        this.e = textView;
        this.f4030f = textView2;
        this.f4028b = iArr;
    }
}
