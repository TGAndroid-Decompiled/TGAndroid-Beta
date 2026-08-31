package hg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import mh.t7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b30;
import org.telegram.ui.c10;
import org.telegram.ui.c71;
import org.telegram.ui.fg;
import org.telegram.ui.hm0;
import org.telegram.ui.if0;
import org.telegram.ui.im0;
import org.telegram.ui.jn;
import org.telegram.ui.ng0;
import org.telegram.ui.tm0;
import org.telegram.ui.uf0;
import org.telegram.ui.xf0;
import org.telegram.ui.xn;
import qh.va;
public final class e0 implements RequestDelegate {
    public final int f7454a;
    public final Object f7455b;
    public final Object f7456c;
    public final Object d;
    public final Object f7457e;
    public final Object f7458f;

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f7454a = i10;
        this.f7457e = obj;
        this.f7455b = obj2;
        this.f7456c = obj3;
        this.d = obj4;
        this.f7458f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f7454a;
        Object obj = this.f7458f;
        Object obj2 = this.d;
        Object obj3 = this.f7456c;
        Object obj4 = this.f7455b;
        Object obj5 = this.f7457e;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (t0) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (t0) obj, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (Utilities.Callback) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new g0((t7) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (qc) obj, tL_error));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lh.e1(tLObject, (Object) ((String[]) obj5), (Object) ((FrameLayout) obj4), (Object) ((g90) obj3), (Object) ((h3) obj2), (Object) ((g6) obj), 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new lh.e1((xn) obj5, (af.f) obj4, (org.telegram.ui.Cells.t1) obj3, (String) obj2, tLObject, (CharacterStyle) obj));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new g0((NotificationCenter.NotificationCenterDelegate) ((xn) obj5), tL_error, (TLObject) obj4, (Object) tLObject, (Object) ((fg) obj3), (Object) ((String) obj2), (Object) ((af.f) obj), 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new g0((jn) obj5, (org.telegram.ui.ActionBar.d2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new lh.e1(tL_error, (Context) obj5, (g6) obj4, (qh.d) obj3, (h3) obj2, (Runnable) obj));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new lh.e1((yx0) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, 13, false));
                return;
            case 9:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new g0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.d2) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                return;
            case 10:
                xf0 xf0Var = (xf0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                b30 b30Var = (b30) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new if0((Object) xf0Var, (Object) tL_inputStorePaymentAuthCode, (Object) ((TL_update.TL_updateSentPhoneCode) obj6), 3));
                    }
                    xf0Var.v.getMessagesController().processUpdates(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new uf0(xf0Var, 3));
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new c10(b30Var, 25));
                    return;
                } else {
                    return;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new g0((NotificationCenter.NotificationCenterDelegate) ((ng0) obj5), tL_error, tLObject, (Object) ((Bundle) obj4), (Object) ((String) obj3), (Object) ((l7.w0) obj2), (Object) ((TLObject) obj), 11));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new g0((hm0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (im0) obj2, tL_error, (tm0) obj));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new lh.e1((c71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.e1((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (va) obj2, (ml) obj, 20, false));
                return;
        }
    }
}
