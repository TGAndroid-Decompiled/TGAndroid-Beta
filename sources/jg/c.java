package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17501e;
    public final ArrayList f17502f = new ArrayList();
    public String h;
    public b f17503n;
    public a f17504r;
    public int f17505s;
    public boolean f17506w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17501e = z11;
    }

    public final void F() {
        if (this.f17504r != null) {
            Utilities.f22879g.a(this.f17504r);
            this.f17504r = null;
        }
        this.f17505s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17502f.clear();
            this.f17506w = false;
            f();
            return;
        }
        this.f17506w = true;
        q5 q5Var = Utilities.f22879g;
        a aVar = new a((s0) this, str, 0);
        this.f17504r = aVar;
        q5Var.d(aVar, 400L);
    }
}
