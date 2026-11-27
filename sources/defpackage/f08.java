package defpackage;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class f08 extends yc8 {
    public final b18 a;

    public f08(b18 b18Var) {
        this.a = b18Var;
    }

    @Override
    public final void A(int i) {
        oy9 oy9Var;
        b18 b18Var = this.a;
        byte b = b18Var.T0;
        if (b == 1) {
            oy9Var = b18Var.k1;
        } else if (b == 4) {
            oy9Var = (oy9) b18Var.l1.get(i);
        } else if (b == 2) {
            oy9Var = b18Var.m1;
        } else if (b == 3) {
            oy9Var = b18Var.n1;
        } else {
            oy9Var = (oy9) b18Var.j1.get(i);
        }
        z08 z08Var = (z08) b18Var.o1.remove(oy9Var);
        if (z08Var == null) {
            return;
        }
        String g1 = b18.g1(oy9Var);
        byte b2 = b18Var.T0;
        String str = null;
        if (b2 == 1) {
            b18Var.k1 = null;
            str = c00.i("selfie", g1);
        } else if (b2 == 4) {
            str = c00.i("translation", g1);
        } else if (b2 == 2) {
            b18Var.m1 = null;
            str = c00.i("front", g1);
        } else if (b2 == 3) {
            b18Var.n1 = null;
            str = c00.i("reverse", g1);
        } else if (b2 == 0) {
            str = c00.i("files", g1);
        }
        if (str != null) {
            HashMap hashMap = b18Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = b18Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        b18Var.W1(b18Var.T0);
        b18Var.j0.removeView(z08Var);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i >= 0) {
            b18 b18Var = this.a;
            if (i < b18Var.j0.getChildCount()) {
                z08 z08Var = (z08) b18Var.j0.getChildAt(i);
                int[] iArr = new int[2];
                z08Var.c.getLocationInWindow(iArr);
                fd8 fd8Var = new fd8();
                fd8Var.b = iArr[0];
                fd8Var.c = iArr[1];
                fd8Var.d = b18Var.j0;
                ImageReceiver imageReceiver = z08Var.c.getImageReceiver();
                fd8Var.a = imageReceiver;
                fd8Var.e = imageReceiver.p();
                return fd8Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String c0() {
        if (this.a.T0 == 1) {
            return ob6.a0("PassportDeleteSelfieAlert", null, 2131747308, new Object[0]);
        }
        return ob6.a0("PassportDeleteScanAlert", null, 2131747310, new Object[0]);
    }
}
