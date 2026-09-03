package lh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.rq;
public final class a2 extends rq {
    public k01 f12586b;
    public final Path f12587c;
    public final Paint d;
    public final float f12588e;
    public wa f12589f;
    public boolean f12590g;
    public int h;

    public a2(View view) {
        super(view);
        Path path = new Path();
        this.f12587c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = -1;
        this.f12588e = 1.0f;
        c(path, 1.0f, false);
        this.f30869a.setColor(-698031);
        this.f30869a.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void c(Path path, float f10, final boolean z4) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                float floatValue;
                Float f11 = (Float) obj;
                if (z4) {
                    floatValue = 48.0f - f11.floatValue();
                } else {
                    floatValue = f11.floatValue();
                }
                return Float.valueOf(floatValue);
            }
        };
        path.rewind();
        float f11 = f10 * 24.5f;
        path.moveTo(l.d.f((Float) callbackReturn.run(Float.valueOf(46.83f)), f10), AndroidUtilities.dp(f11));
        path.lineTo(l.d.f((Float) callbackReturn.run(Float.valueOf(23.5f)), f10), AndroidUtilities.dp(1.17f * f10));
        path.cubicTo(l.d.f((Float) callbackReturn.run(Float.valueOf(22.75f)), f10), AndroidUtilities.dp(0.42f * f10), l.d.f((Float) callbackReturn.run(Float.valueOf(21.73f)), f10), 0.0f, l.d.f((Float) callbackReturn.run(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(l.d.f((Float) callbackReturn.run(Float.valueOf(19.62f)), f10), 0.0f, l.d.f((Float) callbackReturn.run(Float.valueOf(2.73f)), f10), AndroidUtilities.dp(f12), l.d.f((Float) callbackReturn.run(Float.valueOf(1.55f)), f10), AndroidUtilities.dp(f12));
        path.cubicTo(l.d.f((Float) callbackReturn.run(Float.valueOf(0.36f)), f10), AndroidUtilities.dp(f12), l.d.f((Float) callbackReturn.run(Float.valueOf(-0.23f)), f10), AndroidUtilities.dp(1.4885f * f10), l.d.f((Float) callbackReturn.run(Float.valueOf(0.6f)), f10), AndroidUtilities.dp(2.32f * f10));
        path.lineTo(l.d.f((Float) callbackReturn.run(Float.valueOf(45.72f)), f10), AndroidUtilities.dp(47.44f * f10));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(l.d.f((Float) callbackReturn.run(Float.valueOf(46.56f)), f10), AndroidUtilities.dp(48.28f * f10), l.d.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(47.68f * f10), l.d.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(46.5f * f10));
        path.cubicTo(l.d.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(45.31f * f10), l.d.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(28.38f * f10), l.d.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(27.32f * f10));
        path.cubicTo(l.d.f((Float) callbackReturn.run(valueOf), f10), AndroidUtilities.dp(26.26f * f10), l.d.f((Float) callbackReturn.run(Float.valueOf(47.5f)), f10), AndroidUtilities.dp(25.24f * f10), l.d.f((Float) callbackReturn.run(Float.valueOf(46.82f)), f10), AndroidUtilities.dp(f11));
        path.close();
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z4, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint = this.f30869a;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f12590g) {
            z11 = !z4;
        } else {
            z11 = z4;
        }
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(48.0f);
        int i10 = stargiftattributebackdrop.center_color | (-16777216);
        float f14 = 0.05f;
        if (z11) {
            f10 = 0.07f;
        } else {
            f10 = 0.05f;
        }
        float f15 = -0.1f;
        if (z11) {
            f11 = -0.15f;
        } else {
            f11 = -0.1f;
        }
        float f16 = 0.125f;
        float f17 = 0.0f;
        if (z10) {
            f12 = 0.125f;
        } else {
            f12 = 0.0f;
        }
        int b10 = k6.b(f10, f11 - f12, i10);
        int i11 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z11) {
            f14 = 0.07f;
        }
        if (z11) {
            f15 = -0.15f;
        }
        if (!z10) {
            f16 = 0.0f;
        }
        int[] iArr = {b10, k6.b(f14, f15 - f16, i11)};
        if (z11) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (!z11) {
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
        Path path = this.f12587c;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.f30869a);
        if (this.f12589f != null) {
            canvas.clipPath(path);
            this.f12589f.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.f12589f.d();
            this.f12589f.a(canvas, -1);
            invalidateSelf();
        }
        if (this.f12586b != null) {
            canvas.save();
            if (this.f12590g) {
                f10 = -45.0f;
            } else {
                f10 = 45.0f;
            }
            float width = getBounds().width() / 2.0f;
            float f15 = -7.0f;
            if (this.f12590g) {
                f11 = -7.0f;
            } else {
                f11 = 6.0f;
            }
            float dp = width + AndroidUtilities.dp(f11);
            float height = getBounds().height() / 2.0f;
            float f16 = 5.0f;
            if (this.f12590g) {
                f12 = 5.0f;
            } else {
                f12 = 6.0f;
            }
            canvas.rotate(f10, dp, height - AndroidUtilities.dp(f12));
            float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.f12586b.f28227c);
            float width2 = getBounds().width() / 2.0f;
            if (this.f12590g) {
                f13 = -7.0f;
            } else {
                f13 = 6.0f;
            }
            float dp2 = width2 + AndroidUtilities.dp(f13);
            float height2 = getBounds().height() / 2.0f;
            if (this.f12590g) {
                f14 = 5.0f;
            } else {
                f14 = 6.0f;
            }
            canvas.scale(min, min, dp2, height2 - AndroidUtilities.dp(f14));
            k01 k01Var = this.f12586b;
            float width3 = getBounds().width() / 2.0f;
            if (!this.f12590g) {
                f15 = 6.0f;
            }
            float dp3 = (width3 + AndroidUtilities.dp(f15)) - (this.f12586b.l() / 2.0f);
            float height3 = getBounds().height() / 2.0f;
            if (this.f12590g) {
                f16 = 4.0f;
            }
            canvas2 = canvas;
            k01Var.c(dp3, height3 - AndroidUtilities.dp(f16), 1.0f, this.h, canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void e(int i10, CharSequence charSequence, boolean z4) {
        Typeface typeface;
        float f10 = i10;
        if (z4) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.f12586b = new k01(charSequence, f10, typeface);
    }
}
