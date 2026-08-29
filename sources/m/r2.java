package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16665a;
    public final SearchView f16666b;

    public r2(SearchView searchView, int i10) {
        this.f16665a = i10;
        this.f16666b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16665a) {
            case 0:
                this.f16666b.r();
                return;
            default:
                h1.b bVar = this.f16666b.f987d0;
                if (bVar instanceof c3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
