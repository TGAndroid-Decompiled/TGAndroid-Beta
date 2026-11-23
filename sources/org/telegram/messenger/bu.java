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
import org.telegram.ui.Components.q80;
public final class bu {
    public static final Paint C;
    public final int B;
    public final ev f23125a;
    public final boolean f23126b;
    public final TL_keyboard.PageButton f23127c;
    public int d;
    public int f23128e;
    public final boolean f23129f;
    public final boolean h;
    public final Drawable f23131i;
    public final int f23132j;
    public final int f23133k;
    public final int f23134l;
    public final PorterDuffColorFilter f23135m;
    public PorterDuffColorFilter f23136n;
    public int f23137o;
    public final fv f23138p;
    public final boolean f23139q;
    public final boolean f23140r;
    public final boolean f23141s;
    public final Runnable f23142t;
    public boolean f23143u;
    public float v;
    public ValueAnimator f23144w;
    public q80 f23145x;
    public boolean f23146y;
    public final Paint f23130g = new Paint(1);
    public final RectF f23147z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public bu(org.telegram.messenger.fv r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bu.<init>(org.telegram.messenger.fv, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
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
        if (this.f23143u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f24011r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f23142t.run();
            }
        }
        boolean z12 = this.f23129f;
        if (z12) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f23128e / 2.0f, c() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f23141s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.f23128e, c(), null);
        } else {
            if (this.f23143u) {
                i7 = this.f23133k;
            } else {
                i7 = this.f23132j;
            }
            Paint paint = this.f23130g;
            paint.setColor(i7);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f23128e, c(), c() / 2.0f, c() / 2.0f, paint);
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
        ev evVar = this.f23125a;
        StaticLayout staticLayout = evVar.f23734b;
        ArrayList arrayList = evVar.f23742x;
        StaticLayout staticLayout2 = evVar.f23734b;
        int i14 = evVar.f23737f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (evVar.f23740s <= 0) {
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
        evVar.d(canvas2, evVar.T);
        fv fvVar = this.f23138p;
        if (fvVar.F()) {
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
                if (this.f23137o != i15 || this.f23136n == null) {
                    this.f23137o = i15;
                    this.f23136n = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = j3;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, evVar.f23734b, evVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f23136n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = j3;
                canvas2 = canvas;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, evVar.f23734b, evVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f23135m);
            }
        } else {
            f11 = 2.0f;
            i11 = j3;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, c());
            fvVar.f23962z.n(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f23131i;
        if (drawable != null) {
            float L = this.f23128e - g0.L(12.33f);
            if (z12) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            bg.t.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f23143u) {
                i12 = this.f23133k;
            } else {
                i12 = this.f23132j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f23128e, c(), c() / f11, c() / f11, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var;
        TL_keyboard.PageButton pageButton = this.f23127c;
        if (pageButton != null && (r1Var = this.f23138p.E) != null && r1Var.P0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f23146y;
        Runnable runnable = this.f23142t;
        if (z11 != z10) {
            this.f23146y = z10;
            if (z10) {
                q80 q80Var = this.f23145x;
                if (q80Var == null) {
                    q80 q80Var2 = new q80();
                    this.f23145x = q80Var2;
                    q80Var2.D = true;
                    q80Var2.f38786x.setStrokeWidth(g0.N(1.25f));
                } else {
                    q80Var.f38767b = -1L;
                    q80Var.f38768c = -1L;
                }
            } else {
                q80 q80Var3 = this.f23145x;
                if (q80Var3 != null) {
                    q80Var3.a();
                }
            }
            runnable.run();
        }
        q80 q80Var4 = this.f23145x;
        if (q80Var4 != null) {
            if (z10 || q80Var4.d()) {
                float strokeWidth = this.f23145x.f38786x.getStrokeWidth();
                RectF rectF = this.f23147z;
                rectF.set(0.0f, 0.0f, this.f23128e, c());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f23145x.i((c() / 2.0f) - f10);
                this.f23145x.e(rectF);
                this.f23145x.g(org.telegram.ui.ActionBar.m6.r1(0.07f, this.f23134l), org.telegram.ui.ActionBar.m6.r1(0.175f, this.f23134l), org.telegram.ui.ActionBar.m6.r1(0.175f, this.f23134l), org.telegram.ui.ActionBar.m6.r1(0.42f, this.f23134l));
                this.f23145x.setAlpha(255);
                this.f23145x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f10;
        boolean z10 = this.f23129f;
        fv fvVar = this.f23138p;
        if (z10) {
            f10 = fvVar.M * 1.166666f;
        } else {
            f10 = fvVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int d() {
        if (this.f23131i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f10;
        if (this.f23141s) {
            return 0;
        }
        boolean z10 = this.f23139q;
        boolean z11 = this.f23129f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        if (this.f23131i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int g() {
        float f10;
        int i7 = 0;
        if (this.f23141s) {
            return 0;
        }
        boolean z10 = this.f23140r;
        boolean z11 = this.f23129f;
        Drawable drawable = this.f23131i;
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
        if (this.f23141s) {
            return 0;
        }
        if (this.f23129f) {
            return f();
        }
        return g0.L(8.0f);
    }

    public final int j() {
        int i7;
        int max;
        if (this.f23141s) {
            return this.f23128e;
        }
        if (this.f23129f) {
            i7 = this.f23128e;
            max = g();
        } else {
            i7 = this.f23128e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i7 - max;
    }

    public final int k() {
        ev evVar = this.f23125a;
        return evVar.h - evVar.f23737f;
    }

    public final float l() {
        if (this.f23129f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f23131i == null) {
            return (this.f23128e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.f23128e - k()) / 2.0f, (this.f23128e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f10;
        long j3;
        if (this.f23143u != z10) {
            this.f23143u = z10;
            this.f23142t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f23144w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f23144w.cancel();
                    this.f23144w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f23144w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f23144w.addListener(new ki.m3(this, 8));
                ValueAnimator valueAnimator2 = this.f23144w;
                boolean z11 = this.f23129f;
                if (z11) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f23144w;
                if (z11) {
                    j3 = 420;
                } else {
                    j3 = 350;
                }
                valueAnimator3.setDuration(j3);
                this.f23144w.start();
            }
        }
    }
}
