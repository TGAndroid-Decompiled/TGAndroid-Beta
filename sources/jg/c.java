package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17433e;
    public final ArrayList f17434f = new ArrayList();
    public String h;
    public b f17435n;
    public a f17436r;
    public int f17437s;
    public boolean f17438w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17433e = z11;
    }

    public final void F() {
        if (this.f17436r != null) {
            Utilities.f22812g.a(this.f17436r);
            this.f17436r = null;
        }
        this.f17437s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17434f.clear();
            this.f17438w = false;
            f();
            return;
        }
        this.f17438w = true;
        q5 q5Var = Utilities.f22812g;
        a aVar = new a((s0) this, str, 0);
        this.f17436r = aVar;
        q5Var.d(aVar, 400L);
    }
}
