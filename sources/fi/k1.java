package fi;

import android.content.Context;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.sz;
import org.telegram.ui.c61;
import org.telegram.ui.q41;
public final class k1 extends mi.n {
    public final int f11078q;
    public final Object f11079r;

    public k1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f11078q = i10;
        this.f11079r = obj;
    }

    @Override
    public void e() {
        switch (this.f11078q) {
            case 0:
                ((n1) this.f11079r).f11284j3 = true;
                return;
            case 1:
                ((sz) this.f11079r).f32728f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((c61) this.f11079r).f38335x1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f11078q) {
            case 0:
                ((n1) this.f11079r).f11284j3 = false;
                return;
            case 1:
                ((sz) this.f11079r).f32728f0 = false;
                return;
            case 2:
                ((qx) this.f11079r).Q.f32728f0 = false;
                return;
            case 3:
                ((q41) this.f11079r).R.f38335x1 = false;
                return;
            case 4:
                ((c61) this.f11079r).f38335x1 = false;
                return;
            default:
                ((q41) this.f11079r).R.f38335x1 = false;
                return;
        }
    }
}
