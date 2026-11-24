package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class wo8 extends FrameLayout {
    public static final int R = 0;
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final tl J;
    public final lm K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final ProfileActivity Q;
    public int a;
    public final Paint b;
    public boolean c;
    public final lm d;
    public int e;
    public int f;
    public final kl h;
    public final kl n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    public wo8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.b = new Paint();
        s33 s33Var = s33.h;
        this.d = new lm(350L, this, s33Var);
        this.h = new kl(this, 350L, s33Var);
        this.n = new kl(this, 350L, s33Var);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new tl(gl.L(20.0f), 13, this, false);
        this.K = new lm(this, 0L, 440L, s33Var);
        new lm(this, 0L, 440L, s33Var);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(da7 da7Var, boolean z) {
        ProfileActivity profileActivity = this.Q;
        if (da7Var != null) {
            this.c = true;
            this.e = da7Var.c(bkb.I.o());
            int d = da7Var.d(bkb.I.o());
            this.f = d;
            profileActivity.c1 = bm2.f(0.25f, this.e, d);
            int i = da7Var.a;
            if (i != 0) {
                this.H = i;
                this.I = bkb.p1(0.45f, i);
            } else {
                this.H = a18.y0(this.e);
                this.I = bkb.p1(0.15f, a18.y0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i2 = bkb.r8;
            if (gl.B(bkb.v0(i2, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else {
                int i3 = (gl.B(bkb.v0(i2, profileActivity.A0)) > 0.2f ? 1 : (gl.B(bkb.v0(i2, profileActivity.A0)) == 0.2f ? 0 : -1));
                wjb wjbVar = profileActivity.A0;
                if (i3 < 0) {
                    this.H = bkb.p1(0.5f, bkb.a(0.02f, 0.25f, bkb.v0(i2, wjbVar)));
                    this.I = bkb.p1(0.35f, bkb.a(0.02f, 0.25f, bkb.v0(i2, profileActivity.A0)));
                } else {
                    this.H = a18.y0(bkb.v0(i2, wjbVar));
                    this.I = bkb.p1(0.15f, a18.y0(bkb.v0(i2, profileActivity.A0)));
                }
            }
        }
        if (!z) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j, boolean z) {
        tl tlVar = this.J;
        boolean z2 = true;
        tlVar.j(j, true);
        tlVar.k(Integer.valueOf(this.H));
        if (!this.L && (j == 0 || j == -1)) {
            z2 = false;
        }
        this.L = z2;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        int i;
        boolean z;
        Canvas canvas2;
        float f;
        vn8 vn8Var;
        float f2;
        a aVar2;
        int i2;
        a aVar3;
        float f3;
        float f4;
        float f5;
        float f6;
        a aVar4;
        float f7;
        a aVar5;
        ml mlVar;
        qw4 qw4Var;
        boolean z2 = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z2) {
            qw4Var = ((d) profileActivity).glassEngine;
            qw4Var.g();
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((d) profileActivity).actionBar;
        if (aVar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        float f8 = currentActionBarHeight + i + profileActivity.Q1 + profileActivity.U1;
        int i3 = (int) ((1.0f - profileActivity.W5) * f8);
        boolean z3 = true;
        if (profileActivity.G5 > 0.0f && i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i3, (int) ((1.0f - profileActivity.G5) * 255.0f));
        }
        if (i3 != 0) {
            int i4 = this.a;
            Paint paint = this.b;
            paint.setColor(i4);
            int a = this.h.a(this.e, false);
            int a2 = this.n.a(this.f, false);
            pl8 pl8Var = profileActivity.a0;
            if (pl8Var != null) {
                int i5 = this.I;
                boolean z4 = this.c;
                f2 = 1.0f;
                if (pl8Var.Q == null || pl8Var.O != i5 || pl8Var.P != z4) {
                    pl8Var.O = i5;
                    pl8Var.P = z4;
                    pl8Var.g();
                }
            } else {
                f2 = 1.0f;
            }
            jr8 jr8Var = profileActivity.c0;
            if (jr8Var != null) {
                jr8Var.d(this.I, this.c);
            }
            ep8 ep8Var = profileActivity.O5;
            if (ep8Var != null) {
                int i6 = this.I;
                boolean z5 = this.c;
                if (ep8Var.i != i6 || ep8Var.j != z5) {
                    ep8Var.i = i6;
                    ep8Var.j = z5;
                    ep8Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.r == a && this.s == a2 && this.w == width) {
                f3 = 2.0f;
            } else {
                this.x = gl.L(96.0f) << 1;
                aVar2 = ((d) profileActivity).actionBar;
                if (aVar2.getOccupyStatusBar()) {
                    i2 = gl.m;
                } else {
                    i2 = 0;
                }
                aVar3 = ((d) profileActivity).actionBar;
                this.y = aVar3.getTranslationY() + ((a.getCurrentActionBarHeight() + i2) - (gl.p * 21.0f));
                this.w = width;
                float f9 = this.y;
                f3 = 2.0f;
                float f10 = this.x;
                this.s = a2;
                this.r = a;
                RadialGradient radialGradient2 = new RadialGradient(width, (f10 / 2.0f) + f9, f10, new int[]{a2, a}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.E = radialGradient2;
                radialGradient2.setLocalMatrix(this.F);
                paint2.setShader(this.E);
            }
            if (profileActivity.J1 == 0) {
                f4 = f2;
            } else {
                f4 = profileActivity.T1;
            }
            float d = this.d.d(this.c) * f4;
            if (d < f2) {
                f5 = 255.0f;
                f6 = f3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i3, paint);
            } else {
                f5 = 255.0f;
                f6 = f3;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f5));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i3, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.L && !this.P) {
                boolean z6 = this.M;
                tl tlVar = this.J;
                if (!z6) {
                    if (tlVar != null) {
                        Drawable drawable = tlVar.f[0];
                        if ((drawable instanceof vl) && (mlVar = ((vl) drawable).k) != null && mlVar.C()) {
                            this.M = true;
                        }
                    }
                    z3 = false;
                }
                float d2 = this.K.d(z3);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i3);
                    aVar4 = ((d) profileActivity).actionBar;
                    if (aVar4.getOccupyStatusBar()) {
                        f7 = gl.m;
                    } else {
                        f7 = 0.0f;
                    }
                    aVar5 = ((d) profileActivity).actionBar;
                    float z7 = oo1.z(aVar5.getHeight(), f7, f6, profileActivity.d2() + f7);
                    int measuredWidth = getMeasuredWidth();
                    float C1 = profileActivity.C1();
                    oc6 oc6Var = profileActivity.Y;
                    float[][] fArr = ana.a;
                    RectF rectF = gl.P;
                    rectF.set(oc6Var.getX(), oc6Var.getY(), (oc6Var.getScaleX() * oc6Var.getWidth()) + oc6Var.getX(), (oc6Var.getScaleY() * oc6Var.getHeight()) + oc6Var.getY());
                    canvas2 = canvas;
                    ana.c(canvas2, tlVar, measuredWidth, z7, C1, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            sy1 sy1Var = profileActivity.m5;
            if (sy1Var != null) {
                a actionBar = ((d) sy1Var).getActionBar();
                r6 r6Var = actionBar.F;
                View view = (View) actionBar.getParent();
                if (r6Var != null && view != null) {
                    RectF rectF2 = this.O;
                    if (zec.c(r6Var, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) ((f2 - profileActivity.T1) * f5), 31);
                        r6Var.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f = 0.0f;
        }
        if (z) {
            canvas2.restore();
        }
        if (profileActivity.W5 > f) {
            float f11 = i3;
            if (f11 < f8 && (vn8Var = profileActivity.O) != null && vn8Var.isAttachedToWindow()) {
                float y = (profileActivity.O.getY() + profileActivity.a.getY()) - profileActivity.a6;
                if (y > f11) {
                    int v0 = bkb.v0(bkb.Z6, profileActivity.A0);
                    Paint paint3 = this.N;
                    paint3.setColor(v0);
                    canvas.drawRect(0.0f, f11, getMeasuredWidth(), Math.min(f8, y), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i) {
        if (i != this.a) {
            this.a = i;
            this.b.setColor(i);
            invalidate();
            if (!this.c) {
                this.Q.c1 = this.a;
            }
        }
    }
}
