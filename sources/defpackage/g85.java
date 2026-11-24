package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g85 extends View implements tjb {
    public g75 E;
    public g75 F;
    public int G;
    public float H;
    public final h85 I;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final pb0 c;
    public final fk0 d;
    public final fk0 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final g75[] y;

    public g85(h85 h85Var, Context context) {
        super(context);
        this.I = h85Var;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new pb0((wjb) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new g75[3];
        this.G = -1;
        this.H = 1.0f;
        fk0 fk0Var = new fk0(9);
        this.d = fk0Var;
        fk0 fk0Var2 = new fk0(12);
        this.e = fk0Var2;
        fk0Var.a = gl.L(76.0f);
        fk0Var.b = gl.L(92.0f);
        fk0Var.b();
        fk0Var2.a = gl.L(80.0f);
        fk0Var2.b = gl.L(95.0f);
        fk0Var2.b();
        paint.setColor(bm2.f(0.0f, bkb.w0(null, bkb.fh, false), bkb.w0(null, bkb.gh, false)));
        paint.setAlpha(102);
        paint2.setColor(bm2.o(-16777216, 127));
    }

    public final void a(boolean z) {
        int i;
        TLRPC.GroupCallParticipant groupCallParticipant;
        q95 q95Var = this.I.n0;
        if (!q95Var.k && ((groupCallParticipant = q95Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (q95Var.e) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 2;
        }
        if (i == this.G) {
            return;
        }
        this.G = i;
        g75[] g75VarArr = this.y;
        if (g75VarArr[i] == null) {
            g75VarArr[i] = new g75(i);
            int i2 = this.G;
            if (i2 == 2) {
                g75VarArr[i2].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{bkb.w0(null, bkb.Yh, false), bkb.w0(null, bkb.ai, false), bkb.w0(null, bkb.Zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i2 == 1) {
                g75VarArr[i2].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{bkb.w0(null, bkb.vh, false), bkb.w0(null, bkb.xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                g75VarArr[i2].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{bkb.w0(null, bkb.zh, false), bkb.w0(null, bkb.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        g75 g75Var = g75VarArr[this.G];
        g75 g75Var2 = this.E;
        if (g75Var != g75Var2) {
            this.F = g75Var2;
            this.E = g75Var;
            if (g75Var2 != null && z) {
                this.H = 0.0f;
            } else {
                this.H = 1.0f;
                this.F = null;
            }
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g75 g75Var;
        float f;
        g75 g75Var2;
        super.onDraw(canvas);
        RectF rectF = gl.P;
        d85 d85Var = this.I.a;
        rectF.set(d85Var.getX() + d85Var.P, d85Var.getY() + d85Var.O, (d85Var.getX() + d85Var.getMeasuredWidth()) - d85Var.P, d85Var.getY() + d85Var.getMeasuredHeight() + d85Var.O);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, f3, width, height);
        imageReceiver.q0((int) d85Var.b);
        imageReceiver.h(canvas, null);
        float f4 = d85Var.b;
        canvas.drawRoundRect(rectF, f4, f4, this.h);
        float f5 = this.r;
        float f6 = this.n;
        if (f5 != f6) {
            float f7 = this.s;
            float f8 = (16.0f * f7) + f6;
            this.n = f8;
            if (f7 > 0.0f) {
                if (f8 > f5) {
                    this.n = f5;
                }
                f5 = f8;
            } else {
                if (f8 < f5) {
                    this.n = f5;
                }
                f5 = f8;
            }
        } else {
            f5 = f6;
        }
        float f9 = this.H;
        if (f9 != 1.0f) {
            if (this.F != null) {
                f9 += 0.07272727f;
                this.H = f9;
            }
            if (f9 >= 1.0f) {
                this.H = 1.0f;
                this.F = null;
            }
        }
        float f10 = (f5 * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f10, f10, this.w, this.x);
        g75 g75Var3 = this.E;
        if (g75Var3 != null) {
            g75Var3.b((int) (this.x - gl.L(100.0f)), (int) (this.w - gl.L(100.0f)), gl.L(200.0f), 16L, this.n);
        }
        float f11 = this.n;
        fk0 fk0Var = this.e;
        fk0Var.e(f11, 1.0f);
        float f12 = this.n;
        fk0 fk0Var2 = this.d;
        fk0Var2.e(f12, 1.0f);
        for (int i = 0; i < 2; i++) {
            Paint paint = this.f;
            if (i == 0 && (g75Var2 = this.F) != null) {
                paint.setShader(g75Var2.g);
                f = 1.0f - this.H;
            } else {
                if (i == 1 && (g75Var = this.E) != null) {
                    paint.setShader(g75Var.g);
                    f = this.H;
                }
            }
            paint.setAlpha((int) (f * 76.0f));
            fk0Var.a(this.w, this.x, canvas, paint);
            fk0Var2.a(this.w, this.x, canvas, paint);
        }
        canvas.restore();
        float f13 = (this.n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f13, f13, this.w, this.x);
        this.a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        float L = gl.L(157.0f);
        this.w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (h75.u5) {
            f = 0.0f;
        } else {
            f = (-getMeasuredHeight()) * 0.12f;
        }
        this.x = measuredHeight + f;
        float f2 = L / 2.0f;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.q0((int) f2);
        imageReceiver.i0(this.w - f2, this.x - f2, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f.setColor(bm2.f(0.0f, bkb.w0(null, bkb.fh, false), bkb.w0(null, bkb.gh, false)));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
