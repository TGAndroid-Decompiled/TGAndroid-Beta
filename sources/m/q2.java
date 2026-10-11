package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15854a;
    public final SearchView f15855b;

    public q2(SearchView searchView, int i10) {
        this.f15854a = i10;
        this.f15855b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15854a) {
            case 0:
                this.f15855b.r();
                return;
            default:
                h1.b bVar = this.f15855b.f2256h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
