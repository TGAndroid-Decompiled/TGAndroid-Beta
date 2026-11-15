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
import org.telegram.messenger.gc;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u5;
public final class h4 extends Drawable implements p6, is {
    public final Paint f18343a;
    public final Paint f18344b;
    public final ImageReceiver f18345c;
    public final ImageReceiver d;
    public int f18346e;
    public final g5[] f18347f;
    public final oy0 h;
    public final RectF f18348n;
    public final boolean f18349r;
    public final u5 f18350s;
    public boolean f18351w;
    public boolean f18352x;
    public View f18353y;

    public h4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f18343a = paint;
        Paint paint2 = new Paint(1);
        this.f18344b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f18345c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.f18346e = 1;
        this.f18347f = new g5[2];
        this.f18348n = new RectF();
        this.f18350s = new u5(new g4(this, 1), 320L, er.h, 0);
        this.f18349r = false;
        int i7 = j6.f28849d6;
        paint.setColor(j6.x0(null, i7, false));
        paint2.setColor(j6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), j6.r1(0.18f, -16777216));
        t8 t8Var = new t8((e6) null);
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        d();
        this.h = new oy0(q10.p(user), 14.0f, null);
    }

    @Override
    public final void a(fh0 fh0Var) {
        this.f18353y = fh0Var;
        this.d.H0(fh0Var);
        this.f18345c.H0(fh0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f18352x = false;
        this.f18345c.R();
        this.d.R();
        ns.f(m10.f24934t0).n(this, ns.C1);
        g5[] g5VarArr = this.f18347f;
        g5 g5Var = g5VarArr[0];
        if (g5Var != null) {
            g5Var.n(this.f18353y);
        }
        g5 g5Var2 = g5VarArr[1];
        if (g5Var2 != null) {
            g5Var2.n(this.f18353y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f18352x = true;
        this.f18345c.P();
        this.d.P();
        ns.f(m10.f24934t0).c(this, ns.C1);
        g5[] g5VarArr = this.f18347f;
        g5 g5Var = g5VarArr[0];
        if (g5Var != null) {
            g5Var.a(this.f18353y);
        }
        g5 g5Var2 = g5VarArr[1];
        if (g5Var2 != null) {
            g5Var2.a(this.f18353y);
        }
    }

    public final void d() {
        g5 g5Var;
        TLRPC.TL_messages_stickerSet m0 = si.b0(m10.f24934t0).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (m0 != null && !m0.documents.isEmpty()) {
            TLRPC.Document document = m0.documents.get((int) Math.floor(Math.random() * m0.documents.size()));
            int i7 = 1 - this.f18346e;
            this.f18346e = i7;
            g5[] g5VarArr = this.f18347f;
            g5 g5Var2 = g5VarArr[i7];
            if (g5Var2 != null) {
                g5Var2.n(this.f18353y);
            }
            g5VarArr[this.f18346e] = g5.l(m10.f24934t0, 9, document);
            g5VarArr[this.f18346e].setColorFilter(new PorterDuffColorFilter(j6.x0(null, j6.Fi, false), PorterDuff.Mode.SRC_IN));
            if (this.f18352x && (g5Var = g5VarArr[this.f18346e]) != null) {
                g5Var.a(this.f18353y);
            }
            org.telegram.messenger.g0.i3(new g4(this, 0), 2500L);
            return;
        }
        this.f18351w = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.B0 && this.f18351w && this.f18352x) {
            this.f18351w = false;
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
        g5 g5Var;
        g5 g5Var2;
        int i10;
        Rect bounds = getBounds();
        int x02 = j6.x0(null, j6.f28849d6, false);
        Paint paint = this.f18343a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.f18344b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.f18349r;
        if (z10) {
            i7 = 48;
        } else {
            i7 = 28;
        }
        float L = (org.telegram.messenger.g0.L((i7 + 38) + 6.66f) + this.h.f38105c) / 2.0f;
        float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
        RectF rectF = this.f18348n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.f18345c;
        imageReceiver.y0(rectF.left, rectF.top, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.g0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, j6.x0(null, j6.G6, false), canvas);
        if (z10) {
            float L3 = rectF.right - org.telegram.messenger.g0.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), org.telegram.messenger.g0.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L3 - org.telegram.messenger.g0.L(16.0f), rectF.centerY() - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e10 = this.f18350s.e(false, this.f18346e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.g0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.g0.L(12.0f)));
        int i11 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        int i12 = -1;
        g5[] g5VarArr = this.f18347f;
        if (i11 < 0 && (g5Var2 = g5VarArr[0]) != null) {
            canvas.save();
            f10 = 24.0f;
            if (this.f18346e == 0) {
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
            if (this.f18346e != 1) {
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

    public h4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f18343a = paint;
        Paint paint2 = new Paint(1);
        this.f18344b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f18345c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.f18346e = 1;
        this.f18347f = new g5[2];
        this.f18348n = new RectF();
        this.f18350s = new u5(new g4(this, 1), 320L, er.h, 0);
        this.f18349r = true;
        int i7 = j6.f28849d6;
        paint.setColor(j6.x0(null, i7, false));
        paint2.setColor(j6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), j6.r1(0.18f, -16777216));
        t8 t8Var = new t8((e6) null);
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, 120, false, null, false);
        imageReceiver2.r0(gc.b(document), "120_120", gc.c(w10, document), "120_120", t5.d(document.thumbs, j6.f28792a7, 0.35f, false), 0L, null, null, 0);
        this.h = new oy0(q10.p(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
