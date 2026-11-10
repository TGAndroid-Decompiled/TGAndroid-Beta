package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f19243a;
    public final SearchView f19244b;

    public r2(SearchView searchView, int i7) {
        this.f19243a = i7;
        this.f19244b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f19243a) {
            case 0:
                this.f19244b.r();
                return;
            default:
                i1.a aVar = this.f19244b.f1956h0;
                if (aVar instanceof z2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
