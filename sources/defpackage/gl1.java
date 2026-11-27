package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class gl1 implements pcc {
    public final byte a;
    public final zu1 b;

    public gl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.Wb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    zu1Var.finishFragment();
                    return;
                }
                return;
            case 1:
                zu1Var.ta((String) obj, false);
                return;
            case 2:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    zu1Var.S1 = tL_premium_boostsStatus;
                    zu1Var.getMessagesController().G0().b(zu1Var.l6, tL_premium_boostsStatus, new gl1(zu1Var, (byte) 3));
                    return;
                }
                return;
            case 3:
                zu1Var.T1 = (wg1) obj;
                return;
            case 4:
                View view = (View) obj;
                if (view instanceof wb2) {
                    wb2 wb2Var = (wb2) view;
                    wb2Var.W6 = zu1Var.S7();
                    wb2Var.X6 = zu1Var.f8();
                    boolean e8 = zu1Var.e8();
                    if (wb2Var.Y6 != e8) {
                        wb2Var.Y6 = e8;
                        zu1Var.A0.getClass();
                        int S = RecyclerView.S(view);
                        wb2Var.F6 = true;
                        wb2Var.forceLayout();
                        if (S >= 0) {
                            zu1Var.D0.g(S);
                        }
                    }
                    wb2Var.Z6 = zu1Var.n7();
                    int o7 = zu1Var.o7();
                    if (wb2Var.a7 != o7) {
                        wb2Var.a7 = o7;
                        wb2Var.d4();
                        wb2Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof dl1) {
                    dl1 dl1Var = (dl1) view;
                    dl1Var.f0 = zu1Var.S7();
                    dl1Var.j0 = zu1Var.f8();
                    zu1Var.e8();
                    zu1Var.n7();
                    int o72 = zu1Var.o7();
                    if (dl1Var.k0 != o72) {
                        dl1Var.k0 = o72;
                        dl1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof bf2) {
                    ((bf2) view).getTextView().setTranslationX(zu1Var.o7() / 2.0f);
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
            case 5:
                Long l = (Long) obj;
                l1c l1cVar = zu1Var.g2;
                if (l1cVar != null) {
                    l1cVar.k(l.longValue(), true);
                    return;
                }
                return;
            case 6:
                yq2 yq2Var = zu1Var.f0;
                yq2Var.c.add(((s7) obj).getIconView());
                return;
            case 7:
                b77 b77Var = (b77) obj;
                zu1 zu1Var2 = this.b;
                zu1Var2.y5 = b77Var;
                zu1Var2.H5.k.suggested_post = b77Var.c();
                zu1Var2.ac(true, null, zu1Var2.H5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 8:
            case 9:
                zu1Var.fc((b77) obj);
                return;
            default:
                int intValue = ((Integer) obj).intValue();
                int i = zu1.Ad;
                zu1Var.Ua(intValue);
                return;
        }
    }
}
