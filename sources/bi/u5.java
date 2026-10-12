package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class u5 extends ViewOutlineProvider {
    public final int f3784a = 1;
    public float f3785b;

    public u5(int i10) {
        this.f3785b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f3784a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f3785b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f3785b);
                return;
        }
    }

    public u5(float f7) {
        this.f3785b = f7;
    }
}
