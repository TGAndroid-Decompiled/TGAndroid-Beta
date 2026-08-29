package jf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class o0 extends ViewOutlineProvider {
    public final int f11661a = 0;
    public float f11662b;

    public o0(int i10) {
        this.f11662b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f11661a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f11662b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f11662b));
                return;
        }
    }

    public o0(float f9) {
        this.f11662b = f9;
    }
}
