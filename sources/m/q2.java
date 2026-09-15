package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14286a;
    public final SearchView f14287b;

    public q2(SearchView searchView, int i10) {
        this.f14286a = i10;
        this.f14287b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14286a) {
            case 0:
                this.f14287b.r();
                return;
            default:
                h1.b bVar = this.f14287b.f2004h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
