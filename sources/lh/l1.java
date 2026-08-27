package lh;

import android.content.Context;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.yy;
import org.telegram.ui.a61;
import org.telegram.ui.o41;

public final class l1 extends sh.n {

    public final int f16283q;

    public final Object f16284r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f16283q = i10;
        this.f16284r = obj;
    }

    @Override
    public void e() {
        switch (this.f16283q) {
            case 0:
                ((o1) this.f16284r).X2 = true;
                break;
            case 1:
                ((yy) this.f16284r).f34980b0 = true;
                break;
            case 4:
                ((a61) this.f16284r).f36426s1 = true;
                break;
        }
    }

    @Override
    public final void i() {
        switch (this.f16283q) {
            case 0:
                ((o1) this.f16284r).X2 = false;
                break;
            case 1:
                ((yy) this.f16284r).f34980b0 = false;
                break;
            case 2:
                ((xw) this.f16284r).Q.f34980b0 = false;
                break;
            case 3:
                ((o41) this.f16284r).R.f36426s1 = false;
                break;
            case 4:
                ((a61) this.f16284r).f36426s1 = false;
                break;
            default:
                ((o41) this.f16284r).R.f36426s1 = false;
                break;
        }
    }
}
