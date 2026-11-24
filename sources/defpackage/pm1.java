package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class pm1 implements jac {
    public final byte a;
    public final yv1 b;

    public pm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.z8((Integer) obj, (Boolean) obj2);
                return;
            case 1:
                yv1Var.A8((Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                jz4 jz4Var = yv1Var.P8;
                jz4Var.a((Bitmap) obj2);
                tl0.c(jz4Var, yv1Var.fragmentView);
                yv1Var.Q8.d();
                return;
            default:
                yv1Var.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                yv1Var.T8 = paint;
                Bitmap bitmap2 = yv1Var.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                yv1Var.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                yv1Var.U8 = new Matrix();
                jz4 jz4Var2 = yv1Var.P8;
                jz4Var2.a((Bitmap) obj2);
                tl0.c(jz4Var2, yv1Var.fragmentView);
                yv1Var.Q8.d();
                return;
        }
    }
}
