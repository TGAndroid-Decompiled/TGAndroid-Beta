package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i6 extends ViewOutlineProvider {
    public final int f993a = 1;
    public float f994b;

    public i6(int i10) {
        this.f994b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f993a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f994b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f994b);
                return;
        }
    }

    public i6(float f7) {
        this.f994b = f7;
    }
}
