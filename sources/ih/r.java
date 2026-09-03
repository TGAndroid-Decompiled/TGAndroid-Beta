package ih;
public final class r implements Runnable {
    public final int f7633a;
    public final s f7634b;

    public r(s sVar, int i10) {
        this.f7633a = i10;
        this.f7634b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f7633a) {
            case 0:
                s sVar = this.f7634b;
                sVar.post(new r(sVar, 1));
                return;
            default:
                s sVar2 = this.f7634b;
                sVar2.d = true;
                sVar2.b();
                return;
        }
    }
}
