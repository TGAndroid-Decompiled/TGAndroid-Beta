package ai;
public final class o3 implements Runnable {
    public final int f853a;
    public final o4 f854b;
    public final int f855c;

    public o3(o4 o4Var, int i3, int i10) {
        this.f853a = i10;
        this.f854b = o4Var;
        this.f855c = i3;
    }

    @Override
    public final void run() {
        switch (this.f853a) {
            case 0:
                this.f854b.f860f.scrollBy(0, this.f855c);
                return;
            default:
                h4 h4Var = this.f854b.f860f;
                if (h4Var != null) {
                    h4Var.setSpanCount(this.f855c);
                    return;
                }
                return;
        }
    }
}
