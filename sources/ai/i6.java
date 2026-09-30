package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i6 extends ViewOutlineProvider {
    public final int f992a = 1;
    public float f993b;

    public i6(int i10) {
        this.f993b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f992a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f993b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f993b);
                return;
        }
    }

    public i6(float f7) {
        this.f993b = f7;
    }
}
