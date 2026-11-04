package gi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;
public final class pa extends qa {
    public final ei.q f13396g;
    public final float h;

    public pa(ei.q qVar, float f10) {
        this.f13396g = qVar;
        this.h = f10;
    }

    @Override
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        ei.q qVar = this.f13396g;
        float f11 = this.h;
        qVar.c(canvas, f11, f11, pow);
    }

    @Override
    public final void e() {
        ei.q qVar = this.f13396g;
        qVar.post(new ei.p(qVar, 1));
    }

    @Override
    public final void f(boolean z10) {
        ei.q qVar = this.f13396g;
        qVar.f10792x = true;
        qVar.invalidate();
        if (z10) {
            int[] iArr = new int[2];
            qVar.getLocationInWindow(iArr);
            LaunchActivity.b0((qVar.getWidth() / 2.0f) + iArr[0], (qVar.getHeight() / 2.0f) + iArr[1], 1.0f);
        }
    }
}
