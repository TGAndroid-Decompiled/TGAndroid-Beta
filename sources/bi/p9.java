package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk0;
import org.telegram.ui.ee0;
import org.telegram.ui.nd0;
import org.telegram.ui.s10;
public final class p9 implements Runnable {
    public final int f4532a;
    public final int f4533b;
    public final Object f4534c;
    public final Object d;
    public final Object f4535e;
    public final Object f4536f;
    public final Object h;
    public final Object f4537n;
    public final Object f4538r;
    public final Object f4539s;

    public p9(ea eaVar, boolean[] zArr, ij ijVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, c20 c20Var, c20 c20Var2) {
        this.f4532a = 0;
        this.f4534c = eaVar;
        this.d = zArr;
        this.f4536f = ijVar;
        this.h = inputInvoice;
        this.f4537n = tL_payments_paymentFormStars;
        this.f4535e = zArr2;
        this.f4533b = i7;
        this.f4538r = c20Var;
        this.f4539s = c20Var2;
    }

    @Override
    public final void run() {
        String H;
        int i7 = this.f4532a;
        int i10 = this.f4533b;
        Object obj = this.f4539s;
        Object obj2 = this.f4538r;
        Object obj3 = this.f4537n;
        Object obj4 = this.h;
        Object obj5 = this.f4536f;
        Object obj6 = this.f4535e;
        Object obj7 = this.d;
        Object obj8 = this.f4534c;
        switch (i7) {
            case 0:
                ea eaVar = (ea) obj8;
                ((boolean[]) obj7)[0] = true;
                eaVar.Z((ij) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new z7(eaVar, (boolean[]) obj6, this.f4533b, (c20) obj2, (c20) obj));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                s10 s10Var = (s10) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.B1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        qp.s1(launchActivity.O).S3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.f4533b, s10Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    s10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.v4.E(launchActivity, org.telegram.messenger.id.M0(2131751454, null), org.telegram.messenger.id.M0(2131748895, null)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                s10 s10Var2 = (s10) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.B1;
                try {
                    s10Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    qp.s1(i10).Y3(authorizationform.users, false);
                    launchActivity2.t0(new dk0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            default:
                nd0 nd0Var = (nd0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                f5.h hVar = (f5.h) obj5;
                f5.l lVar = (f5.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                ee0 ee0Var = nd0Var.f48173w;
                fi.d dVar = nd0Var.f48166b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(org.telegram.messenger.id.a0(null, null, 2131745967, hVar.f11154a), false, true);
                    if (i10 == 7) {
                        H = org.telegram.messenger.id.M0(2131745971, null);
                    } else {
                        H = org.telegram.messenger.id.H(',', "SMSFeePurchaseTextDays", i10);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new di.d0(nd0Var, lVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nd0Var.f48168e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.hc(ee0Var.Z, null).H(2131624011, org.telegram.messenger.id.a0(null, null, 2131743878, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    nd0Var.f48168e = tL_error.text;
                    new org.telegram.ui.Components.hc(ee0Var.Z, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public p9(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f4532a = i10;
        this.f4534c = launchActivity;
        this.d = obj;
        this.f4535e = obj2;
        this.f4533b = i7;
        this.f4536f = obj3;
        this.h = obj4;
        this.f4537n = obj5;
        this.f4538r = obj6;
        this.f4539s = obj7;
    }

    public p9(nd0 nd0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.h hVar, int i7, f5.l lVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f4532a = 3;
        this.f4534c = nd0Var;
        this.d = tLObject;
        this.f4535e = tL_error;
        this.f4536f = hVar;
        this.f4533b = i7;
        this.h = lVar;
        this.f4537n = tL_inputStorePaymentAuthCode;
        this.f4538r = str;
        this.f4539s = tL_payments_canPurchaseStore;
    }
}
