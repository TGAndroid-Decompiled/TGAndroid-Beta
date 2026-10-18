package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class t4 extends ViewOutlineProvider {
    public final int f6007a = 1;
    public float f6008b;

    public t4(int i10) {
        this.f6008b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f6007a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f6008b));
                return;
            default:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f6008b);
                return;
        }
    }

    public t4(float f7) {
        this.f6008b = f7;
    }
}
