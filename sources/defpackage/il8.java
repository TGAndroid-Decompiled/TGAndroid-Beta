package defpackage;
public final class il8 {
    public final wm4 a;
    public final long b;

    public il8(kl8 kl8Var, wm4 wm4Var) {
        long length;
        long j;
        this.a = wm4Var;
        long length2 = ((kl8Var.b.length() + kl8Var.a.length()) << 1) + 128;
        f26 f26Var = (f26) wm4Var.b;
        if (f26Var == null) {
            j = 1024;
        } else {
            long length3 = (((int[]) f26Var.b).length << 2) + 64;
            if (((int[]) f26Var.c) == null) {
                length = 0;
            } else {
                length = ((int[]) f26Var.c).length << 2;
            }
            j = length + length3;
        }
        this.b = length2 + j;
    }
}
