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
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.n20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b21;
import org.telegram.ui.bn;
import org.telegram.ui.de0;
import org.telegram.ui.id0;
import org.telegram.ui.lj0;
import org.telegram.ui.lz;
import org.telegram.ui.mc0;
import org.telegram.ui.md0;
import org.telegram.ui.mj0;
import org.telegram.ui.mm;
import org.telegram.ui.nd0;
import org.telegram.ui.ne;
import org.telegram.ui.wj0;
public final class m7 implements RequestDelegate {
    public final int f9314a;
    public final Object f9315b;
    public final Object f9316c;
    public final Object d;
    public final Object f9317e;
    public final Object f9318f;

    public m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f9314a = i7;
        this.f9315b = obj;
        this.f9316c = obj2;
        this.d = obj3;
        this.f9317e = obj4;
        this.f9318f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9314a;
        Object obj = this.f9318f;
        Object obj2 = this.d;
        Object obj3 = this.f9316c;
        Object obj4 = this.f9315b;
        Object obj5 = this.f9317e;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new m6((x8) obj4, tLObject, (fj) obj3, (TLRPC.InputInvoice) obj2, (x10) obj5, (org.telegram.ui.Components.lc) obj, tL_error));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.h2((int[]) obj4, tLObject, (mp) obj3, (TLRPC.User[]) obj2, (hi.nb) obj5, (hi.lb) obj, 9, false));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.h2(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((k80) obj2), (Object) ((org.telegram.ui.ActionBar.x2) obj5), (Object) ((org.telegram.ui.ActionBar.i6) obj), 11));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.h2((bn) obj4, (vf.b) obj3, (org.telegram.ui.Cells.r1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new m6((bn) obj4, tL_error, (TLObject) obj3, tLObject, (ne) obj2, (String) obj5, (vf.b) obj));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new m6((mm) obj4, (org.telegram.ui.ActionBar.u1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (fj) obj3, tL_error, 6));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new bi.h2(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.i6) obj3, (hi.d) obj2, (org.telegram.ui.o6) obj5, (Runnable) obj));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new bi.h2((iw0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 16, false));
                return;
            case 8:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new m6((LaunchActivity) obj4, (org.telegram.ui.ActionBar.u1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                return;
            case 9:
                md0 md0Var = (md0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                n20 n20Var = (n20) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList B0 = mp.B0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = B0.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = B0.get(i10);
                        i10++;
                        org.telegram.messenger.g0.g3(new mc0(md0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    md0Var.f49816w.getMessagesController().V3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.g3(new id0(md0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new lz(n20Var, 28));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.g0.g3(new m6((fs) ((de0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((nd0) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new m6((lj0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (mj0) obj5, tL_error, (wj0) obj));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new bi.h2((b21) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new m6(tL_error, (wg.v) obj4, tLObject, (mp) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.h2) obj5, (wg.v) obj, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new m6(tL_error, (x10) obj5, tLObject, (mp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.h2) obj2, (x10) obj));
                return;
        }
    }

    public m7(x10 x10Var, mp mpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.h2 h2Var, x10 x10Var2) {
        this.f9314a = 14;
        this.f9317e = x10Var;
        this.f9315b = mpVar;
        this.f9316c = tL_inputInvoicePremiumGiftCode;
        this.d = h2Var;
        this.f9318f = x10Var2;
    }

    public m7(mm mmVar, org.telegram.ui.ActionBar.u1 u1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, fj fjVar) {
        this.f9314a = 5;
        this.f9315b = mmVar;
        this.d = u1Var;
        this.f9317e = hashSet;
        this.f9318f = tL_inputGroupCallInviteMessage;
        this.f9316c = fjVar;
    }
}
