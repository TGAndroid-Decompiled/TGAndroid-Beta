package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.a;
public abstract class ww8 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public hg3 H;
    public rm0 I;
    public float J;
    public float K;
    public float L;
    public float M;
    public final CharSequence N;
    public StaticLayout O;
    public float P;
    public float Q;
    public float R;
    public final CharSequence S;
    public StaticLayout T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public final float Z;
    public int a;
    public final vw8 a0;
    public final vw8 b0;
    public int c0;
    public final ei7 d0;
    public boolean e0;
    public final TextPaint k;
    public final df1 l;
    public final Drawable m;
    public final Path n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public ValueAnimator s;
    public ValueAnimator t;
    public ValueAnimator u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public ValueAnimator z;
    public final int b = cmb.Q9;
    public final int c = cmb.R9;
    public final int d = cmb.M7;
    public final boolean e = true;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint();
    public final RectF j = new RectF();

    public ww8(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        df1 df1Var = new df1();
        df1Var.c = new Path();
        df1Var.d = new Paint(1);
        df1Var.f();
        this.l = df1Var;
        this.n = new Path();
        this.o = 1.0f;
        this.p = 1.0f;
        this.v = 1.0f;
        this.w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.a0 = new vw8(this, (byte) 3);
        this.b0 = new vw8(this, (byte) 4);
        this.d0 = new ei7(this, (byte) 10);
        this.e0 = false;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(16.0f));
        this.Z = ViewConfiguration.get(a.b).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.m = a.b.getResources().getDrawable(2131232150).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z) {
        if (this.G != z) {
            this.G = z;
            if (z) {
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new vw8(this, (byte) 0));
                this.t.setInterpolator(gm.G);
                this.t.setDuration(230L);
                this.t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.u = null;
            }
            this.w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.u = ofFloat2;
            ofFloat2.addUpdateListener(new vw8(this, (byte) 1));
            this.u.setInterpolator(gm.G);
            this.u.setDuration(230L);
            this.u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        hg3 hg3Var = this.H;
        if (hg3Var != null) {
            hg3Var.removeCallbacks(this.d0);
        }
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = false;
        this.r = false;
        this.y = false;
        this.e0 = false;
        this.x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z) {
        hg3 hg3Var;
        float f;
        float f2;
        int i;
        int i2;
        boolean z2;
        float f3;
        int i3;
        boolean z3;
        int i4;
        float f4;
        int i5;
        float f5;
        int i6;
        float f6;
        int i7;
        int i8;
        int w0;
        int i9;
        int i10;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (this.X && !this.Y && (hg3Var = this.H) != null && this.I != null) {
            boolean z4 = hg3Var instanceof pxb;
            if (z4) {
                f = 15.0f;
            } else {
                f = 28.0f;
            }
            int L = gm.L(f);
            int L2 = gm.L(8.0f);
            int L3 = gm.L(9.0f);
            int L4 = gm.L(18.0f);
            int d = (int) d();
            int height = (int) (this.H.getHeight() * this.J);
            boolean z5 = this.F;
            float f12 = this.D;
            if (z5) {
                f2 = (f12 * 0.07f) - 0.05f;
            } else {
                f2 = f12 * 0.02f;
            }
            int width = (this.H.getWidth() - (L << 2)) - gm.L(16.0f);
            if (width != this.c0) {
                int i11 = gm.q.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                i2 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.k;
                this.O = new StaticLayout(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, false);
                float f13 = 0.0f;
                for (int i12 = 0; i12 < this.O.getLineCount(); i12++) {
                    f13 = Math.max(f13, this.O.getLineWidth(i12));
                }
                float f14 = width;
                this.P = Math.min(1.0f, f14 / f13);
                int ceil = (int) Math.ceil(f13);
                if (this.P < 0.8f) {
                    this.P = 0.8f;
                    ceil = hg5.a(this.N, textPaint);
                }
                int i13 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i13;
                this.R = 0.0f;
                for (int i14 = 0; i14 < this.O.getLineCount(); i14++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i14));
                    this.R = Math.max(this.R, this.O.getLineWidth(i14));
                }
                this.T = new StaticLayout(this.S, textPaint, gm.q.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f15 = 0.0f;
                for (int i15 = 0; i15 < this.T.getLineCount(); i15++) {
                    f15 = Math.max(f15, this.T.getLineWidth(i15));
                }
                this.U = Math.min(1.0f, f14 / f15);
                i = L4;
                int ceil2 = (int) Math.ceil(f15);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = hg5.a(this.S, textPaint);
                }
                int i16 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i16, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i16;
                this.W = 0.0f;
                for (int i17 = 0; i17 < this.T.getLineCount(); i17++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i17));
                    this.W = Math.max(this.W, this.T.getLineWidth(i17));
                }
                this.c0 = width;
            } else {
                i = L4;
                i2 = 0;
            }
            if (this.J > 0.85f) {
                z2 = 1;
            } else {
                z2 = i2;
            }
            if (this.q != z2) {
                this.q = z2;
                int i18 = (this.x > 0.0f ? 1 : (this.x == 0.0f ? 0 : -1));
                ValueAnimator valueAnimator = this.s;
                if (i18 == 0) {
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z2 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    this.o = f11;
                } else {
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f16 = this.o;
                    if (z2 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[i2] = f16;
                    fArr[1] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.s = ofFloat;
                    ofFloat.addUpdateListener(this.a0);
                    this.s.setInterpolator(new LinearInterpolator());
                    this.s.setDuration(170L);
                    this.s.start();
                }
            }
            if (z2 != this.r) {
                this.r = z2;
                ValueAnimator valueAnimator2 = this.A;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f17 = this.p;
                if (this.r) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[i2] = f17;
                fArr2[1] = f9;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new vw8(this, (byte) 2));
                this.A.setInterpolator(d53.j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f18 = this.C * 2.0f;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            float f19 = this.L;
            float f20 = this.K;
            if (z) {
                f20 += d;
            }
            int i19 = L + L3;
            int measuredHeight = (this.H.getMeasuredHeight() - L2) - L3;
            if (z) {
                measuredHeight += d;
            }
            int i20 = i + (L2 << 1);
            float f21 = f18;
            if (height > i20) {
                f3 = 1.0f;
            } else {
                f3 = height / i20;
            }
            canvas.save();
            float f22 = f3;
            if (z) {
                i3 = d;
                z3 = z4;
                int i21 = i2;
                canvas.clipRect(i21, i21, this.I.getMeasuredWidth(), i3 + 1);
            } else {
                i3 = d;
                z3 = z4;
            }
            int i22 = (this.C > 0.0f ? 1 : (this.C == 0.0f ? 0 : -1));
            RectF rectF = this.j;
            Paint paint = this.i;
            if (i22 == 0) {
                if (this.v != 1.0f && this.w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f5 = f20;
                i4 = i;
                i5 = L3;
                f4 = f2;
            } else {
                float f23 = this.M;
                i4 = i;
                f4 = f2;
                i5 = L3;
                float A = td4.A(1.0f, this.C, this.H.getWidth() - this.M, (f23 * f2) + f23);
                if (this.v != 1.0f && this.w != 1.0f) {
                    canvas.drawCircle(f19, f20, A, paint);
                }
                Path path = this.n;
                path.reset();
                f5 = f20;
                rectF.set(f19 - A, f20 - A, f19 + A, f5 + A);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z6 = this.G;
            Paint paint2 = this.h;
            if (z6) {
                if (this.w > this.v) {
                    canvas.save();
                    float f24 = i19;
                    float f25 = this.C;
                    float f26 = measuredHeight;
                    canvas.translate((f19 - f24) * f25, f25 * (f5 - f26));
                    canvas.drawCircle(f24, f26, this.H.getWidth() * this.w, paint);
                    canvas.restore();
                }
                if (this.v > 0.0f) {
                    canvas.save();
                    float f27 = i19;
                    float f28 = this.C;
                    float f29 = measuredHeight;
                    canvas.translate((f19 - f27) * f28, (f5 - f29) * f28);
                    canvas.drawCircle(f27, f29, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
            } else {
                if (this.v > this.w) {
                    canvas.save();
                    float f30 = i19;
                    float f31 = this.C;
                    float f32 = measuredHeight;
                    canvas.translate((f19 - f30) * f31, f31 * (f5 - f32));
                    canvas.drawCircle(f30, f32, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.w > 0.0f) {
                    canvas.save();
                    float f33 = i19;
                    float f34 = this.C;
                    float f35 = measuredHeight;
                    canvas.translate((f19 - f33) * f34, f34 * (f5 - f35));
                    canvas.drawCircle(f33, f35, this.H.getWidth() * this.w, paint);
                    canvas.restore();
                }
            }
            if (height > i20) {
                Paint paint3 = this.f;
                paint3.setAlpha((int) ((1.0f - f21) * 0.4f * f22 * 255.0f));
                float f36 = L;
                if (z) {
                    rectF.set(f36, L2, L + i4, L2 + i3 + i5);
                } else {
                    rectF.set(f36, ((this.H.getHeight() - height) + L2) - i3, L + i4, this.H.getHeight() - L2);
                }
                i6 = i5;
                float f37 = i6;
                canvas.drawRoundRect(rectF, f37, f37, paint3);
            } else {
                i6 = i5;
            }
            if (z) {
                canvas.restore();
                return;
            }
            if (z3) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - gm.L(41.0f)) * this.C));
            }
            float f38 = this.C;
            if (f38 != 0.0f && !z3) {
                i7 = L;
                f6 = 255.0f;
                i8 = 0;
            } else {
                Paint paint4 = this.g;
                paint4.setAlpha((int) ((1.0f - f38) * f22 * 255.0f));
                float f39 = i19;
                float f40 = measuredHeight;
                canvas.drawCircle(f39, f40, i6, paint4);
                df1 df1Var = this.l;
                df1Var.getClass();
                int L5 = gm.L(18.0f);
                int L6 = gm.L(18.0f) >> 1;
                f6 = 255.0f;
                int i23 = L5 >> 1;
                i7 = L;
                df1Var.setBounds(i19 - L6, measuredHeight - i23, i19 + L6, measuredHeight + i23);
                float f41 = 1.0f - this.p;
                if (f41 < 0.0f) {
                    f41 = 0.0f;
                }
                float f42 = 1.0f - f41;
                canvas.save();
                canvas.rotate(180.0f * f42, f39, f40);
                canvas.translate(0.0f, (gm.N(1.0f) * 1.0f) - f42);
                if (this.G) {
                    w0 = paint2.getColor();
                    i8 = 0;
                } else {
                    i8 = 0;
                    w0 = cmb.w0(null, this.b, false);
                }
                ((Paint) df1Var.d).setColor(w0);
                df1Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.y) {
                if (Math.abs(this.a) < this.Z * 0.5f) {
                    if (!this.e0) {
                        this.x = 1.0f;
                        this.y = true;
                    }
                } else {
                    this.e0 = true;
                    hg3 hg3Var2 = this.H;
                    ei7 ei7Var = this.d0;
                    hg3Var2.removeCallbacks(ei7Var);
                    this.H.postDelayed(ei7Var, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i20 / 2.0f)) + gm.L(6.0f);
            int width2 = this.H.getWidth();
            if (z3) {
                i9 = i7 << 1;
            } else {
                i9 = i8;
            }
            float f43 = (width2 + i9) / 2.0f;
            if (this.O != null) {
                float f44 = this.o;
                if (f44 > 0.0f && f44 < 1.0f) {
                    canvas.save();
                    float f45 = (this.o * 0.2f) + 0.8f;
                    canvas.scale(f45, f45, f43, td4.A(1.0f, this.o, gm.L(16.0f), height2));
                }
                i10 = i19;
                f7 = f22;
                f8 = f5;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.o * f6 * f22 * this.x), 31);
                canvas.translate((f43 - this.Q) - (this.R / 2.0f), td4.A(1.0f, this.o, gm.L(8.0f), height2) - this.O.getHeight());
                float f46 = this.P;
                canvas.scale(f46, f46, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f47 = this.o;
                if (f47 > 0.0f && f47 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i10 = i19;
                f7 = f22;
                f8 = f5;
            }
            if (this.T != null) {
                float f48 = this.o;
                if (f48 > 0.0f && f48 < 1.0f) {
                    canvas.save();
                    float A2 = td4.A(1.0f, this.o, 0.1f, 0.9f);
                    canvas.scale(A2, A2, f43, height2 - (gm.L(8.0f) * this.o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (td4.z(1.0f, this.o, f6, f7) * this.x), 31);
                canvas.translate((f43 - this.V) - (this.W / 2.0f), ((gm.L(8.0f) * this.o) + height2) - this.T.getHeight());
                float f49 = this.U;
                canvas.scale(f49, f49, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f50 = this.o;
                if (f50 > 0.0f && f50 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z3 && this.e && this.C > 0.0f) {
                canvas.save();
                float f51 = cmb.t1.b;
                float L7 = gm.L(24.0f) / f51;
                float f52 = this.C;
                float i24 = ts2.i(1.0f - L7, f52, L7, f4);
                float f53 = 1.0f - f52;
                canvas.translate((i10 - f19) * f53, (((this.H.getHeight() - L2) - i6) - f8) * f53);
                canvas.scale(i24, i24, f19, f8);
                cmb.t1.O(true, 0.0f);
                if (!cmb.B1) {
                    p09 p09Var = cmb.t1;
                    p09Var.a0 = true;
                    int i25 = this.d;
                    p09Var.L(cmb.w0(null, i25, true), "Arrow1");
                    cmb.t1.L(cmb.w0(null, i25, true), "Arrow2");
                    cmb.t1.j();
                    cmb.B1 = true;
                }
                float f54 = f51 / 2.0f;
                cmb.t1.setBounds((int) (f19 - f54), (int) (f8 - f54), (int) (f19 + f54), (int) (f54 + f8));
                cmb.t1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f) {
        this.C = f;
        int f2 = on2.f(1.0f - this.C, cmb.w0(null, this.d, true), cmb.w0(null, this.c, true));
        this.h.setColor(f2);
        if (this.e && this.X && !this.Y) {
            p09 p09Var = cmb.t1;
            p09Var.a0 = true;
            p09Var.L(f2, "Arrow1");
            cmb.t1.L(f2, "Arrow2");
            cmb.t1.j();
            cmb.B1 = true;
        }
    }

    public final void f(float f) {
        if (this.J != f) {
            this.J = f;
            hg3 hg3Var = this.H;
            if (hg3Var != null) {
                hg3Var.invalidate();
            }
        }
    }

    public final void g() {
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.B.cancel();
        }
        e(0.0f);
        this.Y = false;
        this.E = false;
    }

    public final void h() {
        int w0 = cmb.w0(null, this.b, false);
        this.k.setColor(-1);
        this.g.setColor(-1);
        this.f.setColor(on2.p(-1, 100));
        this.i.setColor(w0);
        ((Paint) this.l.d).setColor(w0);
        this.h.setColor(cmb.w0(null, this.d, false));
    }
}
