package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class p9 extends AnimatorListenerAdapter {
    public final int f15843a;
    public final ArrayList f15844b;
    public final fg.l f15845c;

    public p9(fg.l lVar, ArrayList arrayList, int i9) {
        this.f15843a = i9;
        this.f15845c = lVar;
        this.f15844b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15843a) {
            case 0:
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.f15844b;
                    int size = arrayList.size();
                    fg.l lVar = this.f15845c;
                    if (i9 < size) {
                        lVar.removeView((View) arrayList.get(i9));
                        i9++;
                    } else {
                        lVar.getClass();
                        q9 q9Var = (q9) lVar.f6308n;
                        lVar.h.clear();
                        lVar.f6304b = null;
                        lVar.f6305c = false;
                        q9Var.f15889a.setAllowDrawCursor(true);
                        c9 c9Var = q9Var.f15893f;
                        if (c9Var != null) {
                            c9Var.run();
                        }
                        if (q9Var.G) {
                            q9Var.fullScroll(130);
                            q9Var.G = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f15844b;
                    int size2 = arrayList2.size();
                    fg.l lVar2 = this.f15845c;
                    if (i10 < size2) {
                        lVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = lVar2.h;
                        q9 q9Var2 = (q9) lVar2.f6308n;
                        arrayList3.clear();
                        lVar2.f6304b = null;
                        lVar2.f6305c = false;
                        q9Var2.f15889a.setAllowDrawCursor(true);
                        c9 c9Var2 = q9Var2.f15893f;
                        if (c9Var2 != null) {
                            c9Var2.run();
                        }
                        if (q9Var2.G) {
                            q9Var2.fullScroll(130);
                            q9Var2.G = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
