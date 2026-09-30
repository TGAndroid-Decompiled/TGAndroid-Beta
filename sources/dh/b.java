package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class b implements a {
    public final d6 f7714a;
    public final int f7715b;
    public final float f7716c;
    public int d;
    public int e;
    public int f7717f;
    public int h;

    public b(int i10, d6 d6Var) {
        this(d6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int H() {
        return this.d;
    }

    @Override
    public int a() {
        return this.f7717f;
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(h6.v0(this.f7715b, this.f7714a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = h6.l1(this.f7716c, h6.v0(this.f7715b, this.f7714a));
        if (b()) {
            this.f7717f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f7717f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int m() {
        return this.e;
    }

    public b(d6 d6Var, int i10, float f7) {
        this.f7714a = d6Var;
        this.f7715b = i10;
        this.f7716c = f7;
        d();
    }
}
