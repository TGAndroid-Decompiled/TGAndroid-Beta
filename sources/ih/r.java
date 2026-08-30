package ih;
public final class r implements Runnable {
    public final int f7651a;
    public final s f7652b;

    public r(s sVar, int i10) {
        this.f7651a = i10;
        this.f7652b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f7651a) {
            case 0:
                s sVar = this.f7652b;
                sVar.post(new r(sVar, 1));
                return;
            default:
                s sVar2 = this.f7652b;
                sVar2.d = true;
                sVar2.b();
                return;
        }
    }
}
