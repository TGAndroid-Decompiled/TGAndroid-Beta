package jf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class p0 extends ViewOutlineProvider {
    public final int f11666a;
    public final float f11667b;

    public p0(int i10, float f9) {
        this.f11666a = i10;
        this.f11667b = f9;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f11666a;
        float f9 = this.f11667b;
        int i11 = this.f11666a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f9);
    }
}
