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
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.y5;
public abstract class t extends FrameLayout {
    public final Paint f18974a;
    public final Paint f18975b;
    public final d6 f18976c;
    public final g5 d;
    public xa f18977e;
    public final r[] f18978f;
    public r h;
    public y10 f18979n;
    public Runnable f18980r;

    public t(Context context, h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f18974a = paint;
        Paint paint2 = new Paint(1);
        this.f18975b = paint2;
        nr nrVar = nr.h;
        this.f18976c = new d6(this, 0L, 320L, nrVar);
        this.d = new g5(this, 320L, nrVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.f714c = new Object();
        xaVar.d = new Object();
        this.f18977e = xaVar;
        this.f18978f = r2;
        setWillNotDraw(false);
        paint2.setColor(m6.r1(0.1f, -16777216));
        xa xaVar2 = this.f18977e;
        int w02 = m6.w0(m6.f29381d6, h6Var);
        xaVar2.f713b = w02;
        paint.setColor(w02);
        r[] rVarArr = {new r(this), new r(this)};
    }

    public static void b(n6 n6Var, s sVar, boolean z10) {
        n6Var.a();
        if (sVar.f18919f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.f18918e);
            spannableStringBuilder.setSpan(new y5(sVar.f18919f, 1.4f, n6Var.f37793a.getFontMetricsInt()), 0, 1, 33);
            n6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        n6Var.t(sVar.f18918e, z10, true);
    }

    public final r a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f18978f;
            if (i7 < rVarArr.length) {
                xa xaVar = this.f18977e;
                if (i7 == 0) {
                    obj = xaVar.f714c;
                } else {
                    obj = xaVar.d;
                }
                s sVar = (s) obj;
                if (rVarArr[i7].f18874a.contains(f10, f11) && sVar.f18915a && sVar.f18916b) {
                    return rVarArr[i7];
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
        n6 n6Var;
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
        float height = getHeight() - this.f18976c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f18975b);
        int a10 = this.d.a(this.f18977e.f713b, false);
        Paint paint = this.f18974a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((s) this.f18977e.d).f18921i;
        r[] rVarArr = this.f18978f;
        int i13 = 1;
        if (rVarArr[1].f18875b.f34386c < rVarArr[0].f18875b.f34386c) {
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
            r rVar = rVarArr[i14];
            xa xaVar = this.f18977e;
            if (i14 == 0) {
                obj = xaVar.f714c;
            } else {
                obj = xaVar.d;
            }
            s sVar = (s) obj;
            d6 d6Var = rVar.f18875b;
            org.telegram.ui.Components.voip.n nVar = rVar.f18887p;
            Paint paint2 = rVar.f18882k;
            d6 d6Var2 = rVar.f18877e;
            d6 d6Var3 = rVar.d;
            d6 d6Var4 = rVar.f18876c;
            org.telegram.ui.Cells.y yVar2 = rVar.f18885n;
            r[] rVarArr2 = rVarArr;
            up upVar = rVar.f18886o;
            float f15 = f14;
            g5 g5Var = rVar.f18879g;
            int i15 = i7;
            n6 n6Var2 = rVar.f18883l;
            int i16 = i14;
            RectF rectF = rVar.f18874a;
            float d = d6Var.d(sVar.f18915a);
            if (!sVar.f18915a) {
                e10 = d6Var4.f34386c;
                n6Var = n6Var2;
            } else {
                xa xaVar2 = this.f18977e;
                n6Var = n6Var2;
                if (((s) xaVar2.d).f18915a && ((s) xaVar2.f714c).f18915a) {
                    if (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    f10 = i10;
                } else {
                    f10 = 0.0f;
                }
                e10 = d6Var4.e(false, f10);
            }
            if (!sVar.f18915a) {
                e11 = d6Var3.f34386c;
            } else {
                xa xaVar3 = this.f18977e;
                if (((s) xaVar3.d).f18915a && ((s) xaVar3.f714c).f18915a) {
                    if (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i16 == 0) : i16 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    f11 = i11;
                } else {
                    f11 = 0.0f;
                }
                e11 = d6Var3.e(false, f11);
            }
            if (!sVar.f18915a) {
                e12 = d6Var2.f34386c;
            } else {
                xa xaVar4 = this.f18977e;
                if (((s) xaVar4.d).f18915a && ((s) xaVar4.f714c).f18915a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e12 = d6Var2.e(false, f12);
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12) / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + T1;
            float L = org.telegram.messenger.g0.L(44.0f) / 2.0f;
            float W1 = f15 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + L;
            rectF.set(T12 - T1, W1 - L, T1 + T12, L + W1);
            float d2 = rVar.h.d(sVar.f18917c);
            float d10 = rVar.f18880i.d(sVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * rVar.f18881j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(m6.r1(d, rVar.f18878f.a(sVar.f18920g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f17 = f16 * d;
                int r12 = m6.r1(f17, g5Var.a(sVar.h, false));
                n6 n6Var3 = n6Var;
                if (n6Var3.f37794a0 != r12) {
                    n6Var3.f37794a0 = r12;
                    str = str2;
                    n6Var3.f37796b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                n6Var3.u(m6.r1(f17, g5Var.a(sVar.h, false)));
                n6Var3.p(rectF);
                n6Var3.draw(canvas);
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
                upVar.b(m6.r1(d2 * d, g5Var.a(sVar.h, false)));
                upVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                upVar.draw(canvas);
                canvas.restore();
                f13 = 0.0f;
            } else {
                c10 = 0;
                f13 = 0.0f;
            }
            if (d10 > f13) {
                z10 = false;
                nVar.b(m6.r1(d * d10, g5Var.a(sVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (rVar.f18884m != m6.r1(0.15f, sVar.h)) {
                int r13 = m6.r1(0.15f, sVar.h);
                rVar.f18884m = r13;
                yVar = yVar2;
                i13 = 1;
                m6.H1(yVar, r13, true);
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
            rVarArr = rVarArr2;
            f14 = f15;
            i7 = i15;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.f18976c.f34386c;
    }

    public int getTotalHeight() {
        int i7;
        xa xaVar = this.f18977e;
        boolean z10 = ((s) xaVar.f714c).f18915a;
        if (!z10 && !((s) xaVar.d).f18915a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z10) {
            s sVar = (s) xaVar.d;
            if (sVar.f18915a && ("top".equalsIgnoreCase(sVar.f18921i) || "bottom".equalsIgnoreCase(((s) this.f18977e.d).f18921i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), o10.C(109.0f, 1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y10 y10Var;
        boolean z10;
        if (motionEvent.getAction() == 0) {
            r a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f18881j.c(true);
                this.h.f18885n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18885n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                r a11 = a(motionEvent.getX(), motionEvent.getY());
                r rVar = this.h;
                if (a11 == rVar && (y10Var = this.f18979n) != null) {
                    if (rVar == this.f18978f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y10Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f18881j.c(false);
            this.h.f18885n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(y10 y10Var) {
        this.f18979n = y10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f18980r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        r[] rVarArr = this.f18978f;
        r rVar = rVarArr[0];
        if (rVar.f18885n != drawable && rVar.f18886o != drawable) {
            r rVar2 = rVarArr[1];
            if (rVar2.f18885n != drawable && rVar2.f18886o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
