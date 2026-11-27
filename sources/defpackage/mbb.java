package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class mbb extends nbb {
    public final og3 g;
    public final float h;

    public mbb(og3 og3Var, float f) {
        this.g = og3Var;
        this.h = f;
    }

    @Override
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        og3 og3Var = this.g;
        float f2 = this.h;
        og3Var.c(canvas, f2, f2, pow);
    }

    @Override
    public final void e() {
        og3 og3Var = this.g;
        og3Var.post(new ng3(og3Var, (byte) 1));
    }

    @Override
    public final void f(boolean z) {
        og3 og3Var = this.g;
        og3Var.x = true;
        og3Var.invalidate();
        if (z) {
            int[] iArr = new int[2];
            og3Var.getLocationInWindow(iArr);
            LaunchActivity.a0((og3Var.getWidth() / 2.0f) + iArr[0], (og3Var.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
