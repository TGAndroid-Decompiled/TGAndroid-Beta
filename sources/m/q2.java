package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15859a;
    public final SearchView f15860b;

    public q2(SearchView searchView, int i10) {
        this.f15859a = i10;
        this.f15860b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15859a) {
            case 0:
                this.f15860b.r();
                return;
            default:
                h1.b bVar = this.f15860b.f2177h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
