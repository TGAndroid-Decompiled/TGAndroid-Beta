package lf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class p0 extends ViewOutlineProvider {
    public final int f12051a;
    public final float f12052b;

    public p0(int i10, float f10) {
        this.f12051a = i10;
        this.f12052b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f12051a;
        float f10 = this.f12052b;
        int i11 = this.f12051a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f10);
    }
}
