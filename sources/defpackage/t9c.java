package defpackage;

import java.io.IOException;
public final class t9c {
    public static s9c a(Object obj) {
        ju4 ju4Var = (ju4) obj;
        s9c s9cVar = ju4Var.unknownFields;
        if (s9cVar == s9c.f) {
            s9c s9cVar2 = new s9c(0, new int[8], new Object[8], true);
            ju4Var.unknownFields = s9cVar2;
            return s9cVar2;
        }
        return s9cVar;
    }

    public static boolean b(int i, cf0 cf0Var, Object obj) {
        vk2 vk2Var = (vk2) cf0Var.d;
        int i2 = cf0Var.a;
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
                            cf0Var.B(5);
                            ((s9c) obj).c((i3 << 3) | 5, Integer.valueOf(vk2Var.j()));
                            return true;
                        }
                        throw bs5.b();
                    }
                    s9c s9cVar = new s9c(0, new int[8], new Object[8], true);
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 < 100) {
                        while (cf0Var.c() != Integer.MAX_VALUE && b(i7, cf0Var, s9cVar)) {
                        }
                        if (i6 == cf0Var.a) {
                            if (s9cVar.e) {
                                s9cVar.e = false;
                            }
                            ((s9c) obj).c(i5 | 3, s9cVar);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((s9c) obj).c((i3 << 3) | 2, cf0Var.h());
                return true;
            }
            cf0Var.B(1);
            ((s9c) obj).c((i3 << 3) | 1, Long.valueOf(vk2Var.k()));
            return true;
        }
        cf0Var.B(0);
        ((s9c) obj).c(i3 << 3, Long.valueOf(vk2Var.n()));
        return true;
    }
}
