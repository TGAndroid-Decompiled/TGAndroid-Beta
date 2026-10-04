package ci;

import android.content.Context;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.nz;
import org.telegram.ui.c71;
import org.telegram.ui.q51;
public final class m1 extends ji.o {
    public final int f5555q;
    public final Object f5556r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5555q = i10;
        this.f5556r = obj;
    }

    @Override
    public void e() {
        switch (this.f5555q) {
            case 0:
                ((p1) this.f5556r).f5683i3 = true;
                return;
            case 1:
                ((nz) this.f5556r).f29102f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((c71) this.f5556r).f35348w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5555q) {
            case 0:
                ((p1) this.f5556r).f5683i3 = false;
                return;
            case 1:
                ((nz) this.f5556r).f29102f0 = false;
                return;
            case 2:
                ((nx) this.f5556r).Q.f29102f0 = false;
                return;
            case 3:
                ((q51) this.f5556r).R.f35348w1 = false;
                return;
            case 4:
                ((c71) this.f5556r).f35348w1 = false;
                return;
            default:
                ((q51) this.f5556r).R.f35348w1 = false;
                return;
        }
    }
}
