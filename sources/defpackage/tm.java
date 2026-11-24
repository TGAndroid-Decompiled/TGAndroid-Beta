package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;
public class tm extends Drawable implements dn {
    public boolean E;
    public yxa F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final b1 M;
    public boolean a;
    public final byte b;
    public final OvershootInterpolator c;
    public final ln d;
    public final ln e;
    public final Drawable[] f;
    public View h;
    public vz9 n;
    public final boolean r;
    public final int s;
    public int w;
    public boolean x;
    public Integer y;

    public tm(int i, int i2, View view, boolean z) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        d53 d53Var = d53.g;
        ln lnVar = new ln(300L, (View) null, d53Var);
        this.d = lnVar;
        ln lnVar2 = new ln(300L, (View) null, d53Var);
        this.e = lnVar2;
        this.f = new Drawable[2];
        this.w = 255;
        this.L = new Rect();
        this.M = new b1(this, (byte) 17);
        lnVar.a = view;
        this.h = view;
        lnVar2.a = view;
        this.s = i;
        this.b = i2;
        this.r = z;
    }

    public final void a() {
        if (!this.x) {
            this.x = true;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof vm) {
                ((vm) drawable).a(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof vm) {
                ((vm) drawable2).a(this);
            }
        }
    }

    public final void b() {
        if (this.x) {
            this.x = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof vm) {
                ((vm) drawable).n(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof vm) {
                ((vm) drawable2).n(this);
            }
        }
    }

    public final Drawable c() {
        return this.f[0];
    }

    public final boolean d() {
        if (this.f[0] != null) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int intrinsicHeight;
        int intValue;
        float e = this.d.e(false, 1.0f);
        Rect bounds = getBounds();
        Rect rect = this.L;
        rect.set(bounds);
        rect.offset(this.J, this.K);
        float d = this.e.d(this.E);
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        b1 b1Var = this.M;
        if (i > 0) {
            yxa yxaVar = this.F;
            yxaVar.c.set(rect);
            yxaVar.e();
            this.F.d();
            yxa yxaVar2 = this.F;
            Integer num = this.G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            yxaVar2.a(canvas, cmb.p1(d, intValue));
            fi2.d().a(15, b1Var);
        } else {
            fi2.d().g(b1Var);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i2 = this.s;
        if (drawable != null && e < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e) * this.w));
            if (drawableArr[1].getIntrinsicWidth() < 0) {
                intrinsicWidth2 = i2;
            } else {
                intrinsicWidth2 = drawableArr[1].getIntrinsicWidth();
            }
            if (drawableArr[1].getIntrinsicHeight() < 0) {
                intrinsicHeight = i2;
            } else {
                intrinsicHeight = drawableArr[1].getIntrinsicHeight();
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof vm) {
                drawable2.setBounds(rect);
            } else if (this.a) {
                int i3 = intrinsicWidth2 / 2;
                int i4 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i3, rect.centerY() - i4, rect.centerX() + i3, rect.centerY() + i4);
            } else {
                int i5 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i5, rect.left + intrinsicWidth2, rect.centerY() + i5);
            }
            drawableArr[1].setColorFilter(this.I);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            if (drawableArr[0].getIntrinsicWidth() < 0) {
                intrinsicWidth = i2;
            } else {
                intrinsicWidth = drawableArr[0].getIntrinsicWidth();
            }
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i2 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z = drawable3 instanceof vm;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z) {
                mm mmVar = ((vm) drawable3).k;
                if (mmVar != null) {
                    mmVar.q0(gm.L(4.0f));
                }
                if (e < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else {
                int i6 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
                if (this.a) {
                    if (i6 < 0) {
                        float interpolation2 = overshootInterpolator.getInterpolation(e);
                        canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                    }
                    int i7 = intrinsicWidth / 2;
                    int i8 = i2 / 2;
                    drawableArr[0].setBounds(rect.centerX() - i7, rect.centerY() - i8, rect.centerX() + i7, rect.centerY() + i8);
                } else {
                    if (i6 < 0) {
                        float interpolation3 = overshootInterpolator.getInterpolation(e);
                        canvas.scale(interpolation3, interpolation3, (intrinsicWidth / 2.0f) + rect.left, rect.centerY());
                    }
                    int i9 = i2 / 2;
                    drawableArr[0].setBounds(rect.left, rect.centerY() - i9, rect.left + intrinsicWidth, rect.centerY() + i9);
                }
            }
            drawableArr[0].setAlpha(this.w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        float f2 = 0.0f;
        ln lnVar = this.d;
        if (drawable != null) {
            f = 1.0f - lnVar.c;
        } else {
            f = 0.0f;
        }
        if (drawableArr[0] != null) {
            f2 = lnVar.c;
        }
        return f + f2;
    }

    public final void f() {
        vm vmVar;
        mm mmVar;
        Drawable drawable = this.f[0];
        if ((drawable instanceof vm) && (mmVar = (vmVar = (vm) drawable).k) != null) {
            vmVar.v(mmVar);
            mmVar.w0(false);
        }
    }

    public final void g(Drawable drawable, boolean z) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        ln lnVar = this.d;
        if (z) {
            lnVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof vm)) {
                    ((vm) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            lnVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            drawableArr[0] = drawable;
            if (z2) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i, boolean z) {
        int i2;
        int i3;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof vm) && document != null && ((vm) drawable).h() == document.id) {
            return;
        }
        ln lnVar = this.d;
        if (z) {
            lnVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof vm) {
                    ((vm) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.y;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = z8c.t0;
                }
                vm l = vm.l(i3, i, document);
                drawableArr[0] = l;
                if (this.x) {
                    l.a(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            lnVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            if (document != null) {
                Integer num2 = this.y;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = z8c.t0;
                }
                drawableArr[0] = vm.l(i2, i, document);
            } else {
                drawableArr[0] = null;
            }
            if (z2) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z) {
        h(document, this.b, z);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        vz9 vz9Var = this.n;
        if (vz9Var != null) {
            vz9Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j, boolean z) {
        int i;
        int i2;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof vm) && ((vm) drawable).h() == j) {
            return false;
        }
        byte b = this.b;
        ln lnVar = this.d;
        if (z) {
            lnVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof vm)) {
                    ((vm) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.y;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = z8c.t0;
            }
            vm m = vm.m(i2, j, null, b);
            drawableArr[0] = m;
            if (this.x) {
                m.a(this);
            }
        } else {
            lnVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            Integer num2 = this.y;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = z8c.t0;
            }
            drawableArr[0] = vm.m(i, j, null, b);
            if (z2) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.G;
        if (num2 == null) {
            if (num == null) {
                return;
            }
        } else if (num2.equals(num)) {
            return;
        }
        this.G = num;
        if (num != null) {
            if (this.H != num.intValue()) {
                int intValue = num.intValue();
                this.H = intValue;
                porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
            } else {
                return;
            }
        } else {
            porterDuffColorFilter = null;
        }
        this.I = porterDuffColorFilter;
    }

    public final void l(View view) {
        this.d.a = view;
        this.e.a = view;
        this.h = view;
    }

    public final void m(boolean z, boolean z2) {
        if (this.E == z) {
            return;
        }
        if (z2) {
            if (this.F == null) {
                this.F = new yxa(1, 8);
            }
            this.E = z;
            invalidate();
            return;
        }
        this.E = z;
        yxa yxaVar = this.F;
        if (z) {
            if (yxaVar == null) {
                this.F = new yxa(1, 8);
            }
        } else if (yxaVar != null) {
            this.F = null;
        }
        this.e.f(z, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i) {
        this.w = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public tm(int i, View view, boolean z) {
        this(i, 7, view, z);
    }

    public tm(int i, View view) {
        this(i, 7, view, false);
    }
}
