package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f13617a;
    public final SearchView f13618b;

    public r2(SearchView searchView, int i10) {
        this.f13617a = i10;
        this.f13618b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f13617a) {
            case 0:
                this.f13618b.r();
                return;
            default:
                h1.b bVar = this.f13618b.f418e0;
                if (bVar instanceof c3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
