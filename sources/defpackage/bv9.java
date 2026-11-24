package defpackage;

import androidx.appcompat.widget.SearchView;
public final class bv9 implements Runnable {
    public final byte a;
    public final SearchView b;

    public bv9(SearchView searchView, byte b) {
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
                o53 o53Var = searchView.i0;
                if (o53Var instanceof mdb) {
                    o53Var.b(null);
                    return;
                }
                return;
        }
    }
}
