package kh;
public final class m2 implements Runnable {
    public final int f10814a;
    public final m3 f10815b;
    public final int f10816c;

    public m2(m3 m3Var, int i10, int i11) {
        this.f10814a = i11;
        this.f10815b = m3Var;
        this.f10816c = i10;
    }

    @Override
    public final void run() {
        switch (this.f10814a) {
            case 0:
                this.f10815b.f10820f.scrollBy(0, this.f10816c);
                return;
            default:
                g3 g3Var = this.f10815b.f10820f;
                if (g3Var != null) {
                    g3Var.setSpanCount(this.f10816c);
                    return;
                }
                return;
        }
    }
}
