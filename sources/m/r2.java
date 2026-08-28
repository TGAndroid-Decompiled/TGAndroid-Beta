package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f17066a;
    public final SearchView f17067b;

    public r2(SearchView searchView, int i9) {
        this.f17066a = i9;
        this.f17067b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f17066a) {
            case 0:
                this.f17067b.r();
                return;
            default:
                h1.b bVar = this.f17067b.f495d0;
                if (bVar instanceof c3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
