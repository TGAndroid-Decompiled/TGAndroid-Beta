package kg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import ff.m0;
import g7.n;
import java.util.Arrays;
public final class c {
    public int d;
    public boolean f14805e;
    public int f14806f;
    public float f14808i;
    public float f14809j;
    public final Rect f14802a = new Rect();
    public final float[] f14803b = new float[8];
    public final float[] f14804c = new float[8];
    public float f14807g = 0.75f;
    public final float h = 1.5f;
    public final Path f14810k = new Path();
    public boolean f14811l = true;
    public final Rect f14812m = new Rect();
    public final Path f14813n = new Path();
    public final Path f14814o = new Path();

    public final void a() {
        float[] fArr = this.f14803b;
        this.f14811l = m0.c(fArr);
        Rect rect = this.f14802a;
        Rect rect2 = this.f14812m;
        rect2.set(rect);
        int i9 = this.d;
        rect2.inset(i9, i9);
        Path path = this.f14810k;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f14803b, direction);
        path.close();
        float min = Math.min(rect2.width(), rect2.height()) / 2.0f;
        float[] fArr2 = d.C;
        Arrays.fill(fArr2, 0.0f);
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        if (this.f14811l && fArr[0] > min) {
            fArr2[3] = min;
            fArr2[2] = min;
            fArr2[1] = min;
            fArr2[0] = min;
        }
        Path path2 = this.f14813n;
        path2.rewind();
        float f10 = rect2.left;
        int i10 = rect2.top;
        path2.addRoundRect(f10, i10, rect2.right, Math.min(i10 + fArr[0], rect2.bottom), fArr2, direction);
        int i11 = rect2.top;
        float min2 = Math.min(i11 + fArr[0], rect2.bottom);
        Path.Direction direction2 = Path.Direction.CCW;
        path2.addRoundRect(rect2.left, i11 + this.f14808i, rect2.right, min2, fArr2, direction2);
        path2.close();
        Arrays.fill(fArr2, 0.0f);
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
        if (this.f14811l && fArr[0] > min) {
            fArr2[7] = min;
            fArr2[6] = min;
            fArr2[5] = min;
            fArr2[4] = min;
        }
        Path path3 = this.f14814o;
        path3.rewind();
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom, fArr2, direction);
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom - this.f14809j, fArr2, direction2);
        path3.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f14811l) {
            float f10 = this.f14812m.bottom;
            float f11 = this.f14803b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f10, f11, f11, paint);
            return;
        }
        canvas.drawPath(this.f14810k, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z10) {
        Rect rect;
        if (z10) {
            float f10 = this.f14812m.top;
            float[] fArr = this.f14803b;
            float a2 = n.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
            canvas.save();
            Rect rect2 = this.f14802a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
            float f11 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a2, f11, f11, paint);
            canvas.restore();
            return;
        }
        b(canvas, paint);
    }
}
