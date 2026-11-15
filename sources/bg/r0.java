package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class r0 extends ViewOutlineProvider {
    public final int f3322a;
    public final float f3323b;

    public r0(int i7, float f10) {
        this.f3322a = i7;
        this.f3323b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i7 = this.f3322a;
        float f10 = this.f3323b;
        int i10 = this.f3322a;
        outline.setRoundRect(i10, i10, width - i7, view.getHeight() - i7, f10);
    }
}
