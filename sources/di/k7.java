package di;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.be0;
import org.telegram.ui.fd0;
import org.telegram.ui.ij0;
import org.telegram.ui.iz;
import org.telegram.ui.jj0;
import org.telegram.ui.kd0;
import org.telegram.ui.lc0;
import org.telegram.ui.ld0;
import org.telegram.ui.lm;
import org.telegram.ui.tj0;
import org.telegram.ui.x11;
public final class k7 implements RequestDelegate {
    public final int f8916a;
    public final Object f8917b;
    public final Object f8918c;
    public final Object d;
    public final Object f8919e;
    public final Object f8920f;

    public k7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f8916a = i7;
        this.f8917b = obj;
        this.f8918c = obj2;
        this.d = obj3;
        this.f8919e = obj4;
        this.f8920f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f8916a;
        Object obj = this.f8920f;
        Object obj2 = this.d;
        Object obj3 = this.f8918c;
        Object obj4 = this.f8917b;
        Object obj5 = this.f8919e;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new j6((u8) obj4, tLObject, (gj) obj3, (TLRPC.InputInvoice) obj2, (z10) obj5, (org.telegram.ui.Components.cc) obj, tL_error));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new bi.p1((int[]) obj4, tLObject, (np) obj3, (TLRPC.User[]) obj2, (hi.mb) obj5, (hi.kb) obj, 9, false));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bi.p1(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((z70) obj2), (Object) ((org.telegram.ui.ActionBar.u2) obj5), (Object) ((org.telegram.ui.ActionBar.e6) obj), 11));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.p1((an) obj4, (vf.b) obj3, (org.telegram.ui.Cells.q1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new j6((an) obj4, tL_error, (TLObject) obj3, tLObject, (z2) obj2, (String) obj5, (vf.b) obj));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new j6((lm) obj4, (org.telegram.ui.ActionBar.t1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (gj) obj3, tL_error, 6));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new bi.p1(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.e6) obj3, (hi.d) obj2, (org.telegram.ui.p6) obj5, (Runnable) obj));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new bi.p1((bw0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 16, false));
                return;
            case 8:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new j6((LaunchActivity) obj4, (org.telegram.ui.ActionBar.t1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                return;
            case 9:
                kd0 kd0Var = (kd0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                u80 u80Var = (u80) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = np.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = z02.get(i10);
                        i10++;
                        org.telegram.messenger.g0.h3(new lc0(kd0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    kd0Var.f48641w.getMessagesController().O3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.h3(new fd0(kd0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new iz(u80Var, 28));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.g0.h3(new j6((is) ((be0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((ld0) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new j6((ij0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (jj0) obj5, tL_error, (tj0) obj));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new bi.p1((x11) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new j6(tL_error, (wg.t) obj4, tLObject, (np) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.e2) obj5, (wg.t) obj, 16));
                return;
            default:
                org.telegram.messenger.g0.h3(new j6(tL_error, (z10) obj5, tLObject, (np) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.e2) obj2, (z10) obj));
                return;
        }
    }

    public k7(z10 z10Var, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.e2 e2Var, z10 z10Var2) {
        this.f8916a = 14;
        this.f8919e = z10Var;
        this.f8917b = npVar;
        this.f8918c = tL_inputInvoicePremiumGiftCode;
        this.d = e2Var;
        this.f8920f = z10Var2;
    }

    public k7(lm lmVar, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, gj gjVar) {
        this.f8916a = 5;
        this.f8917b = lmVar;
        this.d = t1Var;
        this.f8919e = hashSet;
        this.f8920f = tL_inputGroupCallInviteMessage;
        this.f8918c = gjVar;
    }
}
