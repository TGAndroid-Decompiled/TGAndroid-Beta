package eg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class q1 {
    public final f6 f5454a;
    public LinearGradient d;
    public final int f5458g;
    public final int h;
    public final int f5459i;
    public final int f5460j;
    public boolean f5463m;
    public boolean f5464n;
    public float f5455b = 0.5f;
    public float f5456c = 0.5f;
    public final Matrix e = new Matrix();
    public final Paint f5457f = new Paint(1);
    public final int[] f5462l = new int[5];
    public float f5465o = 1.0f;
    public float f5466p = 1.5f;
    public float f5467q = 0.0f;
    public final int f5461k = -1;

    public q1(int i10, int i11, int i12, int i13, f6 f6Var) {
        this.f5454a = f6Var;
        this.f5458g = i10;
        this.h = i11;
        this.f5459i = i12;
        this.f5460j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f5458g);
        int b14 = b(this.h);
        int i10 = this.f5459i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f5460j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f5461k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f5462l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f5465o * 100.0f, this.f5466p * 100.0f, this.f5467q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f5465o * 100.0f, this.f5466p * 100.0f, this.f5467q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f5465o * 100.0f, this.f5466p * 100.0f, this.f5467q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f5465o * 100.0f, this.f5466p * 100.0f, this.f5467q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.e);
        this.f5457f.setShader(this.d);
    }

    public final int b(int i10) {
        int c3 = c(i10);
        if (this.f5464n) {
            return Color.argb(Color.alpha(c3), Color.red(c3) - 15, Color.green(c3) - 15, Color.blue(c3) - 15);
        }
        return c3;
    }

    public int c(int i10) {
        return j6.v0(i10, this.f5454a);
    }

    public final void d(int i10, float f10, int i11, int i12, float f11, int i13) {
        a();
        boolean z4 = this.f5463m;
        Matrix matrix = this.e;
        if (z4) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f5455b * 100.0f, this.f5456c * 100.0f);
            matrix.postTranslate(f10, f11);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i14 = i13 - i11;
        int i15 = i14 + i14;
        a();
        matrix.reset();
        matrix.postScale((i12 - i10) / 100.0f, i15 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f10, (-i15) + f11);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
