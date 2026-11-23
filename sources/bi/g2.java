package bi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class g2 implements te.b, ri.n, org.telegram.messenger.q1 {
    public final p3 f3602a;

    public g2(p3 p3Var) {
        this.f3602a = p3Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        org.telegram.ui.ActionBar.z4 z4Var = this.f3602a.f3952v2;
        if (z4Var != null) {
            z4Var.setTitlesAlpha(f10);
        }
    }

    @Override
    public void a(f5.f fVar, List list) {
        int i7;
        p3 p3Var = this.f3602a;
        ArrayList arrayList = p3Var.f3938h2;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            f5.m mVar = (f5.m) it.next();
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ug.j jVar = (ug.j) obj;
                    if (jVar.h() != null && jVar.h().equals(mVar.f11296c)) {
                        jVar.h = mVar;
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((ug.j) obj2).f58716g = j3;
        }
        org.telegram.messenger.g0.g3(new a3.f(p3Var, 20));
    }

    @Override
    public int e() {
        p3 p3Var = this.f3602a;
        p3Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29310b6, p3Var.J0);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
