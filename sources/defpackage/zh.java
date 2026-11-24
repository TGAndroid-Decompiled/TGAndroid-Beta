package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;
public final class zh implements DialogInterface.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Context context = (Context) obj3;
                r63 r63Var = (r63) obj2;
                yh yhVar = (yh) obj;
                int i3 = ((int[]) obj4)[i];
                if (i3 == 100) {
                    new wj(context, i3, r63Var, yhVar).show();
                    return;
                } else {
                    yhVar.a(Integer.valueOf(i3), "");
                    return;
                }
            default:
                p pVar = (p) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                m18 m18Var = new m18(pVar, (Runnable) obj3);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = pVar.z0;
                if (tL_paymentSavedCredentialsCard == null && pVar.y0 == null) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && pVar.y0 == null) || i != 0) {
                    if (i >= i2 && i < arrayList.size() + i2) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i - i2);
                        pVar.z0 = tL_paymentSavedCredentialsCard2;
                        m18Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i < arrayList2.size() - 1) {
                        p pVar2 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 2, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                        pVar2.d1 = pVar.d1;
                        pVar2.e1 = pVar.e1;
                        pVar2.G0 = pVar.D0.additional_methods.get((i - arrayList.size()) - i2);
                        pVar2.U = m18Var;
                        pVar.presentFragment(pVar2);
                        return;
                    } else if (i == arrayList2.size() - 1) {
                        p pVar3 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 2, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                        pVar3.d1 = pVar.d1;
                        pVar3.e1 = pVar.e1;
                        pVar3.U = m18Var;
                        pVar.presentFragment(pVar3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
