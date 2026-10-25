package eh;

import a8.ee;
import a8.w0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.util.Arrays;
public final class c {
    public int d;
    public boolean e;
    public int f9952f;
    public float f9954i;
    public float f9955j;
    public final Rect f9949a = new Rect();
    public final float[] f9950b = new float[8];
    public final float[] f9951c = new float[8];
    public float f9953g = 0.75f;
    public final float h = 1.5f;
    public final Path f9956k = new Path();
    public boolean f9957l = true;
    public final Rect f9958m = new Rect();
    public final Path f9959n = new Path();
    public final Path f9960o = new Path();

    public final void a() {
        float[] fArr = this.f9950b;
        this.f9957l = w0.a(fArr);
        Rect rect = this.f9949a;
        Rect rect2 = this.f9958m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.f9956k;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f9950b, direction);
        path.close();
        float min = Math.min(rect2.width(), rect2.height()) / 2.0f;
        float[] fArr2 = d.W;
        Arrays.fill(fArr2, 0.0f);
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        if (this.f9957l && fArr[0] > min) {
            fArr2[3] = min;
            fArr2[2] = min;
            fArr2[1] = min;
            fArr2[0] = min;
        }
        Path path2 = this.f9959n;
        path2.rewind();
        float f7 = rect2.left;
        int i11 = rect2.top;
        path2.addRoundRect(f7, i11, rect2.right, Math.min(i11 + fArr[0], rect2.bottom), fArr2, direction);
        int i12 = rect2.top;
        float min2 = Math.min(i12 + fArr[0], rect2.bottom);
        Path.Direction direction2 = Path.Direction.CCW;
        path2.addRoundRect(rect2.left, i12 + this.f9954i, rect2.right, min2, fArr2, direction2);
        path2.close();
        Arrays.fill(fArr2, 0.0f);
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
        if (this.f9957l && fArr[0] > min) {
            fArr2[7] = min;
            fArr2[6] = min;
            fArr2[5] = min;
            fArr2[4] = min;
        }
        Path path3 = this.f9960o;
        path3.rewind();
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom, fArr2, direction);
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom - this.f9955j, fArr2, direction2);
        path3.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f9957l) {
            float f7 = this.f9958m.bottom;
            float f10 = this.f9950b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f7, f10, f10, paint);
            return;
        }
        canvas.drawPath(this.f9956k, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z10) {
        Rect rect;
        if (z10) {
            float f7 = this.f9958m.top;
            float[] fArr = this.f9950b;
            float a2 = ee.a((fArr[0] * 2.0f) + f7, f7, rect.bottom);
            canvas.save();
            Rect rect2 = this.f9949a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
            float f10 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a2, f10, f10, paint);
            canvas.restore();
            return;
        }
        b(canvas, paint);
    }
}
