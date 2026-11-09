package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c21;
import org.telegram.ui.cn;
import org.telegram.ui.de0;
import org.telegram.ui.hj0;
import org.telegram.ui.ij0;
import org.telegram.ui.jd0;
import org.telegram.ui.jz;
import org.telegram.ui.nd0;
import org.telegram.ui.nm;
import org.telegram.ui.oc0;
import org.telegram.ui.sj0;
public final class r8 implements RequestDelegate {
    public final int f4629a;
    public final Object f4630b;
    public final Object f4631c;
    public final Object d;
    public final Object f4632e;
    public final Object f4633f;

    public r8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4629a = i7;
        this.f4630b = obj;
        this.f4631c = obj2;
        this.d = obj3;
        this.f4632e = obj4;
        this.f4633f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f4629a;
        Object obj = this.f4633f;
        Object obj2 = this.d;
        Object obj3 = this.f4631c;
        Object obj4 = this.f4630b;
        Object obj5 = this.f4632e;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new r7((ea) obj4, tLObject, (ij) obj3, (TLRPC.InputInvoice) obj2, (c20) obj5, (org.telegram.ui.Components.hc) obj, tL_error));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a3((int[]) obj4, tLObject, (qp) obj3, (TLRPC.User[]) obj2, (fi.pb) obj5, (fi.nb) obj, 8));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new a3(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((x70) obj2), (Object) ((org.telegram.ui.ActionBar.v2) obj5), (Object) ((org.telegram.ui.ActionBar.g6) obj), 10));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new a3((cn) obj4, (vf.b) obj3, (org.telegram.ui.Cells.q1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new r7((cn) obj4, tL_error, (TLObject) obj3, tLObject, (t3) obj2, (String) obj5, (vf.b) obj));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new r7((nm) obj4, (org.telegram.ui.ActionBar.u1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (ij) obj3, tL_error, 6));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new a3(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.g6) obj3, (fi.d) obj2, (org.telegram.ui.p6) obj5, (Runnable) obj));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new a3((zv0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 14));
                return;
            case 8:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new r7((LaunchActivity) obj4, (org.telegram.ui.ActionBar.u1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                return;
            case 9:
                nd0 nd0Var = (nd0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                ln0 ln0Var = (ln0) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = qp.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = z02.get(i10);
                        i10++;
                        org.telegram.messenger.g0.h3(new oc0(nd0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    nd0Var.f48173w.getMessagesController().O3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.h3(new jd0(nd0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new jz(ln0Var, 28));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.g0.h3(new r7((ls) ((de0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((h6.m) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new r7((hj0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (ij0) obj5, tL_error, (sj0) obj));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new a3((c21) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new r7(tL_error, (wg.u) obj4, tLObject, (qp) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.f2) obj5, (wg.u) obj, 16));
                return;
            default:
                org.telegram.messenger.g0.h3(new r7(tL_error, (c20) obj5, tLObject, (qp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.f2) obj2, (c20) obj));
                return;
        }
    }

    public r8(c20 c20Var, qp qpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.f2 f2Var, c20 c20Var2) {
        this.f4629a = 14;
        this.f4632e = c20Var;
        this.f4630b = qpVar;
        this.f4631c = tL_inputInvoicePremiumGiftCode;
        this.d = f2Var;
        this.f4633f = c20Var2;
    }

    public r8(nm nmVar, org.telegram.ui.ActionBar.u1 u1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, ij ijVar) {
        this.f4629a = 5;
        this.f4630b = nmVar;
        this.d = u1Var;
        this.f4632e = hashSet;
        this.f4633f = tL_inputGroupCallInviteMessage;
        this.f4631c = ijVar;
    }
}
