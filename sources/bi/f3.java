package bi;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import di.ec;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;
public class f3 extends a5.h {
    public vy0 f3598c;
    public vy0 d;
    public final org.telegram.ui.Components.c6 f3599e;
    public final Path f3600f;
    public final Path h;
    public final Paint f3601n;
    public final Paint f3602r;
    public final float f3603s;
    public ec f3604w;
    public boolean f3605x;
    public int f3606y;

    public f3(View view, float f10) {
        super(view);
        this.f3599e = new org.telegram.ui.Components.c6(new a3.f(this, 23), 320L, lr.h, 0);
        Path path = new Path();
        this.f3600f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.f3601n = paint;
        Paint paint2 = new Paint(1);
        this.f3602r = paint2;
        this.f3606y = -1;
        this.f3603s = f10;
        d(path, f10, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.f220b).setColor(-698031);
        ((Paint) this.f220b).setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f10, final boolean z10) {
        y10 y10Var = new y10() {
            @Override
            public final Object a(Object obj) {
                float floatValue;
                Float f11 = (Float) obj;
                if (z10) {
                    floatValue = 48.0f - f11.floatValue();
                } else {
                    floatValue = f11.floatValue();
                }
                return Float.valueOf(floatValue);
            }
        };
        path.rewind();
        float f11 = f10 * 24.5f;
        path.moveTo(a8.p0.h((Float) y10Var.a(Float.valueOf(46.83f)), f10), org.telegram.messenger.g0.L(f11));
        path.lineTo(a8.p0.h((Float) y10Var.a(Float.valueOf(23.5f)), f10), org.telegram.messenger.g0.L(1.17f * f10));
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(22.75f)), f10), org.telegram.messenger.g0.L(0.42f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(21.73f)), f10), 0.0f, a8.p0.h((Float) y10Var.a(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(19.62f)), f10), 0.0f, a8.p0.h((Float) y10Var.a(Float.valueOf(2.73f)), f10), org.telegram.messenger.g0.L(f12), a8.p0.h((Float) y10Var.a(Float.valueOf(1.55f)), f10), org.telegram.messenger.g0.L(f12));
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(0.36f)), f10), org.telegram.messenger.g0.L(f12), a8.p0.h((Float) y10Var.a(Float.valueOf(-0.23f)), f10), org.telegram.messenger.g0.L(1.4885f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(0.6f)), f10), org.telegram.messenger.g0.L(2.32f * f10));
        path.lineTo(a8.p0.h((Float) y10Var.a(Float.valueOf(45.72f)), f10), org.telegram.messenger.g0.L(47.44f * f10));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(a8.p0.h((Float) y10Var.a(Float.valueOf(46.56f)), f10), org.telegram.messenger.g0.L(48.28f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(47.68f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(46.5f * f10));
        path.cubicTo(a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(45.31f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(28.38f * f10), a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(27.32f * f10));
        path.cubicTo(a8.p0.h((Float) y10Var.a(valueOf), f10), org.telegram.messenger.g0.L(26.26f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(47.5f)), f10), org.telegram.messenger.g0.L(25.24f * f10), a8.p0.h((Float) y10Var.a(Float.valueOf(46.82f)), f10), org.telegram.messenger.g0.L(f11));
        path.close();
    }

    public final void c(Canvas canvas, vy0 vy0Var, float f10) {
        float f11;
        float f12;
        canvas.save();
        canvas.translate(f10, f10);
        float width = getBounds().width() / 2.0f;
        float f13 = 6.0f;
        if (this.f3605x) {
            f11 = -7.0f;
        } else {
            f11 = 6.0f;
        }
        float L = width + org.telegram.messenger.g0.L(f11);
        float height = getBounds().height() / 2.0f;
        if (this.f3605x) {
            f13 = 5.0f;
        }
        float L2 = height - org.telegram.messenger.g0.L(f13);
        if (this.f3605x) {
            f12 = -45.0f;
        } else {
            f12 = 45.0f;
        }
        canvas.rotate(f12, L, L2);
        float min = Math.min(1.0f, org.telegram.messenger.g0.L(40.0f) / vy0Var.f41482c);
        canvas.scale(min, min, L, L2);
        vy0Var.c(L - (vy0Var.k() / 2.0f), L2 + org.telegram.messenger.g0.L(1.0f), 1.0f, this.f3606y, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.g0.L(48.0f), getBounds().top);
        Paint paint = this.f3602r;
        int alpha = paint.getAlpha();
        Path path = this.f3600f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.f220b);
        ec ecVar = this.f3604w;
        float f10 = this.f3603s;
        if (ecVar != null) {
            float f11 = f10 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), null);
            this.f3604w.f(0, 0, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
            this.f3604w.d();
            this.f3604w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.f3601n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.f3598c != null) {
            org.telegram.ui.Components.c6 c6Var = this.f3599e;
            float e10 = c6Var.e(false, 1.0f);
            if (!c6Var.f33896i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && c6Var.f33896i) {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.g0.L(f10 * 64.0f);
                c(canvas2, this.d, L * e10);
                c(canvas2, this.f3598c, (1.0f - e10) * (-L));
            } else {
                c(canvas2, this.f3598c, 0.0f);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint = (Paint) this.f220b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f3605x) {
            z12 = !z10;
        } else {
            z12 = z10;
        }
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(48.0f);
        int i7 = stargiftattributebackdrop.center_color | (-16777216);
        float f14 = 0.05f;
        if (z12) {
            f10 = 0.07f;
        } else {
            f10 = 0.05f;
        }
        float f15 = -0.1f;
        if (z12) {
            f11 = -0.15f;
        } else {
            f11 = -0.1f;
        }
        float f16 = 0.125f;
        float f17 = 0.0f;
        if (z11) {
            f12 = 0.125f;
        } else {
            f12 = 0.0f;
        }
        int b10 = org.telegram.ui.ActionBar.n6.b(f10, f11 - f12, i7);
        int i10 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z12) {
            f14 = 0.07f;
        }
        if (z12) {
            f15 = -0.15f;
        }
        if (!z11) {
            f16 = 0.0f;
        }
        int[] iArr = {b10, org.telegram.ui.ActionBar.n6.b(f14, f15 - f16, i10)};
        if (z12) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (!z12) {
            f17 = 1.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, L, L2, iArr, new float[]{f13, f17}, Shader.TileMode.CLAMP));
    }

    public final void f(int i7) {
        Paint paint = (Paint) this.f220b;
        paint.setShader(null);
        paint.setColor(i7);
    }

    public final void g(int i7, CharSequence charSequence, boolean z10) {
        Typeface typeface = null;
        this.d = null;
        this.f3599e.e(true, 1.0f);
        float f10 = i7;
        if (z10) {
            typeface = org.telegram.messenger.g0.o();
        }
        this.f3598c = new vy0(charSequence, f10, typeface);
        invalidateSelf();
    }

    public final void h(int i7, String str) {
        vy0 vy0Var = this.f3598c;
        if (vy0Var == null) {
            g(i7, str, true);
        } else if (TextUtils.equals(vy0Var.j(), str)) {
        } else {
            this.d = this.f3598c;
            this.f3598c = new vy0(str, i7, org.telegram.messenger.g0.o());
            this.f3599e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
