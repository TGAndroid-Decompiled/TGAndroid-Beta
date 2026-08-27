package dg;

import android.view.View;
import gg.o;

public final class f implements d5.d {

    public final boolean f4947a;

    public f(boolean z10) {
        this.f4947a = z10;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        if (view instanceof o) {
            ((o) view).g(this.f4947a, true);
        }
    }
}
