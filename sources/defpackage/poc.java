package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;
public final class poc implements i8c {
    public final byte a;
    public final toc b;
    public final c01 c;
    public final c d;

    public poc(toc tocVar, c01 c01Var, c cVar, byte b) {
        this.a = b;
        this.b = tocVar;
        this.c = c01Var;
        this.d = cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "NULL_ERROR";
        c cVar = this.d;
        c01 c01Var = this.c;
        toc tocVar = this.b;
        switch (b) {
            case 0:
                y05 y05Var = (y05) obj;
                String str2 = (String) obj2;
                c01Var.c(false);
                if (y05Var == null) {
                    u21 b0 = u21.b0(tocVar);
                    if (str2 != null) {
                        str = str2;
                    }
                    b0.f0(str, false);
                    return;
                }
                bpc bpcVar = new bpc();
                bpcVar.h = true;
                ArrayList arrayList = bpcVar.a;
                arrayList.clear();
                if (!y05Var.d()) {
                    arrayList.addAll(y05Var.f());
                }
                bpcVar.Z();
                bpcVar.f = new mhc(tocVar, cVar, (byte) 23);
                tocVar.presentFragment(bpcVar);
                return;
            default:
                v05 v05Var = (v05) obj;
                String str3 = (String) obj2;
                c01Var.c(false);
                if (v05Var == null) {
                    u21 b02 = u21.b0(tocVar);
                    if (str3 != null) {
                        str = str3;
                    }
                    b02.f0(str, false);
                    return;
                } else if (tocVar.f) {
                    v05Var.close();
                    return;
                } else {
                    tocVar.e.add(v05Var);
                    bpc bpcVar2 = new bpc();
                    y05 y05Var2 = v05Var.b;
                    ArrayList arrayList2 = bpcVar2.a;
                    arrayList2.clear();
                    if (!y05Var2.d()) {
                        arrayList2.addAll(y05Var2.f());
                    }
                    bpcVar2.Z();
                    bpcVar2.f = new wbc(tocVar, cVar, v05Var, (byte) 18);
                    tocVar.presentFragment(bpcVar2);
                    return;
                }
        }
    }
}
