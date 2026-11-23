package bi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class f2 implements te.b, ri.n, org.telegram.messenger.q1 {
    public final n3 f3617a;

    public f2(n3 n3Var) {
        this.f3617a = n3Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        org.telegram.ui.ActionBar.z4 z4Var = this.f3617a.f3942v2;
        if (z4Var != null) {
            z4Var.setTitlesAlpha(f10);
        }
    }

    @Override
    public void a(f5.f fVar, List list) {
        int i7;
        n3 n3Var = this.f3617a;
        ArrayList arrayList = n3Var.f3928h2;
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
                    if (jVar.h() != null && jVar.h().equals(mVar.f11333c)) {
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
            ((ug.j) obj2).f58751g = j3;
        }
        org.telegram.messenger.g0.g3(new a3.f(n3Var, 21));
    }

    @Override
    public int e() {
        n3 n3Var = this.f3617a;
        n3Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29344b6, n3Var.J0);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
