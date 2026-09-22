package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14526a;
    public final SearchView f14527b;

    public q2(SearchView searchView, int i10) {
        this.f14526a = i10;
        this.f14527b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14526a) {
            case 0:
                this.f14527b.r();
                return;
            default:
                h1.b bVar = this.f14527b.f2008h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
