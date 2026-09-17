package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14300a;
    public final SearchView f14301b;

    public q2(SearchView searchView, int i10) {
        this.f14300a = i10;
        this.f14301b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14300a) {
            case 0:
                this.f14301b.r();
                return;
            default:
                h1.b bVar = this.f14301b.f2009h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
