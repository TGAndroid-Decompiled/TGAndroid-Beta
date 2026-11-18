package ki;

import a8.xa;
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
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.x5;
public abstract class u extends FrameLayout {
    public final Paint f18964a;
    public final Paint f18965b;
    public final c6 f18966c;
    public final f5 d;
    public xa f18967e;
    public final s[] f18968f;
    public s h;
    public x10 f18969n;
    public Runnable f18970r;

    public u(Context context, i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f18964a = paint;
        Paint paint2 = new Paint(1);
        this.f18965b = paint2;
        lr lrVar = lr.h;
        this.f18966c = new c6(this, 0L, 320L, lrVar);
        this.d = new f5(this, 320L, lrVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.f714c = new Object();
        xaVar.d = new Object();
        this.f18967e = xaVar;
        this.f18968f = r2;
        setWillNotDraw(false);
        paint2.setColor(n6.r1(0.1f, -16777216));
        xa xaVar2 = this.f18967e;
        int w02 = n6.w0(n6.f29396d6, i6Var);
        xaVar2.f713b = w02;
        paint.setColor(w02);
        s[] sVarArr = {new s(this), new s(this)};
    }

    public static void b(m6 m6Var, t tVar, boolean z10) {
        m6Var.a();
        if (tVar.f18909f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) tVar.f18908e);
            spannableStringBuilder.setSpan(new x5(tVar.f18909f, 1.4f, m6Var.f37375a.getFontMetricsInt()), 0, 1, 33);
            m6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        m6Var.t(tVar.f18908e, z10, true);
    }

    public final s a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            s[] sVarArr = this.f18968f;
            if (i7 < sVarArr.length) {
                xa xaVar = this.f18967e;
                if (i7 == 0) {
                    obj = xaVar.f714c;
                } else {
                    obj = xaVar.d;
                }
                t tVar = (t) obj;
                if (sVarArr[i7].f18864a.contains(f10, f11) && tVar.f18905a && tVar.f18906b) {
                    return sVarArr[i7];
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        Object obj;
        m6 m6Var;
        float f10;
        float e10;
        int i10;
        float f11;
        float e11;
        int i11;
        float f12;
        float e12;
        String str;
        char c10;
        float f13;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        int i12;
        float height = getHeight() - this.f18966c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f18965b);
        int a10 = this.d.a(this.f18967e.f713b, false);
        Paint paint = this.f18964a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((t) this.f18967e.d).f18911i;
        s[] sVarArr = this.f18968f;
        int i13 = 1;
        if (sVarArr[1].f18865b.f33892c < sVarArr[0].f18865b.f33892c) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i14 = i7;
        while (true) {
            if (i7 != 0) {
                if (i14 < 0) {
                    return;
                }
            } else if (i14 > i13) {
                return;
            }
            s sVar = sVarArr[i14];
            xa xaVar = this.f18967e;
            if (i14 == 0) {
                obj = xaVar.f714c;
            } else {
                obj = xaVar.d;
            }
            t tVar = (t) obj;
            c6 c6Var = sVar.f18865b;
            org.telegram.ui.Components.voip.n nVar = sVar.f18877p;
            Paint paint2 = sVar.f18872k;
            c6 c6Var2 = sVar.f18867e;
            c6 c6Var3 = sVar.d;
            c6 c6Var4 = sVar.f18866c;
            org.telegram.ui.Cells.y yVar2 = sVar.f18875n;
            s[] sVarArr2 = sVarArr;
            sp spVar = sVar.f18876o;
            float f15 = f14;
            f5 f5Var = sVar.f18869g;
            int i15 = i7;
            m6 m6Var2 = sVar.f18873l;
            int i16 = i14;
            RectF rectF = sVar.f18864a;
            float d = c6Var.d(tVar.f18905a);
            if (!tVar.f18905a) {
                e10 = c6Var4.f33892c;
                m6Var = m6Var2;
            } else {
                xa xaVar2 = this.f18967e;
                m6Var = m6Var2;
                if (((t) xaVar2.d).f18905a && ((t) xaVar2.f714c).f18905a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                e10 = c6Var4.e(false, f10);
            }
            if (!tVar.f18905a) {
                e11 = c6Var3.f33892c;
            } else {
                xa xaVar3 = this.f18967e;
                if (((t) xaVar3.d).f18905a && ((t) xaVar3.f714c).f18905a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                e11 = c6Var3.e(false, f11);
            }
            if (!tVar.f18905a) {
                e12 = c6Var2.f33892c;
            } else {
                xa xaVar4 = this.f18967e;
                if (((t) xaVar4.d).f18905a && ((t) xaVar4.f714c).f18905a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e12 = c6Var2.e(false, f12);
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12) / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + T1;
            float L = org.telegram.messenger.g0.L(44.0f) / 2.0f;
            float W1 = f15 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d2 = sVar.h.d(tVar.f18907c);
            float d10 = sVar.f18870i.d(tVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * sVar.f18871j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(n6.r1(d, sVar.f18868f.a(tVar.f18910g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f17 = f16 * d;
                int r12 = n6.r1(f17, f5Var.a(tVar.h, false));
                m6 m6Var3 = m6Var;
                if (m6Var3.f37376a0 != r12) {
                    m6Var3.f37376a0 = r12;
                    str = str2;
                    m6Var3.f37378b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                m6Var3.u(n6.r1(f17, f5Var.a(tVar.h, false)));
                m6Var3.p(rectF);
                m6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d2 > 0.0f) {
                canvas.save();
                c10 = 0;
                float T15 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d2);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d2) * org.telegram.messenger.g0.L(10.0f));
                spVar.b(n6.r1(d2 * d, f5Var.a(tVar.h, false)));
                spVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                spVar.draw(canvas);
                canvas.restore();
                f13 = 0.0f;
            } else {
                c10 = 0;
                f13 = 0.0f;
            }
            if (d10 > f13) {
                z10 = false;
                nVar.b(n6.r1(d * d10, f5Var.a(tVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (sVar.f18874m != n6.r1(0.15f, tVar.h)) {
                int r13 = n6.r1(0.15f, tVar.h);
                sVar.f18874m = r13;
                yVar = yVar2;
                i13 = 1;
                n6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i13 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            if (i15 != 0) {
                i12 = -1;
            } else {
                i12 = i13;
            }
            i14 = i16 + i12;
            sVarArr = sVarArr2;
            f14 = f15;
            i7 = i15;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f18966c.f33892c;
    }

    public int getTotalHeight() {
        int i7;
        xa xaVar = this.f18967e;
        boolean z10 = ((t) xaVar.f714c).f18905a;
        if (!z10 && !((t) xaVar.d).f18905a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z10) {
            t tVar = (t) xaVar.d;
            if (tVar.f18905a && ("top".equalsIgnoreCase(tVar.f18911i) || "bottom".equalsIgnoreCase(((t) this.f18967e.d).f18911i))) {
                i7++;
            }
        }
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        return org.telegram.messenger.g0.L(109.0f);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), n10.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x10 x10Var;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            s a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f18871j.c(true);
                this.h.f18875n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18875n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                s a11 = a(motionEvent.getX(), motionEvent.getY());
                s sVar = this.h;
                if (a11 == sVar && (x10Var = this.f18969n) != null) {
                    if (sVar == this.f18968f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x10Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f18871j.c(false);
            this.h.f18875n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(x10 x10Var) {
        this.f18969n = x10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f18970r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        s[] sVarArr = this.f18968f;
        s sVar = sVarArr[0];
        if (sVar.f18875n != drawable && sVar.f18876o != drawable) {
            s sVar2 = sVarArr[1];
            if (sVar2.f18875n != drawable && sVar2.f18876o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
