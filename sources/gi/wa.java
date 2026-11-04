package gi;
public final class wa implements Runnable {
    public final int f13809a;
    public final fb f13810b;

    public wa(fb fbVar, int i3) {
        this.f13809a = i3;
        this.f13810b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f13809a) {
            case 0:
                fb fbVar = this.f13810b;
                db dbVar = fbVar.N;
                if (dbVar != null) {
                    long j10 = dbVar.f12602a;
                    if (j10 > 0) {
                        fbVar.I = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                za zaVar = this.f13810b.f12758a;
                if (zaVar != null) {
                    zaVar.X();
                    return;
                }
                return;
            default:
                za zaVar2 = this.f13810b.f12758a;
                if (zaVar2 != null) {
                    zaVar2.s();
                    return;
                }
                return;
        }
    }
}
