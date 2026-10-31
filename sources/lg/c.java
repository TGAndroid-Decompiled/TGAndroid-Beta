package lg;
public final class c implements Runnable {
    public final int f11855a;
    public final g f11856b;
    public final int f11857c;

    public c(g gVar, int i10, int i11) {
        this.f11855a = i11;
        this.f11856b = gVar;
        this.f11857c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11855a) {
            case 0:
                g gVar = this.f11856b;
                gVar.postOnAnimation(new c(gVar, this.f11857c, 1));
                return;
            default:
                g gVar2 = this.f11856b;
                int i10 = this.f11857c;
                if (gVar2.e && !gVar2.f11871r && i10 == gVar2.E) {
                    gVar2.f11875y = true;
                    gVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
