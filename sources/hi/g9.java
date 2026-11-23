package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class g9 extends AnimatorListenerAdapter {
    public final int f14557a;
    public final ArrayList f14558b;
    public final ah.n f14559c;

    public g9(ah.n nVar, ArrayList arrayList, int i7) {
        this.f14557a = i7;
        this.f14559c = nVar;
        this.f14558b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14557a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f14558b;
                    int size = arrayList.size();
                    ah.n nVar = this.f14559c;
                    if (i7 < size) {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    } else {
                        nVar.getClass();
                        h9 h9Var = (h9) nVar.f1092n;
                        nVar.h.clear();
                        nVar.f1088b = null;
                        nVar.f1089c = false;
                        h9Var.f14597b.setAllowDrawCursor(true);
                        v8 v8Var = h9Var.h;
                        if (v8Var != null) {
                            v8Var.run();
                        }
                        if (h9Var.M) {
                            h9Var.fullScroll(130);
                            h9Var.M = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f14558b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.f14559c;
                    if (i10 < size2) {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = nVar2.h;
                        h9 h9Var2 = (h9) nVar2.f1092n;
                        arrayList3.clear();
                        nVar2.f1088b = null;
                        nVar2.f1089c = false;
                        h9Var2.f14597b.setAllowDrawCursor(true);
                        v8 v8Var2 = h9Var2.h;
                        if (v8Var2 != null) {
                            v8Var2.run();
                        }
                        if (h9Var2.M) {
                            h9Var2.fullScroll(130);
                            h9Var2.M = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
