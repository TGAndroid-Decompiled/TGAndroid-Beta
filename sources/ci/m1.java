package ci;

import android.content.Context;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.nz;
import org.telegram.ui.a71;
import org.telegram.ui.o51;
public final class m1 extends ji.o {
    public final int f5165q;
    public final Object f5166r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5165q = i10;
        this.f5166r = obj;
    }

    @Override
    public void e() {
        switch (this.f5165q) {
            case 0:
                ((p1) this.f5166r).f5287i3 = true;
                return;
            case 1:
                ((nz) this.f5166r).f26827f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((a71) this.f5166r).f32134w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5165q) {
            case 0:
                ((p1) this.f5166r).f5287i3 = false;
                return;
            case 1:
                ((nz) this.f5166r).f26827f0 = false;
                return;
            case 2:
                ((nx) this.f5166r).Q.f26827f0 = false;
                return;
            case 3:
                ((o51) this.f5166r).R.f32134w1 = false;
                return;
            case 4:
                ((a71) this.f5166r).f32134w1 = false;
                return;
            default:
                ((o51) this.f5166r).R.f32134w1 = false;
                return;
        }
    }
}
