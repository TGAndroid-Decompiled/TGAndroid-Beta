package fi;
public final class e9 implements Runnable {
    public final int f11931a;
    public final va f11932b;
    public final boolean f11933c;

    public e9(va vaVar, boolean z9, int i7) {
        this.f11931a = i7;
        this.f11932b = vaVar;
        this.f11933c = z9;
    }

    @Override
    public final void run() {
        switch (this.f11931a) {
            case 0:
                this.f11932b.e(this.f11933c);
                return;
            case 1:
                va vaVar = this.f11932b;
                if (!this.f11933c) {
                    vaVar.J0.b(false, false);
                    return;
                } else {
                    vaVar.getClass();
                    return;
                }
            default:
                va vaVar2 = this.f11932b;
                vaVar2.R = null;
                vaVar2.f12948e = false;
                vaVar2.p(this.f11933c);
                return;
        }
    }
}
