package ii;
public final class v2 implements Runnable {
    public final int f11685a;
    public final i1 f11686b;
    public final int f11687c;

    public v2(i1 i1Var, int i10, int i11) {
        this.f11685a = i11;
        this.f11686b = i1Var;
        this.f11687c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11685a) {
            case 0:
                i1 i1Var = this.f11686b;
                i1Var.r();
                i1Var.setSelection(Math.max(0, Math.min(this.f11687c, i1Var.length())));
                return;
            case 1:
                i1 i1Var2 = this.f11686b;
                i1Var2.r();
                i1Var2.setSelection(Math.max(0, Math.min(this.f11687c, i1Var2.length())));
                return;
            case 2:
                i1 i1Var3 = this.f11686b;
                i1Var3.r();
                i1Var3.setSelection(Math.max(0, Math.min(this.f11687c, i1Var3.length())));
                return;
            case 3:
                i1 i1Var4 = this.f11686b;
                i1Var4.r();
                i1Var4.setSelection(Math.min(this.f11687c, i1Var4.length()));
                return;
            default:
                i1 i1Var5 = this.f11686b;
                i1Var5.r();
                i1Var5.setSelection(Math.max(0, Math.min(this.f11687c, i1Var5.length())));
                return;
        }
    }
}
