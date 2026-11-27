package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class fjb extends FrameLayout {
    public final hjb a;
    public boolean b;
    public boolean c;
    public boolean d;

    public fjb(hjb hjbVar, View view, boolean z) {
        super(hjbVar.getContext());
        this.a = hjbVar;
        setWillNotDraw(false);
        if (!z) {
            setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        }
        addView(view, tre.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = this.c;
        hjb hjbVar = this.a;
        if (!z && !this.d) {
            if (this.b) {
                float f5 = hjbVar.h;
                float f6 = hjbVar.h;
                canvas2 = canvas;
                canvas2.drawRect(f5, f5, getWidth() + f6, getHeight() + f6, hjbVar.d);
            } else {
                canvas2 = canvas;
            }
            float f7 = hjbVar.h;
            float f8 = hjbVar.h;
            canvas2.drawRect(f7, f7, getWidth() - f8, getHeight() + f8, hjbVar.e);
        } else {
            canvas2 = canvas;
            float L = hl.L(10.0f);
            float[] fArr = hjbVar.c;
            float f9 = hjbVar.h;
            Path path = hjbVar.b;
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
            RectF rectF = hl.P;
            float width = getWidth() - f9;
            float height = getHeight();
            if (this.d) {
                f4 = -1.0f;
            } else {
                f4 = 1.0f;
            }
            rectF.set(f9, f9, width, (f4 * f9) + height);
            path.addRoundRect(rectF, hjbVar.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(path, hjbVar.d);
            }
            canvas2.drawPath(path, hjbVar.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z) {
        this.b = z;
    }
}
