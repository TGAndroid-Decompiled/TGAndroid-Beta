package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class b implements a {
    public final d6 f8650a;
    public final int f8651b;
    public final float f8652c;
    public int d;
    public int e;
    public int f8653f;
    public int h;

    public b(int i10, d6 d6Var) {
        this(d6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int E() {
        return this.e;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(h6.w0(this.f8651b, this.f8650a)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public int a0() {
        return this.d;
    }

    public final void b() {
        this.d = h6.m1(this.f8652c, h6.w0(this.f8651b, this.f8650a));
        if (a()) {
            this.f8653f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f8653f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int h() {
        return this.f8653f;
    }

    @Override
    public int u() {
        return this.h;
    }

    public b(d6 d6Var, int i10, float f7) {
        this.f8650a = d6Var;
        this.f8651b = i10;
        this.f8652c = f7;
        b();
    }
}
