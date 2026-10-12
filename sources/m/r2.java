package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f15552a;
    public final SearchView f15553b;

    public r2(SearchView searchView, int i10) {
        this.f15552a = i10;
        this.f15553b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15552a) {
            case 0:
                this.f15553b.r();
                return;
            default:
                h1.b bVar = this.f15553b.f2254h0;
                if (bVar instanceof a3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
