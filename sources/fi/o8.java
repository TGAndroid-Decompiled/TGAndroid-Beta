package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class o8 extends AnimatorListenerAdapter {
    public final int f12564a;
    public final ArrayList f12565b;
    public final ah.n f12566c;

    public o8(ah.n nVar, ArrayList arrayList, int i7) {
        this.f12564a = i7;
        this.f12566c = nVar;
        this.f12565b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12564a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f12565b;
                    int size = arrayList.size();
                    ah.n nVar = this.f12566c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        p8 p8Var = (p8) nVar.f1095n;
                        nVar.h.clear();
                        nVar.f1091b = null;
                        nVar.f1092c = false;
                        p8Var.f12610b.setAllowDrawCursor(true);
                        d8 d8Var = p8Var.h;
                        if (d8Var != null) {
                            d8Var.run();
                        }
                        if (p8Var.L) {
                            p8Var.fullScroll(130);
                            p8Var.L = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f12565b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.f12566c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = nVar2.h;
                        p8 p8Var2 = (p8) nVar2.f1095n;
                        arrayList3.clear();
                        nVar2.f1091b = null;
                        nVar2.f1092c = false;
                        p8Var2.f12610b.setAllowDrawCursor(true);
                        d8 d8Var2 = p8Var2.h;
                        if (d8Var2 != null) {
                            d8Var2.run();
                        }
                        if (p8Var2.L) {
                            p8Var2.fullScroll(130);
                            p8Var2.L = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
