package og;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class b implements a {
    public final c6 f19552a;
    public final int f19553b;
    public final float f19554c;
    public int d;
    public int f19555e;
    public int f19556f;
    public int h;

    public b(int i10, c6 c6Var) {
        this(c6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(g6.v0(this.f19553b, this.f19552a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = g6.l1(this.f19554c, g6.v0(this.f19553b, this.f19552a));
        if (a()) {
            this.f19556f = 687865855;
            this.h = 352321535;
            this.f19555e = 0;
            return;
        }
        this.f19556f = -1;
        this.h = -1;
        this.f19555e = 536870912;
    }

    @Override
    public int h() {
        return this.f19556f;
    }

    @Override
    public int m() {
        return this.h;
    }

    @Override
    public int v() {
        return this.f19555e;
    }

    @Override
    public int z() {
        return this.d;
    }

    public b(c6 c6Var, int i10, float f9) {
        this.f19552a = c6Var;
        this.f19553b = i10;
        this.f19554c = f9;
        b();
    }
}
