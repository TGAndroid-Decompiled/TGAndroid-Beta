package ci;
public final class db implements Runnable {
    public final int f4543a;
    public final oc f4544b;

    public db(oc ocVar, int i10) {
        this.f4543a = i10;
        this.f4544b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f4543a) {
            case 0:
                oc ocVar = this.f4544b;
                ocVar.getClass();
                ocVar.g(1.0f, true, new ka(ocVar, 6));
                ocVar.f5208b1.b(true, true);
                return;
            default:
                oc ocVar2 = this.f4544b;
                ocVar2.f(false);
                ocVar2.f5242m2 = null;
                return;
        }
    }
}
