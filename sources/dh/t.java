package dh;
public final class t implements Runnable {
    public final int f4665a;
    public final u f4666b;

    public t(u uVar, int i9) {
        this.f4665a = i9;
        this.f4666b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f4665a) {
            case 0:
                u uVar = this.f4666b;
                uVar.post(new t(uVar, 1));
                return;
            default:
                u uVar2 = this.f4666b;
                uVar2.d = true;
                uVar2.b();
                return;
        }
    }
}
