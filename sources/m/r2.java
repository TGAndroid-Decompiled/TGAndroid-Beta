package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f16314a;
    public final SearchView f16315b;

    public r2(SearchView searchView, int i10) {
        this.f16314a = i10;
        this.f16315b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f16314a) {
            case 0:
                this.f16315b.r();
                return;
            default:
                h1.b bVar = this.f16315b.f2775h0;
                if (bVar instanceof b3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
