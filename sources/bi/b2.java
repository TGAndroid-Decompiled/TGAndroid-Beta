package bi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class b2 implements te.b, ri.n, org.telegram.messenger.q1 {
    public final j3 f3431a;

    public b2(j3 j3Var) {
        this.f3431a = j3Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        org.telegram.ui.ActionBar.a5 a5Var = this.f3431a.f3742v2;
        if (a5Var != null) {
            a5Var.setTitlesAlpha(f10);
        }
    }

    @Override
    public void a(f5.f fVar, List list) {
        int i7;
        j3 j3Var = this.f3431a;
        ArrayList arrayList = j3Var.f3728h2;
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
                    if (jVar.h() != null && jVar.h().equals(mVar.f11301c)) {
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
            ((ug.j) obj2).f58708g = j3;
        }
        org.telegram.messenger.g0.g3(new a3.f(j3Var, 21));
    }

    @Override
    public int e() {
        j3 j3Var = this.f3431a;
        j3Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29357b6, j3Var.J0);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
