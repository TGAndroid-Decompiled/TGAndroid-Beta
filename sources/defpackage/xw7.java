package defpackage;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class xw7 extends i98 {
    public final vx7 a;

    public xw7(vx7 vx7Var) {
        this.a = vx7Var;
    }

    @Override
    public final void A(int i) {
        uu9 uu9Var;
        vx7 vx7Var = this.a;
        byte b = vx7Var.T0;
        if (b == 1) {
            uu9Var = vx7Var.k1;
        } else if (b == 4) {
            uu9Var = (uu9) vx7Var.l1.get(i);
        } else if (b == 2) {
            uu9Var = vx7Var.m1;
        } else if (b == 3) {
            uu9Var = vx7Var.n1;
        } else {
            uu9Var = (uu9) vx7Var.j1.get(i);
        }
        tx7 tx7Var = (tx7) vx7Var.o1.remove(uu9Var);
        if (tx7Var == null) {
            return;
        }
        String f1 = vx7.f1(uu9Var);
        byte b2 = vx7Var.T0;
        String str = null;
        if (b2 == 1) {
            vx7Var.k1 = null;
            str = b00.h("selfie", f1);
        } else if (b2 == 4) {
            str = b00.h("translation", f1);
        } else if (b2 == 2) {
            vx7Var.m1 = null;
            str = b00.h("front", f1);
        } else if (b2 == 3) {
            vx7Var.n1 = null;
            str = b00.h("reverse", f1);
        } else if (b2 == 0) {
            str = b00.h("files", f1);
        }
        if (str != null) {
            HashMap hashMap = vx7Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = vx7Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        vx7Var.V1(vx7Var.T0);
        vx7Var.j0.removeView(tx7Var);
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i >= 0) {
            vx7 vx7Var = this.a;
            if (i < vx7Var.j0.getChildCount()) {
                tx7 tx7Var = (tx7) vx7Var.j0.getChildAt(i);
                int[] iArr = new int[2];
                tx7Var.c.getLocationInWindow(iArr);
                p98 p98Var = new p98();
                p98Var.b = iArr[0];
                p98Var.c = iArr[1];
                p98Var.d = vx7Var.j0;
                ImageReceiver imageReceiver = tx7Var.c.getImageReceiver();
                p98Var.a = imageReceiver;
                p98Var.e = imageReceiver.p();
                return p98Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.a.T0 == 1) {
            return k96.a0("PassportDeleteSelfieAlert", null, 2131747388, new Object[0]);
        }
        return k96.a0("PassportDeleteScanAlert", null, 2131747390, new Object[0]);
    }
}
