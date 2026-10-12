package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public class b implements a {
    public final c6 f8352a;
    public final int f8353b;
    public final float f8354c;
    public int d;
    public int f8355e;
    public int f8356f;
    public int h;

    public b(int i10, c6 c6Var) {
        this(c6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int C() {
        return this.d;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(h6.w0(this.f8353b, this.f8352a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int b() {
        return this.f8356f;
    }

    public final void c() {
        this.d = h6.m1(this.f8354c, h6.w0(this.f8353b, this.f8352a));
        if (a()) {
            this.f8356f = 687865855;
            this.h = 352321535;
            this.f8355e = 0;
            return;
        }
        this.f8356f = -1;
        this.h = -1;
        this.f8355e = 536870912;
    }

    @Override
    public int d() {
        return this.h;
    }

    @Override
    public int v() {
        return this.f8355e;
    }

    public b(c6 c6Var, int i10, float f7) {
        this.f8352a = c6Var;
        this.f8353b = i10;
        this.f8354c = f7;
        c();
    }
}
