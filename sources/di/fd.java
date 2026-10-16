package di;

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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b81;
import org.telegram.ui.ff;
import org.telegram.ui.fg0;
import org.telegram.ui.fo;
import org.telegram.ui.gn0;
import org.telegram.ui.jg0;
import org.telegram.ui.kf;
import org.telegram.ui.qn;
import org.telegram.ui.tf0;
import org.telegram.ui.um0;
import org.telegram.ui.vm0;
import org.telegram.ui.zg0;
import org.telegram.ui.zz;
public final class fd implements RequestDelegate {
    public final int f6962a;
    public final Object f6963b;
    public final Object f6964c;
    public final Object d;
    public final Object e;
    public final Object f6965f;

    public fd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6962a = i10;
        this.f6963b = obj;
        this.f6964c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f6965f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f6962a;
        Object obj = this.f6965f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f6964c;
        Object obj5 = this.f6963b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.k8((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (ed) obj2, (cd) obj, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bi.k8(tLObject, (String[]) obj5, (FrameLayout) obj4, (da0) obj3, (org.telegram.ui.ActionBar.e3) obj2, (org.telegram.ui.ActionBar.c6) obj, 4));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bi.k8((fo) obj5, (pf.c) obj4, (org.telegram.ui.Cells.u1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ff((fo) obj5, tL_error, (TLObject) obj4, tLObject, (kf) obj3, (String) obj2, (pf.c) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ff((qn) obj5, (org.telegram.ui.ActionBar.a2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.k8(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.c6) obj4, (d) obj3, (org.telegram.ui.ActionBar.e3) obj2, (Runnable) obj, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bi.k8((uy0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                return;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ff((Object) ((LaunchActivity) obj5), (Object) ((org.telegram.ui.ActionBar.a2) obj4), (Object) tL_error, (String) obj3, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TL_account.sendConfirmPhoneCode) obj), 3));
                return;
            case 8:
                jg0 jg0Var = (jg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                ey0 ey0Var = (ey0) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new tf0((Object) jg0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    jg0Var.v.getMessagesController().lambda$processUpdates$377(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new fg0(jg0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new zz(ey0Var, 26));
                    return;
                } else {
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new ff((zg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (m.h3) obj2, (TLObject) obj, 5));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ff((Object) ((um0) obj5), (Object) tLObject, (String) obj4, (TLObject) ((TLRPC.TL_secureRequiredType) obj3), (Object) ((vm0) obj2), (Object) tL_error, (Object) ((gn0) obj), 6));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new bi.k8((b81) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ff(tL_error, (ug.v) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.m2) obj2, (ug.v) obj, 11));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ff(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.m2) obj2, (Utilities.Callback) obj, 12));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ff((zh.n5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.zc) obj, tL_error, 14));
                return;
        }
    }

    public fd(uy0 uy0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f6962a = 6;
        this.f6964c = uy0Var;
        this.d = editTextBoldCursor;
        this.e = textView;
        this.f6965f = textView2;
        this.f6963b = iArr;
    }
}
