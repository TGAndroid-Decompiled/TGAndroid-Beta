package gg;

import org.telegram.ui.sy;
public final class f implements Runnable {
    public final int f9716a;
    public final m f9717b;

    public f(m mVar, int i10) {
        this.f9716a = i10;
        this.f9717b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9716a) {
            case 0:
                for (sy syVar : this.f9717b.R.f37976e0) {
                    ((s4.c0) syVar.f37593a.getLayoutManager()).f42999u = false;
                }
                return;
            default:
                this.f9717b.J();
                return;
        }
    }
}
