package di;

import android.view.ViewGroup;
import org.telegram.ui.j71;
public final class l1 extends w7.y5 {
    public final int f7536a;
    public final ViewGroup f7537b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f7536a = i10;
        this.f7537b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f7536a) {
            case 0:
                ((p1) this.f7537b).f7842b3 = false;
                return;
            default:
                ((j71) this.f7537b).f37706w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f7536a) {
            case 0:
                ((p1) this.f7537b).f7842b3 = true;
                return;
            default:
                ((j71) this.f7537b).f37706w1 = true;
                return;
        }
    }
}
