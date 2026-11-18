package ki;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.v6;
import org.telegram.ui.Components.vy0;
public final class c4 extends Drawable implements v6, fs {
    public final Paint f18609a;
    public final Paint f18610b;
    public final ImageReceiver f18611c;
    public final ImageReceiver d;
    public int f18612e;
    public final o5[] f18613f;
    public final vy0 h;
    public final RectF f18614n;
    public final boolean f18615r;
    public final c6 f18616s;
    public boolean f18617w;
    public boolean f18618x;
    public View f18619y;

    public c4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f18609a = paint;
        Paint paint2 = new Paint(1);
        this.f18610b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f18611c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.f18612e = 1;
        this.f18613f = new o5[2];
        this.f18614n = new RectF();
        this.f18616s = new c6(new b4(this, 1), 320L, lr.h, 0);
        this.f18615r = false;
        int i7 = n6.f29396d6;
        paint.setColor(n6.x0(null, i7, false));
        paint2.setColor(n6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), n6.r1(0.18f, -16777216));
        b9 b9Var = new b9((i6) null);
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        d();
        this.h = new vy0(o10.q(user), 14.0f, null);
    }

    @Override
    public final void a(ph0 ph0Var) {
        this.f18619y = ph0Var;
        this.d.H0(ph0Var);
        this.f18611c.H0(ph0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f18618x = false;
        this.f18611c.R();
        this.d.R();
        ks.f(j10.f24773t0).n(this, ks.C1);
        o5[] o5VarArr = this.f18613f;
        o5 o5Var = o5VarArr[0];
        if (o5Var != null) {
            o5Var.n(this.f18619y);
        }
        o5 o5Var2 = o5VarArr[1];
        if (o5Var2 != null) {
            o5Var2.n(this.f18619y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f18618x = true;
        this.f18611c.P();
        this.d.P();
        ks.f(j10.f24773t0).c(this, ks.C1);
        o5[] o5VarArr = this.f18613f;
        o5 o5Var = o5VarArr[0];
        if (o5Var != null) {
            o5Var.a(this.f18619y);
        }
        o5 o5Var2 = o5VarArr[1];
        if (o5Var2 != null) {
            o5Var2.a(this.f18619y);
        }
    }

    public final void d() {
        o5 o5Var;
        TLRPC.TL_messages_stickerSet o02 = ri.d0(j10.f24773t0).o0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (o02 != null && !o02.documents.isEmpty()) {
            TLRPC.Document document = o02.documents.get((int) Math.floor(Math.random() * o02.documents.size()));
            int i7 = 1 - this.f18612e;
            this.f18612e = i7;
            o5[] o5VarArr = this.f18613f;
            o5 o5Var2 = o5VarArr[i7];
            if (o5Var2 != null) {
                o5Var2.n(this.f18619y);
            }
            o5VarArr[this.f18612e] = o5.l(j10.f24773t0, 9, document);
            o5VarArr[this.f18612e].setColorFilter(new PorterDuffColorFilter(n6.x0(null, n6.Fi, false), PorterDuff.Mode.SRC_IN));
            if (this.f18618x && (o5Var = o5VarArr[this.f18612e]) != null) {
                o5Var.a(this.f18619y);
            }
            org.telegram.messenger.g0.h3(new b4(this, 0), 2500L);
            return;
        }
        this.f18617w = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.B0 && this.f18617w && this.f18618x) {
            this.f18617w = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        o5 o5Var;
        o5 o5Var2;
        int i10;
        Rect bounds = getBounds();
        int x02 = n6.x0(null, n6.f29396d6, false);
        Paint paint = this.f18609a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.f18610b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.f18615r;
        if (z10) {
            i7 = 48;
        } else {
            i7 = 28;
        }
        float L = (org.telegram.messenger.g0.L((i7 + 38) + 6.66f) + this.h.f41482c) / 2.0f;
        float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
        RectF rectF = this.f18614n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.f18611c;
        imageReceiver.y0(rectF.left, rectF.top, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.g0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, n6.x0(null, n6.G6, false), canvas);
        if (z10) {
            float L3 = rectF.right - org.telegram.messenger.g0.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), org.telegram.messenger.g0.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L3 - org.telegram.messenger.g0.L(16.0f), rectF.centerY() - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e10 = this.f18616s.e(false, this.f18612e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.g0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.g0.L(12.0f)));
        int i11 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        int i12 = -1;
        o5[] o5VarArr = this.f18613f;
        if (i11 < 0 && (o5Var2 = o5VarArr[0]) != null) {
            canvas.save();
            f10 = 24.0f;
            if (this.f18612e == 0) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            canvas.translate(0.0f, i10 * org.telegram.messenger.g0.L(9.0f) * e10);
            float f14 = 1.0f - e10;
            f11 = 1.0f;
            float f15 = (f14 * 0.4f) + 0.6f;
            f12 = 12.0f;
            f13 = 255.0f;
            canvas.scale(f15, f15, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            o5Var2.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            o5Var2.setAlpha((int) (f14 * 255.0f));
            o5Var2.draw(canvas);
            canvas.restore();
        } else {
            f10 = 24.0f;
            f11 = 1.0f;
            f12 = 12.0f;
            f13 = 255.0f;
        }
        if (e10 > 0.0f && (o5Var = o5VarArr[1]) != null) {
            canvas.save();
            if (this.f18612e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (f11 - e10) * org.telegram.messenger.g0.L(9.0f) * i12);
            float f16 = (0.4f * e10) + 0.6f;
            canvas.scale(f16, f16, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
            o5Var.setBounds(0, 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            o5Var.setAlpha((int) (e10 * f13));
            o5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public c4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f18609a = paint;
        Paint paint2 = new Paint(1);
        this.f18610b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f18611c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.f18612e = 1;
        this.f18613f = new o5[2];
        this.f18614n = new RectF();
        this.f18616s = new c6(new b4(this, 1), 320L, lr.h, 0);
        this.f18615r = true;
        int i7 = n6.f29396d6;
        paint.setColor(n6.x0(null, i7, false));
        paint2.setColor(n6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), n6.r1(0.18f, -16777216));
        b9 b9Var = new b9((i6) null);
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, 120, false, null, false);
        imageReceiver2.r0(fc.b(document), "120_120", fc.c(w10, document), "120_120", u5.d(document.thumbs, n6.f29339a7, 0.35f, false), 0L, null, null, 0);
        this.h = new vy0(o10.q(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
