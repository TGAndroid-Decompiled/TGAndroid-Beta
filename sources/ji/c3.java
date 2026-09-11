package ji;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 {
    public final v3 f13842a;

    public c3(v3 v3Var) {
        this.f13842a = v3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        v3 v3Var = this.f13842a;
        ArrayList arrayList = v3Var.f14256l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && v3.w3(aVar)) {
            int O3 = v3Var.O3(indexOf);
            if (O3 >= arrayList.size()) {
                O3 = arrayList.size() - 1;
            }
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            while (O3 >= indexOf) {
                arrayList.remove(O3);
                O3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f13737i && !v3.w3(aVar2) && !v3.D3(aVar2.f13732b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            v3Var.Y2.N(false);
            g2 g2Var2 = v3Var.J3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            if (aVar3 != null) {
                v3Var.post(new n2(v3Var, aVar3, 22));
            }
        }
    }
}
