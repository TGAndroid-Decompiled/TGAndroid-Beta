package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14532a;
    public final SearchView f14533b;

    public q2(SearchView searchView, int i10) {
        this.f14532a = i10;
        this.f14533b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14532a) {
            case 0:
                this.f14533b.r();
                return;
            default:
                h1.b bVar = this.f14533b.f2001h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
