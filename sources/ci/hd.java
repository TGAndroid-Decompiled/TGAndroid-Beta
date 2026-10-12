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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.df;
import org.telegram.ui.dn0;
import org.telegram.ui.eo;
import org.telegram.ui.gg0;
import org.telegram.ui.hf;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.rm0;
import org.telegram.ui.sm0;
import org.telegram.ui.wg0;
import org.telegram.ui.wz;
import org.telegram.ui.x71;
public final class hd implements RequestDelegate {
    public final int f5173a;
    public final Object f5174b;
    public final Object f5175c;
    public final Object d;
    public final Object f5176e;
    public final Object f5177f;

    public hd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5173a = i10;
        this.f5174b = obj;
        this.f5175c = obj2;
        this.d = obj3;
        this.f5176e = obj4;
        this.f5177f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5173a;
        Object obj = this.f5177f;
        Object obj2 = this.f5176e;
        Object obj3 = this.d;
        Object obj4 = this.f5175c;
        Object obj5 = this.f5174b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.a9((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (gd) obj2, (ed) obj, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.a9(tLObject, (String[]) obj5, (FrameLayout) obj4, (ia0) obj3, (org.telegram.ui.ActionBar.e3) obj2, (org.telegram.ui.ActionBar.c6) obj, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.a9((eo) obj5, (of.e) obj4, (org.telegram.ui.Cells.u1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new df((eo) obj5, tL_error, (TLObject) obj4, tLObject, (hf) obj3, (String) obj2, (of.e) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new df((pn) obj5, (org.telegram.ui.ActionBar.a2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.a9(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.c6) obj4, (d) obj3, (org.telegram.ui.ActionBar.e3) obj2, (Runnable) obj, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.a9((dz0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new df((Object) ((LaunchActivity) obj5), (Object) ((org.telegram.ui.ActionBar.a2) obj4), (Object) tL_error, (String) obj3, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TL_account.sendConfirmPhoneCode) obj), 3));
                return;
            case 8:
                gg0 gg0Var = (gg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                uo0 uo0Var = (uo0) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new pf0((Object) gg0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    gg0Var.v.getMessagesController().lambda$processUpdates$377(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new bg0(gg0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new wz(uo0Var, 26));
                    return;
                } else {
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new df((wg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (m.f3) obj2, (TLObject) obj, 5));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new df((Object) ((rm0) obj5), (Object) tLObject, (String) obj4, (TLObject) ((TLRPC.TL_secureRequiredType) obj3), (Object) ((sm0) obj2), (Object) tL_error, (Object) ((dn0) obj), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.a9((x71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new df(tL_error, (tg.u) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.m2) obj2, (tg.u) obj, 11));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new df(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.m2) obj2, (Utilities.Callback) obj, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new df((yh.n5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.zc) obj, tL_error, 14));
                return;
        }
    }

    public hd(dz0 dz0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f5173a = 6;
        this.f5175c = dz0Var;
        this.d = editTextBoldCursor;
        this.f5176e = textView;
        this.f5177f = textView2;
        this.f5174b = iArr;
    }
}
