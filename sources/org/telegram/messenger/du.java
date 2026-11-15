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
import org.telegram.ui.Components.d80;
public final class du {
    public static final Paint C;
    public final int B;
    public final hv f23141a;
    public final boolean f23142b;
    public final TL_keyboard.PageButton f23143c;
    public int d;
    public int f23144e;
    public final boolean f23145f;
    public final boolean h;
    public final Drawable f23147i;
    public final int f23148j;
    public final int f23149k;
    public final int f23150l;
    public final PorterDuffColorFilter f23151m;
    public PorterDuffColorFilter f23152n;
    public int f23153o;
    public final iv f23154p;
    public final boolean f23155q;
    public final boolean f23156r;
    public final boolean f23157s;
    public final Runnable f23158t;
    public boolean f23159u;
    public float v;
    public ValueAnimator f23160w;
    public d80 f23161x;
    public boolean f23162y;
    public final Paint f23146g = new Paint(1);
    public final RectF f23163z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public du(org.telegram.messenger.iv r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.du.<init>(org.telegram.messenger.iv, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
    }

    public final void a(Canvas canvas) {
        float f10;
        boolean z10;
        int i7;
        boolean z11;
        Canvas canvas2;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        if (this.f23159u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f23612r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f23158t.run();
            }
        }
        boolean z12 = this.f23145f;
        if (z12) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f23144e / 2.0f, c() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f23157s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.f23144e, c(), null);
        } else {
            if (this.f23159u) {
                i7 = this.f23149k;
            } else {
                i7 = this.f23148j;
            }
            Paint paint = this.f23146g;
            paint.setColor(i7);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f23144e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i13 = i();
        int j3 = j();
        if (k() > Math.max(1, j() - i())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayer(i13, -g0.L(10.0f), j3, g0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i13, -g0.L(10.0f), j3, g0.L(10.0f) + c());
        canvas2.save();
        hv hvVar = this.f23141a;
        StaticLayout staticLayout = hvVar.f24222b;
        ArrayList arrayList = hvVar.f24230x;
        StaticLayout staticLayout2 = hvVar.f24222b;
        int i14 = hvVar.f24225f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (hvVar.f24228s <= 0) {
            z14 = false;
        }
        if (z14) {
            canvas2.translate(l() - i14, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (i10 > 0) {
            if (z12) {
                canvas2.translate(l() - i14, (-i10) + ((c() * 43) / 56));
            } else {
                canvas2.translate(l() - i14, (-i10) + ((c() * 65) / 102));
            }
        } else {
            canvas2.translate(l() - i14, ((c() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        }
        hvVar.d(canvas2, hvVar.T);
        iv ivVar = this.f23154p;
        if (ivVar.F()) {
            if (z14) {
                f13 = 0.0f;
            } else if (z15) {
                f13 = 0.66f;
            } else {
                f13 = 2.0f;
            }
            canvas2.translate(0.0f, g0.L(f13));
            if (z15) {
                int i15 = staticLayout2.getPaint().linkColor;
                if (this.f23153o != i15 || this.f23152n == null) {
                    this.f23153o = i15;
                    this.f23152n = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = j3;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, hvVar.f24222b, hvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f23152n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = j3;
                canvas2 = canvas;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, hvVar.f24222b, hvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f23151m);
            }
        } else {
            f11 = 2.0f;
            i11 = j3;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, c());
            ivVar.f24467z.m(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f23147i;
        if (drawable != null) {
            float L = this.f23144e - g0.L(12.33f);
            if (z12) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            bg.s.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f23159u) {
                i12 = this.f23149k;
            } else {
                i12 = this.f23148j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f23144e, c(), c() / f11, c() / f11, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.f23143c;
        if (pageButton != null && (q1Var = this.f23154p.E) != null && q1Var.P0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f23162y;
        Runnable runnable = this.f23158t;
        if (z11 != z10) {
            this.f23162y = z10;
            if (z10) {
                d80 d80Var = this.f23161x;
                if (d80Var == null) {
                    d80 d80Var2 = new d80();
                    this.f23161x = d80Var2;
                    d80Var2.D = true;
                    d80Var2.f33886x.setStrokeWidth(g0.N(1.25f));
                } else {
                    d80Var.f33867b = -1L;
                    d80Var.f33868c = -1L;
                }
            } else {
                d80 d80Var3 = this.f23161x;
                if (d80Var3 != null) {
                    d80Var3.a();
                }
            }
            runnable.run();
        }
        d80 d80Var4 = this.f23161x;
        if (d80Var4 != null) {
            if (z10 || d80Var4.d()) {
                float strokeWidth = this.f23161x.f33886x.getStrokeWidth();
                RectF rectF = this.f23163z;
                rectF.set(0.0f, 0.0f, this.f23144e, c());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f23161x.i((c() / 2.0f) - f10);
                this.f23161x.e(rectF);
                this.f23161x.g(org.telegram.ui.ActionBar.j6.r1(0.07f, this.f23150l), org.telegram.ui.ActionBar.j6.r1(0.175f, this.f23150l), org.telegram.ui.ActionBar.j6.r1(0.175f, this.f23150l), org.telegram.ui.ActionBar.j6.r1(0.42f, this.f23150l));
                this.f23161x.setAlpha(255);
                this.f23161x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f10;
        boolean z10 = this.f23145f;
        iv ivVar = this.f23154p;
        if (z10) {
            f10 = ivVar.M * 1.166666f;
        } else {
            f10 = ivVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int d() {
        if (this.f23147i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f10;
        if (this.f23157s) {
            return 0;
        }
        boolean z10 = this.f23155q;
        boolean z11 = this.f23145f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        if (this.f23147i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int g() {
        float f10;
        int i7 = 0;
        if (this.f23157s) {
            return 0;
        }
        boolean z10 = this.f23156r;
        boolean z11 = this.f23145f;
        Drawable drawable = this.f23147i;
        if (z10 && z11) {
            if (drawable != null) {
                i7 = 14;
            }
            return g0.L(i7 + 4);
        } else if (z11) {
            if (drawable != null) {
                i7 = 14;
            }
            return g0.L(i7 + 7);
        } else {
            if (drawable != null) {
                f10 = 26.0f;
            } else {
                f10 = 20.0f;
            }
            return g0.L(f10);
        }
    }

    public final int h() {
        return Math.min(this.B, g() + f() + k());
    }

    public final int i() {
        if (this.f23157s) {
            return 0;
        }
        if (this.f23145f) {
            return f();
        }
        return g0.L(8.0f);
    }

    public final int j() {
        int i7;
        int max;
        if (this.f23157s) {
            return this.f23144e;
        }
        if (this.f23145f) {
            i7 = this.f23144e;
            max = g();
        } else {
            i7 = this.f23144e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i7 - max;
    }

    public final int k() {
        hv hvVar = this.f23141a;
        return hvVar.h - hvVar.f24225f;
    }

    public final float l() {
        if (this.f23145f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f23147i == null) {
            return (this.f23144e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.f23144e - k()) / 2.0f, (this.f23144e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f10;
        long j3;
        if (this.f23159u != z10) {
            this.f23159u = z10;
            this.f23158t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f23160w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f23160w.cancel();
                    this.f23160w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f23160w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f23160w.addListener(new ki.s3(this, 8));
                ValueAnimator valueAnimator2 = this.f23160w;
                boolean z11 = this.f23145f;
                if (z11) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f23160w;
                if (z11) {
                    j3 = 420;
                } else {
                    j3 = 350;
                }
                valueAnimator3.setDuration(j3);
                this.f23160w.start();
            }
        }
    }
}
