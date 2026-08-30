package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f5692a;
    public final ArrayList f5693b;
    public final l f5694c;

    public f(l lVar, ArrayList arrayList, int i10) {
        this.f5692a = i10;
        this.f5694c = lVar;
        this.f5693b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f5692a) {
            case 0:
                ArrayList arrayList = this.f5693b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l lVar = this.f5694c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        k kVar = (k) obj;
                        lVar.C(kVar.f5766a, kVar);
                        lVar.f5780w.add(kVar);
                    } else {
                        arrayList.clear();
                        lVar.f5779u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f5693b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    l lVar2 = this.f5694c;
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.f5781x.add(jVar);
                    } else {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f5693b;
                int i12 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((l1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.f5694c;
                    if (size4 >= 0) {
                        l1 l1Var = (l1) arrayList3.get(size4);
                        long b10 = (l1Var.b() - i12) * lVar3.D;
                        View view = l1Var.f5785a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar3.f5782y.add(l1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(b10).setInterpolator(lVar3.h);
                        animate.setUpdateListener(new d(lVar3, l1Var, 1));
                        animate.setListener(new g(lVar3, l1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        lVar3.f5778t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
