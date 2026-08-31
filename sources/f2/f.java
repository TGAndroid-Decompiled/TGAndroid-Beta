package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class f implements Runnable {
    public final int f5754a;
    public final ArrayList f5755b;
    public final l f5756c;

    public f(l lVar, ArrayList arrayList, int i10) {
        this.f5754a = i10;
        this.f5756c = lVar;
        this.f5755b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f5754a) {
            case 0:
                ArrayList arrayList = this.f5755b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l lVar = this.f5756c;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        k kVar = (k) obj;
                        lVar.C(kVar.f5839a, kVar);
                        lVar.f5859w.add(kVar);
                    } else {
                        arrayList.clear();
                        lVar.f5858u.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f5755b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    l lVar2 = this.f5756c;
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.f5860x.add(jVar);
                    } else {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList3 = this.f5755b;
                int i12 = Integer.MAX_VALUE;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((m1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.f5756c;
                    if (size4 >= 0) {
                        m1 m1Var = (m1) arrayList3.get(size4);
                        long b10 = (m1Var.b() - i12) * lVar3.D;
                        View view = m1Var.f5875a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar3.f5861y.add(m1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(b10).setInterpolator(lVar3.h);
                        animate.setUpdateListener(new d(lVar3, m1Var, 1));
                        animate.setListener(new g(lVar3, m1Var, view, animate)).start();
                    } else {
                        arrayList3.clear();
                        lVar3.f5857t.remove(arrayList3);
                        return;
                    }
                }
        }
    }
}
