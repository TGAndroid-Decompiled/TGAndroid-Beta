package hi;

import android.content.Context;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rw;
import org.telegram.ui.f01;
import org.telegram.ui.q11;
public final class t1 extends pi.l {
    public final int f15430q;
    public final Object f15431r;

    public t1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f15430q = i7;
        this.f15431r = obj;
    }

    @Override
    public void e() {
        switch (this.f15430q) {
            case 0:
                ((w1) this.f15431r).j3 = true;
                return;
            case 1:
                ((qy) this.f15431r).f39056g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((q11) this.f15431r).f51283y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f15430q) {
            case 0:
                ((w1) this.f15431r).j3 = false;
                return;
            case 1:
                ((qy) this.f15431r).f39056g0 = false;
                return;
            case 2:
                ((rw) this.f15431r).Q.f39056g0 = false;
                return;
            case 3:
                ((f01) this.f15431r).R.f51283y1 = false;
                return;
            case 4:
                ((q11) this.f15431r).f51283y1 = false;
                return;
            default:
                ((f01) this.f15431r).R.f51283y1 = false;
                return;
        }
    }
}
