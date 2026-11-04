package ci;

import org.json.JSONObject;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cj0;
import org.telegram.ui.dj0;
import org.telegram.ui.nj0;
import org.telegram.ui.wm;
public final class s6 implements Runnable {
    public final int f5954a;
    public final Object f5955b;
    public final Object f5956c;
    public final Object d;
    public final Object f5957e;
    public final Object f5958f;
    public final Object h;
    public final Object f5959n;

    public s6(e9 e9Var, TLObject tLObject, zi ziVar, TLRPC.InputInvoice inputInvoice, u10 u10Var, org.telegram.ui.Components.fc fcVar, TLRPC.TL_error tL_error) {
        this.f5954a = 2;
        this.f5955b = e9Var;
        this.f5956c = tLObject;
        this.d = ziVar;
        this.f5957e = inputInvoice;
        this.f5959n = u10Var;
        this.f5958f = fcVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.s6.run():void");
    }

    public s6(e9 e9Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, n10 n10Var, u10 u10Var) {
        this.f5954a = 0;
        this.f5955b = e9Var;
        this.f5956c = zArr;
        this.f5957e = str;
        this.f5958f = chatInvite;
        this.d = zArr2;
        this.h = n10Var;
        this.f5959n = u10Var;
    }

    public s6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i3) {
        this.f5954a = i3;
        this.f5955b = obj;
        this.f5956c = obj2;
        this.d = obj3;
        this.f5957e = obj4;
        this.f5958f = obj5;
        this.h = obj6;
        this.f5959n = obj7;
    }

    public s6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.k0 k0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f5954a = 14;
        this.f5955b = jSONObject;
        this.f5957e = str;
        this.f5956c = s2Var;
        this.d = k0Var;
        this.f5958f = str2;
        this.h = bArr;
        this.f5959n = bArr2;
    }

    public s6(cs csVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i3) {
        this.f5954a = i3;
        this.f5955b = csVar;
        this.f5956c = obj;
        this.d = obj2;
        this.f5958f = obj3;
        this.f5957e = str;
        this.h = obj4;
        this.f5959n = obj5;
    }

    public s6(TLRPC.TL_error tL_error, u10 u10Var, TLObject tLObject, hp hpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.d2 d2Var, u10 u10Var2) {
        this.f5954a = 17;
        this.f5955b = tL_error;
        this.f5959n = u10Var;
        this.f5956c = tLObject;
        this.d = hpVar;
        this.f5957e = tL_inputInvoicePremiumGiftCode;
        this.f5958f = d2Var;
        this.h = u10Var2;
    }

    public s6(wm wmVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, g3 g3Var, String str, sf.b bVar) {
        this.f5954a = 5;
        this.f5955b = wmVar;
        this.f5956c = tL_error;
        this.d = tLObject;
        this.f5958f = tLObject2;
        this.h = g3Var;
        this.f5957e = str;
        this.f5959n = bVar;
    }

    public s6(cj0 cj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, dj0 dj0Var, TLRPC.TL_error tL_error, nj0 nj0Var) {
        this.f5954a = 10;
        this.f5955b = cj0Var;
        this.f5956c = tLObject;
        this.f5957e = str;
        this.d = tL_secureRequiredType;
        this.f5958f = dj0Var;
        this.h = tL_error;
        this.f5959n = nj0Var;
    }
}
