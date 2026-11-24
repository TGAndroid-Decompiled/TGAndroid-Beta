package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
public final class af7 {
    public final Paint a;
    public final bf7 b;
    public final bf7 c;
    public final bf7 d;
    public final ze7 e;
    public final ze7 f;
    public final float[] g;
    public byte h;
    public float i;

    public af7() {
        Paint paint = new Paint();
        this.a = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new bf7(tileMode);
        this.c = new bf7(tileMode);
        this.d = new bf7(Shader.TileMode.REPEAT);
        this.e = new ze7(2131624357);
        this.f = new ze7(2131624356);
        this.g = new float[4];
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final Paint a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i, int i2) {
        bf7 bf7Var = this.b;
        boolean b = bf7Var.b(bitmap);
        bf7 bf7Var2 = this.d;
        boolean b2 = b | bf7Var2.b(bitmap2);
        Paint paint = this.a;
        if (i2 >= 0) {
            bf7 bf7Var3 = this.c;
            if ((b2 | bf7Var3.b(bitmap3)) || this.h != 1) {
                this.h = (byte) 1;
                ze7 ze7Var = this.e;
                ze7Var.a.setInputBuffer("shaderPattern", bf7Var2.d);
                ze7Var.a.setInputBuffer("shaderGradient", bf7Var.d);
                ze7Var.a.setInputBuffer("shaderGradientSoftLight", bf7Var3.d);
                ze7Var.a.setFloatUniform("transformGradient", ze7Var.b);
                ze7Var.a.setFloatUniform("transformPattern", ze7Var.c);
                paint.setShader(ze7Var.a);
                return paint;
            }
        } else {
            float a = moe.a((i * (-i2)) / 25500.0f, 0.0f, 1.0f);
            if (b2 || this.i != a || this.h != 2) {
                this.h = (byte) 2;
                this.i = a;
                ze7 ze7Var2 = this.f;
                ze7Var2.a.setInputBuffer("shaderPattern", bf7Var2.d);
                ze7Var2.a.setInputBuffer("shaderGradient", bf7Var.d);
                ze7Var2.a.setFloatUniform("intensity", a);
                ze7Var2.a.setFloatUniform("transformGradient", ze7Var2.b);
                ze7Var2.a.setFloatUniform("transformPattern", ze7Var2.c);
                paint.setShader(ze7Var2.a);
                return paint;
            }
        }
        return paint;
    }
}
