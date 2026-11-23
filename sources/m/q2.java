package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f20180a;
    public final SearchView f20181b;

    public q2(SearchView searchView, int i7) {
        this.f20180a = i7;
        this.f20181b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f20180a) {
            case 0:
                this.f20181b.r();
                return;
            default:
                i1.a aVar = this.f20181b.f1869i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
