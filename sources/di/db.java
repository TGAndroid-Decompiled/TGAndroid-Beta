package di;
public final class db implements Runnable {
    public final int f7111a;
    public final pc f7112b;

    public db(pc pcVar, int i10) {
        this.f7111a = i10;
        this.f7112b = pcVar;
    }

    @Override
    public final void run() {
        switch (this.f7111a) {
            case 0:
                pc pcVar = this.f7112b;
                pcVar.getClass();
                pcVar.g(1.0f, true, new ka(pcVar, 6));
                pcVar.f7846b1.b(true, true);
                return;
            default:
                pc pcVar2 = this.f7112b;
                pcVar2.f(false);
                pcVar2.f7881m2 = null;
                return;
        }
    }
}
