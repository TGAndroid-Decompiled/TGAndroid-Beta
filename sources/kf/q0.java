package kf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class q0 extends ViewOutlineProvider {
    public final int f10493a;
    public final float f10494b;

    public q0(int i10, float f10) {
        this.f10493a = i10;
        this.f10494b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f10493a;
        float f10 = this.f10494b;
        int i11 = this.f10493a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f10);
    }
}
