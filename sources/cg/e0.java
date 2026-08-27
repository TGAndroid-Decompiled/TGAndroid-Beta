package cg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import hh.u7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import lh.kc;
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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.am0;
import org.telegram.ui.bf0;
import org.telegram.ui.bm0;
import org.telegram.ui.dn;
import org.telegram.ui.k61;
import org.telegram.ui.mm0;
import org.telegram.ui.of0;
import org.telegram.ui.r00;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;

public final class e0 implements RequestDelegate {

    public final int f2661a;

    public final Object f2662b;

    public final Object f2663c;
    public final Object d;

    public final Object f2664e;

    public final Object f2665f;

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2661a = i10;
        this.f2664e = obj;
        this.f2662b = obj2;
        this.f2663c = obj3;
        this.d = obj4;
        this.f2665f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f2661a;
        Object obj = this.f2665f;
        Object obj2 = this.d;
        Object obj3 = this.f2663c;
        Object obj4 = this.f2662b;
        Object obj5 = this.f2664e;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0(tL_error, (v0) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (v0) obj, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h0(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (Utilities.Callback) obj, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new h0((u7) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (mc) obj, tL_error));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gh.i1((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (lh.mc) obj2, (kc) obj, 9, false));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gh.i1(tLObject, obj5, obj4, obj3, obj2, obj, 10));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gh.i1((rn) obj5, (we.d) obj4, (org.telegram.ui.Cells.s1) obj3, (String) obj2, tLObject, (CharacterStyle) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new h0((NotificationCenter.NotificationCenterDelegate) obj5, tL_error, (TLObject) obj4, (Object) tLObject, obj3, obj2, obj, 7));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new h0((dn) obj5, (org.telegram.ui.ActionBar.b2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gh.i1(tL_error, (Context) obj5, (c6) obj4, (lh.d) obj3, (e3) obj2, (Runnable) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new gh.i1((ex0) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, 14, false));
                break;
            case 10:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new h0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.b2) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                break;
            case 11:
                rf0 rf0Var = (rf0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                l11 l11Var = (l11) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = arrayListFindUpdatesAndRemove.size();
                    int i11 = 0;
                    while (true) {
                        int i12 = 3;
                        if (i11 >= size) {
                            rf0Var.v.getMessagesController().processUpdates(updates, false);
                            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                            AndroidUtilities.runOnUIThread(new of0(rf0Var, i12));
                        } else {
                            Object obj6 = arrayListFindUpdatesAndRemove.get(i11);
                            i11++;
                            AndroidUtilities.runOnUIThread(new bf0((Object) rf0Var, (Object) tL_inputStorePaymentAuthCode, obj6, i12));
                        }
                    }
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new r00(l11Var, 25));
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new h0((NotificationCenter.NotificationCenterDelegate) obj5, tL_error, tLObject, obj4, obj3, obj2, obj, 11));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new h0((am0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (bm0) obj2, tL_error, (mm0) obj));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gh.i1((k61) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                break;
        }
    }
}
