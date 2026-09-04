package di;

import android.content.Context;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx;
import org.telegram.ui.j71;
import org.telegram.ui.x51;
public final class m1 extends ki.p {
    public final int f7631q;
    public final Object f7632r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f7631q = i10;
        this.f7632r = obj;
    }

    @Override
    public void e() {
        switch (this.f7631q) {
            case 0:
                ((p1) this.f7632r).f7814b3 = true;
                return;
            case 1:
                ((kz) this.f7632r).f27942f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((j71) this.f7632r).f37679w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f7631q) {
            case 0:
                ((p1) this.f7632r).f7814b3 = false;
                return;
            case 1:
                ((kz) this.f7632r).f27942f0 = false;
                return;
            case 2:
                ((lx) this.f7632r).Q.f27942f0 = false;
                return;
            case 3:
                ((x51) this.f7632r).R.f37679w1 = false;
                return;
            case 4:
                ((j71) this.f7632r).f37679w1 = false;
                return;
            default:
                ((x51) this.f7632r).R.f37679w1 = false;
                return;
        }
    }
}
