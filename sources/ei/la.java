package ei;
public final class la implements Runnable {
    public final int f9389a;
    public final vb f9390b;

    public la(vb vbVar, int i10) {
        this.f9389a = i10;
        this.f9390b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f9389a) {
            case 0:
                vb vbVar = this.f9390b;
                vbVar.getClass();
                vbVar.f(1.0f, true, new t9(vbVar, 6));
                vbVar.f9955b1.b(true, true);
                return;
            default:
                vb vbVar2 = this.f9390b;
                vbVar2.e(false);
                vbVar2.f9989m2 = null;
                return;
        }
    }
}
