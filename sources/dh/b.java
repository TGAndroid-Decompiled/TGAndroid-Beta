package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class b implements a {
    public final d6 f8354a;
    public final int f8355b;
    public final float f8356c;
    public int d;
    public int f8357e;
    public int f8358f;
    public int h;

    public b(int i10, d6 d6Var) {
        this(d6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(h6.w0(this.f8355b, this.f8354a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = h6.m1(this.f8356c, h6.w0(this.f8355b, this.f8354a));
        if (a()) {
            this.f8358f = 687865855;
            this.h = 352321535;
            this.f8357e = 0;
            return;
        }
        this.f8358f = -1;
        this.h = -1;
        this.f8357e = 536870912;
    }

    @Override
    public int d() {
        return this.f8358f;
    }

    @Override
    public int m() {
        return this.h;
    }

    @Override
    public int q() {
        return this.f8357e;
    }

    @Override
    public int x() {
        return this.d;
    }

    public b(d6 d6Var, int i10, float f7) {
        this.f8354a = d6Var;
        this.f8355b = i10;
        this.f8356c = f7;
        b();
    }
}
