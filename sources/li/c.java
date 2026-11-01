package li;
public final class c {
    public final int f12031a;
    public final a4.l f12032b;

    public c(a4.l lVar, int i10) {
        this.f12031a = i10;
        this.f12032b = lVar;
    }

    public void a(Exception exc) {
        switch (this.f12031a) {
            case 0:
                a4.l lVar = this.f12032b;
                ((x0) lVar.f279b).f12313i.post(new n0(lVar, exc, 1));
                return;
            default:
                a4.l lVar2 = this.f12032b;
                ((x0) lVar2.f279b).f12313i.post(new n0(lVar2, exc, 0));
                return;
        }
    }
}
