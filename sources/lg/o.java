package lg;
public final class o implements Runnable {
    public final int f11913a;
    public final p f11914b;

    public o(p pVar, int i10) {
        this.f11913a = i10;
        this.f11914b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f11913a) {
            case 0:
                p pVar = this.f11914b;
                if (pVar.d.J == pVar) {
                    pVar.d.W = false;
                    pVar.d.f11919a0 = null;
                    pVar.d.i();
                    return;
                }
                return;
            default:
                p pVar2 = this.f11914b;
                if (pVar2.d.J == pVar2 && !pVar2.f11916b) {
                    pVar2.d.W = true;
                    Runnable runnable = pVar2.d.f11919a0;
                    pVar2.d.f11919a0 = null;
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
