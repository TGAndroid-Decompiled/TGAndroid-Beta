package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class l8 extends AnimatorListenerAdapter {
    public final int f15007a;
    public final ArrayList f15008b;
    public final ah.n f15009c;

    public l8(ah.n nVar, ArrayList arrayList, int i7) {
        this.f15007a = i7;
        this.f15009c = nVar;
        this.f15008b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15007a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f15008b;
                    int size = arrayList.size();
                    ah.n nVar = this.f15009c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        m8 m8Var = (m8) nVar.f1092n;
                        nVar.h.clear();
                        nVar.f1088b = null;
                        nVar.f1089c = false;
                        m8Var.f15028b.setAllowDrawCursor(true);
                        a8 a8Var = m8Var.h;
                        if (a8Var != null) {
                            a8Var.run();
                        }
                        if (m8Var.M) {
                            m8Var.fullScroll(130);
                            m8Var.M = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f15008b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.f15009c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = nVar2.h;
                        m8 m8Var2 = (m8) nVar2.f1092n;
                        arrayList3.clear();
                        nVar2.f1088b = null;
                        nVar2.f1089c = false;
                        m8Var2.f15028b.setAllowDrawCursor(true);
                        a8 a8Var2 = m8Var2.h;
                        if (a8Var2 != null) {
                            a8Var2.run();
                        }
                        if (m8Var2.M) {
                            m8Var2.fullScroll(130);
                            m8Var2.M = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
