package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xy;
import org.telegram.ui.up0;
public final class i2 extends g.p {
    public final int f2849c;
    public final Object d;

    public i2(Object obj, int i10) {
        this.f2849c = i10;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f2849c) {
            case 0:
                j2 j2Var = (j2) this.d;
                if (j2Var.Y.f2981c.F(i10) == null) {
                    return j2Var.J;
                }
                j2Var.B1();
                return j2Var.R.get(i10);
            case 1:
                q2 q2Var = (q2) this.d;
                if (q2Var.f3443c.j(i10) != 2) {
                    return q2Var.h;
                }
                return 1;
            case 2:
                mj mjVar = (mj) this.d;
                int i15 = mjVar.f25240r;
                int i16 = mjVar.f25242w;
                if (i10 % i16 != i16 - 1) {
                    i11 = AndroidUtilities.dp(5.0f);
                } else {
                    i11 = 0;
                }
                return i15 + i11;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 != chatAttachAlertPhotoLayout.G.f25557n - 1 && ((!chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.O0) || i10 != 0)) {
                    if (chatAttachAlertPhotoLayout.O0) {
                        i10--;
                    }
                    int i17 = chatAttachAlertPhotoLayout.K0;
                    int i18 = chatAttachAlertPhotoLayout.M0;
                    if (i10 % i18 != i18 - 1) {
                        i12 = AndroidUtilities.dp(2.0f);
                    } else {
                        i12 = 0;
                    }
                    return i17 + i12;
                }
                return chatAttachAlertPhotoLayout.F.J;
            case 4:
                xy xyVar = (xy) this.d;
                rz rzVar = xyVar.Y;
                if (i10 == 0) {
                    rzVar.f26837n0.getClass();
                }
                s4.h0 adapter = rzVar.f26820h0.getAdapter();
                wy wyVar = rzVar.f26826j0;
                if (adapter == wyVar && wyVar.f28868x.isEmpty()) {
                    return xyVar.J;
                }
                rzVar.f26837n0.getClass();
                xyVar.B1();
                return xyVar.R.get(i10);
            case 5:
                hy0 hy0Var = (hy0) this.d;
                if ((hy0Var.W != null && (hy0Var.d.e.get(i10) instanceof Integer)) || i10 == hy0Var.d.h) {
                    return hy0Var.d.d;
                }
                return 1;
            case 6:
                up0 up0Var = (up0) this.d;
                if (i10 >= up0Var.f37308b0 && i10 < up0Var.f37310c0) {
                    return 1;
                }
                if (i10 >= up0Var.f37311d0 && i10 < up0Var.f37312e0) {
                    return 1;
                }
                return 3;
            case 7:
                v51 G = ((wh.g4) this.d).f44110i0.G(i10 - 1);
                if (G == null || (i13 = G.f27838u) == -1) {
                    return 3;
                }
                return i13;
            default:
                xh.s0 s0Var = (xh.s0) this.d;
                uz uzVar = s0Var.f46007h0;
                xh.n0 n0Var = s0Var.f46010k0;
                if (n0Var != null && i10 != 0) {
                    v51 G2 = n0Var.G(i10 - 1);
                    if (G2 == null || (i14 = G2.f27838u) == -1) {
                        return uzVar.J;
                    }
                    return i14;
                }
                return uzVar.J;
        }
    }
}
