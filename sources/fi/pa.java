package fi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class pa extends qa {
    public final di.p f12626g;
    public final float h;

    public pa(di.p pVar, float f10) {
        this.f12626g = pVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        di.p pVar = this.f12626g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        di.p pVar = this.f12626g;
        pVar.post(new di.o(pVar, 1));
    }

    @Override
    public final void f(boolean z9) {
        di.p pVar = this.f12626g;
        pVar.f9487x = true;
        pVar.invalidate();
        if (z9) {
            int[] iArr = new int[2];
            pVar.getLocationInWindow(iArr);
            LaunchActivity.b0((pVar.getWidth() / 2.0f) + iArr[0], (pVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
