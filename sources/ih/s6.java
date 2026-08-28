package ih;
public final class s6 implements Runnable {
    public final int f12122a;
    public final u6 f12123b;

    public s6(u6 u6Var, int i9) {
        this.f12122a = i9;
        this.f12123b = u6Var;
    }

    @Override
    public final void run() {
        switch (this.f12122a) {
            case 0:
                this.f12123b.e();
                return;
            default:
                this.f12123b.b();
                return;
        }
    }
}
