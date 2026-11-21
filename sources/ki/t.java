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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.y5;
public abstract class t extends FrameLayout {
    public final Paint f18971a;
    public final Paint f18972b;
    public final d6 f18973c;
    public final g5 d;
    public xa f18974e;
    public final r[] f18975f;
    public r h;
    public x10 f18976n;
    public Runnable f18977r;

    public t(Context context, h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f18971a = paint;
        Paint paint2 = new Paint(1);
        this.f18972b = paint2;
        nr nrVar = nr.h;
        this.f18973c = new d6(this, 0L, 320L, nrVar);
        this.d = new g5(this, 320L, nrVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.f714c = new Object();
        xaVar.d = new Object();
        this.f18974e = xaVar;
        this.f18975f = r2;
        setWillNotDraw(false);
        paint2.setColor(m6.r1(0.1f, -16777216));
        xa xaVar2 = this.f18974e;
        int w02 = m6.w0(m6.f29378d6, h6Var);
        xaVar2.f713b = w02;
        paint.setColor(w02);
        r[] rVarArr = {new r(this), new r(this)};
    }

    public static void b(n6 n6Var, s sVar, boolean z10) {
        n6Var.a();
        if (sVar.f18916f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.f18915e);
            spannableStringBuilder.setSpan(new y5(sVar.f18916f, 1.4f, n6Var.f37789a.getFontMetricsInt()), 0, 1, 33);
            n6Var.t(spannableStringBuilder, z10, true);
            return;
        }
        n6Var.t(sVar.f18915e, z10, true);
    }

    public final r a(float f10, float f11) {
        Object obj;
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f18975f;
            if (i7 < rVarArr.length) {
                xa xaVar = this.f18974e;
                if (i7 == 0) {
                    obj = xaVar.f714c;
                } else {
                    obj = xaVar.d;
                }
                s sVar = (s) obj;
                if (rVarArr[i7].f18871a.contains(f10, f11) && sVar.f18912a && sVar.f18913b) {
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
        float height = getHeight() - this.f18973c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.f18972b);
        int a10 = this.d.a(this.f18974e.f713b, false);
        Paint paint = this.f18971a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f14 = height;
        String str2 = ((s) this.f18974e.d).f18918i;
        r[] rVarArr = this.f18975f;
        int i13 = 1;
        if (rVarArr[1].f18872b.f34391c < rVarArr[0].f18872b.f34391c) {
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
            xa xaVar = this.f18974e;
            if (i14 == 0) {
                obj = xaVar.f714c;
            } else {
                obj = xaVar.d;
            }
            s sVar = (s) obj;
            d6 d6Var = rVar.f18872b;
            org.telegram.ui.Components.voip.n nVar = rVar.f18884p;
            Paint paint2 = rVar.f18879k;
            d6 d6Var2 = rVar.f18874e;
            d6 d6Var3 = rVar.d;
            d6 d6Var4 = rVar.f18873c;
            org.telegram.ui.Cells.y yVar2 = rVar.f18882n;
            r[] rVarArr2 = rVarArr;
            up upVar = rVar.f18883o;
            float f15 = f14;
            g5 g5Var = rVar.f18876g;
            int i15 = i7;
            n6 n6Var2 = rVar.f18880l;
            int i16 = i14;
            RectF rectF = rVar.f18871a;
            float d = d6Var.d(sVar.f18912a);
            if (!sVar.f18912a) {
                e10 = d6Var4.f34391c;
                n6Var = n6Var2;
            } else {
                xa xaVar2 = this.f18974e;
                n6Var = n6Var2;
                if (((s) xaVar2.d).f18912a && ((s) xaVar2.f714c).f18912a) {
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
            if (!sVar.f18912a) {
                e11 = d6Var3.f34391c;
            } else {
                xa xaVar3 = this.f18974e;
                if (((s) xaVar3.d).f18912a && ((s) xaVar3.f714c).f18912a) {
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
            if (!sVar.f18912a) {
                e12 = d6Var2.f34391c;
            } else {
                xa xaVar4 = this.f18974e;
                if (((s) xaVar4.d).f18912a && ((s) xaVar4.f714c).f18912a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) {
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
            float d2 = rVar.h.d(sVar.f18914c);
            float d10 = rVar.f18877i.d(sVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * rVar.f18878j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(m6.r1(d, rVar.f18875f.a(sVar.f18917g, false)));
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
                if (n6Var3.f37790a0 != r12) {
                    n6Var3.f37790a0 = r12;
                    str = str2;
                    n6Var3.f37792b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
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
            if (rVar.f18881m != m6.r1(0.15f, sVar.h)) {
                int r13 = m6.r1(0.15f, sVar.h);
                rVar.f18881m = r13;
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
        return this.f18973c.f34391c;
    }

    public int getTotalHeight() {
        int i7;
        xa xaVar = this.f18974e;
        boolean z10 = ((s) xaVar.f714c).f18912a;
        if (!z10 && !((s) xaVar.d).f18912a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        if (z10) {
            s sVar = (s) xaVar.d;
            if (sVar.f18912a && ("top".equalsIgnoreCase(sVar.f18918i) || "bottom".equalsIgnoreCase(((s) this.f18974e.d).f18918i))) {
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
            r a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.f18878j.c(true);
                this.h.f18882n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.f18882n.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                r a11 = a(motionEvent.getX(), motionEvent.getY());
                r rVar = this.h;
                if (a11 == rVar && (x10Var = this.f18976n) != null) {
                    if (rVar == this.f18975f[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x10Var.a(Boolean.valueOf(z10));
                }
            }
            this.h.f18878j.c(false);
            this.h.f18882n.setState(new int[0]);
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setOnButtonClickListener(x10 x10Var) {
        this.f18976n = x10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.f18977r = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        r[] rVarArr = this.f18975f;
        r rVar = rVarArr[0];
        if (rVar.f18882n != drawable && rVar.f18883o != drawable) {
            r rVar2 = rVarArr[1];
            if (rVar2.f18882n != drawable && rVar2.f18883o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
