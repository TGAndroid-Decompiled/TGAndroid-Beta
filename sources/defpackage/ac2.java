package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ac2 {
    public final wb2 a;
    public int b;
    public jj2 c;
    public String d;
    public jxc e;
    public Drawable f;
    public int g = -1;

    public ac2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final void a(Canvas canvas) {
        wb2 wb2Var = this.a;
        nl nlVar = wb2Var.U0;
        rx6 rx6Var = wb2Var.ec;
        Drawable drawable = (Drawable) rx6Var.d;
        if (drawable == null) {
            drawable = c00.e((Context) rx6Var.b, 2131231650);
            rx6Var.d = drawable;
        }
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int z = (int) bp1.z(nlVar.N0, intrinsicWidth, 2.0f, nlVar.L0);
        int interpolation = (int) ((((nlVar.O0 / 2.0f) - intrinsicHeight) + nlVar.M0) - ((1.0f - k43.k.getInterpolation(nlVar.i1)) * hl.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, nlVar.i1 * 5.0f) * 255.0f));
        drawable.setBounds(z, interpolation, intrinsicWidth + z, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (nlVar.i1 < 1.0f) {
            wb2Var.invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        String C;
        float abs;
        float f4;
        RectF rectF;
        float f5;
        wb2 wb2Var;
        ImageReceiver imageReceiver;
        dc2 dc2Var;
        float f6;
        float f7;
        float f8;
        int i2;
        wb2 wb2Var2 = this.a;
        int i3 = wb2Var2.a6;
        ImageReceiver imageReceiver2 = wb2Var2.F7;
        dc2 dc2Var2 = wb2Var2.ub;
        RectF rectF2 = wb2Var2.c4;
        nl nlVar = wb2Var2.U0;
        if (wb2Var2.e3 != null) {
            if (wb2Var2.Q5.O3()) {
                aob.H2.setColor(aob.v0(aob.Wc, wb2Var2.cc));
                TextPaint textPaint = aob.I2;
                if (wb2Var2.A2()) {
                    i2 = aob.Cc;
                } else {
                    i2 = aob.Bc;
                }
                textPaint.setColor(aob.v0(i2, wb2Var2.cc));
            } else {
                aob.H2.setColor(aob.v0(aob.Vc, wb2Var2.cc));
                TextPaint textPaint2 = aob.I2;
                if (wb2Var2.A2()) {
                    i = aob.Ae;
                } else {
                    i = aob.ze;
                }
                textPaint2.setColor(aob.v0(i, wb2Var2.cc));
            }
            if (r47.n1(wb2Var2.Q5.k) instanceof TLRPC.TL_messageMediaGeoLive) {
                int x = (int) (nlVar.x() + hl.L(30.0f));
                if (wb2Var2.h3 && !dc2Var2.j) {
                    dc2Var2.l = null;
                    dc2Var2.n = null;
                    dc2Var2.o = null;
                    wb2Var = wb2Var2;
                    imageReceiver = imageReceiver2;
                    f3 = 2.0f;
                    f = 1.0f;
                    f2 = 255.0f;
                } else {
                    wb2Var2.S9 = true;
                    StaticLayout staticLayout = wb2Var2.e3;
                    StaticLayout staticLayout2 = wb2Var2.x3;
                    f = 1.0f;
                    boolean z = false;
                    if (dc2Var2.j) {
                        float f9 = dc2Var2.m;
                        String str = dc2Var2.l;
                        staticLayout = dc2Var2.n;
                        StaticLayout staticLayout3 = dc2Var2.o;
                        f2 = 255.0f;
                        abs = f9;
                        f4 = 1.0f - dc2Var2.L1;
                        C = str;
                        staticLayout2 = staticLayout3;
                        f3 = 2.0f;
                    } else {
                        f2 = 255.0f;
                        if (r47.n1(wb2Var2.Q5.k).period == Integer.MAX_VALUE) {
                            C = "";
                            f4 = 1.0f;
                            abs = 1.0f;
                            f3 = 2.0f;
                            z = true;
                        } else {
                            f3 = 2.0f;
                            C = ob6.C(Math.abs(r47.n1(wb2Var2.Q5.k).period - (ConnectionsManager.getInstance(i3).getCurrentTime() - wb2Var2.Q5.k.date)));
                            abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i3).getCurrentTime() - wb2Var2.Q5.k.date) / r47.n1(wb2Var2.Q5.k).period);
                            f4 = 1.0f;
                        }
                    }
                    float f10 = f4;
                    rectF2.set(nlVar.w() - hl.L(43.0f), x - hl.L(15.0f), nlVar.w() - hl.L(13.0f), hl.L(15.0f) + x);
                    if (wb2Var2.Q5.O3()) {
                        Paint paint = aob.l2;
                        int i4 = aob.Mb;
                        paint.setColor(aob.v0(i4, wb2Var2.cc));
                        aob.F2.setColor(aob.v0(i4, wb2Var2.cc));
                    } else {
                        Paint paint2 = aob.l2;
                        int i5 = aob.ud;
                        paint2.setColor(aob.v0(i5, wb2Var2.cc));
                        aob.F2.setColor(aob.v0(i5, wb2Var2.cc));
                    }
                    int alpha = aob.H2.getAlpha();
                    int alpha2 = aob.I2.getAlpha();
                    int alpha3 = aob.F2.getAlpha();
                    int i6 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i6 != 0) {
                        f5 = 50.0f;
                        rectF = rectF2;
                        aob.H2.setAlpha((int) (alpha * f10));
                        aob.I2.setAlpha((int) (alpha2 * f10));
                        aob.F2.setAlpha((int) (alpha3 * f10));
                        canvas.save();
                        canvas.translate(0.0f, (-hl.L(50.0f)) * dc2Var2.L1);
                    } else {
                        rectF = rectF2;
                        f5 = 50.0f;
                    }
                    aob.l2.setAlpha((int) (f10 * f5));
                    StaticLayout staticLayout4 = staticLayout2;
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), hl.L(15.0f), aob.l2);
                    aob.l2.setAlpha((int) (f10 * f2));
                    StaticLayout staticLayout5 = staticLayout;
                    wb2Var = wb2Var2;
                    imageReceiver = imageReceiver2;
                    RectF rectF3 = rectF;
                    canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, aob.l2);
                    if (z) {
                        if (this.f == null) {
                            this.f = wb2Var.getContext().getResources().getDrawable(2131231132).mutate();
                        }
                        if (aob.F2.getColor() != this.g) {
                            Drawable drawable = this.f;
                            int color = aob.F2.getColor();
                            this.g = color;
                            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        }
                        dc2Var = dc2Var2;
                        f6 = abs;
                        this.f.setBounds(bp1.A(2, (int) rectF3.centerX(), this.f), bp1.y(2, (int) rectF3.centerY(), this.f), bp1.w(2, (int) rectF3.centerX(), this.f), bp1.i(2, (int) rectF3.centerY(), this.f));
                        this.f.draw(canvas);
                    } else {
                        dc2Var = dc2Var2;
                        f6 = abs;
                        float measureText = aob.F2.measureText(C);
                        int length = C.length();
                        if (length > 4) {
                            f7 = 0.75f;
                        } else if (length > 3) {
                            f7 = 0.85f;
                        } else {
                            f7 = 1.0f;
                        }
                        canvas.save();
                        canvas.scale(f7, f7, rectF3.centerX(), rectF3.centerY());
                        canvas.drawText(C, rectF3.centerX() - (measureText / f3), hl.L(4.0f) + x, aob.F2);
                        canvas.restore();
                    }
                    if (staticLayout5 != null && staticLayout4 != null) {
                        canvas.save();
                        canvas.translate(nlVar.L0 + hl.L(10.0f), nlVar.x() + hl.L(10.0f));
                        staticLayout5.draw(canvas);
                        canvas.translate(0.0f, hl.L(23.0f));
                        staticLayout4.draw(canvas);
                        canvas.restore();
                    }
                    if (i6 != 0) {
                        aob.H2.setAlpha(alpha);
                        aob.I2.setAlpha(alpha2);
                        aob.F2.setAlpha(alpha3);
                        canvas.restore();
                    }
                    dc2 dc2Var3 = dc2Var;
                    dc2Var3.m = f6;
                    dc2Var3.l = C;
                    dc2Var3.n = staticLayout5;
                    dc2Var3.o = staticLayout4;
                }
                if (nlVar.G()) {
                    f8 = f;
                } else {
                    f8 = nlVar.i1;
                }
                if (f8 > 0.0f) {
                    if (nlVar.E() || nlVar.G()) {
                        int L = (int) (((nlVar.N0 / f3) + nlVar.L0) - hl.L(31.0f));
                        int L2 = (int) ((((nlVar.O0 / f3) + nlVar.M0) - hl.L(38.0f)) - ((f - k43.k.getInterpolation(f8)) * hl.L(16.0f)));
                        rx6 rx6Var = wb2Var.ec;
                        Drawable drawable2 = (Drawable) rx6Var.c;
                        if (drawable2 == null) {
                            drawable2 = c00.e((Context) rx6Var.b, 2131231638);
                            rx6Var.c = drawable2;
                        }
                        jf0.u(L, L2, drawable2);
                        float f11 = f8 * 5.0f;
                        drawable2.setAlpha((int) (Math.min(f, f11) * f2));
                        drawable2.draw(canvas);
                        ImageReceiver imageReceiver3 = imageReceiver;
                        imageReceiver3.i0(hl.L(5.0f) + L, hl.L(5.0f) + L2, hl.L(52.0f), hl.L(52.0f));
                        imageReceiver3.setAlpha(Math.min(1.0f, f11));
                        imageReceiver3.h(canvas, null);
                        return;
                    }
                    return;
                }
                return;
            }
            canvas.save();
            canvas.translate(nlVar.L0 + hl.L(6.0f), nlVar.x() + hl.L(8.0f));
            wb2Var2.e3.draw(canvas);
            if (wb2Var2.x3 != null) {
                canvas.translate(0.0f, hl.L(21.0f));
                wb2Var2.x3.draw(canvas);
            }
            canvas.restore();
        }
    }
}
