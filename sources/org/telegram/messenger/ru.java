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
public final class ru {
    public static final Paint C;
    public final int B;
    public final uv f17780a;
    public final boolean f17781b;
    public final TL_keyboard.PageButton f17782c;
    public int d;
    public int e;
    public final boolean f17783f;
    public final boolean h;
    public final Drawable f17785i;
    public final int f17786j;
    public final int f17787k;
    public final int f17788l;
    public final PorterDuffColorFilter f17789m;
    public PorterDuffColorFilter f17790n;
    public int f17791o;
    public final vv f17792p;
    public final boolean f17793q;
    public final boolean f17794r;
    public final boolean f17795s;
    public final Runnable f17796t;
    public boolean f17797u;
    public float v;
    public ValueAnimator f17798w;
    public t80 f17799x;
    public boolean f17800y;
    public final Paint f17784g = new Paint(1);
    public final RectF f17801z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public ru(org.telegram.messenger.vv r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ru.<init>(org.telegram.messenger.vv, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
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
        if (this.f17797u) {
            float f13 = this.v;
            if (f13 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / i0.f16027r) / 100.0f) + f13;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f17796t.run();
            }
        }
        boolean z12 = this.f17783f;
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
        boolean z15 = this.f17795s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
        } else {
            if (this.f17797u) {
                i10 = this.f17787k;
            } else {
                i10 = this.f17786j;
            }
            Paint paint = this.f17784g;
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
        uv uvVar = this.f17780a;
        StaticLayout staticLayout = uvVar.f18396b;
        ArrayList arrayList = uvVar.f18403x;
        StaticLayout staticLayout2 = uvVar.f18396b;
        int i15 = uvVar.f18398f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i11 = staticLayout.getLineBaseline(0);
        } else {
            i11 = -1;
        }
        if (uvVar.f18401s <= 0) {
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
        uvVar.d(canvas2, uvVar.S);
        vv vvVar = this.f17792p;
        if (vvVar.F()) {
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
                if (this.f17791o != i16 || this.f17790n == null) {
                    this.f17791o = i16;
                    this.f17790n = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
                }
                f10 = 2.0f;
                i12 = j10;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, uvVar.f18396b, uvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f17790n);
                canvas2 = canvas;
            } else {
                f10 = 2.0f;
                i12 = j10;
                canvas2 = canvas;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, uvVar.f18396b, uvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f17789m);
            }
        } else {
            f10 = 2.0f;
            i12 = j10;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i12 - i0.L(8.0f), 0.0f, i12, c());
            vvVar.f19007z.o(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f17785i;
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
            if (this.f17797u) {
                i13 = this.f17787k;
            } else {
                i13 = this.f17786j;
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
        TL_keyboard.PageButton pageButton = this.f17782c;
        if (pageButton != null && (q1Var = this.f17792p.E) != null && q1Var.N0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f17800y;
        Runnable runnable = this.f17796t;
        if (z11 != z10) {
            this.f17800y = z10;
            if (z10) {
                t80 t80Var = this.f17799x;
                if (t80Var == null) {
                    t80 t80Var2 = new t80();
                    this.f17799x = t80Var2;
                    t80Var2.D = true;
                    t80Var2.f30520x.setStrokeWidth(i0.N(1.25f));
                } else {
                    t80Var.f30502b = -1L;
                    t80Var.f30503c = -1L;
                }
            } else {
                t80 t80Var3 = this.f17799x;
                if (t80Var3 != null) {
                    t80Var3.a();
                }
            }
            runnable.run();
        }
        t80 t80Var4 = this.f17799x;
        if (t80Var4 != null) {
            if (z10 || t80Var4.d()) {
                float strokeWidth = this.f17799x.f30520x.getStrokeWidth();
                RectF rectF = this.f17801z;
                rectF.set(0.0f, 0.0f, this.e, c());
                float f7 = strokeWidth / 2.0f;
                rectF.inset(f7, f7);
                this.f17799x.i((c() / 2.0f) - f7);
                this.f17799x.e(rectF);
                this.f17799x.g(org.telegram.ui.ActionBar.t6.r1(0.07f, this.f17788l), org.telegram.ui.ActionBar.t6.r1(0.175f, this.f17788l), org.telegram.ui.ActionBar.t6.r1(0.175f, this.f17788l), org.telegram.ui.ActionBar.t6.r1(0.42f, this.f17788l));
                this.f17799x.setAlpha(255);
                this.f17799x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f7;
        boolean z10 = this.f17783f;
        vv vvVar = this.f17792p;
        if (z10) {
            f7 = vvVar.M * 1.166666f;
        } else {
            f7 = vvVar.M + 18;
        }
        return i0.L(f7);
    }

    public final int d() {
        if (this.f17785i != null) {
            return (i0.L(11.66f) / 2) + i0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f7;
        if (this.f17795s) {
            return 0;
        }
        boolean z10 = this.f17793q;
        boolean z11 = this.f17783f;
        if (z10 && z11) {
            return i0.L(4.0f);
        }
        if (z11) {
            return i0.L(7.0f);
        }
        if (this.f17785i != null) {
            f7 = 26.0f;
        } else {
            f7 = 20.0f;
        }
        return i0.L(f7);
    }

    public final int g() {
        float f7;
        int i10 = 0;
        if (this.f17795s) {
            return 0;
        }
        boolean z10 = this.f17794r;
        boolean z11 = this.f17783f;
        Drawable drawable = this.f17785i;
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
        if (this.f17795s) {
            return 0;
        }
        if (this.f17783f) {
            return f();
        }
        return i0.L(8.0f);
    }

    public final int j() {
        int i10;
        int max;
        if (this.f17795s) {
            return this.e;
        }
        if (this.f17783f) {
            i10 = this.e;
            max = g();
        } else {
            i10 = this.e;
            max = Math.max(i0.L(8.0f), d());
        }
        return i10 - max;
    }

    public final int k() {
        uv uvVar = this.f17780a;
        return uvVar.h - uvVar.f18398f;
    }

    public final float l() {
        if (this.f17783f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f17785i == null) {
            return (this.e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.e - k()) / 2.0f, (this.e - d()) - k()), i0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f7;
        long j10;
        if (this.f17797u != z10) {
            this.f17797u = z10;
            this.f17796t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f17798w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f17798w.cancel();
                    this.f17798w = null;
                    return;
                }
                return;
            }
            float f10 = this.v;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.f17798w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f17798w.addListener(new bg.e(this, 18));
                ValueAnimator valueAnimator2 = this.f17798w;
                boolean z11 = this.f17783f;
                if (z11) {
                    f7 = 3.5f;
                } else {
                    f7 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f7));
                ValueAnimator valueAnimator3 = this.f17798w;
                if (z11) {
                    j10 = 420;
                } else {
                    j10 = 350;
                }
                valueAnimator3.setDuration(j10);
                this.f17798w.start();
            }
        }
    }
}
