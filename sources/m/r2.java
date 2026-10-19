package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16315a;
    public final SearchView f16316b;

    public r2(SearchView searchView, int i10) {
        this.f16315a = i10;
        this.f16316b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16315a) {
            case 0:
                this.f16316b.r();
                return;
            default:
                h1.b bVar = this.f16316b.f2773h0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
