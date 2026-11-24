package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class jtb extends TextView {
    public View a;
    public ViewPropertyAnimator b;
    public boolean c;
    public cib d;

    public final void a() {
        if (this.a == null) {
            return;
        }
        View view = (View) getParent();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (View view2 = this.a; view2 != view; view2 = (View) view2.getParent()) {
            i3 += view2.getTop();
            i2 += view2.getLeft();
        }
        int width = ((this.a.getWidth() / 2) + i2) - (getMeasuredWidth() / 2);
        if (width >= 0) {
            if (getMeasuredWidth() + width > view.getMeasuredWidth()) {
                i = (view.getMeasuredWidth() - getMeasuredWidth()) - gl.L(16.0f);
            } else {
                i = width;
            }
        }
        setTranslationX(i);
        setTranslationY(i3 - getMeasuredHeight());
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }
}
