package kh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class qb extends rb {
    public final ih.q f15903g;
    public final float h;

    public qb(ih.q qVar, float f10) {
        this.f15903g = qVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        ih.q qVar = this.f15903g;
        float f11 = this.h;
        qVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        ih.q qVar = this.f15903g;
        qVar.post(new ih.p(qVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        ih.q qVar = this.f15903g;
        qVar.f11987w = true;
        qVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            qVar.getLocationInWindow(iArr);
            LaunchActivity.b0((qVar.getWidth() / 2.0f) + iArr[0], (qVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
