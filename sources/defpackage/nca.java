package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class nca extends Drawable implements zx, fn7 {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final wl[] f;
    public final pkb h;
    public final RectF n;
    public final boolean r;
    public final mm s;
    public boolean w;
    public boolean x;
    public e29 y;

    public nca(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new wl[2];
        this.n = new RectF();
        this.s = new mm(new mca(this, (byte) 1), 320L, k43.h, 0);
        this.r = true;
        int i = aob.d6;
        paint.setColor(aob.w0(null, i, false));
        paint2.setColor(aob.w0(null, i, false));
        paint2.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(2.0f), aob.p1(0.18f, -16777216));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
        imageReceiver.q0(hl.L(16.0f));
        TLRPC.PhotoSize w = xb4.w(document.thumbs, 120, false, null, false);
        imageReceiver2.Z(jn5.b(document), "120_120", jn5.c(w, document), "120_120", lp3.d(document.thumbs, aob.a7, 0.35f, false), 0L, null, null, 0);
        this.h = new pkb(lbc.r(user), 14.0f, null);
    }

    @Override
    public final void a(e29 e29Var) {
        this.y = e29Var;
        this.d.p0(e29Var);
        this.c.p0(e29Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.K();
        this.d.K();
        jn7.f(yac.t0).n(this, jn7.C1);
        wl[] wlVarArr = this.f;
        wl wlVar = wlVarArr[0];
        if (wlVar != null) {
            wlVar.o(this.y);
        }
        wl wlVar2 = wlVarArr[1];
        if (wlVar2 != null) {
            wlVar2.o(this.y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.I();
        this.d.I();
        jn7.f(yac.t0).b(this, jn7.C1);
        wl[] wlVarArr = this.f;
        wl wlVar = wlVarArr[0];
        if (wlVar != null) {
            wlVar.b(this.y);
        }
        wl wlVar2 = wlVarArr[1];
        if (wlVar2 != null) {
            wlVar2.b(this.y);
        }
    }

    public final void d() {
        wl wlVar;
        TLRPC.TL_messages_stickerSet n0 = ls6.d0(yac.t0).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (n0 != null && !n0.documents.isEmpty()) {
            TLRPC.Document document = n0.documents.get((int) Math.floor(Math.random() * n0.documents.size()));
            int i = 1 - this.e;
            this.e = i;
            wl[] wlVarArr = this.f;
            wl wlVar2 = wlVarArr[i];
            if (wlVar2 != null) {
                wlVar2.o(this.y);
            }
            wlVarArr[this.e] = wl.l(yac.t0, 9, document);
            wlVarArr[this.e].setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.Fi, false), PorterDuff.Mode.SRC_IN));
            if (this.x && (wlVar = wlVarArr[this.e]) != null) {
                wlVar.b(this.y);
            }
            hl.d3(new mca(this, (byte) 0), 2500L);
            return;
        }
        this.w = true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.B0 && this.w && this.x) {
            this.w = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        wl wlVar;
        wl wlVar2;
        int i2;
        Rect bounds = getBounds();
        int w0 = aob.w0(null, aob.d6, false);
        Paint paint = this.a;
        if (paint.getColor() != w0) {
            paint.setColor(w0);
        }
        Paint paint2 = this.b;
        if (paint2.getColor() != w0) {
            paint2.setColor(w0);
        }
        boolean z = this.r;
        if (z) {
            i = 48;
        } else {
            i = 28;
        }
        float L = (hl.L((i + 38) + 6.66f) + this.h.c) / 2.0f;
        float L2 = hl.L(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(rectF.left, rectF.top, hl.L(32.0f), hl.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(hl.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, aob.w0(null, aob.G6, false), canvas);
        if (z) {
            float L3 = rectF.right - hl.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), hl.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.i0(L3 - hl.L(16.0f), rectF.centerY() - hl.L(16.0f), hl.L(32.0f), hl.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e = this.s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - hl.L(30.66f)), (int) (rectF.centerY() - hl.L(12.0f)));
        int i3 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        int i4 = -1;
        wl[] wlVarArr = this.f;
        if (i3 < 0 && (wlVar2 = wlVarArr[0]) != null) {
            canvas.save();
            f = 24.0f;
            if (this.e == 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            canvas.translate(0.0f, i2 * hl.L(9.0f) * e);
            float f5 = 1.0f - e;
            f2 = 1.0f;
            float f6 = (f5 * 0.4f) + 0.6f;
            f3 = 12.0f;
            f4 = 255.0f;
            canvas.scale(f6, f6, hl.L(12.0f), hl.L(12.0f));
            wlVar2.setBounds(0, 0, hl.L(24.0f), hl.L(24.0f));
            wlVar2.setAlpha((int) (f5 * 255.0f));
            wlVar2.draw(canvas);
            canvas.restore();
        } else {
            f = 24.0f;
            f2 = 1.0f;
            f3 = 12.0f;
            f4 = 255.0f;
        }
        if (e > 0.0f && (wlVar = wlVarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i4 = 1;
            }
            canvas.translate(0.0f, (f2 - e) * hl.L(9.0f) * i4);
            float f7 = (0.4f * e) + 0.6f;
            canvas.scale(f7, f7, hl.L(f3), hl.L(f3));
            wlVar.setBounds(0, 0, hl.L(f), hl.L(f));
            wlVar.setAlpha((int) (e * f4));
            wlVar.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public nca(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new wl[2];
        this.n = new RectF();
        this.s = new mm(new mca(this, (byte) 1), 320L, k43.h, 0);
        this.r = false;
        int i = aob.d6;
        paint.setColor(aob.w0(null, i, false));
        paint2.setColor(aob.w0(null, i, false));
        paint2.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(2.0f), aob.p1(0.18f, -16777216));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
        imageReceiver.q0(hl.L(16.0f));
        d();
        this.h = new pkb(lbc.r(user), 14.0f, null);
    }
}
