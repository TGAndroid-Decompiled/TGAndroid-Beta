package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class k39 extends LinearLayout {
    public boolean a;

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        g39 g39Var = null;
        if (!this.a) {
            i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) instanceof o39) {
                    g39Var = ((o39) getChildAt(i4)).e;
                    if (g39Var.getAdapter().b() == g39Var.getChildCount()) {
                        int childCount = g39Var.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            g39Var.getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), 0), i2);
                            if (g39Var.getChildAt(i5).getMeasuredWidth() > i3) {
                                i3 = g39Var.getChildAt(i5).getMeasuredWidth();
                            }
                        }
                        i3 += hl.L(16.0f);
                    }
                }
            }
        } else {
            i3 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (size < hl.L(240.0f)) {
            size = hl.L(240.0f);
        }
        if (size > hl.L(280.0f)) {
            size = hl.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i3 == 0 || i3 >= size) {
            i3 = size;
        }
        if (g39Var != null) {
            for (int i6 = 0; i6 < g39Var.getChildCount(); i6++) {
                g39Var.getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }
}
