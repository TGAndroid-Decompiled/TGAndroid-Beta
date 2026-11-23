package di;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a21;
import org.telegram.ui.bn;
import org.telegram.ui.ce0;
import org.telegram.ui.hd0;
import org.telegram.ui.jj0;
import org.telegram.ui.kj0;
import org.telegram.ui.kz;
import org.telegram.ui.lc0;
import org.telegram.ui.ld0;
import org.telegram.ui.mm;
import org.telegram.ui.ne;
import org.telegram.ui.uj0;
public final class m7 implements RequestDelegate {
    public final int f9308a;
    public final Object f9309b;
    public final Object f9310c;
    public final Object d;
    public final Object f9311e;
    public final Object f9312f;

    public m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f9308a = i7;
        this.f9309b = obj;
        this.f9310c = obj2;
        this.d = obj3;
        this.f9311e = obj4;
        this.f9312f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9308a;
        Object obj = this.f9312f;
        Object obj2 = this.d;
        Object obj3 = this.f9310c;
        Object obj4 = this.f9309b;
        Object obj5 = this.f9311e;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new m6((y8) obj4, tLObject, (fj) obj3, (TLRPC.InputInvoice) obj2, (w10) obj5, (org.telegram.ui.Components.kc) obj, tL_error));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.n2((int[]) obj4, tLObject, (mp) obj3, (TLRPC.User[]) obj2, (hi.hc) obj5, (hi.fc) obj, 9, false));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.n2(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((j80) obj2), (Object) ((org.telegram.ui.ActionBar.w2) obj5), (Object) ((org.telegram.ui.ActionBar.i6) obj), 11));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.n2((bn) obj4, (vf.b) obj3, (org.telegram.ui.Cells.r1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new m6((bn) obj4, tL_error, (TLObject) obj3, tLObject, (ne) obj2, (String) obj5, (vf.b) obj));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new m6((mm) obj4, (org.telegram.ui.ActionBar.t1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (fj) obj3, tL_error, 6));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new bi.n2(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.i6) obj3, (hi.e) obj2, (org.telegram.ui.p6) obj5, (Runnable) obj));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new bi.n2((jw0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 16, false));
                return;
            case 8:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new m6((LaunchActivity) obj4, (org.telegram.ui.ActionBar.t1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                return;
            case 9:
                ld0 ld0Var = (ld0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                xz xzVar = (xz) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList B0 = mp.B0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = B0.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = B0.get(i10);
                        i10++;
                        org.telegram.messenger.g0.g3(new lc0(ld0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    ld0Var.f49735w.getMessagesController().V3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.g3(new hd0(ld0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new kz(xzVar, 28));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.g0.g3(new m6((fs) ((ce0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((i61) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new m6((jj0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (kj0) obj5, tL_error, (uj0) obj));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new bi.n2((a21) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new m6(tL_error, (wg.u) obj4, tLObject, (mp) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.g2) obj5, (wg.u) obj, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new m6(tL_error, (w10) obj5, tLObject, (mp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.g2) obj2, (w10) obj));
                return;
        }
    }

    public m7(w10 w10Var, mp mpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, w10 w10Var2) {
        this.f9308a = 14;
        this.f9311e = w10Var;
        this.f9309b = mpVar;
        this.f9310c = tL_inputInvoicePremiumGiftCode;
        this.d = g2Var;
        this.f9312f = w10Var2;
    }

    public m7(mm mmVar, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, fj fjVar) {
        this.f9308a = 5;
        this.f9309b = mmVar;
        this.d = t1Var;
        this.f9311e = hashSet;
        this.f9312f = tL_inputGroupCallInviteMessage;
        this.f9310c = fjVar;
    }
}
