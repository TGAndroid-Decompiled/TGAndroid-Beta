package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ej3 extends View {
    public final Paint a;
    public final Matrix b;
    public LinearGradient c;
    public int d;
    public float e;
    public float f;

    public ej3(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f, this.a);
    }

    public void setColor(int i) {
        if (this.d != i) {
            this.d = i;
            int alpha = Color.alpha(i);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{bm2.o(i, (alpha * 232) / 255), bm2.o(i, (alpha * 192) / 255), bm2.o(i, (alpha * 144) / 255), bm2.o(i, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.c = linearGradient;
            this.a.setShader(linearGradient);
            this.c.setLocalMatrix(this.b);
            invalidate();
        }
    }
}
