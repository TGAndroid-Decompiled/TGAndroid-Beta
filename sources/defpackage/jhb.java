package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class jhb extends FrameLayout {
    public final mhb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public jhb(mhb mhbVar, View view, boolean z) {
        super(mhbVar.getContext());
        this.d = false;
        this.e = true;
        this.a = mhbVar;
        setWillNotDraw(false);
        if (!z) {
            setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        }
        addView(view, qoe.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = this.b;
        mhb mhbVar = this.a;
        if (!z && !this.c) {
            float f5 = mhbVar.h;
            float f6 = mhbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f5, f5, getWidth() - f6, getHeight() + f6, mhbVar.e);
        } else {
            canvas2 = canvas;
            float L = gm.L(10.0f);
            float[] fArr = mhbVar.c;
            float f7 = mhbVar.h;
            Path path = mhbVar.b;
            boolean z2 = this.b;
            if (z2 && this.d) {
                f = L;
            } else {
                f = 0.0f;
            }
            fArr[1] = f;
            fArr[0] = f;
            if (z2 && this.e) {
                f2 = L;
            } else {
                f2 = 0.0f;
            }
            fArr[3] = f2;
            fArr[2] = f2;
            boolean z3 = this.c;
            if (z3 && this.e) {
                f3 = L;
            } else {
                f3 = 0.0f;
            }
            fArr[5] = f3;
            fArr[4] = f3;
            if (!z3 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            path.rewind();
            RectF rectF = gm.P;
            float width = getWidth() - f7;
            float height = getHeight();
            if (this.c) {
                f4 = -1.0f;
            } else {
                f4 = 1.0f;
            }
            rectF.set(f7, f7, width, (f4 * f7) + height);
            if (!this.e) {
                rectF.right += mhbVar.f;
            }
            path.addRoundRect(rectF, mhbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mhbVar.e);
        }
        super.onDraw(canvas2);
    }
}
