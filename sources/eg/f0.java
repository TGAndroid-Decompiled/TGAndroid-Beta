package eg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import jh.s7;
import nh.ac;
import nh.yb;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.fn;
import org.telegram.ui.jm0;
import org.telegram.ui.kf0;
import org.telegram.ui.n20;
import org.telegram.ui.n61;
import org.telegram.ui.of0;
import org.telegram.ui.q00;
import org.telegram.ui.tn;
import org.telegram.ui.xe0;
import org.telegram.ui.xl0;
import org.telegram.ui.yl0;
import org.telegram.ui.zf;
public final class f0 implements RequestDelegate {
    public final int f5986a;
    public final Object f5987b;
    public final Object f5988c;
    public final Object d;
    public final Object f5989e;
    public final Object f5990f;

    public f0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5986a = i10;
        this.f5989e = obj;
        this.f5987b = obj2;
        this.f5988c = obj3;
        this.d = obj4;
        this.f5990f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5986a;
        Object obj = this.f5990f;
        Object obj2 = this.d;
        Object obj3 = this.f5988c;
        Object obj4 = this.f5987b;
        Object obj5 = this.f5989e;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0(tL_error, (u0) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (u0) obj, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h0(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (Utilities.Callback) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new h0((s7) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (tc) obj, tL_error));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ih.f1((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (ac) obj2, (yb) obj, 9, false));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ih.f1(tLObject, (Object) ((String[]) obj5), (Object) ((FrameLayout) obj4), (Object) ((y80) obj3), (Object) ((f3) obj2), (Object) ((c6) obj), 10));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ih.f1((tn) obj5, (ye.c) obj4, (org.telegram.ui.Cells.s1) obj3, (String) obj2, tLObject, (CharacterStyle) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new h0((NotificationCenter.NotificationCenterDelegate) ((tn) obj5), tL_error, (TLObject) obj4, (Object) tLObject, (Object) ((zf) obj3), (Object) ((String) obj2), (Object) ((ye.c) obj), 7));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new h0((fn) obj5, (org.telegram.ui.ActionBar.c2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ih.f1(tL_error, (Context) obj5, (c6) obj4, (nh.d) obj3, (f3) obj2, (Runnable) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ih.f1((nx0) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, 14, false));
                return;
            case 10:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new h0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.c2) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                return;
            case 11:
                of0 of0Var = (of0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                n20 n20Var = (n20) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new xe0((Object) of0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    of0Var.v.getMessagesController().processUpdates(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new kf0(of0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new q00(n20Var, 25));
                    return;
                } else {
                    return;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new h0((NotificationCenter.NotificationCenterDelegate) ((eg0) obj5), tL_error, tLObject, (Object) ((Bundle) obj4), (Object) ((String) obj3), (Object) ((l3.g0) obj2), (Object) ((TLObject) obj), 11));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new h0((xl0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (yl0) obj2, tL_error, (jm0) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ih.f1((n61) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                return;
        }
    }
}
