package defpackage;

import android.view.View;
import android.widget.LinearLayout;
public final class y19 extends LinearLayout {
    public boolean a;

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        u19 u19Var = null;
        if (!this.a) {
            i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) instanceof c29) {
                    u19Var = ((c29) getChildAt(i4)).e;
                    if (u19Var.getAdapter().b() == u19Var.getChildCount()) {
                        int childCount = u19Var.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            u19Var.getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), 0), i2);
                            if (u19Var.getChildAt(i5).getMeasuredWidth() > i3) {
                                i3 = u19Var.getChildAt(i5).getMeasuredWidth();
                            }
                        }
                        i3 += gm.L(16.0f);
                    }
                }
            }
        } else {
            i3 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (size < gm.L(240.0f)) {
            size = gm.L(240.0f);
        }
        if (size > gm.L(280.0f)) {
            size = gm.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i3 == 0 || i3 >= size) {
            i3 = size;
        }
        if (u19Var != null) {
            for (int i6 = 0; i6 < u19Var.getChildCount(); i6++) {
                u19Var.getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }
}
