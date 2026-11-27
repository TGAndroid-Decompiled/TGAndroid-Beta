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
    public final mm c;
    public final ll d;
    public lp e;
    public final xo0[] f;
    public xo0 h;
    public pcc n;
    public Runnable r;

    public zo0(Context context, vnb vnbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        k43 k43Var = k43.h;
        this.c = new mm(this, 0L, 320L, k43Var);
        this.d = new ll(this, 320L, k43Var, 0);
        lp lpVar = new lp((byte) 2, false);
        lpVar.c = new Object();
        lpVar.d = new Object();
        this.e = lpVar;
        this.f = r9;
        setWillNotDraw(false);
        paint2.setColor(aob.p1(0.1f, -16777216));
        lp lpVar2 = this.e;
        int v0 = aob.v0(aob.d6, vnbVar);
        lpVar2.b = v0;
        paint.setColor(v0);
        xo0[] xo0VarArr = {new xo0(this), new xo0(this)};
    }

    public static void b(hn hnVar, yo0 yo0Var, boolean z) {
        hnVar.a();
        if (yo0Var.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) yo0Var.e);
            spannableStringBuilder.setSpan(new hm(yo0Var.f, 1.4f, hnVar.a.getFontMetricsInt()), 0, 1, 33);
            hnVar.t(spannableStringBuilder, z, true);
            return;
        }
        hnVar.t(yo0Var.e, z, true);
    }

    public final xo0 a(float f, float f2) {
        Object obj;
        int i = 0;
        while (true) {
            xo0[] xo0VarArr = this.f;
            if (i < xo0VarArr.length) {
                lp lpVar = this.e;
                if (i == 0) {
                    obj = lpVar.c;
                } else {
                    obj = lpVar.d;
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
        fe1 fe1Var;
        float f;
        float e;
        int i2;
        di2 di2Var;
        float f2;
        float e2;
        int i3;
        float f3;
        float e3;
        float f4;
        zo0 zo0Var;
        hf0 hf0Var;
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
            lp lpVar = zo0Var2.e;
            if (i7 == 0) {
                obj = lpVar.c;
            } else {
                obj = lpVar.d;
            }
            yo0 yo0Var = (yo0) obj;
            mm mmVar = xo0Var.b;
            fe1 fe1Var2 = xo0Var.p;
            Paint paint2 = xo0Var.k;
            hf0 hf0Var2 = xo0Var.n;
            di2 di2Var2 = xo0Var.o;
            ll llVar = xo0Var.g;
            hn hnVar = xo0Var.l;
            xo0[] xo0VarArr2 = xo0VarArr;
            RectF rectF = xo0Var.a;
            float f6 = f5;
            float d = mmVar.d(yo0Var.a);
            boolean z = yo0Var.a;
            int i8 = i;
            mm mmVar2 = xo0Var.c;
            int i9 = i7;
            if (!z) {
                e = mmVar2.c;
                fe1Var = fe1Var2;
            } else {
                lp lpVar2 = zo0Var2.e;
                fe1Var = fe1Var2;
                if (((yo0) lpVar2.d).a && ((yo0) lpVar2.c).a) {
                    if (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i9 == 0) : i9 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    f = i2;
                } else {
                    f = 0.0f;
                }
                e = mmVar2.e(false, f);
            }
            boolean z2 = yo0Var.a;
            mm mmVar3 = xo0Var.d;
            if (!z2) {
                e2 = mmVar3.c;
                di2Var = di2Var2;
            } else {
                lp lpVar3 = zo0Var2.e;
                di2Var = di2Var2;
                if (((yo0) lpVar3.d).a && ((yo0) lpVar3.c).a) {
                    if (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i9 == 0) : i9 == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    f2 = i3;
                } else {
                    f2 = 0.0f;
                }
                e2 = mmVar3.e(false, f2);
            }
            boolean z3 = yo0Var.a;
            mm mmVar4 = xo0Var.e;
            if (!z3) {
                e3 = mmVar4.c;
            } else {
                lp lpVar4 = zo0Var2.e;
                if (((yo0) lpVar4.d).a && ((yo0) lpVar4.c).a && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                e3 = mmVar4.e(false, f3);
            }
            float R1 = hl.R1((getWidth() - hl.L(26.0f)) / 2.0f, getWidth() - hl.L(16.0f), e3) / 2.0f;
            float R12 = hl.R1(hl.L(8.0f), ((getWidth() - hl.L(26.0f)) / 2.0f) + hl.L(18.0f), e) + R1;
            float L = hl.L(44.0f) / 2.0f;
            float U1 = f6 + hl.U1(e2, hl.L(7.0f), hl.L(58.0f)) + L;
            rectF.set(R12 - R1, U1 - L, R1 + R12, L + U1);
            float d2 = xo0Var.h.d(yo0Var.c);
            float d3 = xo0Var.i.d(yo0Var.d);
            canvas.save();
            float R13 = hl.R1(0.7f, 1.0f, d) * xo0Var.j.a(0.02f);
            canvas.scale(R13, R13, R12, U1);
            paint2.setColor(aob.p1(d, xo0Var.f.a(yo0Var.g, false)));
            canvas.drawRoundRect(rectF, hl.L(9.0f), hl.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f7 = 1.0f - d2;
                float R14 = hl.R1(0.75f, 1.0f, f7);
                canvas.scale(R14, R14, R12, U1);
                canvas.translate(0.0f, hl.L(-10.0f) * d2);
                float f8 = f7 * d;
                int p1 = aob.p1(f8, llVar.a(yo0Var.h, false));
                if (hnVar.a0 != p1) {
                    hnVar.a0 = p1;
                    hnVar.b0 = new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN);
                }
                hnVar.u(aob.p1(f8, llVar.a(yo0Var.h, false)));
                hnVar.p(rectF);
                hnVar.draw(canvas);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                canvas.save();
                float R15 = hl.R1(0.75f, 1.0f, d2);
                canvas.scale(R15, R15, R12, U1);
                canvas.translate(0.0f, (1.0f - d2) * hl.L(10.0f));
                di2 di2Var3 = di2Var;
                di2Var3.b(aob.p1(d2 * d, llVar.a(yo0Var.h, false)));
                di2Var3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                di2Var3.draw(canvas);
                canvas.restore();
                f4 = 0.0f;
            } else {
                f4 = 0.0f;
            }
            if (d3 > f4) {
                int p12 = aob.p1(d * d3, llVar.a(yo0Var.h, false));
                fe1 fe1Var3 = fe1Var;
                fe1Var3.b(p12, 64);
                zo0Var = this;
                fe1Var3.a(hl.L(8.0f), canvas, rectF, zo0Var);
            } else {
                zo0Var = this;
            }
            if (xo0Var.m != aob.p1(0.15f, yo0Var.h)) {
                int p13 = aob.p1(0.15f, yo0Var.h);
                xo0Var.m = p13;
                hf0Var = hf0Var2;
                i4 = 1;
                aob.F1(hf0Var, p13, true);
            } else {
                hf0Var = hf0Var2;
                i4 = 1;
            }
            hf0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            hf0Var.draw(canvas);
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
        lp lpVar = this.e;
        boolean z = ((yo0) lpVar.c).a;
        if (!z && !((yo0) lpVar.d).a) {
            i = 0;
        } else {
            i = 1;
        }
        if (z) {
            yo0 yo0Var = (yo0) lpVar.d;
            if (yo0Var.a && ("top".equalsIgnoreCase(yo0Var.i) || "bottom".equalsIgnoreCase(((yo0) this.e.d).i))) {
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return hl.L(58.0f);
        }
        return hl.L(109.0f);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ik8.E(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pcc pccVar;
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
                if (a2 == xo0Var && (pccVar = this.n) != null) {
                    if (xo0Var == this.f[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pccVar.a(Boolean.valueOf(z));
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

    public void setOnButtonClickListener(pcc pccVar) {
        this.n = pccVar;
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
