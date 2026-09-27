package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class z9 extends AnimatorListenerAdapter {
    public final int f5917a;
    public final ArrayList f5918b;
    public final aa f5919c;

    public z9(aa aaVar, ArrayList arrayList, int i10) {
        this.f5917a = i10;
        this.f5919c = aaVar;
        this.f5918b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5917a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f5918b;
                    int size = arrayList.size();
                    aa aaVar = this.f5919c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        ba baVar = (ba) aaVar.f4360n;
                        aaVar.h.clear();
                        aaVar.f4357b = null;
                        aaVar.f4358c = false;
                        baVar.f4420a.setAllowDrawCursor(true);
                        l9 l9Var = baVar.f4423f;
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
                    ArrayList arrayList2 = this.f5918b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f5919c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = aaVar2.h;
                        ba baVar2 = (ba) aaVar2.f4360n;
                        arrayList3.clear();
                        aaVar2.f4357b = null;
                        aaVar2.f4358c = false;
                        baVar2.f4420a.setAllowDrawCursor(true);
                        l9 l9Var2 = baVar2.f4423f;
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
