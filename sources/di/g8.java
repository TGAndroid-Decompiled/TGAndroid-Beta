package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.de;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ce0;
import org.telegram.ui.ek0;
import org.telegram.ui.g50;
import org.telegram.ui.kd0;
public final class g8 implements Runnable {
    public final int f8626a;
    public final int f8627b;
    public final Object f8628c;
    public final Object d;
    public final Object f8629e;
    public final Object f8630f;
    public final Object h;
    public final Object f8631n;
    public final Object f8632r;
    public final Object f8633s;

    public g8(u8 u8Var, boolean[] zArr, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, z10 z10Var, z10 z10Var2) {
        this.f8626a = 0;
        this.f8628c = u8Var;
        this.d = zArr;
        this.f8630f = gjVar;
        this.h = inputInvoice;
        this.f8631n = tL_payments_paymentFormStars;
        this.f8629e = zArr2;
        this.f8627b = i7;
        this.f8632r = z10Var;
        this.f8633s = z10Var2;
    }

    @Override
    public final void run() {
        String H;
        int i7 = this.f8626a;
        int i10 = this.f8627b;
        Object obj = this.f8633s;
        Object obj2 = this.f8632r;
        Object obj3 = this.f8631n;
        Object obj4 = this.h;
        Object obj5 = this.f8630f;
        Object obj6 = this.f8629e;
        Object obj7 = this.d;
        Object obj8 = this.f8628c;
        switch (i7) {
            case 0:
                u8 u8Var = (u8) obj8;
                ((boolean[]) obj7)[0] = true;
                u8Var.Z((gj) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new r6(u8Var, (boolean[]) obj6, this.f8627b, (z10) obj2, (z10) obj));
                return;
            case 1:
                gf gfVar = (gf) obj8;
                FrameLayout frameLayout = (FrameLayout) obj6;
                View view = (View) obj5;
                RectF rectF = (RectF) obj4;
                gfVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                ((ji.e) obj7).getLocationInWindow(iArr);
                frameLayout.getLocationInWindow(iArr2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + iArr[0]) - iArr2[0]);
                layoutParams.topMargin = Math.round((rectF.top + iArr[1]) - iArr2[1]);
                view.setLayoutParams(layoutParams);
                view.post(new de(gfVar, view, frameLayout, layoutParams, (ArrayList) obj3, this.f8627b, (ji.g) obj2, (ji.f) obj, 1));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                g50 g50Var = (g50) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        np.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity.z0(this.f8627b, g50Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.t4.E(launchActivity, hd.M0(2131751454, null), hd.M0(2131748895, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                g50 g50Var2 = (g50) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    g50Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    np.s1(i10).Y3(authorizationform.users, false);
                    launchActivity2.t0(new ek0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            default:
                kd0 kd0Var = (kd0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                f5.i iVar = (f5.i) obj5;
                f5.m mVar = (f5.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                ce0 ce0Var = kd0Var.f48641w;
                hi.d dVar = kd0Var.f48634b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(hd.a0(null, null, 2131745967, iVar.f10982a), false, true);
                    if (i10 == 7) {
                        H = hd.M0(2131745971, null);
                    } else {
                        H = hd.H(',', "SMSFeePurchaseTextDays", i10);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new fi.d0(kd0Var, mVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    kd0Var.f48636e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.cc(ce0Var.f46075a0, null).H(2131624012, hd.a0(null, null, 2131743878, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    kd0Var.f48636e = tL_error.text;
                    new org.telegram.ui.Components.cc(ce0Var.f46075a0, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public g8(gf gfVar, ji.e eVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, int i7, ji.g gVar, ji.f fVar) {
        this.f8626a = 1;
        this.f8628c = gfVar;
        this.d = eVar;
        this.f8629e = frameLayout;
        this.f8630f = view;
        this.h = rectF;
        this.f8631n = arrayList;
        this.f8627b = i7;
        this.f8632r = gVar;
        this.f8633s = fVar;
    }

    public g8(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f8626a = i10;
        this.f8628c = launchActivity;
        this.d = obj;
        this.f8629e = obj2;
        this.f8627b = i7;
        this.f8630f = obj3;
        this.h = obj4;
        this.f8631n = obj5;
        this.f8632r = obj6;
        this.f8633s = obj7;
    }

    public g8(kd0 kd0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.i iVar, int i7, f5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f8626a = 4;
        this.f8628c = kd0Var;
        this.d = tLObject;
        this.f8629e = tL_error;
        this.f8630f = iVar;
        this.f8627b = i7;
        this.h = mVar;
        this.f8631n = tL_inputStorePaymentAuthCode;
        this.f8632r = str;
        this.f8633s = tL_payments_canPurchaseStore;
    }
}
