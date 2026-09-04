package di;

import android.view.ViewGroup;
import org.telegram.ui.j71;
public final class l1 extends w7.y5 {
    public final int f7508a;
    public final ViewGroup f7509b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f7508a = i10;
        this.f7509b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f7508a) {
            case 0:
                ((p1) this.f7509b).f7814b3 = false;
                return;
            default:
                ((j71) this.f7509b).f37679w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f7508a) {
            case 0:
                ((p1) this.f7509b).f7814b3 = true;
                return;
            default:
                ((j71) this.f7509b).f37679w1 = true;
                return;
        }
    }
}
