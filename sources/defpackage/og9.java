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
public final class og9 {
    public static final Paint C;
    public final int B;
    public final qh9 a;
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
    public final rh9 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public r86 x;
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

    public og9(defpackage.rh9 r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.<init>(rh9, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
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
                float min = (Math.min(40.0f, 1000.0f / gl.r) / 100.0f) + f5;
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
            canvas2.saveLayer(i10, -gl.L(10.0f), j, gl.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i10, -gl.L(10.0f), j, gl.L(10.0f) + c());
        canvas2.save();
        qh9 qh9Var = this.a;
        StaticLayout staticLayout = qh9Var.b;
        ArrayList arrayList = qh9Var.x;
        StaticLayout staticLayout2 = qh9Var.b;
        int i11 = qh9Var.f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i5 = staticLayout.getLineBaseline(0);
        } else {
            i5 = -1;
        }
        if (qh9Var.s <= 0) {
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
            canvas2.translate(l() - i11, ((c() - staticLayout2.getHeight()) / 2.0f) - gl.L(1.0f));
        }
        qh9Var.d(canvas2, qh9Var.T);
        rh9 rh9Var = this.p;
        if (rh9Var.E()) {
            if (z5) {
                f4 = 0.0f;
            } else if (z6) {
                f4 = 0.66f;
            } else {
                f4 = 2.0f;
            }
            canvas2.translate(0.0f, gl.L(f4));
            StaticLayout staticLayout3 = qh9Var.b;
            if (z6) {
                int i12 = staticLayout3.getPaint().linkColor;
                if (this.o != i12 || (porterDuffColorFilter = this.n) == null) {
                    this.o = i12;
                    porterDuffColorFilter = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN);
                    this.n = porterDuffColorFilter;
                }
                f2 = 2.0f;
                i6 = j;
                gm.drawAnimatedEmojis(canvas2, qh9Var.b, qh9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                canvas2 = canvas;
            } else {
                f2 = 2.0f;
                i6 = j;
                canvas2 = canvas;
                gm.drawAnimatedEmojis(canvas2, staticLayout3, qh9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f2 = 2.0f;
            i6 = j;
        }
        canvas2.restore();
        if (z2) {
            RectF rectF = this.A;
            rectF.set(i6 - gl.L(8.0f), 0.0f, i6, c());
            rh9Var.z.s(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            float L = this.e - gl.L(12.33f);
            if (z3) {
                f3 = 9.33f;
            } else {
                f3 = 11.66f;
            }
            kq3.d(drawable, L, gl.L(f3), 17);
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
        gb2 gb2Var;
        TL_keyboard.PageButton pageButton = this.c;
        if (pageButton != null && (gb2Var = this.p.E) != null && gb2Var.P0(pageButton)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.y;
        Runnable runnable = this.t;
        if (z2 != z) {
            this.y = z;
            r86 r86Var = this.x;
            if (z) {
                if (r86Var == null) {
                    r86 r86Var2 = new r86();
                    this.x = r86Var2;
                    r86Var2.D = true;
                    r86Var2.x.setStrokeWidth(gl.N(1.25f));
                } else {
                    r86Var.b = -1L;
                    r86Var.c = -1L;
                }
            } else if (r86Var != null) {
                r86Var.a();
            }
            runnable.run();
        }
        r86 r86Var3 = this.x;
        if (r86Var3 != null) {
            if (z || r86Var3.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, this.e, c());
                float f = strokeWidth / 2.0f;
                rectF.inset(f, f);
                this.x.h((c() / 2.0f) - f);
                this.x.e(rectF);
                r86 r86Var4 = this.x;
                int i = this.l;
                r86Var4.g(bkb.p1(0.07f, i), bkb.p1(0.175f, i), bkb.p1(0.175f, i), bkb.p1(0.42f, i));
                this.x.setAlpha(255);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f;
        boolean z = this.f;
        rh9 rh9Var = this.p;
        if (z) {
            f = rh9Var.M * 1.166666f;
        } else {
            f = rh9Var.M + 18;
        }
        return gl.L(f);
    }

    public final int d() {
        if (this.i != null) {
            return (gl.L(11.66f) / 2) + gl.L(12.33f);
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
            return gl.L(4.0f);
        }
        if (z2) {
            return gl.L(7.0f);
        }
        if (this.i != null) {
            f = 26.0f;
        } else {
            f = 20.0f;
        }
        return gl.L(f);
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
            return gl.L(i + 4);
        } else if (z2) {
            if (drawable != null) {
                i = 14;
            }
            return gl.L(i + 7);
        } else {
            if (drawable != null) {
                f = 26.0f;
            } else {
                f = 20.0f;
            }
            return gl.L(f);
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
        return gl.L(8.0f);
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
            max = Math.max(gl.L(8.0f), d());
        }
        return i - max;
    }

    public final int k() {
        qh9 qh9Var = this.a;
        return qh9Var.h - qh9Var.f;
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
        return Math.max(Math.min((i - k()) / 2.0f, (this.e - d()) - k()), gl.L(8.0f));
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
                ofFloat.addUpdateListener(new x89(this, (byte) 2));
                this.w.addListener(new ng9(this, (byte) 0));
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
