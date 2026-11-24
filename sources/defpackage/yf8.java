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
public final class yf8 extends Drawable implements cr3 {
    public final fn0 E;
    public final RadialProgress2 F;
    public k47 G;
    public final kq H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final ho a;
    public final jd0 b;
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

    public yf8(int i, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.H = new kq((byte) 11, false);
        this.e = i;
        this.d = view;
        this.E = new fn0(380L, view, d53.h);
        ho hoVar = new ho(false, false, false);
        this.a = hoVar;
        hoVar.b = 21;
        hoVar.w(gm.L(11.0f));
        hoVar.setCallback(view);
        this.b = new jd0(i, view, gm.L(18.0f), gm.L(8.33f), gm.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.q0(gm.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(gm.L(18.0f));
        radialProgress2.d = -1;
        this.J = er3.q(i).k();
    }

    public final void a(TLRPC.Photo photo, k47 k47Var) {
        long j;
        TLRPC.PhotoSize w = bc4.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w2 = bc4.w(photo.sizes, gm.L(36.0f), false, w, true);
        gn5 f = gn5.f(w2, photo);
        gn5 f2 = gn5.f(w, photo);
        if (w2 != null) {
            j = w2.size;
        } else {
            j = 0;
        }
        this.c.Z(f, "36_36", f2, "36_36_b", null, j, null, k47Var, 1);
    }

    public final void b(boolean z) {
        int i;
        if (!this.G.n4() && !this.G.Y2()) {
            if (!TextUtils.isEmpty(this.I) && bc4.G(this.e).S(this.I)) {
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
        int L = gm.L(f);
        if (this.E.e > 0.0f) {
            w66 w66Var = this.b.c.d;
            float f2 = w66Var.c.a;
            int i3 = (int) w66Var.f.a;
            int U1 = (bounds.right - L) - gm.U1(f2, gm.L(2.0f), gm.L(4.0f) + i3);
            if (f2 > 0.0f) {
                jd0 jd0Var = this.b;
                jd0Var.i = (int) (this.E.e * 255.0f);
                jd0Var.setBounds((bounds.right - L) - i3, bounds.bottom - gm.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - gm.L(21.33f);
            ho hoVar = this.a;
            hoVar.C = (int) (this.E.e * 255.0f);
            hoVar.setBounds(bounds.left, gm.L(15.0f) + L2, U1, L2 - gm.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = gm.L(36.0f);
            Rect rect = gm.Q;
            rect.set(kt6.y(9.0f, bounds.right, L3), kt6.y(4.0f, bounds.bottom, L3), bounds.right - gm.L(9.0f), bounds.bottom - gm.L(4.0f));
            RectF rectF = gm.P;
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
                        i = cmb.Vc;
                    } else {
                        i = cmb.Uc;
                    }
                    paint.setColor(on2.p(cmb.w0(null, i, false), 16));
                    canvas.drawRoundRect(rectF, gm.L(5.0f), gm.L(5.0f), this.y);
                } else {
                    canvas.drawRoundRect(rectF, gm.L(5.0f), gm.L(5.0f), this.x);
                }
            }
            if (this.n) {
                Drawable drawable = this.s;
                if (drawable == null) {
                    drawable = b10.d(a.b, 2131231750);
                    this.s = drawable;
                }
                kq kqVar = this.H;
                if (this.r) {
                    w0 = -1;
                } else {
                    if (this.G.O3()) {
                        i2 = cmb.ic;
                    } else {
                        i2 = cmb.de;
                    }
                    w0 = cmb.w0(null, i2, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                kqVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) kqVar.c;
                if (porterDuffColorFilter == null || kqVar.b != w0 || ((PorterDuff.Mode) kqVar.d) != mode) {
                    porterDuffColorFilter = new PorterDuffColorFilter(w0, mode);
                    kqVar.c = porterDuffColorFilter;
                    kqVar.b = w0;
                    kqVar.d = mode;
                }
                drawable.setColorFilter(porterDuffColorFilter);
                ur3.e(this.s, rectF.centerX(), rectF.centerY(), gm.L(24.0f), gm.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f) {
        jd0 jd0Var = this.b;
        float c = this.a.c() + jd0Var.c.d.f.a;
        float f2 = jd0Var.c.d.c.a;
        float f3 = this.E.e;
        return (f * f3) + (f2 * gm.L(4.0f) * f3) + c;
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
            i = gm.L((i2 * 9.34f) + 8.66f);
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

    public final void g(defpackage.k47 r27, org.telegram.tgnet.TLRPC.MessageMedia r28, defpackage.k47 r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf8.g(k47, org.telegram.tgnet.TLRPC$MessageMedia, k47, java.lang.String, boolean):void");
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
            str = jb6.S(null, i);
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
    public final void A(boolean z) {
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
