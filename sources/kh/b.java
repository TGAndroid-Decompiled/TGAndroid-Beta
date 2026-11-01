package kh;

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
import fe.j;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b6;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.w0;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w8;
import rf.o;
public final class b extends Drawable implements z5 {
    public final fe.b D;
    public final RadialProgress2 E;
    public kj F;
    public final a5.a G;
    public String H;
    public final int I;
    public boolean J;
    public int K;
    public int L;
    public final e6 f11374a;
    public final w8 f11375b;
    public final ImageReceiver f11376c;
    public final View d;
    public final int e;
    public boolean f11377f;
    public boolean h;
    public boolean f11378n;
    public boolean f11379r;
    public Drawable f11380s;
    public boolean f11381w;
    public final Paint f11382x;
    public final Paint f11383y;

    public b(int i10, View view) {
        Paint paint = new Paint(1);
        this.f11382x = paint;
        this.f11383y = new Paint(1);
        this.G = new a5.a((char) 0, 16);
        this.e = i10;
        this.d = view;
        this.D = new fe.b(view, gr.h, 380L);
        e6 e6Var = new e6(false, false, false);
        this.f11374a = e6Var;
        e6Var.f25744b = 21;
        e6Var.w(i0.L(11.0f));
        e6Var.setCallback(view);
        this.f11375b = new w8(i10, view, i0.L(18.0f), i0.L(8.33f), i0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f11376c = imageReceiver;
        imageReceiver.J0(i0.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(18.0f));
        radialProgress2.d = -1;
        this.I = b6.q(i10).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j10;
        TLRPC.PhotoSize w9 = b8.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w10 = b8.w(photo.sizes, i0.L(36.0f), false, w9, true);
        jc f7 = jc.f(w10, photo);
        jc f10 = jc.f(w9, photo);
        if (w10 != null) {
            j10 = w10.size;
        } else {
            j10 = 0;
        }
        this.f11376c.r0(f7, "36_36", f10, "36_36_b", null, j10, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i10;
        if (!this.F.o4() && !this.F.Y2()) {
            if (!TextUtils.isEmpty(this.H) && b8.G(this.e).T(this.H)) {
                g(3, z10);
                return;
            }
            if (this.f11381w) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            g(i10, z10);
        }
    }

    public final void c(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        int x02;
        Rect bounds = getBounds();
        if (this.f11377f) {
            f7 = 56.33f;
        } else {
            f7 = 19.0f;
        }
        int L = i0.L(f7);
        if (this.D.e > 0.0f) {
            j jVar = this.f11375b.f32167c.d;
            float f10 = jVar.f7041c.f7049a;
            int i12 = (int) jVar.f7042f.f7049a;
            int W1 = (bounds.right - L) - i0.W1(f10, i0.L(2.0f), i0.L(4.0f) + i12);
            if (f10 > 0.0f) {
                w8 w8Var = this.f11375b;
                w8Var.f32170i = (int) (this.D.e * 255.0f);
                w8Var.setBounds((bounds.right - L) - i12, bounds.bottom - i0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f11375b.c(canvas);
            }
            int L2 = bounds.bottom - i0.L(21.33f);
            e6 e6Var = this.f11374a;
            e6Var.B = (int) (this.D.e * 255.0f);
            e6Var.setBounds(bounds.left, i0.L(15.0f) + L2, W1, L2 - i0.L(15.0f));
            this.f11374a.draw(canvas);
        }
        if (this.h) {
            int L3 = i0.L(36.0f);
            Rect rect = i0.Q;
            rect.set(m5.z(9.0f, bounds.right, L3), m5.z(4.0f, bounds.bottom, L3), bounds.right - i0.L(9.0f), bounds.bottom - i0.L(4.0f));
            RectF rectF = i0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.E;
            radialProgress2.f24124a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f11376c.z0(rect);
            if (!this.f11378n || this.f11379r) {
                this.f11376c.h(canvas, null);
            }
            if (this.f11381w || this.f11378n) {
                if (this.f11378n && !this.f11379r) {
                    Paint paint = this.f11383y;
                    if (this.F.P3()) {
                        i10 = t6.Tc;
                    } else {
                        i10 = t6.Sc;
                    }
                    paint.setColor(i0.b.o(t6.x0(null, i10, false), 16));
                    canvas.drawRoundRect(rectF, i0.L(5.0f), i0.L(5.0f), this.f11383y);
                } else {
                    canvas.drawRoundRect(rectF, i0.L(5.0f), i0.L(5.0f), this.f11382x);
                }
            }
            if (this.f11378n) {
                if (this.f11380s == null) {
                    this.f11380s = i0.a.f(w0.f18945b, 2131231744);
                }
                Drawable drawable = this.f11380s;
                a5.a aVar = this.G;
                if (this.f11379r) {
                    x02 = -1;
                } else {
                    if (this.F.P3()) {
                        i11 = t6.gc;
                    } else {
                        i11 = t6.f20900be;
                    }
                    x02 = t6.x0(null, i11, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.f282c) == null || aVar.f281b != x02 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.f282c = new PorterDuffColorFilter(x02, mode);
                    aVar.f281b = x02;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.f282c);
                o.e(this.f11380s, rectF.centerX(), rectF.centerY(), i0.L(24.0f), i0.L(24.0f), 17);
                this.f11380s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f7) {
        w8 w8Var = this.f11375b;
        float c10 = this.f11374a.c() + w8Var.f32167c.d.f7042f.f7049a;
        float L = w8Var.f32167c.d.f7041c.f7049a * i0.L(4.0f);
        float f10 = this.D.e;
        return (f7 * f10) + (L * f10) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i10;
        float f7 = this.f11374a.d;
        int i11 = this.K;
        if (i11 > 0) {
            i10 = i0.L((i11 * 9.34f) + 8.66f);
        } else {
            i10 = 0;
        }
        return f7 + i10;
    }

    public final void f(boolean z10) {
        this.f11377f = z10;
    }

    public final void g(int i10, boolean z10) {
        if (this.L != i10) {
            this.L = i10;
            this.E.setIcon(i10, true, z10);
        }
    }

    @Override
    public final int getObserverTag() {
        return this.I;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(org.telegram.messenger.kj r27, org.telegram.tgnet.TLRPC.MessageMedia r28, org.telegram.messenger.kj r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: kh.b.h(org.telegram.messenger.kj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.kj, java.lang.String, boolean):void");
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.p(true, min);
        if (min < 1.0f) {
            i10 = 3;
        } else if (this.f11381w) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z10) {
        int i10;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.K = i10;
        this.f11375b.d(arrayList, z10);
    }

    public final void k(int i10, boolean z10) {
        String str = null;
        if (i10 > 0) {
            str = dd.S(null, i10);
        }
        this.f11374a.t(str, z10, true);
    }

    public final void l(int i10) {
        this.f11374a.u(i10);
    }

    @Override
    public final void o(long j10, long j11) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.p(true, min);
        if (min < 1.0f) {
            i10 = 3;
        } else if (this.f11381w) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    @Override
    public final void D(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
