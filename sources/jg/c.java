package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17399e;
    public final ArrayList f17400f = new ArrayList();
    public String h;
    public b f17401n;
    public a f17402r;
    public int f17403s;
    public boolean f17404w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17399e = z11;
    }

    public final void F() {
        if (this.f17402r != null) {
            Utilities.f22776g.a(this.f17402r);
            this.f17402r = null;
        }
        this.f17403s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17400f.clear();
            this.f17404w = false;
            f();
            return;
        }
        this.f17404w = true;
        q5 q5Var = Utilities.f22776g;
        a aVar = new a((s0) this, str, 0);
        this.f17402r = aVar;
        q5Var.d(aVar, 400L);
    }
}
