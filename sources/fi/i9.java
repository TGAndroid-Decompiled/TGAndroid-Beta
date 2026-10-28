package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class i9 extends AnimatorListenerAdapter {
    public final int f11014a;
    public final ArrayList f11015b;
    public final j9 f11016c;

    public i9(j9 j9Var, ArrayList arrayList, int i10) {
        this.f11014a = i10;
        this.f11016c = j9Var;
        this.f11015b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11014a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f11015b;
                    int size = arrayList.size();
                    j9 j9Var = this.f11016c;
                    if (i10 < size) {
                        j9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    } else {
                        j9Var.getClass();
                        k9 k9Var = (k9) j9Var.f11068n;
                        j9Var.h.clear();
                        j9Var.f11065b = null;
                        j9Var.f11066c = false;
                        k9Var.f11123b.setAllowDrawCursor(true);
                        w8 w8Var = k9Var.h;
                        if (w8Var != null) {
                            w8Var.run();
                        }
                        if (k9Var.L) {
                            k9Var.fullScroll(130);
                            k9Var.L = false;
                            return;
                        }
                        return;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f11015b;
                    int size2 = arrayList2.size();
                    j9 j9Var2 = this.f11016c;
                    if (i11 < size2) {
                        j9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    } else {
                        ArrayList arrayList3 = j9Var2.h;
                        k9 k9Var2 = (k9) j9Var2.f11068n;
                        arrayList3.clear();
                        j9Var2.f11065b = null;
                        j9Var2.f11066c = false;
                        k9Var2.f11123b.setAllowDrawCursor(true);
                        w8 w8Var2 = k9Var2.h;
                        if (w8Var2 != null) {
                            w8Var2.run();
                        }
                        if (k9Var2.L) {
                            k9Var2.fullScroll(130);
                            k9Var2.L = false;
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
