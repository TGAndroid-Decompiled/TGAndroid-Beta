package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh3 implements View.OnLongClickListener {
    public final byte a;
    public final uj3 b;

    public bh3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = uj3Var.K2;
                if (uj3Var.getParentActivity() == null) {
                    return false;
                }
                boolean z3 = !arrayList.isEmpty();
                boolean z4 = true;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long longValue = ((Long) arrayList.get(i3)).longValue();
                    if (z3 && longValue != uj3Var.getUserConfig().e()) {
                        z3 = false;
                    }
                    if (wf3.B(longValue)) {
                        z4 = false;
                    }
                    TLRPC.Chat M0 = uj3Var.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null && !xc2.B(M0)) {
                        z4 = false;
                    }
                }
                if (uj3Var.z3() && uj3Var.G2()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ArrayList arrayList2 = uj3Var.F2;
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            if (((no6) obj).b()) {
                                z = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = uj3Var.F2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fu5 I = fu5.I(uj3Var, view);
                if (z2) {
                    i = 2131745363;
                } else {
                    i = 2131745364;
                }
                I.k(2131232364, ob6.M0(i, null), new rg3(uj3Var, (byte) 22), z);
                I.b(2131231512, ob6.M0(2131745311, null), new rg3(uj3Var, (byte) 23), false);
                if (z3) {
                    i2 = 2131745242;
                } else {
                    i2 = 2131745587;
                }
                I.k(2131232082, ob6.M0(i2, null), new xac((byte) 15, uj3Var, z3), z4);
                I.a0();
                return true;
            case 1:
                uj3 uj3Var2 = this.b;
                uj3Var2.K4(uj3Var2.K2, 104, true, true, null);
                return true;
            case 2:
                uj3Var.E4(view);
                return true;
            default:
                uj3Var.getContactsController().B();
                uj3Var.f5();
                return true;
        }
    }
}
