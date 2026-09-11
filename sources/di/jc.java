package di;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class jc extends kc {
    public final bi.u f7444g;
    public final float h;

    public jc(bi.u uVar, float f7) {
        this.f7444g = uVar;
        this.h = f7;
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        bi.u uVar = this.f7444g;
        float f10 = this.h;
        uVar.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        bi.u uVar = this.f7444g;
        uVar.post(new bi.s(uVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        bi.u uVar = this.f7444g;
        uVar.f3777w = true;
        uVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            uVar.getLocationInWindow(iArr);
            LaunchActivity.b0((uVar.getWidth() / 2.0f) + iArr[0], (uVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
