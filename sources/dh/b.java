package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class b implements a {
    public final f6 f7732a;
    public final int f7733b;
    public final float f7734c;
    public int d;
    public int e;
    public int f7735f;
    public int h;

    public b(int i10, f6 f6Var) {
        this(f6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int H() {
        return this.d;
    }

    @Override
    public int a() {
        return this.f7735f;
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(j6.v0(this.f7733b, this.f7732a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int c() {
        return this.h;
    }

    public final void d() {
        this.d = j6.l1(this.f7734c, j6.v0(this.f7733b, this.f7732a));
        if (b()) {
            this.f7735f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f7735f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int m() {
        return this.e;
    }

    public b(f6 f6Var, int i10, float f7) {
        this.f7732a = f6Var;
        this.f7733b = i10;
        this.f7734c = f7;
        d();
    }
}
