package lh;
public final class m2 implements Runnable {
    public final int f12849a;
    public final n3 f12850b;
    public final int f12851c;

    public m2(n3 n3Var, int i10, int i11) {
        this.f12849a = i11;
        this.f12850b = n3Var;
        this.f12851c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12849a) {
            case 0:
                this.f12850b.f12864f.scrollBy(0, this.f12851c);
                return;
            default:
                h3 h3Var = this.f12850b.f12864f;
                if (h3Var != null) {
                    h3Var.setSpanCount(this.f12851c);
                    return;
                }
                return;
        }
    }
}
