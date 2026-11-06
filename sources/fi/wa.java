package fi;
public final class wa implements Runnable {
    public final int f13066a;
    public final fb f13067b;

    public wa(fb fbVar, int i7) {
        this.f13066a = i7;
        this.f13067b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f13066a) {
            case 0:
                fb fbVar = this.f13067b;
                db dbVar = fbVar.M;
                if (dbVar != null) {
                    long j3 = dbVar.f11807a;
                    if (j3 > 0) {
                        fbVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                za zaVar = this.f13067b.f11993a;
                if (zaVar != null) {
                    zaVar.V();
                    return;
                }
                return;
            default:
                za zaVar2 = this.f13067b.f11993a;
                if (zaVar2 != null) {
                    zaVar2.r();
                    return;
                }
                return;
        }
    }
}
