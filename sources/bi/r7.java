package bi;

import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn;
import org.telegram.ui.ij0;
import org.telegram.ui.jj0;
import org.telegram.ui.tj0;
public final class r7 implements Runnable {
    public final int f4623a;
    public final Object f4624b;
    public final Object f4625c;
    public final Object d;
    public final Object f4626e;
    public final Object f4627f;
    public final Object h;
    public final Object f4628n;

    public r7(ea eaVar, TLObject tLObject, ij ijVar, TLRPC.InputInvoice inputInvoice, c20 c20Var, org.telegram.ui.Components.gc gcVar, TLRPC.TL_error tL_error) {
        this.f4623a = 2;
        this.f4624b = eaVar;
        this.f4625c = tLObject;
        this.d = ijVar;
        this.f4626e = inputInvoice;
        this.f4628n = c20Var;
        this.f4627f = gcVar;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.r7.run():void");
    }

    public r7(ea eaVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, v10 v10Var, c20 c20Var) {
        this.f4623a = 0;
        this.f4624b = eaVar;
        this.f4625c = zArr;
        this.f4626e = str;
        this.f4627f = chatInvite;
        this.d = zArr2;
        this.h = v10Var;
        this.f4628n = c20Var;
    }

    public r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f4623a = i7;
        this.f4624b = obj;
        this.f4625c = obj2;
        this.d = obj3;
        this.f4626e = obj4;
        this.f4627f = obj5;
        this.h = obj6;
        this.f4628n = obj7;
    }

    public r7(JSONObject jSONObject, String str, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.l0 l0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.f4623a = 14;
        this.f4624b = jSONObject;
        this.f4626e = str;
        this.f4625c = s2Var;
        this.d = l0Var;
        this.f4627f = str2;
        this.h = bArr;
        this.f4628n = bArr2;
    }

    public r7(ls lsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.f4623a = i7;
        this.f4624b = lsVar;
        this.f4625c = obj;
        this.d = obj2;
        this.f4627f = obj3;
        this.f4626e = str;
        this.h = obj4;
        this.f4628n = obj5;
    }

    public r7(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, qp qpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.f2 f2Var, c20 c20Var2) {
        this.f4623a = 17;
        this.f4624b = tL_error;
        this.f4628n = c20Var;
        this.f4625c = tLObject;
        this.d = qpVar;
        this.f4626e = tL_inputInvoicePremiumGiftCode;
        this.f4627f = f2Var;
        this.h = c20Var2;
    }

    public r7(cn cnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, t3 t3Var, String str, vf.b bVar) {
        this.f4623a = 5;
        this.f4624b = cnVar;
        this.f4625c = tL_error;
        this.d = tLObject;
        this.f4627f = tLObject2;
        this.h = t3Var;
        this.f4626e = str;
        this.f4628n = bVar;
    }

    public r7(ij0 ij0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, jj0 jj0Var, TLRPC.TL_error tL_error, tj0 tj0Var) {
        this.f4623a = 10;
        this.f4624b = ij0Var;
        this.f4625c = tLObject;
        this.f4626e = str;
        this.d = tL_secureRequiredType;
        this.f4627f = jj0Var;
        this.h = tL_error;
        this.f4628n = tj0Var;
    }
}
