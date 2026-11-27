package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public abstract class og0 extends la {
    public final boolean d;
    public final boolean e;
    public final ArrayList f = new ArrayList();
    public String h;
    public ng0 n;
    public mg0 r;
    public int s;
    public boolean w;

    public og0(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    public final void F() {
        if (this.r != null) {
            Utilities.g.a(this.r);
            this.r = null;
        }
        this.s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f.clear();
            this.w = false;
            f();
            return;
        }
        this.w = true;
        to3 to3Var = Utilities.g;
        mg0 mg0Var = new mg0((wc6) this, str, (byte) 0);
        this.r = mg0Var;
        to3Var.d(mg0Var, 400L);
    }
}
