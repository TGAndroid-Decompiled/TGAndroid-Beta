package ii;

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
import org.telegram.messenger.ac;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
public final class n4 extends Drawable implements p6, cs {
    public final Paint f15108a;
    public final Paint f15109b;
    public final ImageReceiver f15110c;
    public final ImageReceiver d;
    public int f15111e;
    public final g5[] f15112f;
    public final ly0 h;
    public final RectF f15113n;
    public final boolean f15114r;
    public final u5 f15115s;
    public boolean f15116w;
    public boolean f15117x;
    public View f15118y;

    public n4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f15108a = paint;
        Paint paint2 = new Paint(1);
        this.f15109b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f15110c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.f15111e = 1;
        this.f15112f = new g5[2];
        this.f15113n = new RectF();
        this.f15115s = new u5(new m4(this, 1), 320L, xq.h, 0);
        this.f15114r = false;
        int i3 = k6.f27878d6;
        paint.setColor(k6.x0(null, i3, false));
        paint2.setColor(k6.x0(null, i3, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), k6.r1(0.18f, -16777216));
        u8 u8Var = new u8((e6) null);
        u8Var.r(user);
        imageReceiver.i0(user, u8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        d();
        this.h = new ly0(l10.p(user), 14.0f, null);
    }

    @Override
    public final void a(fh0 fh0Var) {
        this.f15118y = fh0Var;
        this.d.H0(fh0Var);
        this.f15110c.H0(fh0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f15117x = false;
        this.f15110c.R();
        this.d.R();
        hs.f(h10.f22829t0).n(this, hs.C1);
        g5[] g5VarArr = this.f15112f;
        g5 g5Var = g5VarArr[0];
        if (g5Var != null) {
            g5Var.n(this.f15118y);
        }
        g5 g5Var2 = g5VarArr[1];
        if (g5Var2 != null) {
            g5Var2.n(this.f15118y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f15117x = true;
        this.f15110c.P();
        this.d.P();
        hs.f(h10.f22829t0).c(this, hs.C1);
        g5[] g5VarArr = this.f15112f;
        g5 g5Var = g5VarArr[0];
        if (g5Var != null) {
            g5Var.a(this.f15118y);
        }
        g5 g5Var2 = g5VarArr[1];
        if (g5Var2 != null) {
            g5Var2.a(this.f15118y);
        }
    }

    public final void d() {
        g5 g5Var;
        TLRPC.TL_messages_stickerSet m0 = li.b0(h10.f22829t0).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (m0 != null && !m0.documents.isEmpty()) {
            TLRPC.Document document = m0.documents.get((int) Math.floor(Math.random() * m0.documents.size()));
            int i3 = 1 - this.f15111e;
            this.f15111e = i3;
            g5[] g5VarArr = this.f15112f;
            g5 g5Var2 = g5VarArr[i3];
            if (g5Var2 != null) {
                g5Var2.n(this.f15118y);
            }
            g5VarArr[this.f15111e] = g5.l(h10.f22829t0, 9, document);
            g5VarArr[this.f15111e].setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.Ci, false), PorterDuff.Mode.SRC_IN));
            if (this.f15117x && (g5Var = g5VarArr[this.f15111e]) != null) {
                g5Var.a(this.f15118y);
            }
            org.telegram.messenger.g0.i3(new m4(this, 0), 2500L);
            return;
        }
        this.f15116w = true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.B0 && this.f15116w && this.f15117x) {
            this.f15116w = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        float f10;
        float f11;
        float f12;
        float f13;
        g5 g5Var;
        g5 g5Var2;
        int i10;
        Rect bounds = getBounds();
        int x02 = k6.x0(null, k6.f27878d6, false);
        Paint paint = this.f15108a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.f15109b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.f15114r;
        if (z10) {
            i3 = 48;
        } else {
            i3 = 28;
        }
        float L = (org.telegram.messenger.g0.L((i3 + 38) + 6.66f) + this.h.f35918c) / 2.0f;
        float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
        RectF rectF = this.f15113n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.f15110c;
        imageReceiver.y0(rectF.left, rectF.top, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.g0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, k6.x0(null, k6.G6, false), canvas);
        if (z10) {
            float L3 = rectF.right - org.telegram.messenger.g0.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), org.telegram.messenger.g0.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L3 - org.telegram.messenger.g0.L(16.0f), rectF.centerY() - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e10 = this.f15115s.e(false, this.f15111e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.g0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.g0.L(12.0f)));
        int i11 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        int i12 = -1;
        g5[] g5VarArr = this.f15112f;
        if (i11 < 0 && (g5Var2 = g5VarArr[0]) != null) {
            canvas.save();
            f10 = 24.0f;
            if (this.f15111e == 0) {
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
            g5Var2.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            g5Var2.setAlpha((int) (f14 * 255.0f));
            g5Var2.draw(canvas);
            canvas.restore();
        } else {
            f10 = 24.0f;
            f11 = 1.0f;
            f12 = 12.0f;
            f13 = 255.0f;
        }
        if (e10 > 0.0f && (g5Var = g5VarArr[1]) != null) {
            canvas.save();
            if (this.f15111e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (f11 - e10) * org.telegram.messenger.g0.L(9.0f) * i12);
            float f16 = (0.4f * e10) + 0.6f;
            canvas.scale(f16, f16, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
            g5Var.setBounds(0, 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            g5Var.setAlpha((int) (e10 * f13));
            g5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public n4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f15108a = paint;
        Paint paint2 = new Paint(1);
        this.f15109b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f15110c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.f15111e = 1;
        this.f15112f = new g5[2];
        this.f15113n = new RectF();
        this.f15115s = new u5(new m4(this, 1), 320L, xq.h, 0);
        this.f15114r = true;
        int i3 = k6.f27878d6;
        paint.setColor(k6.x0(null, i3, false));
        paint2.setColor(k6.x0(null, i3, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), k6.r1(0.18f, -16777216));
        u8 u8Var = new u8((e6) null);
        u8Var.r(user);
        imageReceiver.i0(user, u8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, 120, false, null, false);
        imageReceiver2.r0(ac.b(document), "120_120", ac.c(w10, document), "120_120", t5.d(document.thumbs, k6.f27824a7, 0.35f, false), 0L, null, null, 0);
        this.h = new ly0(l10.p(user), 14.0f, null);
    }
}
