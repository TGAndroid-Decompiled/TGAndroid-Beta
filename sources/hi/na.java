package hi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class na extends oa {
    public final fi.p f15119g;
    public final float h;

    public na(fi.p pVar, float f10) {
        this.f15119g = pVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        fi.p pVar = this.f15119g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        fi.p pVar = this.f15119g;
        pVar.post(new fi.o(pVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        fi.p pVar = this.f15119g;
        pVar.f12367x = true;
        pVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            pVar.getLocationInWindow(iArr);
            LaunchActivity.b0((pVar.getWidth() / 2.0f) + iArr[0], (pVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
