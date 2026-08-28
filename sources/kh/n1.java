package kh;

import android.content.Context;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xw;
import org.telegram.ui.b61;
import org.telegram.ui.p41;
public final class n1 extends rh.n {
    public final int f15731q;
    public final Object f15732r;

    public n1(Object obj, Context context, int i9) {
        super(context, 2);
        this.f15731q = i9;
        this.f15732r = obj;
    }

    @Override
    public void e() {
        switch (this.f15731q) {
            case 0:
                ((q1) this.f15732r).X2 = true;
                return;
            case 1:
                ((wy) this.f15732r).f34387b0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((b61) this.f15732r).f36703s1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f15731q) {
            case 0:
                ((q1) this.f15732r).X2 = false;
                return;
            case 1:
                ((wy) this.f15732r).f34387b0 = false;
                return;
            case 2:
                ((xw) this.f15732r).Q.f34387b0 = false;
                return;
            case 3:
                ((p41) this.f15732r).R.f36703s1 = false;
                return;
            case 4:
                ((b61) this.f15732r).f36703s1 = false;
                return;
            default:
                ((p41) this.f15732r).R.f36703s1 = false;
                return;
        }
    }
}
