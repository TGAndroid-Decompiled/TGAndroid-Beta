package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class ts6 {
    public String a;
    public Uri b;
    public final us6 c = new us6();
    public final xs6 d = new xs6();
    public final List e = Collections.EMPTY_LIST;
    public final po5 f;
    public final long g;
    public final zs6 h;
    public ct6 i;

    public ts6() {
        no5 no5Var = po5.b;
        this.f = j99.e;
        this.h = new zs6();
        this.i = ct6.d;
        this.g = -9223372036854775807L;
    }

    public final ft6 a() {
        boolean z;
        bt6 bt6Var;
        xs6 xs6Var = this.d;
        if (xs6Var.b != null && xs6Var.a == null) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        Uri uri = this.b;
        ys6 ys6Var = null;
        if (uri != null) {
            if (xs6Var.a != null) {
                ys6Var = new ys6(xs6Var);
            }
            bt6Var = new bt6(uri, null, ys6Var, null, this.e, null, this.f, this.g);
        } else {
            bt6Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        us6 us6Var = this.c;
        us6Var.getClass();
        ?? vs6Var = new vs6(us6Var);
        zs6 zs6Var = this.h;
        zs6Var.getClass();
        return new ft6(str2, vs6Var, bt6Var, new at6(zs6Var), nt6.M, this.i);
    }
}
