package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class hl1 implements p8c {
    public final byte a;
    public final mu1 b;

    public hl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                u47 u47Var = (u47) obj;
                mu1 mu1Var2 = this.b;
                mu1Var2.y5 = u47Var;
                mu1Var2.H5.k.suggested_post = u47Var.c();
                mu1Var2.Ob(true, null, mu1Var2.H5, null, null, true, 0, null, false, 0L);
                return;
            case 1:
            case 9:
                mu1Var.Tb((u47) obj);
                return;
            case 2:
                mu1Var.Lb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    mu1Var.finishFragment();
                    return;
                }
                return;
            case 3:
                mu1Var.ia((String) obj, false);
                return;
            case 4:
                mu1Var.T1 = (ng1) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof gb2) {
                    gb2 gb2Var = (gb2) view;
                    gb2Var.W6 = mu1Var.K7();
                    gb2Var.X6 = mu1Var.W7();
                    boolean V7 = mu1Var.V7();
                    if (gb2Var.Y6 != V7) {
                        gb2Var.Y6 = V7;
                        mu1Var.A0.getClass();
                        int R = RecyclerView.R(view);
                        gb2Var.F6 = true;
                        gb2Var.forceLayout();
                        if (R >= 0) {
                            mu1Var.D0.g(R);
                        }
                    }
                    gb2Var.Z6 = mu1Var.f7();
                    int g7 = mu1Var.g7();
                    if (gb2Var.a7 != g7) {
                        gb2Var.a7 = g7;
                        gb2Var.d4();
                        gb2Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof uk1) {
                    uk1 uk1Var = (uk1) view;
                    uk1Var.f0 = mu1Var.K7();
                    uk1Var.j0 = mu1Var.W7();
                    mu1Var.V7();
                    mu1Var.f7();
                    int g72 = mu1Var.g7();
                    if (uk1Var.k0 != g72) {
                        uk1Var.k0 = g72;
                        uk1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof ke2) {
                    ((ke2) view).getTextView().setTranslationX(mu1Var.g7() / 2.0f);
                    return;
                } else if (view instanceof oo0) {
                    view.invalidate();
                    return;
                } else if (view instanceof eq0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    mu1Var.S1 = tL_premium_boostsStatus;
                    mu1Var.getMessagesController().E0().b(mu1Var.l6, tL_premium_boostsStatus, new hl1(mu1Var, (byte) 4));
                    return;
                }
                return;
            case 7:
                Long l = (Long) obj;
                kxb kxbVar = mu1Var.g2;
                if (kxbVar != null) {
                    kxbVar.k(l.longValue(), true);
                    return;
                }
                return;
            case 8:
                fq2 fq2Var = mu1Var.f0;
                fq2Var.c.add(((r7) obj).getIconView());
                return;
            case 10:
                int intValue = ((Integer) obj).intValue();
                int i = mu1.nd;
                mu1Var.Ja(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i2 = mu1.nd;
                mu1Var.Ja(intValue2);
                return;
        }
    }
}
