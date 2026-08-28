package ih;
public final class y3 implements Runnable {
    public final int f12341a;
    public final kh.t9 f12342b;

    public y3(kh.t9 t9Var, int i9) {
        this.f12341a = i9;
        this.f12342b = t9Var;
    }

    @Override
    public final void run() {
        switch (this.f12341a) {
            case 0:
                this.f12342b.dismiss();
                return;
            case 1:
                this.f12342b.dismiss();
                return;
            default:
                this.f12342b.onBackPressed();
                return;
        }
    }
}
