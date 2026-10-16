package bi;
public final class ea implements Runnable {
    public final int f3003a;
    public final fa f3004b;

    public ea(fa faVar, int i10) {
        this.f3003a = i10;
        this.f3004b = faVar;
    }

    @Override
    public final void run() {
        switch (this.f3003a) {
            case 0:
                ga gaVar = this.f3004b.v;
                gaVar.f3098s = 0;
                gaVar.requestLayout();
                ha haVar = gaVar.J;
                haVar.L(haVar.getWidth(), haVar.getHeight());
                haVar.requestLayout();
                return;
            case 1:
                ga gaVar2 = this.f3004b.v;
                gaVar2.f3098s = 0;
                gaVar2.requestLayout();
                ha haVar2 = gaVar2.J;
                haVar2.L(haVar2.getWidth(), haVar2.getHeight());
                haVar2.requestLayout();
                return;
            case 2:
                fa faVar = this.f3004b;
                faVar.v.post(new ea(faVar, 3));
                return;
            default:
                this.f3004b.v.f3100x = true;
                return;
        }
    }
}
