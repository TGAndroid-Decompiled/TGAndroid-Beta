package fi;
public final class z9 implements Runnable {
    public final int f12076a;
    public final sb f12077b;
    public final boolean f12078c;

    public z9(sb sbVar, boolean z10, int i10) {
        this.f12076a = i10;
        this.f12077b = sbVar;
        this.f12078c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12076a) {
            case 0:
                this.f12077b.e(this.f12078c);
                return;
            case 1:
                sb sbVar = this.f12077b;
                if (!this.f12078c) {
                    sbVar.J0.b(false, false);
                    return;
                } else {
                    sbVar.getClass();
                    return;
                }
            default:
                sb sbVar2 = this.f12077b;
                sbVar2.R = null;
                sbVar2.e = false;
                sbVar2.p(this.f12078c);
                return;
        }
    }
}
