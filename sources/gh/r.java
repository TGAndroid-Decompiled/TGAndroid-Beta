package gh;
public final class r implements Runnable {
    public final int f7453a;
    public final s f7454b;

    public r(s sVar, int i10) {
        this.f7453a = i10;
        this.f7454b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f7453a) {
            case 0:
                s sVar = this.f7454b;
                sVar.post(new r(sVar, 1));
                return;
            default:
                s sVar2 = this.f7454b;
                sVar2.d = true;
                sVar2.b();
                return;
        }
    }
}
