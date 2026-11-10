package fi;
public final class e9 implements Runnable {
    public final int f11935a;
    public final va f11936b;
    public final boolean f11937c;

    public e9(va vaVar, boolean z9, int i7) {
        this.f11935a = i7;
        this.f11936b = vaVar;
        this.f11937c = z9;
    }

    @Override
    public final void run() {
        switch (this.f11935a) {
            case 0:
                this.f11936b.e(this.f11937c);
                return;
            case 1:
                va vaVar = this.f11936b;
                if (!this.f11937c) {
                    vaVar.J0.b(false, false);
                    return;
                } else {
                    vaVar.getClass();
                    return;
                }
            default:
                va vaVar2 = this.f11936b;
                vaVar2.R = null;
                vaVar2.f12950e = false;
                vaVar2.p(this.f11937c);
                return;
        }
    }
}
