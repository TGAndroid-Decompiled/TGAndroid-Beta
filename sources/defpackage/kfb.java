package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class kfb extends FrameLayout {
    public final mfb a;
    public boolean b;
    public boolean c;
    public boolean d;

    public kfb(mfb mfbVar, View view, boolean z) {
        super(mfbVar.getContext());
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
        boolean z = this.c;
        mfb mfbVar = this.a;
        if (!z && !this.d) {
            if (this.b) {
                float f5 = mfbVar.h;
                float f6 = mfbVar.h;
                canvas2 = canvas;
                canvas2.drawRect(f5, f5, getWidth() + f6, getHeight() + f6, mfbVar.d);
            } else {
                canvas2 = canvas;
            }
            float f7 = mfbVar.h;
            float f8 = mfbVar.h;
            canvas2.drawRect(f7, f7, getWidth() - f8, getHeight() + f8, mfbVar.e);
        } else {
            canvas2 = canvas;
            float L = gl.L(10.0f);
            float[] fArr = mfbVar.c;
            float f9 = mfbVar.h;
            Path path = mfbVar.b;
            boolean z2 = this.c;
            if (z2) {
                f = L;
            } else {
                f = 0.0f;
            }
            fArr[1] = f;
            fArr[0] = f;
            if (z2) {
                f2 = L;
            } else {
                f2 = 0.0f;
            }
            fArr[3] = f2;
            fArr[2] = f2;
            boolean z3 = this.d;
            if (z3) {
                f3 = L;
            } else {
                f3 = 0.0f;
            }
            fArr[5] = f3;
            fArr[4] = f3;
            if (!z3) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            path.rewind();
            RectF rectF = gl.P;
            float width = getWidth() - f9;
            float height = getHeight();
            if (this.d) {
                f4 = -1.0f;
            } else {
                f4 = 1.0f;
            }
            rectF.set(f9, f9, width, (f4 * f9) + height);
            path.addRoundRect(rectF, mfbVar.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(path, mfbVar.d);
            }
            canvas2.drawPath(path, mfbVar.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z) {
        this.b = z;
    }
}
