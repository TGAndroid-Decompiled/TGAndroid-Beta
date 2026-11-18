package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17408e;
    public final ArrayList f17409f = new ArrayList();
    public String h;
    public b f17410n;
    public a f17411r;
    public int f17412s;
    public boolean f17413w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17408e = z11;
    }

    public final void F() {
        if (this.f17411r != null) {
            Utilities.f22784g.a(this.f17411r);
            this.f17411r = null;
        }
        this.f17412s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17409f.clear();
            this.f17413w = false;
            f();
            return;
        }
        this.f17413w = true;
        q5 q5Var = Utilities.f22784g;
        a aVar = new a((s0) this, str, 0);
        this.f17411r = aVar;
        q5Var.d(aVar, 400L);
    }
}
