package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;
public final class rqc implements jac {
    public final byte a;
    public final vqc b;
    public final k11 c;
    public final c d;

    public rqc(vqc vqcVar, k11 k11Var, c cVar, byte b) {
        this.a = b;
        this.b = vqcVar;
        this.c = k11Var;
        this.d = cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "NULL_ERROR";
        c cVar = this.d;
        k11 k11Var = this.c;
        vqc vqcVar = this.b;
        switch (b) {
            case 0:
                y25 y25Var = (y25) obj;
                String str2 = (String) obj2;
                k11Var.c(false);
                if (y25Var == null) {
                    c41 b0 = c41.b0(vqcVar);
                    if (str2 != null) {
                        str = str2;
                    }
                    b0.f0(str, false);
                    return;
                }
                drc drcVar = new drc();
                drcVar.h = true;
                ArrayList arrayList = drcVar.a;
                arrayList.clear();
                if (!y25Var.d()) {
                    arrayList.addAll(y25Var.f());
                }
                drcVar.a0();
                drcVar.f = new qhc(vqcVar, cVar, (byte) 25);
                vqcVar.presentFragment(drcVar);
                return;
            default:
                v25 v25Var = (v25) obj;
                String str3 = (String) obj2;
                k11Var.c(false);
                if (v25Var == null) {
                    c41 b02 = c41.b0(vqcVar);
                    if (str3 != null) {
                        str = str3;
                    }
                    b02.f0(str, false);
                    return;
                } else if (vqcVar.f) {
                    v25Var.close();
                    return;
                } else {
                    vqcVar.e.add(v25Var);
                    drc drcVar2 = new drc();
                    y25 y25Var2 = v25Var.b;
                    ArrayList arrayList2 = drcVar2.a;
                    arrayList2.clear();
                    if (!y25Var2.d()) {
                        arrayList2.addAll(y25Var2.f());
                    }
                    drcVar2.a0();
                    drcVar2.f = new gcc(vqcVar, cVar, v25Var, (byte) 21);
                    vqcVar.presentFragment(drcVar2);
                    return;
                }
        }
    }
}
