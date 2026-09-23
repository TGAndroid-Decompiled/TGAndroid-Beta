package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14278a;
    public final SearchView f14279b;

    public q2(SearchView searchView, int i10) {
        this.f14278a = i10;
        this.f14279b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14278a) {
            case 0:
                this.f14279b.r();
                return;
            default:
                h1.b bVar = this.f14279b.f2001h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
