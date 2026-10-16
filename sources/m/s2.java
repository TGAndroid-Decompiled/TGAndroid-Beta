package m;

import androidx.appcompat.widget.SearchView;
public final class s2 implements Runnable {
    public final int f14962a;
    public final SearchView f14963b;

    public s2(SearchView searchView, int i10) {
        this.f14962a = i10;
        this.f14963b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f14962a) {
            case 0:
                this.f14963b.r();
                return;
            default:
                h1.b bVar = this.f14963b.f1156h0;
                if (bVar instanceof c3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
