package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f13601a;
    public final SearchView f13602b;

    public r2(SearchView searchView, int i10) {
        this.f13601a = i10;
        this.f13602b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f13601a) {
            case 0:
                this.f13602b.r();
                return;
            default:
                h1.b bVar = this.f13602b.f433e0;
                if (bVar instanceof c3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
