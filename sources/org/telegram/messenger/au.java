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
import org.telegram.ui.Components.o80;
public final class au {
    public static final Paint C;
    public final int B;
    public final dv f22949a;
    public final boolean f22950b;
    public final TL_keyboard.PageButton f22951c;
    public int d;
    public int f22952e;
    public final boolean f22953f;
    public final boolean h;
    public final Drawable f22955i;
    public final int f22956j;
    public final int f22957k;
    public final int f22958l;
    public final PorterDuffColorFilter f22959m;
    public PorterDuffColorFilter f22960n;
    public int f22961o;
    public final ev f22962p;
    public final boolean f22963q;
    public final boolean f22964r;
    public final boolean f22965s;
    public final Runnable f22966t;
    public boolean f22967u;
    public float v;
    public ValueAnimator f22968w;
    public o80 f22969x;
    public boolean f22970y;
    public final Paint f22954g = new Paint(1);
    public final RectF f22971z = new RectF();
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
        if (this.f22967u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f24122r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f22966t.run();
            }
        }
        boolean z12 = this.f22953f;
        if (z12) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f22952e / 2.0f, c() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f22965s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.f22952e, c(), null);
        } else {
            if (this.f22967u) {
                i7 = this.f22957k;
            } else {
                i7 = this.f22956j;
            }
            Paint paint = this.f22954g;
            paint.setColor(i7);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f22952e, c(), c() / 2.0f, c() / 2.0f, paint);
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
        dv dvVar = this.f22949a;
        StaticLayout staticLayout = dvVar.f23580b;
        ArrayList arrayList = dvVar.f23588x;
        StaticLayout staticLayout2 = dvVar.f23580b;
        int i14 = dvVar.f23583f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (dvVar.f23586s <= 0) {
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
        dvVar.d(canvas2, dvVar.T);
        ev evVar = this.f22962p;
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
                int i15 = staticLayout2.getPaint().linkColor;
                if (this.f22961o != i15 || this.f22960n == null) {
                    this.f22961o = i15;
                    this.f22960n = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = j3;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23580b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f22960n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = j3;
                canvas2 = canvas;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23580b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f22959m);
            }
        } else {
            f11 = 2.0f;
            i11 = j3;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, c());
            evVar.f23792z.n(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f22955i;
        if (drawable != null) {
            float L = this.f22952e - g0.L(12.33f);
            if (z12) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            bg.t.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f22967u) {
                i12 = this.f22957k;
            } else {
                i12 = this.f22956j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f22952e, c(), c() / f11, c() / f11, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.f22951c;
        if (pageButton != null && (q1Var = this.f22962p.E) != null && q1Var.P0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f22970y;
        Runnable runnable = this.f22966t;
        if (z11 != z10) {
            this.f22970y = z10;
            if (z10) {
                o80 o80Var = this.f22969x;
                if (o80Var == null) {
                    o80 o80Var2 = new o80();
                    this.f22969x = o80Var2;
                    o80Var2.D = true;
                    o80Var2.f38032x.setStrokeWidth(g0.N(1.25f));
                } else {
                    o80Var.f38013b = -1L;
                    o80Var.f38014c = -1L;
                }
            } else {
                o80 o80Var3 = this.f22969x;
                if (o80Var3 != null) {
                    o80Var3.a();
                }
            }
            runnable.run();
        }
        o80 o80Var4 = this.f22969x;
        if (o80Var4 != null) {
            if (z10 || o80Var4.d()) {
                float strokeWidth = this.f22969x.f38032x.getStrokeWidth();
                RectF rectF = this.f22971z;
                rectF.set(0.0f, 0.0f, this.f22952e, c());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f22969x.i((c() / 2.0f) - f10);
                this.f22969x.e(rectF);
                this.f22969x.g(org.telegram.ui.ActionBar.n6.r1(0.07f, this.f22958l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.f22958l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.f22958l), org.telegram.ui.ActionBar.n6.r1(0.42f, this.f22958l));
                this.f22969x.setAlpha(255);
                this.f22969x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f10;
        boolean z10 = this.f22953f;
        ev evVar = this.f22962p;
        if (z10) {
            f10 = evVar.M * 1.166666f;
        } else {
            f10 = evVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int d() {
        if (this.f22955i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f10;
        if (this.f22965s) {
            return 0;
        }
        boolean z10 = this.f22963q;
        boolean z11 = this.f22953f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        if (this.f22955i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int g() {
        float f10;
        int i7 = 0;
        if (this.f22965s) {
            return 0;
        }
        boolean z10 = this.f22964r;
        boolean z11 = this.f22953f;
        Drawable drawable = this.f22955i;
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
        if (this.f22965s) {
            return 0;
        }
        if (this.f22953f) {
            return f();
        }
        return g0.L(8.0f);
    }

    public final int j() {
        int i7;
        int max;
        if (this.f22965s) {
            return this.f22952e;
        }
        if (this.f22953f) {
            i7 = this.f22952e;
            max = g();
        } else {
            i7 = this.f22952e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i7 - max;
    }

    public final int k() {
        dv dvVar = this.f22949a;
        return dvVar.h - dvVar.f23583f;
    }

    public final float l() {
        if (this.f22953f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f22955i == null) {
            return (this.f22952e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.f22952e - k()) / 2.0f, (this.f22952e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f10;
        long j3;
        if (this.f22967u != z10) {
            this.f22967u = z10;
            this.f22966t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f22968w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f22968w.cancel();
                    this.f22968w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f22968w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f22968w.addListener(new ki.n3(this, 8));
                ValueAnimator valueAnimator2 = this.f22968w;
                boolean z11 = this.f22953f;
                if (z11) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f22968w;
                if (z11) {
                    j3 = 420;
                } else {
                    j3 = 350;
                }
                valueAnimator3.setDuration(j3);
                this.f22968w.start();
            }
        }
    }
}
