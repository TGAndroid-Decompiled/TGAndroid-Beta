package m;

import androidx.appcompat.widget.SearchView;
public final class r2 implements Runnable {
    public final int f19238a;
    public final SearchView f19239b;

    public r2(SearchView searchView, int i7) {
        this.f19238a = i7;
        this.f19239b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f19238a) {
            case 0:
                this.f19239b.r();
                return;
            default:
                i1.a aVar = this.f19239b.f1956h0;
                if (aVar instanceof z2) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
