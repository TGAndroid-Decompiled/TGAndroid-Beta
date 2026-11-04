package cg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class q0 extends ViewOutlineProvider {
    public final int f4733a = 0;
    public float f4734b;

    public q0(int i3) {
        this.f4734b = i3;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f4733a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f4734b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.g0.N(this.f4734b));
                return;
        }
    }

    public q0(float f10) {
        this.f4734b = f10;
    }
}
