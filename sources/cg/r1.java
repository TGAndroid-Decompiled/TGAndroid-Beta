package cg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class r1 {
    public final c6 f3315a;
    public LinearGradient d;
    public final int f3320g;
    public final int h;
    public final int f3321i;
    public final int f3322j;
    public boolean f3325m;
    public boolean f3326n;
    public float f3316b = 0.5f;
    public float f3317c = 0.5f;
    public final Matrix f3318e = new Matrix();
    public final Paint f3319f = new Paint(1);
    public final int[] f3324l = new int[5];
    public float f3327o = 1.0f;
    public float f3328p = 1.5f;
    public float f3329q = 0.0f;
    public final int f3323k = -1;

    public r1(int i10, int i11, int i12, int i13, c6 c6Var) {
        this.f3315a = c6Var;
        this.f3320g = i10;
        this.h = i11;
        this.f3321i = i12;
        this.f3322j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f3320g);
        int b14 = b(this.h);
        int i10 = this.f3321i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f3322j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f3323k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f3324l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f3327o * 100.0f, this.f3328p * 100.0f, this.f3329q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f3327o * 100.0f, this.f3328p * 100.0f, this.f3329q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f3327o * 100.0f, this.f3328p * 100.0f, this.f3329q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f3327o * 100.0f, this.f3328p * 100.0f, this.f3329q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f3318e);
        this.f3319f.setShader(this.d);
    }

    public final int b(int i10) {
        int c3 = c(i10);
        if (this.f3326n) {
            return Color.argb(Color.alpha(c3), Color.red(c3) - 15, Color.green(c3) - 15, Color.blue(c3) - 15);
        }
        return c3;
    }

    public int c(int i10) {
        return g6.v0(i10, this.f3315a);
    }

    public final void d(int i10, float f9, int i11, int i12, float f10, int i13) {
        a();
        boolean z10 = this.f3325m;
        Matrix matrix = this.f3318e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f3316b * 100.0f, this.f3317c * 100.0f);
            matrix.postTranslate(f9, f10);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i14 = i13 - i11;
        int i15 = i14 + i14;
        a();
        matrix.reset();
        matrix.postScale((i12 - i10) / 100.0f, i15 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f9, (-i15) + f10);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
