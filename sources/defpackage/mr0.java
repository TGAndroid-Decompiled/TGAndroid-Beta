package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class mr0 implements yi5 {
    public final byte a;
    public final Object b;

    public mr0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        byte b = this.a;
        qebVar.b = true;
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        f12 f12Var;
        float alpha;
        f12 f12Var2;
        View view;
        byte b = this.a;
        float f = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                rr0 rr0Var = (rr0) obj;
                RectF rectF2 = rr0Var.E;
                if (rr0Var.s == null) {
                    sr0 sr0Var = rr0Var.d;
                    uk0.a(sr0Var, canvas, rectF, sr0Var, rr0Var.c);
                    return;
                }
                rr0Var.h0(rectF2);
                canvas.save();
                canvas.clipRect(rectF2);
                sr0 sr0Var2 = rr0Var.d;
                tt ttVar = rr0Var.c;
                if (rr0Var.s != null) {
                    f = Math.min(1.0f, rr0Var.x / 0.22f);
                }
                uk0.b(sr0Var2, canvas, rectF, sr0Var2, ttVar, (int) (f * 255.0f));
                canvas.restore();
                return;
            case 1:
                nx0 nx0Var = (nx0) obj;
                ViewGroup viewGroup = nx0Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == nx0Var.c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                ((uf1) obj).X(canvas, rectF);
                return;
            case 3:
                n12 n12Var = (n12) obj;
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        f12Var = n12Var.v2;
                    } else {
                        f12Var = n12Var.w2;
                    }
                    if (f12Var != null && f12Var.c != null && f12Var.getVisibility() == 0) {
                        if (i == 0 && (f12Var2 = n12Var.w2) != null && f12Var2.getVisibility() == 0) {
                            alpha = (1.0f - n12Var.w2.getAlpha()) * f12Var.getAlpha();
                        } else {
                            alpha = f12Var.getAlpha();
                        }
                        uk0.b(f12Var.c, canvas, rectF, f12Var.d, n12Var.b, (int) (alpha * 255.0f));
                    }
                }
                return;
            case 4:
                o24 o24Var = (o24) obj;
                b14 b14Var = o24Var.Q;
                uk0.a(b14Var, canvas, rectF, b14Var, o24Var);
                rz3 rz3Var = o24Var.i0;
                uk0.a(rz3Var, canvas, rectF, rz3Var, o24Var);
                wz3 wz3Var = o24Var.E0;
                uk0.a(wz3Var, canvas, rectF, wz3Var, o24Var);
                return;
            case 5:
                ((uc6) obj).d0(canvas, rectF);
                return;
            case 6:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                d79 d79Var = premiumPreviewFragment.a;
                uk0.a(d79Var, canvas, rectF, d79Var, premiumPreviewFragment.e0);
                return;
            case 7:
                RectF rectF3 = ProfileActivity.Z6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                return;
            case 8:
                RectF rectF4 = ProfileActivity.Z6;
                is8 is8Var = ((ProfileActivity) obj).d1;
                int i2 = is8.R;
                is8Var.P = true;
                is8Var.draw(canvas);
                is8Var.P = false;
                return;
            case 9:
                zp8 zp8Var = (zp8) obj;
                zj0 zj0Var = zp8Var.S2;
                if (zj0Var != null) {
                    zj0Var.g(canvas, rectF);
                    return;
                }
                p69 p69Var = zp8Var.H2;
                if (p69Var != null) {
                    p69Var.g(canvas, rectF);
                    return;
                }
                return;
            case 10:
                r1a r1aVar = (r1a) obj;
                d79 d79Var2 = r1aVar.n1;
                uk0.b(d79Var2, canvas, rectF, d79Var2, r1aVar.b, 255);
                return;
            case 11:
                kea keaVar = (kea) obj;
                mda mdaVar = keaVar.A1;
                uk0.a(mdaVar, canvas, rectF, mdaVar, keaVar.b);
                return;
            default:
                uqc uqcVar = (uqc) obj;
                wa waVar = uqcVar.a;
                uk0.a(waVar, canvas, rectF, waVar, (ViewGroup) uqcVar.fragmentView);
                iqc iqcVar = uqcVar.e;
                if (iqcVar != null && uqcVar.n != null && iqcVar.getVisibility() == 0 && uqcVar.e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(uqcVar.n.getX() + uqcVar.e.getLeft(), uqcVar.n.getY() + uqcVar.e.getTop());
                    canvas.concat(uqcVar.e.getMatrix());
                    if (uqcVar.e.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, uqcVar.e.getWidth(), uqcVar.e.getHeight(), (int) (uqcVar.e.getAlpha() * 255.0f));
                    }
                    uqcVar.e.draw(canvas);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
        }
    }
}
