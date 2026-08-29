package nh;

import android.view.ViewGroup;
import org.telegram.ui.d61;
public final class j1 extends i7.g6 {
    public final int f17927a;
    public final ViewGroup f17928b;

    public j1(ViewGroup viewGroup, int i10) {
        this.f17927a = i10;
        this.f17928b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f17927a) {
            case 0:
                ((n1) this.f17928b).X2 = false;
                return;
            default:
                ((d61) this.f17928b).f37360s1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f17927a) {
            case 0:
                ((n1) this.f17928b).X2 = true;
                return;
            default:
                ((d61) this.f17928b).f37360s1 = true;
                return;
        }
    }
}
