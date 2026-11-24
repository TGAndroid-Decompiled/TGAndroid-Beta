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
public final class w49 {
    public final r59 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public w49(r59 r59Var, boolean z) {
        this.a = r59Var;
        this.e = z;
        r59Var.setItemsEnterAnimator(this);
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
            r59 r59Var = this.a;
            if (i < size) {
                r59Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i));
                i++;
            } else {
                arrayList3.clear();
                this.b.clear();
                r59Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i) {
        Animator ofFloat;
        r59 r59Var = this.a;
        int childCount = r59Var.getChildCount();
        tk4 tk4Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = r59Var.getChildAt(i2);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof tk4)) {
                tk4Var = childAt;
            }
        }
        f69 layoutManager = r59Var.getLayoutManager();
        if (tk4Var != null && layoutManager != null) {
            r59Var.removeView(tk4Var);
            this.c.add(tk4Var);
            r59Var.addView(tk4Var);
            layoutManager.L(tk4Var);
            if (this.f) {
                ofFloat = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ic8(this, tk4Var, layoutManager));
            ofFloat.start();
            i--;
        }
        m42 m42Var = new m42(this, tk4Var, i, (byte) 3);
        this.h.add(m42Var);
        r59Var.getViewTreeObserver().addOnPreDrawListener(m42Var);
    }
}
