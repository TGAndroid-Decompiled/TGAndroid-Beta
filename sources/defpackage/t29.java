package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
public final class t29 {
    public final o39 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public t29(o39 o39Var, boolean z) {
        this.a = o39Var;
        this.e = z;
        o39Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        int i = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ((AnimatorSet) arrayList2.get(i2)).end();
                ((AnimatorSet) arrayList2.get(i2)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            o39 o39Var = this.a;
            if (i < size) {
                o39Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i));
                i++;
            } else {
                arrayList3.clear();
                this.b.clear();
                o39Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i) {
        Animator ofFloat;
        o39 o39Var = this.a;
        int childCount = o39Var.getChildCount();
        pi4 pi4Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = o39Var.getChildAt(i2);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof pi4)) {
                pi4Var = childAt;
            }
        }
        d49 layoutManager = o39Var.getLayoutManager();
        if (pi4Var != null && layoutManager != null) {
            o39Var.removeView(pi4Var);
            this.c.add(pi4Var);
            o39Var.addView(pi4Var);
            layoutManager.L(pi4Var);
            if (this.f) {
                ofFloat = ObjectAnimator.ofFloat(pi4Var, View.ALPHA, pi4Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new eh8(this, pi4Var, layoutManager));
            ofFloat.start();
            i--;
        }
        a32 a32Var = new a32(this, pi4Var, i, (byte) 3);
        this.h.add(a32Var);
        o39Var.getViewTreeObserver().addOnPreDrawListener(a32Var);
    }
}
