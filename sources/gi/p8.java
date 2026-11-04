package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class p8 extends AnimatorListenerAdapter {
    public final int f13393a;
    public final ArrayList f13394b;
    public final bh.l f13395c;

    public p8(bh.l lVar, ArrayList arrayList, int i3) {
        this.f13393a = i3;
        this.f13395c = lVar;
        this.f13394b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13393a) {
            case 0:
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f13394b;
                    int size = arrayList.size();
                    bh.l lVar = this.f13395c;
                    if (i3 < size) {
                        lVar.removeView((View) arrayList.get(i3));
                        i3++;
                    } else {
                        lVar.getClass();
                        q8 q8Var = (q8) lVar.f3332n;
                        lVar.h.clear();
                        lVar.f3328b = null;
                        lVar.f3329c = false;
                        q8Var.f13440b.setAllowDrawCursor(true);
                        c8 c8Var = q8Var.h;
                        if (c8Var != null) {
                            c8Var.run();
                        }
                        if (q8Var.M) {
                            q8Var.fullScroll(130);
                            q8Var.M = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f13394b;
                    int size2 = arrayList2.size();
                    bh.l lVar2 = this.f13395c;
                    if (i10 < size2) {
                        lVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    } else {
                        ArrayList arrayList3 = lVar2.h;
                        q8 q8Var2 = (q8) lVar2.f3332n;
                        arrayList3.clear();
                        lVar2.f3328b = null;
                        lVar2.f3329c = false;
                        q8Var2.f13440b.setAllowDrawCursor(true);
                        c8 c8Var2 = q8Var2.h;
                        if (c8Var2 != null) {
                            c8Var2.run();
                        }
                        if (q8Var2.M) {
                            q8Var2.fullScroll(130);
                            q8Var2.M = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
