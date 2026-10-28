package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f17822a;
    public final SearchView f17823b;

    public q2(SearchView searchView, int i10) {
        this.f17822a = i10;
        this.f17823b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f17822a) {
            case 0:
                this.f17823b.r();
                return;
            default:
                h1.a aVar = this.f17823b.f2224h0;
                if (aVar instanceof a3) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
