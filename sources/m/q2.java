package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f20276a;
    public final SearchView f20277b;

    public q2(SearchView searchView, int i7) {
        this.f20276a = i7;
        this.f20277b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f20276a) {
            case 0:
                this.f20277b.r();
                return;
            default:
                i1.a aVar = this.f20277b.f1870i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
