package ci;

import android.content.Context;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.mz;
import org.telegram.ui.a71;
import org.telegram.ui.o51;
public final class m1 extends ji.o {
    public final int f5158q;
    public final Object f5159r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5158q = i10;
        this.f5159r = obj;
    }

    @Override
    public void e() {
        switch (this.f5158q) {
            case 0:
                ((p1) this.f5159r).f5277b3 = true;
                return;
            case 1:
                ((mz) this.f5159r).f26557f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((a71) this.f5159r).f32059w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5158q) {
            case 0:
                ((p1) this.f5159r).f5277b3 = false;
                return;
            case 1:
                ((mz) this.f5159r).f26557f0 = false;
                return;
            case 2:
                ((mx) this.f5159r).Q.f26557f0 = false;
                return;
            case 3:
                ((o51) this.f5159r).R.f32059w1 = false;
                return;
            case 4:
                ((a71) this.f5159r).f32059w1 = false;
                return;
            default:
                ((o51) this.f5159r).R.f32059w1 = false;
                return;
        }
    }
}
