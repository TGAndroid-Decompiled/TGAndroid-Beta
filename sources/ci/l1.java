package ci;

import android.view.ViewGroup;
import org.telegram.ui.c71;
public final class l1 extends w7.z5 {
    public final int f5084a;
    public final ViewGroup f5085b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f5084a = i10;
        this.f5085b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5084a) {
            case 0:
                ((p1) this.f5085b).f5276b3 = false;
                return;
            default:
                ((c71) this.f5085b).f32618w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f5084a) {
            case 0:
                ((p1) this.f5085b).f5276b3 = true;
                return;
            default:
                ((c71) this.f5085b).f32618w1 = true;
                return;
        }
    }
}
