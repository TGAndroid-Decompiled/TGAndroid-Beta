package di;

import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;
import org.telegram.ui.lj0;
import org.telegram.ui.mj0;
import org.telegram.ui.ne;
import org.telegram.ui.wj0;
public final class m6 implements Runnable {
    public final int f9311a;
    public final Object f9312b;
    public final Object f9313c;
    public final Object d;
    public final Object f9314e;
    public final Object f9315f;
    public final Object h;
    public final Object f9316n;

    public m6(x8 x8Var, TLObject tLObject, fj fjVar, TLRPC.InputInvoice inputInvoice, x10 x10Var, org.telegram.ui.Components.lc lcVar, TLRPC.TL_error tL_error) {
        this.f9311a = 2;
        this.f9312b = x8Var;
        this.f9313c = tLObject;
        this.d = fjVar;
        this.f9314e = inputInvoice;
        this.f9316n = x10Var;
        this.f9315f = lcVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.m6.run():void");
    }

    public m6(x8 x8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, q10 q10Var, x10 x10Var) {
        this.f9311a = 0;
        this.f9312b = x8Var;
        this.f9313c = zArr;
        this.f9314e = str;
        this.f9315f = chatInvite;
        this.d = zArr2;
        this.h = q10Var;
        this.f9316n = x10Var;
    }

    public m6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f9311a = i7;
        this.f9312b = obj;
        this.f9313c = obj2;
        this.d = obj3;
        this.f9314e = obj4;
        this.f9315f = obj5;
        this.h = obj6;
        this.f9316n = obj7;
    }

    public m6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f9311a = 14;
        this.f9312b = jSONObject;
        this.f9314e = str;
        this.f9313c = y2Var;
        this.d = u0Var;
        this.f9315f = str2;
        this.h = bArr;
        this.f9316n = bArr2;
    }

    public m6(fs fsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.f9311a = i7;
        this.f9312b = fsVar;
        this.f9313c = obj;
        this.d = obj2;
        this.f9315f = obj3;
        this.f9314e = str;
        this.h = obj4;
        this.f9316n = obj5;
    }

    public m6(TLRPC.TL_error tL_error, x10 x10Var, TLObject tLObject, mp mpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.h2 h2Var, x10 x10Var2) {
        this.f9311a = 17;
        this.f9312b = tL_error;
        this.f9316n = x10Var;
        this.f9313c = tLObject;
        this.d = mpVar;
        this.f9314e = tL_inputInvoicePremiumGiftCode;
        this.f9315f = h2Var;
        this.h = x10Var2;
    }

    public m6(bn bnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ne neVar, String str, vf.b bVar) {
        this.f9311a = 5;
        this.f9312b = bnVar;
        this.f9313c = tL_error;
        this.d = tLObject;
        this.f9315f = tLObject2;
        this.h = neVar;
        this.f9314e = str;
        this.f9316n = bVar;
    }

    public m6(lj0 lj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, mj0 mj0Var, TLRPC.TL_error tL_error, wj0 wj0Var) {
        this.f9311a = 10;
        this.f9312b = lj0Var;
        this.f9313c = tLObject;
        this.f9314e = str;
        this.d = tL_secureRequiredType;
        this.f9315f = mj0Var;
        this.h = tL_error;
        this.f9316n = wj0Var;
    }
}
