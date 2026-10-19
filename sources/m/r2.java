package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16313a;
    public final SearchView f16314b;

    public r2(SearchView searchView, int i10) {
        this.f16313a = i10;
        this.f16314b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16313a) {
            case 0:
                this.f16314b.r();
                return;
            default:
                h1.b bVar = this.f16314b.f2771h0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
