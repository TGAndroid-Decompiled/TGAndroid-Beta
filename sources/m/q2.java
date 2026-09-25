package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14531a;
    public final SearchView f14532b;

    public q2(SearchView searchView, int i10) {
        this.f14531a = i10;
        this.f14532b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14531a) {
            case 0:
                this.f14532b.r();
                return;
            default:
                h1.b bVar = this.f14532b.f2001h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
