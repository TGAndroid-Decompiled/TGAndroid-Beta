package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class z9 extends AnimatorListenerAdapter {
    public final int f6375a;
    public final ArrayList f6376b;
    public final aa f6377c;

    public z9(aa aaVar, ArrayList arrayList, int i10) {
        this.f6375a = i10;
        this.f6377c = aaVar;
        this.f6376b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6375a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f6376b;
                    int size = arrayList.size();
                    aa aaVar = this.f6377c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        ba baVar = (ba) aaVar.f4713n;
                        aaVar.h.clear();
                        aaVar.f4709b = null;
                        aaVar.f4710c = false;
                        baVar.f4777a.setAllowDrawCursor(true);
                        l9 l9Var = baVar.f4781f;
                        if (l9Var != null) {
                            l9Var.run();
                        }
                        if (baVar.K) {
                            baVar.fullScroll(130);
                            baVar.K = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f6376b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f6377c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = aaVar2.h;
                        ba baVar2 = (ba) aaVar2.f4713n;
                        arrayList3.clear();
                        aaVar2.f4709b = null;
                        aaVar2.f4710c = false;
                        baVar2.f4777a.setAllowDrawCursor(true);
                        l9 l9Var2 = baVar2.f4781f;
                        if (l9Var2 != null) {
                            l9Var2.run();
                        }
                        if (baVar2.K) {
                            baVar2.fullScroll(130);
                            baVar2.K = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
