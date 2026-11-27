package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class dz1 extends kg5 {
    public final RectF X0;
    public final Path Y0;
    public final Path Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;
    public int e1;
    public float f1;
    public final Paint g1;

    public dz1(Context context) {
        super(context, 2);
        this.X0 = new RectF();
        this.Y0 = new Path();
        this.Z0 = new Path();
        this.a1 = -1.0f;
        this.b1 = -1.0f;
        this.c1 = -1.0f;
        this.e1 = -1;
        this.f1 = hl.N(7.0f);
        this.g1 = new Paint(1);
        this.E = hl.N(8.0f);
        this.F = hl.N(7.0f);
    }

    public static void z(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        double acos = Math.acos(Utilities.i((f4 * f6) + (f3 * f5), 1.0f, -1.0f));
        float tan = (float) (Math.tan(acos / 2.0d) * f7);
        float tan2 = ((float) (Math.tan(acos / 4.0d) * 1.3333333333333333d)) * f7;
        float f8 = f - (f3 * tan);
        float f9 = f2 - (f4 * tan);
        float f10 = (f5 * tan) + f;
        float f11 = (tan * f6) + f2;
        path.lineTo(f8, f9);
        path.cubicTo((f3 * tan2) + f8, (f4 * tan2) + f9, f10 - (f5 * tan2), f11 - (f6 * tan2), f10, f11);
    }

    @Override
    public final void c(Canvas canvas, float f) {
        float N;
        Paint paint;
        if (-1 != this.e1) {
            this.e1 = -1;
            this.I.u(-1);
            this.K.setColor(-1);
        }
        Path path = this.F0;
        RectF rectF = this.X0;
        path.computeBounds(rectF, true);
        rectF.right -= this.f1;
        if (rectF.height() < hl.N(44.0f)) {
            N = Math.round(rectF.height() * 0.36f);
        } else {
            N = hl.N(7.0f);
        }
        if (Math.abs(N - this.f1) > 0.5f) {
            this.f1 = N;
            float f2 = N / hl.p;
            this.E = hl.N(8.0f);
            this.F = hl.N(f2);
            o(0.0f, this.d1 + 0.01f);
            this.a1 = -1.0f;
            invalidate();
            return;
        }
        float i = Utilities.i(this.d1, rectF.bottom - hl.N(8.0f), hl.N(8.0f) + rectF.top) - rectF.top;
        int i2 = (Math.abs(rectF.width() - this.a1) > 0.5f ? 1 : (Math.abs(rectF.width() - this.a1) == 0.5f ? 0 : -1));
        Path path2 = this.Y0;
        if (i2 > 0 || Math.abs(rectF.height() - this.b1) > 0.5f || Math.abs(i - this.c1) > 0.5f) {
            float width = rectF.width();
            float height = rectF.height();
            this.a1 = width;
            this.b1 = height;
            this.c1 = i;
            if (height < hl.N(44.0f)) {
                float f3 = height / 2.0f;
                float f4 = this.f1;
                float N2 = hl.N(7.0f);
                float N3 = hl.N(4.0f);
                double d = f3;
                double d2 = N3;
                float N4 = ((f4 + width) - hl.N(2.0f)) + ((float) ((d2 / Math.sin(Math.atan2(f4, d))) - d2));
                float f5 = N4 - width;
                float hypot = (float) Math.hypot(f5, d);
                float f6 = f5 / hypot;
                float f7 = f3 / hypot;
                path2.rewind();
                path2.moveTo(f3, 0.0f);
                z(path2, width, 0.0f, 1.0f, 0.0f, f6, f7, N2);
                float f8 = -f6;
                z(path2, N4, f3, f6, f7, f8, f7, N3);
                z(path2, width, height, f8, f7, -1.0f, 0.0f, N2);
                path2.lineTo(f3, height);
                path2.arcTo(0.0f, 0.0f, f3 * 2.0f, height, 90.0f, 180.0f, false);
                path2.close();
            } else {
                float N5 = hl.N(8.0f);
                float N6 = hl.N(7.0f);
                float min = Math.min(height / 2.0f, hl.N(18.0f));
                float f9 = i - N5;
                float max = Math.max(hl.N(4.0f), Math.min(min, Math.min(f9, (height - i) - N5)));
                path2.rewind();
                path2.moveTo(min, 0.0f);
                float f10 = width - max;
                path2.lineTo(f10, 0.0f);
                path2.quadTo(width, 0.0f, width, max);
                float max2 = Math.max(max, f9);
                float f11 = height - max;
                float min2 = Math.min(f11, i + N5);
                path2.lineTo(width, max2);
                float N7 = hl.N(2.0f);
                float N8 = hl.N(1.5f);
                double d3 = N7;
                float N9 = ((N6 + width) - hl.N(2.0f)) + ((float) ((d3 / Math.sin(Math.atan2(N5, N6))) - d3));
                float f12 = N9 - width;
                double d4 = f12;
                float f13 = i - max2;
                float hypot2 = (float) Math.hypot(d4, f13);
                float f14 = f12 / hypot2;
                float f15 = f13 / hypot2;
                float f16 = min2 - i;
                float hypot3 = (float) Math.hypot(d4, f16);
                float f17 = (-f12) / hypot3;
                float f18 = f16 / hypot3;
                z(path2, width, max2, 0.0f, 1.0f, f14, f15, N8);
                z(path2, N9, i, f14, f15, f17, f18, N7);
                path2 = path2;
                z(path2, width, min2, f17, f18, 0.0f, 1.0f, N8);
                path2.lineTo(width, f11);
                path2.quadTo(width, height, f10, height);
                path2.lineTo(min, height);
                float f19 = min * 2.0f;
                path2.arcTo(0.0f, height - f19, f19, height, 90.0f, 90.0f, false);
                path2.lineTo(0.0f, min);
                path2.arcTo(0.0f, 0.0f, f19, f19, 180.0f, 90.0f, false);
                path2.close();
            }
        }
        float f20 = rectF.left;
        float f21 = rectF.top;
        Path path3 = this.Z0;
        path2.offset(f20, f21, path3);
        int color = this.G.getColor();
        Paint paint2 = this.g1;
        paint2.setColor(color);
        paint2.setAlpha((int) (Color.alpha(paint.getColor()) * f));
        canvas.drawPath(path3, paint2);
    }

    @Override
    public final void o(float f, float f2) {
        this.d1 = f2;
        super.o(f, f2);
    }
}
