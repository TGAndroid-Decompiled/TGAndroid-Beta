package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class kh8 extends Drawable implements jq3 {
    public final fm0 E;
    public final RadialProgress2 F;
    public r47 G;
    public final lp H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final hn a;
    public final lc0 b;
    public final ImageReceiver c;
    public final View d;
    public final int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public Drawable s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    public kh8(int i, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.H = new lp((byte) 12, false);
        this.e = i;
        this.d = view;
        this.E = new fm0(380L, view, k43.h);
        hn hnVar = new hn(false, false, false);
        this.a = hnVar;
        hnVar.b = 21;
        hnVar.w(hl.L(11.0f));
        hnVar.setCallback(view);
        this.b = new lc0(i, view, hl.L(18.0f), hl.L(8.33f), hl.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.q0(hl.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(18.0f));
        radialProgress2.d = -1;
        this.J = lq3.q(i).k();
    }

    public final void a(TLRPC.Photo photo, r47 r47Var) {
        long j;
        TLRPC.PhotoSize w = xb4.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w2 = xb4.w(photo.sizes, hl.L(36.0f), false, w, true);
        jn5 f = jn5.f(w2, photo);
        jn5 f2 = jn5.f(w, photo);
        if (w2 != null) {
            j = w2.size;
        } else {
            j = 0;
        }
        this.c.Z(f, "36_36", f2, "36_36_b", null, j, null, r47Var, 1);
    }

    public final void b(boolean z) {
        int i;
        if (!this.G.n4() && !this.G.Y2()) {
            if (!TextUtils.isEmpty(this.I) && xb4.G(this.e).S(this.I)) {
                f(3, z);
                return;
            }
            if (this.w) {
                i = 0;
            } else {
                i = 4;
            }
            f(i, z);
        }
    }

    public final void c(Canvas canvas) {
        float f;
        int i;
        int i2;
        int w0;
        Rect bounds = getBounds();
        if (this.f) {
            f = 56.33f;
        } else {
            f = 19.0f;
        }
        int L = hl.L(f);
        if (this.E.e > 0.0f) {
            a76 a76Var = this.b.c.d;
            float f2 = a76Var.c.a;
            int i3 = (int) a76Var.f.a;
            int U1 = (bounds.right - L) - hl.U1(f2, hl.L(2.0f), hl.L(4.0f) + i3);
            if (f2 > 0.0f) {
                lc0 lc0Var = this.b;
                lc0Var.i = (int) (this.E.e * 255.0f);
                lc0Var.setBounds((bounds.right - L) - i3, bounds.bottom - hl.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - hl.L(21.33f);
            hn hnVar = this.a;
            hnVar.C = (int) (this.E.e * 255.0f);
            hnVar.setBounds(bounds.left, hl.L(15.0f) + L2, U1, L2 - hl.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = hl.L(36.0f);
            Rect rect = hl.Q;
            rect.set(qu6.x(9.0f, bounds.right, L3), qu6.x(4.0f, bounds.bottom, L3), bounds.right - hl.L(9.0f), bounds.bottom - hl.L(4.0f));
            RectF rectF = hl.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.F;
            radialProgress2.a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.c.j0(rect);
            if (!this.n || this.r) {
                this.c.h(canvas, null);
            }
            if (this.w || this.n) {
                if (this.n && !this.r) {
                    Paint paint = this.y;
                    if (this.G.O3()) {
                        i = aob.Wc;
                    } else {
                        i = aob.Vc;
                    }
                    paint.setColor(vm2.o(aob.w0(null, i, false), 16));
                    canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), this.y);
                } else {
                    canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), this.x);
                }
            }
            if (this.n) {
                Drawable drawable = this.s;
                if (drawable == null) {
                    drawable = c00.e(a.b, 2131231749);
                    this.s = drawable;
                }
                lp lpVar = this.H;
                if (this.r) {
                    w0 = -1;
                } else {
                    if (this.G.O3()) {
                        i2 = aob.jc;
                    } else {
                        i2 = aob.ee;
                    }
                    w0 = aob.w0(null, i2, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                lpVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) lpVar.c;
                if (porterDuffColorFilter == null || lpVar.b != w0 || ((PorterDuff.Mode) lpVar.d) != mode) {
                    porterDuffColorFilter = new PorterDuffColorFilter(w0, mode);
                    lpVar.c = porterDuffColorFilter;
                    lpVar.b = w0;
                    lpVar.d = mode;
                }
                drawable.setColorFilter(porterDuffColorFilter);
                br3.e(this.s, rectF.centerX(), rectF.centerY(), hl.L(24.0f), hl.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f) {
        lc0 lc0Var = this.b;
        float c = this.a.c() + lc0Var.c.d.f.a;
        float f2 = lc0Var.c.d.c.a;
        float f3 = this.E.e;
        return (f * f3) + (f2 * hl.L(4.0f) * f3) + c;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i;
        float f = this.a.d;
        int i2 = this.L;
        if (i2 > 0) {
            i = hl.L((i2 * 9.34f) + 8.66f);
        } else {
            i = 0;
        }
        return f + i;
    }

    public final void f(int i, boolean z) {
        if (this.M != i) {
            this.M = i;
            this.F.setIcon(i, true, z);
        }
    }

    public final void g(defpackage.r47 r27, org.telegram.tgnet.TLRPC.MessageMedia r28, defpackage.r47 r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh8.g(r47, org.telegram.tgnet.TLRPC$MessageMedia, r47, java.lang.String, boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.J;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(ArrayList arrayList, boolean z) {
        int i;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        this.L = i;
        this.b.d(arrayList, z);
    }

    @Override
    public final void i(long j, long j2) {
        float min;
        int i;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.F.o(true, min);
        if (min < 1.0f) {
            i = 3;
        } else if (this.w) {
            i = 0;
        } else {
            i = 4;
        }
        f(i, true);
        this.d.invalidate();
    }

    public final void j(int i, boolean z) {
        String str = null;
        if (i > 0) {
            str = ob6.S(null, i);
        }
        this.a.t(str, z, true);
    }

    public final void k(int i) {
        this.a.u(i);
    }

    @Override
    public final void l(long j, long j2) {
        float min;
        int i;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.F.o(true, min);
        if (min < 1.0f) {
            i = 3;
        } else if (this.w) {
            i = 0;
        } else {
            i = 4;
        }
        f(i, true);
        this.d.invalidate();
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
