package defpackage;
public final class e76 extends y1 {
    public final c76 a;
    public boolean b;
    public int c;

    public e76(c76 c76Var) {
        this.a = c76Var;
    }

    @Override
    public final boolean b(hk0 hk0Var) {
        if (!(hk0Var instanceof j76)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
        if (mp3Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return qk2.a(mp3Var.b);
    }
}
