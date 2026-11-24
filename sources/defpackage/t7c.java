package defpackage;

import java.io.IOException;
public final class t7c {
    public static s7c a(Object obj) {
        gu4 gu4Var = (gu4) obj;
        s7c s7cVar = gu4Var.unknownFields;
        if (s7cVar == s7c.f) {
            s7c s7cVar2 = new s7c(0, new int[8], new Object[8], true);
            gu4Var.unknownFields = s7cVar2;
            return s7cVar2;
        }
        return s7cVar;
    }

    public static boolean b(int i, ag0 ag0Var, Object obj) {
        nl2 nl2Var = (nl2) ag0Var.d;
        int i2 = ag0Var.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return false;
                        }
                        if (i4 == 5) {
                            ag0Var.B(5);
                            ((s7c) obj).c((i3 << 3) | 5, Integer.valueOf(nl2Var.j()));
                            return true;
                        }
                        throw yr5.b();
                    }
                    s7c s7cVar = new s7c(0, new int[8], new Object[8], true);
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 < 100) {
                        while (ag0Var.c() != Integer.MAX_VALUE && b(i7, ag0Var, s7cVar)) {
                        }
                        if (i6 == ag0Var.a) {
                            if (s7cVar.e) {
                                s7cVar.e = false;
                            }
                            ((s7c) obj).c(i5 | 3, s7cVar);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((s7c) obj).c((i3 << 3) | 2, ag0Var.h());
                return true;
            }
            ag0Var.B(1);
            ((s7c) obj).c((i3 << 3) | 1, Long.valueOf(nl2Var.k()));
            return true;
        }
        ag0Var.B(0);
        ((s7c) obj).c(i3 << 3, Long.valueOf(nl2Var.n()));
        return true;
    }
}
