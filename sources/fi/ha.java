package fi;
public final class ha implements Runnable {
    public final int f10968a;
    public final sb f10969b;

    public ha(sb sbVar, int i10) {
        this.f10968a = i10;
        this.f10969b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f10968a) {
            case 0:
                sb sbVar = this.f10969b;
                sbVar.getClass();
                sbVar.f(1.0f, true, new p9(sbVar, 6));
                sbVar.f11610b1.b(true, true);
                return;
            default:
                sb sbVar2 = this.f10969b;
                sbVar2.e(false);
                sbVar2.f11644m2 = null;
                return;
        }
    }
}
