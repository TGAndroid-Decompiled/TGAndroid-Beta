package lf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class o0 extends ViewOutlineProvider {
    public final int f12497a = 0;
    public float f12498b;

    public o0(int i10) {
        this.f12498b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f12497a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f12498b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f12498b));
                return;
        }
    }

    public o0(float f10) {
        this.f12498b = f10;
    }
}
