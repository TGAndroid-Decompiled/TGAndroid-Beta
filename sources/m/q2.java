package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f14516a;
    public final SearchView f14517b;

    public q2(SearchView searchView, int i10) {
        this.f14516a = i10;
        this.f14517b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14516a) {
            case 0:
                this.f14517b.r();
                return;
            default:
                h1.b bVar = this.f14517b.f2001h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
