package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class jfb extends FrameLayout {
    public final mfb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public jfb(mfb mfbVar, View view, boolean z) {
        super(mfbVar.getContext());
        this.d = false;
        this.e = true;
        this.a = mfbVar;
        setWillNotDraw(false);
        if (!z) {
            setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        }
        addView(view, nme.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = this.b;
        mfb mfbVar = this.a;
        if (!z && !this.c) {
            float f5 = mfbVar.h;
            float f6 = mfbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f5, f5, getWidth() - f6, getHeight() + f6, mfbVar.e);
        } else {
            canvas2 = canvas;
            float L = gl.L(10.0f);
            float[] fArr = mfbVar.c;
            float f7 = mfbVar.h;
            Path path = mfbVar.b;
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
            RectF rectF = gl.P;
            float width = getWidth() - f7;
            float height = getHeight();
            if (this.c) {
                f4 = -1.0f;
            } else {
                f4 = 1.0f;
            }
            rectF.set(f7, f7, width, (f4 * f7) + height);
            if (!this.e) {
                rectF.right += mfbVar.f;
            }
            path.addRoundRect(rectF, mfbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mfbVar.e);
        }
        super.onDraw(canvas2);
    }
}
