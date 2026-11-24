package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p;
public final class ry7 implements View.OnClickListener {
    public final byte a;
    public final p b;

    public ry7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                if (pVar.getParentActivity() != null) {
                    pVar.L0(null);
                    return;
                }
                return;
            case 1:
                p pVar2 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar2.d1 = pVar.d1;
                pVar2.e1 = pVar.e1;
                pVar2.U = new bz7(pVar);
                pVar.presentFragment(pVar2);
                return;
            case 2:
                p pVar3 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar3.d1 = pVar.d1;
                pVar3.e1 = pVar.e1;
                pVar3.U = new cz7(pVar);
                pVar.presentFragment(pVar3);
                return;
            case 3:
                p pVar4 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar4.d1 = pVar.d1;
                pVar4.e1 = pVar.e1;
                pVar4.U = new dz7(pVar);
                pVar.presentFragment(pVar4);
                return;
            case 4:
                p pVar5 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar5.d1 = pVar.d1;
                pVar5.e1 = pVar.e1;
                pVar5.U = new ez7(pVar);
                pVar.presentFragment(pVar5);
                return;
            case 5:
                if (!pVar.Q0) {
                    boolean z2 = !pVar.G;
                    pVar.G = z2;
                    pVar.W.setChecked(z2);
                    pVar.X.a(pVar.G, true);
                    return;
                }
                return;
            case 6:
                pVar.o0();
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pVar.getParentActivity());
                String M0 = k96.M0(2131743701, null);
                if (pVar.b0.has_secure_values) {
                    StringBuilder k = b00.k(M0, "\n\n");
                    k.append(k96.M0(2131743702, null));
                    M0 = k.toString();
                }
                hd hdVar = alertDialog$Builder.a;
                hdVar.U = M0;
                hdVar.S = k96.M0(2131743700, null);
                alertDialog$Builder.j(k96.M0(2131751423, null), new wy7(pVar, (byte) 3));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                pVar.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, pVar.Z0);
                    return;
                }
                return;
            case 8:
                boolean z3 = !pVar.U0;
                pVar.U0 = z3;
                pVar.M.setChecked(z3);
                return;
            case 9:
                boolean z4 = !pVar.V0;
                pVar.V0 = z4;
                pVar.M.setChecked(z4);
                return;
            case 10:
                boolean z5 = !pVar.V0;
                pVar.V0 = z5;
                pVar.M.setChecked(z5);
                return;
            case 11:
                int intValue = ((Integer) view.getTag()).intValue();
                int i = 0;
                while (true) {
                    vy8[] vy8VarArr = pVar.h;
                    if (i < vy8VarArr.length) {
                        vy8 vy8Var = vy8VarArr[i];
                        if (intValue == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        vy8Var.a(z, true);
                        i++;
                    } else {
                        return;
                    }
                }
            case 12:
                pVar.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject c0 = p.c0();
                    if (pVar.L0 != null && pVar.N0 == null) {
                        c0.put("tokenizationSpecification", new gd7(pVar, (byte) 2));
                    } else {
                        c0.put("tokenizationSpecification", new gd7(pVar, (byte) 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(c0));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(pVar.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = pVar.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", pVar.f0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(pVar.M0)) {
                        jSONObject.put("countryCode", pVar.M0);
                    }
                    jSONObject.put("currencyCode", pVar.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", pVar.q0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.r = true;
                    fre.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.s = jSONObject2;
                    u84 u84Var = pVar.e;
                    u84Var.getClass();
                    agb b2 = bgb.b();
                    b2.a = new v39(obj, (byte) 25);
                    b2.c = new f84[]{zjd.a};
                    b2.b = true;
                    b2.d = (char) 23707;
                    l70.a(u84Var.e(1, b2.a()), pVar.getParentActivity());
                    return;
                } catch (JSONException e) {
                    fa4.g(e, true);
                    return;
                }
            case 13:
                pVar.w0 = false;
                pVar.h0();
                return;
            default:
                pVar.f[0].requestFocus();
                gl.E3(pVar.f[0]);
                return;
        }
    }
}
