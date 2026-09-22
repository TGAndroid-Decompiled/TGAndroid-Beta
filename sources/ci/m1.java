package ci;

import android.content.Context;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.h71;
import org.telegram.ui.v51;
public final class m1 extends ji.o {
    public final int f5029q;
    public final Object f5030r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5029q = i10;
        this.f5030r = obj;
    }

    @Override
    public void e() {
        switch (this.f5029q) {
            case 0:
                ((p1) this.f5030r).f5292b3 = true;
                return;
            case 1:
                ((kz) this.f5030r).f25709f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((h71) this.f5030r).f34165w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5029q) {
            case 0:
                ((p1) this.f5030r).f5292b3 = false;
                return;
            case 1:
                ((kz) this.f5030r).f25709f0 = false;
                return;
            case 2:
                ((jx) this.f5030r).Q.f25709f0 = false;
                return;
            case 3:
                ((v51) this.f5030r).R.f34165w1 = false;
                return;
            case 4:
                ((h71) this.f5030r).f34165w1 = false;
                return;
            default:
                ((v51) this.f5030r).R.f34165w1 = false;
                return;
        }
    }
}
