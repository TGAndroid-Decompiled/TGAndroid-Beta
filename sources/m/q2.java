package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f13116a;
    public final SearchView f13117b;

    public q2(SearchView searchView, int i10) {
        this.f13116a = i10;
        this.f13117b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f13116a) {
            case 0:
                this.f13117b.r();
                return;
            default:
                h1.b bVar = this.f13117b.f694h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
