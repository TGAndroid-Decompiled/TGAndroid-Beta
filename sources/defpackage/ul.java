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
public class ul extends Drawable implements em {
    public boolean E;
    public yza F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final c1 M;
    public boolean a;
    public final byte b;
    public final OvershootInterpolator c;
    public final mm d;
    public final mm e;
    public final Drawable[] f;
    public View h;
    public n1a n;
    public final boolean r;
    public final int s;
    public int w;
    public boolean x;
    public Integer y;

    public ul(int i, int i2, View view, boolean z) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        k43 k43Var = k43.g;
        mm mmVar = new mm(300L, (View) null, k43Var);
        this.d = mmVar;
        mm mmVar2 = new mm(300L, (View) null, k43Var);
        this.e = mmVar2;
        this.f = new Drawable[2];
        this.w = 255;
        this.L = new Rect();
        this.M = new c1(this, (byte) 15);
        mmVar.a = view;
        this.h = view;
        mmVar2.a = view;
        this.s = i;
        this.b = i2;
        this.r = z;
    }

    public final void a() {
        if (!this.x) {
            this.x = true;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof wl) {
                ((wl) drawable).a(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof wl) {
                ((wl) drawable2).a(this);
            }
        }
    }

    public final void b() {
        if (this.x) {
            this.x = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof wl) {
                ((wl) drawable).n(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof wl) {
                ((wl) drawable2).n(this);
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
        c1 c1Var = this.M;
        if (i > 0) {
            yza yzaVar = this.F;
            yzaVar.c.set(rect);
            yzaVar.e();
            this.F.d();
            yza yzaVar2 = this.F;
            Integer num = this.G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            yzaVar2.a(canvas, aob.p1(d, intValue));
            jh2.d().a(15, c1Var);
        } else {
            jh2.d().g(c1Var);
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
            if (drawable2 instanceof wl) {
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
            boolean z = drawable3 instanceof wl;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z) {
                nl nlVar = ((wl) drawable3).k;
                if (nlVar != null) {
                    nlVar.q0(hl.L(4.0f));
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
        mm mmVar = this.d;
        if (drawable != null) {
            f = 1.0f - mmVar.c;
        } else {
            f = 0.0f;
        }
        if (drawableArr[0] != null) {
            f2 = mmVar.c;
        }
        return f + f2;
    }

    public final void f() {
        wl wlVar;
        nl nlVar;
        Drawable drawable = this.f[0];
        if ((drawable instanceof wl) && (nlVar = (wlVar = (wl) drawable).k) != null) {
            wlVar.v(nlVar);
            nlVar.w0(false);
        }
    }

    public final void g(Drawable drawable, boolean z) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        mm mmVar = this.d;
        if (z) {
            mmVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof wl)) {
                    ((wl) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            mmVar.e(true, 1.0f);
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
        if ((drawable instanceof wl) && document != null && ((wl) drawable).h() == document.id) {
            return;
        }
        mm mmVar = this.d;
        if (z) {
            mmVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof wl) {
                    ((wl) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.y;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = yac.t0;
                }
                wl l = wl.l(i3, i, document);
                drawableArr[0] = l;
                if (this.x) {
                    l.a(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            mmVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            if (document != null) {
                Integer num2 = this.y;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = yac.t0;
                }
                drawableArr[0] = wl.l(i2, i, document);
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
        n1a n1aVar = this.n;
        if (n1aVar != null) {
            n1aVar.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j, boolean z) {
        int i;
        int i2;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof wl) && ((wl) drawable).h() == j) {
            return false;
        }
        byte b = this.b;
        mm mmVar = this.d;
        if (z) {
            mmVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof wl)) {
                    ((wl) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.y;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = yac.t0;
            }
            wl m = wl.m(i2, j, null, b);
            drawableArr[0] = m;
            if (this.x) {
                m.a(this);
            }
        } else {
            mmVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            Integer num2 = this.y;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = yac.t0;
            }
            drawableArr[0] = wl.m(i, j, null, b);
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
                this.F = new yza(1, 8);
            }
            this.E = z;
            invalidate();
            return;
        }
        this.E = z;
        yza yzaVar = this.F;
        if (z) {
            if (yzaVar == null) {
                this.F = new yza(1, 8);
            }
        } else if (yzaVar != null) {
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

    public ul(int i, View view, boolean z) {
        this(i, 7, view, z);
    }

    public ul(int i, View view) {
        this(i, 7, view, false);
    }
}
