package nh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class ab extends bb {
    public final lh.o f17398g;
    public final float h;

    public ab(lh.o oVar, float f9) {
        this.f17398g = oVar;
        this.h = f9;
    }

    @Override
    public final void a(Canvas canvas, float f9) {
        float pow = (float) Math.pow(f9, 16.0d);
        lh.o oVar = this.f17398g;
        float f10 = this.h;
        oVar.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        lh.o oVar = this.f17398g;
        oVar.post(new lh.n(oVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        lh.o oVar = this.f17398g;
        oVar.f16003w = true;
        oVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            oVar.getLocationInWindow(iArr);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + iArr[0], (oVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
