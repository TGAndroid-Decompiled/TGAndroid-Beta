package hi;

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
import org.telegram.messenger.hc;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
public final class n4 extends Drawable implements r6, ls {
    public final Paint f14820a;
    public final Paint f14821b;
    public final ImageReceiver f14822c;
    public final ImageReceiver d;
    public int f14823e;
    public final i5[] f14824f;
    public final ly0 h;
    public final RectF f14825n;
    public final boolean f14826r;
    public final w5 f14827s;
    public boolean f14828w;
    public boolean f14829x;
    public View f14830y;

    public n4(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f14820a = paint;
        Paint paint2 = new Paint(1);
        this.f14821b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f14822c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.f14823e = 1;
        this.f14824f = new i5[2];
        this.f14825n = new RectF();
        this.f14827s = new w5(new m4(this, 1), 320L, xq.h, 0);
        this.f14826r = false;
        int i7 = k6.f27848d6;
        paint.setColor(k6.x0(null, i7, false));
        paint2.setColor(k6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), k6.r1(0.18f, -16777216));
        w8 w8Var = new w8((f6) null);
        w8Var.r(user);
        imageReceiver.i0(user, w8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        d();
        this.h = new ly0(t10.p(user), 14.0f, null);
    }

    @Override
    public final void a(ch0 ch0Var) {
        this.f14830y = ch0Var;
        this.d.H0(ch0Var);
        this.f14822c.H0(ch0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f14829x = false;
        this.f14822c.R();
        this.d.R();
        qs.f(p10.f24459s0).n(this, qs.C1);
        i5[] i5VarArr = this.f14824f;
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.n(this.f14830y);
        }
        i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.n(this.f14830y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f14829x = true;
        this.f14822c.P();
        this.d.P();
        qs.f(p10.f24459s0).c(this, qs.C1);
        i5[] i5VarArr = this.f14824f;
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.a(this.f14830y);
        }
        i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.a(this.f14830y);
        }
    }

    public final void d() {
        i5 i5Var;
        TLRPC.TL_messages_stickerSet m0 = ui.b0(p10.f24459s0).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (m0 != null && !m0.documents.isEmpty()) {
            TLRPC.Document document = m0.documents.get((int) Math.floor(Math.random() * m0.documents.size()));
            int i7 = 1 - this.f14823e;
            this.f14823e = i7;
            i5[] i5VarArr = this.f14824f;
            i5 i5Var2 = i5VarArr[i7];
            if (i5Var2 != null) {
                i5Var2.n(this.f14830y);
            }
            i5VarArr[this.f14823e] = i5.l(p10.f24459s0, 9, document);
            i5VarArr[this.f14823e].setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.Ci, false), PorterDuff.Mode.SRC_IN));
            if (this.f14829x && (i5Var = i5VarArr[this.f14823e]) != null) {
                i5Var.a(this.f14830y);
            }
            org.telegram.messenger.g0.i3(new m4(this, 0), 2500L);
            return;
        }
        this.f14828w = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.B0 && this.f14828w && this.f14829x) {
            this.f14828w = false;
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
        i5 i5Var;
        i5 i5Var2;
        int i10;
        Rect bounds = getBounds();
        int x02 = k6.x0(null, k6.f27848d6, false);
        Paint paint = this.f14820a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.f14821b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z9 = this.f14826r;
        if (z9) {
            i7 = 48;
        } else {
            i7 = 28;
        }
        float L = (org.telegram.messenger.g0.L((i7 + 38) + 6.66f) + this.h.f35782c) / 2.0f;
        float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
        RectF rectF = this.f14825n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.f14822c;
        imageReceiver.y0(rectF.left, rectF.top, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.g0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, k6.x0(null, k6.G6, false), canvas);
        if (z9) {
            float L3 = rectF.right - org.telegram.messenger.g0.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), org.telegram.messenger.g0.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L3 - org.telegram.messenger.g0.L(16.0f), rectF.centerY() - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e10 = this.f14827s.e(false, this.f14823e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.g0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.g0.L(12.0f)));
        int i11 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        int i12 = -1;
        i5[] i5VarArr = this.f14824f;
        if (i11 < 0 && (i5Var2 = i5VarArr[0]) != null) {
            canvas.save();
            f10 = 24.0f;
            if (this.f14823e == 0) {
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
            i5Var2.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            i5Var2.setAlpha((int) (f14 * 255.0f));
            i5Var2.draw(canvas);
            canvas.restore();
        } else {
            f10 = 24.0f;
            f11 = 1.0f;
            f12 = 12.0f;
            f13 = 255.0f;
        }
        if (e10 > 0.0f && (i5Var = i5VarArr[1]) != null) {
            canvas.save();
            if (this.f14823e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (f11 - e10) * org.telegram.messenger.g0.L(9.0f) * i12);
            float f16 = (0.4f * e10) + 0.6f;
            canvas.scale(f16, f16, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
            i5Var.setBounds(0, 0, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            i5Var.setAlpha((int) (e10 * f13));
            i5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public n4(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f14820a = paint;
        Paint paint2 = new Paint(1);
        this.f14821b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f14822c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.f14823e = 1;
        this.f14824f = new i5[2];
        this.f14825n = new RectF();
        this.f14827s = new w5(new m4(this, 1), 320L, xq.h, 0);
        this.f14826r = true;
        int i7 = k6.f27848d6;
        paint.setColor(k6.x0(null, i7, false));
        paint2.setColor(k6.x0(null, i7, false));
        paint2.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(2.0f), k6.r1(0.18f, -16777216));
        w8 w8Var = new w8((f6) null);
        w8Var.r(user);
        imageReceiver.i0(user, w8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, 120, false, null, false);
        imageReceiver2.r0(hc.b(document), "120_120", hc.c(w10, document), "120_120", t5.d(document.thumbs, k6.f27792a7, 0.35f, false), 0L, null, null, 0);
        this.h = new ly0(t10.p(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
