package fi;
public final class ha implements Runnable {
    public final int f10967a;
    public final sb f10968b;

    public ha(sb sbVar, int i10) {
        this.f10967a = i10;
        this.f10968b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f10967a) {
            case 0:
                sb sbVar = this.f10968b;
                sbVar.getClass();
                sbVar.f(1.0f, true, new p9(sbVar, 6));
                sbVar.f11609b1.b(true, true);
                return;
            default:
                sb sbVar2 = this.f10968b;
                sbVar2.e(false);
                sbVar2.f11643m2 = null;
                return;
        }
    }
}
