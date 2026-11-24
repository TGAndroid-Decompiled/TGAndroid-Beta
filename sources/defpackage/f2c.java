package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class f2c extends ScrollView {
    public Drawable a;
    public ln b;
    public boolean c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        ln lnVar = this.b;
        if (canScrollVertically(-1)) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = lnVar.e(false, f) * 0.5f;
        if (e > 0.0f) {
            Drawable drawable = this.a;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(2131231241);
                this.a = drawable;
            }
            drawable.setBounds(0, getScrollY(), getWidth(), this.a.getIntrinsicHeight() + getScrollY());
            this.a.setAlpha((int) (e * 255.0f));
            this.a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        super.onNestedScroll(view, i, i2, i3, i4);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.c != canScrollVertically) {
            invalidate();
            this.c = canScrollVertically;
        }
    }
}
