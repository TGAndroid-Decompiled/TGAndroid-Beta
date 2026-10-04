package ci;

import android.view.ViewGroup;
import org.telegram.ui.c71;
public final class l1 extends w7.a6 {
    public final int f5477a;
    public final ViewGroup f5478b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f5477a = i10;
        this.f5478b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5477a) {
            case 0:
                ((p1) this.f5478b).f5683i3 = false;
                return;
            default:
                ((c71) this.f5478b).f35348w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f5477a) {
            case 0:
                ((p1) this.f5478b).f5683i3 = true;
                return;
            default:
                ((c71) this.f5478b).f35348w1 = true;
                return;
        }
    }
}
