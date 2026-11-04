package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.dj0;
import org.telegram.ui.ed0;
import org.telegram.ui.fz;
import org.telegram.ui.hc0;
import org.telegram.ui.hm;
import org.telegram.ui.id0;
import org.telegram.ui.nj0;
import org.telegram.ui.q11;
import org.telegram.ui.wd0;
import org.telegram.ui.wm;
public final class s7 implements RequestDelegate {
    public final int f5960a;
    public final Object f5961b;
    public final Object f5962c;
    public final Object d;
    public final Object f5963e;
    public final Object f5964f;

    public s7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f5960a = i3;
        this.f5961b = obj;
        this.f5962c = obj2;
        this.d = obj3;
        this.f5963e = obj4;
        this.f5964f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f5960a;
        Object obj = this.f5964f;
        Object obj2 = this.d;
        Object obj3 = this.f5962c;
        Object obj4 = this.f5961b;
        Object obj5 = this.f5963e;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new s6((e9) obj4, tLObject, (zi) obj3, (TLRPC.InputInvoice) obj2, (u10) obj5, (org.telegram.ui.Components.fc) obj, tL_error));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.w1((int[]) obj4, tLObject, (hp) obj3, (TLRPC.User[]) obj2, (gi.pb) obj5, (gi.nb) obj, 9, false));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.w1(tLObject, (Object) ((String[]) obj4), (Object) ((FrameLayout) obj3), (Object) ((s70) obj2), (Object) ((org.telegram.ui.ActionBar.t2) obj5), (Object) ((org.telegram.ui.ActionBar.e6) obj), 11));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.w1((wm) obj4, (sf.b) obj3, (org.telegram.ui.Cells.q1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new s6((wm) obj4, tL_error, (TLObject) obj3, tLObject, (g3) obj2, (String) obj5, (sf.b) obj));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new s6((hm) obj4, (org.telegram.ui.ActionBar.s1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (zi) obj3, tL_error, 6));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ai.w1(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.e6) obj3, (gi.d) obj2, (org.telegram.ui.q6) obj5, (Runnable) obj));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ai.w1((xv0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 15, false));
                return;
            case 8:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new s6((LaunchActivity) obj4, (org.telegram.ui.ActionBar.s1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                return;
            case 9:
                id0 id0Var = (id0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                v60 v60Var = (v60) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = hp.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = z02.get(i10);
                        i10++;
                        org.telegram.messenger.g0.h3(new hc0(id0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 6));
                    }
                    id0Var.f46252w.getMessagesController().O3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.h3(new ed0(id0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new fz(v60Var, 27));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.g0.h3(new s6((cs) ((wd0) obj4), (Object) tL_error, (Object) tLObject, (Object) ((Bundle) obj3), (String) obj2, (Object) ((k4.j) obj5), (Object) ((TLObject) obj), 9));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new s6((cj0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (dj0) obj5, tL_error, (nj0) obj));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ai.w1((q11) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new s6(tL_error, (xg.v) obj4, tLObject, (hp) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.d2) obj5, (xg.v) obj, 16));
                return;
            default:
                org.telegram.messenger.g0.h3(new s6(tL_error, (u10) obj5, tLObject, (hp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.d2) obj2, (u10) obj));
                return;
        }
    }

    public s7(u10 u10Var, hp hpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.d2 d2Var, u10 u10Var2) {
        this.f5960a = 14;
        this.f5963e = u10Var;
        this.f5961b = hpVar;
        this.f5962c = tL_inputInvoicePremiumGiftCode;
        this.d = d2Var;
        this.f5964f = u10Var2;
    }

    public s7(hm hmVar, org.telegram.ui.ActionBar.s1 s1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, zi ziVar) {
        this.f5960a = 5;
        this.f5961b = hmVar;
        this.d = s1Var;
        this.f5963e = hashSet;
        this.f5964f = tL_inputGroupCallInviteMessage;
        this.f5962c = ziVar;
    }
}
