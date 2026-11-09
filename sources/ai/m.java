package ai;

import android.view.ViewGroup;
import c8.ja;
import org.telegram.ui.s11;
public final class m extends ja {
    public final int f1576a;
    public final ViewGroup f1577b;

    public m(ViewGroup viewGroup, int i7) {
        this.f1576a = i7;
        this.f1577b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f1576a) {
            case 0:
                ((q0) this.f1577b).f1679w = false;
                return;
            case 1:
                ((fi.m1) this.f1577b).f12408i3 = false;
                return;
            default:
                ((s11) this.f1577b).f49715x1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f1576a) {
            case 1:
                ((fi.m1) this.f1577b).f12408i3 = true;
                return;
            case 2:
                ((s11) this.f1577b).f49715x1 = true;
                return;
            default:
                return;
        }
    }
}
