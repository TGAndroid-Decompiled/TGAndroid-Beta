package defpackage;
public final class k76 extends y1 {
    public final j76 a = new yi6();
    public final int b;
    public boolean c;

    public k76(int i) {
        this.b = i;
    }

    @Override
    public final boolean b(hk0 hk0Var) {
        if (this.c) {
            hk0 hk0Var2 = (hk0) ((yi6) this.a.b);
            return true;
        }
        return true;
    }

    @Override
    public final hk0 e() {
        return this.a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final qk2 h(mp3 mp3Var) {
        boolean z = false;
        if (mp3Var.h) {
            if (((yi6) this.a.c) != null) {
                hk0 e = mp3Var.h().e();
                this.c = ((e instanceof ay7) || (e instanceof j76)) ? true : true;
                return qk2.a(mp3Var.e);
            }
            return null;
        }
        int i = mp3Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new qk2(-1, mp3Var.c + i2, false);
        }
        return null;
    }
}
