package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 {
    public final v3 f17172a;

    public c3(v3 v3Var) {
        this.f17172a = v3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        v3 v3Var = this.f17172a;
        ArrayList arrayList = v3Var.f17565t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && v3.D3(aVar)) {
            int V3 = v3Var.V3(indexOf);
            if (V3 >= arrayList.size()) {
                V3 = arrayList.size() - 1;
            }
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.d();
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
            if (aVar2 != null && !aVar2.f17058i && !v3.D3(aVar2) && !v3.K3(aVar2.f17054b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            v3Var.f32150g3.O(false);
            f2 f2Var2 = v3Var.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            if (aVar3 != null) {
                v3Var.post(new m2(v3Var, aVar3, 22));
            }
        }
    }
}
