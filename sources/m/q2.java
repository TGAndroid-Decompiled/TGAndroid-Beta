package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f20214a;
    public final SearchView f20215b;

    public q2(SearchView searchView, int i7) {
        this.f20214a = i7;
        this.f20215b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f20214a) {
            case 0:
                this.f20215b.r();
                return;
            default:
                i1.a aVar = this.f20215b.f1918i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
