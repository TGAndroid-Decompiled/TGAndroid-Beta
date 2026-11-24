package defpackage;

import androidx.appcompat.widget.SearchView;
public final class zs9 implements Runnable {
    public final byte a;
    public final SearchView b;

    public zs9(SearchView searchView, byte b) {
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
                d43 d43Var = searchView.i0;
                if (d43Var instanceof kbb) {
                    d43Var.b(null);
                    return;
                }
                return;
        }
    }
}
