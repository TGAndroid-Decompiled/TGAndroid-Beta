package defpackage;
public final class ke0 extends wp5 {
    public final byte e;

    @Override
    public final yi6 b() {
        switch (this.e) {
            case 0:
                int i = this.d + 1;
                this.d = i;
                gl6 gl6Var = this.a;
                gl6Var.g = i;
                if (gl6Var.d() == '[') {
                    this.d++;
                    qkb e = e("![");
                    gl6 gl6Var2 = this.a;
                    az0 az0Var = gl6Var2.i;
                    az0 az0Var2 = new az0(e, i, az0Var, gl6Var2.h, true);
                    if (az0Var != null) {
                        az0Var.d = true;
                    }
                    gl6Var2.i = az0Var2;
                    return e;
                }
                return null;
            default:
                int i2 = this.d;
                this.d = i2 + 1;
                qkb e2 = e("[");
                gl6 gl6Var3 = this.a;
                az0 az0Var3 = gl6Var3.i;
                az0 az0Var4 = new az0(e2, i2, az0Var3, gl6Var3.h, false);
                if (az0Var3 != null) {
                    az0Var3.d = true;
                }
                gl6Var3.i = az0Var4;
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
