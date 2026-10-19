package ei;
public final class la implements Runnable {
    public final int f9386a;
    public final vb f9387b;

    public la(vb vbVar, int i10) {
        this.f9386a = i10;
        this.f9387b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f9386a) {
            case 0:
                vb vbVar = this.f9387b;
                vbVar.getClass();
                vbVar.f(1.0f, true, new t9(vbVar, 6));
                vbVar.f9952b1.b(true, true);
                return;
            default:
                vb vbVar2 = this.f9387b;
                vbVar2.e(false);
                vbVar2.f9986m2 = null;
                return;
        }
    }
}
