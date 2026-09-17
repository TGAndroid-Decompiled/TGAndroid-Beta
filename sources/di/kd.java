package di;

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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.co;
import org.telegram.ui.dn0;
import org.telegram.ui.fg0;
import org.telegram.ui.g10;
import org.telegram.ui.mg;
import org.telegram.ui.on;
import org.telegram.ui.pf0;
import org.telegram.ui.rm0;
import org.telegram.ui.sm0;
import org.telegram.ui.t71;
import org.telegram.ui.vg0;
import org.telegram.ui.ze;
public final class kd implements RequestDelegate {
    public final int f7515a;
    public final Object f7516b;
    public final Object f7517c;
    public final Object d;
    public final Object f7518e;
    public final Object f7519f;

    public kd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f7515a = i10;
        this.f7516b = obj;
        this.f7517c = obj2;
        this.d = obj3;
        this.f7518e = obj4;
        this.f7519f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f7515a;
        Object obj = this.f7519f;
        Object obj2 = this.f7518e;
        Object obj3 = this.d;
        Object obj4 = this.f7517c;
        Object obj5 = this.f7516b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.h8((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (jd) obj2, (hd) obj, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bi.h8(tLObject, (String[]) obj5, (FrameLayout) obj4, (d90) obj3, (org.telegram.ui.ActionBar.f3) obj2, (org.telegram.ui.ActionBar.f6) obj, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bi.h8((co) obj5, (of.e) obj4, (org.telegram.ui.Cells.t1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ze((co) obj5, tL_error, (TLObject) obj4, tLObject, (mg) obj3, (String) obj2, (of.e) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ze((on) obj5, (org.telegram.ui.ActionBar.b2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.h8(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.f6) obj4, (d) obj3, (org.telegram.ui.ActionBar.f3) obj2, (Runnable) obj, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bi.h8((ux0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ze((KeyEvent.Callback) ((LaunchActivity) obj5), (Object) ((org.telegram.ui.ActionBar.b2) obj4), (Object) tL_error, (String) obj3, (Object) ((Bundle) obj2), tLObject, (Object) ((TL_account.sendConfirmPhoneCode) obj), 3));
                return;
            case 8:
                fg0 fg0Var = (fg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                in0 in0Var = (in0) obj;
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
                    AndroidUtilities.runOnUIThread(new g10(in0Var, 25));
                    return;
                } else {
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new ze((vg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (m2.t) obj2, (TLObject) obj, 5));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ze((Object) ((rm0) obj5), (Object) tLObject, (String) obj4, (TLObject) ((TLRPC.TL_secureRequiredType) obj3), (Object) ((sm0) obj2), (Object) tL_error, (Object) ((dn0) obj), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new bi.h8((t71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ze(tL_error, (ug.w) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (ug.w) obj, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ze(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (Utilities.Callback) obj, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ze((zh.s5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.yc) obj, tL_error, 11));
                return;
        }
    }

    public kd(ux0 ux0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f7515a = 6;
        this.f7517c = ux0Var;
        this.d = editTextBoldCursor;
        this.f7518e = textView;
        this.f7519f = textView2;
        this.f7516b = iArr;
    }
}
