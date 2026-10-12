package bi;
public final class ea implements Runnable {
    public final int f2999a;
    public final fa f3000b;

    public ea(fa faVar, int i10) {
        this.f2999a = i10;
        this.f3000b = faVar;
    }

    @Override
    public final void run() {
        switch (this.f2999a) {
            case 0:
                ga gaVar = this.f3000b.v;
                gaVar.f3094s = 0;
                gaVar.requestLayout();
                ha haVar = gaVar.J;
                haVar.L(haVar.getWidth(), haVar.getHeight());
                haVar.requestLayout();
                return;
            case 1:
                ga gaVar2 = this.f3000b.v;
                gaVar2.f3094s = 0;
                gaVar2.requestLayout();
                ha haVar2 = gaVar2.J;
                haVar2.L(haVar2.getWidth(), haVar2.getHeight());
                haVar2.requestLayout();
                return;
            case 2:
                fa faVar = this.f3000b;
                faVar.v.post(new ea(faVar, 3));
                return;
            default:
                this.f3000b.v.f3096x = true;
                return;
        }
    }
}
