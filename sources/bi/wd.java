package bi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class wd extends xd {
    public final zh.k f3847g;
    public final float h;

    public wd(zh.k kVar, float f7) {
        this.f3847g = kVar;
        this.h = f7;
    }

    @Override
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        zh.k kVar = this.f3847g;
        float f10 = this.h;
        kVar.c(canvas, f10, f10, pow);
    }

    @Override
    public final void e() {
        zh.k kVar = this.f3847g;
        kVar.post(new vd(kVar, 0));
    }

    @Override
    public final void f(boolean z10) {
        zh.k kVar = this.f3847g;
        kVar.f48572w = true;
        kVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            kVar.getLocationInWindow(iArr);
            LaunchActivity.b0((kVar.getWidth() / 2.0f) + iArr[0], (kVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
