package hi;

import android.content.Context;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.uw;
import org.telegram.ui.g01;
import org.telegram.ui.r11;
public final class k1 extends pi.l {
    public final int f14805q;
    public final Object f14806r;

    public k1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f14805q = i7;
        this.f14806r = obj;
    }

    @Override
    public void e() {
        switch (this.f14805q) {
            case 0:
                ((n1) this.f14806r).j3 = true;
                return;
            case 1:
                ((ty) this.f14806r).f40083g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((r11) this.f14806r).f51458y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f14805q) {
            case 0:
                ((n1) this.f14806r).j3 = false;
                return;
            case 1:
                ((ty) this.f14806r).f40083g0 = false;
                return;
            case 2:
                ((uw) this.f14806r).Q.f40083g0 = false;
                return;
            case 3:
                ((g01) this.f14806r).R.f51458y1 = false;
                return;
            case 4:
                ((r11) this.f14806r).f51458y1 = false;
                return;
            default:
                ((g01) this.f14806r).R.f51458y1 = false;
                return;
        }
    }
}
