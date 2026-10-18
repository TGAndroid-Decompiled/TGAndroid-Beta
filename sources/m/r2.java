package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16312a;
    public final SearchView f16313b;

    public r2(SearchView searchView, int i10) {
        this.f16312a = i10;
        this.f16313b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16312a) {
            case 0:
                this.f16313b.r();
                return;
            default:
                h1.b bVar = this.f16313b.f2775h0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
