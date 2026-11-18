package oi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 {
    public final s3 f21949a;

    public b3(s3 s3Var) {
        this.f21949a = s3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        s3 s3Var = this.f21949a;
        ArrayList arrayList = s3Var.f22342t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && s3.A3(aVar)) {
            int S3 = s3Var.S3(indexOf);
            if (S3 >= arrayList.size()) {
                S3 = arrayList.size() - 1;
            }
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.d();
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
            if (aVar2 != null && !aVar2.f21912i && !s3.A3(aVar2) && !s3.H3(aVar2.f21907b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            s3Var.f34607g3.O(false);
            e2 e2Var2 = s3Var.R3;
            if (e2Var2 != null) {
                e2Var2.h();
            }
            if (aVar3 != null) {
                s3Var.post(new l2(s3Var, aVar3, 22));
            }
        }
    }
}
