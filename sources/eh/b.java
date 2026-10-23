package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public class b implements a {
    public final g6 f8657a;
    public final int f8658b;
    public final float f8659c;
    public int d;
    public int e;
    public int f8660f;
    public int h;
    public int f8661n;

    public b(int i10, g6 g6Var) {
        this(g6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int H() {
        a();
        return this.e;
    }

    public final void a() {
        if (this.f8661n != r6.f21817b) {
            c();
        }
    }

    @Override
    public int a0() {
        a();
        return this.d;
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(k6.w0(this.f8658b, this.f8657a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.f8661n = r6.f21817b;
        this.d = k6.o1(this.f8659c, k6.w0(this.f8658b, this.f8657a));
        if (b()) {
            this.f8660f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f8660f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int h() {
        a();
        return this.f8660f;
    }

    @Override
    public int u() {
        a();
        return this.h;
    }

    public b(g6 g6Var, int i10, float f7) {
        this.f8661n = r6.f21817b;
        this.f8657a = g6Var;
        this.f8658b = i10;
        this.f8659c = f7;
        c();
    }
}
