package lh;

import android.view.ViewGroup;
import org.telegram.ui.a61;

public final class k1 extends h7.a6 {

    public final int f16214a;

    public final ViewGroup f16215b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f16214a = i10;
        this.f16215b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f16214a) {
            case 0:
                ((o1) this.f16215b).X2 = false;
                break;
            default:
                ((a61) this.f16215b).f36426s1 = false;
                break;
        }
    }

    @Override
    public final void b() {
        switch (this.f16214a) {
            case 0:
                ((o1) this.f16215b).X2 = true;
                break;
            default:
                ((a61) this.f16215b).f36426s1 = true;
                break;
        }
    }
}
