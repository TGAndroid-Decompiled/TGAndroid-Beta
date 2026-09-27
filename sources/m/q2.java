package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14558a;
    public final SearchView f14559b;

    public q2(SearchView searchView, int i10) {
        this.f14558a = i10;
        this.f14559b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14558a) {
            case 0:
                this.f14559b.r();
                return;
            default:
                h1.b bVar = this.f14559b.f2003h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
