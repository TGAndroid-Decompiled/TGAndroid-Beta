package defpackage;
public final class sm8 {
    public final um4 a;
    public final long b;

    public sm8(um8 um8Var, um4 um4Var) {
        long length;
        long j;
        this.a = um4Var;
        long length2 = ((um8Var.b.length() + um8Var.a.length()) << 1) + 128;
        j26 j26Var = (j26) um4Var.b;
        if (j26Var == null) {
            j = 1024;
        } else {
            long length3 = (((int[]) j26Var.b).length << 2) + 64;
            if (((int[]) j26Var.c) == null) {
                length = 0;
            } else {
                length = ((int[]) j26Var.c).length << 2;
            }
            j = length + length3;
        }
        this.b = length2 + j;
    }
}
