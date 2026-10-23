package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16376a;
    public final SearchView f16377b;

    public r2(SearchView searchView, int i10) {
        this.f16376a = i10;
        this.f16377b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16376a) {
            case 0:
                this.f16377b.r();
                return;
            default:
                h1.b bVar = this.f16377b.f2778h0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
