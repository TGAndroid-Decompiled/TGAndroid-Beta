package di;
public final class m implements Runnable {
    public final int f5976a;
    public final s f5977b;

    public m(s sVar, int i10) {
        this.f5976a = i10;
        this.f5977b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f5976a) {
            case 0:
                c cVar = this.f5977b.f5992w;
                if (cVar != null) {
                    cVar.close();
                    return;
                }
                return;
            default:
                this.f5977b.a();
                return;
        }
    }
}
