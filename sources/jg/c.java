package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f16673e;
    public final ArrayList f16674f = new ArrayList();
    public String h;
    public b f16675n;
    public a f16676r;
    public int f16677s;
    public boolean f16678w;

    public c(boolean z9, boolean z10) {
        this.d = z9;
        this.f16673e = z10;
    }

    public final void F() {
        if (this.f16676r != null) {
            Utilities.f21338g.a(this.f16676r);
            this.f16676r = null;
        }
        this.f16677s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f16674f.clear();
            this.f16678w = false;
            f();
            return;
        }
        this.f16678w = true;
        p5 p5Var = Utilities.f21338g;
        a aVar = new a((s0) this, str, 0);
        this.f16676r = aVar;
        p5Var.d(aVar, 400L);
    }
}
