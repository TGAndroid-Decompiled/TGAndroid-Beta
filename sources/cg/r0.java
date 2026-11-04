package cg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class r0 extends ViewOutlineProvider {
    public final int f4736a;
    public final float f4737b;

    public r0(int i3, float f10) {
        this.f4736a = i3;
        this.f4737b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i3 = this.f4736a;
        float f10 = this.f4737b;
        int i10 = this.f4736a;
        outline.setRoundRect(i10, i10, width - i3, view.getHeight() - i3, f10);
    }
}
