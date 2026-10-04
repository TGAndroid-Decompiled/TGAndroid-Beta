package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15863a;
    public final SearchView f15864b;

    public q2(SearchView searchView, int i10) {
        this.f15863a = i10;
        this.f15864b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15863a) {
            case 0:
                this.f15864b.r();
                return;
            default:
                h1.b bVar = this.f15864b.f2177h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
