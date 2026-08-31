package jh;
public final class r implements Runnable {
    public final int f10183a;
    public final s f10184b;

    public r(s sVar, int i10) {
        this.f10183a = i10;
        this.f10184b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f10183a) {
            case 0:
                s sVar = this.f10184b;
                sVar.post(new r(sVar, 1));
                return;
            default:
                s sVar2 = this.f10184b;
                sVar2.d = true;
                sVar2.b();
                return;
        }
    }
}
