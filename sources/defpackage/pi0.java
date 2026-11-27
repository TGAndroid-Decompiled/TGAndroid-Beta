package defpackage;
public final class pi0 extends xtb {
    public final int c;
    public final int d;

    public pi0(xtb xtbVar, int i, int i2) {
        super(xtbVar);
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void a(qj0 qj0Var, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i < i2) {
                if (i == 0 || (i == 31 && i2 <= 62)) {
                    qj0Var.b(31, 5);
                    if (i2 > 62) {
                        qj0Var.b(i2 - 31, 16);
                    } else if (i == 0) {
                        qj0Var.b(Math.min(i2, 31), 5);
                    } else {
                        qj0Var.b(i2 - 31, 5);
                    }
                }
                qj0Var.b(bArr[this.c + i], 8);
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
