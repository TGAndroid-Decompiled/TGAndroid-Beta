package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class q0 extends ViewOutlineProvider {
    public final int f3320a = 0;
    public float f3321b;

    public q0(int i7) {
        this.f3321b = i7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f3320a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f3321b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.g0.N(this.f3321b));
                return;
        }
    }

    public q0(float f10) {
        this.f3321b = f10;
    }
}
