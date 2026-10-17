package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m9 extends AnimatorListenerAdapter {
    public final int f9484a;
    public final ArrayList f9485b;
    public final n9 f9486c;

    public m9(n9 n9Var, ArrayList arrayList, int i10) {
        this.f9484a = i10;
        this.f9486c = n9Var;
        this.f9485b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9484a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f9485b;
                    int size = arrayList.size();
                    n9 n9Var = this.f9486c;
                    if (i10 < size) {
                        n9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        n9Var.getClass();
                        o9 o9Var = (o9) n9Var.f9529n;
                        n9Var.h.clear();
                        n9Var.f9526b = null;
                        n9Var.f9527c = false;
                        o9Var.f9560a.setAllowDrawCursor(true);
                        a9 a9Var = o9Var.f9563f;
                        if (a9Var != null) {
                            a9Var.run();
                        }
                        if (o9Var.K) {
                            o9Var.fullScroll(130);
                            o9Var.K = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f9485b;
                    int size2 = arrayList2.size();
                    n9 n9Var2 = this.f9486c;
                    if (i11 < size2) {
                        n9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = n9Var2.h;
                        o9 o9Var2 = (o9) n9Var2.f9529n;
                        arrayList3.clear();
                        n9Var2.f9526b = null;
                        n9Var2.f9527c = false;
                        o9Var2.f9560a.setAllowDrawCursor(true);
                        a9 a9Var2 = o9Var2.f9563f;
                        if (a9Var2 != null) {
                            a9Var2.run();
                        }
                        if (o9Var2.K) {
                            o9Var2.fullScroll(130);
                            o9Var2.K = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
