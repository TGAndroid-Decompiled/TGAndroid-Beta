package ci;
public final class db implements Runnable {
    public final int f4544a;
    public final oc f4545b;

    public db(oc ocVar, int i10) {
        this.f4544a = i10;
        this.f4545b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f4544a) {
            case 0:
                oc ocVar = this.f4545b;
                ocVar.getClass();
                ocVar.g(1.0f, true, new ka(ocVar, 6));
                ocVar.f5209b1.b(true, true);
                return;
            default:
                oc ocVar2 = this.f4545b;
                ocVar2.f(false);
                ocVar2.f5243m2 = null;
                return;
        }
    }
}
