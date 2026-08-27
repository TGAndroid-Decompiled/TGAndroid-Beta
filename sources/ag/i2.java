package ag;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public class i2 {

    public final c6 f454a;
    public LinearGradient d;

    public final int f459g;
    public final int h;

    public final int f460i;

    public final int f461j;

    public boolean f464m;

    public boolean f465n;

    public float f455b = 0.5f;

    public float f456c = 0.5f;

    public final Matrix f457e = new Matrix();

    public final Paint f458f = new Paint(1);

    public final int[] f463l = new int[5];

    public float f466o = 1.0f;

    public float f467p = 1.5f;

    public float f468q = 0.0f;

    public final int f462k = -1;

    public i2(int i10, int i11, int i12, int i13, c6 c6Var) {
        this.f454a = c6Var;
        this.f459g = i10;
        this.h = i11;
        this.f460i = i12;
        this.f461j = i13;
    }

    public final void a() {
        int iB = b(this.f459g);
        int iB2 = b(this.h);
        int i10 = this.f460i;
        int iB3 = i10 < 0 ? 0 : b(i10);
        int i11 = this.f461j;
        int iB4 = i11 < 0 ? 0 : b(i11);
        int i12 = this.f462k;
        int iB5 = i12 < 0 ? 0 : b(i12);
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f463l;
        if (linearGradient != null && iArr[0] == iB && iArr[1] == iB2 && iArr[2] == iB3 && iArr[3] == iB4 && iArr[4] == iB5) {
            return;
        }
        iArr[0] = iB;
        iArr[1] = iB2;
        iArr[2] = iB3;
        iArr[3] = iB4;
        iArr[4] = iB5;
        if (iB3 == 0) {
            this.d = new LinearGradient(0.0f, this.f466o * 100.0f, this.f467p * 100.0f, this.f468q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (iB4 == 0) {
            this.d = new LinearGradient(0.0f, this.f466o * 100.0f, this.f467p * 100.0f, this.f468q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (iB5 == 0) {
            this.d = new LinearGradient(0.0f, this.f466o * 100.0f, this.f467p * 100.0f, this.f468q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f466o * 100.0f, this.f467p * 100.0f, this.f468q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f457e);
        this.f458f.setShader(this.d);
    }

    public final int b(int i10) {
        int iC = c(i10);
        if (!this.f465n) {
            return iC;
        }
        return Color.argb(Color.alpha(iC), Color.red(iC) - 15, Color.green(iC) - 15, Color.blue(iC) - 15);
    }

    public int c(int i10) {
        return g6.v0(i10, this.f454a);
    }

    public final void d(int i10, float f10, int i11, int i12, float f11, int i13) {
        a();
        boolean z10 = this.f464m;
        Matrix matrix = this.f457e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f455b * 100.0f, this.f456c * 100.0f);
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
