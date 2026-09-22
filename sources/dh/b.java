package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class b implements a {
    public final f6 f7731a;
    public final int f7732b;
    public final float f7733c;
    public int d;
    public int e;
    public int f7734f;
    public int h;

    public b(int i10, f6 f6Var) {
        this(f6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int H() {
        return this.d;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(j6.v0(this.f7732b, this.f7731a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int b() {
        return this.f7734f;
    }

    public final void c() {
        this.d = j6.l1(this.f7733c, j6.v0(this.f7732b, this.f7731a));
        if (a()) {
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
    public int g() {
        return this.h;
    }

    @Override
    public int x() {
        return this.e;
    }

    public b(f6 f6Var, int i10, float f7) {
        this.f7731a = f6Var;
        this.f7732b = i10;
        this.f7733c = f7;
        c();
    }
}
