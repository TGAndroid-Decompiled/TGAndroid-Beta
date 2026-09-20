package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14511a;
    public final SearchView f14512b;

    public q2(SearchView searchView, int i10) {
        this.f14511a = i10;
        this.f14512b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14511a) {
            case 0:
                this.f14512b.r();
                return;
            default:
                h1.b bVar = this.f14512b.f2009h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
