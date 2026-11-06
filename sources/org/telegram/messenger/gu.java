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
import org.telegram.ui.Components.a80;
public final class gu {
    public static final Paint C;
    public final int B;
    public final jv f22698a;
    public final boolean f22699b;
    public final TL_keyboard.PageButton f22700c;
    public int d;
    public int f22701e;
    public final boolean f22702f;
    public final boolean h;
    public final Drawable f22704i;
    public final int f22705j;
    public final int f22706k;
    public final int f22707l;
    public final PorterDuffColorFilter f22708m;
    public PorterDuffColorFilter f22709n;
    public int f22710o;
    public final kv f22711p;
    public final boolean f22712q;
    public final boolean f22713r;
    public final boolean f22714s;
    public final Runnable f22715t;
    public boolean f22716u;
    public float v;
    public ValueAnimator f22717w;
    public a80 f22718x;
    public boolean f22719y;
    public final Paint f22703g = new Paint(1);
    public final RectF f22720z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public gu(org.telegram.messenger.kv r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gu.<init>(org.telegram.messenger.kv, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
    }

    public final void a(Canvas canvas) {
        float f10;
        boolean z9;
        int i7;
        boolean z10;
        Canvas canvas2;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        if (this.f22716u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f22538r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f22715t.run();
            }
        }
        boolean z11 = this.f22702f;
        if (z11) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f22701e / 2.0f, c() / 2.0f);
        }
        boolean z12 = this.h;
        boolean z13 = true;
        boolean z14 = this.f22714s;
        if (z12 && !z14) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            canvas.saveLayer(0.0f, 0.0f, this.f22701e, c(), null);
        } else {
            if (this.f22716u) {
                i7 = this.f22706k;
            } else {
                i7 = this.f22705j;
            }
            Paint paint = this.f22703g;
            paint.setColor(i7);
            if (!z14) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f22701e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i13 = i();
        int j3 = j();
        if (k() > Math.max(1, j() - i())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayer(i13, -g0.L(10.0f), j3, g0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i13, -g0.L(10.0f), j3, g0.L(10.0f) + c());
        canvas2.save();
        jv jvVar = this.f22698a;
        StaticLayout staticLayout = jvVar.f23586b;
        ArrayList arrayList = jvVar.f23594x;
        StaticLayout staticLayout2 = jvVar.f23586b;
        int i14 = jvVar.f23589f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (jvVar.f23592s <= 0) {
            z13 = false;
        }
        if (z13) {
            canvas2.translate(l() - i14, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (i10 > 0) {
            if (z11) {
                canvas2.translate(l() - i14, (-i10) + ((c() * 43) / 56));
            } else {
                canvas2.translate(l() - i14, (-i10) + ((c() * 65) / 102));
            }
        } else {
            canvas2.translate(l() - i14, ((c() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        }
        jvVar.d(canvas2, jvVar.S);
        kv kvVar = this.f22711p;
        if (kvVar.F()) {
            if (z13) {
                f13 = 0.0f;
            } else if (z14) {
                f13 = 0.66f;
            } else {
                f13 = 2.0f;
            }
            canvas2.translate(0.0f, g0.L(f13));
            if (z14) {
                int i15 = staticLayout2.getPaint().linkColor;
                if (this.f22710o != i15 || this.f22709n == null) {
                    this.f22710o = i15;
                    this.f22709n = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = j3;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, jvVar.f23586b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f22709n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = j3;
                canvas2 = canvas;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, jvVar.f23586b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f22708m);
            }
        } else {
            f11 = 2.0f;
            i11 = j3;
        }
        canvas2.restore();
        if (z10) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, c());
            kvVar.f23778z.m(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f22704i;
        if (drawable != null) {
            float L = this.f22701e - g0.L(12.33f);
            if (z11) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            bg.s.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z9) {
            if (this.f22716u) {
                i12 = this.f22706k;
            } else {
                i12 = this.f22705j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f22701e, c(), c() / f11, c() / f11, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z9;
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.f22700c;
        if (pageButton != null && (q1Var = this.f22711p.E) != null && q1Var.P0(pageButton)) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = this.f22719y;
        Runnable runnable = this.f22715t;
        if (z10 != z9) {
            this.f22719y = z9;
            if (z9) {
                a80 a80Var = this.f22718x;
                if (a80Var == null) {
                    a80 a80Var2 = new a80();
                    this.f22718x = a80Var2;
                    a80Var2.D = true;
                    a80Var2.f31746x.setStrokeWidth(g0.N(1.25f));
                } else {
                    a80Var.f31727b = -1L;
                    a80Var.f31728c = -1L;
                }
            } else {
                a80 a80Var3 = this.f22718x;
                if (a80Var3 != null) {
                    a80Var3.a();
                }
            }
            runnable.run();
        }
        a80 a80Var4 = this.f22718x;
        if (a80Var4 != null) {
            if (z9 || a80Var4.d()) {
                float strokeWidth = this.f22718x.f31746x.getStrokeWidth();
                RectF rectF = this.f22720z;
                rectF.set(0.0f, 0.0f, this.f22701e, c());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f22718x.i((c() / 2.0f) - f10);
                this.f22718x.e(rectF);
                this.f22718x.g(org.telegram.ui.ActionBar.k6.r1(0.07f, this.f22707l), org.telegram.ui.ActionBar.k6.r1(0.175f, this.f22707l), org.telegram.ui.ActionBar.k6.r1(0.175f, this.f22707l), org.telegram.ui.ActionBar.k6.r1(0.42f, this.f22707l));
                this.f22718x.setAlpha(255);
                this.f22718x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f10;
        boolean z9 = this.f22702f;
        kv kvVar = this.f22711p;
        if (z9) {
            f10 = kvVar.M * 1.166666f;
        } else {
            f10 = kvVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int d() {
        if (this.f22704i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f10;
        if (this.f22714s) {
            return 0;
        }
        boolean z9 = this.f22712q;
        boolean z10 = this.f22702f;
        if (z9 && z10) {
            return g0.L(4.0f);
        }
        if (z10) {
            return g0.L(7.0f);
        }
        if (this.f22704i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int g() {
        float f10;
        int i7 = 0;
        if (this.f22714s) {
            return 0;
        }
        boolean z9 = this.f22713r;
        boolean z10 = this.f22702f;
        Drawable drawable = this.f22704i;
        if (z9 && z10) {
            if (drawable != null) {
                i7 = 14;
            }
            return g0.L(i7 + 4);
        } else if (z10) {
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
        if (this.f22714s) {
            return 0;
        }
        if (this.f22702f) {
            return f();
        }
        return g0.L(8.0f);
    }

    public final int j() {
        int i7;
        int max;
        if (this.f22714s) {
            return this.f22701e;
        }
        if (this.f22702f) {
            i7 = this.f22701e;
            max = g();
        } else {
            i7 = this.f22701e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i7 - max;
    }

    public final int k() {
        jv jvVar = this.f22698a;
        return jvVar.h - jvVar.f23589f;
    }

    public final float l() {
        if (this.f22702f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f22704i == null) {
            return (this.f22701e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.f22701e - k()) / 2.0f, (this.f22701e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z9) {
        float f10;
        long j3;
        if (this.f22716u != z9) {
            this.f22716u = z9;
            this.f22715t.run();
            if (z9) {
                ValueAnimator valueAnimator = this.f22717w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f22717w.cancel();
                    this.f22717w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f22717w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f22717w.addListener(new m.a(this, 7));
                ValueAnimator valueAnimator2 = this.f22717w;
                boolean z10 = this.f22702f;
                if (z10) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f22717w;
                if (z10) {
                    j3 = 420;
                } else {
                    j3 = 350;
                }
                valueAnimator3.setDuration(j3);
                this.f22717w.start();
            }
        }
    }
}
