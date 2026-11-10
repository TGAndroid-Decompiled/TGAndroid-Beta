package fi;
public final class wa implements Runnable {
    public final int f13068a;
    public final fb f13069b;

    public wa(fb fbVar, int i7) {
        this.f13068a = i7;
        this.f13069b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f13068a) {
            case 0:
                fb fbVar = this.f13069b;
                db dbVar = fbVar.M;
                if (dbVar != null) {
                    long j3 = dbVar.f11811a;
                    if (j3 > 0) {
                        fbVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                za zaVar = this.f13069b.f11997a;
                if (zaVar != null) {
                    zaVar.V();
                    return;
                }
                return;
            default:
                za zaVar2 = this.f13069b.f11997a;
                if (zaVar2 != null) {
                    zaVar2.r();
                    return;
                }
                return;
        }
    }
}
