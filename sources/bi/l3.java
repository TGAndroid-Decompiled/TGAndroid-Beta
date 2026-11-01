package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class l3 {
    public final d4 f3182a;

    public l3(d4 d4Var) {
        this.f3182a = d4Var;
    }

    public final void a(a aVar) {
        a aVar2;
        d4 d4Var = this.f3182a;
        ArrayList arrayList = d4Var.f2946s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && d4.A3(aVar)) {
            int S3 = d4Var.S3(indexOf);
            if (S3 >= arrayList.size()) {
                S3 = arrayList.size() - 1;
            }
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.d();
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
            if (aVar2 != null && !aVar2.f2822i && !d4.A3(aVar2) && !d4.H3(aVar2.f2818b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            d4Var.f31183f3.O(false);
            o2 o2Var2 = d4Var.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            if (aVar3 != null) {
                d4Var.post(new v2(d4Var, aVar3, 22));
            }
        }
    }
}
