package defpackage;

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
import org.telegram.tgnet.tl.TL_stars;
public class qv4 extends yo2 {
    public tgb c;
    public tgb d;
    public final lm e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public vva w;
    public boolean x;
    public int y;

    public qv4(View view, float f) {
        super(view);
        this.e = new lm(new iu4(this, (byte) 3), 320L, s33.h, 0);
        Path path = new Path();
        this.f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.y = -1;
        this.s = f;
        d(path, f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.b).setColor(-698031);
        ((Paint) this.b).setPathEffect(new CornerPathEffect(gl.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f, final boolean z) {
        q8c q8cVar = new q8c() {
            @Override
            public final Object a(Object obj) {
                float floatValue;
                Float f2 = (Float) obj;
                if (z) {
                    floatValue = 48.0f - f2.floatValue();
                } else {
                    floatValue = f2.floatValue();
                }
                return Float.valueOf(floatValue);
            }
        };
        path.rewind();
        float f2 = f * 24.5f;
        path.moveTo(tb4.i((Float) q8cVar.a(Float.valueOf(46.83f)), f), gl.L(f2));
        path.lineTo(tb4.i((Float) q8cVar.a(Float.valueOf(23.5f)), f), gl.L(1.17f * f));
        path.cubicTo(tb4.i((Float) q8cVar.a(Float.valueOf(22.75f)), f), gl.L(0.42f * f), tb4.i((Float) q8cVar.a(Float.valueOf(21.73f)), f), 0.0f, tb4.i((Float) q8cVar.a(Float.valueOf(20.68f)), f), 0.0f);
        float f3 = f * 0.05f;
        path.cubicTo(tb4.i((Float) q8cVar.a(Float.valueOf(19.62f)), f), 0.0f, tb4.i((Float) q8cVar.a(Float.valueOf(2.73f)), f), gl.L(f3), tb4.i((Float) q8cVar.a(Float.valueOf(1.55f)), f), gl.L(f3));
        path.cubicTo(tb4.i((Float) q8cVar.a(Float.valueOf(0.36f)), f), gl.L(f3), tb4.i((Float) q8cVar.a(Float.valueOf(-0.23f)), f), gl.L(1.4885f * f), tb4.i((Float) q8cVar.a(Float.valueOf(0.6f)), f), gl.L(2.32f * f));
        path.lineTo(tb4.i((Float) q8cVar.a(Float.valueOf(45.72f)), f), gl.L(47.44f * f));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(tb4.i((Float) q8cVar.a(Float.valueOf(46.56f)), f), gl.L(48.28f * f), tb4.i((Float) q8cVar.a(valueOf), f), gl.L(47.68f * f), tb4.i((Float) q8cVar.a(valueOf), f), gl.L(46.5f * f));
        path.cubicTo(tb4.i((Float) q8cVar.a(valueOf), f), gl.L(45.31f * f), tb4.i((Float) q8cVar.a(valueOf), f), gl.L(28.38f * f), tb4.i((Float) q8cVar.a(valueOf), f), gl.L(27.32f * f));
        path.cubicTo(tb4.i((Float) q8cVar.a(valueOf), f), gl.L(26.26f * f), tb4.i((Float) q8cVar.a(Float.valueOf(47.5f)), f), gl.L(25.24f * f), tb4.i((Float) q8cVar.a(Float.valueOf(46.82f)), f), gl.L(f2));
        path.close();
    }

    public final void c(Canvas canvas, tgb tgbVar, float f) {
        float f2;
        float f3;
        canvas.save();
        canvas.translate(f, f);
        float width = getBounds().width() / 2.0f;
        float f4 = 6.0f;
        if (this.x) {
            f2 = -7.0f;
        } else {
            f2 = 6.0f;
        }
        float L = width + gl.L(f2);
        float height = getBounds().height() / 2.0f;
        if (this.x) {
            f4 = 5.0f;
        }
        float L2 = height - gl.L(f4);
        if (this.x) {
            f3 = -45.0f;
        } else {
            f3 = 45.0f;
        }
        canvas.rotate(f3, L, L2);
        float min = Math.min(1.0f, gl.L(40.0f) / tgbVar.c);
        canvas.scale(min, min, L, L2);
        tgbVar.c(L - (tgbVar.j() / 2.0f), L2 + gl.L(1.0f), 1.0f, this.y, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - gl.L(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(gl.L(1.33f) << 1);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        vva vvaVar = this.w;
        float f = this.s;
        if (vvaVar != null) {
            float f2 = f * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, gl.L(f2), gl.L(f2), null);
            this.w.f(0, 0, gl.L(48.0f), gl.L(48.0f));
            this.w.d();
            this.w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.c != null) {
            lm lmVar = this.e;
            float e = lmVar.e(false, 1.0f);
            if (!lmVar.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && lmVar.i) {
                canvas2.clipPath(path);
                float L = gl.L(f * 64.0f);
                c(canvas2, this.d, L * e);
                c(canvas2, this.c, (1.0f - e) * (-L));
            } else {
                c(canvas2, this.c, 0.0f);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        float f3;
        Paint paint = (Paint) this.b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.x) {
            z3 = !z;
        } else {
            z3 = z;
        }
        float L = gl.L(48.0f);
        float L2 = gl.L(48.0f);
        int i = stargiftattributebackdrop.center_color | (-16777216);
        float f4 = -0.1f;
        float f5 = 0.05f;
        if (z3) {
            f = -0.15f;
            f2 = 0.07f;
        } else {
            f = -0.1f;
            f2 = 0.05f;
        }
        float f6 = 0.125f;
        float f7 = 0.0f;
        if (z2) {
            f3 = 0.125f;
        } else {
            f3 = 0.0f;
        }
        int a = bkb.a(f2, f - f3, i);
        int i2 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z3) {
            f4 = -0.15f;
            f5 = 0.07f;
        }
        if (!z2) {
            f6 = 0.0f;
        }
        int[] iArr = {a, bkb.a(f5, f4 - f6, i2)};
        float f8 = 1.0f;
        if (!z3) {
            f7 = 1.0f;
            f8 = 0.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, L, L2, iArr, new float[]{f8, f7}, Shader.TileMode.CLAMP));
    }

    public final void f(int i) {
        Paint paint = (Paint) this.b;
        paint.setShader(null);
        paint.setColor(i);
    }

    public final void g(int i, String str, boolean z) {
        Typeface typeface = null;
        this.d = null;
        this.e.e(true, 1.0f);
        float f = i;
        if (z) {
            typeface = gl.o();
        }
        this.c = new tgb(str, f, typeface);
        invalidateSelf();
    }

    public final void h(int i, String str) {
        tgb tgbVar = this.c;
        if (tgbVar == null) {
            g(i, str, true);
        } else if (TextUtils.equals(tgbVar.i(), str)) {
        } else {
            this.d = this.c;
            this.c = new tgb(str, i, gl.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
