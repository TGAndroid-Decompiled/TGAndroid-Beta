package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public class b implements a {
    public final d6 f8342a;
    public final int f8343b;
    public final float f8344c;
    public int d;
    public int f8345e;
    public int f8346f;
    public int h;

    public b(int i10, d6 d6Var) {
        this(d6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int B() {
        return this.d;
    }

    @Override
    public int a() {
        return this.f8346f;
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(i6.v0(this.f8343b, this.f8342a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = i6.l1(this.f8344c, i6.v0(this.f8343b, this.f8342a));
        if (b()) {
            this.f8346f = 687865855;
            this.h = 352321535;
            this.f8345e = 0;
            return;
        }
        this.f8346f = -1;
        this.h = -1;
        this.f8345e = 536870912;
    }

    @Override
    public int i() {
        return this.f8345e;
    }

    public b(d6 d6Var, int i10, float f7) {
        this.f8342a = d6Var;
        this.f8343b = i10;
        this.f8344c = f7;
        d();
    }
}
