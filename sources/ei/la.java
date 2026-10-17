package ei;
public final class la implements Runnable {
    public final int f9388a;
    public final vb f9389b;

    public la(vb vbVar, int i10) {
        this.f9388a = i10;
        this.f9389b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f9388a) {
            case 0:
                vb vbVar = this.f9389b;
                vbVar.getClass();
                vbVar.f(1.0f, true, new t9(vbVar, 6));
                vbVar.f9953b1.b(true, true);
                return;
            default:
                vb vbVar2 = this.f9389b;
                vbVar2.e(false);
                vbVar2.f9987m2 = null;
                return;
        }
    }
}
