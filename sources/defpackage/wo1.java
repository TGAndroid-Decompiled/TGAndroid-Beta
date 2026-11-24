package defpackage;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class wo1 implements eec {
    public final AtomicBoolean a;
    public final LinearLayout b;
    public final int c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final int[] g;

    public wo1(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override
    public final void a(int i) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i), true);
    }

    @Override
    public final void b(float f, int i, int i2) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f2;
        if (!this.a.get()) {
            float f3 = -1.0f;
            float f4 = -1.0f;
            int i3 = 0;
            while (true) {
                LinearLayout linearLayout = this.b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i3 >= childCount) {
                    break;
                }
                c09 c09Var = (c09) linearLayout.getChildAt(i3);
                if (i3 == i) {
                    f2 = 1.0f - f;
                } else if (i3 == (i + 1) % this.c) {
                    f2 = f;
                } else {
                    f2 = 0.0f;
                }
                c09Var.setOutlineProgress(f2);
                if (i3 == i) {
                    f3 = c09Var.getX() - ((horizontalScrollView.getWidth() - c09Var.getWidth()) / 2.0f);
                }
                if (i3 == i + 1) {
                    f4 = c09Var.getX() - ((horizontalScrollView.getWidth() - c09Var.getWidth()) / 2.0f);
                }
                i3++;
            }
            if (f3 != -1.0f && f4 != -1.0f) {
                horizontalScrollView.setScrollX((int) tb4.A(f4, f3, f, f3));
            }
            int i4 = this.e.get(i, 0);
            this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i + 1, 0) * f) + ((1.0f - f) * i4)), false);
        }
    }

    @Override
    public final void c(int i) {
        if (i == 0) {
            this.a.set(false);
        }
    }
}
