package defpackage;
public final class d76 {
    public static lr5 a(Object obj, long j) {
        int i;
        lr5 lr5Var = (lr5) d8c.h(obj, j);
        if (!((s3) lr5Var).a) {
            int size = lr5Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            hv8 j2 = ((hv8) lr5Var).j(i);
            d8c.o(obj, j, j2);
            return j2;
        }
        return lr5Var;
    }
}
