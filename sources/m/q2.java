package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f13304a;
    public final SearchView f13305b;

    public q2(SearchView searchView, int i10) {
        this.f13304a = i10;
        this.f13305b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f13304a) {
            case 0:
                this.f13305b.r();
                return;
            default:
                h1.b bVar = this.f13305b.f463e0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
