package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uh3 implements View.OnLongClickListener {
    public final byte a;
    public final nk3 b;

    public uh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = nk3Var.K2;
                if (nk3Var.getParentActivity() == null) {
                    return false;
                }
                boolean z3 = !arrayList.isEmpty();
                boolean z4 = true;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long longValue = ((Long) arrayList.get(i3)).longValue();
                    if (z3 && longValue != nk3Var.getUserConfig().e()) {
                        z3 = false;
                    }
                    if (pg3.B(longValue)) {
                        z4 = false;
                    }
                    TLRPC.Chat L0 = nk3Var.getMessagesController().L0(Long.valueOf(-longValue));
                    if (L0 != null && !sd2.B(L0)) {
                        z4 = false;
                    }
                }
                if (nk3Var.z3() && nk3Var.G2()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ArrayList arrayList2 = nk3Var.F2;
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            if (((jo6) obj).b()) {
                                z = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = nk3Var.F2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bu5 I = bu5.I(nk3Var, view);
                if (z2) {
                    i = 2131745369;
                } else {
                    i = 2131745370;
                }
                I.k(2131232365, jb6.M0(i, null), new kh3(nk3Var, (byte) 13), z);
                I.b(2131231513, jb6.M0(2131745317, null), new kh3(nk3Var, (byte) 14), false);
                if (z3) {
                    i2 = 2131745248;
                } else {
                    i2 = 2131745593;
                }
                I.k(2131232083, jb6.M0(i2, null), new y8c((byte) 15, nk3Var, z3), z4);
                I.a0();
                return true;
            case 1:
                nk3 nk3Var2 = this.b;
                nk3Var2.K4(nk3Var2.K2, 104, true, true, null);
                return true;
            case 2:
                nk3Var.E4(view);
                return true;
            default:
                nk3Var.getContactsController().B();
                nk3Var.f5();
                return true;
        }
    }
}
