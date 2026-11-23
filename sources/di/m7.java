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
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c21;
import org.telegram.ui.ce0;
import org.telegram.ui.hd0;
import org.telegram.ui.ld0;
import org.telegram.ui.lj0;
import org.telegram.ui.lz;
import org.telegram.ui.mc0;
import org.telegram.ui.md0;
import org.telegram.ui.mj0;
import org.telegram.ui.mm;
import org.telegram.ui.ne;
import org.telegram.ui.wj0;
public final class m7 implements RequestDelegate {
    public final int f9347a;
    public final Object f9348b;
    public final Object f9349c;
    public final Object d;
    public final Object f9350e;
    public final Object f9351f;

    public m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f9347a = i7;
        this.f9348b = obj;
        this.f9349c = obj2;
        this.d = obj3;
        this.f9350e = obj4;
        this.f9351f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9347a;
        Object obj = this.f9351f;
        Object obj2 = this.d;
        Object obj3 = this.f9349c;
        Object obj4 = this.f9348b;
        Object obj5 = this.f9350e;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new m6((y8) obj4, tLObject, (gj) obj3, (TLRPC.InputInvoice) obj2, (y10) obj5, (org.telegram.ui.Components.lc) obj, tL_error));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.l2((int[]) obj4, tLObject, (np) obj3, (TLRPC.User[]) obj2, (hi.mb) obj5, (hi.kb) obj, 9, false));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.l2(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((m80) obj2), (Object) ((org.telegram.ui.ActionBar.w2) obj5), (Object) ((org.telegram.ui.ActionBar.h6) obj), 11));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.l2((bn) obj4, (vf.b) obj3, (org.telegram.ui.Cells.r1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new m6((bn) obj4, tL_error, (TLObject) obj3, tLObject, (ne) obj2, (String) obj5, (vf.b) obj));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new m6((mm) obj4, (org.telegram.ui.ActionBar.t1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (gj) obj3, tL_error, 6));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new bi.l2(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.h6) obj3, (hi.e) obj2, (org.telegram.ui.o6) obj5, (Runnable) obj));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new bi.l2((kw0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 16, false));
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
                q20 q20Var = (q20) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList B0 = np.B0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = B0.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = B0.get(i10);
                        i10++;
                        org.telegram.messenger.g0.g3(new mc0(ld0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    ld0Var.f49601w.getMessagesController().V3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.g3(new hd0(ld0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new lz(q20Var, 28));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.g0.g3(new m6((gs) ((ce0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((md0) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new m6((lj0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (mj0) obj5, tL_error, (wj0) obj));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new bi.l2((c21) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new m6(tL_error, (wg.v) obj4, tLObject, (np) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.g2) obj5, (wg.v) obj, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new m6(tL_error, (y10) obj5, tLObject, (np) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.g2) obj2, (y10) obj));
                return;
        }
    }

    public m7(y10 y10Var, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, y10 y10Var2) {
        this.f9347a = 14;
        this.f9350e = y10Var;
        this.f9348b = npVar;
        this.f9349c = tL_inputInvoicePremiumGiftCode;
        this.d = g2Var;
        this.f9351f = y10Var2;
    }

    public m7(mm mmVar, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, gj gjVar) {
        this.f9347a = 5;
        this.f9348b = mmVar;
        this.d = t1Var;
        this.f9350e = hashSet;
        this.f9351f = tL_inputGroupCallInviteMessage;
        this.f9349c = gjVar;
    }
}
