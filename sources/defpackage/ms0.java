package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class ms0 implements vi5 {
    public final byte a;
    public final Object b;

    public ms0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        byte b = this.a;
        ucbVar.b = true;
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        a22 a22Var;
        float alpha;
        a22 a22Var2;
        View view;
        byte b = this.a;
        float f = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                rs0 rs0Var = (rs0) obj;
                RectF rectF2 = rs0Var.E;
                if (rs0Var.s == null) {
                    ss0 ss0Var = rs0Var.d;
                    tl0.a(ss0Var, canvas, rectF, ss0Var, rs0Var.c);
                    return;
                }
                rs0Var.i0(rectF2);
                canvas.save();
                canvas.clipRect(rectF2);
                ss0 ss0Var2 = rs0Var.d;
                su suVar = rs0Var.c;
                if (rs0Var.s != null) {
                    f = Math.min(1.0f, rs0Var.x / 0.22f);
                }
                tl0.b(ss0Var2, canvas, rectF, ss0Var2, suVar, (int) (f * 255.0f));
                canvas.restore();
                return;
            case 1:
                my0 my0Var = (my0) obj;
                ViewGroup viewGroup = my0Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == my0Var.c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                ((tg1) obj).X(canvas, rectF);
                return;
            case 3:
                i22 i22Var = (i22) obj;
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        a22Var = i22Var.v2;
                    } else {
                        a22Var = i22Var.w2;
                    }
                    if (a22Var != null && a22Var.c != null && a22Var.getVisibility() == 0) {
                        if (i == 0 && (a22Var2 = i22Var.w2) != null && a22Var2.getVisibility() == 0) {
                            alpha = (1.0f - i22Var.w2.getAlpha()) * a22Var.getAlpha();
                        } else {
                            alpha = a22Var.getAlpha();
                        }
                        tl0.b(a22Var.c, canvas, rectF, a22Var.d, i22Var.b, (int) (alpha * 255.0f));
                    }
                }
                return;
            case 4:
                e34 e34Var = (e34) obj;
                r14 r14Var = e34Var.Q;
                tl0.a(r14Var, canvas, rectF, r14Var, e34Var);
                g04 g04Var = e34Var.i0;
                tl0.a(g04Var, canvas, rectF, g04Var, e34Var);
                l04 l04Var = e34Var.E0;
                tl0.a(l04Var, canvas, rectF, l04Var, e34Var);
                return;
            case 5:
                ((pc6) obj).e0(canvas, rectF);
                return;
            case 6:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                r59 r59Var = premiumPreviewFragment.a;
                tl0.a(r59Var, canvas, rectF, r59Var, premiumPreviewFragment.e0);
                return;
            case 7:
                RectF rectF3 = ProfileActivity.e7;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                return;
            case 8:
                RectF rectF4 = ProfileActivity.e7;
                xq8 xq8Var = ((ProfileActivity) obj).d1;
                int i2 = xq8.R;
                xq8Var.P = true;
                xq8Var.draw(canvas);
                xq8Var.P = false;
                return;
            case 9:
                po8 po8Var = (po8) obj;
                yk0 yk0Var = po8Var.S2;
                if (yk0Var != null) {
                    yk0Var.g(canvas, rectF);
                    return;
                }
                d59 d59Var = po8Var.H2;
                if (d59Var != null) {
                    d59Var.g(canvas, rectF);
                    return;
                }
                return;
            case 10:
                zz9 zz9Var = (zz9) obj;
                r59 r59Var2 = zz9Var.n1;
                tl0.b(r59Var2, canvas, rectF, r59Var2, zz9Var.b, 255);
                return;
            case 11:
                tca tcaVar = (tca) obj;
                vba vbaVar = tcaVar.A1;
                tl0.a(vbaVar, canvas, rectF, vbaVar, tcaVar.b);
                return;
            default:
                goc gocVar = (goc) obj;
                va vaVar = gocVar.a;
                tl0.a(vaVar, canvas, rectF, vaVar, (ViewGroup) gocVar.fragmentView);
                unc uncVar = gocVar.e;
                if (uncVar != null && gocVar.n != null && uncVar.getVisibility() == 0 && gocVar.e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(gocVar.n.getX() + gocVar.e.getLeft(), gocVar.n.getY() + gocVar.e.getTop());
                    canvas.concat(gocVar.e.getMatrix());
                    if (gocVar.e.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, gocVar.e.getWidth(), gocVar.e.getHeight(), (int) (gocVar.e.getAlpha() * 255.0f));
                    }
                    gocVar.e.draw(canvas);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
        }
    }
}
