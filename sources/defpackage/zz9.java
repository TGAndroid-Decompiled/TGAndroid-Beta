package defpackage;

import java.util.ArrayList;
public final class zz9 extends zo {
    public final byte c;
    public final n1a d;

    public zz9(n1a n1aVar, byte b) {
        this.c = b;
        this.d = n1aVar;
    }

    @Override
    public final int i(int i) {
        int i2;
        byte b = this.c;
        n1a n1aVar = this.d;
        switch (b) {
            case 0:
                if (n1aVar.x0.indexOfKey(i) < 0 && n1aVar.A0.indexOfKey(i) < 0 && i != n1aVar.f && i != n1aVar.E && i != n1aVar.n && i != n1aVar.h && i != n1aVar.w && i != n1aVar.a && i != n1aVar.y) {
                    if ((i >= n1aVar.F && i < n1aVar.G) || n1aVar.R) {
                        return 8;
                    }
                    return 5;
                }
                return n1aVar.s0.J;
            default:
                x0a x0aVar = n1aVar.r0;
                int d = x0aVar.d(i);
                if (d == 6) {
                    return n1aVar.s0.J;
                }
                if (d == 5) {
                    return 8;
                }
                n1a n1aVar2 = x0aVar.s;
                if (n1aVar2.a0 == 14) {
                    ArrayList arrayList = n1aVar2.D1;
                    if (arrayList != null && i >= (i2 = x0aVar.c) && i - i2 < arrayList.size()) {
                        return 8;
                    }
                } else {
                    int i3 = x0aVar.c;
                    if (i > i3 && (i - i3) - 1 < n1aVar2.E1.size()) {
                        return 8;
                    }
                }
                return 5;
        }
    }
}
