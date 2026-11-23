package di;

import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;
import org.telegram.ui.jj0;
import org.telegram.ui.kj0;
import org.telegram.ui.ne;
import org.telegram.ui.uj0;
public final class m6 implements Runnable {
    public final int f9302a;
    public final Object f9303b;
    public final Object f9304c;
    public final Object d;
    public final Object f9305e;
    public final Object f9306f;
    public final Object h;
    public final Object f9307n;

    public m6(y8 y8Var, TLObject tLObject, fj fjVar, TLRPC.InputInvoice inputInvoice, w10 w10Var, org.telegram.ui.Components.kc kcVar, TLRPC.TL_error tL_error) {
        this.f9302a = 2;
        this.f9303b = y8Var;
        this.f9304c = tLObject;
        this.d = fjVar;
        this.f9305e = inputInvoice;
        this.f9307n = w10Var;
        this.f9306f = kcVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.m6.run():void");
    }

    public m6(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, p10 p10Var, w10 w10Var) {
        this.f9302a = 0;
        this.f9303b = y8Var;
        this.f9304c = zArr;
        this.f9305e = str;
        this.f9306f = chatInvite;
        this.d = zArr2;
        this.h = p10Var;
        this.f9307n = w10Var;
    }

    public m6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f9302a = i7;
        this.f9303b = obj;
        this.f9304c = obj2;
        this.d = obj3;
        this.f9305e = obj4;
        this.f9306f = obj5;
        this.h = obj6;
        this.f9307n = obj7;
    }

    public m6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.z2 z2Var, org.telegram.ui.Wallet.v0 v0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f9302a = 14;
        this.f9303b = jSONObject;
        this.f9305e = str;
        this.f9304c = z2Var;
        this.d = v0Var;
        this.f9306f = str2;
        this.h = bArr;
        this.f9307n = bArr2;
    }

    public m6(fs fsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.f9302a = i7;
        this.f9303b = fsVar;
        this.f9304c = obj;
        this.d = obj2;
        this.f9306f = obj3;
        this.f9305e = str;
        this.h = obj4;
        this.f9307n = obj5;
    }

    public m6(TLRPC.TL_error tL_error, w10 w10Var, TLObject tLObject, mp mpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, w10 w10Var2) {
        this.f9302a = 17;
        this.f9303b = tL_error;
        this.f9307n = w10Var;
        this.f9304c = tLObject;
        this.d = mpVar;
        this.f9305e = tL_inputInvoicePremiumGiftCode;
        this.f9306f = g2Var;
        this.h = w10Var2;
    }

    public m6(bn bnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ne neVar, String str, vf.b bVar) {
        this.f9302a = 5;
        this.f9303b = bnVar;
        this.f9304c = tL_error;
        this.d = tLObject;
        this.f9306f = tLObject2;
        this.h = neVar;
        this.f9305e = str;
        this.f9307n = bVar;
    }

    public m6(jj0 jj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, kj0 kj0Var, TLRPC.TL_error tL_error, uj0 uj0Var) {
        this.f9302a = 10;
        this.f9303b = jj0Var;
        this.f9304c = tLObject;
        this.f9305e = str;
        this.d = tL_secureRequiredType;
        this.f9306f = kj0Var;
        this.h = tL_error;
        this.f9307n = uj0Var;
    }
}
