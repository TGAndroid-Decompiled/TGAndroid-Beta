package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class lfb extends TextView {
    public final mfb a;
    public boolean b;
    public boolean c;

    public lfb(mfb mfbVar, String str) {
        super(mfbVar.getContext());
        this.a = mfbVar;
        wjb wjbVar = mfbVar.a;
        setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        zkb.X(this, bkb.F6, wjbVar);
        setTypeface(gl.o());
        setTextSize(1, 14.0f);
        setText(str);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        boolean z = this.b;
        mfb mfbVar = this.a;
        if (!z && !this.c) {
            float f2 = mfbVar.h;
            float f3 = mfbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f2, f2, getWidth() + f3, getHeight() + f3, mfbVar.d);
            float f4 = mfbVar.h;
            canvas2.drawRect(f4, f4, getWidth() + f3, getHeight() + f3, mfbVar.e);
        } else {
            canvas2 = canvas;
            float L = gl.L(10.0f);
            float[] fArr = mfbVar.c;
            float f5 = mfbVar.h;
            Path path = mfbVar.b;
            if (this.b) {
                f = L;
            } else {
                f = 0.0f;
            }
            int i = 1;
            fArr[1] = f;
            fArr[0] = f;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            path.rewind();
            RectF rectF = gl.P;
            float width = getWidth() + f5;
            float height = getHeight();
            if (this.c) {
                i = -1;
            }
            rectF.set(f5, f5, width, (i * f5) + height);
            path.addRoundRect(rectF, mfbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mfbVar.d);
            canvas2.drawPath(path, mfbVar.e);
        }
        super.onDraw(canvas2);
    }
}
