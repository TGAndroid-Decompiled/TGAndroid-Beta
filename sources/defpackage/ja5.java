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
public final class ja5 extends View implements snb {
    public i95 E;
    public i95 F;
    public int G;
    public float H;
    public final ka5 I;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final rb0 c;
    public final gk0 d;
    public final gk0 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public final i95[] y;

    public ja5(ka5 ka5Var, Context context) {
        super(context);
        this.I = ka5Var;
        this.a = new ImageReceiver(null);
        this.b = new ImageReceiver(null);
        this.c = new rb0((vnb) null);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.y = new i95[3];
        this.G = -1;
        this.H = 1.0f;
        gk0 gk0Var = new gk0(9);
        this.d = gk0Var;
        gk0 gk0Var2 = new gk0(12);
        this.e = gk0Var2;
        gk0Var.a = hl.L(76.0f);
        gk0Var.b = hl.L(92.0f);
        gk0Var.b();
        gk0Var2.a = hl.L(80.0f);
        gk0Var2.b = hl.L(95.0f);
        gk0Var2.b();
        paint.setColor(vm2.f(0.0f, aob.w0(null, aob.gh, false), aob.w0(null, aob.hh, false)));
        paint.setAlpha(102);
        paint2.setColor(vm2.o(-16777216, 127));
    }

    public final void a(boolean z) {
        int i;
        TLRPC.GroupCallParticipant groupCallParticipant;
        rb5 rb5Var = this.I.n0;
        if (!rb5Var.k && ((groupCallParticipant = rb5Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (rb5Var.e) {
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
        i95[] i95VarArr = this.y;
        if (i95VarArr[i] == null) {
            i95VarArr[i] = new i95(i);
            int i2 = this.G;
            if (i2 == 2) {
                i95VarArr[i2].g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{aob.w0(null, aob.Zh, false), aob.w0(null, aob.bi, false), aob.w0(null, aob.ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i2 == 1) {
                i95VarArr[i2].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{aob.w0(null, aob.wh, false), aob.w0(null, aob.yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                i95VarArr[i2].g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{aob.w0(null, aob.Ah, false), aob.w0(null, aob.zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        i95 i95Var = i95VarArr[this.G];
        i95 i95Var2 = this.E;
        if (i95Var != i95Var2) {
            this.F = i95Var2;
            this.E = i95Var;
            if (i95Var2 != null && z) {
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
        i95 i95Var;
        float f;
        i95 i95Var2;
        super.onDraw(canvas);
        RectF rectF = hl.P;
        ga5 ga5Var = this.I.a;
        rectF.set(ga5Var.getX() + ga5Var.P, ga5Var.getY() + ga5Var.O, (ga5Var.getX() + ga5Var.getMeasuredWidth()) - ga5Var.P, ga5Var.getY() + ga5Var.getMeasuredHeight() + ga5Var.O);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, f3, width, height);
        imageReceiver.q0((int) ga5Var.b);
        imageReceiver.h(canvas, null);
        float f4 = ga5Var.b;
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
        i95 i95Var3 = this.E;
        if (i95Var3 != null) {
            i95Var3.b((int) (this.x - hl.L(100.0f)), (int) (this.w - hl.L(100.0f)), hl.L(200.0f), 16L, this.n);
        }
        float f11 = this.n;
        gk0 gk0Var = this.e;
        gk0Var.e(f11, 1.0f);
        float f12 = this.n;
        gk0 gk0Var2 = this.d;
        gk0Var2.e(f12, 1.0f);
        for (int i = 0; i < 2; i++) {
            Paint paint = this.f;
            if (i == 0 && (i95Var2 = this.F) != null) {
                paint.setShader(i95Var2.g);
                f = 1.0f - this.H;
            } else {
                if (i == 1 && (i95Var = this.E) != null) {
                    paint.setShader(i95Var.g);
                    f = this.H;
                }
            }
            paint.setAlpha((int) (f * 76.0f));
            gk0Var.a(this.w, this.x, canvas, paint);
            gk0Var2.a(this.w, this.x, canvas, paint);
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
        float L = hl.L(157.0f);
        this.w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (j95.u5) {
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
            this.f.setColor(vm2.f(0.0f, aob.w0(null, aob.gh, false), aob.w0(null, aob.hh, false)));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
