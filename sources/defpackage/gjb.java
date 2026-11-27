package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class gjb extends TextView {
    public final hjb a;
    public boolean b;
    public boolean c;

    public gjb(hjb hjbVar, String str) {
        super(hjbVar.getContext());
        this.a = hjbVar;
        vnb vnbVar = hjbVar.a;
        setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        yob.X(this, aob.G6, vnbVar);
        setTypeface(hl.o());
        setTextSize(1, 14.0f);
        setText(str);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        boolean z = this.b;
        hjb hjbVar = this.a;
        if (!z && !this.c) {
            float f2 = hjbVar.h;
            float f3 = hjbVar.h;
            canvas2 = canvas;
            canvas2.drawRect(f2, f2, getWidth() + f3, getHeight() + f3, hjbVar.d);
            float f4 = hjbVar.h;
            canvas2.drawRect(f4, f4, getWidth() + f3, getHeight() + f3, hjbVar.e);
        } else {
            canvas2 = canvas;
            float L = hl.L(10.0f);
            float[] fArr = hjbVar.c;
            float f5 = hjbVar.h;
            Path path = hjbVar.b;
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
            RectF rectF = hl.P;
            float width = getWidth() + f5;
            float height = getHeight();
            if (this.c) {
                i = -1;
            }
            rectF.set(f5, f5, width, (i * f5) + height);
            path.addRoundRect(rectF, hjbVar.c, Path.Direction.CW);
            canvas2.drawPath(path, hjbVar.d);
            canvas2.drawPath(path, hjbVar.e);
        }
        super.onDraw(canvas2);
    }
}
