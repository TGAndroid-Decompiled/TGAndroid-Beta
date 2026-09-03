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
    public final f6 f5443a;
    public LinearGradient d;
    public final int f5447g;
    public final int h;
    public final int f5448i;
    public final int f5449j;
    public boolean f5452m;
    public boolean f5453n;
    public float f5444b = 0.5f;
    public float f5445c = 0.5f;
    public final Matrix e = new Matrix();
    public final Paint f5446f = new Paint(1);
    public final int[] f5451l = new int[5];
    public float f5454o = 1.0f;
    public float f5455p = 1.5f;
    public float f5456q = 0.0f;
    public final int f5450k = -1;

    public q1(int i10, int i11, int i12, int i13, f6 f6Var) {
        this.f5443a = f6Var;
        this.f5447g = i10;
        this.h = i11;
        this.f5448i = i12;
        this.f5449j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f5447g);
        int b14 = b(this.h);
        int i10 = this.f5448i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f5449j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f5450k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f5451l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f5454o * 100.0f, this.f5455p * 100.0f, this.f5456q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f5454o * 100.0f, this.f5455p * 100.0f, this.f5456q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f5454o * 100.0f, this.f5455p * 100.0f, this.f5456q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f5454o * 100.0f, this.f5455p * 100.0f, this.f5456q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.e);
        this.f5446f.setShader(this.d);
    }

    public final int b(int i10) {
        int c3 = c(i10);
        if (this.f5453n) {
            return Color.argb(Color.alpha(c3), Color.red(c3) - 15, Color.green(c3) - 15, Color.blue(c3) - 15);
        }
        return c3;
    }

    public int c(int i10) {
        return j6.v0(i10, this.f5443a);
    }

    public final void d(int i10, float f10, int i11, int i12, float f11, int i13) {
        a();
        boolean z4 = this.f5452m;
        Matrix matrix = this.e;
        if (z4) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f5444b * 100.0f, this.f5445c * 100.0f);
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
