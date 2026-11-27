package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class kh7 {
    public final Paint a;
    public final lh7 b;
    public final lh7 c;
    public final lh7 d;
    public final jh7 e;
    public final jh7 f;
    public final float[] g;
    public byte h;
    public float i;

    public kh7() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new lh7(tileMode);
        this.c = new lh7(tileMode);
        this.d = new lh7(Shader.TileMode.REPEAT);
        this.e = new jh7(2131624357);
        this.f = new jh7(2131624356);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2) {
        lh7 lh7Var = this.b;
        boolean b = lh7Var.b(bitmap);
        lh7 lh7Var2 = this.d;
        boolean b2 = b | lh7Var2.b(bitmap2);
        Paint paint = this.a;
        if (i2 >= 0) {
            lh7 lh7Var3 = this.c;
            if ((b2 | lh7Var3.b(bitmap3)) || this.h != 1) {
                this.h = (byte) 1;
                jh7 jh7Var = this.e;
                jh7Var.a.setInputBuffer("shaderPattern", lh7Var2.d);
                jh7Var.a.setInputBuffer("shaderGradient", lh7Var.d);
                jh7Var.a.setInputBuffer("shaderGradientSoftLight", lh7Var3.d);
                jh7Var.a.setFloatUniform("transformGradient", jh7Var.b);
                jh7Var.a.setFloatUniform("transformPattern", jh7Var.c);
                paint.setShader(jh7Var.a);
                return paint;
            }
        } else {
            float a = ete.a((i * (-i2)) / 25500.0f, 0.0f, 1.0f);
            if (b2 || this.i != a || this.h != 2) {
                this.h = (byte) 2;
                this.i = a;
                jh7 jh7Var2 = this.f;
                jh7Var2.a.setInputBuffer("shaderPattern", lh7Var2.d);
                jh7Var2.a.setInputBuffer("shaderGradient", lh7Var.d);
                jh7Var2.a.setFloatUniform("intensity", a);
                jh7Var2.a.setFloatUniform("transformGradient", jh7Var2.b);
                jh7Var2.a.setFloatUniform("transformPattern", jh7Var2.c);
                paint.setShader(jh7Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
