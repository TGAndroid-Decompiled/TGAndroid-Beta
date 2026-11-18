package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m8 extends AnimatorListenerAdapter {
    public final int f15033a;
    public final ArrayList f15034b;
    public final ah.n f15035c;

    public m8(ah.n nVar, ArrayList arrayList, int i7) {
        this.f15033a = i7;
        this.f15035c = nVar;
        this.f15034b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15033a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f15034b;
                    int size = arrayList.size();
                    ah.n nVar = this.f15035c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        n8 n8Var = (n8) nVar.f1092n;
                        nVar.h.clear();
                        nVar.f1088b = null;
                        nVar.f1089c = false;
                        n8Var.f15106b.setAllowDrawCursor(true);
                        b8 b8Var = n8Var.h;
                        if (b8Var != null) {
                            b8Var.run();
                        }
                        if (n8Var.M) {
                            n8Var.fullScroll(130);
                            n8Var.M = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f15034b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.f15035c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = nVar2.h;
                        n8 n8Var2 = (n8) nVar2.f1092n;
                        arrayList3.clear();
                        nVar2.f1088b = null;
                        nVar2.f1089c = false;
                        n8Var2.f15106b.setAllowDrawCursor(true);
                        b8 b8Var2 = n8Var2.h;
                        if (b8Var2 != null) {
                            b8Var2.run();
                        }
                        if (n8Var2.M) {
                            n8Var2.fullScroll(130);
                            n8Var2.M = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
