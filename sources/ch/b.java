package ch;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class b implements a {
    public final f6 f4681a;
    public final int f4682b;
    public final float f4683c;
    public int d;
    public int e;
    public int f4684f;
    public int h;

    public b(int i10, f6 f6Var) {
        this(f6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(j6.v0(this.f4682b, this.f4681a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = j6.l1(this.f4683c, j6.v0(this.f4682b, this.f4681a));
        if (a()) {
            this.f4684f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f4684f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int h() {
        return this.f4684f;
    }

    @Override
    public int p() {
        return this.h;
    }

    @Override
    public int w() {
        return this.e;
    }

    @Override
    public int x() {
        return this.d;
    }

    public b(f6 f6Var, int i10, float f7) {
        this.f4681a = f6Var;
        this.f4682b = i10;
        this.f4683c = f7;
        b();
    }
}
