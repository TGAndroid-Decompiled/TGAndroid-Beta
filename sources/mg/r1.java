package mg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.r20;
public final class r1 implements r20 {
    public final int f13224a;
    public final v1 f13225b;

    public r1(v1 v1Var, int i10) {
        this.f13224a = i10;
        this.f13225b = v1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f13224a) {
            case 0:
                String str = (String) obj;
                v1 v1Var = this.f13225b;
                ArrayList arrayList = v1Var.Y1;
                androidx.activity.i iVar = v1Var.f13262n2;
                v1Var.f13254f2 = str;
                int i10 = v1Var.f13258j2;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            v1Var.m1(false, true);
                            v1Var.j1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        org.telegram.messenger.i0.r(iVar);
                        arrayList.clear();
                        arrayList.addAll(k0.e(v1Var.f13257i2.f19794id));
                        v1Var.m1(false, true);
                        v1Var.j1(true);
                        return;
                    } else {
                        org.telegram.messenger.i0.r(iVar);
                        org.telegram.messenger.i0.h3(iVar, 350L);
                        return;
                    }
                }
                org.telegram.messenger.i0.r(iVar);
                org.telegram.messenger.i0.h3(iVar, 350L);
                return;
            default:
                List list = (List) obj;
                v1 v1Var2 = this.f13225b;
                ArrayList arrayList2 = v1Var2.Y1;
                if (!TextUtils.isEmpty(v1Var2.f13254f2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    v1Var2.n1(true, true);
                    v1Var2.j1(true);
                    return;
                }
                return;
        }
    }
}
