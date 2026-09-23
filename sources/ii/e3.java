package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 {
    public final x3 f11342a;

    public e3(x3 x3Var) {
        this.f11342a = x3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        x3 x3Var = this.f11342a;
        ArrayList arrayList = x3Var.f11735l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && x3.x3(aVar)) {
            int P3 = x3Var.P3(indexOf);
            if (P3 >= arrayList.size()) {
                P3 = arrayList.size() - 1;
            }
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.d();
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
            if (aVar2 != null && !aVar2.f11195i && !x3.x3(aVar2) && !x3.E3(aVar2.f11191b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            x3Var.Y2.N(false);
            i2 i2Var2 = x3Var.J3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            if (aVar3 != null) {
                x3Var.post(new p2(x3Var, aVar3, 22));
            }
        }
    }
}
