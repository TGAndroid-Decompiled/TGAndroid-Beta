package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f12526a;
    public final SearchView f12527b;

    public q2(SearchView searchView, int i10) {
        this.f12526a = i10;
        this.f12527b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f12526a) {
            case 0:
                this.f12527b.r();
                return;
            default:
                h1.b bVar = this.f12527b.f1056h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
