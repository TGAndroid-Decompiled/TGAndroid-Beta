package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14547a;
    public final SearchView f14548b;

    public q2(SearchView searchView, int i10) {
        this.f14547a = i10;
        this.f14548b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14547a) {
            case 0:
                this.f14548b.r();
                return;
            default:
                h1.b bVar = this.f14548b.f2008h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
