package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hg3 implements View.OnLongClickListener {
    public final byte a;
    public final cj3 b;

    public hg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = cj3Var.K2;
                if (cj3Var.getParentActivity() == null) {
                    return false;
                }
                boolean z3 = !arrayList.isEmpty();
                boolean z4 = true;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long longValue = ((Long) arrayList.get(i3)).longValue();
                    if (z3 && longValue != cj3Var.getUserConfig().e()) {
                        z3 = false;
                    }
                    if (cf3.B(longValue)) {
                        z4 = false;
                    }
                    TLRPC.Chat K0 = cj3Var.getMessagesController().K0(Long.valueOf(-longValue));
                    if (K0 != null && !hc2.B(K0)) {
                        z4 = false;
                    }
                }
                if (cj3Var.x3() && cj3Var.E2()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ArrayList arrayList2 = cj3Var.F2;
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            if (((jm6) obj).b()) {
                                z = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = cj3Var.F2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cs5 I = cs5.I(cj3Var, view);
                if (z2) {
                    i = 2131745443;
                } else {
                    i = 2131745444;
                }
                I.k(2131232364, k96.M0(i, null), new wf3(cj3Var, (byte) 13), z);
                I.b(2131231512, k96.M0(2131745391, null), new wf3(cj3Var, (byte) 14), false);
                if (z3) {
                    i2 = 2131745322;
                } else {
                    i2 = 2131745667;
                }
                I.k(2131232082, k96.M0(i2, null), new x6c((byte) 15, cj3Var, z3), z4);
                I.a0();
                return true;
            case 1:
                cj3 cj3Var2 = this.b;
                cj3Var2.G4(cj3Var2.K2, 104, true, true, null);
                return true;
            case 2:
                cj3Var.A4(view);
                return true;
            default:
                cj3Var.getContactsController().B();
                cj3Var.b5();
                return true;
        }
    }
}
