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
public final class z18 implements View.OnClickListener {
    public final byte a;
    public final p b;

    public z18(p pVar, byte b) {
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
                pVar.w0 = false;
                pVar.h0();
                return;
            case 1:
                pVar.f[0].requestFocus();
                hl.E3(pVar.f[0]);
                return;
            case 2:
                if (pVar.getParentActivity() != null) {
                    pVar.M0(null);
                    return;
                }
                return;
            case 3:
                p pVar2 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar2.d1 = pVar.d1;
                pVar2.e1 = pVar.e1;
                pVar2.U = new h28(pVar);
                pVar.presentFragment(pVar2);
                return;
            case 4:
                p pVar3 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar3.d1 = pVar.d1;
                pVar3.e1 = pVar.e1;
                pVar3.U = new i28(pVar);
                pVar.presentFragment(pVar3);
                return;
            case 5:
                p pVar4 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar4.d1 = pVar.d1;
                pVar4.e1 = pVar.e1;
                pVar4.U = new j28(pVar);
                pVar.presentFragment(pVar4);
                return;
            case 6:
                p pVar5 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 0, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                pVar5.d1 = pVar.d1;
                pVar5.e1 = pVar.e1;
                pVar5.U = new k28(pVar);
                pVar.presentFragment(pVar5);
                return;
            case 7:
                if (!pVar.Q0) {
                    boolean z2 = !pVar.G;
                    pVar.G = z2;
                    pVar.W.setChecked(z2);
                    pVar.X.a(pVar.G, true);
                    return;
                }
                return;
            case 8:
                pVar.o0();
                return;
            case 9:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pVar.getParentActivity());
                String M0 = ob6.M0(2131743595, null);
                if (pVar.b0.has_secure_values) {
                    StringBuilder l = c00.l(M0, "\n\n");
                    l.append(ob6.M0(2131743596, null));
                    M0 = l.toString();
                }
                id idVar = alertDialog$Builder.a;
                idVar.U = M0;
                idVar.S = ob6.M0(2131743594, null);
                alertDialog$Builder.j(ob6.M0(2131751400, null), new b28(pVar, (byte) 3));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                pVar.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, pVar.Z0);
                    return;
                }
                return;
            case 10:
                boolean z3 = !pVar.U0;
                pVar.U0 = z3;
                pVar.M.setChecked(z3);
                return;
            case 11:
                boolean z4 = !pVar.V0;
                pVar.V0 = z4;
                pVar.M.setChecked(z4);
                return;
            case 12:
                boolean z5 = !pVar.V0;
                pVar.V0 = z5;
                pVar.M.setChecked(z5);
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                int i = 0;
                while (true) {
                    i29[] i29VarArr = pVar.h;
                    if (i < i29VarArr.length) {
                        i29 i29Var = i29VarArr[i];
                        if (intValue == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i29Var.a(z, true);
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                pVar.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject c0 = p.c0();
                    if (pVar.L0 != null && pVar.N0 == null) {
                        c0.put("tokenizationSpecification", new pf7(pVar, (byte) 2));
                    } else {
                        c0.put("tokenizationSpecification", new pf7(pVar, (byte) 4));
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
                    xve.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.s = jSONObject2;
                    qa4 qa4Var = pVar.e;
                    qa4Var.getClass();
                    wjb b2 = xjb.b();
                    b2.a = new k09(obj, (byte) 25);
                    b2.c = new a94[]{qod.a};
                    b2.b = true;
                    b2.d = (char) 23707;
                    n70.a(qa4Var.e(1, b2.a()), pVar.getParentActivity());
                    return;
                } catch (JSONException e) {
                    cc4.g(e, true);
                    return;
                }
        }
    }
}
