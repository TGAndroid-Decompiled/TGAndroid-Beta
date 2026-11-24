package defpackage;
public final class rs5 extends x1 {
    public final qs5 a = new tg6();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public rs5(int i) {
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
    public final gk0 e() {
        return this.a;
    }

    @Override
    public final vj2 h(vo3 vo3Var) {
        int i;
        int i2 = vo3Var.e;
        String str = vo3Var.a;
        int length = str.length();
        if (vo3Var.g < 4) {
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
            if (i == i4 && lqe.b(' ', str, i2 + i4, length) == length) {
                return new vj2(-1, -1, true);
            }
        }
        return vj2.a(vo3Var.b);
    }
}
