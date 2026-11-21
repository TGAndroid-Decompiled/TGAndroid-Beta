package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17430e;
    public final ArrayList f17431f = new ArrayList();
    public String h;
    public b f17432n;
    public a f17433r;
    public int f17434s;
    public boolean f17435w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17430e = z11;
    }

    public final void F() {
        if (this.f17433r != null) {
            Utilities.f22809g.a(this.f17433r);
            this.f17433r = null;
        }
        this.f17434s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17431f.clear();
            this.f17435w = false;
            f();
            return;
        }
        this.f17435w = true;
        q5 q5Var = Utilities.f22809g;
        a aVar = new a((s0) this, str, 0);
        this.f17433r = aVar;
        q5Var.d(aVar, 400L);
    }
}
