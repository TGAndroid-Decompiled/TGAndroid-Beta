package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 {
    public final w3 f11330a;

    public d3(w3 w3Var) {
        this.f11330a = w3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        w3 w3Var = this.f11330a;
        ArrayList arrayList = w3Var.f11718l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && w3.x3(aVar)) {
            int P3 = w3Var.P3(indexOf);
            if (P3 >= arrayList.size()) {
                P3 = arrayList.size() - 1;
            }
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.d();
            }
            while (P3 >= indexOf) {
                arrayList.remove(P3);
                P3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f11205i && !w3.x3(aVar2) && !w3.E3(aVar2.f11201b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            w3Var.Y2.N(false);
            h2 h2Var2 = w3Var.J3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            if (aVar3 != null) {
                w3Var.post(new o2(w3Var, aVar3, 22));
            }
        }
    }
}
