package di;

import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;
import org.telegram.ui.lj0;
import org.telegram.ui.mj0;
import org.telegram.ui.ne;
import org.telegram.ui.wj0;
public final class m6 implements Runnable {
    public final int f9341a;
    public final Object f9342b;
    public final Object f9343c;
    public final Object d;
    public final Object f9344e;
    public final Object f9345f;
    public final Object h;
    public final Object f9346n;

    public m6(y8 y8Var, TLObject tLObject, gj gjVar, TLRPC.InputInvoice inputInvoice, y10 y10Var, org.telegram.ui.Components.lc lcVar, TLRPC.TL_error tL_error) {
        this.f9341a = 2;
        this.f9342b = y8Var;
        this.f9343c = tLObject;
        this.d = gjVar;
        this.f9344e = inputInvoice;
        this.f9346n = y10Var;
        this.f9345f = lcVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.m6.run():void");
    }

    public m6(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, r10 r10Var, y10 y10Var) {
        this.f9341a = 0;
        this.f9342b = y8Var;
        this.f9343c = zArr;
        this.f9344e = str;
        this.f9345f = chatInvite;
        this.d = zArr2;
        this.h = r10Var;
        this.f9346n = y10Var;
    }

    public m6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f9341a = i7;
        this.f9342b = obj;
        this.f9343c = obj2;
        this.d = obj3;
        this.f9344e = obj4;
        this.f9345f = obj5;
        this.h = obj6;
        this.f9346n = obj7;
    }

    public m6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f9341a = 14;
        this.f9342b = jSONObject;
        this.f9344e = str;
        this.f9343c = y2Var;
        this.d = u0Var;
        this.f9345f = str2;
        this.h = bArr;
        this.f9346n = bArr2;
    }

    public m6(gs gsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.f9341a = i7;
        this.f9342b = gsVar;
        this.f9343c = obj;
        this.d = obj2;
        this.f9345f = obj3;
        this.f9344e = str;
        this.h = obj4;
        this.f9346n = obj5;
    }

    public m6(TLRPC.TL_error tL_error, y10 y10Var, TLObject tLObject, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, y10 y10Var2) {
        this.f9341a = 17;
        this.f9342b = tL_error;
        this.f9346n = y10Var;
        this.f9343c = tLObject;
        this.d = npVar;
        this.f9344e = tL_inputInvoicePremiumGiftCode;
        this.f9345f = g2Var;
        this.h = y10Var2;
    }

    public m6(bn bnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ne neVar, String str, vf.b bVar) {
        this.f9341a = 5;
        this.f9342b = bnVar;
        this.f9343c = tL_error;
        this.d = tLObject;
        this.f9345f = tLObject2;
        this.h = neVar;
        this.f9344e = str;
        this.f9346n = bVar;
    }

    public m6(lj0 lj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, mj0 mj0Var, TLRPC.TL_error tL_error, wj0 wj0Var) {
        this.f9341a = 10;
        this.f9342b = lj0Var;
        this.f9343c = tLObject;
        this.f9344e = str;
        this.d = tL_secureRequiredType;
        this.f9345f = mj0Var;
        this.h = tL_error;
        this.f9346n = wj0Var;
    }
}
