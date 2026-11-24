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
public final class lqb extends View {
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
    public final kqb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public jqb N;
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
    public final mt9 X0;
    public boolean Y0;
    public final vua Z0;
    public fqb a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public eqb b0;
    public long b1;
    public int c;
    public int c0;
    public final ln c1;
    public Runnable d;
    public final ln d0;
    public long d1;
    public long e;
    public final ln e0;
    public toa e1;
    public long f;
    public final ln f0;
    public long f1;
    public final ln g0;
    public long g1;
    public gqb h;
    public final ln h0;
    public float h1;
    public final ln i0;
    public int i1;
    public final ln j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final sm0 l0;
    public int l1;
    public final wm0 m0;
    public boolean m1;
    public int n;
    public final wm0 n0;
    public boolean n1;
    public final wm0 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final uib r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final kqb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public gqb w;
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

    public lqb(Context context, ViewGroup viewGroup, i9b i9bVar, ylb ylbVar, sm0 sm0Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        d53 d53Var = d53.h;
        this.d0 = new ln(this, 0L, 360L, d53Var);
        this.e0 = new ln(360L, this, d53Var);
        this.f0 = new ln(this, 0L, 360L, d53Var);
        this.g0 = new ln(360L, this, d53Var);
        this.h0 = new ln(this, 0L, 360L, d53Var);
        this.i0 = new ln(this, 0L, 360L, d53Var);
        this.j0 = new ln(this, 0L, 320L, d53Var);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new kqb();
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
        this.J0 = new kqb();
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
        this.X0 = new mt9(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new ln(0.0f, this, 0L, 340L, d53Var);
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
        textPaint2.setTextSize(gm.L(12.0f));
        textPaint2.setTypeface(gm.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(gm.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(1.0f), 436207616);
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(gm.L(2.0f), 0.0f, gm.L(2.0f), 1073741824);
        textPaint.setTypeface(gm.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new uib(jb6.M0(2131744142, null), 12.0f, gm.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232798).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231192).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = sm0Var;
        this.m0 = new wm0(sm0Var, this, 0, false);
        this.n0 = new wm0(sm0Var, this, 3, false);
        this.o0 = new wm0(sm0Var, this, 4, false);
        this.Z0 = new vua(this, viewGroup, ylbVar, sm0Var, i9bVar, (byte) 5);
    }

    private float getAudioHeight() {
        return gm.U1(this.g0.d(this.Q), gm.L(28.0f), gm.L(38.0f));
    }

    public long getBaseDuration() {
        gqb gqbVar = this.h;
        if (gqbVar != null) {
            return Math.max(1L, gqbVar.e);
        }
        gqb gqbVar2 = this.w;
        if (gqbVar2 != null) {
            return Math.max(1L, gqbVar2.e);
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
                f += gm.L(4.0f);
            }
            f += gm.U1(((gqb) arrayList.get(i)).k.c, gm.L(28.0f), gm.L(38.0f));
        }
        return f;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return gm.U1(this.e0.d(this.H), gm.L(28.0f), gm.L(38.0f));
    }

    private float getVideoHeight() {
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            return 0.0f;
        }
        return gm.U1(gqbVar.k.c, gm.L(28.0f), gm.L(38.0f));
    }

    public final int b(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqb.b(android.view.MotionEvent):int");
    }

    public final void c(float f, float f2, float f3, long j, Canvas canvas) {
        long j2;
        float f4;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k = (float) Utilities.k(j, getBaseDuration(), 0L);
        gqb gqbVar = this.w;
        if (gqbVar != null) {
            f4 = (gqbVar.g * ((float) gqbVar.e)) + ((float) gqbVar.f);
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
        RectF rectF = gm.P;
        rectF.set(f5 - gm.N(1.5f), f7, gm.N(1.5f) + f5, f8);
        rectF.inset(-gm.N(0.66f), -gm.N(0.66f));
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
        rectF.set(f5 - gm.N(1.5f), f7, gm.N(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint2);
    }

    @Override
    public final void computeScroll() {
        mt9 mt9Var = this.X0;
        if (mt9Var.b()) {
            int i = mt9Var.j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.r1) {
                this.f = Math.max(0.0f, (((i - this.z1) - this.y1) / this.v1) * ((float) min));
            } else if (!this.Q) {
                mt9Var.a();
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
            fqb fqbVar = this.a;
            if (fqbVar != null) {
                fqbVar.w0(false);
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
        RectF rectF = gm.P;
        float f10 = 10.0f;
        rectF.set(f3 - gm.L(10.0f), f, gm.L(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, 255, 31);
        int i = (int) (255.0f * f5);
        Paint paint3 = this.A0;
        paint3.setAlpha(i);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint3);
        if (this.Y0) {
            f6 = 2.5f;
        } else {
            f6 = 10.0f;
        }
        rectF.inset(gm.L(f6), gm.L(2.0f));
        boolean z = this.Y0;
        Paint paint4 = this.B0;
        if (z) {
            canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float L = gm.L(2.0f);
        float L2 = gm.L(10.0f);
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
        float y = td4.y(gm.L(f7), L, 2.0f, f3);
        float f11 = f + f2;
        float f12 = (f11 - L2) / 2.0f;
        if (this.Y0) {
            f8 = 2.0f;
        } else {
            f8 = 10.0f;
        }
        float f13 = (f11 + L2) / 2.0f;
        rectF.set(y, f12, f3 - ((gm.L(f8) + L) / 2.0f), f13);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint2);
            if (paint != null && !this.Y0) {
                paint5.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint5);
            }
        }
        if (this.Y0) {
            f9 = 2.5f;
        } else {
            f9 = 10.0f;
        }
        float z2 = aq1.z(gm.L(f9), L, 2.0f, f4);
        if (this.Y0) {
            f10 = 2.5f;
        }
        rectF.set(z2, f12, td4.e(gm.L(f10), L, 2.0f, f4), f13);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqb.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(ViewGroup viewGroup, ylb ylbVar, sm0 sm0Var, i9b i9bVar) {
        int i;
        int i2 = this.k1;
        try {
            if (i2 == 2 && this.O) {
                mla mlaVar = new mla(getContext(), 0);
                mlaVar.b = 0.0f;
                mlaVar.c = 1.5f;
                mlaVar.c(this.W);
                mlaVar.h = new qac(this) {
                    public final lqb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        lqb lqbVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                lqbVar.getClass();
                                lqbVar.W = f.floatValue();
                                fqb fqbVar = lqbVar.a;
                                if (fqbVar != null) {
                                    fqbVar.y(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                lqbVar.getClass();
                                lqbVar.M = f.floatValue();
                                fqb fqbVar2 = lqbVar.a;
                                if (fqbVar2 != null) {
                                    fqbVar2.s(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                lqbVar.h.i = f.floatValue();
                                fqb fqbVar3 = lqbVar.a;
                                if (fqbVar3 != null) {
                                    fqbVar3.K0(f.floatValue());
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
                float min2 = Math.min((i3 - i4) - i5, ((((gm.R1(this.U, 1.0f, this.g0.c) * ((float) this.S)) + ((float) (this.R - this.f))) / ((float) min)) * this.v1) + i4 + i5);
                bu5 G = bu5.G(viewGroup, ylbVar, this);
                G.p(mlaVar);
                G.n(true);
                G.b(2131232114, jb6.M0(2131744409, null), new cqb(this, (byte) 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(this.w1 - min2)) + gm.L(18.0f), this.G0.top);
                G.a0();
                G.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 1 && this.F) {
                mla mlaVar2 = new mla(getContext(), 0);
                mlaVar2.b = 0.0f;
                mlaVar2.c = 1.5f;
                mlaVar2.c(this.M);
                mlaVar2.h = new qac(this) {
                    public final lqb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        lqb lqbVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                lqbVar.getClass();
                                lqbVar.W = f.floatValue();
                                fqb fqbVar = lqbVar.a;
                                if (fqbVar != null) {
                                    fqbVar.y(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                lqbVar.getClass();
                                lqbVar.M = f.floatValue();
                                fqb fqbVar2 = lqbVar.a;
                                if (fqbVar2 != null) {
                                    fqbVar2.s(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                lqbVar.h.i = f.floatValue();
                                fqb fqbVar3 = lqbVar.a;
                                if (fqbVar3 != null) {
                                    fqbVar3.K0(f.floatValue());
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
                float min4 = Math.min((i6 - i7) - i8, ((((gm.R1(this.L, 1.0f, this.e0.c) * ((float) this.I)) + ((float) (this.J - this.f))) / ((float) min3)) * this.v1) + i7 + i8);
                bu5 G2 = bu5.G(viewGroup, ylbVar, this);
                G2.p(mlaVar2);
                G2.n(true);
                G2.b(2131232114, jb6.M0(2131744173, null), new cqb(this, (byte) 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(this.w1 - min4)) + gm.L(18.0f), this.y0.top);
                G2.a0();
                G2.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 0 && this.h != null) {
                mla mlaVar3 = new mla(getContext(), 0);
                mlaVar3.b = 0.0f;
                mlaVar3.c = 1.5f;
                mlaVar3.c(this.h.i);
                mlaVar3.h = new qac(this) {
                    public final lqb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        lqb lqbVar = this.b;
                        Float f = (Float) obj;
                        switch (b) {
                            case 0:
                                lqbVar.getClass();
                                lqbVar.W = f.floatValue();
                                fqb fqbVar = lqbVar.a;
                                if (fqbVar != null) {
                                    fqbVar.y(f.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                lqbVar.getClass();
                                lqbVar.M = f.floatValue();
                                fqb fqbVar2 = lqbVar.a;
                                if (fqbVar2 != null) {
                                    fqbVar2.s(f.floatValue());
                                    return;
                                }
                                return;
                            default:
                                lqbVar.h.i = f.floatValue();
                                fqb fqbVar3 = lqbVar.a;
                                if (fqbVar3 != null) {
                                    fqbVar3.K0(f.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                bu5 G3 = bu5.G(viewGroup, ylbVar, this);
                G3.p(mlaVar3);
                G3.W(5);
                G3.X = true;
                G3.b0(gm.L(18.0f), this.u0.top);
                G3.a0();
                G3.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 3 && (i = this.l1) >= 0) {
                ArrayList arrayList = this.s;
                if (i < arrayList.size()) {
                    gqb gqbVar = (gqb) arrayList.get(this.l1);
                    mla mlaVar4 = new mla(getContext(), 0);
                    mlaVar4.b = 0.0f;
                    mlaVar4.c = 1.5f;
                    mlaVar4.c(gqbVar.i);
                    mlaVar4.h = new ts9(this, gqbVar, (byte) 19);
                    bu5 G4 = bu5.G(viewGroup, ylbVar, this);
                    G4.p(mlaVar4);
                    G4.W(5);
                    G4.X = true;
                    G4.b0(gm.L(18.0f), gqbVar.j.top);
                    G4.a0();
                    G4.S(sm0Var, -i9bVar.getX(), -i9bVar.getY());
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
            f = getVideoHeight() + gm.L(4.0f);
        } else {
            f = 0.0f;
        }
        float f5 = f3 + f;
        if (this.s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + gm.L(4.0f);
        }
        float f6 = f5 + collageHeight;
        if (this.F) {
            f2 = getRoundHeight() + gm.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        float f7 = f6 + f2;
        if (this.O) {
            f4 = gm.L(4.0f) + getAudioHeight();
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
        return gm.U1(this.j0.c, gm.L(28.0f) + this.A1 + this.A1, getContentHeight());
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
        gqb gqbVar = this.h;
        if (gqbVar == null && !this.F) {
            long j7 = this.R;
            long k3 = Utilities.k(j7 + f, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k3;
            float f5 = (float) (k3 - j7);
            this.T = Utilities.i(this.T - (f5 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f5 / ((float) this.S)), 1.0f, 0.0f);
            fqb fqbVar = this.a;
            if (fqbVar != null) {
                fqbVar.H1(this.T);
                this.a.v1(this.U);
            }
        } else if (this.Q) {
            if (gqbVar != null) {
                float f6 = gqbVar.g;
                long j8 = gqbVar.e;
                f2 = ((float) j8) * f6;
                float f7 = gqbVar.h;
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
                fqb fqbVar2 = this.a;
                if (fqbVar2 != null) {
                    fqbVar2.H1(this.T);
                    this.a.v1(this.U);
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
                fqb fqbVar3 = this.a;
                if (fqbVar3 != null) {
                    fqbVar3.H1(this.T);
                    this.a.v1(this.U);
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
        fqb fqbVar4 = this.a;
        if (fqbVar4 != null) {
            fqbVar4.k2(this.R + (this.T * ((float) this.S)));
        }
        if (!this.n1) {
            fqb fqbVar5 = this.a;
            if (fqbVar5 != null) {
                fqbVar5.w0(true);
                gqb gqbVar2 = this.h;
                if (gqbVar2 != null) {
                    long j20 = this.R + (this.T * ((float) this.S));
                    float f17 = gqbVar2.h;
                    float f18 = (float) gqbVar2.e;
                    k2 = Utilities.k(j20, f17 * f18, gqbVar2.g * f18);
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
                fqb fqbVar6 = this.a;
                this.e = k2;
                fqbVar6.C(k2, false);
                return;
            } else if (!this.s1) {
                return;
            }
        }
        gqb gqbVar3 = this.h;
        if (gqbVar3 != null) {
            long j22 = this.R + (this.T * ((float) this.S));
            float f22 = gqbVar3.h;
            float f23 = (float) gqbVar3.e;
            k = Utilities.k(j22, f22 * f23, gqbVar3.g * f23);
            this.e = k;
        } else if (this.F && gqbVar3 != null) {
            long j23 = this.R + (this.T * ((float) this.S));
            float f24 = this.L;
            float f25 = (float) gqbVar3.e;
            k = Utilities.k(j23, f24 * f25, this.K * f25);
            this.e = k;
        } else {
            float f26 = this.T;
            k = Utilities.k(f26 * ((float) j5), this.S, 0L);
            this.e = k;
        }
        fqb fqbVar7 = this.a;
        if (fqbVar7 != null) {
            fqbVar7.C(k, false);
        }
    }

    public final void i(gqb gqbVar, float f) {
        long j;
        long k;
        long j2;
        long k2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (gqbVar != null) {
            gqb gqbVar2 = this.w;
            if (gqbVar2 != gqbVar && gqbVar2 != null) {
                if (this.n == this.s.indexOf(gqbVar)) {
                    gqb gqbVar3 = this.w;
                    float f2 = (float) gqbVar3.e;
                    float f3 = gqbVar.h;
                    float f4 = (float) gqbVar.e;
                    float f5 = gqbVar.g;
                    long j7 = (f2 * 0.0f) - (f5 * f4);
                    float min = Math.min(f3 - f5, ((gqbVar3.h - gqbVar3.g) * f2) / f4);
                    long j8 = gqbVar.f;
                    long j9 = f;
                    long j10 = j8 + j9;
                    if (j10 > (f2 * 1.0f) - (f3 * f4)) {
                        gqb gqbVar4 = this.w;
                        float i = Utilities.i((((gqbVar4.h * ((float) gqbVar4.e)) - ((float) j8)) - ((float) j9)) / ((float) gqbVar.e), 1.0f, min);
                        gqbVar.h = i;
                        float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                        gqbVar.g = i2;
                        gqb gqbVar5 = this.w;
                        float f6 = gqbVar5.h;
                        float f7 = (float) gqbVar5.e;
                        float f8 = gqbVar.h;
                        float f9 = (float) gqbVar.e;
                        long j11 = (f6 * f7) - (f8 * f9);
                        long j12 = (gqbVar5.g * f7) - (i2 * f9);
                        if (j11 < j12) {
                            j6 = j12;
                            j5 = j11;
                        } else {
                            j5 = j12;
                            j6 = j11;
                        }
                        gqbVar.f = Utilities.k(gqbVar.f + j9, j6, j5);
                        fqb fqbVar = this.a;
                        if (fqbVar != null) {
                            fqbVar.s1(gqbVar.g, gqbVar.a);
                            this.a.R1(gqbVar.h, gqbVar.a);
                        }
                    } else if (j10 < j7) {
                        gqb gqbVar6 = this.w;
                        float i3 = Utilities.i((((gqbVar6.g * ((float) gqbVar6.e)) - ((float) j8)) - ((float) j9)) / ((float) gqbVar.e), 1.0f - min, 0.0f);
                        gqbVar.g = i3;
                        float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                        gqbVar.h = i4;
                        gqb gqbVar7 = this.w;
                        float f10 = gqbVar7.h;
                        float f11 = (float) gqbVar7.e;
                        float f12 = (float) gqbVar.e;
                        long j13 = (f10 * f11) - (i4 * f12);
                        long j14 = (gqbVar7.g * f11) - (gqbVar.g * f12);
                        if (j13 < j14) {
                            j4 = j14;
                            j3 = j13;
                        } else {
                            j3 = j14;
                            j4 = j13;
                        }
                        gqbVar.f = Utilities.k(gqbVar.f + j9, j4, j3);
                        fqb fqbVar2 = this.a;
                        if (fqbVar2 != null) {
                            fqbVar2.s1(gqbVar.g, gqbVar.a);
                            this.a.R1(gqbVar.h, gqbVar.a);
                        }
                    } else {
                        gqbVar.f = j10;
                    }
                } else {
                    long j15 = gqbVar.f + f;
                    float f13 = (float) gqbVar.e;
                    gqbVar.f = Utilities.k(j15, ((float) getBaseDuration()) - (gqbVar.h * f13), (-gqbVar.g) * f13);
                }
            }
            invalidate();
            fqb fqbVar3 = this.a;
            if (fqbVar3 != null) {
                fqbVar3.e2(gqbVar.a, gqbVar.f);
            }
            if (!this.n1) {
                fqb fqbVar4 = this.a;
                if (fqbVar4 != null) {
                    fqbVar4.w0(true);
                    gqb gqbVar8 = this.w;
                    if (gqbVar8 != gqbVar && gqbVar8 != null) {
                        long j16 = gqbVar.f + (gqbVar.g * ((float) gqbVar.e));
                        float f14 = gqbVar8.h;
                        float f15 = (float) gqbVar8.e;
                        k2 = Utilities.k(j16, f14 * f15, gqbVar8.g * f15);
                    } else {
                        float f16 = gqbVar.g;
                        k2 = Utilities.k(f16 * ((float) j2), gqbVar.e, 0L);
                    }
                    gqb gqbVar9 = this.w;
                    if (gqbVar9 != gqbVar && gqbVar9 != null && Math.abs(this.e - k2) > 400) {
                        this.d1 = this.e;
                        this.c1.e(true, 1.0f);
                    }
                    fqb fqbVar5 = this.a;
                    this.e = k2;
                    fqbVar5.C(k2, false);
                    return;
                } else if (!this.s1) {
                    return;
                }
            }
            gqb gqbVar10 = this.w;
            if (gqbVar10 != gqbVar && gqbVar10 != null) {
                long j17 = gqbVar.f + (gqbVar.g * ((float) gqbVar.e));
                float f17 = gqbVar10.h;
                float f18 = (float) gqbVar10.e;
                k = Utilities.k(j17, f17 * f18, gqbVar10.g * f18);
                this.e = k;
            } else {
                float f19 = gqbVar.g;
                k = Utilities.k(f19 * ((float) j), gqbVar.e, 0L);
                this.e = k;
            }
            fqb fqbVar6 = this.a;
            if (fqbVar6 != null) {
                fqbVar6.C(k, false);
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
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            long j7 = this.J;
            long k3 = Utilities.k(j7 + f, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k3;
            float f2 = (float) (k3 - j7);
            this.K = Utilities.i(this.K - (f2 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f2 / ((float) this.I)), 1.0f, 0.0f);
            fqb fqbVar = this.a;
            if (fqbVar != null) {
                fqbVar.n0(this.K);
                this.a.c2(this.L);
            }
        } else if (this.H) {
            float f3 = gqbVar.h;
            float f4 = (float) gqbVar.e;
            float f5 = this.L;
            float f6 = (float) this.I;
            long j8 = (f3 * f4) - (f5 * f6);
            float f7 = gqbVar.g;
            float f8 = this.K;
            long j9 = (f7 * f4) - (f8 * f6);
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j10 = this.J;
            long j11 = f;
            long j12 = j10 + j11;
            if (j12 > j8) {
                gqb gqbVar2 = this.h;
                float i = Utilities.i((((gqbVar2.h * ((float) gqbVar2.e)) - ((float) j10)) - ((float) j11)) / ((float) this.I), 1.0f, min);
                this.L = i;
                float i2 = Utilities.i(i - min, 1.0f, 0.0f);
                this.K = i2;
                gqb gqbVar3 = this.h;
                float f9 = gqbVar3.h;
                float f10 = (float) gqbVar3.e;
                float f11 = this.L;
                float f12 = (float) this.I;
                long j13 = (f9 * f10) - (f11 * f12);
                long j14 = (gqbVar3.g * f10) - (i2 * f12);
                if (j13 < j14) {
                    j4 = j14;
                    j3 = j13;
                } else {
                    j3 = j14;
                    j4 = j13;
                }
                this.J = Utilities.k(this.J + j11, j4, j3);
                fqb fqbVar2 = this.a;
                if (fqbVar2 != null) {
                    fqbVar2.n0(this.K);
                    this.a.c2(this.L);
                }
            } else if (j12 < j9) {
                gqb gqbVar4 = this.h;
                float i3 = Utilities.i((((gqbVar4.g * ((float) gqbVar4.e)) - ((float) j10)) - ((float) j11)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i3;
                float i4 = Utilities.i(i3 + min, 1.0f, 0.0f);
                this.L = i4;
                gqb gqbVar5 = this.h;
                float f13 = gqbVar5.h;
                float f14 = (float) gqbVar5.e;
                float f15 = (float) this.I;
                long j15 = (f13 * f14) - (i4 * f15);
                long j16 = (gqbVar5.g * f14) - (this.K * f15);
                if (j15 < j16) {
                    j2 = j16;
                    j = j15;
                } else {
                    j = j16;
                    j2 = j15;
                }
                this.J = Utilities.k(this.J + j11, j2, j);
                fqb fqbVar3 = this.a;
                if (fqbVar3 != null) {
                    fqbVar3.n0(this.K);
                    this.a.c2(this.L);
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
        fqb fqbVar4 = this.a;
        if (fqbVar4 != null) {
            fqbVar4.f1(this.J + (this.K * ((float) this.I)));
        }
        if (!this.n1) {
            fqb fqbVar5 = this.a;
            if (fqbVar5 != null) {
                fqbVar5.w0(true);
                gqb gqbVar6 = this.h;
                if (gqbVar6 != null) {
                    long j18 = this.J + (this.K * ((float) this.I));
                    float f17 = gqbVar6.h;
                    float f18 = (float) gqbVar6.e;
                    k2 = Utilities.k(j18, f17 * f18, gqbVar6.g * f18);
                } else {
                    float f19 = this.K;
                    k2 = Utilities.k(f19 * ((float) j6), this.I, 0L);
                }
                if (this.h != null && Math.abs(this.e - k2) > 400) {
                    this.d1 = this.e;
                    this.c1.e(true, 1.0f);
                }
                fqb fqbVar6 = this.a;
                this.e = k2;
                fqbVar6.C(k2, false);
                return;
            } else if (!this.s1) {
                return;
            }
        }
        gqb gqbVar7 = this.h;
        if (gqbVar7 != null) {
            long j19 = this.J + (this.K * ((float) this.I));
            float f20 = gqbVar7.h;
            float f21 = (float) gqbVar7.e;
            k = Utilities.k(j19, f20 * f21, gqbVar7.g * f21);
            this.e = k;
        } else {
            float f22 = this.K;
            k = Utilities.k(f22 * ((float) j5), this.I, 0L);
            this.e = k;
        }
        fqb fqbVar7 = this.a;
        if (fqbVar7 != null) {
            fqbVar7.C(k, false);
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        gqb gqbVar = this.h;
        long j = gqbVar.e;
        this.f = Utilities.k((((gqbVar.h + gqbVar.g) / 2.0f) * ((float) j)) - (((float) min) / 2.0f), j - min, 0L);
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
        gqb gqbVar;
        gqb gqbVar2 = this.h;
        ArrayList arrayList = this.s;
        if (gqbVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f2 = ((f - this.z1) - this.y1) / this.v1;
            gqb gqbVar3 = this.w;
            if (gqbVar3 != null) {
                j = (gqbVar3.g * ((float) gqbVar3.e)) + ((float) gqbVar3.f);
            } else {
                j = 0;
            }
            float f3 = f2 * ((float) min);
            if (gqbVar3 == null) {
                if (this.h == null) {
                    j = this.R;
                } else {
                    j = 0;
                }
            }
            long i = Utilities.i((f3 - ((float) j)) + ((float) this.f), (float) getBaseDuration(), 0.0f);
            gqb gqbVar4 = this.h;
            if (gqbVar4 != null) {
                float f4 = ((float) i) / ((float) gqbVar4.e);
                if (f4 < gqbVar4.g || f4 > gqbVar4.h) {
                    return false;
                }
            }
            if (this.w == null || (i >= 0 && i < (gqbVar.h - gqbVar.g) * ((float) gqbVar.e))) {
                if (this.O && gqbVar4 == null && arrayList.isEmpty()) {
                    float f5 = ((float) i) / ((float) this.S);
                    if (f5 < this.T || f5 > this.U) {
                        return false;
                    }
                }
                this.e = i;
                invalidate();
                fqb fqbVar = this.a;
                if (fqbVar != null) {
                    fqbVar.C(i, z);
                }
                toa toaVar = this.e1;
                if (toaVar != null) {
                    gm.r(toaVar);
                    this.e1 = null;
                }
                if (z) {
                    toa toaVar2 = new toa(this, i, (byte) 7);
                    this.e1 = toaVar2;
                    gm.d3(toaVar2, 150L);
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
        gqb gqbVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        jqb jqbVar = this.N;
        Long l = null;
        if (jqbVar != null) {
            jqbVar.a();
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
            if (getMeasuredWidth() > 0 && this.N == null && ((gqbVar = this.h) == null || gqbVar.e >= 1)) {
                String str2 = this.G;
                int i = this.w1;
                int i2 = this.z1;
                int i3 = (i - i2) - i2;
                int L = gm.L(38.0f);
                long j5 = this.I;
                if (j5 > 2) {
                    l = Long.valueOf(j5);
                }
                gqb gqbVar2 = this.h;
                if (gqbVar2 != null) {
                    maxScrollDuration = gqbVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j3 = j4;
                z2 = false;
                z3 = true;
                this.N = new jqb(this, false, str2, i3, L, l, maxScrollDuration, -1L, -1L, new cqb(this, (byte) 0));
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
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            str2 = null;
        } else {
            str2 = gqbVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        gqb gqbVar2 = this.h;
        if (gqbVar2 != null) {
            jqb jqbVar = gqbVar2.c;
            if (jqbVar != null) {
                jqbVar.a();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            gqb gqbVar3 = new gqb(this);
            this.h = gqbVar3;
            gqbVar3.b = z;
            gqbVar3.d = str;
            gqbVar3.e = j;
            gqbVar3.i = f;
            gqbVar3.a(false);
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
        this.M0.setTextSize(gm.L(12.0f));
        this.Q0.setTextSize(gm.L(12.0f));
        int L = gm.L(12.0f);
        this.z1 = L;
        int L2 = gm.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, gm.L(12.0f), gm.L(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w1 = size;
        int L3 = gm.L(388.0f);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = gm.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 << 1)) - (this.z1 << 1);
        gqb gqbVar = this.h;
        if (gqbVar != null && gqbVar.d != null && gqbVar.c == null) {
            gqbVar.a(false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                gqb gqbVar2 = (gqb) obj;
                if (gqbVar2.d != null && gqbVar2.c == null) {
                    gqbVar2.a(false);
                    gqbVar2.b();
                }
            }
        }
        if (this.P != null && this.b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.b0 == null || this.a0) {
                this.b0 = new eqb(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        gqb gqbVar;
        zua zuaVar = new zua((byte) 7);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, zuaVar);
        if (arrayList.isEmpty()) {
            gqbVar = null;
        } else {
            gqbVar = (gqb) arrayList.get(0);
        }
        this.w = gqbVar;
        if (gqbVar != null) {
            long j = gqbVar.f;
        }
    }

    public void setCollage(ArrayList<g6b> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        jqb jqbVar;
        int i = 0;
        while (true) {
            arrayList2 = this.s;
            if (i >= arrayList2.size()) {
                break;
            }
            gqb gqbVar = (gqb) arrayList2.get(i);
            if (gqbVar != null && (jqbVar = gqbVar.c) != null) {
                jqbVar.a();
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
            eqb eqbVar = (eqb) arrayList3.get(i2);
            if (eqbVar != null) {
                eqbVar.a();
            }
            i2++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                g6b g6bVar = arrayList.get(i3);
                if (g6bVar.K) {
                    gqb gqbVar2 = new gqb(this);
                    gqbVar2.a = i3;
                    gqbVar2.b = false;
                    gqbVar2.d = g6bVar.L.getAbsolutePath();
                    gqbVar2.e = g6bVar.h0;
                    gqbVar2.f = g6bVar.X;
                    gqbVar2.i = g6bVar.P;
                    gqbVar2.g = g6bVar.V;
                    gqbVar2.h = g6bVar.W;
                    gqbVar2.a(false);
                    gqbVar2.b();
                    arrayList2.add(gqbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(fqb fqbVar) {
        this.a = fqbVar;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqb.setProgress(long):void");
    }

    public void setRoundNull(boolean z) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setVideoLeft(float f) {
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            return;
        }
        gqbVar.g = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        gqb gqbVar = this.h;
        if (gqbVar == null) {
            return;
        }
        gqbVar.h = f;
        invalidate();
    }
}
