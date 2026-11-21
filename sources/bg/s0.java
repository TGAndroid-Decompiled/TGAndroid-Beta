package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class s0 extends ViewOutlineProvider {
    public final int f3345a;
    public final float f3346b;

    public s0(int i7, float f10) {
        this.f3345a = i7;
        this.f3346b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i7 = this.f3345a;
        float f10 = this.f3346b;
        int i10 = this.f3345a;
        outline.setRoundRect(i10, i10, width - i7, view.getHeight() - i7, f10);
    }
}
