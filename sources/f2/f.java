package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f6310a;
    public final ArrayList f6311b;
    public final l f6312c;

    public f(l lVar, ArrayList arrayList, int i10) {
        this.f6310a = i10;
        this.f6312c = lVar;
        this.f6311b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f6310a) {
            case 0:
                ArrayList arrayList = this.f6311b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l lVar = this.f6312c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        k kVar = (k) obj;
                        lVar.C(kVar.f6379a, kVar);
                        lVar.f6411w.add(kVar);
                    } else {
                        arrayList.clear();
                        lVar.f6410u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f6311b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    l lVar2 = this.f6312c;
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.f6412x.add(jVar);
                    } else {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f6311b;
                int i12 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((n1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.f6312c;
                    if (size4 >= 0) {
                        n1 n1Var = (n1) arrayList3.get(size4);
                        long b10 = (n1Var.b() - i12) * lVar3.D;
                        View view = n1Var.f6432a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar3.f6413y.add(n1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(b10).setInterpolator(lVar3.h);
                        animate.setUpdateListener(new d(lVar3, n1Var, 1));
                        animate.setListener(new g(lVar3, n1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        lVar3.f6409t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
