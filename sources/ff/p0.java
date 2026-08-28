package ff;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class p0 extends ViewOutlineProvider {
    public final int f6247a = 0;
    public float f6248b;

    public p0(int i9) {
        this.f6248b = i9;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f6247a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f6248b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f6248b));
                return;
        }
    }

    public p0(float f10) {
        this.f6248b = f10;
    }
}
