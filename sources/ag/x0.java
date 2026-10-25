package ag;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class x0 extends ViewOutlineProvider {
    public final int f1392a;
    public final float f1393b;

    public x0(int i10, float f7) {
        this.f1392a = i10;
        this.f1393b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f1392a;
        float f7 = this.f1393b;
        int i11 = this.f1392a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
