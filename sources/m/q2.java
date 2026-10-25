package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f17823a;
    public final SearchView f17824b;

    public q2(SearchView searchView, int i10) {
        this.f17823a = i10;
        this.f17824b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f17823a) {
            case 0:
                this.f17824b.r();
                return;
            default:
                h1.a aVar = this.f17824b.f2224h0;
                if (aVar instanceof a3) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
