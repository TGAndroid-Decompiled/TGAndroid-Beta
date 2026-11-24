package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class p9b extends q9b {
    public final hh3 g;
    public final float h;

    public p9b(hh3 hh3Var, float f) {
        this.g = hh3Var;
        this.h = f;
    }

    @Override
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        hh3 hh3Var = this.g;
        float f2 = this.h;
        hh3Var.c(canvas, f2, f2, pow);
    }

    @Override
    public final void e() {
        hh3 hh3Var = this.g;
        hh3Var.post(new gh3(hh3Var, (byte) 1));
    }

    @Override
    public final void f(boolean z) {
        hh3 hh3Var = this.g;
        hh3Var.x = true;
        hh3Var.invalidate();
        if (z) {
            int[] iArr = new int[2];
            hh3Var.getLocationInWindow(iArr);
            LaunchActivity.a0((hh3Var.getWidth() / 2.0f) + iArr[0], (hh3Var.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
