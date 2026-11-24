package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class vw0 implements wg5 {
    public final byte a;
    public final Object b;

    public vw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(tab tabVar, RectF rectF) {
        byte b = this.a;
        tabVar.b = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        p02 p02Var;
        float alpha;
        p02 p02Var2;
        View view;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fx0 fx0Var = (fx0) obj;
                ViewGroup viewGroup = fx0Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == fx0Var.c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                ((lf1) obj).X(canvas, rectF);
                return;
            case 2:
                x02 x02Var = (x02) obj;
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        p02Var = x02Var.v2;
                    } else {
                        p02Var = x02Var.w2;
                    }
                    if (p02Var != null && p02Var.c != null && p02Var.getVisibility() == 0) {
                        if (i == 0 && (p02Var2 = x02Var.w2) != null && p02Var2.getVisibility() == 0) {
                            alpha = (1.0f - x02Var.w2.getAlpha()) * p02Var.getAlpha();
                        } else {
                            alpha = p02Var.getAlpha();
                        }
                        tk0.b(p02Var.c, canvas, rectF, p02Var.d, x02Var.b, (int) (alpha * 255.0f));
                    }
                }
                return;
            case 3:
                t14 t14Var = (t14) obj;
                g04 g04Var = t14Var.Q;
                tk0.a(g04Var, canvas, rectF, g04Var, t14Var);
                wy3 wy3Var = t14Var.i0;
                tk0.a(wy3Var, canvas, rectF, wy3Var, t14Var);
                bz3 bz3Var = t14Var.E0;
                tk0.a(bz3Var, canvas, rectF, bz3Var, t14Var);
                return;
            case 4:
                ((qa6) obj).d0(canvas, rectF);
                return;
            case 5:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                o39 o39Var = premiumPreviewFragment.a;
                tk0.a(o39Var, canvas, rectF, o39Var, premiumPreviewFragment.e0);
                return;
            case 6:
                RectF rectF2 = ProfileActivity.Z6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                return;
            case 7:
                RectF rectF3 = ProfileActivity.Z6;
                wo8 wo8Var = ((ProfileActivity) obj).d1;
                int i2 = wo8.R;
                wo8Var.P = true;
                wo8Var.draw(canvas);
                wo8Var.P = false;
                return;
            case 8:
                om8 om8Var = (om8) obj;
                yj0 yj0Var = om8Var.S2;
                if (yj0Var != null) {
                    yj0Var.d(canvas, rectF);
                    return;
                }
                a39 a39Var = om8Var.H2;
                if (a39Var != null) {
                    a39Var.d(canvas, rectF);
                    return;
                }
                return;
            case 9:
                yx9 yx9Var = (yx9) obj;
                o39 o39Var2 = yx9Var.n1;
                tk0.b(o39Var2, canvas, rectF, o39Var2, yx9Var.b, 255);
                return;
            case 10:
                taa taaVar = (taa) obj;
                v9a v9aVar = taaVar.A1;
                tk0.a(v9aVar, canvas, rectF, v9aVar, taaVar.b);
                return;
            default:
                hmc hmcVar = (hmc) obj;
                va vaVar = hmcVar.a;
                tk0.a(vaVar, canvas, rectF, vaVar, (ViewGroup) hmcVar.fragmentView);
                vlc vlcVar = hmcVar.e;
                if (vlcVar != null && hmcVar.n != null && vlcVar.getVisibility() == 0 && hmcVar.e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(hmcVar.n.getX() + hmcVar.e.getLeft(), hmcVar.n.getY() + hmcVar.e.getTop());
                    canvas.concat(hmcVar.e.getMatrix());
                    if (hmcVar.e.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, hmcVar.e.getWidth(), hmcVar.e.getHeight(), (int) (hmcVar.e.getAlpha() * 255.0f));
                    }
                    hmcVar.e.draw(canvas);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
        }
    }
}
