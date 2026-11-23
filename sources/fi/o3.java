package fi;
public final class o3 implements Runnable {
    public final int f12317a;
    public final hi.q8 f12318b;

    public o3(hi.q8 q8Var, int i7) {
        this.f12317a = i7;
        this.f12318b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f12317a) {
            case 0:
                this.f12318b.dismiss();
                return;
            case 1:
                this.f12318b.dismiss();
                return;
            default:
                this.f12318b.onBackPressed();
                return;
        }
    }
}
