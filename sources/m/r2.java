package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f19235a;
    public final SearchView f19236b;

    public r2(SearchView searchView, int i7) {
        this.f19235a = i7;
        this.f19236b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f19235a) {
            case 0:
                this.f19236b.r();
                return;
            default:
                i1.a aVar = this.f19236b.f1956h0;
                if (aVar instanceof z2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
