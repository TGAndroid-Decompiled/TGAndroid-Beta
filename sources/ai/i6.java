package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i6 extends ViewOutlineProvider {
    public final int f990a = 1;
    public float f991b;

    public i6(int i10) {
        this.f991b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f990a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f991b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f991b);
                return;
        }
    }

    public i6(float f7) {
        this.f991b = f7;
    }
}
