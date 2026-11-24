package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class gl1 implements i8c {
    public final byte a;
    public final mu1 b;

    public gl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.n8((Integer) obj, (Boolean) obj2);
                return;
            case 1:
                mu1Var.o8((Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                hx4 hx4Var = mu1Var.P8;
                hx4Var.a((Bitmap) obj2);
                tk0.c(hx4Var, mu1Var.fragmentView);
                mu1Var.Q8.d();
                return;
            default:
                mu1Var.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                mu1Var.T8 = paint;
                Bitmap bitmap2 = mu1Var.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                mu1Var.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                mu1Var.U8 = new Matrix();
                hx4 hx4Var2 = mu1Var.P8;
                hx4Var2.a((Bitmap) obj2);
                tk0.c(hx4Var2, mu1Var.fragmentView);
                mu1Var.Q8.d();
                return;
        }
    }
}
