package fh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import gh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.nz0;
public final class i2 extends hq {
    public nz0 f6512b;
    public final Path f6513c;
    public final Paint d;
    public final float f6514e;
    public bb f6515f;
    public boolean f6516g;
    public int h;

    public i2(View view) {
        super(view);
        Path path = new Path();
        this.f6513c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = -1;
        this.f6514e = 1.0f;
        c(path, 1.0f, false);
        this.f29171a.setColor(-698031);
        this.f29171a.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void c(Path path, float f10, final boolean z10) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
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
        path.moveTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(46.83f)), f10), AndroidUtilities.dp(f11));
        path.lineTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(23.5f)), f10), AndroidUtilities.dp(1.17f * f10));
        path.cubicTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(22.75f)), f10), AndroidUtilities.dp(0.42f * f10), e2.c.f((Float) callbackReturn.run(Float.valueOf(21.73f)), f10), 0.0f, e2.c.f((Float) callbackReturn.run(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(19.62f)), f10), 0.0f, e2.c.f((Float) callbackReturn.run(Float.valueOf(2.73f)), f10), AndroidUtilities.dp(f12), e2.c.f((Float) callbackReturn.run(Float.valueOf(1.55f)), f10), AndroidUtilities.dp(f12));
        path.cubicTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(0.36f)), f10), AndroidUtilities.dp(f12), e2.c.f((Float) callbackReturn.run(Float.valueOf(-0.23f)), f10), AndroidUtilities.dp(1.4885f * f10), e2.c.f((Float) callbackReturn.run(Float.valueOf(0.6f)), f10), AndroidUtilities.dp(2.32f * f10));
        path.lineTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(45.72f)), f10), AndroidUtilities.dp(47.44f * f10));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(e2.c.f((Float) callbackReturn.run(Float.valueOf(46.56f)), f10), AndroidUtilities.dp(48.28f * f10), e2.c.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(47.68f * f10), e2.c.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(46.5f * f10));
        path.cubicTo(e2.c.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(45.31f * f10), e2.c.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(28.38f * f10), e2.c.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(27.32f * f10));
        path.cubicTo(e2.c.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(26.26f * f10), e2.c.f((Float) callbackReturn.run(Float.valueOf(47.5f)), f10), AndroidUtilities.dp(25.24f * f10), e2.c.f((Float) callbackReturn.run(Float.valueOf(46.82f)), f10), AndroidUtilities.dp(f11));
        path.close();
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint = this.f29171a;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f6516g) {
            z12 = !z10;
        } else {
            z12 = z10;
        }
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(48.0f);
        int i9 = stargiftattributebackdrop.center_color | (-16777216);
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
        int b10 = org.telegram.ui.ActionBar.f6.b(f10, f11 - f12, i9);
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
        int[] iArr = {b10, org.telegram.ui.ActionBar.f6.b(f14, f15 - f16, i10)};
        if (z12) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (!z12) {
            f17 = 1.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, dp, dp2, iArr, new float[]{f13, f17}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.d;
        int alpha = paint.getAlpha();
        Path path = this.f6513c;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.f29171a);
        if (this.f6515f != null) {
            canvas.clipPath(path);
            this.f6515f.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.f6515f.d();
            this.f6515f.a(canvas, -1);
            invalidateSelf();
        }
        if (this.f6512b != null) {
            canvas.save();
            if (this.f6516g) {
                f10 = -45.0f;
            } else {
                f10 = 45.0f;
            }
            float width = getBounds().width() / 2.0f;
            float f15 = -7.0f;
            if (this.f6516g) {
                f11 = -7.0f;
            } else {
                f11 = 6.0f;
            }
            float dp = width + AndroidUtilities.dp(f11);
            float height = getBounds().height() / 2.0f;
            float f16 = 5.0f;
            if (this.f6516g) {
                f12 = 5.0f;
            } else {
                f12 = 6.0f;
            }
            canvas.rotate(f10, dp, height - AndroidUtilities.dp(f12));
            float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.f6512b.f31223c);
            float width2 = getBounds().width() / 2.0f;
            if (this.f6516g) {
                f13 = -7.0f;
            } else {
                f13 = 6.0f;
            }
            float dp2 = width2 + AndroidUtilities.dp(f13);
            float height2 = getBounds().height() / 2.0f;
            if (this.f6516g) {
                f14 = 5.0f;
            } else {
                f14 = 6.0f;
            }
            canvas.scale(min, min, dp2, height2 - AndroidUtilities.dp(f14));
            nz0 nz0Var = this.f6512b;
            float width3 = getBounds().width() / 2.0f;
            if (!this.f6516g) {
                f15 = 6.0f;
            }
            float dp3 = (width3 + AndroidUtilities.dp(f15)) - (this.f6512b.l() / 2.0f);
            float height3 = getBounds().height() / 2.0f;
            if (this.f6516g) {
                f16 = 4.0f;
            }
            canvas2 = canvas;
            nz0Var.c(dp3, height3 - AndroidUtilities.dp(f16), 1.0f, this.h, canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void e(int i9, CharSequence charSequence, boolean z10) {
        Typeface typeface;
        float f10 = i9;
        if (z10) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.f6512b = new nz0(charSequence, f10, typeface);
    }
}
