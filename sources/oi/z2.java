package oi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 {
    public final q3 f22192a;

    public z2(q3 q3Var) {
        this.f22192a = q3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        q3 q3Var = this.f22192a;
        ArrayList arrayList = q3Var.f21939t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && q3.A3(aVar)) {
            int S3 = q3Var.S3(indexOf);
            if (S3 >= arrayList.size()) {
                S3 = arrayList.size() - 1;
            }
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.d();
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
            if (aVar2 != null && !aVar2.f21549i && !q3.A3(aVar2) && !q3.H3(aVar2.f21544b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            q3Var.f39895g3.O(false);
            d2 d2Var2 = q3Var.R3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            if (aVar3 != null) {
                q3Var.post(new k2(q3Var, aVar3, 22));
            }
        }
    }
}
