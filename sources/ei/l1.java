package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.b61;
import org.telegram.ui.p41;
public final class l1 extends li.n {
    public final int f9369q;
    public final Object f9370r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f9369q = i10;
        this.f9370r = obj;
    }

    @Override
    public void e() {
        switch (this.f9369q) {
            case 0:
                ((o1) this.f9370r).f9552c3 = true;
                return;
            case 1:
                ((tz) this.f9370r).f30975f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((b61) this.f9370r).f35941x1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f9369q) {
            case 0:
                ((o1) this.f9370r).f9552c3 = false;
                return;
            case 1:
                ((tz) this.f9370r).f30975f0 = false;
                return;
            case 2:
                ((rx) this.f9370r).Q.f30975f0 = false;
                return;
            case 3:
                ((p41) this.f9370r).R.f35941x1 = false;
                return;
            case 4:
                ((b61) this.f9370r).f35941x1 = false;
                return;
            default:
                ((p41) this.f9370r).R.f35941x1 = false;
                return;
        }
    }
}
