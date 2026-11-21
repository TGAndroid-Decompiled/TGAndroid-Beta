package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f20211a;
    public final SearchView f20212b;

    public q2(SearchView searchView, int i7) {
        this.f20211a = i7;
        this.f20212b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f20211a) {
            case 0:
                this.f20212b.r();
                return;
            default:
                i1.a aVar = this.f20212b.f1911i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
