package m;

import androidx.appcompat.widget.SearchView;

public final class r2 implements Runnable {

    public final int f17441a;

    public final SearchView f17442b;

    public r2(SearchView searchView, int i10) {
        this.f17441a = i10;
        this.f17442b = searchView;
    }

    @Override
    public final void run() {
        switch (this.f17441a) {
            case 0:
                this.f17442b.r();
                break;
            default:
                h1.b bVar = this.f17442b.f1001d0;
                if (bVar instanceof c3) {
                    bVar.b(null);
                }
                break;
        }
    }
}
