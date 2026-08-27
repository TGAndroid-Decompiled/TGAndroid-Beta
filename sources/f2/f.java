package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

public final class f implements Runnable {

    public final int f5653a;

    public final ArrayList f5654b;

    public final l f5655c;

    public f(l lVar, ArrayList arrayList, int i10) {
        this.f5653a = i10;
        this.f5655c = lVar;
        this.f5654b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f5653a) {
            case 0:
                ArrayList arrayList = this.f5654b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l lVar = this.f5655c;
                    if (i10 >= size) {
                        arrayList.clear();
                        lVar.f5743u.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        k kVar = (k) obj;
                        lVar.C(kVar.f5716a, kVar);
                        lVar.f5744w.add(kVar);
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f5654b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    l lVar2 = this.f5655c;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.f5745x.add(jVar);
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = this.f5654b;
                int iMin = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    iMin = Math.min(iMin, ((o1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.f5655c;
                    if (size4 < 0) {
                        arrayList3.clear();
                        lVar3.f5742t.remove(arrayList3);
                    } else {
                        o1 o1Var = (o1) arrayList3.get(size4);
                        long jB = ((long) (o1Var.b() - iMin)) * lVar3.D;
                        View view = o1Var.f5789a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        lVar3.f5746y.add(o1Var);
                        viewPropertyAnimatorAnimate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(jB).setInterpolator(lVar3.h);
                        viewPropertyAnimatorAnimate.setUpdateListener(new d(lVar3, o1Var, 1));
                        viewPropertyAnimatorAnimate.setListener(new g(lVar3, o1Var, view, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
        }
    }
}
