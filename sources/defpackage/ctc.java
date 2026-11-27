package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;
public final class ctc implements icc {
    public final byte a;
    public final gtc b;
    public final l01 c;
    public final c d;

    public ctc(gtc gtcVar, l01 l01Var, c cVar, byte b) {
        this.a = b;
        this.b = gtcVar;
        this.c = l01Var;
        this.d = cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "NULL_ERROR";
        c cVar = this.d;
        l01 l01Var = this.c;
        gtc gtcVar = this.b;
        switch (b) {
            case 0:
                c35 c35Var = (c35) obj;
                String str2 = (String) obj2;
                l01Var.c(false);
                if (c35Var == null) {
                    d31 b0 = d31.b0(gtcVar);
                    if (str2 != null) {
                        str = str2;
                    }
                    b0.f0(str, false);
                    return;
                }
                ntc ntcVar = new ntc();
                ntcVar.h = true;
                ArrayList arrayList = ntcVar.a;
                arrayList.clear();
                if (!c35Var.d()) {
                    arrayList.addAll(c35Var.f());
                }
                ntcVar.Z();
                ntcVar.f = new vlc(gtcVar, cVar, (byte) 22);
                gtcVar.presentFragment(ntcVar);
                return;
            default:
                z25 z25Var = (z25) obj;
                String str3 = (String) obj2;
                l01Var.c(false);
                if (z25Var == null) {
                    d31 b02 = d31.b0(gtcVar);
                    if (str3 != null) {
                        str = str3;
                    }
                    b02.f0(str, false);
                    return;
                } else if (gtcVar.f) {
                    z25Var.close();
                    return;
                } else {
                    gtcVar.e.add(z25Var);
                    ntc ntcVar2 = new ntc();
                    c35 c35Var2 = z25Var.b;
                    ArrayList arrayList2 = ntcVar2.a;
                    arrayList2.clear();
                    if (!c35Var2.d()) {
                        arrayList2.addAll(c35Var2.f());
                    }
                    ntcVar2.Z();
                    ntcVar2.f = new b6c(gtcVar, cVar, z25Var, (byte) 28);
                    gtcVar.presentFragment(ntcVar2);
                    return;
                }
        }
    }
}
