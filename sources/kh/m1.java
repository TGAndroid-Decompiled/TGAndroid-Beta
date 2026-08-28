package kh;

import android.view.ViewGroup;
import org.telegram.ui.b61;
public final class m1 extends g7.f6 {
    public final int f15662a;
    public final ViewGroup f15663b;

    public m1(ViewGroup viewGroup, int i9) {
        this.f15662a = i9;
        this.f15663b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f15662a) {
            case 0:
                ((q1) this.f15663b).X2 = false;
                return;
            default:
                ((b61) this.f15663b).f36703s1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f15662a) {
            case 0:
                ((q1) this.f15663b).X2 = true;
                return;
            default:
                ((b61) this.f15663b).f36703s1 = true;
                return;
        }
    }
}
