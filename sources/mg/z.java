package mg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.af;
import org.telegram.ui.fn;
import org.telegram.ui.gf0;
import org.telegram.ui.ne0;
import org.telegram.ui.ok0;
import org.telegram.ui.pk0;
import org.telegram.ui.qd0;
import org.telegram.ui.s31;
import org.telegram.ui.se0;
import org.telegram.ui.un;
import org.telegram.ui.v8;
import org.telegram.ui.w50;
import org.telegram.ui.zk0;
import org.telegram.ui.zy;
import rh.e6;
import vh.h9;
public final class z implements RequestDelegate {
    public final int f13296a;
    public final Object f13297b;
    public final Object f13298c;
    public final Object d;
    public final Object e;
    public final Object f13299f;

    public z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f13296a = i10;
        this.e = obj;
        this.f13297b = obj2;
        this.f13298c = obj3;
        this.d = obj4;
        this.f13299f = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f13296a;
        Object obj = this.f13299f;
        Object obj2 = this.d;
        Object obj3 = this.f13298c;
        Object obj4 = this.f13297b;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new c0(tL_error, (o0) obj5, tLObject, (vp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (k2) obj2, (o0) obj, 0));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new c0(tL_error, (q20) obj5, tLObject, (vp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (k2) obj2, (q20) obj, 1));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new v8(tLObject, (String[]) obj5, (FrameLayout) obj4, (p80) obj3, (z2) obj2, (p6) obj, 0));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new v8((k2) ((un) obj5), (Object) ((gf.e) obj4), (Object) ((org.telegram.ui.Cells.q1) obj3), (Object) ((String) obj2), tLObject, (Object) ((CharacterStyle) obj), 2));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new c0((us) ((un) obj5), tL_error, (TLObject) obj4, (Object) tLObject, (Object) ((af) obj3), (Object) ((String) obj2), (Object) ((gf.e) obj), 3));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new c0((fn) obj5, (org.telegram.ui.ActionBar.x1) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (jj) obj, tL_error));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new v8((TLObject) tL_error, (Context) obj5, (p6) obj4, (Object) ((vh.d) obj3), (Object) ((org.telegram.ui.p6) obj2), (Runnable) obj, 3));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new v8((Object) ((cx0) obj5), tLObject, (Object) ((EditTextBoldCursor) obj4), (Object) ((TextView) obj3), (Object) ((TextView) obj2), (Object) ((int[]) obj), 4));
                return;
            case 8:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new c0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.x1) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                return;
            case 9:
                se0 se0Var = (se0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                w50 w50Var = (w50) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = vp.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = z02.get(i11);
                        i11++;
                        org.telegram.messenger.i0.g3(new qd0(se0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 6));
                    }
                    se0Var.f41491w.getMessagesController().L3(updates, false);
                    org.telegram.messenger.u1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.i0.g3(new ne0(se0Var, 4));
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new zy(w50Var, 28));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.messenger.i0.g3(new c0((us) ((gf0) obj5), tL_error, tLObject, (Object) ((Bundle) obj4), (Object) ((String) obj3), (Object) ((li.k) obj2), (Object) ((TLObject) obj), 7));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new c0((ok0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (pk0) obj2, tL_error, (zk0) obj));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new v8((Object) ((s31) obj5), (Object) tL_error, (Object) ((TLRPC.InputCheckPasswordSRP) obj4), (Object) ((TLRPC.User) obj3), (Object) ((TwoStepVerificationActivity) obj2), (Object) ((TLRPC.TL_channels_editCreator) obj), 8));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new c0((e6) obj5, tLObject, (jj) obj4, (TLRPC.InputInvoice) obj3, (q20) obj2, (cc) obj, tL_error));
                return;
            default:
                org.telegram.messenger.i0.g3(new v8((Object) ((int[]) obj5), tLObject, (Object) ((vp) obj4), (Object) ((TLRPC.User[]) obj3), (Object) ((h9) obj2), (Object) ((ll) obj), 26));
                return;
        }
    }
}
