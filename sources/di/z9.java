package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class z9 extends AnimatorListenerAdapter {
    public final int f8189a;
    public final ArrayList f8190b;
    public final aa f8191c;

    public z9(aa aaVar, ArrayList arrayList, int i10) {
        this.f8189a = i10;
        this.f8191c = aaVar;
        this.f8190b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8189a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f8190b;
                    int size = arrayList.size();
                    aa aaVar = this.f8191c;
                    if (i10 < size) {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        aaVar.getClass();
                        ba baVar = (ba) aaVar.f6636n;
                        aaVar.h.clear();
                        aaVar.f6633b = null;
                        aaVar.f6634c = false;
                        baVar.f6665a.setAllowDrawCursor(true);
                        l9 l9Var = baVar.f6668f;
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
                    ArrayList arrayList2 = this.f8190b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.f8191c;
                    if (i11 < size2) {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = aaVar2.h;
                        ba baVar2 = (ba) aaVar2.f6636n;
                        arrayList3.clear();
                        aaVar2.f6633b = null;
                        aaVar2.f6634c = false;
                        baVar2.f6665a.setAllowDrawCursor(true);
                        l9 l9Var2 = baVar2.f6668f;
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
