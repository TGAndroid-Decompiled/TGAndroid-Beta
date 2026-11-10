package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 {
    public final t3 f18480a;

    public b3(t3 t3Var) {
        this.f18480a = t3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        t3 t3Var = this.f18480a;
        ArrayList arrayList = t3Var.f18900s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && t3.A3(aVar)) {
            int S3 = t3Var.S3(indexOf);
            if (S3 >= arrayList.size()) {
                S3 = arrayList.size() - 1;
            }
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.d();
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
            if (aVar2 != null && !aVar2.f18400i && !t3.A3(aVar2) && !t3.H3(aVar2.f18395b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            t3Var.f37496f3.O(false);
            f2 f2Var2 = t3Var.Q3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            if (aVar3 != null) {
                t3Var.post(new m2(t3Var, aVar3, 22));
            }
        }
    }
}
