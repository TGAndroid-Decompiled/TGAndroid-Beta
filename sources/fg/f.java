package fg;

import org.telegram.ui.vy;
public final class f implements Runnable {
    public final int f8010a;
    public final m f8011b;

    public f(m mVar, int i10) {
        this.f8010a = i10;
        this.f8011b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f8010a) {
            case 0:
                for (vy vyVar : this.f8011b.R.f38431e0) {
                    ((s4.c0) vyVar.f37645a.getLayoutManager()).f41604u = false;
                }
                return;
            default:
                this.f8011b.J();
                return;
        }
    }
}
