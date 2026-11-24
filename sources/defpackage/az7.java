package defpackage;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class az7 extends jb8 {
    public final xz7 a;

    public az7(xz7 xz7Var) {
        this.a = xz7Var;
    }

    @Override
    public final void B(int i) {
        xw9 xw9Var;
        xz7 xz7Var = this.a;
        byte b = xz7Var.T0;
        if (b == 1) {
            xw9Var = xz7Var.k1;
        } else if (b == 4) {
            xw9Var = (xw9) xz7Var.l1.get(i);
        } else if (b == 2) {
            xw9Var = xz7Var.m1;
        } else if (b == 3) {
            xw9Var = xz7Var.n1;
        } else {
            xw9Var = (xw9) xz7Var.j1.get(i);
        }
        vz7 vz7Var = (vz7) xz7Var.o1.remove(xw9Var);
        if (vz7Var == null) {
            return;
        }
        String g1 = xz7.g1(xw9Var);
        byte b2 = xz7Var.T0;
        String str = null;
        if (b2 == 1) {
            xz7Var.k1 = null;
            str = b10.h("selfie", g1);
        } else if (b2 == 4) {
            str = b10.h("translation", g1);
        } else if (b2 == 2) {
            xz7Var.m1 = null;
            str = b10.h("front", g1);
        } else if (b2 == 3) {
            xz7Var.n1 = null;
            str = b10.h("reverse", g1);
        } else if (b2 == 0) {
            str = b10.h("files", g1);
        }
        if (str != null) {
            HashMap hashMap = xz7Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = xz7Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        xz7Var.W1(xz7Var.T0);
        xz7Var.j0.removeView(vz7Var);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i >= 0) {
            xz7 xz7Var = this.a;
            if (i < xz7Var.j0.getChildCount()) {
                vz7 vz7Var = (vz7) xz7Var.j0.getChildAt(i);
                int[] iArr = new int[2];
                vz7Var.c.getLocationInWindow(iArr);
                qb8 qb8Var = new qb8();
                qb8Var.b = iArr[0];
                qb8Var.c = iArr[1];
                qb8Var.d = xz7Var.j0;
                ImageReceiver imageReceiver = vz7Var.c.getImageReceiver();
                qb8Var.a = imageReceiver;
                qb8Var.e = imageReceiver.p();
                return qb8Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String c0() {
        if (this.a.T0 == 1) {
            return jb6.a0("PassportDeleteSelfieAlert", null, 2131747314, new Object[0]);
        }
        return jb6.a0("PassportDeleteScanAlert", null, 2131747316, new Object[0]);
    }
}
