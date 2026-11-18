package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17405e;
    public final ArrayList f17406f = new ArrayList();
    public String h;
    public b f17407n;
    public a f17408r;
    public int f17409s;
    public boolean f17410w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17405e = z11;
    }

    public final void F() {
        if (this.f17408r != null) {
            Utilities.f22781g.a(this.f17408r);
            this.f17408r = null;
        }
        this.f17409s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17406f.clear();
            this.f17410w = false;
            f();
            return;
        }
        this.f17410w = true;
        q5 q5Var = Utilities.f22781g;
        a aVar = new a((s0) this, str, 0);
        this.f17408r = aVar;
        q5Var.d(aVar, 400L);
    }
}
