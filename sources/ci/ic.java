package ci;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class ic extends jc {
    public final ai.a0 f4817g;
    public final float h;

    public ic(ai.a0 a0Var, float f7) {
        this.f4817g = a0Var;
        this.h = f7;
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        ai.a0 a0Var = this.f4817g;
        float f10 = this.h;
        a0Var.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        ai.a0 a0Var = this.f4817g;
        a0Var.post(new ai.y(a0Var, 1));
    }

    @Override
    public final void f(boolean z10) {
        ai.a0 a0Var = this.f4817g;
        a0Var.f501w = true;
        a0Var.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            a0Var.getLocationInWindow(iArr);
            LaunchActivity.b0((a0Var.getWidth() / 2.0f) + iArr[0], (a0Var.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
