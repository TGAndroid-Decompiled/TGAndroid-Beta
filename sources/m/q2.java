package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15217a;
    public final SearchView f15218b;

    public q2(SearchView searchView, int i10) {
        this.f15217a = i10;
        this.f15218b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15217a) {
            case 0:
                this.f15218b.r();
                return;
            default:
                h1.b bVar = this.f15218b.f1152h0;
                if (bVar instanceof a3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
