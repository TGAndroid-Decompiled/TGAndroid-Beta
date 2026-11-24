package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class n7b extends o7b {
    public final uf3 g;
    public final float h;

    public n7b(uf3 uf3Var, float f) {
        this.g = uf3Var;
        this.h = f;
    }

    @Override
    public final void a(Canvas canvas, float f) {
        float pow = (float) Math.pow(f, 16.0d);
        uf3 uf3Var = this.g;
        float f2 = this.h;
        uf3Var.c(canvas, f2, f2, pow);
    }

    @Override
    public final void e() {
        uf3 uf3Var = this.g;
        uf3Var.post(new tf3(uf3Var, (byte) 1));
    }

    @Override
    public final void f(boolean z) {
        uf3 uf3Var = this.g;
        uf3Var.x = true;
        uf3Var.invalidate();
        if (z) {
            int[] iArr = new int[2];
            uf3Var.getLocationInWindow(iArr);
            LaunchActivity.a0((uf3Var.getWidth() / 2.0f) + iArr[0], (uf3Var.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
