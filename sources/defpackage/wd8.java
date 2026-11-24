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
public final class wd8 extends Drawable implements sp3 {
    public final fm0 E;
    public final RadialProgress2 F;
    public k27 G;
    public final kp H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final gn a;
    public final jc0 b;
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

    public wd8(int i, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.H = new kp((byte) 11, false);
        this.e = i;
        this.d = view;
        this.E = new fm0(380L, view, s33.h);
        gn gnVar = new gn(false, false, false);
        this.a = gnVar;
        gnVar.b = 21;
        gnVar.w(gl.L(11.0f));
        gnVar.setCallback(view);
        this.b = new jc0(i, view, gl.L(18.0f), gl.L(8.33f), gl.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.q0(gl.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(18.0f));
        radialProgress2.d = -1;
        this.J = up3.q(i).k();
    }

    public final void a(TLRPC.Photo photo, k27 k27Var) {
        long j;
        TLRPC.PhotoSize w = ba4.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w2 = ba4.w(photo.sizes, gl.L(36.0f), false, w, true);
        gl5 f = gl5.f(w2, photo);
        gl5 f2 = gl5.f(w, photo);
        if (w2 != null) {
            j = w2.size;
        } else {
            j = 0;
        }
        this.c.Z(f, "36_36", f2, "36_36_b", null, j, null, k27Var, 1);
    }

    public final void b(boolean z) {
        int i;
        if (!this.G.n4() && !this.G.Y2()) {
            if (!TextUtils.isEmpty(this.I) && ba4.G(this.e).S(this.I)) {
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
        int L = gl.L(f);
        if (this.E.e > 0.0f) {
            w46 w46Var = this.b.c.d;
            float f2 = w46Var.c.a;
            int i3 = (int) w46Var.f.a;
            int U1 = (bounds.right - L) - gl.U1(f2, gl.L(2.0f), gl.L(4.0f) + i3);
            if (f2 > 0.0f) {
                jc0 jc0Var = this.b;
                jc0Var.i = (int) (this.E.e * 255.0f);
                jc0Var.setBounds((bounds.right - L) - i3, bounds.bottom - gl.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - gl.L(21.33f);
            gn gnVar = this.a;
            gnVar.C = (int) (this.E.e * 255.0f);
            gnVar.setBounds(bounds.left, gl.L(15.0f) + L2, U1, L2 - gl.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = gl.L(36.0f);
            Rect rect = gl.Q;
            rect.set(ls6.x(9.0f, bounds.right, L3), ls6.x(4.0f, bounds.bottom, L3), bounds.right - gl.L(9.0f), bounds.bottom - gl.L(4.0f));
            RectF rectF = gl.P;
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
                        i = bkb.Vc;
                    } else {
                        i = bkb.Uc;
                    }
                    paint.setColor(bm2.o(bkb.w0(null, i, false), 16));
                    canvas.drawRoundRect(rectF, gl.L(5.0f), gl.L(5.0f), this.y);
                } else {
                    canvas.drawRoundRect(rectF, gl.L(5.0f), gl.L(5.0f), this.x);
                }
            }
            if (this.n) {
                Drawable drawable = this.s;
                if (drawable == null) {
                    drawable = b00.d(a.b, 2131231749);
                    this.s = drawable;
                }
                kp kpVar = this.H;
                if (this.r) {
                    w0 = -1;
                } else {
                    if (this.G.O3()) {
                        i2 = bkb.ic;
                    } else {
                        i2 = bkb.de;
                    }
                    w0 = bkb.w0(null, i2, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                kpVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) kpVar.c;
                if (porterDuffColorFilter == null || kpVar.b != w0 || ((PorterDuff.Mode) kpVar.d) != mode) {
                    porterDuffColorFilter = new PorterDuffColorFilter(w0, mode);
                    kpVar.c = porterDuffColorFilter;
                    kpVar.b = w0;
                    kpVar.d = mode;
                }
                drawable.setColorFilter(porterDuffColorFilter);
                kq3.e(this.s, rectF.centerX(), rectF.centerY(), gl.L(24.0f), gl.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f) {
        jc0 jc0Var = this.b;
        float c = this.a.c() + jc0Var.c.d.f.a;
        float f2 = jc0Var.c.d.c.a;
        float f3 = this.E.e;
        return (f * f3) + (f2 * gl.L(4.0f) * f3) + c;
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
            i = gl.L((i2 * 9.34f) + 8.66f);
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

    public final void g(defpackage.k27 r27, org.telegram.tgnet.TLRPC.MessageMedia r28, defpackage.k27 r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd8.g(k27, org.telegram.tgnet.TLRPC$MessageMedia, k27, java.lang.String, boolean):void");
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
            str = k96.S(null, i);
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
