package nh;

import android.content.Context;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.fz;
import org.telegram.ui.d61;
import org.telegram.ui.r41;
public final class k1 extends uh.n {
    public final int f17988q;
    public final Object f17989r;

    public k1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f17988q = i10;
        this.f17989r = obj;
    }

    @Override
    public void e() {
        switch (this.f17988q) {
            case 0:
                ((n1) this.f17989r).X2 = true;
                return;
            case 1:
                ((fz) this.f17989r).f28578b0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((d61) this.f17989r).f37360s1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f17988q) {
            case 0:
                ((n1) this.f17989r).X2 = false;
                return;
            case 1:
                ((fz) this.f17989r).f28578b0 = false;
                return;
            case 2:
                ((ex) this.f17989r).Q.f28578b0 = false;
                return;
            case 3:
                ((r41) this.f17989r).R.f37360s1 = false;
                return;
            case 4:
                ((d61) this.f17989r).f37360s1 = false;
                return;
            default:
                ((r41) this.f17989r).R.f37360s1 = false;
                return;
        }
    }
}
