package ci;
public final class db implements Runnable {
    public final int f4545a;
    public final oc f4546b;

    public db(oc ocVar, int i10) {
        this.f4545a = i10;
        this.f4546b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f4545a) {
            case 0:
                oc ocVar = this.f4546b;
                ocVar.getClass();
                ocVar.g(1.0f, true, new ka(ocVar, 6));
                ocVar.f5210b1.b(true, true);
                return;
            default:
                oc ocVar2 = this.f4546b;
                ocVar2.f(false);
                ocVar2.f5244m2 = null;
                return;
        }
    }
}
