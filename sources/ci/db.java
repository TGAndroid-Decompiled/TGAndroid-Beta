package ci;
public final class db implements Runnable {
    public final int f4539a;
    public final oc f4540b;

    public db(oc ocVar, int i10) {
        this.f4539a = i10;
        this.f4540b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f4539a) {
            case 0:
                oc ocVar = this.f4540b;
                ocVar.getClass();
                ocVar.g(1.0f, true, new ka(ocVar, 6));
                ocVar.f5204b1.b(true, true);
                return;
            default:
                oc ocVar2 = this.f4540b;
                ocVar2.f(false);
                ocVar2.f5238m2 = null;
                return;
        }
    }
}
