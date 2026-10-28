package fi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class mb extends nb {
    public final di.q f11270g;
    public final float h;

    public mb(di.q qVar, float f7) {
        this.f11270g = qVar;
        this.h = f7;
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        di.q qVar = this.f11270g;
        float f10 = this.h;
        qVar.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        di.q qVar = this.f11270g;
        qVar.post(new di.p(qVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        di.q qVar = this.f11270g;
        qVar.f8943w = true;
        qVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            qVar.getLocationInWindow(iArr);
            LaunchActivity.c0((qVar.getWidth() / 2.0f) + iArr[0], (qVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
