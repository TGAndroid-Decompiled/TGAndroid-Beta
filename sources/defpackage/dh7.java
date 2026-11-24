package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class dh7 {
    public final Paint a;
    public final eh7 b;
    public final eh7 c;
    public final eh7 d;
    public final ch7 e;
    public final ch7 f;
    public final float[] g;
    public byte h;
    public float i;

    public dh7() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new eh7(tileMode);
        this.c = new eh7(tileMode);
        this.d = new eh7(Shader.TileMode.REPEAT);
        this.e = new ch7(2131624357);
        this.f = new ch7(2131624356);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2) {
        eh7 eh7Var = this.b;
        boolean b = eh7Var.b(bitmap);
        eh7 eh7Var2 = this.d;
        boolean b2 = b | eh7Var2.b(bitmap2);
        Paint paint = this.a;
        if (i2 >= 0) {
            eh7 eh7Var3 = this.c;
            if ((b2 | eh7Var3.b(bitmap3)) || this.h != 1) {
                this.h = (byte) 1;
                ch7 ch7Var = this.e;
                ch7Var.a.setInputBuffer("shaderPattern", eh7Var2.d);
                ch7Var.a.setInputBuffer("shaderGradient", eh7Var.d);
                ch7Var.a.setInputBuffer("shaderGradientSoftLight", eh7Var3.d);
                ch7Var.a.setFloatUniform("transformGradient", ch7Var.b);
                ch7Var.a.setFloatUniform("transformPattern", ch7Var.c);
                paint.setShader(ch7Var.a);
                return paint;
            }
        } else {
            float a = pqe.a((i * (-i2)) / 25500.0f, 0.0f, 1.0f);
            if (b2 || this.i != a || this.h != 2) {
                this.h = (byte) 2;
                this.i = a;
                ch7 ch7Var2 = this.f;
                ch7Var2.a.setInputBuffer("shaderPattern", eh7Var2.d);
                ch7Var2.a.setInputBuffer("shaderGradient", eh7Var.d);
                ch7Var2.a.setFloatUniform("intensity", a);
                ch7Var2.a.setFloatUniform("transformGradient", ch7Var2.b);
                ch7Var2.a.setFloatUniform("transformPattern", ch7Var2.c);
                paint.setShader(ch7Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
