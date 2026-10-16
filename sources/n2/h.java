package n2;
public final class h implements Runnable {
    public final int f15669a;
    public final j f15670b;
    public final Object f15671c;

    public h(j jVar, k kVar, int i10) {
        this.f15669a = i10;
        this.f15670b = jVar;
        this.f15671c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f15669a) {
            case 0:
                j jVar = this.f15670b;
                this.f15671c.h(jVar.f15674a, jVar.f15675b);
                return;
            default:
                j jVar2 = this.f15670b;
                this.f15671c.j(jVar2.f15674a, jVar2.f15675b);
                return;
        }
    }
}
