package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public class b implements a {
    public final e6 f8355a;
    public final int f8356b;
    public final float f8357c;
    public int d;
    public int f8358e;
    public int f8359f;
    public int h;

    public b(int i10, e6 e6Var) {
        this(e6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(i6.w0(this.f8356b, this.f8355a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = i6.m1(this.f8357c, i6.w0(this.f8356b, this.f8355a));
        if (a()) {
            this.f8359f = 687865855;
            this.h = 352321535;
            this.f8358e = 0;
            return;
        }
        this.f8359f = -1;
        this.h = -1;
        this.f8358e = 536870912;
    }

    @Override
    public int d() {
        return this.f8359f;
    }

    @Override
    public int m() {
        return this.h;
    }

    @Override
    public int q() {
        return this.f8358e;
    }

    @Override
    public int x() {
        return this.d;
    }

    public b(e6 e6Var, int i10, float f7) {
        this.f8355a = e6Var;
        this.f8356b = i10;
        this.f8357c = f7;
        b();
    }
}
