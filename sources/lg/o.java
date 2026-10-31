package lg;
public final class o implements Runnable {
    public final int f11912a;
    public final p f11913b;

    public o(p pVar, int i10) {
        this.f11912a = i10;
        this.f11913b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f11912a) {
            case 0:
                p pVar = this.f11913b;
                if (pVar.d.J == pVar) {
                    pVar.d.W = false;
                    pVar.d.f11918a0 = null;
                    pVar.d.i();
                    return;
                }
                return;
            default:
                p pVar2 = this.f11913b;
                if (pVar2.d.J == pVar2 && !pVar2.f11915b) {
                    pVar2.d.W = true;
                    Runnable runnable = pVar2.d.f11918a0;
                    pVar2.d.f11918a0 = null;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
