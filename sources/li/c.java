package li;
public final class c {
    public final int f12030a;
    public final a4.l f12031b;

    public c(a4.l lVar, int i10) {
        this.f12030a = i10;
        this.f12031b = lVar;
    }

    public void a(Exception exc) {
        switch (this.f12030a) {
            case 0:
                a4.l lVar = this.f12031b;
                ((x0) lVar.f279b).f12312i.post(new n0(lVar, exc, 1));
                return;
            default:
                a4.l lVar2 = this.f12031b;
                ((x0) lVar2.f279b).f12312i.post(new n0(lVar2, exc, 0));
                return;
        }
    }
}
