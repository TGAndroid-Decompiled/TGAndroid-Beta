package hi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 {
    public final z3 f9614a;

    public g3(z3 z3Var) {
        this.f9614a = z3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        z3 z3Var = this.f9614a;
        ArrayList arrayList = z3Var.f10008l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && z3.w3(aVar)) {
            int O3 = z3Var.O3(indexOf);
            if (O3 >= arrayList.size()) {
                O3 = arrayList.size() - 1;
            }
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.d();
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
            if (aVar2 != null && !aVar2.f9425i && !z3.w3(aVar2) && !z3.D3(aVar2.f9421b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            z3Var.Y2.N(false);
            k2 k2Var2 = z3Var.J3;
            if (k2Var2 != null) {
                k2Var2.h();
            }
            if (aVar3 != null) {
                z3Var.post(new r2(z3Var, aVar3, 22));
            }
        }
    }
}
