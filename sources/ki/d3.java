package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 {
    public final w3 f15289a;

    public d3(w3 w3Var) {
        this.f15289a = w3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        w3 w3Var = this.f15289a;
        ArrayList arrayList = w3Var.f15663m3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && w3.D3(aVar)) {
            int V3 = w3Var.V3(indexOf);
            if (V3 >= arrayList.size()) {
                V3 = arrayList.size() - 1;
            }
            h2 h2Var = w3Var.K3;
            if (h2Var != null) {
                h2Var.d();
            }
            while (V3 >= indexOf) {
                arrayList.remove(V3);
                V3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f15145i && !w3.D3(aVar2) && !w3.K3(aVar2.f15141b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            w3Var.Z2.N(false);
            h2 h2Var2 = w3Var.K3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            if (aVar3 != null) {
                w3Var.post(new o2(w3Var, aVar3, 22));
            }
        }
    }
}
