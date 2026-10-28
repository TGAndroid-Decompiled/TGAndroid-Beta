package ni;
public final class l implements Runnable {
    public final int f18889a;
    public final q f18890b;

    public l(q qVar, int i10) {
        this.f18889a = i10;
        this.f18890b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f18889a) {
            case 0:
                b bVar = this.f18890b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f18890b.a();
                return;
        }
    }
}
