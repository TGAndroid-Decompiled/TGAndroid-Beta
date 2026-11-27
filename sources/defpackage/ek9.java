package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ek9 {
    public static final Paint C;
    public final int B;
    public final gl9 a;
    public final boolean b;
    public final TL_keyboard.PageButton c;
    public int d;
    public int e;
    public final boolean f;
    public final boolean h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final int l;
    public final PorterDuffColorFilter m;
    public PorterDuffColorFilter n;
    public int o;
    public final hl9 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public va6 x;
    public boolean y;
    public final Paint g = new Paint(1);
    public final RectF z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public ek9(defpackage.hl9 r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek9.<init>(hl9, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
    }

    public final void a(Canvas canvas) {
        float f;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        Canvas canvas2;
        int i5;
        float f2;
        int i6;
        int i7;
        float f3;
        float f4;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.u) {
            float f5 = this.v;
            if (f5 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / hl.r) / 100.0f) + f5;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.t.run();
            }
        }
        boolean z3 = this.f;
        if (z3) {
            f = 0.09f;
        } else {
            f = 0.04f;
        }
        float f6 = ((1.0f - this.v) * f) + (1.0f - f);
        canvas.save();
        if (f6 != 1.0f) {
            canvas.scale(f6, f6, this.e / 2.0f, c() / 2.0f);
        }
        boolean z4 = this.h;
        boolean z5 = true;
        boolean z6 = this.s;
        if (z4 && !z6) {
            z = true;
        } else {
            z = false;
        }
        int i8 = this.j;
        int i9 = this.k;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
            i4 = i8;
            i3 = i9;
        } else {
            if (this.u) {
                i = i9;
                i2 = i;
            } else {
                i = i8;
                i2 = i9;
            }
            Paint paint = this.g;
            paint.setColor(i);
            if (!z6) {
                i3 = i2;
                i4 = i8;
                canvas.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / 2.0f, c() / 2.0f, paint);
            } else {
                i3 = i2;
                i4 = i8;
            }
            b(canvas);
        }
        canvas.save();
        int i10 = i();
        int j = j();
        if (k() > Math.max(1, j() - i())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            canvas2 = canvas;
            canvas2.saveLayer(i10, -hl.L(10.0f), j, hl.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i10, -hl.L(10.0f), j, hl.L(10.0f) + c());
        canvas2.save();
        gl9 gl9Var = this.a;
        StaticLayout staticLayout = gl9Var.b;
        ArrayList arrayList = gl9Var.x;
        StaticLayout staticLayout2 = gl9Var.b;
        int i11 = gl9Var.f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i5 = staticLayout.getLineBaseline(0);
        } else {
            i5 = -1;
        }
        if (gl9Var.s <= 0) {
            z5 = false;
        }
        if (z5) {
            canvas2.translate(l() - i11, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (i5 > 0) {
            if (z3) {
                canvas2.translate(l() - i11, (-i5) + ((c() * 43) / 56));
            } else {
                canvas2.translate(l() - i11, (-i5) + ((c() * 65) / 102));
            }
        } else {
            canvas2.translate(l() - i11, ((c() - staticLayout2.getHeight()) / 2.0f) - hl.L(1.0f));
        }
        gl9Var.d(canvas2, gl9Var.T);
        hl9 hl9Var = this.p;
        if (hl9Var.E()) {
            if (z5) {
                f4 = 0.0f;
            } else if (z6) {
                f4 = 0.66f;
            } else {
                f4 = 2.0f;
            }
            canvas2.translate(0.0f, hl.L(f4));
            StaticLayout staticLayout3 = gl9Var.b;
            if (z6) {
                int i12 = staticLayout3.getPaint().linkColor;
                if (this.o != i12 || (porterDuffColorFilter = this.n) == null) {
                    this.o = i12;
                    porterDuffColorFilter = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN);
                    this.n = porterDuffColorFilter;
                }
                f2 = 2.0f;
                i6 = j;
                hm.drawAnimatedEmojis(canvas2, gl9Var.b, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                canvas2 = canvas;
            } else {
                f2 = 2.0f;
                i6 = j;
                canvas2 = canvas;
                hm.drawAnimatedEmojis(canvas2, staticLayout3, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f2 = 2.0f;
            i6 = j;
        }
        canvas2.restore();
        if (z2) {
            RectF rectF = this.A;
            rectF.set(i6 - hl.L(8.0f), 0.0f, i6, c());
            hl9Var.z.r(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            float L = this.e - hl.L(12.33f);
            if (z3) {
                f3 = 9.33f;
            } else {
                f3 = 11.66f;
            }
            br3.d(drawable, L, hl.L(f3), 17);
            drawable.draw(canvas2);
        }
        if (z) {
            if (this.u) {
                i7 = i3;
            } else {
                i7 = i4;
            }
            Paint paint2 = C;
            paint2.setColor(i7);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / f2, c() / f2, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z;
        wb2 wb2Var;
        TL_keyboard.PageButton pageButton = this.c;
        if (pageButton != null && (wb2Var = this.p.E) != null && wb2Var.P0(pageButton)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.y;
        Runnable runnable = this.t;
        if (z2 != z) {
            this.y = z;
            va6 va6Var = this.x;
            if (z) {
                if (va6Var == null) {
                    va6 va6Var2 = new va6();
                    this.x = va6Var2;
                    va6Var2.D = true;
                    va6Var2.x.setStrokeWidth(hl.N(1.25f));
                } else {
                    va6Var.b = -1L;
                    va6Var.c = -1L;
                }
            } else if (va6Var != null) {
                va6Var.a();
            }
            runnable.run();
        }
        va6 va6Var3 = this.x;
        if (va6Var3 != null) {
            if (z || va6Var3.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, this.e, c());
                float f = strokeWidth / 2.0f;
                rectF.inset(f, f);
                this.x.h((c() / 2.0f) - f);
                this.x.e(rectF);
                va6 va6Var4 = this.x;
                int i = this.l;
                va6Var4.g(aob.p1(0.07f, i), aob.p1(0.175f, i), aob.p1(0.175f, i), aob.p1(0.42f, i));
                this.x.setAlpha(255);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f;
        boolean z = this.f;
        hl9 hl9Var = this.p;
        if (z) {
            f = hl9Var.M * 1.166666f;
        } else {
            f = hl9Var.M + 18;
        }
        return hl.L(f);
    }

    public final int d() {
        if (this.i != null) {
            return (hl.L(11.66f) / 2) + hl.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f;
        if (this.s) {
            return 0;
        }
        boolean z = this.q;
        boolean z2 = this.f;
        if (z && z2) {
            return hl.L(4.0f);
        }
        if (z2) {
            return hl.L(7.0f);
        }
        if (this.i != null) {
            f = 26.0f;
        } else {
            f = 20.0f;
        }
        return hl.L(f);
    }

    public final int g() {
        float f;
        int i = 0;
        if (this.s) {
            return 0;
        }
        boolean z = this.r;
        Drawable drawable = this.i;
        boolean z2 = this.f;
        if (z && z2) {
            if (drawable != null) {
                i = 14;
            }
            return hl.L(i + 4);
        } else if (z2) {
            if (drawable != null) {
                i = 14;
            }
            return hl.L(i + 7);
        } else {
            if (drawable != null) {
                f = 26.0f;
            } else {
                f = 20.0f;
            }
            return hl.L(f);
        }
    }

    public final int h() {
        int f = f() + k();
        return Math.min(this.B, g() + f);
    }

    public final int i() {
        if (this.s) {
            return 0;
        }
        if (this.f) {
            return f();
        }
        return hl.L(8.0f);
    }

    public final int j() {
        int max;
        if (this.s) {
            return this.e;
        }
        int i = this.e;
        if (this.f) {
            max = g();
        } else {
            max = Math.max(hl.L(8.0f), d());
        }
        return i - max;
    }

    public final int k() {
        gl9 gl9Var = this.a;
        return gl9Var.h - gl9Var.f;
    }

    public final float l() {
        if (this.f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        int i = this.e;
        if (this.i == null) {
            return (i - k()) / 2.0f;
        }
        return Math.max(Math.min((i - k()) / 2.0f, (this.e - d()) - k()), hl.L(8.0f));
    }

    public final void m(boolean z) {
        float f;
        long j;
        if (this.u != z) {
            this.u = z;
            this.t.run();
            if (z) {
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.w.cancel();
                    this.w = null;
                    return;
                }
                return;
            }
            float f2 = this.v;
            if (f2 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new b49(this, (byte) 4));
                this.w.addListener(new n88(this, (byte) 29));
                ValueAnimator valueAnimator2 = this.w;
                boolean z2 = this.f;
                if (z2) {
                    f = 3.5f;
                } else {
                    f = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f));
                ValueAnimator valueAnimator3 = this.w;
                if (z2) {
                    j = 420;
                } else {
                    j = 350;
                }
                valueAnimator3.setDuration(j);
                this.w.start();
            }
        }
    }
}
