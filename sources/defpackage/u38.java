package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.ui.ActionBar.a;
public final class u38 extends NestedScrollView {
    public View W;
    public final b48 a0;

    public u38(b48 b48Var, Activity activity) {
        super(activity);
        this.a0 = b48Var;
    }

    @Override
    public final int c(Rect rect) {
        if (this.W != null && this.a0.n1.getTop() == getPaddingTop()) {
            int c = super.c(rect);
            int currentActionBarHeight = a.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + c);
            if (currentActionBarHeight > 0) {
                return ug8.B(10.0f, currentActionBarHeight, c);
            }
            return c;
        }
        return 0;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
