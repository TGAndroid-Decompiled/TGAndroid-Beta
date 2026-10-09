package ci;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.bn0;
import org.telegram.ui.df;
import org.telegram.ui.fg0;
import org.telegram.ui.ln;
import org.telegram.ui.of0;
import org.telegram.ui.pm0;
import org.telegram.ui.qm0;
import org.telegram.ui.u71;
import org.telegram.ui.uz;
import org.telegram.ui.vg0;
import org.telegram.ui.ze;
import org.telegram.ui.zn;
public final class hd implements RequestDelegate {
    public final int f5175a;
    public final Object f5176b;
    public final Object f5177c;
    public final Object d;
    public final Object f5178e;
    public final Object f5179f;

    public hd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5175a = i10;
        this.f5176b = obj;
        this.f5177c = obj2;
        this.d = obj3;
        this.f5178e = obj4;
        this.f5179f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5175a;
        Object obj = this.f5179f;
        Object obj2 = this.f5178e;
        Object obj3 = this.d;
        Object obj4 = this.f5177c;
        Object obj5 = this.f5176b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.a9((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (gd) obj2, (ed) obj, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.a9(tLObject, (String[]) obj5, (FrameLayout) obj4, (ea0) obj3, (org.telegram.ui.ActionBar.f3) obj2, (org.telegram.ui.ActionBar.e6) obj, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.a9((zn) obj5, (of.e) obj4, (org.telegram.ui.Cells.u1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ze((zn) obj5, tL_error, (TLObject) obj4, tLObject, (df) obj3, (String) obj2, (of.e) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ze((ln) obj5, (org.telegram.ui.ActionBar.b2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.a9(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.e6) obj4, (d) obj3, (org.telegram.ui.ActionBar.f3) obj2, (Runnable) obj, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.a9((xy0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ze((Object) ((LaunchActivity) obj5), (Object) ((org.telegram.ui.ActionBar.b2) obj4), (Object) tL_error, (String) obj3, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TL_account.sendConfirmPhoneCode) obj), 3));
                return;
            case 8:
                fg0 fg0Var = (fg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                oo0 oo0Var = (oo0) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new of0((Object) fg0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    fg0Var.v.getMessagesController().lambda$processUpdates$377(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new bg0(fg0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uz(oo0Var, 26));
                    return;
                } else {
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new ze((vg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (la.h) obj2, (TLObject) obj, 5));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ze((Object) ((pm0) obj5), (Object) tLObject, (String) obj4, (TLObject) ((TLRPC.TL_secureRequiredType) obj3), (Object) ((qm0) obj2), (Object) tL_error, (Object) ((bn0) obj), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.a9((u71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ze(tL_error, (tg.v) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (tg.v) obj, 11));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ze(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (Utilities.Callback) obj, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ze((yh.m5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.ad) obj, tL_error, 14));
                return;
        }
    }

    public hd(xy0 xy0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f5175a = 6;
        this.f5177c = xy0Var;
        this.d = editTextBoldCursor;
        this.f5178e = textView;
        this.f5179f = textView2;
        this.f5176b = iArr;
    }
}
