package ei;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class pb extends qb {
    public final ci.q f9606g;
    public final float h;

    public pb(ci.q qVar, float f7) {
        this.f9606g = qVar;
        this.h = f7;
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        ci.q qVar = this.f9606g;
        float f10 = this.h;
        qVar.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        ci.q qVar = this.f9606g;
        qVar.post(new ci.p(qVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        ci.q qVar = this.f9606g;
        qVar.f5745w = true;
        qVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            qVar.getLocationInWindow(iArr);
            LaunchActivity.c0((qVar.getWidth() / 2.0f) + iArr[0], (qVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
