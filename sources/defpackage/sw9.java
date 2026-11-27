package defpackage;

import androidx.appcompat.widget.SearchView;
public final class sw9 implements Runnable {
    public final byte a;
    public final SearchView b;

    public sw9(SearchView searchView, byte b) {
        this.a = b;
        this.b = searchView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SearchView searchView = this.b;
        switch (b) {
            case 0:
                searchView.r();
                return;
            default:
                v43 v43Var = searchView.i0;
                if (v43Var instanceof gfb) {
                    v43Var.b(null);
                    return;
                }
                return;
        }
    }
}
