package ci;

import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.id0;
import org.telegram.ui.ly;
import org.telegram.ui.xd0;
import org.telegram.ui.yj0;
public final class p8 implements Runnable {
    public final int f5761a;
    public final int f5762b;
    public final Object f5763c;
    public final Object d;
    public final Object f5764e;
    public final Object f5765f;
    public final Object h;
    public final Object f5766n;
    public final Object f5767r;
    public final Object f5768s;

    public p8(e9 e9Var, boolean[] zArr, zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i3, u10 u10Var, u10 u10Var2) {
        this.f5761a = 0;
        this.f5763c = e9Var;
        this.d = zArr;
        this.f5765f = ziVar;
        this.h = inputInvoice;
        this.f5766n = tL_payments_paymentFormStars;
        this.f5764e = zArr2;
        this.f5762b = i3;
        this.f5767r = u10Var;
        this.f5768s = u10Var2;
    }

    @Override
    public final void run() {
        String H;
        int i3 = this.f5761a;
        int i10 = this.f5762b;
        Object obj = this.f5768s;
        Object obj2 = this.f5767r;
        Object obj3 = this.f5766n;
        Object obj4 = this.h;
        Object obj5 = this.f5765f;
        Object obj6 = this.f5764e;
        Object obj7 = this.d;
        Object obj8 = this.f5763c;
        switch (i3) {
            case 0:
                e9 e9Var = (e9) obj8;
                ((boolean[]) obj7)[0] = true;
                e9Var.Z((zi) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new a7(e9Var, (boolean[]) obj6, this.f5762b, (u10) obj2, (u10) obj));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                ly lyVar = (ly) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.E1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        hp.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.f5762b, lyVar, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.t4.G(launchActivity, bd.M0(2131751455, null), bd.M0(2131748903, null)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                ly lyVar2 = (ly) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.E1;
                try {
                    lyVar2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    hp.s1(i10).Y3(authorizationform.users, false);
                    launchActivity2.t0(new yj0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            default:
                id0 id0Var = (id0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                e5.h hVar = (e5.h) obj5;
                e5.l lVar = (e5.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                xd0 xd0Var = id0Var.f46252w;
                gi.d dVar = id0Var.f46245b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(bd.a0(null, null, 2131745977, hVar.f9596a), false, true);
                    if (i10 == 7) {
                        H = bd.M0(2131745981, null);
                    } else {
                        H = bd.H(',', "SMSFeePurchaseTextDays", i10);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new ei.f0(id0Var, lVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    id0Var.f46247e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.fc(xd0Var.f51947a0, null).H(2131624011, bd.a0(null, null, 2131743888, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    id0Var.f46247e = tL_error.text;
                    new org.telegram.ui.Components.fc(xd0Var.f51947a0, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public p8(LaunchActivity launchActivity, Object obj, Object obj2, int i3, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f5761a = i10;
        this.f5763c = launchActivity;
        this.d = obj;
        this.f5764e = obj2;
        this.f5762b = i3;
        this.f5765f = obj3;
        this.h = obj4;
        this.f5766n = obj5;
        this.f5767r = obj6;
        this.f5768s = obj7;
    }

    public p8(id0 id0Var, TLObject tLObject, TLRPC.TL_error tL_error, e5.h hVar, int i3, e5.l lVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f5761a = 3;
        this.f5763c = id0Var;
        this.d = tLObject;
        this.f5764e = tL_error;
        this.f5765f = hVar;
        this.f5762b = i3;
        this.h = lVar;
        this.f5766n = tL_inputStorePaymentAuthCode;
        this.f5767r = str;
        this.f5768s = tL_payments_canPurchaseStore;
    }
}
