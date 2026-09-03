package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f13306a;
    public final SearchView f13307b;

    public q2(SearchView searchView, int i10) {
        this.f13306a = i10;
        this.f13307b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f13306a) {
            case 0:
                this.f13307b.r();
                return;
            default:
                h1.b bVar = this.f13307b.f463e0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
