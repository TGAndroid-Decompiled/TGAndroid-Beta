package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14475a;
    public final SearchView f14476b;

    public q2(SearchView searchView, int i10) {
        this.f14475a = i10;
        this.f14476b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14475a) {
            case 0:
                this.f14476b.r();
                return;
            default:
                h1.b bVar = this.f14476b.f2009h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
