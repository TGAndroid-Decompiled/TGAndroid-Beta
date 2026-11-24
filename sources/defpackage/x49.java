package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class x49 extends FrameLayout {
    public View a;

    @Override
    public final void onMeasure(int i, int i2) {
        View view = this.a;
        if (view == null) {
            ViewParent parent = getParent();
            while (true) {
                if (parent instanceof View) {
                    if (parent instanceof RecyclerView) {
                        view = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    view = null;
                    break;
                }
            }
        }
        int i3 = 0;
        if (view != null) {
            i3 = Math.max(0, (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom());
        }
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setViewportView(View view) {
        if (this.a == view) {
            return;
        }
        this.a = view;
        requestLayout();
    }
}
