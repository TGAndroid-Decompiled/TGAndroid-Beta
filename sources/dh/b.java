package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public class b implements a {
    public final e6 f7731a;
    public final int f7732b;
    public final float f7733c;
    public int d;
    public int e;
    public int f7734f;
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
        return this.f7734f;
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(j6.v0(this.f7732b, this.f7731a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = j6.l1(this.f7733c, j6.v0(this.f7732b, this.f7731a));
        if (b()) {
            this.f7734f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f7734f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int m() {
        return this.e;
    }

    public b(e6 e6Var, int i10, float f7) {
        this.f7731a = e6Var;
        this.f7732b = i10;
        this.f7733c = f7;
        d();
    }
}
