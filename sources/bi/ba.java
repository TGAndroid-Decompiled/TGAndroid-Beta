package bi;
public final class ba implements Runnable {
    public final int f2804a;
    public final ca f2805b;

    public ba(ca caVar, int i10) {
        this.f2804a = i10;
        this.f2805b = caVar;
    }

    @Override
    public final void run() {
        switch (this.f2804a) {
            case 0:
                da daVar = this.f2805b.v;
                daVar.f2883s = 0;
                daVar.requestLayout();
                ea eaVar = daVar.J;
                eaVar.L(eaVar.getWidth(), eaVar.getHeight());
                eaVar.requestLayout();
                return;
            case 1:
                da daVar2 = this.f2805b.v;
                daVar2.f2883s = 0;
                daVar2.requestLayout();
                ea eaVar2 = daVar2.J;
                eaVar2.L(eaVar2.getWidth(), eaVar2.getHeight());
                eaVar2.requestLayout();
                return;
            case 2:
                ca caVar = this.f2805b;
                caVar.v.post(new ba(caVar, 3));
                return;
            default:
                this.f2805b.v.f2885x = true;
                return;
        }
    }
}
