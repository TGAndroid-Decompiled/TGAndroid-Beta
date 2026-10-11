package ii;
public final class w2 implements Runnable {
    public final int f12762a;
    public final i1 f12763b;
    public final int f12764c;

    public w2(i1 i1Var, int i10, int i11) {
        this.f12762a = i11;
        this.f12763b = i1Var;
        this.f12764c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12762a) {
            case 0:
                i1 i1Var = this.f12763b;
                i1Var.r();
                i1Var.setSelection(Math.max(0, Math.min(this.f12764c, i1Var.length())));
                return;
            case 1:
                i1 i1Var2 = this.f12763b;
                i1Var2.r();
                i1Var2.setSelection(Math.max(0, Math.min(this.f12764c, i1Var2.length())));
                return;
            case 2:
                i1 i1Var3 = this.f12763b;
                i1Var3.r();
                i1Var3.setSelection(Math.max(0, Math.min(this.f12764c, i1Var3.length())));
                return;
            case 3:
                i1 i1Var4 = this.f12763b;
                i1Var4.r();
                i1Var4.setSelection(Math.min(this.f12764c, i1Var4.length()));
                return;
            default:
                i1 i1Var5 = this.f12763b;
                i1Var5.r();
                i1Var5.setSelection(Math.max(0, Math.min(this.f12764c, i1Var5.length())));
                return;
        }
    }
}
