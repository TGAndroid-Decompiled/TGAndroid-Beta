package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class b implements a {
    public final c6 f8769a;
    public final int f8770b;
    public final float f8771c;
    public int d;
    public int e;
    public int f8772f;
    public int h;

    public b(int i10, c6 c6Var) {
        this(c6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int G() {
        return this.e;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(g6.w0(this.f8770b, this.f8769a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = g6.m1(this.f8771c, g6.w0(this.f8770b, this.f8769a));
        if (a()) {
            this.f8772f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f8772f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int b0() {
        return this.d;
    }

    @Override
    public int h() {
        return this.f8772f;
    }

    @Override
    public int q() {
        return this.h;
    }

    public b(c6 c6Var, int i10, float f7) {
        this.f8769a = c6Var;
        this.f8770b = i10;
        this.f8771c = f7;
        b();
    }
}
