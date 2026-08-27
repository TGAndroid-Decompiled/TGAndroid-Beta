package mg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public class b implements a {

    public final c6 f18042a;

    public final int f18043b;

    public final float f18044c;
    public int d;

    public int f18045e;

    public int f18046f;
    public int h;

    public b(int i10, c6 c6Var) {
        this(c6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int J1() {
        return this.f18045e;
    }

    @Override
    public int K0() {
        return this.h;
    }

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(g6.v0(this.f18043b, this.f18042a)) < 0.721f;
    }

    public final void b() {
        this.d = g6.l1(this.f18044c, g6.v0(this.f18043b, this.f18042a));
        if (a()) {
            this.f18046f = 687865855;
            this.h = 352321535;
            this.f18045e = 0;
        } else {
            this.f18046f = -1;
            this.h = -1;
            this.f18045e = 536870912;
        }
    }

    @Override
    public int h0() {
        return this.f18046f;
    }

    @Override
    public int p2() {
        return this.d;
    }

    public b(c6 c6Var, int i10, float f10) {
        this.f18042a = c6Var;
        this.f18043b = i10;
        this.f18044c = f10;
        b();
    }
}
