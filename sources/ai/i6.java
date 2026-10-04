package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i6 extends ViewOutlineProvider {
    public final int f1074a = 1;
    public float f1075b;

    public i6(int i10) {
        this.f1075b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f1074a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f1075b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f1075b);
                return;
        }
    }

    public i6(float f7) {
        this.f1075b = f7;
    }
}
