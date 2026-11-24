package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class pl9 extends ViewOutlineProvider {
    public final byte a = 1;
    public float b;

    public pl9(int i) {
        this.b = i;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), gm.N(this.b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.b);
                return;
        }
    }

    public pl9(float f) {
        this.b = f;
    }
}
