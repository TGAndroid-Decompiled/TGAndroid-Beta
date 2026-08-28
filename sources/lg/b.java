package lg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public class b implements a {
    public final b6 f16858a;
    public final int f16859b;
    public final float f16860c;
    public int d;
    public int f16861e;
    public int f16862f;
    public int h;

    public b(int i9, b6 b6Var) {
        this(b6Var, i9, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(f6.v0(this.f16859b, this.f16858a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = f6.l1(this.f16860c, f6.v0(this.f16859b, this.f16858a));
        if (a()) {
            this.f16862f = 687865855;
            this.h = 352321535;
            this.f16861e = 0;
            return;
        }
        this.f16862f = -1;
        this.h = -1;
        this.f16861e = 536870912;
    }

    @Override
    public int e() {
        return this.f16862f;
    }

    @Override
    public int g() {
        return this.h;
    }

    @Override
    public int j() {
        return this.f16861e;
    }

    @Override
    public int k() {
        return this.d;
    }

    public b(b6 b6Var, int i9, float f10) {
        this.f16858a = b6Var;
        this.f16859b = i9;
        this.f16860c = f10;
        b();
    }
}
