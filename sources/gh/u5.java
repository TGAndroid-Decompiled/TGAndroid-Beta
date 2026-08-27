package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yy;
import org.telegram.ui.vo0;

public final class u5 extends f2.w {

    public final int f7563c;
    public final Object d;

    public u5(Object obj, int i10) {
        this.f7563c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.f7563c) {
            case 0:
                n41 n41VarG = ((x5) this.d).f7630e0.G(i10 - 1);
                if (n41VarG == null || (i11 = n41VarG.f30853u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                hh.l1 l1Var = (hh.l1) this.d;
                bz bzVar = l1Var.f9641d0;
                hh.e1 e1Var = l1Var.f9644g0;
                if (e1Var == null || i10 == 0) {
                    return bzVar.J;
                }
                n41 n41VarG2 = e1Var.G(i10 - 1);
                return (n41VarG2 == null || (i12 = n41VarG2.f30853u) == -1) ? bzVar.J : i12;
            case 2:
                lh.t1 t1Var = (lh.t1) this.d;
                if (t1Var.Y.f16897c.F(i10) == null) {
                    return t1Var.J;
                }
                t1Var.B1();
                return t1Var.R.get(i10);
            case 3:
                lh.z1 z1Var = (lh.z1) this.d;
                if (z1Var.f17174c.j(i10) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                ui uiVar = (ui) this.d;
                int i13 = uiVar.f33087r;
                int i14 = uiVar.f33089w;
                return i13 + (i10 % i14 != i14 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 == chatAttachAlertPhotoLayout.C.f33117n - 1 || ((chatAttachAlertPhotoLayout.L0 || chatAttachAlertPhotoLayout.K0) && i10 == 0)) {
                    return chatAttachAlertPhotoLayout.B.J;
                }
                if (chatAttachAlertPhotoLayout.K0) {
                    i10--;
                }
                int i15 = chatAttachAlertPhotoLayout.G0;
                int i16 = chatAttachAlertPhotoLayout.I0;
                return i15 + (i10 % i16 != i16 + (-1) ? AndroidUtilities.dp(2.0f) : 0);
            case 6:
                dy dyVar = (dy) this.d;
                yy yyVar = dyVar.Y;
                if (i10 == 0) {
                    yyVar.f35007j0.getClass();
                }
                f2.q0 adapter = yyVar.f34987d0.getAdapter();
                cy cyVar = yyVar.f34995f0;
                if (adapter == cyVar && cyVar.f27569x.isEmpty()) {
                    return dyVar.J;
                }
                yyVar.f35007j0.getClass();
                dyVar.B1();
                return dyVar.R.get(i10);
            case 7:
                ex0 ex0Var = (ex0) this.d;
                if ((ex0Var.S == null || !(ex0Var.d.f26835e.get(i10) instanceof Integer)) && i10 != ex0Var.d.h) {
                    return 1;
                }
                return ex0Var.d.d;
            default:
                vo0 vo0Var = (vo0) this.d;
                if (i10 < vo0Var.P || i10 >= vo0Var.Q) {
                    return (i10 < vo0Var.R || i10 >= vo0Var.S) ? 3 : 1;
                }
                return 1;
        }
    }
}
