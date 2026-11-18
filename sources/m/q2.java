package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f20186a;
    public final SearchView f20187b;

    public q2(SearchView searchView, int i7) {
        this.f20186a = i7;
        this.f20187b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f20186a) {
            case 0:
                this.f20187b.r();
                return;
            default:
                i1.a aVar = this.f20187b.f1898i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
