package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class ps6 {
    public String a;
    public Uri b;
    public final qs6 c = new qs6();
    public final ts6 d = new ts6();
    public final List e = Collections.EMPTY_LIST;
    public final mo5 f;
    public final long g;
    public final vs6 h;
    public ys6 i;

    public ps6() {
        ko5 ko5Var = mo5.b;
        this.f = y79.e;
        this.h = new vs6();
        this.i = ys6.d;
        this.g = -9223372036854775807L;
    }

    public final bt6 a() {
        boolean z;
        xs6 xs6Var;
        ts6 ts6Var = this.d;
        if (ts6Var.b != null && ts6Var.a == null) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        Uri uri = this.b;
        us6 us6Var = null;
        if (uri != null) {
            if (ts6Var.a != null) {
                us6Var = new us6(ts6Var);
            }
            xs6Var = new xs6(uri, null, us6Var, null, this.e, null, this.f, this.g);
        } else {
            xs6Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        qs6 qs6Var = this.c;
        qs6Var.getClass();
        ?? rs6Var = new rs6(qs6Var);
        vs6 vs6Var = this.h;
        vs6Var.getClass();
        return new bt6(str2, rs6Var, xs6Var, new ws6(vs6Var), jt6.M, this.i);
    }
}
