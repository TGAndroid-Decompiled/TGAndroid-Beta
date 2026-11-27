package defpackage;
public final class pa4 extends y1 {
    public final oa4 a;
    public String b;
    public final StringBuilder c;

    public pa4(char c, int i, int i2) {
        ?? yi6Var = new yi6();
        this.a = yi6Var;
        this.c = new StringBuilder();
        yi6Var.g = c;
        yi6Var.h = i;
        yi6Var.i = i2;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void d() {
        String a = u44.a(this.b.trim());
        oa4 oa4Var = this.a;
        oa4Var.j = a;
        oa4Var.k = this.c.toString();
    }

    @Override
    public final hk0 e() {
        return this.a;
    }

    @Override
    public final qk2 h(mp3 mp3Var) {
        int i = mp3Var.e;
        int i2 = mp3Var.b;
        String str = mp3Var.a;
        int i3 = mp3Var.g;
        oa4 oa4Var = this.a;
        if (i3 < 4) {
            char c = oa4Var.g;
            int i4 = oa4Var.h;
            int b = dve.b(c, str, i, str.length()) - i;
            if (b >= i4 && dve.c(i + b, str.length(), str) == str.length()) {
                return new qk2(-1, -1, true);
            }
        }
        int length = str.length();
        for (int i5 = oa4Var.i; i5 > 0 && i2 < length && str.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return qk2.a(i2);
    }
}
