package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p5;
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean f17022e;
    public final ArrayList f17023f = new ArrayList();
    public String h;
    public b f17024n;
    public a f17025r;
    public int f17026s;
    public boolean f17027w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f17022e = z11;
    }

    public final void F() {
        if (this.f17025r != null) {
            Utilities.f22418g.a(this.f17025r);
            this.f17025r = null;
        }
        this.f17026s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f17023f.clear();
            this.f17027w = false;
            f();
            return;
        }
        this.f17027w = true;
        p5 p5Var = Utilities.f22418g;
        a aVar = new a((s0) this, str, 0);
        this.f17025r = aVar;
        p5Var.d(aVar, 400L);
    }
}
