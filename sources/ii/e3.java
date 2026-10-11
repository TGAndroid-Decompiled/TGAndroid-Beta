package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 {
    public final x3 f12393a;

    public e3(x3 x3Var) {
        this.f12393a = x3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        x3 x3Var = this.f12393a;
        ArrayList arrayList = x3Var.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && x3.y3(aVar)) {
            int Q3 = x3Var.Q3(indexOf);
            if (Q3 >= arrayList.size()) {
                Q3 = arrayList.size() - 1;
            }
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            while (Q3 >= indexOf) {
                arrayList.remove(Q3);
                Q3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f12238i && !x3.y3(aVar2) && !x3.F3(aVar2.f12233b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            x3Var.W2.N(false);
            i2 i2Var2 = x3Var.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            if (aVar3 != null) {
                x3Var.post(new p2(x3Var, aVar3, 22));
            }
        }
    }
}
