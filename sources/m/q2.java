package m;

import androidx.appcompat.widget.SearchView;
public final class q2 implements Runnable {
    public final int f18707a;
    public final SearchView f18708b;

    public q2(SearchView searchView, int i3) {
        this.f18707a = i3;
        this.f18708b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f18707a) {
            case 0:
                this.f18708b.r();
                return;
            default:
                h1.a aVar = this.f18708b.f1379i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
