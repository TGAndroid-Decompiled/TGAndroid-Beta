package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f19819a;
    public final SearchView f19820b;

    public q2(SearchView searchView, int i7) {
        this.f19819a = i7;
        this.f19820b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f19819a) {
            case 0:
                this.f19820b.r();
                return;
            default:
                i1.a aVar = this.f19820b.f1907i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
