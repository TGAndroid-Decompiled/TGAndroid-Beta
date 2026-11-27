package defpackage;
public final class h76 {
    public static or5 a(long j, Object obj) {
        int i;
        or5 or5Var = (or5) dac.h(j, obj);
        if (!((t3) or5Var).a) {
            int size = or5Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            pw8 j2 = ((pw8) or5Var).j(i);
            dac.o(j, obj, j2);
            return j2;
        }
        return or5Var;
    }
}
