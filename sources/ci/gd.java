package ci;

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
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bf;
import org.telegram.ui.dg0;
import org.telegram.ui.g10;
import org.telegram.ui.k71;
import org.telegram.ui.kn;
import org.telegram.ui.lg;
import org.telegram.ui.mm0;
import org.telegram.ui.nf0;
import org.telegram.ui.nm0;
import org.telegram.ui.tg0;
import org.telegram.ui.ym0;
import org.telegram.ui.yn;
import org.telegram.ui.zf0;
public final class gd implements RequestDelegate {
    public final int f5119a;
    public final Object f5120b;
    public final Object f5121c;
    public final Object d;
    public final Object f5122e;
    public final Object f5123f;

    public gd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5119a = i10;
        this.f5120b = obj;
        this.f5121c = obj2;
        this.d = obj3;
        this.f5122e = obj4;
        this.f5123f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5119a;
        Object obj = this.f5123f;
        Object obj2 = this.f5122e;
        Object obj3 = this.d;
        Object obj4 = this.f5121c;
        Object obj5 = this.f5120b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (fd) obj2, (dd) obj, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.z8(tLObject, (String[]) obj5, (FrameLayout) obj4, (q90) obj3, (org.telegram.ui.ActionBar.f3) obj2, (org.telegram.ui.ActionBar.d6) obj, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.z8((yn) obj5, (nf.e) obj4, (org.telegram.ui.Cells.u1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bf((yn) obj5, tL_error, (TLObject) obj4, tLObject, (lg) obj3, (String) obj2, (nf.e) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bf((kn) obj5, (org.telegram.ui.ActionBar.b2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.z8(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.d6) obj4, (d) obj3, (org.telegram.ui.ActionBar.f3) obj2, (Runnable) obj, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.z8((ry0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bf((KeyEvent.Callback) ((LaunchActivity) obj5), (Object) ((org.telegram.ui.ActionBar.b2) obj4), (Object) tL_error, (String) obj3, (Object) ((Bundle) obj2), tLObject, (Object) ((TL_account.sendConfirmPhoneCode) obj), 3));
                return;
            case 8:
                dg0 dg0Var = (dg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                bo0 bo0Var = (bo0) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new nf0((Object) dg0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    dg0Var.v.getMessagesController().processUpdates(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new zf0(dg0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new g10(bo0Var, 25));
                    return;
                } else {
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new bf((tg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (la.h) obj2, (TLObject) obj, 5));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new bf((Object) ((mm0) obj5), (Object) tLObject, (String) obj4, (TLObject) ((TLRPC.TL_secureRequiredType) obj3), (Object) ((nm0) obj2), (Object) tL_error, (Object) ((ym0) obj), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.z8((k71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bf(tL_error, (tg.v) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (tg.v) obj, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new bf(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (Utilities.Callback) obj, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bf((yh.u5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.yc) obj, tL_error, 11));
                return;
        }
    }

    public gd(ry0 ry0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f5119a = 6;
        this.f5121c = ry0Var;
        this.d = editTextBoldCursor;
        this.f5122e = textView;
        this.f5123f = textView2;
        this.f5120b = iArr;
    }
}
