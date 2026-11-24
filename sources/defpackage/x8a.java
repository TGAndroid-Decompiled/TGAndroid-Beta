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
public final class x8a extends Drawable implements yx, gk7 {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final vl[] f;
    public final tgb h;
    public final RectF n;
    public final boolean r;
    public final lm s;
    public boolean w;
    public boolean x;
    public ry8 y;

    public x8a(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new vl[2];
        this.n = new RectF();
        this.s = new lm(new w8a(this, (byte) 1), 320L, s33.h, 0);
        this.r = true;
        int i = bkb.c6;
        paint.setColor(bkb.w0(null, i, false));
        paint2.setColor(bkb.w0(null, i, false));
        paint2.setShadowLayer(gl.L(2.33f), 0.0f, gl.L(2.0f), bkb.p1(0.18f, -16777216));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        imageReceiver.U(user, pb0Var, null);
        imageReceiver.q0(gl.L(16.0f));
        TLRPC.PhotoSize w = ba4.w(document.thumbs, 120, false, null, false);
        imageReceiver2.Z(gl5.b(document), "120_120", gl5.c(w, document), "120_120", uo3.d(document.thumbs, bkb.Z6, 0.35f, false), 0L, null, null, 0);
        this.h = new tgb(l7c.r(user), 14.0f, null);
    }

    @Override
    public final void a(ry8 ry8Var) {
        this.y = ry8Var;
        this.d.p0(ry8Var);
        this.c.p0(ry8Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.K();
        this.d.K();
        kk7.f(y6c.t0).n(this, kk7.B1);
        vl[] vlVarArr = this.f;
        vl vlVar = vlVarArr[0];
        if (vlVar != null) {
            vlVar.o(this.y);
        }
        vl vlVar2 = vlVarArr[1];
        if (vlVar2 != null) {
            vlVar2.o(this.y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.I();
        this.d.I();
        kk7.f(y6c.t0).b(this, kk7.B1);
        vl[] vlVarArr = this.f;
        vl vlVar = vlVarArr[0];
        if (vlVar != null) {
            vlVar.b(this.y);
        }
        vl vlVar2 = vlVarArr[1];
        if (vlVar2 != null) {
            vlVar2.b(this.y);
        }
    }

    public final void d() {
        vl vlVar;
        TLRPC.TL_messages_stickerSet n0 = hq6.d0(y6c.t0).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (n0 != null && !n0.documents.isEmpty()) {
            TLRPC.Document document = n0.documents.get((int) Math.floor(Math.random() * n0.documents.size()));
            int i = 1 - this.e;
            this.e = i;
            vl[] vlVarArr = this.f;
            vl vlVar2 = vlVarArr[i];
            if (vlVar2 != null) {
                vlVar2.o(this.y);
            }
            vlVarArr[this.e] = vl.l(y6c.t0, 9, document);
            vlVarArr[this.e].setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.Ei, false), PorterDuff.Mode.SRC_IN));
            if (this.x && (vlVar = vlVarArr[this.e]) != null) {
                vlVar.b(this.y);
            }
            gl.d3(new w8a(this, (byte) 0), 2500L);
            return;
        }
        this.w = true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.A0 && this.w && this.x) {
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
        vl vlVar;
        vl vlVar2;
        int i2;
        Rect bounds = getBounds();
        int w0 = bkb.w0(null, bkb.c6, false);
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
        float L = (gl.L((i + 38) + 6.66f) + this.h.c) / 2.0f;
        float L2 = gl.L(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(rectF.left, rectF.top, gl.L(32.0f), gl.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(gl.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, bkb.w0(null, bkb.F6, false), canvas);
        if (z) {
            float L3 = rectF.right - gl.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), gl.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.i0(L3 - gl.L(16.0f), rectF.centerY() - gl.L(16.0f), gl.L(32.0f), gl.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e = this.s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - gl.L(30.66f)), (int) (rectF.centerY() - gl.L(12.0f)));
        int i3 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        int i4 = -1;
        vl[] vlVarArr = this.f;
        if (i3 < 0 && (vlVar2 = vlVarArr[0]) != null) {
            canvas.save();
            f = 24.0f;
            if (this.e == 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            canvas.translate(0.0f, i2 * gl.L(9.0f) * e);
            float f5 = 1.0f - e;
            f2 = 1.0f;
            float f6 = (f5 * 0.4f) + 0.6f;
            f3 = 12.0f;
            f4 = 255.0f;
            canvas.scale(f6, f6, gl.L(12.0f), gl.L(12.0f));
            vlVar2.setBounds(0, 0, gl.L(24.0f), gl.L(24.0f));
            vlVar2.setAlpha((int) (f5 * 255.0f));
            vlVar2.draw(canvas);
            canvas.restore();
        } else {
            f = 24.0f;
            f2 = 1.0f;
            f3 = 12.0f;
            f4 = 255.0f;
        }
        if (e > 0.0f && (vlVar = vlVarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i4 = 1;
            }
            canvas.translate(0.0f, (f2 - e) * gl.L(9.0f) * i4);
            float f7 = (0.4f * e) + 0.6f;
            canvas.scale(f7, f7, gl.L(f3), gl.L(f3));
            vlVar.setBounds(0, 0, gl.L(f), gl.L(f));
            vlVar.setAlpha((int) (e * f4));
            vlVar.draw(canvas);
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

    public x8a(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new vl[2];
        this.n = new RectF();
        this.s = new lm(new w8a(this, (byte) 1), 320L, s33.h, 0);
        this.r = false;
        int i = bkb.c6;
        paint.setColor(bkb.w0(null, i, false));
        paint2.setColor(bkb.w0(null, i, false));
        paint2.setShadowLayer(gl.L(2.33f), 0.0f, gl.L(2.0f), bkb.p1(0.18f, -16777216));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        imageReceiver.U(user, pb0Var, null);
        imageReceiver.q0(gl.L(16.0f));
        d();
        this.h = new tgb(l7c.r(user), 14.0f, null);
    }
}
