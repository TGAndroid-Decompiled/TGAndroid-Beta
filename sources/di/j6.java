package di;

import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an;
import org.telegram.ui.ij0;
import org.telegram.ui.jj0;
import org.telegram.ui.tj0;
public final class j6 implements Runnable {
    public final int f8851a;
    public final Object f8852b;
    public final Object f8853c;
    public final Object d;
    public final Object f8854e;
    public final Object f8855f;
    public final Object h;
    public final Object f8856n;

    public j6(v8 v8Var, TLObject tLObject, gj gjVar, TLRPC.InputInvoice inputInvoice, z10 z10Var, org.telegram.ui.Components.cc ccVar, TLRPC.TL_error tL_error) {
        this.f8851a = 2;
        this.f8852b = v8Var;
        this.f8853c = tLObject;
        this.d = gjVar;
        this.f8854e = inputInvoice;
        this.f8856n = z10Var;
        this.f8855f = ccVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j6.run():void");
    }

    public j6(v8 v8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, s10 s10Var, z10 z10Var) {
        this.f8851a = 0;
        this.f8852b = v8Var;
        this.f8853c = zArr;
        this.f8854e = str;
        this.f8855f = chatInvite;
        this.d = zArr2;
        this.h = s10Var;
        this.f8856n = z10Var;
    }

    public j6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f8851a = i7;
        this.f8852b = obj;
        this.f8853c = obj2;
        this.d = obj3;
        this.f8854e = obj4;
        this.f8855f = obj5;
        this.h = obj6;
        this.f8856n = obj7;
    }

    public j6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.r2 r2Var, org.telegram.ui.Wallet.l0 l0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f8851a = 14;
        this.f8852b = jSONObject;
        this.f8854e = str;
        this.f8853c = r2Var;
        this.d = l0Var;
        this.f8855f = str2;
        this.h = bArr;
        this.f8856n = bArr2;
    }

    public j6(is isVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.f8851a = i7;
        this.f8852b = isVar;
        this.f8853c = obj;
        this.d = obj2;
        this.f8855f = obj3;
        this.f8854e = str;
        this.h = obj4;
        this.f8856n = obj5;
    }

    public j6(TLRPC.TL_error tL_error, z10 z10Var, TLObject tLObject, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.e2 e2Var, z10 z10Var2) {
        this.f8851a = 17;
        this.f8852b = tL_error;
        this.f8856n = z10Var;
        this.f8853c = tLObject;
        this.d = npVar;
        this.f8854e = tL_inputInvoicePremiumGiftCode;
        this.f8855f = e2Var;
        this.h = z10Var2;
    }

    public j6(an anVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, z2 z2Var, String str, vf.b bVar) {
        this.f8851a = 5;
        this.f8852b = anVar;
        this.f8853c = tL_error;
        this.d = tLObject;
        this.f8855f = tLObject2;
        this.h = z2Var;
        this.f8854e = str;
        this.f8856n = bVar;
    }

    public j6(ij0 ij0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, jj0 jj0Var, TLRPC.TL_error tL_error, tj0 tj0Var) {
        this.f8851a = 10;
        this.f8852b = ij0Var;
        this.f8853c = tLObject;
        this.f8854e = str;
        this.d = tL_secureRequiredType;
        this.f8855f = jj0Var;
        this.h = tL_error;
        this.f8856n = tj0Var;
    }
}
