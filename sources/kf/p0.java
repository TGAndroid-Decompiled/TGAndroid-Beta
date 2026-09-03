package kf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class p0 extends ViewOutlineProvider {
    public final int f10491a = 0;
    public float f10492b;

    public p0(int i10) {
        this.f10492b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f10491a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f10492b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f10492b));
                return;
        }
    }

    public p0(float f10) {
        this.f10492b = f10;
    }
}
