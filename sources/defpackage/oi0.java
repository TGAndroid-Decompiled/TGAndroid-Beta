package defpackage;
public final class oi0 extends wpb {
    public final int c;
    public final int d;

    public oi0(wpb wpbVar, int i, int i2) {
        super(wpbVar);
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void a(pj0 pj0Var, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i < i2) {
                if (i == 0 || (i == 31 && i2 <= 62)) {
                    pj0Var.b(31, 5);
                    if (i2 > 62) {
                        pj0Var.b(i2 - 31, 16);
                    } else if (i == 0) {
                        pj0Var.b(Math.min(i2, 31), 5);
                    } else {
                        pj0Var.b(i2 - 31, 5);
                    }
                }
                pj0Var.b(bArr[this.c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        int i = this.c;
        sb.append(i);
        sb.append("::");
        sb.append((i + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
