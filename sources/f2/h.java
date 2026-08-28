package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class h implements Runnable {
    public final int f5365a;
    public final ArrayList f5366b;
    public final n f5367c;

    public h(n nVar, ArrayList arrayList, int i9) {
        this.f5365a = i9;
        this.f5367c = nVar;
        this.f5366b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f5365a) {
            case 0:
                ArrayList arrayList = this.f5366b;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    n nVar = this.f5367c;
                    if (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        m mVar = (m) obj;
                        nVar.C(mVar.f5428a, mVar);
                        nVar.f5456w.add(mVar);
                    } else {
                        arrayList.clear();
                        nVar.f5455u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f5366b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    n nVar2 = this.f5367c;
                    if (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        l lVar = (l) obj2;
                        nVar2.B(lVar);
                        nVar2.f5457x.add(lVar);
                    } else {
                        arrayList2.clear();
                        nVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f5366b;
                int i11 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i11 = Math.min(i11, ((q1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    n nVar3 = this.f5367c;
                    if (size4 >= 0) {
                        q1 q1Var = (q1) arrayList3.get(size4);
                        long b10 = (q1Var.b() - i11) * nVar3.D;
                        View view = q1Var.f5501a;
                        ViewPropertyAnimator animate = view.animate();
                        nVar3.f5458y.add(q1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(nVar3.h()).setStartDelay(b10).setInterpolator(nVar3.h);
                        animate.setUpdateListener(new e(nVar3, q1Var, 1));
                        animate.setListener(new i(nVar3, q1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        nVar3.f5454t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
