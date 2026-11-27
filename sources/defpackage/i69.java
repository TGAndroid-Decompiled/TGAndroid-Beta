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
public final class i69 {
    public final d79 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public i69(d79 d79Var, boolean z) {
        this.a = d79Var;
        this.e = z;
        d79Var.setItemsEnterAnimator(this);
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
            d79 d79Var = this.a;
            if (i < size) {
                d79Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i));
                i++;
            } else {
                arrayList3.clear();
                this.b.clear();
                d79Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i) {
        Animator ofFloat;
        d79 d79Var = this.a;
        int childCount = d79Var.getChildCount();
        tk4 tk4Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = d79Var.getChildAt(i2);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof tk4)) {
                tk4Var = childAt;
            }
        }
        q79 layoutManager = d79Var.getLayoutManager();
        if (tk4Var != null && layoutManager != null) {
            d79Var.removeView(tk4Var);
            this.c.add(tk4Var);
            d79Var.addView(tk4Var);
            layoutManager.L(tk4Var);
            if (this.f) {
                ofFloat = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new wd8(this, tk4Var, layoutManager));
            ofFloat.start();
            i--;
        }
        r32 r32Var = new r32(this, tk4Var, i, (byte) 3);
        this.h.add(r32Var);
        d79Var.getViewTreeObserver().addOnPreDrawListener(r32Var);
    }
}
