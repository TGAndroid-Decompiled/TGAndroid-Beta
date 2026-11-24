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
public final class ga5 extends View implements vlb {
    public f95 E;
    public f95 F;
    public int G;
    public float H;
    public final ha5 I;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final pc0 c;
    public final fl0 d;
    public final fl0 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final f95[] y;

    public ga5(ha5 ha5Var, Context context) {
        super(context);
        this.I = ha5Var;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new pc0((ylb) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new f95[3];
        this.G = -1;
        this.H = 1.0f;
        fl0 fl0Var = new fl0(9);
        this.d = fl0Var;
        fl0 fl0Var2 = new fl0(12);
        this.e = fl0Var2;
        fl0Var.a = gm.L(76.0f);
        fl0Var.b = gm.L(92.0f);
        fl0Var.b();
        fl0Var2.a = gm.L(80.0f);
        fl0Var2.b = gm.L(95.0f);
        fl0Var2.b();
        paint.setColor(on2.f(0.0f, cmb.w0(null, cmb.fh, false), cmb.w0(null, cmb.gh, false)));
        paint.setAlpha(102);
        paint2.setColor(on2.p(-16777216, 127));
    }

    public final void a(boolean z) {
        int i;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ob5 ob5Var = this.I.n0;
        if (!ob5Var.k && ((groupCallParticipant = ob5Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (ob5Var.e) {
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
        f95[] f95VarArr = this.y;
        if (f95VarArr[i] == null) {
            f95VarArr[i] = new f95(i);
            int i2 = this.G;
            if (i2 == 2) {
                f95VarArr[i2].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{cmb.w0(null, cmb.Yh, false), cmb.w0(null, cmb.ai, false), cmb.w0(null, cmb.Zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i2 == 1) {
                f95VarArr[i2].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{cmb.w0(null, cmb.vh, false), cmb.w0(null, cmb.xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                f95VarArr[i2].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{cmb.w0(null, cmb.zh, false), cmb.w0(null, cmb.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        f95 f95Var = f95VarArr[this.G];
        f95 f95Var2 = this.E;
        if (f95Var != f95Var2) {
            this.F = f95Var2;
            this.E = f95Var;
            if (f95Var2 != null && z) {
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
        f95 f95Var;
        float f;
        f95 f95Var2;
        super.onDraw(canvas);
        RectF rectF = gm.P;
        da5 da5Var = this.I.a;
        rectF.set(da5Var.getX() + da5Var.P, da5Var.getY() + da5Var.O, (da5Var.getX() + da5Var.getMeasuredWidth()) - da5Var.P, da5Var.getY() + da5Var.getMeasuredHeight() + da5Var.O);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, f3, width, height);
        imageReceiver.q0((int) da5Var.b);
        imageReceiver.h(canvas, null);
        float f4 = da5Var.b;
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
        f95 f95Var3 = this.E;
        if (f95Var3 != null) {
            f95Var3.b((int) (this.x - gm.L(100.0f)), (int) (this.w - gm.L(100.0f)), gm.L(200.0f), 16L, this.n);
        }
        float f11 = this.n;
        fl0 fl0Var = this.e;
        fl0Var.e(f11, 1.0f);
        float f12 = this.n;
        fl0 fl0Var2 = this.d;
        fl0Var2.e(f12, 1.0f);
        for (int i = 0; i < 2; i++) {
            Paint paint = this.f;
            if (i == 0 && (f95Var2 = this.F) != null) {
                paint.setShader(f95Var2.g);
                f = 1.0f - this.H;
            } else {
                if (i == 1 && (f95Var = this.E) != null) {
                    paint.setShader(f95Var.g);
                    f = this.H;
                }
            }
            paint.setAlpha((int) (f * 76.0f));
            fl0Var.a(this.w, this.x, canvas, paint);
            fl0Var2.a(this.w, this.x, canvas, paint);
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
        float L = gm.L(157.0f);
        this.w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (g95.u5) {
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
            this.f.setColor(on2.f(0.0f, cmb.w0(null, cmb.fh, false), cmb.w0(null, cmb.gh, false)));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
