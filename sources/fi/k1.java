package fi;

import android.content.Context;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.sz;
import org.telegram.ui.f61;
import org.telegram.ui.t41;
public final class k1 extends mi.n {
    public final int f11077q;
    public final Object f11078r;

    public k1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f11077q = i10;
        this.f11078r = obj;
    }

    @Override
    public void e() {
        switch (this.f11077q) {
            case 0:
                ((n1) this.f11078r).f11283j3 = true;
                return;
            case 1:
                ((sz) this.f11078r).f32722f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((f61) this.f11078r).f39238x1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f11077q) {
            case 0:
                ((n1) this.f11078r).f11283j3 = false;
                return;
            case 1:
                ((sz) this.f11078r).f32722f0 = false;
                return;
            case 2:
                ((qx) this.f11078r).Q.f32722f0 = false;
                return;
            case 3:
                ((t41) this.f11078r).R.f39238x1 = false;
                return;
            case 4:
                ((f61) this.f11078r).f39238x1 = false;
                return;
            default:
                ((t41) this.f11078r).R.f39238x1 = false;
                return;
        }
    }
}
