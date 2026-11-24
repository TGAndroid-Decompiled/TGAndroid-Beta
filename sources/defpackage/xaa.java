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
public final class xaa extends Drawable implements zy, jm7 {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final vm[] f;
    public final uib h;
    public final RectF n;
    public final boolean r;
    public final ln s;
    public boolean w;
    public boolean x;
    public s09 y;

    public xaa(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new vm[2];
        this.n = new RectF();
        this.s = new ln(new waa(this, (byte) 1), 320L, d53.h, 0);
        this.r = true;
        int i = cmb.c6;
        paint.setColor(cmb.w0(null, i, false));
        paint2.setColor(cmb.w0(null, i, false));
        paint2.setShadowLayer(gm.L(2.33f), 0.0f, gm.L(2.0f), cmb.p1(0.18f, -16777216));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        imageReceiver.U(user, pc0Var, null);
        imageReceiver.q0(gm.L(16.0f));
        TLRPC.PhotoSize w = bc4.w(document.thumbs, 120, false, null, false);
        imageReceiver2.Z(gn5.b(document), "120_120", gn5.c(w, document), "120_120", eq3.d(document.thumbs, cmb.Z6, 0.35f, false), 0L, null, null, 0);
        this.h = new uib(m9c.r(user), 14.0f, null);
    }

    @Override
    public final void a(s09 s09Var) {
        this.y = s09Var;
        this.d.p0(s09Var);
        this.c.p0(s09Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.K();
        this.d.K();
        nm7.f(z8c.t0).n(this, nm7.C1);
        vm[] vmVarArr = this.f;
        vm vmVar = vmVarArr[0];
        if (vmVar != null) {
            vmVar.o(this.y);
        }
        vm vmVar2 = vmVarArr[1];
        if (vmVar2 != null) {
            vmVar2.o(this.y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.I();
        this.d.I();
        nm7.f(z8c.t0).b(this, nm7.C1);
        vm[] vmVarArr = this.f;
        vm vmVar = vmVarArr[0];
        if (vmVar != null) {
            vmVar.b(this.y);
        }
        vm vmVar2 = vmVarArr[1];
        if (vmVar2 != null) {
            vmVar2.b(this.y);
        }
    }

    public final void d() {
        vm vmVar;
        TLRPC.TL_messages_stickerSet n0 = hs6.d0(z8c.t0).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (n0 != null && !n0.documents.isEmpty()) {
            TLRPC.Document document = n0.documents.get((int) Math.floor(Math.random() * n0.documents.size()));
            int i = 1 - this.e;
            this.e = i;
            vm[] vmVarArr = this.f;
            vm vmVar2 = vmVarArr[i];
            if (vmVar2 != null) {
                vmVar2.o(this.y);
            }
            vmVarArr[this.e] = vm.l(z8c.t0, 9, document);
            vmVarArr[this.e].setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.Ei, false), PorterDuff.Mode.SRC_IN));
            if (this.x && (vmVar = vmVarArr[this.e]) != null) {
                vmVar.b(this.y);
            }
            gm.d3(new waa(this, (byte) 0), 2500L);
            return;
        }
        this.w = true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B0 && this.w && this.x) {
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
        vm vmVar;
        vm vmVar2;
        int i2;
        Rect bounds = getBounds();
        int w0 = cmb.w0(null, cmb.c6, false);
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
        float L = (gm.L((i + 38) + 6.66f) + this.h.c) / 2.0f;
        float L2 = gm.L(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(rectF.left, rectF.top, gm.L(32.0f), gm.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(gm.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, cmb.w0(null, cmb.F6, false), canvas);
        if (z) {
            float L3 = rectF.right - gm.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), gm.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.i0(L3 - gm.L(16.0f), rectF.centerY() - gm.L(16.0f), gm.L(32.0f), gm.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e = this.s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - gm.L(30.66f)), (int) (rectF.centerY() - gm.L(12.0f)));
        int i3 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        int i4 = -1;
        vm[] vmVarArr = this.f;
        if (i3 < 0 && (vmVar2 = vmVarArr[0]) != null) {
            canvas.save();
            f = 24.0f;
            if (this.e == 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            canvas.translate(0.0f, i2 * gm.L(9.0f) * e);
            float f5 = 1.0f - e;
            f2 = 1.0f;
            float f6 = (f5 * 0.4f) + 0.6f;
            f3 = 12.0f;
            f4 = 255.0f;
            canvas.scale(f6, f6, gm.L(12.0f), gm.L(12.0f));
            vmVar2.setBounds(0, 0, gm.L(24.0f), gm.L(24.0f));
            vmVar2.setAlpha((int) (f5 * 255.0f));
            vmVar2.draw(canvas);
            canvas.restore();
        } else {
            f = 24.0f;
            f2 = 1.0f;
            f3 = 12.0f;
            f4 = 255.0f;
        }
        if (e > 0.0f && (vmVar = vmVarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i4 = 1;
            }
            canvas.translate(0.0f, (f2 - e) * gm.L(9.0f) * i4);
            float f7 = (0.4f * e) + 0.6f;
            canvas.scale(f7, f7, gm.L(f3), gm.L(f3));
            vmVar.setBounds(0, 0, gm.L(f), gm.L(f));
            vmVar.setAlpha((int) (e * f4));
            vmVar.draw(canvas);
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

    public xaa(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new vm[2];
        this.n = new RectF();
        this.s = new ln(new waa(this, (byte) 1), 320L, d53.h, 0);
        this.r = false;
        int i = cmb.c6;
        paint.setColor(cmb.w0(null, i, false));
        paint2.setColor(cmb.w0(null, i, false));
        paint2.setShadowLayer(gm.L(2.33f), 0.0f, gm.L(2.0f), cmb.p1(0.18f, -16777216));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        imageReceiver.U(user, pc0Var, null);
        imageReceiver.q0(gm.L(16.0f));
        d();
        this.h = new uib(m9c.r(user), 14.0f, null);
    }
}
