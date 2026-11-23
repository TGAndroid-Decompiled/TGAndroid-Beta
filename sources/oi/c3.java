package oi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 {
    public final t3 f22045a;

    public c3(t3 t3Var) {
        this.f22045a = t3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        t3 t3Var = this.f22045a;
        ArrayList arrayList = t3Var.f22436t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && t3.A3(aVar)) {
            int S3 = t3Var.S3(indexOf);
            if (S3 >= arrayList.size()) {
                S3 = arrayList.size() - 1;
            }
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            while (S3 >= indexOf) {
                arrayList.remove(S3);
                S3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f21940i && !t3.A3(aVar2) && !t3.H3(aVar2.f21935b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            t3Var.f35789g3.O(false);
            g2 g2Var2 = t3Var.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            if (aVar3 != null) {
                t3Var.post(new n2(t3Var, aVar3, 22));
            }
        }
    }
}
