package ci;

import android.view.ViewGroup;
import org.telegram.ui.a71;
public final class l1 extends w7.z5 {
    public final int f4952a;
    public final ViewGroup f4953b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4952a = i10;
        this.f4953b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4952a) {
            case 0:
                ((p1) this.f4953b).f5287i3 = false;
                return;
            default:
                ((a71) this.f4953b).f32134w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4952a) {
            case 0:
                ((p1) this.f4953b).f5287i3 = true;
                return;
            default:
                ((a71) this.f4953b).f32134w1 = true;
                return;
        }
    }
}
