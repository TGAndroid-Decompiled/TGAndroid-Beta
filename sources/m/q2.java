package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15670a;
    public final SearchView f15671b;

    public q2(SearchView searchView, int i10) {
        this.f15670a = i10;
        this.f15671b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15670a) {
            case 0:
                this.f15671b.r();
                return;
            default:
                h1.b bVar = this.f15671b.f1005h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
