package ei;
public final class la implements Runnable {
    public final int f9397a;
    public final vb f9398b;

    public la(vb vbVar, int i10) {
        this.f9397a = i10;
        this.f9398b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f9397a) {
            case 0:
                vb vbVar = this.f9398b;
                vbVar.getClass();
                vbVar.f(1.0f, true, new t9(vbVar, 6));
                vbVar.f9969b1.b(true, true);
                return;
            default:
                vb vbVar2 = this.f9398b;
                vbVar2.e(false);
                vbVar2.f10003m2 = null;
                return;
        }
    }
}
