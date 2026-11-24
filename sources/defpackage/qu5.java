package defpackage;
public final class qu5 extends x1 {
    public final pu5 a = new ui6();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public qu5(int i) {
        this.c = i;
    }

    @Override
    public final void a(CharSequence charSequence) {
        StringBuilder sb = this.b;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override
    public final gl0 e() {
        return this.a;
    }

    @Override
    public final il2 h(fq3 fq3Var) {
        int i;
        int i2 = fq3Var.e;
        String str = fq3Var.a;
        int length = str.length();
        if (fq3Var.g < 4) {
            int i3 = i2;
            while (true) {
                if (i3 < length) {
                    if ('$' != str.charAt(i3)) {
                        i = i3 - i2;
                        break;
                    }
                    i3++;
                } else {
                    i = length - i2;
                    break;
                }
            }
            int i4 = this.c;
            if (i == i4 && ose.b(' ', str, i2 + i4, length) == length) {
                return new il2(-1, -1, true);
            }
        }
        return il2.a(fq3Var.b);
    }
}
