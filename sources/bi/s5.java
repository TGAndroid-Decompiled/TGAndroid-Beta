package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class s5 extends ViewOutlineProvider {
    public final int f3715a = 1;
    public float f3716b;

    public s5(int i10) {
        this.f3716b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f3715a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f3716b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f3716b);
                return;
        }
    }

    public s5(float f7) {
        this.f3716b = f7;
    }
}
