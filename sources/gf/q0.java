package gf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

public final class q0 extends ViewOutlineProvider {

    public final int f7052a;

    public final float f7053b;

    public q0(int i10, float f10) {
        this.f7052a = i10;
        this.f7053b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f7052a;
        int height = view.getHeight() - i10;
        float f10 = this.f7053b;
        int i11 = this.f7052a;
        outline.setRoundRect(i11, i11, width - i10, height, f10);
    }
}
