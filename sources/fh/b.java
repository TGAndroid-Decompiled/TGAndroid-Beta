package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public class b implements a {
    public final u6 f10473a;
    public final int f10474b;
    public final float f10475c;
    public int d;
    public int e;
    public int f10476f;
    public int h;
    public int f10477n;

    public b(int i10, u6 u6Var) {
        this(u6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int A() {
        a();
        return this.h;
    }

    public final void a() {
        if (this.f10477n != f7.f22628b) {
            c();
        }
    }

    public boolean b() {
        if (AndroidUtilities.computePerceivedBrightness(y6.w0(this.f10474b, this.f10473a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.f10477n = f7.f22628b;
        this.d = y6.o1(this.f10475c, y6.w0(this.f10474b, this.f10473a));
        if (b()) {
            this.f10476f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f10476f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int f0() {
        a();
        return this.e;
    }

    @Override
    public int t() {
        a();
        return this.f10476f;
    }

    @Override
    public int v0() {
        a();
        return this.d;
    }

    public b(u6 u6Var, int i10, float f7) {
        this.f10477n = f7.f22628b;
        this.f10473a = u6Var;
        this.f10474b = i10;
        this.f10475c = f7;
        c();
    }
}
