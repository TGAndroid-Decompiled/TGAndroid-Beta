package kg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p5;
public abstract class c extends sg.b {
    public final boolean d;
    public final boolean f16932e;
    public final ArrayList f16933f = new ArrayList();
    public String h;
    public b f16934n;
    public a f16935r;
    public int f16936s;
    public boolean f16937w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f16932e = z11;
    }

    public final void F() {
        if (this.f16935r != null) {
            Utilities.f21389g.a(this.f16935r);
            this.f16935r = null;
        }
        this.f16936s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f16933f.clear();
            this.f16937w = false;
            f();
            return;
        }
        this.f16937w = true;
        p5 p5Var = Utilities.f21389g;
        a aVar = new a((p0) this, str, 0);
        this.f16935r = aVar;
        p5Var.e(aVar, 400L);
    }
}
