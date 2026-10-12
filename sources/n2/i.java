package n2;
public final class i implements Runnable {
    public final int f15958a;
    public final k f15959b;
    public final Object f15960c;

    public i(k kVar, l lVar, int i10) {
        this.f15958a = i10;
        this.f15959b = kVar;
        this.f15960c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15958a) {
            case 0:
                k kVar = this.f15959b;
                this.f15960c.h(kVar.f15963a, kVar.f15964b);
                return;
            default:
                k kVar2 = this.f15959b;
                this.f15960c.j(kVar2.f15963a, kVar2.f15964b);
                return;
        }
    }
}
