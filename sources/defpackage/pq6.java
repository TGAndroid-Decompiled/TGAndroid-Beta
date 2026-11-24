package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class pq6 {
    public String a;
    public Uri b;
    public final qq6 c = new qq6();
    public final tq6 d = new tq6();
    public final List e = Collections.EMPTY_LIST;
    public final mm5 f;
    public final long g;
    public final vq6 h;
    public yq6 i;

    public pq6() {
        km5 km5Var = mm5.b;
        this.f = w59.e;
        this.h = new vq6();
        this.i = yq6.d;
        this.g = -9223372036854775807L;
    }

    public final br6 a() {
        boolean z;
        xq6 xq6Var;
        tq6 tq6Var = this.d;
        if (tq6Var.b != null && tq6Var.a == null) {
            z = false;
        } else {
            z = true;
        }
        gre.p(z);
        Uri uri = this.b;
        uq6 uq6Var = null;
        if (uri != null) {
            if (tq6Var.a != null) {
                uq6Var = new uq6(tq6Var);
            }
            xq6Var = new xq6(uri, null, uq6Var, null, this.e, null, this.f, this.g);
        } else {
            xq6Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        qq6 qq6Var = this.c;
        qq6Var.getClass();
        ?? rq6Var = new rq6(qq6Var);
        vq6 vq6Var = this.h;
        vq6Var.getClass();
        return new br6(str2, rq6Var, xq6Var, new wq6(vq6Var), jr6.M, this.i);
    }
}
