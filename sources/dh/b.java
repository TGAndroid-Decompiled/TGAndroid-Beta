package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public class b implements a {
    public final e6 f7727a;
    public final int f7728b;
    public final float f7729c;
    public int d;
    public int e;
    public int f7730f;
    public int h;

    public b(int i10, e6 e6Var) {
        this(e6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int H() {
        return this.d;
    }

    @Override
    public int a() {
        return this.f7730f;
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(i6.v0(this.f7728b, this.f7727a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = i6.l1(this.f7729c, i6.v0(this.f7728b, this.f7727a));
        if (b()) {
            this.f7730f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f7730f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int m() {
        return this.e;
    }

    public b(e6 e6Var, int i10, float f7) {
        this.f7727a = e6Var;
        this.f7728b = i10;
        this.f7729c = f7;
        d();
    }
}
