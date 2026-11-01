package lg;
public final class c implements Runnable {
    public final int f11856a;
    public final g f11857b;
    public final int f11858c;

    public c(g gVar, int i10, int i11) {
        this.f11856a = i11;
        this.f11857b = gVar;
        this.f11858c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11856a) {
            case 0:
                g gVar = this.f11857b;
                gVar.postOnAnimation(new c(gVar, this.f11858c, 1));
                return;
            default:
                g gVar2 = this.f11857b;
                int i10 = this.f11858c;
                if (gVar2.e && !gVar2.f11872r && i10 == gVar2.E) {
                    gVar2.f11876y = true;
                    gVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
