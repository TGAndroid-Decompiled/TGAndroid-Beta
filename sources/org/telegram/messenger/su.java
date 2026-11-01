package org.telegram.messenger;

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
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.t80;
public final class su {
    public static final Paint C;
    public final int B;
    public final vv f18144a;
    public final boolean f18145b;
    public final TL_keyboard.PageButton f18146c;
    public int d;
    public int e;
    public final boolean f18147f;
    public final boolean h;
    public final Drawable f18149i;
    public final int f18150j;
    public final int f18151k;
    public final int f18152l;
    public final PorterDuffColorFilter f18153m;
    public PorterDuffColorFilter f18154n;
    public int f18155o;
    public final wv f18156p;
    public final boolean f18157q;
    public final boolean f18158r;
    public final boolean f18159s;
    public final Runnable f18160t;
    public boolean f18161u;
    public float v;
    public ValueAnimator f18162w;
    public t80 f18163x;
    public boolean f18164y;
    public final Paint f18148g = new Paint(1);
    public final RectF f18165z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public su(org.telegram.messenger.wv r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.su.<init>(org.telegram.messenger.wv, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
    }

    public final void a(Canvas canvas) {
        float f7;
        boolean z10;
        int i10;
        boolean z11;
        Canvas canvas2;
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        if (this.f18161u) {
            float f13 = this.v;
            if (f13 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / i0.f16173r) / 100.0f) + f13;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f18160t.run();
            }
        }
        boolean z12 = this.f18147f;
        if (z12) {
            f7 = 0.09f;
        } else {
            f7 = 0.04f;
        }
        float f14 = ((1.0f - this.v) * f7) + (1.0f - f7);
        canvas.save();
        if (f14 != 1.0f) {
            canvas.scale(f14, f14, this.e / 2.0f, c() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f18159s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
        } else {
            if (this.f18161u) {
                i10 = this.f18151k;
            } else {
                i10 = this.f18150j;
            }
            Paint paint = this.f18148g;
            paint.setColor(i10);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i14 = i();
        int j10 = j();
        if (k() > Math.max(1, j() - i())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayer(i14, -i0.L(10.0f), j10, i0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i14, -i0.L(10.0f), j10, i0.L(10.0f) + c());
        canvas2.save();
        vv vvVar = this.f18144a;
        StaticLayout staticLayout = vvVar.f18904b;
        ArrayList arrayList = vvVar.f18911x;
        StaticLayout staticLayout2 = vvVar.f18904b;
        int i15 = vvVar.f18906f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i11 = staticLayout.getLineBaseline(0);
        } else {
            i11 = -1;
        }
        if (vvVar.f18909s <= 0) {
            z14 = false;
        }
        if (z14) {
            canvas2.translate(l() - i15, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (i11 > 0) {
            if (z12) {
                canvas2.translate(l() - i15, (-i11) + ((c() * 43) / 56));
            } else {
                canvas2.translate(l() - i15, (-i11) + ((c() * 65) / 102));
            }
        } else {
            canvas2.translate(l() - i15, ((c() - staticLayout2.getHeight()) / 2.0f) - i0.L(1.0f));
        }
        vvVar.d(canvas2, vvVar.S);
        wv wvVar = this.f18156p;
        if (wvVar.F()) {
            if (z14) {
                f12 = 0.0f;
            } else if (z15) {
                f12 = 0.66f;
            } else {
                f12 = 2.0f;
            }
            canvas2.translate(0.0f, i0.L(f12));
            if (z15) {
                int i16 = staticLayout2.getPaint().linkColor;
                if (this.f18155o != i16 || this.f18154n == null) {
                    this.f18155o = i16;
                    this.f18154n = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
                }
                f10 = 2.0f;
                i12 = j10;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, vvVar.f18904b, vvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f18154n);
                canvas2 = canvas;
            } else {
                f10 = 2.0f;
                i12 = j10;
                canvas2 = canvas;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, vvVar.f18904b, vvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f18153m);
            }
        } else {
            f10 = 2.0f;
            i12 = j10;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i12 - i0.L(8.0f), 0.0f, i12, c());
            wvVar.f19350z.o(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f18149i;
        if (drawable != null) {
            float L = this.e - i0.L(12.33f);
            if (z12) {
                f11 = 9.33f;
            } else {
                f11 = 11.66f;
            }
            rf.o.d(drawable, L, i0.L(f11), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f18161u) {
                i13 = this.f18151k;
            } else {
                i13 = this.f18150j;
            }
            Paint paint2 = C;
            paint2.setColor(i13);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / f10, c() / f10, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.f18146c;
        if (pageButton != null && (q1Var = this.f18156p.E) != null && q1Var.N0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f18164y;
        Runnable runnable = this.f18160t;
        if (z11 != z10) {
            this.f18164y = z10;
            if (z10) {
                t80 t80Var = this.f18163x;
                if (t80Var == null) {
                    t80 t80Var2 = new t80();
                    this.f18163x = t80Var2;
                    t80Var2.D = true;
                    t80Var2.f30592x.setStrokeWidth(i0.N(1.25f));
                } else {
                    t80Var.f30574b = -1L;
                    t80Var.f30575c = -1L;
                }
            } else {
                t80 t80Var3 = this.f18163x;
                if (t80Var3 != null) {
                    t80Var3.a();
                }
            }
            runnable.run();
        }
        t80 t80Var4 = this.f18163x;
        if (t80Var4 != null) {
            if (z10 || t80Var4.d()) {
                float strokeWidth = this.f18163x.f30592x.getStrokeWidth();
                RectF rectF = this.f18165z;
                rectF.set(0.0f, 0.0f, this.e, c());
                float f7 = strokeWidth / 2.0f;
                rectF.inset(f7, f7);
                this.f18163x.i((c() / 2.0f) - f7);
                this.f18163x.e(rectF);
                this.f18163x.g(org.telegram.ui.ActionBar.t6.r1(0.07f, this.f18152l), org.telegram.ui.ActionBar.t6.r1(0.175f, this.f18152l), org.telegram.ui.ActionBar.t6.r1(0.175f, this.f18152l), org.telegram.ui.ActionBar.t6.r1(0.42f, this.f18152l));
                this.f18163x.setAlpha(255);
                this.f18163x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f7;
        boolean z10 = this.f18147f;
        wv wvVar = this.f18156p;
        if (z10) {
            f7 = wvVar.M * 1.166666f;
        } else {
            f7 = wvVar.M + 18;
        }
        return i0.L(f7);
    }

    public final int d() {
        if (this.f18149i != null) {
            return (i0.L(11.66f) / 2) + i0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f7;
        if (this.f18159s) {
            return 0;
        }
        boolean z10 = this.f18157q;
        boolean z11 = this.f18147f;
        if (z10 && z11) {
            return i0.L(4.0f);
        }
        if (z11) {
            return i0.L(7.0f);
        }
        if (this.f18149i != null) {
            f7 = 26.0f;
        } else {
            f7 = 20.0f;
        }
        return i0.L(f7);
    }

    public final int g() {
        float f7;
        int i10 = 0;
        if (this.f18159s) {
            return 0;
        }
        boolean z10 = this.f18158r;
        boolean z11 = this.f18147f;
        Drawable drawable = this.f18149i;
        if (z10 && z11) {
            if (drawable != null) {
                i10 = 14;
            }
            return i0.L(i10 + 4);
        } else if (z11) {
            if (drawable != null) {
                i10 = 14;
            }
            return i0.L(i10 + 7);
        } else {
            if (drawable != null) {
                f7 = 26.0f;
            } else {
                f7 = 20.0f;
            }
            return i0.L(f7);
        }
    }

    public final int h() {
        return Math.min(this.B, g() + f() + k());
    }

    public final int i() {
        if (this.f18159s) {
            return 0;
        }
        if (this.f18147f) {
            return f();
        }
        return i0.L(8.0f);
    }

    public final int j() {
        int i10;
        int max;
        if (this.f18159s) {
            return this.e;
        }
        if (this.f18147f) {
            i10 = this.e;
            max = g();
        } else {
            i10 = this.e;
            max = Math.max(i0.L(8.0f), d());
        }
        return i10 - max;
    }

    public final int k() {
        vv vvVar = this.f18144a;
        return vvVar.h - vvVar.f18906f;
    }

    public final float l() {
        if (this.f18147f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f18149i == null) {
            return (this.e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.e - k()) / 2.0f, (this.e - d()) - k()), i0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f7;
        long j10;
        if (this.f18161u != z10) {
            this.f18161u = z10;
            this.f18160t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f18162w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f18162w.cancel();
                    this.f18162w = null;
                    return;
                }
                return;
            }
            float f10 = this.v;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.f18162w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f18162w.addListener(new bg.e(this, 18));
                ValueAnimator valueAnimator2 = this.f18162w;
                boolean z11 = this.f18147f;
                if (z11) {
                    f7 = 3.5f;
                } else {
                    f7 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f7));
                ValueAnimator valueAnimator3 = this.f18162w;
                if (z11) {
                    j10 = 420;
                } else {
                    j10 = 350;
                }
                valueAnimator3.setDuration(j10);
                this.f18162w.start();
            }
        }
    }
}
