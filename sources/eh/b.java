package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class b implements a {
    public final c6 f8772a;
    public final int f8773b;
    public final float f8774c;
    public int d;
    public int e;
    public int f8775f;
    public int h;

    public b(int i10, c6 c6Var) {
        this(c6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int J() {
        return this.e;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(g6.w0(this.f8773b, this.f8772a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = g6.m1(this.f8774c, g6.w0(this.f8773b, this.f8772a));
        if (a()) {
            this.f8775f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f8775f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int j0() {
        return this.d;
    }

    @Override
    public int k() {
        return this.f8775f;
    }

    @Override
    public int w() {
        return this.h;
    }

    public b(c6 c6Var, int i10, float f7) {
        this.f8772a = c6Var;
        this.f8773b = i10;
        this.f8774c = f7;
        b();
    }
}
