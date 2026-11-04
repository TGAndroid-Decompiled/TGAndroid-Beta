package bi;

import android.view.ViewGroup;
import b8.of;
import gi.m1;
import org.telegram.ui.g11;
public final class h extends of {
    public final int f3744a;
    public final ViewGroup f3745b;

    public h(ViewGroup viewGroup, int i3) {
        this.f3744a = i3;
        this.f3745b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f3744a) {
            case 0:
                ((h0) this.f3745b).f3846w = false;
                return;
            case 1:
                ((m1) this.f3745b).f13185j3 = false;
                return;
            default:
                ((g11) this.f3745b).f45492y1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f3744a) {
            case 1:
                ((m1) this.f3745b).f13185j3 = true;
                return;
            case 2:
                ((g11) this.f3745b).f45492y1 = true;
                return;
            default:
                return;
        }
    }
}
