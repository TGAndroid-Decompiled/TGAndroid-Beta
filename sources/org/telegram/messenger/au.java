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
import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.n80;
public final class au {
    public static final Paint C;
    public final int B;
    public final dv f23057a;
    public final boolean f23058b;
    public final TL_keyboard.PageButton f23059c;
    public int d;
    public int f23060e;
    public final boolean f23061f;
    public final boolean h;
    public final Drawable f23063i;
    public final int f23064j;
    public final int f23065k;
    public final int f23066l;
    public final PorterDuffColorFilter f23067m;
    public PorterDuffColorFilter f23068n;
    public int f23069o;
    public final ev f23070p;
    public final boolean f23071q;
    public final boolean f23072r;
    public final boolean f23073s;
    public final Runnable f23074t;
    public boolean f23075u;
    public float v;
    public ValueAnimator f23076w;
    public n80 f23077x;
    public boolean f23078y;
    public final Paint f23062g = new Paint(1);
    public final RectF f23079z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public au(org.telegram.messenger.ev r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.au.<init>(org.telegram.messenger.ev, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
    }

    public final void a(View view) {
        this.f23057a.i(view);
    }

    public final void b(Canvas canvas) {
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
        if (this.f23075u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f24227r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f23074t.run();
            }
        }
        boolean z12 = this.f23061f;
        if (z12) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f23060e / 2.0f, d() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f23073s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.f23060e, d(), null);
        } else {
            if (this.f23075u) {
                i7 = this.f23065k;
            } else {
                i7 = this.f23064j;
            }
            Paint paint = this.f23062g;
            paint.setColor(i7);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f23060e, d(), d() / 2.0f, d() / 2.0f, paint);
            }
            c(canvas);
        }
        canvas.save();
        int j3 = j();
        int k10 = k();
        if (l() > Math.max(1, k() - j())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayer(j3, -g0.L(10.0f), k10, g0.L(10.0f) + d(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(j3, -g0.L(10.0f), k10, g0.L(10.0f) + d());
        canvas2.save();
        dv dvVar = this.f23057a;
        StaticLayout staticLayout = dvVar.f23706b;
        ArrayList arrayList = dvVar.f23714x;
        StaticLayout staticLayout2 = dvVar.f23706b;
        int i13 = dvVar.f23709f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (dvVar.f23712s <= 0) {
            z14 = false;
        }
        if (z14) {
            canvas2.translate(m() - i13, (d() - staticLayout2.getHeight()) / 2.0f);
        } else if (i10 > 0) {
            if (z12) {
                canvas2.translate(m() - i13, (-i10) + ((d() * 43) / 56));
            } else {
                canvas2.translate(m() - i13, (-i10) + ((d() * 65) / 102));
            }
        } else {
            canvas2.translate(m() - i13, ((d() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        }
        dvVar.d(canvas2, dvVar.T);
        ev evVar = this.f23070p;
        if (evVar.F()) {
            if (z14) {
                f13 = 0.0f;
            } else if (z15) {
                f13 = 0.66f;
            } else {
                f13 = 2.0f;
            }
            canvas2.translate(0.0f, g0.L(f13));
            if (z15) {
                int i14 = staticLayout2.getPaint().linkColor;
                if (this.f23069o != i14 || this.f23068n == null) {
                    this.f23069o = i14;
                    this.f23068n = new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = k10;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23706b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f23068n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = k10;
                canvas2 = canvas;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23706b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f23067m);
            }
        } else {
            f11 = 2.0f;
            i11 = k10;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, d());
            evVar.f23894z.u(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f23063i;
        if (drawable != null) {
            float L = this.f23060e - g0.L(12.33f);
            if (z12) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            bg.t.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f23075u) {
                i12 = this.f23065k;
            } else {
                i12 = this.f23064j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f23060e, d(), d() / f11, d() / f11, paint2);
            canvas.restore();
            c(canvas);
        }
        canvas.restore();
    }

    public final void c(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var;
        TL_keyboard.PageButton pageButton = this.f23059c;
        if (pageButton != null && (r1Var = this.f23070p.E) != null && r1Var.P0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f23078y;
        Runnable runnable = this.f23074t;
        if (z11 != z10) {
            this.f23078y = z10;
            if (z10) {
                n80 n80Var = this.f23077x;
                if (n80Var == null) {
                    n80 n80Var2 = new n80();
                    this.f23077x = n80Var2;
                    n80Var2.D = true;
                    n80Var2.f37729x.setStrokeWidth(g0.N(1.25f));
                } else {
                    n80Var.f37710b = -1L;
                    n80Var.f37711c = -1L;
                }
            } else {
                n80 n80Var3 = this.f23077x;
                if (n80Var3 != null) {
                    n80Var3.a();
                }
            }
            runnable.run();
        }
        n80 n80Var4 = this.f23077x;
        if (n80Var4 != null) {
            if (z10 || n80Var4.d()) {
                float strokeWidth = this.f23077x.f37729x.getStrokeWidth();
                RectF rectF = this.f23079z;
                rectF.set(0.0f, 0.0f, this.f23060e, d());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f23077x.i((d() / 2.0f) - f10);
                this.f23077x.e(rectF);
                this.f23077x.g(org.telegram.ui.ActionBar.n6.r1(0.07f, this.f23066l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.f23066l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.f23066l), org.telegram.ui.ActionBar.n6.r1(0.42f, this.f23066l));
                this.f23077x.setAlpha(255);
                this.f23077x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int d() {
        float f10;
        boolean z10 = this.f23061f;
        ev evVar = this.f23070p;
        if (z10) {
            f10 = evVar.M * 1.166666f;
        } else {
            f10 = evVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int e() {
        if (this.f23063i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int f() {
        return Math.min(i(), e() + d());
    }

    public final int g() {
        float f10;
        if (this.f23073s) {
            return 0;
        }
        boolean z10 = this.f23071q;
        boolean z11 = this.f23061f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        if (this.f23063i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int h() {
        float f10;
        int i7 = 0;
        if (this.f23073s) {
            return 0;
        }
        boolean z10 = this.f23072r;
        boolean z11 = this.f23061f;
        Drawable drawable = this.f23063i;
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

    public final int i() {
        return Math.min(this.B, h() + g() + l());
    }

    public final int j() {
        if (this.f23073s) {
            return 0;
        }
        if (this.f23061f) {
            return g();
        }
        return g0.L(8.0f);
    }

    public final int k() {
        int i7;
        int max;
        if (this.f23073s) {
            return this.f23060e;
        }
        if (this.f23061f) {
            i7 = this.f23060e;
            max = h();
        } else {
            i7 = this.f23060e;
            max = Math.max(g0.L(8.0f), e());
        }
        return i7 - max;
    }

    public final int l() {
        dv dvVar = this.f23057a;
        return dvVar.h - dvVar.f23709f;
    }

    public final float m() {
        if (this.f23061f) {
            return g();
        }
        if (l() > Math.max(1, k() - j())) {
            return j();
        }
        if (this.f23063i == null) {
            return (this.f23060e - l()) / 2.0f;
        }
        return Math.max(Math.min((this.f23060e - l()) / 2.0f, (this.f23060e - e()) - l()), g0.L(8.0f));
    }

    public final void n(boolean z10) {
        float f10;
        long j3;
        if (this.f23075u != z10) {
            this.f23075u = z10;
            this.f23074t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f23076w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f23076w.cancel();
                    this.f23076w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f23076w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f23076w.addListener(new ki.n3(this, 8));
                ValueAnimator valueAnimator2 = this.f23076w;
                boolean z11 = this.f23061f;
                if (z11) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f23076w;
                if (z11) {
                    j3 = 420;
                } else {
                    j3 = 350;
                }
                valueAnimator3.setDuration(j3);
                this.f23076w.start();
            }
        }
    }
}
