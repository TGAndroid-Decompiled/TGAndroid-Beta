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
    public final int f9338a;
    public final Object f9339b;
    public final Object f9340c;
    public final Object d;
    public final Object f9341e;
    public final Object f9342f;
    public final Object h;
    public final Object f9343n;

    public m6(y8 y8Var, TLObject tLObject, fj fjVar, TLRPC.InputInvoice inputInvoice, x10 x10Var, org.telegram.ui.Components.lc lcVar, TLRPC.TL_error tL_error) {
        this.f9338a = 2;
        this.f9339b = y8Var;
        this.f9340c = tLObject;
        this.d = fjVar;
        this.f9341e = inputInvoice;
        this.f9343n = x10Var;
        this.f9342f = lcVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.m6.run():void");
    }

    public m6(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, q10 q10Var, x10 x10Var) {
        this.f9338a = 0;
        this.f9339b = y8Var;
        this.f9340c = zArr;
        this.f9341e = str;
        this.f9342f = chatInvite;
        this.d = zArr2;
        this.h = q10Var;
        this.f9343n = x10Var;
    }

    public m6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f9338a = i7;
        this.f9339b = obj;
        this.f9340c = obj2;
        this.d = obj3;
        this.f9341e = obj4;
        this.f9342f = obj5;
        this.h = obj6;
        this.f9343n = obj7;
    }

    public m6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f9338a = 14;
        this.f9339b = jSONObject;
        this.f9341e = str;
        this.f9340c = y2Var;
        this.d = u0Var;
        this.f9342f = str2;
        this.h = bArr;
        this.f9343n = bArr2;
    }

    public m6(fs fsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.f9338a = i7;
        this.f9339b = fsVar;
        this.f9340c = obj;
        this.d = obj2;
        this.f9342f = obj3;
        this.f9341e = str;
        this.h = obj4;
        this.f9343n = obj5;
    }

    public m6(TLRPC.TL_error tL_error, x10 x10Var, TLObject tLObject, mp mpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, x10 x10Var2) {
        this.f9338a = 17;
        this.f9339b = tL_error;
        this.f9343n = x10Var;
        this.f9340c = tLObject;
        this.d = mpVar;
        this.f9341e = tL_inputInvoicePremiumGiftCode;
        this.f9342f = g2Var;
        this.h = x10Var2;
    }

    public m6(bn bnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ne neVar, String str, vf.b bVar) {
        this.f9338a = 5;
        this.f9339b = bnVar;
        this.f9340c = tL_error;
        this.d = tLObject;
        this.f9342f = tLObject2;
        this.h = neVar;
        this.f9341e = str;
        this.f9343n = bVar;
    }

    public m6(lj0 lj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, mj0 mj0Var, TLRPC.TL_error tL_error, wj0 wj0Var) {
        this.f9338a = 10;
        this.f9339b = lj0Var;
        this.f9340c = tLObject;
        this.f9341e = str;
        this.d = tL_secureRequiredType;
        this.f9342f = mj0Var;
        this.h = tL_error;
        this.f9343n = wj0Var;
    }
}
