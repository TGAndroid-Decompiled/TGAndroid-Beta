package bi;

import android.content.Context;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rz;
import org.telegram.ui.l71;
import org.telegram.ui.z51;
public final class t1 extends ii.o {
    public final int f3668q;
    public final Object f3669r;

    public t1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f3668q = i10;
        this.f3669r = obj;
    }

    @Override
    public void e() {
        switch (this.f3668q) {
            case 0:
                ((w1) this.f3669r).f3817b3 = true;
                return;
            case 1:
                ((rz) this.f3669r).f26814f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((l71) this.f3669r).f34603w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f3668q) {
            case 0:
                ((w1) this.f3669r).f3817b3 = false;
                return;
            case 1:
                ((rz) this.f3669r).f26814f0 = false;
                return;
            case 2:
                ((qx) this.f3669r).Q.f26814f0 = false;
                return;
            case 3:
                ((z51) this.f3669r).R.f34603w1 = false;
                return;
            case 4:
                ((l71) this.f3669r).f34603w1 = false;
                return;
            default:
                ((z51) this.f3669r).R.f34603w1 = false;
                return;
        }
    }
}
