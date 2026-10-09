package gg;

import org.telegram.ui.sy;
public final class f implements Runnable {
    public final int f10590a;
    public final m f10591b;

    public f(m mVar, int i10) {
        this.f10590a = i10;
        this.f10591b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10590a) {
            case 0:
                for (sy syVar : this.f10591b.R.f42172e0) {
                    ((s4.d0) syVar.f41788a.getLayoutManager()).f47650u = false;
                }
                return;
            default:
                this.f10591b.J();
                return;
        }
    }
}
