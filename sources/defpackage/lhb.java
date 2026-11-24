package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class lhb extends TextView {
    public final mhb a;
    public boolean b;
    public boolean c;

    public lhb(mhb mhbVar, String str) {
        super(mhbVar.getContext());
        this.a = mhbVar;
        ylb ylbVar = mhbVar.a;
        setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        anb.X(this, cmb.F6, ylbVar);
        setTypeface(gm.o());
        setTextSize(1, 14.0f);
        setText(str);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        boolean z = this.b;
        mhb mhbVar = this.a;
        if (!z && !this.c) {
            float f2 = mhbVar.h;
            float f3 = mhbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f2, f2, getWidth() + f3, getHeight() + f3, mhbVar.d);
            float f4 = mhbVar.h;
            canvas2.drawRect(f4, f4, getWidth() + f3, getHeight() + f3, mhbVar.e);
        } else {
            canvas2 = canvas;
            float L = gm.L(10.0f);
            float[] fArr = mhbVar.c;
            float f5 = mhbVar.h;
            Path path = mhbVar.b;
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
            RectF rectF = gm.P;
            float width = getWidth() + f5;
            float height = getHeight();
            if (this.c) {
                i = -1;
            }
            rectF.set(f5, f5, width, (i * f5) + height);
            path.addRoundRect(rectF, mhbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, mhbVar.d);
            canvas2.drawPath(path, mhbVar.e);
        }
        super.onDraw(canvas2);
    }
}
