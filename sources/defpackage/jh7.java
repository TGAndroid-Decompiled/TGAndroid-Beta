package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class jh7 {
    public final Paint a;
    public final kh7 b;
    public final kh7 c;
    public final kh7 d;
    public final ih7 e;
    public final ih7 f;
    public final float[] g;
    public byte h;
    public float i;

    public jh7() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new kh7(tileMode);
        this.c = new kh7(tileMode);
        this.d = new kh7(Shader.TileMode.REPEAT);
        this.e = new ih7(2131624357);
        this.f = new ih7(2131624356);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2) {
        kh7 kh7Var = this.b;
        boolean b = kh7Var.b(bitmap);
        kh7 kh7Var2 = this.d;
        boolean b2 = b | kh7Var2.b(bitmap2);
        Paint paint = this.a;
        if (i2 >= 0) {
            kh7 kh7Var3 = this.c;
            if ((b2 | kh7Var3.b(bitmap3)) || this.h != 1) {
                this.h = (byte) 1;
                ih7 ih7Var = this.e;
                ih7Var.a.setInputBuffer("shaderPattern", kh7Var2.d);
                ih7Var.a.setInputBuffer("shaderGradient", kh7Var.d);
                ih7Var.a.setInputBuffer("shaderGradientSoftLight", kh7Var3.d);
                ih7Var.a.setFloatUniform("transformGradient", ih7Var.b);
                ih7Var.a.setFloatUniform("transformPattern", ih7Var.c);
                paint.setShader(ih7Var.a);
                return paint;
            }
        } else {
            float a = ete.a((i * (-i2)) / 25500.0f, 0.0f, 1.0f);
            if (b2 || this.i != a || this.h != 2) {
                this.h = (byte) 2;
                this.i = a;
                ih7 ih7Var2 = this.f;
                ih7Var2.a.setInputBuffer("shaderPattern", kh7Var2.d);
                ih7Var2.a.setInputBuffer("shaderGradient", kh7Var.d);
                ih7Var2.a.setFloatUniform("intensity", a);
                ih7Var2.a.setFloatUniform("transformGradient", ih7Var2.b);
                ih7Var2.a.setFloatUniform("transformPattern", ih7Var2.c);
                paint.setShader(ih7Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
