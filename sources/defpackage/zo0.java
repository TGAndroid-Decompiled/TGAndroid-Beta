package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public abstract class zo0 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final lm c;
    public final kl d;
    public kp e;
    public final xo0[] f;
    public xo0 h;
    public p8c n;
    public Runnable r;

    public zo0(Context context, wjb wjbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        s33 s33Var = s33.h;
        this.c = new lm(this, 0L, 320L, s33Var);
        this.d = new kl(this, 320L, s33Var, 0);
        kp kpVar = new kp((byte) 2, false);
        kpVar.c = new Object();
        kpVar.d = new Object();
        this.e = kpVar;
        this.f = r9;
        setWillNotDraw(false);
        paint2.setColor(bkb.p1(0.1f, -16777216));
        kp kpVar2 = this.e;
        int v0 = bkb.v0(bkb.c6, wjbVar);
        kpVar2.b = v0;
        paint.setColor(v0);
        xo0[] xo0VarArr = {new xo0(this), new xo0(this)};
    }

    public static void b(gn gnVar, yo0 yo0Var, boolean z) {
        gnVar.a();
        if (yo0Var.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) yo0Var.e);
            spannableStringBuilder.setSpan(new gm(yo0Var.f, 1.4f, gnVar.a.getFontMetricsInt()), 0, 1, 33);
            gnVar.t(spannableStringBuilder, z, true);
            return;
        }
        gnVar.t(yo0Var.e, z, true);
    }

    public final xo0 a(float f, float f2) {
        Object obj;
        int i = 0;
        while (true) {
            xo0[] xo0VarArr = this.f;
            if (i < xo0VarArr.length) {
                kp kpVar = this.e;
                if (i == 0) {
                    obj = kpVar.c;
                } else {
                    obj = kpVar.d;
                }
                yo0 yo0Var = (yo0) obj;
                if (xo0VarArr[i].a.contains(f, f2) && yo0Var.a && yo0Var.b) {
                    return xo0VarArr[i];
                }
                i++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        Object obj;
        wd1 wd1Var;
        float f;
        float e;
        int i2;
        ih2 ih2Var;
        float f2;
        float e2;
        int i3;
        float f3;
        float e3;
        float f4;
        zo0 zo0Var;
        ff0 ff0Var;
        int i4;
        int i5;
        zo0 zo0Var2 = this;
        float height = zo0Var2.getHeight() - zo0Var2.c.e(false, zo0Var2.getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, zo0Var2.getWidth(), height, zo0Var2.b);
        int a = zo0Var2.d.a(zo0Var2.e.b, false);
        Paint paint = zo0Var2.a;
        paint.setColor(a);
        canvas.drawRect(0.0f, height, zo0Var2.getWidth(), zo0Var2.getHeight(), paint);
        float f5 = height;
        String str = ((yo0) zo0Var2.e.d).i;
        xo0[] xo0VarArr = zo0Var2.f;
        int i6 = 1;
        if (xo0VarArr[1].b.c < xo0VarArr[0].b.c) {
            i = 1;
        } else {
            i = 0;
        }
        int i7 = i;
        while (true) {
            if (i != 0) {
                if (i7 < 0) {
                    return;
                }
            } else if (i7 > i6) {
                return;
            }
            xo0 xo0Var = xo0VarArr[i7];
            kp kpVar = zo0Var2.e;
            if (i7 == 0) {
                obj = kpVar.c;
            } else {
                obj = kpVar.d;
            }
            yo0 yo0Var = (yo0) obj;
            lm lmVar = xo0Var.b;
            wd1 wd1Var2 = xo0Var.p;
            Paint paint2 = xo0Var.k;
            ff0 ff0Var2 = xo0Var.n;
            ih2 ih2Var2 = xo0Var.o;
            kl klVar = xo0Var.g;
            gn gnVar = xo0Var.l;
            xo0[] xo0VarArr2 = xo0VarArr;
            RectF rectF = xo0Var.a;
            float f6 = f5;
            float d = lmVar.d(yo0Var.a);
            boolean z = yo0Var.a;
            int i8 = i;
            lm lmVar2 = xo0Var.c;
            int i9 = i7;
            if (!z) {
                e = lmVar2.c;
                wd1Var = wd1Var2;
            } else {
                kp kpVar2 = zo0Var2.e;
                wd1Var = wd1Var2;
                if (((yo0) kpVar2.d).a && ((yo0) kpVar2.c).a) {
                    if (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i9 == 0) : i9 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    f = i2;
                } else {
                    f = 0.0f;
                }
                e = lmVar2.e(false, f);
            }
            boolean z2 = yo0Var.a;
            lm lmVar3 = xo0Var.d;
            if (!z2) {
                e2 = lmVar3.c;
                ih2Var = ih2Var2;
            } else {
                kp kpVar3 = zo0Var2.e;
                ih2Var = ih2Var2;
                if (((yo0) kpVar3.d).a && ((yo0) kpVar3.c).a) {
                    if (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i9 == 0) : i9 == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    f2 = i3;
                } else {
                    f2 = 0.0f;
                }
                e2 = lmVar3.e(false, f2);
            }
            boolean z3 = yo0Var.a;
            lm lmVar4 = xo0Var.e;
            if (!z3) {
                e3 = lmVar4.c;
            } else {
                kp kpVar4 = zo0Var2.e;
                if (((yo0) kpVar4.d).a && ((yo0) kpVar4.c).a && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                e3 = lmVar4.e(false, f3);
            }
            float R1 = gl.R1((getWidth() - gl.L(26.0f)) / 2.0f, getWidth() - gl.L(16.0f), e3) / 2.0f;
            float R12 = gl.R1(gl.L(8.0f), ((getWidth() - gl.L(26.0f)) / 2.0f) + gl.L(18.0f), e) + R1;
            float L = gl.L(44.0f) / 2.0f;
            float U1 = f6 + gl.U1(e2, gl.L(7.0f), gl.L(58.0f)) + L;
            rectF.set(R12 - R1, U1 - L, R1 + R12, L + U1);
            float d2 = xo0Var.h.d(yo0Var.c);
            float d3 = xo0Var.i.d(yo0Var.d);
            canvas.save();
            float R13 = gl.R1(0.7f, 1.0f, d) * xo0Var.j.a(0.02f);
            canvas.scale(R13, R13, R12, U1);
            paint2.setColor(bkb.p1(d, xo0Var.f.a(yo0Var.g, false)));
            canvas.drawRoundRect(rectF, gl.L(9.0f), gl.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f7 = 1.0f - d2;
                float R14 = gl.R1(0.75f, 1.0f, f7);
                canvas.scale(R14, R14, R12, U1);
                canvas.translate(0.0f, gl.L(-10.0f) * d2);
                float f8 = f7 * d;
                int p1 = bkb.p1(f8, klVar.a(yo0Var.h, false));
                if (gnVar.a0 != p1) {
                    gnVar.a0 = p1;
                    gnVar.b0 = new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN);
                }
                gnVar.u(bkb.p1(f8, klVar.a(yo0Var.h, false)));
                gnVar.p(rectF);
                gnVar.draw(canvas);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                canvas.save();
                float R15 = gl.R1(0.75f, 1.0f, d2);
                canvas.scale(R15, R15, R12, U1);
                canvas.translate(0.0f, (1.0f - d2) * gl.L(10.0f));
                ih2 ih2Var3 = ih2Var;
                ih2Var3.b(bkb.p1(d2 * d, klVar.a(yo0Var.h, false)));
                ih2Var3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                ih2Var3.draw(canvas);
                canvas.restore();
                f4 = 0.0f;
            } else {
                f4 = 0.0f;
            }
            if (d3 > f4) {
                int p12 = bkb.p1(d * d3, klVar.a(yo0Var.h, false));
                wd1 wd1Var3 = wd1Var;
                wd1Var3.b(p12, 64);
                zo0Var = this;
                wd1Var3.a(gl.L(8.0f), canvas, rectF, zo0Var);
            } else {
                zo0Var = this;
            }
            if (xo0Var.m != bkb.p1(0.15f, yo0Var.h)) {
                int p13 = bkb.p1(0.15f, yo0Var.h);
                xo0Var.m = p13;
                ff0Var = ff0Var2;
                i4 = 1;
                bkb.F1(ff0Var, p13, true);
            } else {
                ff0Var = ff0Var2;
                i4 = 1;
            }
            ff0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            ff0Var.draw(canvas);
            canvas.restore();
            if (i8 != 0) {
                i5 = -1;
            } else {
                i5 = i4;
            }
            i7 = i9 + i5;
            zo0Var2 = zo0Var;
            i6 = i4;
            xo0VarArr = xo0VarArr2;
            f5 = f6;
            i = i8;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        int i;
        kp kpVar = this.e;
        boolean z = ((yo0) kpVar.c).a;
        if (!z && !((yo0) kpVar.d).a) {
            i = 0;
        } else {
            i = 1;
        }
        if (z) {
            yo0 yo0Var = (yo0) kpVar.d;
            if (yo0Var.a && ("top".equalsIgnoreCase(yo0Var.i) || "bottom".equalsIgnoreCase(((yo0) this.e.d).i))) {
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return gl.L(58.0f);
        }
        return gl.L(109.0f);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ug8.E(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p8c p8cVar;
        boolean z;
        if (motionEvent.getAction() == 0) {
            xo0 a = a(motionEvent.getX(), motionEvent.getY());
            this.h = a;
            if (a != null) {
                a.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                xo0 a2 = a(motionEvent.getX(), motionEvent.getY());
                xo0 xo0Var = this.h;
                if (a2 == xo0Var && (p8cVar = this.n) != null) {
                    if (xo0Var == this.f[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    p8cVar.a(Boolean.valueOf(z));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(p8c p8cVar) {
        this.n = p8cVar;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        xo0[] xo0VarArr = this.f;
        xo0 xo0Var = xo0VarArr[0];
        if (xo0Var.n != drawable && xo0Var.o != drawable) {
            xo0 xo0Var2 = xo0VarArr[1];
            if (xo0Var2.n != drawable && xo0Var2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
