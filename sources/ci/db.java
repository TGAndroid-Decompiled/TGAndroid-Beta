package ci;
public final class db implements Runnable {
    public final int f4541a;
    public final oc f4542b;

    public db(oc ocVar, int i10) {
        this.f4541a = i10;
        this.f4542b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f4541a) {
            case 0:
                oc ocVar = this.f4542b;
                ocVar.getClass();
                ocVar.g(1.0f, true, new ka(ocVar, 6));
                ocVar.f5206b1.b(true, true);
                return;
            default:
                oc ocVar2 = this.f4542b;
                ocVar2.f(false);
                ocVar2.f5240m2 = null;
                return;
        }
    }
}
