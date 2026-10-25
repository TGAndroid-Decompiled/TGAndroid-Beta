package ig;

import org.telegram.ui.ay;
public final class f implements Runnable {
    public final int f14049a;
    public final n f14050b;

    public f(n nVar, int i10) {
        this.f14049a = i10;
        this.f14050b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f14049a) {
            case 0:
                for (ay ayVar : this.f14050b.R.f38583e0) {
                    ((s4.c0) ayVar.f37910a.getLayoutManager()).f47711u = false;
                }
                return;
            default:
                this.f14050b.K();
                return;
        }
    }
}
