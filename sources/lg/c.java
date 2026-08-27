package lg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import gf.m0;
import h7.n;
import java.util.Arrays;

public final class c {
    public int d;

    public boolean f15583e;

    public int f15584f;

    public float f15586i;

    public float f15587j;

    public final Rect f15580a = new Rect();

    public final float[] f15581b = new float[8];

    public final float[] f15582c = new float[8];

    public float f15585g = 0.75f;
    public final float h = 1.5f;

    public final Path f15588k = new Path();

    public boolean f15589l = true;

    public final Rect f15590m = new Rect();

    public final Path f15591n = new Path();

    public final Path f15592o = new Path();

    public final void a() {
        float[] fArr = this.f15581b;
        this.f15589l = m0.c(fArr);
        Rect rect = this.f15580a;
        Rect rect2 = this.f15590m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.f15588k;
        path.rewind();
        float f10 = rect2.left;
        float f11 = rect2.top;
        float f12 = rect2.right;
        float f13 = rect2.bottom;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(f10, f11, f12, f13, this.f15581b, direction);
        path.close();
        float fMin = Math.min(rect2.width(), rect2.height()) / 2.0f;
        float[] fArr2 = d.C;
        Arrays.fill(fArr2, 0.0f);
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        if (this.f15589l && fArr[0] > fMin) {
            fArr2[3] = fMin;
            fArr2[2] = fMin;
            fArr2[1] = fMin;
            fArr2[0] = fMin;
        }
        Path path2 = this.f15591n;
        path2.rewind();
        float f14 = rect2.left;
        int i11 = rect2.top;
        path2.addRoundRect(f14, i11, rect2.right, Math.min(i11 + fArr[0], rect2.bottom), fArr2, direction);
        float f15 = rect2.left;
        int i12 = rect2.top;
        float f16 = i12 + this.f15586i;
        float f17 = rect2.right;
        float fMin2 = Math.min(i12 + fArr[0], rect2.bottom);
        Path.Direction direction2 = Path.Direction.CCW;
        path2.addRoundRect(f15, f16, f17, fMin2, fArr2, direction2);
        path2.close();
        Arrays.fill(fArr2, 0.0f);
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
        if (this.f15589l && fArr[0] > fMin) {
            fArr2[7] = fMin;
            fArr2[6] = fMin;
            fArr2[5] = fMin;
            fArr2[4] = fMin;
        }
        Path path3 = this.f15592o;
        path3.rewind();
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom, fArr2, direction);
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom - this.f15587j, fArr2, direction2);
        path3.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        if (!this.f15589l) {
            canvas.drawPath(this.f15588k, paint);
            return;
        }
        Rect rect = this.f15590m;
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        float f14 = this.f15581b[0];
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z10) {
        if (!z10) {
            b(canvas, paint);
            return;
        }
        Rect rect = this.f15590m;
        float f10 = rect.top;
        float[] fArr = this.f15581b;
        float fA = n.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
        canvas.save();
        Rect rect2 = this.f15580a;
        canvas.clipRect(rect2.left, rect2.top, rect2.right, fA);
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = fArr[0];
        canvas.drawRoundRect(f11, f12, f13, fA, f14, f14, paint);
        canvas.restore();
    }
}
