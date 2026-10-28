package fi;
public final class z9 implements Runnable {
    public final int f12075a;
    public final sb f12076b;
    public final boolean f12077c;

    public z9(sb sbVar, boolean z10, int i10) {
        this.f12075a = i10;
        this.f12076b = sbVar;
        this.f12077c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12075a) {
            case 0:
                this.f12076b.e(this.f12077c);
                return;
            case 1:
                sb sbVar = this.f12076b;
                if (!this.f12077c) {
                    sbVar.J0.b(false, false);
                    return;
                } else {
                    sbVar.getClass();
                    return;
                }
            default:
                sb sbVar2 = this.f12076b;
                sbVar2.R = null;
                sbVar2.e = false;
                sbVar2.p(this.f12077c);
                return;
        }
    }
}
