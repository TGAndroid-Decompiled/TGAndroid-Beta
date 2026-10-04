package ci;

import android.content.Context;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.nz;
import org.telegram.ui.c71;
import org.telegram.ui.q51;
public final class m1 extends ji.o {
    public final int f5556q;
    public final Object f5557r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5556q = i10;
        this.f5557r = obj;
    }

    @Override
    public void e() {
        switch (this.f5556q) {
            case 0:
                ((p1) this.f5557r).f5684i3 = true;
                return;
            case 1:
                ((nz) this.f5557r).f29107f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((c71) this.f5557r).f35353w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5556q) {
            case 0:
                ((p1) this.f5557r).f5684i3 = false;
                return;
            case 1:
                ((nz) this.f5557r).f29107f0 = false;
                return;
            case 2:
                ((nx) this.f5557r).Q.f29107f0 = false;
                return;
            case 3:
                ((q51) this.f5557r).R.f35353w1 = false;
                return;
            case 4:
                ((c71) this.f5557r).f35353w1 = false;
                return;
            default:
                ((q51) this.f5557r).R.f35353w1 = false;
                return;
        }
    }
}
