package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16307a;
    public final SearchView f16308b;

    public r2(SearchView searchView, int i10) {
        this.f16307a = i10;
        this.f16308b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16307a) {
            case 0:
                this.f16308b.r();
                return;
            default:
                h1.b bVar = this.f16308b.f2774h0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
