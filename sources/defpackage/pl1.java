package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.tgnet.TLRPC;
public final class pl1 implements icc {
    public final byte a;
    public final zu1 b;

    public pl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d31 Y;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                nz4 nz4Var = zu1Var.P8;
                nz4Var.a((Bitmap) obj2);
                uk0.c(nz4Var, zu1Var.fragmentView);
                zu1Var.Q8.d();
                return;
            case 1:
                zu1Var.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                zu1Var.T8 = paint;
                Bitmap bitmap2 = zu1Var.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                zu1Var.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                zu1Var.U8 = new Matrix();
                nz4 nz4Var2 = zu1Var.P8;
                nz4Var2.a((Bitmap) obj2);
                uk0.c(nz4Var2, zu1Var.fragmentView);
                zu1Var.Q8.d();
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z = false;
                zu1Var.Qc = false;
                if (!zu1Var.isFinished && d31.a(zu1Var)) {
                    z = true;
                }
                if (z) {
                    Y = d31.b0(zu1Var);
                } else {
                    Y = d31.Y();
                }
                if (bool.booleanValue()) {
                    Y.I(2131623990, ob6.M0(2131747850, null), ob6.M0(2131747851, null)).j();
                } else {
                    Y.Z(tL_error).j();
                }
                if (z) {
                    zu1Var.zd(true);
                    return;
                }
                return;
            case 3:
                zu1Var.A8((Integer) obj, (Boolean) obj2);
                return;
            default:
                zu1Var.B8((Long) obj, (Boolean) obj2);
                return;
        }
    }
}
