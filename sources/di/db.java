package di;
public final class db implements Runnable {
    public final int f7139a;
    public final pc f7140b;

    public db(pc pcVar, int i10) {
        this.f7139a = i10;
        this.f7140b = pcVar;
    }

    @Override
    public final void run() {
        switch (this.f7139a) {
            case 0:
                pc pcVar = this.f7140b;
                pcVar.getClass();
                pcVar.g(1.0f, true, new ka(pcVar, 6));
                pcVar.f7874b1.b(true, true);
                return;
            default:
                pc pcVar2 = this.f7140b;
                pcVar2.f(false);
                pcVar2.f7909m2 = null;
                return;
        }
    }
}
