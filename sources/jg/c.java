package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f16670e;
    public final ArrayList f16671f = new ArrayList();
    public String h;
    public b f16672n;
    public a f16673r;
    public int f16674s;
    public boolean f16675w;

    public c(boolean z9, boolean z10) {
        this.d = z9;
        this.f16670e = z10;
    }

    public final void F() {
        if (this.f16673r != null) {
            Utilities.f21335g.a(this.f16673r);
            this.f16673r = null;
        }
        this.f16674s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f16671f.clear();
            this.f16675w = false;
            f();
            return;
        }
        this.f16675w = true;
        p5 p5Var = Utilities.f21335g;
        a aVar = new a((s0) this, str, 0);
        this.f16673r = aVar;
        p5Var.d(aVar, 400L);
    }
}
