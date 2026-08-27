package eh;

public final class r implements Runnable {

    public final int f5561a;

    public final s f5562b;

    public r(s sVar, int i10) {
        this.f5561a = i10;
        this.f5562b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f5561a) {
            case 0:
                s sVar = this.f5562b;
                sVar.post(new r(sVar, 1));
                break;
            default:
                s sVar2 = this.f5562b;
                sVar2.d = true;
                sVar2.b();
                break;
        }
    }
}
