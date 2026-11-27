package defpackage;
public final class uu5 extends y1 {
    public final tu5 a = new yi6();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public uu5(int i) {
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
    public final hk0 e() {
        return this.a;
    }

    @Override
    public final qk2 h(mp3 mp3Var) {
        int i;
        int i2 = mp3Var.e;
        String str = mp3Var.a;
        int length = str.length();
        if (mp3Var.g < 4) {
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
            if (i == i4 && dve.b(' ', str, i2 + i4, length) == length) {
                return new qk2(-1, -1, true);
            }
        }
        return qk2.a(mp3Var.b);
    }
}
