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
public final class vc2 {
    public final rc2 a;
    public int b;
    public bk2 c;
    public String d;
    public vuc e;
    public Drawable f;
    public int g = -1;

    public vc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final void a(Canvas canvas) {
        rc2 rc2Var = this.a;
        mm mmVar = rc2Var.U0;
        mx6 mx6Var = rc2Var.ec;
        Drawable drawable = (Drawable) mx6Var.d;
        if (drawable == null) {
            drawable = b10.d((Context) mx6Var.b, 2131231651);
            mx6Var.d = drawable;
        }
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int z = (int) aq1.z(mmVar.N0, intrinsicWidth, 2.0f, mmVar.L0);
        int interpolation = (int) ((((mmVar.O0 / 2.0f) - intrinsicHeight) + mmVar.M0) - ((1.0f - d53.k.getInterpolation(mmVar.i1)) * gm.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, mmVar.i1 * 5.0f) * 255.0f));
        drawable.setBounds(z, interpolation, intrinsicWidth + z, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (mmVar.i1 < 1.0f) {
            rc2Var.invalidate();
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
        rc2 rc2Var;
        ImageReceiver imageReceiver;
        yc2 yc2Var;
        float f6;
        float f7;
        float f8;
        int i2;
        rc2 rc2Var2 = this.a;
        int i3 = rc2Var2.a6;
        ImageReceiver imageReceiver2 = rc2Var2.F7;
        yc2 yc2Var2 = rc2Var2.ub;
        RectF rectF2 = rc2Var2.c4;
        mm mmVar = rc2Var2.U0;
        if (rc2Var2.e3 != null) {
            if (rc2Var2.Q5.O3()) {
                cmb.G2.setColor(cmb.v0(cmb.Vc, rc2Var2.cc));
                TextPaint textPaint = cmb.H2;
                if (rc2Var2.A2()) {
                    i2 = cmb.Bc;
                } else {
                    i2 = cmb.Ac;
                }
                textPaint.setColor(cmb.v0(i2, rc2Var2.cc));
            } else {
                cmb.G2.setColor(cmb.v0(cmb.Uc, rc2Var2.cc));
                TextPaint textPaint2 = cmb.H2;
                if (rc2Var2.A2()) {
                    i = cmb.ze;
                } else {
                    i = cmb.ye;
                }
                textPaint2.setColor(cmb.v0(i, rc2Var2.cc));
            }
            if (k47.n1(rc2Var2.Q5.k) instanceof TLRPC.TL_messageMediaGeoLive) {
                int x = (int) (mmVar.x() + gm.L(30.0f));
                if (rc2Var2.h3 && !yc2Var2.j) {
                    yc2Var2.l = null;
                    yc2Var2.n = null;
                    yc2Var2.o = null;
                    rc2Var = rc2Var2;
                    imageReceiver = imageReceiver2;
                    f3 = 2.0f;
                    f = 1.0f;
                    f2 = 255.0f;
                } else {
                    rc2Var2.S9 = true;
                    StaticLayout staticLayout = rc2Var2.e3;
                    StaticLayout staticLayout2 = rc2Var2.x3;
                    f = 1.0f;
                    boolean z = false;
                    if (yc2Var2.j) {
                        float f9 = yc2Var2.m;
                        String str = yc2Var2.l;
                        staticLayout = yc2Var2.n;
                        StaticLayout staticLayout3 = yc2Var2.o;
                        f2 = 255.0f;
                        abs = f9;
                        f4 = 1.0f - yc2Var2.L1;
                        C = str;
                        staticLayout2 = staticLayout3;
                        f3 = 2.0f;
                    } else {
                        f2 = 255.0f;
                        if (k47.n1(rc2Var2.Q5.k).period == Integer.MAX_VALUE) {
                            C = "";
                            f4 = 1.0f;
                            abs = 1.0f;
                            f3 = 2.0f;
                            z = true;
                        } else {
                            f3 = 2.0f;
                            C = jb6.C(Math.abs(k47.n1(rc2Var2.Q5.k).period - (ConnectionsManager.getInstance(i3).getCurrentTime() - rc2Var2.Q5.k.date)));
                            abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i3).getCurrentTime() - rc2Var2.Q5.k.date) / k47.n1(rc2Var2.Q5.k).period);
                            f4 = 1.0f;
                        }
                    }
                    float f10 = f4;
                    rectF2.set(mmVar.w() - gm.L(43.0f), x - gm.L(15.0f), mmVar.w() - gm.L(13.0f), gm.L(15.0f) + x);
                    if (rc2Var2.Q5.O3()) {
                        Paint paint = cmb.k2;
                        int i4 = cmb.Lb;
                        paint.setColor(cmb.v0(i4, rc2Var2.cc));
                        cmb.E2.setColor(cmb.v0(i4, rc2Var2.cc));
                    } else {
                        Paint paint2 = cmb.k2;
                        int i5 = cmb.td;
                        paint2.setColor(cmb.v0(i5, rc2Var2.cc));
                        cmb.E2.setColor(cmb.v0(i5, rc2Var2.cc));
                    }
                    int alpha = cmb.G2.getAlpha();
                    int alpha2 = cmb.H2.getAlpha();
                    int alpha3 = cmb.E2.getAlpha();
                    int i6 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i6 != 0) {
                        f5 = 50.0f;
                        rectF = rectF2;
                        cmb.G2.setAlpha((int) (alpha * f10));
                        cmb.H2.setAlpha((int) (alpha2 * f10));
                        cmb.E2.setAlpha((int) (alpha3 * f10));
                        canvas.save();
                        canvas.translate(0.0f, (-gm.L(50.0f)) * yc2Var2.L1);
                    } else {
                        rectF = rectF2;
                        f5 = 50.0f;
                    }
                    cmb.k2.setAlpha((int) (f10 * f5));
                    StaticLayout staticLayout4 = staticLayout2;
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), gm.L(15.0f), cmb.k2);
                    cmb.k2.setAlpha((int) (f10 * f2));
                    StaticLayout staticLayout5 = staticLayout;
                    rc2Var = rc2Var2;
                    imageReceiver = imageReceiver2;
                    RectF rectF3 = rectF;
                    canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, cmb.k2);
                    if (z) {
                        if (this.f == null) {
                            this.f = rc2Var.getContext().getResources().getDrawable(2131231133).mutate();
                        }
                        if (cmb.E2.getColor() != this.g) {
                            Drawable drawable = this.f;
                            int color = cmb.E2.getColor();
                            this.g = color;
                            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        }
                        yc2Var = yc2Var2;
                        f6 = abs;
                        this.f.setBounds(aq1.A(2, (int) rectF3.centerX(), this.f), aq1.y(2, (int) rectF3.centerY(), this.f), aq1.w(2, (int) rectF3.centerX(), this.f), aq1.i(2, (int) rectF3.centerY(), this.f));
                        this.f.draw(canvas);
                    } else {
                        yc2Var = yc2Var2;
                        f6 = abs;
                        float measureText = cmb.E2.measureText(C);
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
                        canvas.drawText(C, rectF3.centerX() - (measureText / f3), gm.L(4.0f) + x, cmb.E2);
                        canvas.restore();
                    }
                    if (staticLayout5 != null && staticLayout4 != null) {
                        canvas.save();
                        canvas.translate(mmVar.L0 + gm.L(10.0f), mmVar.x() + gm.L(10.0f));
                        staticLayout5.draw(canvas);
                        canvas.translate(0.0f, gm.L(23.0f));
                        staticLayout4.draw(canvas);
                        canvas.restore();
                    }
                    if (i6 != 0) {
                        cmb.G2.setAlpha(alpha);
                        cmb.H2.setAlpha(alpha2);
                        cmb.E2.setAlpha(alpha3);
                        canvas.restore();
                    }
                    yc2 yc2Var3 = yc2Var;
                    yc2Var3.m = f6;
                    yc2Var3.l = C;
                    yc2Var3.n = staticLayout5;
                    yc2Var3.o = staticLayout4;
                }
                if (mmVar.G()) {
                    f8 = f;
                } else {
                    f8 = mmVar.i1;
                }
                if (f8 > 0.0f) {
                    if (mmVar.E() || mmVar.G()) {
                        int L = (int) (((mmVar.N0 / f3) + mmVar.L0) - gm.L(31.0f));
                        int L2 = (int) ((((mmVar.O0 / f3) + mmVar.M0) - gm.L(38.0f)) - ((f - d53.k.getInterpolation(f8)) * gm.L(16.0f)));
                        mx6 mx6Var = rc2Var.ec;
                        Drawable drawable2 = (Drawable) mx6Var.c;
                        if (drawable2 == null) {
                            drawable2 = b10.d((Context) mx6Var.b, 2131231639);
                            mx6Var.c = drawable2;
                        }
                        hg0.s(L, L2, drawable2);
                        float f11 = f8 * 5.0f;
                        drawable2.setAlpha((int) (Math.min(f, f11) * f2));
                        drawable2.draw(canvas);
                        ImageReceiver imageReceiver3 = imageReceiver;
                        imageReceiver3.i0(gm.L(5.0f) + L, gm.L(5.0f) + L2, gm.L(52.0f), gm.L(52.0f));
                        imageReceiver3.setAlpha(Math.min(1.0f, f11));
                        imageReceiver3.h(canvas, null);
                        return;
                    }
                    return;
                }
                return;
            }
            canvas.save();
            canvas.translate(mmVar.L0 + gm.L(6.0f), mmVar.x() + gm.L(8.0f));
            rc2Var2.e3.draw(canvas);
            if (rc2Var2.x3 != null) {
                canvas.translate(0.0f, gm.L(21.0f));
                rc2Var2.x3.draw(canvas);
            }
            canvas.restore();
        }
    }
}
