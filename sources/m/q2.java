package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f20183a;
    public final SearchView f20184b;

    public q2(SearchView searchView, int i7) {
        this.f20183a = i7;
        this.f20184b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f20183a) {
            case 0:
                this.f20184b.r();
                return;
            default:
                i1.a aVar = this.f20184b.f1899i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
