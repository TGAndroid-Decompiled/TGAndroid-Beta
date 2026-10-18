package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.n41;
import org.telegram.ui.z51;
public final class l1 extends li.n {
    public final int f9361q;
    public final Object f9362r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f9361q = i10;
        this.f9362r = obj;
    }

    @Override
    public void e() {
        switch (this.f9361q) {
            case 0:
                ((o1) this.f9362r).Z2 = true;
                return;
            case 1:
                ((tz) this.f9362r).f30763f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((z51) this.f9362r).f43655w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f9361q) {
            case 0:
                ((o1) this.f9362r).Z2 = false;
                return;
            case 1:
                ((tz) this.f9362r).f30763f0 = false;
                return;
            case 2:
                ((rx) this.f9362r).Q.f30763f0 = false;
                return;
            case 3:
                ((n41) this.f9362r).R.f43655w1 = false;
                return;
            case 4:
                ((z51) this.f9362r).f43655w1 = false;
                return;
            default:
                ((n41) this.f9362r).R.f43655w1 = false;
                return;
        }
    }
}
