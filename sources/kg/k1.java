package kg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public class k1 {
    public final p6 f11140a;
    public LinearGradient d;
    public final int f11144g;
    public final int h;
    public final int f11145i;
    public final int f11146j;
    public boolean f11149m;
    public boolean f11150n;
    public float f11141b = 0.5f;
    public float f11142c = 0.5f;
    public final Matrix e = new Matrix();
    public final Paint f11143f = new Paint(1);
    public final int[] f11148l = new int[5];
    public float f11151o = 1.0f;
    public float f11152p = 1.5f;
    public float f11153q = 0.0f;
    public final int f11147k = -1;

    public k1(int i10, int i11, int i12, int i13, p6 p6Var) {
        this.f11140a = p6Var;
        this.f11144g = i10;
        this.h = i11;
        this.f11145i = i12;
        this.f11146j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f11144g);
        int b14 = b(this.h);
        int i10 = this.f11145i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f11146j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f11147k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f11148l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f11151o * 100.0f, this.f11152p * 100.0f, this.f11153q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f11151o * 100.0f, this.f11152p * 100.0f, this.f11153q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f11151o * 100.0f, this.f11152p * 100.0f, this.f11153q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f11151o * 100.0f, this.f11152p * 100.0f, this.f11153q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.e);
        this.f11143f.setShader(this.d);
    }

    public final int b(int i10) {
        int c10 = c(i10);
        if (this.f11150n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i10) {
        return t6.w0(i10, this.f11140a);
    }

    public final void d(int i10, float f7, int i11, int i12, float f10, int i13) {
        a();
        boolean z10 = this.f11149m;
        Matrix matrix = this.e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f11141b * 100.0f, this.f11142c * 100.0f);
            matrix.postTranslate(f7, f10);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i14 = i13 - i11;
        int i15 = i14 + i14;
        a();
        matrix.reset();
        matrix.postScale((i12 - i10) / 100.0f, i15 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f7, (-i15) + f10);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
