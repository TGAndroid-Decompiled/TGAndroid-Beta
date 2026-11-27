package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class cx4 implements s84, sy4, ci0 {
    public final yx4 a;

    public cx4(yx4 yx4Var) {
        this.a = yx4Var;
    }

    @Override
    public final void c(gi0 gi0Var, List list) {
        int i;
        yx4 yx4Var = this.a;
        ArrayList arrayList = yx4Var.g2;
        Iterator it = list.iterator();
        long j = 0;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            wo8 wo8Var = (wo8) it.next();
            int size = arrayList.size();
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    pw4 pw4Var = (pw4) obj;
                    if (pw4Var.h() != null && pw4Var.h().equals(wo8Var.c)) {
                        pw4Var.h = wo8Var;
                        if (pw4Var.f() > j) {
                            j = pw4Var.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((pw4) obj2).g = j;
        }
        hl.c3(new rj4(yx4Var, (byte) 15));
    }

    @Override
    public final int h() {
        return aob.v0(aob.b6, this.a.J0);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        jla jlaVar = this.a.u2;
        if (jlaVar != null) {
            jlaVar.setTitlesAlpha(f);
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
