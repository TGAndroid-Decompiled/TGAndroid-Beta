package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class b implements a {
    public final f6 f9130a;
    public final int f9131b;
    public final float f9132c;
    public int d;
    public int f9133e;
    public int f9134f;
    public int h;

    public b(int i10, f6 f6Var) {
        this(f6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int G() {
        return this.h;
    }

    @Override
    public int J() {
        return this.f9133e;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(j6.v0(this.f9131b, this.f9130a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = j6.l1(this.f9132c, j6.v0(this.f9131b, this.f9130a));
        if (a()) {
            this.f9134f = 687865855;
            this.h = 352321535;
            this.f9133e = 0;
            return;
        }
        this.f9134f = -1;
        this.h = -1;
        this.f9133e = 536870912;
    }

    @Override
    public int k0() {
        return this.d;
    }

    @Override
    public int p() {
        return this.f9134f;
    }

    public b(f6 f6Var, int i10, float f7) {
        this.f9130a = f6Var;
        this.f9131b = i10;
        this.f9132c = f7;
        b();
    }
}
