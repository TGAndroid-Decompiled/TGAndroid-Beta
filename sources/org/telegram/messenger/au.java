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
    public final dv f22946a;
    public final boolean f22947b;
    public final TL_keyboard.PageButton f22948c;
    public int d;
    public int f22949e;
    public final boolean f22950f;
    public final boolean h;
    public final Drawable f22952i;
    public final int f22953j;
    public final int f22954k;
    public final int f22955l;
    public final PorterDuffColorFilter f22956m;
    public PorterDuffColorFilter f22957n;
    public int f22958o;
    public final ev f22959p;
    public final boolean f22960q;
    public final boolean f22961r;
    public final boolean f22962s;
    public final Runnable f22963t;
    public boolean f22964u;
    public float v;
    public ValueAnimator f22965w;
    public o80 f22966x;
    public boolean f22967y;
    public final Paint f22951g = new Paint(1);
    public final RectF f22968z = new RectF();
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
        if (this.f22964u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f24119r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f22963t.run();
            }
        }
        boolean z12 = this.f22950f;
        if (z12) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f22949e / 2.0f, c() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f22962s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.f22949e, c(), null);
        } else {
            if (this.f22964u) {
                i7 = this.f22954k;
            } else {
                i7 = this.f22953j;
            }
            Paint paint = this.f22951g;
            paint.setColor(i7);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f22949e, c(), c() / 2.0f, c() / 2.0f, paint);
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
        dv dvVar = this.f22946a;
        StaticLayout staticLayout = dvVar.f23577b;
        ArrayList arrayList = dvVar.f23585x;
        StaticLayout staticLayout2 = dvVar.f23577b;
        int i14 = dvVar.f23580f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (dvVar.f23583s <= 0) {
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
        ev evVar = this.f22959p;
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
                if (this.f22958o != i15 || this.f22957n == null) {
                    this.f22958o = i15;
                    this.f22957n = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = j3;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23577b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f22957n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = j3;
                canvas2 = canvas;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23577b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f22956m);
            }
        } else {
            f11 = 2.0f;
            i11 = j3;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, c());
            evVar.f23789z.n(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f22952i;
        if (drawable != null) {
            float L = this.f22949e - g0.L(12.33f);
            if (z12) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            bg.t.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f22964u) {
                i12 = this.f22954k;
            } else {
                i12 = this.f22953j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f22949e, c(), c() / f11, c() / f11, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var;
        TL_keyboard.PageButton pageButton = this.f22948c;
        if (pageButton != null && (r1Var = this.f22959p.E) != null && r1Var.P0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f22967y;
        Runnable runnable = this.f22963t;
        if (z11 != z10) {
            this.f22967y = z10;
            if (z10) {
                o80 o80Var = this.f22966x;
                if (o80Var == null) {
                    o80 o80Var2 = new o80();
                    this.f22966x = o80Var2;
                    o80Var2.D = true;
                    o80Var2.f38032x.setStrokeWidth(g0.N(1.25f));
                } else {
                    o80Var.f38013b = -1L;
                    o80Var.f38014c = -1L;
                }
            } else {
                o80 o80Var3 = this.f22966x;
                if (o80Var3 != null) {
                    o80Var3.a();
                }
            }
            runnable.run();
        }
        o80 o80Var4 = this.f22966x;
        if (o80Var4 != null) {
            if (z10 || o80Var4.d()) {
                float strokeWidth = this.f22966x.f38032x.getStrokeWidth();
                RectF rectF = this.f22968z;
                rectF.set(0.0f, 0.0f, this.f22949e, c());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f22966x.i((c() / 2.0f) - f10);
                this.f22966x.e(rectF);
                this.f22966x.g(org.telegram.ui.ActionBar.n6.r1(0.07f, this.f22955l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.f22955l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.f22955l), org.telegram.ui.ActionBar.n6.r1(0.42f, this.f22955l));
                this.f22966x.setAlpha(255);
                this.f22966x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f10;
        boolean z10 = this.f22950f;
        ev evVar = this.f22959p;
        if (z10) {
            f10 = evVar.M * 1.166666f;
        } else {
            f10 = evVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int d() {
        if (this.f22952i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f10;
        if (this.f22962s) {
            return 0;
        }
        boolean z10 = this.f22960q;
        boolean z11 = this.f22950f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        if (this.f22952i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int g() {
        float f10;
        int i7 = 0;
        if (this.f22962s) {
            return 0;
        }
        boolean z10 = this.f22961r;
        boolean z11 = this.f22950f;
        Drawable drawable = this.f22952i;
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
        if (this.f22962s) {
            return 0;
        }
        if (this.f22950f) {
            return f();
        }
        return g0.L(8.0f);
    }

    public final int j() {
        int i7;
        int max;
        if (this.f22962s) {
            return this.f22949e;
        }
        if (this.f22950f) {
            i7 = this.f22949e;
            max = g();
        } else {
            i7 = this.f22949e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i7 - max;
    }

    public final int k() {
        dv dvVar = this.f22946a;
        return dvVar.h - dvVar.f23580f;
    }

    public final float l() {
        if (this.f22950f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f22952i == null) {
            return (this.f22949e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.f22949e - k()) / 2.0f, (this.f22949e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f10;
        long j3;
        if (this.f22964u != z10) {
            this.f22964u = z10;
            this.f22963t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f22965w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f22965w.cancel();
                    this.f22965w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f22965w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f22965w.addListener(new ki.n3(this, 8));
                ValueAnimator valueAnimator2 = this.f22965w;
                boolean z11 = this.f22950f;
                if (z11) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f22965w;
                if (z11) {
                    j3 = 420;
                } else {
                    j3 = 350;
                }
                valueAnimator3.setDuration(j3);
                this.f22965w.start();
            }
        }
    }
}
