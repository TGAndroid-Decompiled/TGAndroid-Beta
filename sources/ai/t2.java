package ai;

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
import ci.lc;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yp;
public class t2 extends yp {
    public ly0 f978c;
    public ly0 d;
    public final org.telegram.ui.Components.u5 f979e;
    public final Path f980f;
    public final Path h;
    public final Paint f981n;
    public final Paint f982r;
    public final float f983s;
    public lc f984w;
    public boolean f985x;
    public int f986y;

    public t2(View view) {
        super(view);
        this.f979e = new org.telegram.ui.Components.u5(new s(this, 4), 320L, xq.h, 0);
        Path path = new Path();
        this.f980f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.f981n = paint;
        Paint paint2 = new Paint(1);
        this.f982r = paint2;
        this.f986y = -1;
        this.f983s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.f40801b).setColor(-698031);
        ((Paint) this.f40801b).setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f10, final boolean z10) {
        v10 v10Var = new v10() {
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
        path.moveTo(a1.g.i((Float) v10Var.a(Float.valueOf(46.83f)), f10), org.telegram.messenger.g0.L(f11));
        path.lineTo(a1.g.i((Float) v10Var.a(Float.valueOf(23.5f)), f10), org.telegram.messenger.g0.L(1.17f * f10));
        path.cubicTo(a1.g.i((Float) v10Var.a(Float.valueOf(22.75f)), f10), org.telegram.messenger.g0.L(0.42f * f10), a1.g.i((Float) v10Var.a(Float.valueOf(21.73f)), f10), 0.0f, a1.g.i((Float) v10Var.a(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(a1.g.i((Float) v10Var.a(Float.valueOf(19.62f)), f10), 0.0f, a1.g.i((Float) v10Var.a(Float.valueOf(2.73f)), f10), org.telegram.messenger.g0.L(f12), a1.g.i((Float) v10Var.a(Float.valueOf(1.55f)), f10), org.telegram.messenger.g0.L(f12));
        path.cubicTo(a1.g.i((Float) v10Var.a(Float.valueOf(0.36f)), f10), org.telegram.messenger.g0.L(f12), a1.g.i((Float) v10Var.a(Float.valueOf(-0.23f)), f10), org.telegram.messenger.g0.L(1.4885f * f10), a1.g.i((Float) v10Var.a(Float.valueOf(0.6f)), f10), org.telegram.messenger.g0.L(2.32f * f10));
        path.lineTo(a1.g.i((Float) v10Var.a(Float.valueOf(45.72f)), f10), org.telegram.messenger.g0.L(47.44f * f10));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(a1.g.i((Float) v10Var.a(Float.valueOf(46.56f)), f10), org.telegram.messenger.g0.L(48.28f * f10), a1.g.i((Float) v10Var.a(valueOf), f10), org.telegram.messenger.g0.L(47.68f * f10), a1.g.i((Float) v10Var.a(valueOf), f10), org.telegram.messenger.g0.L(46.5f * f10));
        path.cubicTo(a1.g.i((Float) v10Var.a(valueOf), f10), org.telegram.messenger.g0.L(45.31f * f10), a1.g.i((Float) v10Var.a(valueOf), f10), org.telegram.messenger.g0.L(28.38f * f10), a1.g.i((Float) v10Var.a(valueOf), f10), org.telegram.messenger.g0.L(27.32f * f10));
        path.cubicTo(a1.g.i((Float) v10Var.a(valueOf), f10), org.telegram.messenger.g0.L(26.26f * f10), a1.g.i((Float) v10Var.a(Float.valueOf(47.5f)), f10), org.telegram.messenger.g0.L(25.24f * f10), a1.g.i((Float) v10Var.a(Float.valueOf(46.82f)), f10), org.telegram.messenger.g0.L(f11));
        path.close();
    }

    public final void c(Canvas canvas, ly0 ly0Var, float f10) {
        float f11;
        float f12;
        canvas.save();
        canvas.translate(f10, f10);
        float width = getBounds().width() / 2.0f;
        float f13 = 6.0f;
        if (this.f985x) {
            f11 = -7.0f;
        } else {
            f11 = 6.0f;
        }
        float L = width + org.telegram.messenger.g0.L(f11);
        float height = getBounds().height() / 2.0f;
        if (this.f985x) {
            f13 = 5.0f;
        }
        float L2 = height - org.telegram.messenger.g0.L(f13);
        if (this.f985x) {
            f12 = -45.0f;
        } else {
            f12 = 45.0f;
        }
        canvas.rotate(f12, L, L2);
        float min = Math.min(1.0f, org.telegram.messenger.g0.L(40.0f) / ly0Var.f35918c);
        canvas.scale(min, min, L, L2);
        ly0Var.c(L - (ly0Var.k() / 2.0f), L2 + org.telegram.messenger.g0.L(1.0f), 1.0f, this.f986y, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.g0.L(48.0f), getBounds().top);
        Paint paint = this.f982r;
        int alpha = paint.getAlpha();
        Path path = this.f980f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.f40801b);
        lc lcVar = this.f984w;
        float f10 = this.f983s;
        if (lcVar != null) {
            float f11 = f10 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), null);
            this.f984w.f(0, 0, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
            this.f984w.d();
            this.f984w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.f981n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.f978c != null) {
            org.telegram.ui.Components.u5 u5Var = this.f979e;
            float e10 = u5Var.e(false, 1.0f);
            if (!u5Var.f38649i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && u5Var.f38649i) {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.g0.L(f10 * 64.0f);
                c(canvas2, this.d, L * e10);
                c(canvas2, this.f978c, (1.0f - e10) * (-L));
            } else {
                c(canvas2, this.f978c, 0.0f);
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
        Paint paint = (Paint) this.f40801b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f985x) {
            z12 = !z10;
        } else {
            z12 = z10;
        }
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(48.0f);
        int i3 = stargiftattributebackdrop.center_color | (-16777216);
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
        int b10 = org.telegram.ui.ActionBar.k6.b(f10, f11 - f12, i3);
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
        int[] iArr = {b10, org.telegram.ui.ActionBar.k6.b(f14, f15 - f16, i10)};
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

    public final void f(int i3, CharSequence charSequence, boolean z10) {
        Typeface typeface = null;
        this.d = null;
        this.f979e.e(true, 1.0f);
        float f10 = i3;
        if (z10) {
            typeface = org.telegram.messenger.g0.o();
        }
        this.f978c = new ly0(charSequence, f10, typeface);
        invalidateSelf();
    }

    public final void g(int i3, String str) {
        ly0 ly0Var = this.f978c;
        if (ly0Var == null) {
            f(i3, str, true);
        } else if (TextUtils.equals(ly0Var.j(), str)) {
        } else {
            this.d = this.f978c;
            this.f978c = new ly0(str, i3, org.telegram.messenger.g0.o());
            this.f979e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
