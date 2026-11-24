package defpackage;
public final class d56 {
    public static lp5 a(Object obj, long j) {
        int i;
        lp5 lp5Var = (lp5) d6c.h(obj, j);
        if (!((s3) lp5Var).a) {
            int size = lp5Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            gt8 j2 = ((gt8) lp5Var).j(i);
            d6c.o(obj, j, j2);
            return j2;
        }
        return lp5Var;
    }
}
