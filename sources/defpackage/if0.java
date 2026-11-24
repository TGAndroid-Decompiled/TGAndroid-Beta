package defpackage;
public final class if0 extends tp5 {
    public final byte e;

    @Override
    public final ui6 b() {
        switch (this.e) {
            case 0:
                int i = this.d + 1;
                this.d = i;
                el6 el6Var = this.a;
                el6Var.g = i;
                if (el6Var.d() == '[') {
                    this.d++;
                    vib e = e("![");
                    el6 el6Var2 = this.a;
                    zz0 zz0Var = el6Var2.i;
                    zz0 zz0Var2 = new zz0(e, i, zz0Var, el6Var2.h, true);
                    if (zz0Var != null) {
                        zz0Var.d = true;
                    }
                    el6Var2.i = zz0Var2;
                    return e;
                }
                return null;
            default:
                int i2 = this.d;
                this.d = i2 + 1;
                vib e2 = e("[");
                el6 el6Var3 = this.a;
                zz0 zz0Var3 = el6Var3.i;
                zz0 zz0Var4 = new zz0(e2, i2, zz0Var3, el6Var3.h, false);
                if (zz0Var3 != null) {
                    zz0Var3.d = true;
                }
                el6Var3.i = zz0Var4;
                return e2;
        }
    }

    @Override
    public final char c() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
