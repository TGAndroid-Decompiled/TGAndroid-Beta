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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class is8 extends FrameLayout {
    public static final int R = 0;
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final ul J;
    public final mm K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final ProfileActivity Q;
    public int a;
    public final Paint b;
    public boolean c;
    public final mm d;
    public int e;
    public int f;
    public final ll h;
    public final ll n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    public is8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.b = new Paint();
        k43 k43Var = k43.h;
        this.d = new mm(350L, this, k43Var);
        this.h = new ll(this, 350L, k43Var);
        this.n = new ll(this, 350L, k43Var);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new ul(hl.L(20.0f), 13, this, false);
        this.K = new mm(this, 0L, 440L, k43Var);
        new mm(this, 0L, 440L, k43Var);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(kc7 kc7Var, boolean z) {
        ProfileActivity profileActivity = this.Q;
        if (kc7Var != null) {
            this.c = true;
            this.e = kc7Var.c(aob.I.o());
            int d = kc7Var.d(aob.I.o());
            this.f = d;
            profileActivity.c1 = vm2.f(0.25f, this.e, d);
            int i = kc7Var.a;
            if (i != 0) {
                this.H = i;
                this.I = aob.p1(0.45f, i);
            } else {
                this.H = h48.z0(this.e);
                this.I = aob.p1(0.15f, h48.z0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i2 = aob.s8;
            if (hl.B(aob.v0(i2, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else {
                int i3 = (hl.B(aob.v0(i2, profileActivity.A0)) > 0.2f ? 1 : (hl.B(aob.v0(i2, profileActivity.A0)) == 0.2f ? 0 : -1));
                vnb vnbVar = profileActivity.A0;
                if (i3 < 0) {
                    this.H = aob.p1(0.5f, aob.a(0.02f, 0.25f, aob.v0(i2, vnbVar)));
                    this.I = aob.p1(0.35f, aob.a(0.02f, 0.25f, aob.v0(i2, profileActivity.A0)));
                } else {
                    this.H = h48.z0(aob.v0(i2, vnbVar));
                    this.I = aob.p1(0.15f, h48.z0(aob.v0(i2, profileActivity.A0)));
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
        ul ulVar = this.J;
        boolean z2 = true;
        ulVar.j(j, true);
        ulVar.k(Integer.valueOf(this.H));
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
        gr8 gr8Var;
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
        nl nlVar;
        vy4 vy4Var;
        boolean z2 = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z2) {
            vy4Var = ((e) profileActivity).glassEngine;
            vy4Var.g();
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((e) profileActivity).actionBar;
        if (aVar.getOccupyStatusBar()) {
            i = hl.m;
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
            ap8 ap8Var = profileActivity.a0;
            if (ap8Var != null) {
                int i5 = this.I;
                boolean z4 = this.c;
                f2 = 1.0f;
                if (ap8Var.Q == null || ap8Var.O != i5 || ap8Var.P != z4) {
                    ap8Var.O = i5;
                    ap8Var.P = z4;
                    ap8Var.g();
                }
            } else {
                f2 = 1.0f;
            }
            tu8 tu8Var = profileActivity.c0;
            if (tu8Var != null) {
                tu8Var.d(this.I, this.c);
            }
            qs8 qs8Var = profileActivity.O5;
            if (qs8Var != null) {
                int i6 = this.I;
                boolean z5 = this.c;
                if (qs8Var.i != i6 || qs8Var.j != z5) {
                    qs8Var.i = i6;
                    qs8Var.j = z5;
                    qs8Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.r == a && this.s == a2 && this.w == width) {
                f3 = 2.0f;
            } else {
                this.x = hl.L(96.0f) << 1;
                aVar2 = ((e) profileActivity).actionBar;
                if (aVar2.getOccupyStatusBar()) {
                    i2 = hl.m;
                } else {
                    i2 = 0;
                }
                aVar3 = ((e) profileActivity).actionBar;
                this.y = aVar3.getTranslationY() + ((a.getCurrentActionBarHeight() + i2) - (hl.p * 21.0f));
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
                ul ulVar = this.J;
                if (!z6) {
                    if (ulVar != null) {
                        Drawable drawable = ulVar.f[0];
                        if ((drawable instanceof wl) && (nlVar = ((wl) drawable).k) != null && nlVar.C()) {
                            this.M = true;
                        }
                    }
                    z3 = false;
                }
                float d2 = this.K.d(z3);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i3);
                    aVar4 = ((e) profileActivity).actionBar;
                    if (aVar4.getOccupyStatusBar()) {
                        f7 = hl.m;
                    } else {
                        f7 = 0.0f;
                    }
                    aVar5 = ((e) profileActivity).actionBar;
                    float z7 = bp1.z(aVar5.getHeight(), f7, f6, profileActivity.e2() + f7);
                    int measuredWidth = getMeasuredWidth();
                    float D1 = profileActivity.D1();
                    d26 d26Var = profileActivity.Y;
                    float[][] fArr = xqa.a;
                    RectF rectF = hl.P;
                    rectF.set(d26Var.getX(), d26Var.getY(), (d26Var.getScaleX() * d26Var.getWidth()) + d26Var.getX(), (d26Var.getScaleY() * d26Var.getHeight()) + d26Var.getY());
                    canvas2 = canvas;
                    xqa.c(canvas2, ulVar, measuredWidth, z7, D1, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            kz1 kz1Var = profileActivity.m5;
            if (kz1Var != null) {
                a actionBar = ((e) kz1Var).getActionBar();
                s6 s6Var = actionBar.F;
                View view = (View) actionBar.getParent();
                if (s6Var != null && view != null) {
                    RectF rectF2 = this.O;
                    if (yic.c(s6Var, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, s6Var.getMeasuredWidth(), s6Var.getMeasuredHeight(), (int) ((f2 - profileActivity.T1) * f5), 31);
                        s6Var.draw(canvas2);
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
            if (f11 < f8 && (gr8Var = profileActivity.O) != null && gr8Var.isAttachedToWindow()) {
                float y = (profileActivity.O.getY() + profileActivity.a.getY()) - profileActivity.a6;
                if (y > f11) {
                    int v0 = aob.v0(aob.a7, profileActivity.A0);
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
