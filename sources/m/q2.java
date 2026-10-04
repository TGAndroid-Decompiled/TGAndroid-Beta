package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f15858a;
    public final SearchView f15859b;

    public q2(SearchView searchView, int i10) {
        this.f15858a = i10;
        this.f15859b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f15858a) {
            case 0:
                this.f15859b.r();
                return;
            default:
                h1.b bVar = this.f15859b.f2177h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
