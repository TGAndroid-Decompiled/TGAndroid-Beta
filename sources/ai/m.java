package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.c61;
public final class m extends gb1 {
    public final int f1571c;
    public final ViewGroup d;

    public m(ViewGroup viewGroup, int i10) {
        this.f1571c = i10;
        this.d = viewGroup;
    }

    @Override
    public final void N() {
        switch (this.f1571c) {
            case 0:
                ((x0) this.d).v = false;
                return;
            case 1:
                ((fi.n1) this.d).f11284j3 = false;
                return;
            default:
                ((c61) this.d).f38332x1 = false;
                return;
        }
    }

    @Override
    public void O() {
        switch (this.f1571c) {
            case 1:
                ((fi.n1) this.d).f11284j3 = true;
                return;
            case 2:
                ((c61) this.d).f38332x1 = true;
                return;
            default:
                return;
        }
    }
}
