package ag;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends ViewOutlineProvider {
    public final int f1387a = 0;
    public float f1388b;

    public w0(int i10) {
        this.f1388b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f1387a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f1388b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f1388b));
                return;
        }
    }

    public w0(float f7) {
        this.f1388b = f7;
    }
}
