package lh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

public final class mb extends nb {

    public final jh.o f16403g;
    public final float h;

    public mb(jh.o oVar, float f10) {
        this.f16403g = oVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float fPow = (float) Math.pow(f10, 16.0d);
        jh.o oVar = this.f16403g;
        float f11 = this.h;
        oVar.c(canvas, f11, f11, fPow);
    }

    @Override
    public final void e() {
        jh.o oVar = this.f16403g;
        oVar.post(new jh.n(oVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        jh.o oVar = this.f16403g;
        oVar.f13728w = true;
        oVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            oVar.getLocationInWindow(iArr);
            LaunchActivity.b0((oVar.getWidth() / 2.0f) + iArr[0], (oVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
