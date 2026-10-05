package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15868a;
    public final SearchView f15869b;

    public q2(SearchView searchView, int i10) {
        this.f15868a = i10;
        this.f15869b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15868a) {
            case 0:
                this.f15869b.r();
                return;
            default:
                h1.b bVar = this.f15869b.f2177h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
