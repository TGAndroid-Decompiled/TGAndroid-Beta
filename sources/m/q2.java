package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15643a;
    public final SearchView f15644b;

    public q2(SearchView searchView, int i10) {
        this.f15643a = i10;
        this.f15644b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15643a) {
            case 0:
                this.f15644b.r();
                return;
            default:
                h1.b bVar = this.f15644b.f993h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
