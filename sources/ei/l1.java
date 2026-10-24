package ei;

import android.content.Context;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.rz;
import org.telegram.ui.a61;
import org.telegram.ui.o41;
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
                ((rz) this.f9370r).f30319f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((a61) this.f9370r).f35658x1 = true;
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
                ((rz) this.f9370r).f30319f0 = false;
                return;
            case 2:
                ((px) this.f9370r).Q.f30319f0 = false;
                return;
            case 3:
                ((o41) this.f9370r).R.f35658x1 = false;
                return;
            case 4:
                ((a61) this.f9370r).f35658x1 = false;
                return;
            default:
                ((o41) this.f9370r).R.f35658x1 = false;
                return;
        }
    }
}
