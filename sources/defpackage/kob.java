package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
public final class kob extends View {
    public final Paint A0;
    public int A1;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public final Path E;
    public final Paint E0;
    public boolean F;
    public final TextPaint F0;
    public String G;
    public final RectF G0;
    public boolean H;
    public final Path H0;
    public long I;
    public final Paint I0;
    public long J;
    public final job J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public iob N;
    public StaticLayout N0;
    public boolean O;
    public float O0;
    public String P;
    public float P0;
    public boolean Q;
    public final TextPaint Q0;
    public long R;
    public StaticLayout R0;
    public long S;
    public float S0;
    public float T;
    public float T0;
    public float U;
    public final LinearGradient U0;
    public boolean V;
    public final Matrix V0;
    public float W;
    public final Paint W0;
    public final kr9 X0;
    public boolean Y0;
    public final tsa Z0;
    public eob a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public dob b0;
    public long b1;
    public int c;
    public int c0;
    public final lm c1;
    public Runnable d;
    public final lm d0;
    public long d1;
    public long e;
    public final lm e0;
    public sma e1;
    public long f;
    public final lm f0;
    public long f1;
    public final lm g0;
    public long g1;
    public fob h;
    public final lm h0;
    public float h1;
    public final lm i0;
    public int i1;
    public final lm j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final sl0 l0;
    public int l1;
    public final wl0 m0;
    public boolean m1;
    public int n;
    public final wl0 n0;
    public boolean n1;
    public final wl0 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final tgb r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final job t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public fob w;
    public final Path w0;
    public int w1;
    public final Paint x;
    public final Path x0;
    public int x1;
    public final Path y;
    public final RectF y0;
    public int y1;
    public final Path z0;
    public int z1;

    public kob(Context context, ViewGroup viewGroup, g7b g7bVar, wjb wjbVar, sl0 sl0Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        s33 s33Var = s33.h;
        this.d0 = new lm(this, 0L, 360L, s33Var);
        this.e0 = new lm(360L, this, s33Var);
        this.f0 = new lm(this, 0L, 360L, s33Var);
        this.g0 = new lm(360L, this, s33Var);
        this.h0 = new lm(this, 0L, 360L, s33Var);
        this.i0 = new lm(this, 0L, 360L, s33Var);
        this.j0 = new lm(this, 0L, 320L, s33Var);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new job();
        this.u0 = new RectF();
        this.v0 = new Paint(3);
        this.w0 = new Path();
        this.x0 = new Path();
        this.y0 = new RectF();
        this.z0 = new Path();
        Paint paint = new Paint(1);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        this.C0 = paint3;
        Paint paint4 = new Paint(1);
        this.D0 = paint4;
        Paint paint5 = new Paint(1);
        this.E0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Path();
        Paint paint6 = new Paint(1);
        this.I0 = paint6;
        this.J0 = new job();
        Paint paint7 = new Paint(1);
        this.K0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.Q0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U0 = linearGradient;
        this.V0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.W0 = paint8;
        this.X0 = new kr9(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new lm(0.0f, this, 0L, 340L, s33Var);
        this.d1 = -1L;
        this.i1 = -1;
        this.j1 = -1;
        this.k1 = -1;
        this.l1 = -1;
        this.o1 = 1.0f;
        this.r1 = true;
        this.s1 = false;
        this.u1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(gl.L(12.0f));
        textPaint2.setTypeface(gl.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(gl.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(1.0f), 436207616);
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(gl.L(2.0f), 0.0f, gl.L(2.0f), 1073741824);
        textPaint.setTypeface(gl.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new tgb(k96.M0(2131744216, null), 12.0f, gl.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232785).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231191).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = sl0Var;
        this.m0 = new wl0(sl0Var, this, 0, false);
        this.n0 = new wl0(sl0Var, this, 3, false);
        this.o0 = new wl0(sl0Var, this, 4, false);
        this.Z0 = new tsa(this, viewGroup, wjbVar, sl0Var, g7bVar, (byte) 5);
    }

    private float getAudioHeight() {
        return gl.U1(this.g0.d(this.Q), gl.L(28.0f), gl.L(38.0f));
    }

    public long getBaseDuration() {
        fob fobVar = this.h;
        if (fobVar != null) {
            return Math.max(1L, fobVar.e);
        }
        fob fobVar2 = this.w;
        if (fobVar2 != null) {
            return Math.max(1L, fobVar2.e);
        }
        if (this.F) {
            return Math.max(1L, this.I);
        }
        return Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            if (f > 0.0f) {
                f += gl.L(4.0f);
            }
            f += gl.U1(((fob) arrayList.get(i)).k.c, gl.L(28.0f), gl.L(38.0f));
        }
        return f;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return gl.U1(this.e0.d(this.H), gl.L(28.0f), gl.L(38.0f));
    }

    private float getVideoHeight() {
        fob fobVar = this.h;
        if (fobVar == null) {
            return 0.0f;
        }
        return gl.U1(fobVar.k.c, gl.L(28.0f), gl.L(38.0f));
    }

    public final int b(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kob.b(android.view.MotionEvent):int");
    }

    public final void c(float f, float f2, float f3, long j, Canvas canvas) {
        long j2;
        float f4;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = (float) Utilities.k(j, getBaseDuration(), 0L);
        fob fobVar = this.w;
        if (fobVar != null) {
            f4 = (fobVar.g * ((float) fobVar.e)) + ((float) fobVar.f);
        } else {
            if (this.h == null) {
                j2 = this.R;
            } else {
                j2 = 0;
            }
            f4 = (float) j2;
        }
        float f5 = (this.v1 * (((k + f4) - ((float) this.f)) / ((float) min))) + this.z1 + this.y1;
        float f6 = (1.0f - f3) * (((f2 - f) / 2.0f) / 2.0f);
        float f7 = f + f6;
        float f8 = f2 - f6;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f3));
        Paint paint2 = this.E0;
        paint2.setAlpha((int) (f3 * 255.0f));
        RectF rectF = gl.P;
        rectF.set(f5 - gl.N(1.5f), f7, gl.N(1.5f) + f5, f8);
        rectF.inset(-gl.N(0.66f), -gl.N(0.66f));
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
        rectF.set(f5 - gl.N(1.5f), f7, gl.N(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint2);
    }

    @Override
    public final void computeScroll() {
        kr9 kr9Var = this.X0;
        if (kr9Var.b()) {
            int i = kr9Var.j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.r1) {
                this.f = Math.max(0.0f, (((i - this.z1) - this.y1) / this.v1) * ((float) min));
            } else if (!this.Q) {
                kr9Var.a();
                return;
            } else {
                int i2 = this.z1;
                int i3 = this.y1;
                float f = this.v1;
                float f2 = (float) min;
                h(((((i - i2) - i3) / f) * f2) - ((((this.t1 - i2) - i3) / f) * f2));
            }
            invalidate();
            this.t1 = i;
        } else if (this.s1) {
            this.s1 = false;
            eob eobVar = this.a;
            if (eobVar != null) {
                eobVar.m0(false);
            }
        }
    }

    public final void d(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        float f6;
        Paint paint2;
        float f7;
        float f8;
        float f9;
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = gl.P;
        float f10 = 10.0f;
        rectF.set(f3 - gl.L(10.0f), f, gl.L(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, 255, 31);
        int i = (int) (255.0f * f5);
        Paint paint3 = this.A0;
        paint3.setAlpha(i);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint3);
        if (this.Y0) {
            f6 = 2.5f;
        } else {
            f6 = 10.0f;
        }
        rectF.inset(gl.L(f6), gl.L(2.0f));
        boolean z = this.Y0;
        Paint paint4 = this.B0;
        if (z) {
            canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float L = gl.L(2.0f);
        float L2 = gl.L(10.0f);
        Paint paint5 = this.C0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i);
        if (this.Y0) {
            f7 = 2.0f;
        } else {
            f7 = 10.0f;
        }
        float x = tb4.x(gl.L(f7), L, 2.0f, f3);
        float f11 = f + f2;
        float f12 = (f11 - L2) / 2.0f;
        if (this.Y0) {
            f8 = 2.0f;
        } else {
            f8 = 10.0f;
        }
        float f13 = (f11 + L2) / 2.0f;
        rectF.set(x, f12, f3 - ((gl.L(f8) + L) / 2.0f), f13);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint2);
            if (paint != null && !this.Y0) {
                paint5.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint5);
            }
        }
        if (this.Y0) {
            f9 = 2.5f;
        } else {
            f9 = 10.0f;
        }
        float z2 = oo1.z(gl.L(f9), L, 2.0f, f4);
        if (this.Y0) {
            f10 = 2.5f;
        }
        rectF.set(z2, f12, tb4.e(gl.L(f10), L, 2.0f, f4), f13);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kob.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(ViewGroup viewGroup, wjb wjbVar, sl0 sl0Var, g7b g7bVar) {
        int i;
        int i2 = this.k1;
        try {
            if (i2 == 2 && this.O) {
                lja ljaVar = new lja(getContext(), 0);
                ljaVar.b = 0.0f;
                ljaVar.c = 1.5f;
                ljaVar.c(this.W);
                ljaVar.h = new p8c(this) {
                    public final kob b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        kob kobVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                kobVar.getClass();
                                kobVar.W = f.floatValue();
                                eob eobVar = kobVar.a;
                                if (eobVar != null) {
                                    eobVar.w(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                kobVar.getClass();
                                kobVar.M = f.floatValue();
                                eob eobVar2 = kobVar.a;
                                if (eobVar2 != null) {
                                    eobVar2.u(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                kobVar.h.i = f.floatValue();
                                eob eobVar3 = kobVar.a;
                                if (eobVar3 != null) {
                                    eobVar3.x0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i3 = this.w1;
                int i4 = this.z1;
                int i5 = this.y1;
                float min2 = Math.min((i3 - i4) - i5, ((((gl.R1(this.U, 1.0f, this.g0.c) * ((float) this.S)) + ((float) (this.R - this.f))) / ((float) min)) * this.v1) + i4 + i5);
                cs5 G = cs5.G(viewGroup, wjbVar, this);
                G.p(ljaVar);
                G.n(true);
                G.b(2131232113, k96.M0(2131744483, null), new bob(this, (byte) 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(this.w1 - min2)) + gl.L(18.0f), this.G0.top);
                G.a0();
                G.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 1 && this.F) {
                lja ljaVar2 = new lja(getContext(), 0);
                ljaVar2.b = 0.0f;
                ljaVar2.c = 1.5f;
                ljaVar2.c(this.M);
                ljaVar2.h = new p8c(this) {
                    public final kob b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        kob kobVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                kobVar.getClass();
                                kobVar.W = f.floatValue();
                                eob eobVar = kobVar.a;
                                if (eobVar != null) {
                                    eobVar.w(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                kobVar.getClass();
                                kobVar.M = f.floatValue();
                                eob eobVar2 = kobVar.a;
                                if (eobVar2 != null) {
                                    eobVar2.u(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                kobVar.h.i = f.floatValue();
                                eob eobVar3 = kobVar.a;
                                if (eobVar3 != null) {
                                    eobVar3.x0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i6 = this.w1;
                int i7 = this.z1;
                int i8 = this.y1;
                float min4 = Math.min((i6 - i7) - i8, ((((gl.R1(this.L, 1.0f, this.e0.c) * ((float) this.I)) + ((float) (this.J - this.f))) / ((float) min3)) * this.v1) + i7 + i8);
                cs5 G2 = cs5.G(viewGroup, wjbVar, this);
                G2.p(ljaVar2);
                G2.n(true);
                G2.b(2131232113, k96.M0(2131744247, null), new bob(this, (byte) 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(this.w1 - min4)) + gl.L(18.0f), this.y0.top);
                G2.a0();
                G2.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 0 && this.h != null) {
                lja ljaVar3 = new lja(getContext(), 0);
                ljaVar3.b = 0.0f;
                ljaVar3.c = 1.5f;
                ljaVar3.c(this.h.i);
                ljaVar3.h = new p8c(this) {
                    public final kob b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        kob kobVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                kobVar.getClass();
                                kobVar.W = f.floatValue();
                                eob eobVar = kobVar.a;
                                if (eobVar != null) {
                                    eobVar.w(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                kobVar.getClass();
                                kobVar.M = f.floatValue();
                                eob eobVar2 = kobVar.a;
                                if (eobVar2 != null) {
                                    eobVar2.u(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                kobVar.h.i = f.floatValue();
                                eob eobVar3 = kobVar.a;
                                if (eobVar3 != null) {
                                    eobVar3.x0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                cs5 G3 = cs5.G(viewGroup, wjbVar, this);
                G3.p(ljaVar3);
                G3.W(5);
                G3.X = true;
                G3.b0(gl.L(18.0f), this.u0.top);
                G3.a0();
                G3.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 3 && (i = this.l1) >= 0) {
                ArrayList arrayList = this.s;
                if (i < arrayList.size()) {
                    fob fobVar = (fob) arrayList.get(this.l1);
                    lja ljaVar4 = new lja(getContext(), 0);
                    ljaVar4.b = 0.0f;
                    ljaVar4.c = 1.5f;
                    ljaVar4.c(fobVar.i);
                    ljaVar4.h = new nu9(this, fobVar, (byte) 18);
                    cs5 G4 = cs5.G(viewGroup, wjbVar, this);
                    G4.p(ljaVar4);
                    G4.W(5);
                    G4.X = true;
                    G4.b0(gl.L(18.0f), fobVar.j.top);
                    G4.a0();
                    G4.S(sl0Var, -g7bVar.getX(), -g7bVar.getY());
                    performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final long f() {
        return this.c0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f;
        float collageHeight;
        float f2;
        float f3 = this.A1;
        float f4 = 0.0f;
        if (this.h != null) {
            f = getVideoHeight() + gl.L(4.0f);
        } else {
            f = 0.0f;
        }
        float f5 = f3 + f;
        if (this.s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + gl.L(4.0f);
        }
        float f6 = f5 + collageHeight;
        if (this.F) {
            f2 = getRoundHeight() + gl.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        float f7 = f6 + f2;
        if (this.O) {
            f4 = gl.L(4.0f) + getAudioHeight();
        }
        return (int) (f7 + f4 + this.A1);
    }

    public int getMaxCount() {
        return this.c0;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return gl.U1(this.j0.c, gl.L(28.0f) + this.A1 + this.A1, getContentHeight());
    }

    public final void h(float f) {
        float f2;
        float f3;
        float f4;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long k;
        long j6;
        long k2;
        fob fobVar = this.h;
        if (fobVar == null && !this.F) {
            long j7 = this.R;
            long k3 = Utilities.k(j7 + f, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k3;
            float f5 = (float) (k3 - j7);
            this.T = Utilities.i(this.T - (f5 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f5 / ((float) this.S)), 1.0f, 0.0f);
            eob eobVar = this.a;
            if (eobVar != null) {
                eobVar.e1(this.T);
                this.a.Z0(this.U);
            }
        } else if (this.Q) {
            if (fobVar != null) {
                float f6 = fobVar.g;
                long j8 = fobVar.e;
                f2 = ((float) j8) * f6;
                float f7 = fobVar.h;
                f3 = ((float) j8) * f7;
                f4 = (f7 - f6) * ((float) j8);
            } else {
                float f8 = this.K;
                long j9 = this.I;
                f2 = f8 * ((float) j9);
                float f9 = this.L;
                f3 = ((float) j9) * f9;
                f4 = ((float) j9) * (f9 - f8);
            }
            float f10 = this.U;
            float f11 = (float) this.S;
            long j10 = f3 - (f10 * f11);
            float f12 = this.T;
            long j11 = f2 - (f12 * f11);
            float min = Math.min(f10 - f12, f4 / f11);
            long j12 = this.R;
            long j13 = f;
            long j14 = j12 + j13;
            if (j14 > j10) {
                float i = Utilities.i(((f3 - ((float) j12)) - ((float) j13)) / ((float) this.S), 1.0f, min);
                this.U = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.T = i2;
                float f13 = this.U;
                float f14 = (float) this.S;
                long j15 = f3 - (f13 * f14);
                long j16 = f2 - (i2 * f14);
                if (j15 < j16) {
                    j4 = j16;
                    j3 = j15;
                } else {
                    j3 = j16;
                    j4 = j15;
                }
                this.R = Utilities.k(this.R + j13, j4, j3);
                eob eobVar2 = this.a;
                if (eobVar2 != null) {
                    eobVar2.e1(this.T);
                    this.a.Z0(this.U);
                }
            } else if (j14 < j11) {
                float i3 = Utilities.i(((f2 - ((float) j12)) - ((float) j13)) / ((float) this.S), 1.0f - min, 0.0f);
                this.T = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.U = i4;
                float f15 = (float) this.S;
                long j17 = f3 - (i4 * f15);
                long j18 = f2 - (this.T * f15);
                if (j17 < j18) {
                    j2 = j18;
                    j = j17;
                } else {
                    j = j18;
                    j2 = j17;
                }
                this.R = Utilities.k(this.R + j13, j2, j);
                eob eobVar3 = this.a;
                if (eobVar3 != null) {
                    eobVar3.e1(this.T);
                    this.a.Z0(this.U);
                }
            } else {
                this.R = j14;
            }
        } else {
            long j19 = this.R + f;
            float f16 = (float) this.S;
            this.R = Utilities.k(j19, ((float) getBaseDuration()) - (this.U * f16), (-this.T) * f16);
        }
        invalidate();
        eob eobVar4 = this.a;
        if (eobVar4 != null) {
            eobVar4.H1(this.R + (this.T * ((float) this.S)));
        }
        if (!this.n1) {
            eob eobVar5 = this.a;
            if (eobVar5 != null) {
                eobVar5.m0(true);
                fob fobVar2 = this.h;
                if (fobVar2 != null) {
                    long j20 = this.R + (this.T * ((float) this.S));
                    float f17 = fobVar2.h;
                    float f18 = (float) fobVar2.e;
                    k2 = Utilities.k(j20, f17 * f18, fobVar2.g * f18);
                } else if (this.F) {
                    long j21 = this.R + (this.T * ((float) this.S));
                    float f19 = this.L;
                    float f20 = (float) this.I;
                    k2 = Utilities.k(j21, f19 * f20, this.K * f20);
                } else {
                    float f21 = this.T;
                    k2 = Utilities.k(f21 * ((float) j6), this.S, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                eob eobVar6 = this.a;
                this.e = k2;
                eobVar6.y(k2, false);
                return;
            } else if (!this.s1) {
                return;
            }
        }
        fob fobVar3 = this.h;
        if (fobVar3 != null) {
            long j22 = this.R + (this.T * ((float) this.S));
            float f22 = fobVar3.h;
            float f23 = (float) fobVar3.e;
            k = Utilities.k(j22, f22 * f23, fobVar3.g * f23);
            this.e = k;
        } else if (this.F && fobVar3 != null) {
            long j23 = this.R + (this.T * ((float) this.S));
            float f24 = this.L;
            float f25 = (float) fobVar3.e;
            k = Utilities.k(j23, f24 * f25, this.K * f25);
            this.e = k;
        } else {
            float f26 = this.T;
            k = Utilities.k(f26 * ((float) j5), this.S, 0L);
            this.e = k;
        }
        eob eobVar7 = this.a;
        if (eobVar7 != null) {
            eobVar7.y(k, false);
        }
    }

    public final void i(fob fobVar, float f) {
        long j;
        long k;
        long j2;
        long k2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (fobVar != null) {
            fob fobVar2 = this.w;
            if (fobVar2 != fobVar && fobVar2 != null) {
                if (this.n == this.s.indexOf(fobVar)) {
                    fob fobVar3 = this.w;
                    float f2 = (float) fobVar3.e;
                    float f3 = fobVar.h;
                    float f4 = (float) fobVar.e;
                    float f5 = fobVar.g;
                    long j7 = (f2 * 0.0f) - (f5 * f4);
                    float min = Math.min(f3 - f5, ((fobVar3.h - fobVar3.g) * f2) / f4);
                    long j8 = fobVar.f;
                    long j9 = f;
                    long j10 = j8 + j9;
                    if (j10 > (f2 * 1.0f) - (f3 * f4)) {
                        fob fobVar4 = this.w;
                        float i = Utilities.i((((fobVar4.h * ((float) fobVar4.e)) - ((float) j8)) - ((float) j9)) / ((float) fobVar.e), 1.0f, min);
                        fobVar.h = i;
                        float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                        fobVar.g = i2;
                        fob fobVar5 = this.w;
                        float f6 = fobVar5.h;
                        float f7 = (float) fobVar5.e;
                        float f8 = fobVar.h;
                        float f9 = (float) fobVar.e;
                        long j11 = (f6 * f7) - (f8 * f9);
                        long j12 = (fobVar5.g * f7) - (i2 * f9);
                        if (j11 < j12) {
                            j6 = j12;
                            j5 = j11;
                        } else {
                            j5 = j12;
                            j6 = j11;
                        }
                        fobVar.f = Utilities.k(fobVar.f + j9, j6, j5);
                        eob eobVar = this.a;
                        if (eobVar != null) {
                            eobVar.W0(fobVar.g, fobVar.a);
                            this.a.j1(fobVar.h, fobVar.a);
                        }
                    } else if (j10 < j7) {
                        fob fobVar6 = this.w;
                        float i3 = Utilities.i((((fobVar6.g * ((float) fobVar6.e)) - ((float) j8)) - ((float) j9)) / ((float) fobVar.e), 1.0f - min, 0.0f);
                        fobVar.g = i3;
                        float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                        fobVar.h = i4;
                        fob fobVar7 = this.w;
                        float f10 = fobVar7.h;
                        float f11 = (float) fobVar7.e;
                        float f12 = (float) fobVar.e;
                        long j13 = (f10 * f11) - (i4 * f12);
                        long j14 = (fobVar7.g * f11) - (fobVar.g * f12);
                        if (j13 < j14) {
                            j4 = j14;
                            j3 = j13;
                        } else {
                            j3 = j14;
                            j4 = j13;
                        }
                        fobVar.f = Utilities.k(fobVar.f + j9, j4, j3);
                        eob eobVar2 = this.a;
                        if (eobVar2 != null) {
                            eobVar2.W0(fobVar.g, fobVar.a);
                            this.a.j1(fobVar.h, fobVar.a);
                        }
                    } else {
                        fobVar.f = j10;
                    }
                } else {
                    long j15 = fobVar.f + f;
                    float f13 = (float) fobVar.e;
                    fobVar.f = Utilities.k(j15, ((float) getBaseDuration()) - (fobVar.h * f13), (-fobVar.g) * f13);
                }
            }
            invalidate();
            eob eobVar3 = this.a;
            if (eobVar3 != null) {
                eobVar3.B1(fobVar.a, fobVar.f);
            }
            if (!this.n1) {
                eob eobVar4 = this.a;
                if (eobVar4 != null) {
                    eobVar4.m0(true);
                    fob fobVar8 = this.w;
                    if (fobVar8 != fobVar && fobVar8 != null) {
                        long j16 = fobVar.f + (fobVar.g * ((float) fobVar.e));
                        float f14 = fobVar8.h;
                        float f15 = (float) fobVar8.e;
                        k2 = Utilities.k(j16, f14 * f15, fobVar8.g * f15);
                    } else {
                        float f16 = fobVar.g;
                        k2 = Utilities.k(f16 * ((float) j2), fobVar.e, 0L);
                    }
                    fob fobVar9 = this.w;
                    if (fobVar9 != fobVar && fobVar9 != null && Math.abs(this.e - k2) > 400) {
                        this.d1 = this.e;
                        this.c1.e(true, 1.0f);
                    }
                    eob eobVar5 = this.a;
                    this.e = k2;
                    eobVar5.y(k2, false);
                    return;
                } else if (!this.s1) {
                    return;
                }
            }
            fob fobVar10 = this.w;
            if (fobVar10 != fobVar && fobVar10 != null) {
                long j17 = fobVar.f + (fobVar.g * ((float) fobVar.e));
                float f17 = fobVar10.h;
                float f18 = (float) fobVar10.e;
                k = Utilities.k(j17, f17 * f18, fobVar10.g * f18);
                this.e = k;
            } else {
                float f19 = fobVar.g;
                k = Utilities.k(f19 * ((float) j), fobVar.e, 0L);
                this.e = k;
            }
            eob eobVar6 = this.a;
            if (eobVar6 != null) {
                eobVar6.y(k, false);
            }
        }
    }

    public final void j(float f) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long k;
        long j6;
        long k2;
        fob fobVar = this.h;
        if (fobVar == null) {
            long j7 = this.J;
            long k3 = Utilities.k(j7 + f, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k3;
            float f2 = (float) (k3 - j7);
            this.K = Utilities.i(this.K - (f2 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f2 / ((float) this.I)), 1.0f, 0.0f);
            eob eobVar = this.a;
            if (eobVar != null) {
                eobVar.f0(this.K);
                this.a.u1(this.L);
            }
        } else if (this.H) {
            float f3 = fobVar.h;
            float f4 = (float) fobVar.e;
            float f5 = this.L;
            float f6 = (float) this.I;
            long j8 = (f3 * f4) - (f5 * f6);
            float f7 = fobVar.g;
            float f8 = this.K;
            long j9 = (f7 * f4) - (f8 * f6);
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j10 = this.J;
            long j11 = f;
            long j12 = j10 + j11;
            if (j12 > j8) {
                fob fobVar2 = this.h;
                float i = Utilities.i((((fobVar2.h * ((float) fobVar2.e)) - ((float) j10)) - ((float) j11)) / ((float) this.I), 1.0f, min);
                this.L = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.K = i2;
                fob fobVar3 = this.h;
                float f9 = fobVar3.h;
                float f10 = (float) fobVar3.e;
                float f11 = this.L;
                float f12 = (float) this.I;
                long j13 = (f9 * f10) - (f11 * f12);
                long j14 = (fobVar3.g * f10) - (i2 * f12);
                if (j13 < j14) {
                    j4 = j14;
                    j3 = j13;
                } else {
                    j3 = j14;
                    j4 = j13;
                }
                this.J = Utilities.k(this.J + j11, j4, j3);
                eob eobVar2 = this.a;
                if (eobVar2 != null) {
                    eobVar2.f0(this.K);
                    this.a.u1(this.L);
                }
            } else if (j12 < j9) {
                fob fobVar4 = this.h;
                float i3 = Utilities.i((((fobVar4.g * ((float) fobVar4.e)) - ((float) j10)) - ((float) j11)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.L = i4;
                fob fobVar5 = this.h;
                float f13 = fobVar5.h;
                float f14 = (float) fobVar5.e;
                float f15 = (float) this.I;
                long j15 = (f13 * f14) - (i4 * f15);
                long j16 = (fobVar5.g * f14) - (this.K * f15);
                if (j15 < j16) {
                    j2 = j16;
                    j = j15;
                } else {
                    j = j16;
                    j2 = j15;
                }
                this.J = Utilities.k(this.J + j11, j2, j);
                eob eobVar3 = this.a;
                if (eobVar3 != null) {
                    eobVar3.f0(this.K);
                    this.a.u1(this.L);
                }
            } else {
                this.J = j12;
            }
        } else {
            long j17 = this.J + f;
            float f16 = (float) this.I;
            this.J = Utilities.k(j17, ((float) getBaseDuration()) - (this.L * f16), (-this.K) * f16);
        }
        invalidate();
        eob eobVar4 = this.a;
        if (eobVar4 != null) {
            eobVar4.L0(this.J + (this.K * ((float) this.I)));
        }
        if (!this.n1) {
            eob eobVar5 = this.a;
            if (eobVar5 != null) {
                eobVar5.m0(true);
                fob fobVar6 = this.h;
                if (fobVar6 != null) {
                    long j18 = this.J + (this.K * ((float) this.I));
                    float f17 = fobVar6.h;
                    float f18 = (float) fobVar6.e;
                    k2 = Utilities.k(j18, f17 * f18, fobVar6.g * f18);
                } else {
                    float f19 = this.K;
                    k2 = Utilities.k(f19 * ((float) j6), this.I, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                eob eobVar6 = this.a;
                this.e = k2;
                eobVar6.y(k2, false);
                return;
            } else if (!this.s1) {
                return;
            }
        }
        fob fobVar7 = this.h;
        if (fobVar7 != null) {
            long j19 = this.J + (this.K * ((float) this.I));
            float f20 = fobVar7.h;
            float f21 = (float) fobVar7.e;
            k = Utilities.k(j19, f20 * f21, fobVar7.g * f21);
            this.e = k;
        } else {
            float f22 = this.K;
            k = Utilities.k(f22 * ((float) j5), this.I, 0L);
            this.e = k;
        }
        eob eobVar7 = this.a;
        if (eobVar7 != null) {
            eobVar7.y(k, false);
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        fob fobVar = this.h;
        long j = fobVar.e;
        this.f = Utilities.k((((fobVar.h + fobVar.g) / 2.0f) * ((float) j)) - (((float) min) / 2.0f), j - min, 0L);
        invalidate();
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (z && this.F) {
            this.H = true;
            this.Q = false;
        } else {
            this.H = false;
            if (!this.O || this.h != null) {
                z2 = false;
            }
            this.Q = z2;
        }
        invalidate();
    }

    public final boolean m(boolean z, float f) {
        long j;
        fob fobVar;
        fob fobVar2 = this.h;
        ArrayList arrayList = this.s;
        if (fobVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f2 = ((f - this.z1) - this.y1) / this.v1;
            fob fobVar3 = this.w;
            if (fobVar3 != null) {
                j = (fobVar3.g * ((float) fobVar3.e)) + ((float) fobVar3.f);
            } else {
                j = 0;
            }
            float f3 = f2 * ((float) min);
            if (fobVar3 == null) {
                if (this.h == null) {
                    j = this.R;
                } else {
                    j = 0;
                }
            }
            long i = Utilities.i((f3 - ((float) j)) + ((float) this.f), (float) getBaseDuration(), 0.0f);
            fob fobVar4 = this.h;
            if (fobVar4 != null) {
                float f4 = ((float) i) / ((float) fobVar4.e);
                if (f4 < fobVar4.g || f4 > fobVar4.h) {
                    return false;
                }
            }
            if (this.w == null || (i >= 0 && i < (fobVar.h - fobVar.g) * ((float) fobVar.e))) {
                if (this.O && fobVar4 == null && arrayList.isEmpty()) {
                    float f5 = ((float) i) / ((float) this.S);
                    if (f5 < this.T || f5 > this.U) {
                        return false;
                    }
                }
                this.e = i;
                invalidate();
                eob eobVar = this.a;
                if (eobVar != null) {
                    eobVar.y(i, z);
                }
                sma smaVar = this.e1;
                if (smaVar != null) {
                    gl.r(smaVar);
                    this.e1 = null;
                }
                if (z) {
                    sma smaVar2 = new sma(this, i, (byte) 7);
                    this.e1 = smaVar2;
                    gl.e3(smaVar2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        fob fobVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        iob iobVar = this.N;
        Long l = null;
        if (iobVar != null) {
            iobVar.a();
            this.N = null;
        }
        long j4 = this.I;
        if (str != null) {
            this.G = str;
            this.I = j;
            this.J = j2 - (((float) j) * f);
            this.K = f;
            this.L = f2;
            this.M = f3;
            if (getMeasuredWidth() > 0 && this.N == null && ((fobVar = this.h) == null || fobVar.e >= 1)) {
                String str2 = this.G;
                int i = this.w1;
                int i2 = this.z1;
                int i3 = (i - i2) - i2;
                int L = gl.L(38.0f);
                long j5 = this.I;
                if (j5 > 2) {
                    l = Long.valueOf(j5);
                }
                fob fobVar2 = this.h;
                if (fobVar2 != null) {
                    maxScrollDuration = fobVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j3 = j4;
                z2 = false;
                z3 = true;
                this.N = new iob(this, false, str2, i3, L, l, maxScrollDuration, -1L, -1L, new bob(this, (byte) 0));
            } else {
                z2 = false;
                j3 = j4;
                z3 = true;
            }
            if (this.h == null) {
                this.Q = z2;
                this.H = z3;
            }
        } else {
            z2 = false;
            j3 = j4;
            z3 = true;
            this.G = null;
            this.I = 1L;
            this.H = false;
        }
        if (this.G != null) {
            z4 = z3;
        } else {
            z4 = z2;
        }
        this.F = z4;
        if (j3 != j && this.h == null && this.b0 != null) {
            this.a0 = z3;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(((float) j) / ((float) this.S), 1.0f, 0.0f);
        }
        if (!z) {
            this.e0.f(this.H, z3);
            this.g0.f(this.Q, z3);
            this.d0.f(this.F, z3);
        }
        invalidate();
    }

    public final void o(boolean z, String str, long j, float f) {
        String str2;
        fob fobVar = this.h;
        if (fobVar == null) {
            str2 = null;
        } else {
            str2 = fobVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        fob fobVar2 = this.h;
        if (fobVar2 != null) {
            iob iobVar = fobVar2.c;
            if (iobVar != null) {
                iobVar.a();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            fob fobVar3 = new fob(this);
            this.h = fobVar3;
            fobVar3.b = z;
            fobVar3.d = str;
            fobVar3.e = j;
            fobVar3.i = f;
            fobVar3.a(false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.M0.setTextSize(gl.L(12.0f));
        this.Q0.setTextSize(gl.L(12.0f));
        int L = gl.L(12.0f);
        this.z1 = L;
        int L2 = gl.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, gl.L(12.0f), gl.L(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w1 = size;
        int L3 = gl.L(388.0f);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = gl.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 << 1)) - (this.z1 << 1);
        fob fobVar = this.h;
        if (fobVar != null && fobVar.d != null && fobVar.c == null) {
            fobVar.a(false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                fob fobVar2 = (fob) obj;
                if (fobVar2.d != null && fobVar2.c == null) {
                    fobVar2.a(false);
                    fobVar2.b();
                }
            }
        }
        if (this.P != null && this.b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kob.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.b0 == null || this.a0) {
                this.b0 = new dob(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        fob fobVar;
        pva pvaVar = new pva((byte) 6);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, pvaVar);
        if (arrayList.isEmpty()) {
            fobVar = null;
        } else {
            fobVar = (fob) arrayList.get(0);
        }
        this.w = fobVar;
        if (fobVar != null) {
            long j = fobVar.f;
        }
    }

    public void setCollage(ArrayList<f4b> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        iob iobVar;
        int i = 0;
        while (true) {
            arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            fob fobVar = (fob) arrayList2.get(i);
            if (fobVar != null && (iobVar = fobVar.c) != null) {
                iobVar.a();
            }
            i++;
        }
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i2 >= arrayList3.size()) {
                break;
            }
            dob dobVar = (dob) arrayList3.get(i2);
            if (dobVar != null) {
                dobVar.a();
            }
            i2++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                f4b f4bVar = arrayList.get(i3);
                if (f4bVar.K) {
                    fob fobVar2 = new fob(this);
                    fobVar2.a = i3;
                    fobVar2.b = false;
                    fobVar2.d = f4bVar.L.getAbsolutePath();
                    fobVar2.e = f4bVar.h0;
                    fobVar2.f = f4bVar.X;
                    fobVar2.i = f4bVar.P;
                    fobVar2.g = f4bVar.V;
                    fobVar2.h = f4bVar.W;
                    fobVar2.a(false);
                    fobVar2.b();
                    arrayList2.add(fobVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(eob eobVar) {
        this.a = eobVar;
    }

    public void setMaxCount(int i) {
        this.c0 = i;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    public void setProgress(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kob.setProgress(long):void");
    }

    public void setRoundNull(boolean z) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setVideoLeft(float f) {
        fob fobVar = this.h;
        if (fobVar == null) {
            return;
        }
        fobVar.g = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        fob fobVar = this.h;
        if (fobVar == null) {
            return;
        }
        fobVar.h = f;
        invalidate();
    }
}
